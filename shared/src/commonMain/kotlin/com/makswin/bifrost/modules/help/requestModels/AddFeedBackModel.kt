package com.makswin.bifrost.modules.help.requestModels

import com.makswin.bifrost.enums.AddFeedBackType

data class AddFeedBackModel(val type: AddFeedBackType, val note: String)