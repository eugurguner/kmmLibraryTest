package com.makswin.bifrost.modules.misc.models

import com.makswin.fizbot.fragment.FragmentLanguage

data class Language(var id: Int = -1,
                    var key: String = "",
                    var value: String = "") {

    constructor(data: FragmentLanguage) : this() {
        this.id = data.id.toInt()
        this.key = data.key ?: ""
        this.value = data.value ?: ""
    }

}