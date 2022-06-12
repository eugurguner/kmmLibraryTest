package com.makswin.bifrost.modules.authentication.responseModels

import com.makswin.fizbot.fragment.FragmentUser

data class User(
    var id: Int = -1,
    var fullName: String = "",
    var cellPhone: String = "",
    var countryCode: String = "",
    var avatarThumb: String = "",
    var email: String = "",
    private var paymentUrl: String = "",
    private var userPaymentState: Boolean = true
) {

    constructor(data: FragmentUser): this() {

        this.id = data.id.toInt()

        this.fullName = data.full_name ?: ""

        this.cellPhone = data.cell_phone

        this.countryCode = data.country_code

        this.avatarThumb = data.avatarThumb ?: ""

        this.email = data.email ?: ""

        this.paymentUrl = data.payment_url ?: ""

        this.userPaymentState = data.login_fizbot_agent

    }

}