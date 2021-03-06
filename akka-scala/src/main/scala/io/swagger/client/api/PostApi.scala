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
package io.swagger.client.api

import io.swagger.client.model.InlineResponse20010
import io.swagger.client.model.InlineResponse2009
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object PostApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : InlineResponse20010 (successful operation)
   * 
   * @param postId ID of post
   */
  def deletePost(postId: String): ApiRequest[InlineResponse20010] =
    ApiRequest[InlineResponse20010](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/Tiblar/Tiblar-v2/v2", "/post/{postId}", "application/json")
      .withPathParam("postId", postId)
      .withSuccessResponse[InlineResponse20010](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : InlineResponse2009 (successful operation)
   * 
   * @param postId ID of post
   */
  def getPost(postId: String): ApiRequest[InlineResponse2009] =
    ApiRequest[InlineResponse2009](ApiMethods.GET, "https://virtserver.swaggerhub.com/Tiblar/Tiblar-v2/v2", "/post/{postId}", "application/json")
      .withPathParam("postId", postId)
      .withSuccessResponse[InlineResponse2009](200)
      

}

