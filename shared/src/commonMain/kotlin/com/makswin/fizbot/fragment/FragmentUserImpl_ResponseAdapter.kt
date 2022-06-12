//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.3.0'.
//
package com.makswin.fizbot.fragment

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.BooleanAdapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.StringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object FragmentUserImpl_ResponseAdapter {
  public object FragmentUser : Adapter<com.makswin.fizbot.fragment.FragmentUser> {
    public val RESPONSE_NAMES: List<String> = listOf("id", "full_name", "cell_phone",
        "country_code", "payment_url", "avatarThumb", "email", "login_fizbot_agent")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        com.makswin.fizbot.fragment.FragmentUser {
      var id: String? = null
      var full_name: String? = null
      var cell_phone: String? = null
      var country_code: String? = null
      var payment_url: String? = null
      var avatarThumb: String? = null
      var email: String? = null
      var login_fizbot_agent: Boolean? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> id = StringAdapter.fromJson(reader, customScalarAdapters)
          1 -> full_name = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          2 -> cell_phone = StringAdapter.fromJson(reader, customScalarAdapters)
          3 -> country_code = StringAdapter.fromJson(reader, customScalarAdapters)
          4 -> payment_url = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          5 -> avatarThumb = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          6 -> email = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          7 -> login_fizbot_agent = BooleanAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return com.makswin.fizbot.fragment.FragmentUser(
        id = id!!,
        full_name = full_name,
        cell_phone = cell_phone!!,
        country_code = country_code!!,
        payment_url = payment_url,
        avatarThumb = avatarThumb,
        email = email,
        login_fizbot_agent = login_fizbot_agent!!
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: com.makswin.fizbot.fragment.FragmentUser,
    ): Unit {
      writer.name("id")
      StringAdapter.toJson(writer, customScalarAdapters, value.id)

      writer.name("full_name")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.full_name)

      writer.name("cell_phone")
      StringAdapter.toJson(writer, customScalarAdapters, value.cell_phone)

      writer.name("country_code")
      StringAdapter.toJson(writer, customScalarAdapters, value.country_code)

      writer.name("payment_url")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.payment_url)

      writer.name("avatarThumb")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.avatarThumb)

      writer.name("email")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.email)

      writer.name("login_fizbot_agent")
      BooleanAdapter.toJson(writer, customScalarAdapters, value.login_fizbot_agent)
    }
  }
}
