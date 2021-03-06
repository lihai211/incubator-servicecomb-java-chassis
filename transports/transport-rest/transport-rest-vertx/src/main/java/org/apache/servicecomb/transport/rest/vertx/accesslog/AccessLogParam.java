/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.servicecomb.transport.rest.vertx.accesslog;

import io.vertx.ext.web.RoutingContext;

public class AccessLogParam {
  private RoutingContext routingContext;

  private long startMillisecond;

  private long endMillisecond;

  public RoutingContext getRoutingContext() {
    return routingContext;
  }

  public AccessLogParam setRoutingContext(RoutingContext routingContext) {
    this.routingContext = routingContext;
    return this;
  }

  public long getStartMillisecond() {
    return startMillisecond;
  }

  public AccessLogParam setStartMillisecond(long startMillisecond) {
    this.startMillisecond = startMillisecond;
    return this;
  }

  public long getEndMillisecond() {
    return endMillisecond;
  }

  public AccessLogParam setEndMillisecond(long endMillisecond) {
    this.endMillisecond = endMillisecond;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("AccessLogParam{");
    sb.append("routingContext=").append(routingContext);
    sb.append(", startMillisecond=").append(startMillisecond);
    sb.append(", endMillisecond=").append(endMillisecond);
    sb.append('}');
    return sb.toString();
  }
}
