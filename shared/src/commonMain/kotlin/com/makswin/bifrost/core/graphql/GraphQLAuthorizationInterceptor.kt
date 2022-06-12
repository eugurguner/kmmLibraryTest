package com.makswin.bifrost.core.graphql

import com.apollographql.apollo3.api.http.HttpRequest
import com.apollographql.apollo3.api.http.HttpResponse
import com.apollographql.apollo3.network.http.HttpInterceptor
import com.apollographql.apollo3.network.http.HttpInterceptorChain

class GraphQLAuthorizationInterceptor : HttpInterceptor {

    override suspend fun intercept(
        request: HttpRequest,
        chain: HttpInterceptorChain
    ): HttpResponse {

        //val settings = Settings()

        //val token = settings.getString("token", "")

        val token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI0IiwianRpIjoiOWFhZjVmMGI4YWUwZTllZjAxMmNjY2FkMjhiNzFkZjM4YWFhM2M2MjYwOGMwNjk3MTU4MzI2ZTZkYWE1ODNmNmZlZGI3ZTRiMDgxNDE2MmIiLCJpYXQiOjE2NTQxNzY5NjQuMTUxMDYxLCJuYmYiOjE2NTQxNzY5NjQuMTUxMDY1LCJleHAiOjE2NTY3Njg5NjQuMDQ5OTE4LCJzdWIiOiIxMTM1NjMiLCJzY29wZXMiOltdfQ.iBJP6vvqea7sVD1fZ5I0XHaCohIOezWQkN5Xcas9gy-antEUNaOwJg739OeWJpAc_Qe-_hkgwsz7Ph-pQjT-0R1-5C9HSc5fRhVksqZlUaRduAPiEijc6LxvR0wiqxij90kX88T-aHlHWc3i5v4J4Z81tA7EQ_wIewW2UqcpHAz7sx-8eZEOFVxsxJkJ3jjapTA0EJxJjDTVnkKXktsWNUYrqmvB-KBcTTV-INVdg3MdL-t5sjbY3HjvQktM6Au-v2etBMU6lECdT4JpG_IgQ1xJjXbUt9Wov2E6tPs1wrUqi6ULITTDDI0pVcGDX6hnm2WWdazZKANRtWOp3XLNN_XdLaEK4of3Uob7w0QrzpkDjpEKGHw6WtrfdWRHVUogJ6-O10Xgo_SNCSfI0xNJRSU-KlrLeRx0Pn36__1DBgLXPXu7dY9UN6KVet9pDZj4nOGQE97BagDutaGj8Cxg3I9CRwA3oPnIhTytnnEf6p40YNT2HmLyGoC5EHNNe4L_mjm80uGm6I39kbc4eiyeHrshJZ6MmBH6XhqiYmisEe80TyftcGmkYoZ393ixS8RogbpfHEt--XzjylLEBfUZ0nUDOmWYJJ_u1mTHKB9SD7K23eNtEmSFwAWDu6Y5VcI28gAVW3LBl9jLQRCgPoolHV414sr5tFjLxrg2tyS4FHo"

        return if (token.isNotEmpty()) {
            chain.proceed(
                request.newBuilder().addHeader("Authorization", "Bearer $token").build()
            )
        } else {
            chain.proceed(request)
        }

    }

}