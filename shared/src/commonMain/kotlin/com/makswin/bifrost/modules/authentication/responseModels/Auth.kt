package com.makswin.bifrost.modules.authentication.responseModels

import com.makswin.fizbot.fragment.FragmentAuth

data class Auth(
    var accessToken: String = "",
    var refreshToken: String = "",
    var expiresIn: Int = -1,
    var user: User = User()
) {

    constructor(data: FragmentAuth) : this() {

        this.accessToken = data.access_token ?: ""

        this.refreshToken = data.refresh_token ?: ""

        this.expiresIn = data.expires_in ?: -1

        data.user?.fragmentUser?.let { this.user = User(it) }

    }

}