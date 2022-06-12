package com.makswin.bifrost.modules.misc

import com.makswin.bifrost.core.models.BaseResponseModel
import com.makswin.bifrost.core.utils.BaseRepository
import com.makswin.bifrost.modules.misc.models.Language
import com.makswin.bifrost.modules.misc.models.response.LanguageResponse
import com.makswin.fizbot.LanguagesQuery

class MiscellaneousRepository : BaseRepository() {

    suspend fun languages(): BaseResponseModel<LanguageResponse> {

        val executer = executeQuery(LanguagesQuery())

        if (!checkQueryResponse(executer)) return onError()

        val data = executer.data?.languages?.data

        if (data.isNullOrEmpty()) return onError()

        val languages = data.map { Language(it.fragmentLanguage) }

        val response = LanguageResponse(languages)

        return onSuccess(response)

    }

    fun test2() {

    }

}

