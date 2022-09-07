/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
 
* http://www.apache.org/licenses/LICENSE-2.0

* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.apache.directory.scim.server.exception;

import jakarta.ws.rs.core.Response.Status;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.directory.scim.core.repository.ResourceException;

@Data
@EqualsAndHashCode(callSuper=true)
public class UnableToDeleteResourceException extends ResourceException {

  private static final long serialVersionUID = -3872700870424005641L;

  public UnableToDeleteResourceException(Status status, String message) {
    super(status.getStatusCode(), message);
  }

  public UnableToDeleteResourceException(Status status, String message, Throwable cause) {
    super(status.getStatusCode(), message, cause);
  }
}
