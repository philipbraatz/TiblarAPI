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

case class Info (
  id: Option[String] = None,
  username: Option[String] = None,
  usernameColor: Option[String] = None,
  avatar: Option[String] = None,
  banner: Option[String] = None,
  locale: Option[String] = None,
  nsfw: Option[Boolean] = None,
  biography: Option[String] = None,
  followerCount: Option[Int] = None,
  location: Option[String] = None,
  profileTheme: Option[String] = None,
  status: Option[String] = None,
  following: Option[Seq[String]] = None,
  followedBy: Option[Seq[String]] = None,
  followRequested: Option[Seq[String]] = None,
  blocking: Option[Seq[String]] = None,
  blockedBy: Option[Seq[String]] = None
) extends ApiModel


