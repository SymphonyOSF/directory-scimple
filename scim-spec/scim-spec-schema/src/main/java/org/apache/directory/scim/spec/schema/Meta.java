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

package org.apache.directory.scim.spec.schema;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.directory.scim.spec.adapter.LocalDateTimeAdapter;
import lombok.Data;
import org.apache.directory.scim.spec.annotation.ScimAttribute;

/**
 * Defines the structure of the meta attribute for all SCIM resources as defined
 * by section 3.1 of the SCIM schema specification. See
 * https://tools.ietf.org/html/draft-ietf-scim-core-schema-17#section-3.1 for more
 * details.
 * 
 * @author Steve Moyer <smoyer@psu.edu>
 */
@XmlType(name = "meta")
@XmlAccessorType(XmlAccessType.NONE)
@Data
public class Meta implements Serializable {
  
  private static final long serialVersionUID = -9162917034280030708L;

  @XmlElement
  @Size(min = 1)
  @ScimAttribute(description = "The name of the resource type of the resource.")
  String resourceType;
  
  @XmlElement
  @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
  @ScimAttribute(description = "The DateTime that the resource was added to the service provider.")
  LocalDateTime created;
  
  @XmlElement
  @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
  @ScimAttribute(description = "The most recent DateTime that the details of this resource were updated at the service provider.")
  LocalDateTime lastModified;
  
  @XmlElement
  @ScimAttribute(description = "The URI of the resource being returned.")
  String location;
  
  @XmlElement
  @ScimAttribute(description = "The version of the resource being returned.  This value must be the same as the entity-tag (ETag) HTTP response header")
  String version;

}
