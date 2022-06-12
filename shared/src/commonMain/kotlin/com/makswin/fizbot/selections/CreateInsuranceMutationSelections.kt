//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.3.0'.
//
package com.makswin.fizbot.selections

import com.apollographql.apollo3.api.CompiledArgument
import com.apollographql.apollo3.api.CompiledField
import com.apollographql.apollo3.api.CompiledFragment
import com.apollographql.apollo3.api.CompiledSelection
import com.apollographql.apollo3.api.CompiledVariable
import com.apollographql.apollo3.api.notNull
import com.makswin.fizbot.fragment.selections.fragmentInsuranceSelections
import com.makswin.fizbot.type.GraphQLString
import com.makswin.fizbot.type.KoalayDealer
import kotlin.collections.List

public object CreateInsuranceMutationSelections {
  private val koalay_define_dealer: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "__typename",
          type = GraphQLString.type.notNull()
        ).build(),
        CompiledFragment.Builder(
          typeCondition = "KoalayDealer",
          possibleTypes = (listOf("KoalayDealer"))
        ).selections(fragmentInsuranceSelections.root)
        .build()
      )

  public val root: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "koalay_define_dealer",
          type = KoalayDealer.type
        ).arguments(listOf(
          CompiledArgument("input", CompiledVariable("input"))
        ))
        .selections(koalay_define_dealer)
        .build()
      )
}