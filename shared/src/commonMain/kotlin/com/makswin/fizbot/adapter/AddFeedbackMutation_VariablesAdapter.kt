//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.3.0'.
//
package com.makswin.fizbot.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.obj
import com.makswin.fizbot.AddFeedbackMutation
import com.makswin.fizbot.type.adapter.AddFeedbackInput_InputAdapter
import kotlin.IllegalStateException
import kotlin.Unit

public object AddFeedbackMutation_VariablesAdapter : Adapter<AddFeedbackMutation> {
  public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
      AddFeedbackMutation = throw IllegalStateException("Input type used in output position")

  public override fun toJson(
    writer: JsonWriter,
    customScalarAdapters: CustomScalarAdapters,
    `value`: AddFeedbackMutation,
  ): Unit {
    writer.name("input")
    AddFeedbackInput_InputAdapter.obj().toJson(writer, customScalarAdapters, value.input)
  }
}