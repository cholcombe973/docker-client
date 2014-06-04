/*
 * Copyright (c) 2014 Spotify AB.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.spotify.docker.messages;

import com.google.common.base.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;

@JsonAutoDetect(fieldVisibility = ANY, getterVisibility = NONE, setterVisibility = NONE)
public class ImageInfo {

  @JsonProperty("id") private String id;
  @JsonProperty("parent") private String parent;
  @JsonProperty("comment") private String comment;
  @JsonProperty("created") private Date created;
  @JsonProperty("container") private String container;
  @JsonProperty("container_config") private ContainerConfig containerConfig;
  @JsonProperty("docker_version") private String dockerVersion;
  @JsonProperty("author") private String author;
  @JsonProperty("config") private ContainerConfig config;
  @JsonProperty("architecture") private String architecture;
  @JsonProperty("os") private String os;
  @JsonProperty("Size") private Long size;

  public String id() {
    return id;
  }

  public String parent() {
    return parent;
  }

  public String comment() {
    return comment;
  }

  public Date created() {
    return created == null ? null : new Date(created.getTime());
  }

  public String container() {
    return container;
  }

  public ContainerConfig containerConfig() {
    return containerConfig;
  }

  public String dockerVersion() {
    return dockerVersion;
  }

  public String author() {
    return author;
  }

  public ContainerConfig config() {
    return config;
  }

  public String architecture() {
    return architecture;
  }

  public String os() {
    return os;
  }

  public Long size() {
    return size;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final ImageInfo imageInfo = (ImageInfo) o;

    if (architecture != null ? !architecture.equals(imageInfo.architecture)
                             : imageInfo.architecture != null) {
      return false;
    }
    if (author != null ? !author.equals(imageInfo.author) : imageInfo.author != null) {
      return false;
    }
    if (comment != null ? !comment.equals(imageInfo.comment) : imageInfo.comment != null) {
      return false;
    }
    if (config != null ? !config.equals(imageInfo.config) : imageInfo.config != null) {
      return false;
    }
    if (container != null ? !container.equals(imageInfo.container) : imageInfo.container != null) {
      return false;
    }
    if (containerConfig != null ? !containerConfig.equals(imageInfo.containerConfig)
                                : imageInfo.containerConfig != null) {
      return false;
    }
    if (created != null ? !created.equals(imageInfo.created) : imageInfo.created != null) {
      return false;
    }
    if (dockerVersion != null ? !dockerVersion.equals(imageInfo.dockerVersion)
                              : imageInfo.dockerVersion != null) {
      return false;
    }
    if (id != null ? !id.equals(imageInfo.id) : imageInfo.id != null) {
      return false;
    }
    if (os != null ? !os.equals(imageInfo.os) : imageInfo.os != null) {
      return false;
    }
    if (parent != null ? !parent.equals(imageInfo.parent) : imageInfo.parent != null) {
      return false;
    }
    if (size != null ? !size.equals(imageInfo.size) : imageInfo.size != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (parent != null ? parent.hashCode() : 0);
    result = 31 * result + (comment != null ? comment.hashCode() : 0);
    result = 31 * result + (created != null ? created.hashCode() : 0);
    result = 31 * result + (container != null ? container.hashCode() : 0);
    result = 31 * result + (containerConfig != null ? containerConfig.hashCode() : 0);
    result = 31 * result + (dockerVersion != null ? dockerVersion.hashCode() : 0);
    result = 31 * result + (author != null ? author.hashCode() : 0);
    result = 31 * result + (config != null ? config.hashCode() : 0);
    result = 31 * result + (architecture != null ? architecture.hashCode() : 0);
    result = 31 * result + (os != null ? os.hashCode() : 0);
    result = 31 * result + (size != null ? size.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
        .add("id", id)
        .add("parent", parent)
        .add("comment", comment)
        .add("created", created)
        .add("container", container)
        .add("containerConfig", containerConfig)
        .add("dockerVersion", dockerVersion)
        .add("author", author)
        .add("config", config)
        .add("architecture", architecture)
        .add("os", os)
        .add("size", size)
        .toString();
  }
}