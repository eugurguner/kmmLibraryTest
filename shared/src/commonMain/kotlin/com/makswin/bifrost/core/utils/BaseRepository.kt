package com.makswin.bifrost.core.utils

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.*
import com.makswin.bifrost.core.graphql.GraphQLNetwork
import com.makswin.bifrost.core.models.BaseResponseModel
import com.makswin.bifrost.core.models.ResponseStatus

open class BaseRepository {

    private var graphQLNetwork: GraphQLNetwork = GraphQLNetwork()

    private fun getApolloClient(): ApolloClient {
        return graphQLNetwork.getApolloClient()
    }

    suspend fun <D : Query.Data> executeQuery(query: Query<D>): ApolloResponse<D> {
        return getApolloClient().query(query).execute()
    }

    suspend fun <D : Mutation.Data> executeMutation(mutation: Mutation<D>): ApolloResponse<D> {
        return getApolloClient().mutation(mutation).execute()
    }

    fun <D : Query.Data> checkQueryResponse(response: ApolloResponse<D>): Boolean {

        if (response.errors != null && response.data == null) {
            return false
        }

        if (response.data == null) {
            return false
        }

        return true

    }

    fun <D : Mutation.Data> checkMutationResponse(response: ApolloResponse<D>): Boolean {

        if (response.errors != null && response.data == null) {
            return false
        }

        if (response.data == null) {
            return false
        }

        return true

    }

    fun <T> onError(): BaseResponseModel<T> = BaseResponseModel(ResponseStatus.Error, null)

    fun onSuccess(): BaseResponseModel<Any> = BaseResponseModel(ResponseStatus.Success, null)

    fun <T> onSuccess(data: T): BaseResponseModel<T> = BaseResponseModel(ResponseStatus.Success, data)

}