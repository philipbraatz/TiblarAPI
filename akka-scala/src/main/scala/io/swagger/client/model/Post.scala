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

case class Post (
  id: Option[String] = None,
  attachments: Option[Any] = None,
  author: Option[User] = None,
  body: Option[String] = None,
  favoritesCount: Option[Int] = None,
  isFavorited: Option[Boolean] = None,
  isReblogged: Option[Boolean] = None,
  magnet: Option[String] = None,
  mentions: Option[Seq[User]] = None,
  nsfw: Option[Boolean] = None,
  pinned: Option[Boolean] = None,
  poll: Option[String] = None,
  `private`: Option[Boolean] = None,
  reblog: Option[String] = None,
  reblogCount: Option[Int] = None,
  repliesCount: Option[Int] = None,
  tags: Option[Seq[Tag]] = None,
  timestamp: Option[String] = None,
  title: Option[String] = None,
  updaatedTimestmp: Option[String] = None
) extends ApiModel


