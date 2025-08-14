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

package org.apache.directory.scim.spec.resources;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.directory.scim.spec.annotation.ScimAttribute;

import java.io.Serializable;
import java.util.Objects;

/**
 * Scim core schema, <a href="https://tools.ietf.org/html/rfc7643#section-4.1.2">section 4.1.2</a>
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
public class Entitlement implements Serializable, TypedAttribute {

  private static final long serialVersionUID = -5657063764529902479L;

  @XmlElement(nillable = true)
  @ScimAttribute(description = "A label indicating the attribute's function.")
  String type;

  @XmlElement
  @ScimAttribute(description = "The value of an entitlement.")
  String value;

  @XmlElement
  @ScimAttribute(description = "A human readable name, primarily used for display purposes. READ-ONLY.")
  String display;

  @XmlElement
  @ScimAttribute(description = "A Boolean value indicating the 'primary' or preferred attribute value for this attribute, e.g. the preferred mailing address or primary e-mail address. The primary attribute value 'true' MUST appear no more than once.")
  Boolean primary = false;

  @XmlElement(nillable = true)
  @ScimAttribute(description = "Specifies the source of the entitlement, indicating the data provider responsible for provisioning the user. This is not a standard SCIM2 attribute.")
  String dataSource;

  public String getType() {
    return this.type;
  }

  public Entitlement setType(String type) {
    this.type = type;
    return this;
  }

  public String getValue() {
    return this.value;
  }

  public Entitlement setValue(String value) {
    this.value = value;
    return this;
  }

  public String getDisplay() {
    return this.display;
  }

  public Entitlement setDisplay(String display) {
    this.display = display;
    return this;
  }

  public Boolean getPrimary() {
    return this.primary;
  }

  public Entitlement setPrimary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Entitlement that = (Entitlement) o;
    return Objects.equals(type, that.type) && Objects.equals(value, that.value) && Objects.equals(display, that.display) && Objects.equals(primary, that.primary) && Objects.equals(dataSource, that.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, display, primary, dataSource);
  }

  @Override
  public String toString() {
    return "Entitlement{" +
      "type='" + type + '\'' +
      ", value='" + value + '\'' +
      ", display='" + display + '\'' +
      ", primary=" + primary +
      ", dataSource='" + dataSource + '\'' +
      '}';
  }
}
