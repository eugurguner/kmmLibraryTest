//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.3.0'.
//
package com.makswin.fizbot.fragment.selections

import com.apollographql.apollo3.api.CompiledField
import com.apollographql.apollo3.api.CompiledSelection
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.notNull
import com.makswin.fizbot.type.Buyer
import com.makswin.fizbot.type.BuyerDemand
import com.makswin.fizbot.type.DateTime
import com.makswin.fizbot.type.GraphQLID
import kotlin.collections.List

public object fragmentBuyerSelections {
  private val buyer: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "id",
          type = GraphQLID.type.notNull()
        ).build()
      )

  private val demands: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "id",
          type = GraphQLID.type.notNull()
        ).build(),
        CompiledField.Builder(
          name = "buyer",
          type = Buyer.type
        ).selections(buyer)
        .build()
      )

  public val root: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "id",
          type = GraphQLID.type.notNull()
        ).build(),
        CompiledField.Builder(
          name = "deleted_at",
          type = DateTime.type
        ).build(),
        CompiledField.Builder(
          name = "demands",
          type = BuyerDemand.type.notNull().list().notNull()
        ).selections(demands)
        .build()
      )
}
