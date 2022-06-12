//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.3.0'.
//
package com.makswin.fizbot.type

import com.apollographql.apollo3.api.EnumType
import kotlin.Array
import kotlin.String

/**
 * The available SQL operators that are used to filter query results.
 */
public enum class SQLOperator(
  public val rawValue: String,
) {
  /**
   * Equal operator (`=`)
   */
  EQ("EQ"),
  /**
   * Not equal operator (`!=`)
   */
  NEQ("NEQ"),
  /**
   * Greater than operator (`>`)
   */
  GT("GT"),
  /**
   * Greater than or equal operator (`>=`)
   */
  GTE("GTE"),
  /**
   * Less than operator (`<`)
   */
  LT("LT"),
  /**
   * Less than or equal operator (`<=`)
   */
  LTE("LTE"),
  /**
   * Simple pattern matching (`LIKE`)
   */
  LIKE("LIKE"),
  /**
   * Negation of simple pattern matching (`NOT LIKE`)
   */
  NOT_LIKE("NOT_LIKE"),
  /**
   * Whether a value is within a set of values (`IN`)
   */
  IN("IN"),
  /**
   * Whether a value is not within a set of values (`NOT IN`)
   */
  NOT_IN("NOT_IN"),
  /**
   * Whether a value is within a range of values (`BETWEEN`)
   */
  BETWEEN("BETWEEN"),
  /**
   * Whether a value is not within a range of values (`NOT BETWEEN`)
   */
  NOT_BETWEEN("NOT_BETWEEN"),
  /**
   * Whether a value is null (`IS NULL`)
   */
  IS_NULL("IS_NULL"),
  /**
   * Whether a value is not null (`IS NOT NULL`)
   */
  IS_NOT_NULL("IS_NOT_NULL"),
  /**
   * Simple pattern matching (`ILIKE`)
   */
  ILIKE("ILIKE"),
  /**
   * Negation of simple pattern matching (`NOT ILIKE`)
   */
  NOT_ILIKE("NOT_ILIKE"),
  /**
   * Auto generated constant for unknown enum values
   */
  UNKNOWN__("UNKNOWN__"),
  ;

  public companion object {
    public val type: EnumType = EnumType("SQLOperator")

    public fun safeValueOf(rawValue: String): SQLOperator =
        values().find { it.rawValue == rawValue } ?: UNKNOWN__

    /**
     * Returns all [SQLOperator] known at compile time
     */
    public fun knownValues(): Array<SQLOperator> = arrayOf(
      EQ,
      NEQ,
      GT,
      GTE,
      LT,
      LTE,
      LIKE,
      NOT_LIKE,
      IN,
      NOT_IN,
      BETWEEN,
      NOT_BETWEEN,
      IS_NULL,
      IS_NOT_NULL,
      ILIKE,
      NOT_ILIKE)
  }
}
