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

case class Userold (
  id: Option[Long] = None,
  username: Option[String] = None,
  firstName: Option[String] = None,
  lastName: Option[String] = None,
  email: Option[String] = None,
  password: Option[String] = None,
  phone: Option[String] = None,
  /* User Status */
  userStatus: Option[Int] = None
) extends ApiModel


