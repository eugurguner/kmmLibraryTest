//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.3.0'.
//
package com.makswin.fizbot.fragment

import com.apollographql.apollo3.api.Fragment
import kotlin.Boolean
import kotlin.String

public data class FragmentUser(
  public val id: String,
  public val full_name: String?,
  public val cell_phone: String,
  public val country_code: String,
  public val payment_url: String?,
  public val avatarThumb: String?,
  public val email: String?,
  public val login_fizbot_agent: Boolean,
) : Fragment.Data