/*
*  Copyright 2016 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*/

package com.adobe.sign.model.widgets;

import com.adobe.sign.utils.StringUtil;
import java.util.*;
import com.adobe.sign.model.widgets.UserWidget;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:30.461+05:30")
public class UserWidgets   {
  
  private List<UserWidget> userWidgetList = null;

  
  /**
   * An array of widget items
   **/
  @ApiModelProperty(required = true, value = "An array of widget items")
  @JsonProperty("userWidgetList")
  /**
   * @return List&lt;UserWidget&gt;
   **/
  public List<UserWidget> getUserWidgetList() {
    return userWidgetList;
  }
  /**
   * An array of widget items
   * @param userWidgetList
   **/
  public void setUserWidgetList(List<UserWidget> userWidgetList) {
    this.userWidgetList = userWidgetList;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWidgets {\n");
    
    sb.append("    userWidgetList: ").append(StringUtil.toIndentedString(userWidgetList)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
