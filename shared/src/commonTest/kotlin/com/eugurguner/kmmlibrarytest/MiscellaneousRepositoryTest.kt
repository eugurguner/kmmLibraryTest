package com.makswin.bifrost

import com.makswin.bifrost.core.isFailed
import com.makswin.bifrost.enums.AddFeedBackType
import com.makswin.bifrost.modules.help.HelpService
import com.makswin.bifrost.modules.help.requestModels.AddFeedBackModel
import com.makswin.bifrost.modules.misc.MiscellaneousRepository
import kotlinx.coroutines.*
import kotlin.test.*

class MiscellaneousRepositoryTest {

    private lateinit var miscellaneousRepository: MiscellaneousRepository

    @BeforeTest
    fun onSetup() {
        miscellaneousRepository = MiscellaneousRepository()
    }

    @Test
    fun testLanguages() = runBlocking {

        val response = miscellaneousRepository.languages()

        if (response.isFailed()) fail("List Languages Failed Response")

        if (response.data?.languages.isNullOrEmpty()) fail("List Languages Empty Response")

    }

}