package com.makswin.bifrost.modules.misc.models.response

import com.makswin.bifrost.core.models.BasePaginatorModel
import com.makswin.bifrost.modules.misc.models.Language

class LanguageResponse(var languages: List<Language>) : BasePaginatorModel()
