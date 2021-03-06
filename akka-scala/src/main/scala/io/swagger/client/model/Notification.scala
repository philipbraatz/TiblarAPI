/**
 * api
 * Tiblar is a privacy center media sharing site https://tiblar.com/support/pages/mission 
 *
 * OpenAPI spec version: v2
 * Contact: support@tiblar.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Notification (
  id: Option[String] = None,
  post: Option[String] = None,
  `type`: Option[String] = None,
  causers: Option[Seq[User]] = None,
  interactionsCount: Option[Int] = None,
  seen: Option[Boolean] = None,
  updatedTimestamp: Option[String] = None
) extends ApiModel


