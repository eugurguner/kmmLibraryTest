package com.makswin.bifrost.core.graphql

import com.apollographql.apollo3.ApolloClient

open class GraphQLNetwork {

    private var instance: ApolloClient? = null

    internal fun getApolloClient(): ApolloClient {

        if (instance != null) {
            return instance!!
        }

        instance = ApolloClient.Builder()
            .serverUrl("https://zeus.fizbot.net/graphql")
            .addHttpInterceptor(GraphQLAuthorizationInterceptor())
            .build()

        return instance!!

    }
}