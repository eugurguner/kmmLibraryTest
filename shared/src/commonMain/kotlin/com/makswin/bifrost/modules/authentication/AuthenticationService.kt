package com.makswin.bifrost.modules.authentication

import com.makswin.bifrost.core.utils.BaseRepository
import com.russhwolf.settings.Settings

class AuthenticationService : BaseRepository() {

    /**
     * Stores the user current token
     * after the bifrost migration complete, this method will be deprecated.
     * @param token is user current API token
     * @author alkincakiralar
     */
    fun configureToken(token: String) {

        val settings = Settings()

        settings.putString("token", token)

    }

    /**
     * Generates sms code for user who wants to login
     * @param input has login parameters
     * @author alkincakiralar
     */
    /*fun forgotPasswordOTP(input: Login, completion: (ResponseType) -> Unit) {

        scope.launch {

            val mutation = ForgotPasswordOTPMutation(input.cellPhone)

            val response = executeMutation(mutation)

            if (!checkMutationResponse(response)) {
                completion(ResponseType.Error)
                return@launch
            }

            completion(ResponseType.Success)

        }

    }*/

    /**
     * Used to login with sms code
     * @param input has login parameters
     * @return The user model has logged in
     * @author alkincakiralar
     */
    /*fun login(input: Login, completion: (ResponseType, Auth?) -> Unit) {

        scope.launch {

            val mutation = LoginMutation(input.cellPhone, input.password)

            val response = executeMutation(mutation)

            if (!checkMutationResponse(response)) {
                completion(ResponseType.Error, null)
                return@launch
            }

            val fragmentAuth = response.data?.login?.fragmentAuth

            if (fragmentAuth != null) {

                val auth = Auth(fragmentAuth)

                val settings = Settings()

                settings.putString("token", auth.accessToken)

                completion(ResponseType.Success, Auth(fragmentAuth))

            } else {
                completion(ResponseType.Error, null)
            }

        }

    }*/

}