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

case class Reply (
  author: Option[User] = None,
  body: Option[String] = None,
  depth: Option[Int] = None,
  id: Option[String] = None,
  mentions: Option[Any] = None,
  parentId: Option[String] = None,
  postId: Option[String] = None,
  replies: Option[Seq[Reply]] = None,
  timestamp: Option[String] = None
) extends ApiModel


