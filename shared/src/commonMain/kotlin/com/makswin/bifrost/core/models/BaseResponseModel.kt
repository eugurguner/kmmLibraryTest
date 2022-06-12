package com.makswin.bifrost.core.models

data class BaseResponseModel<T : Any?>(val status: ResponseStatus, val data: T?)