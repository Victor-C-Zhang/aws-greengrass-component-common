/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.amazon.aws.iot.greengrass.component.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TemplateParameterType {
    @JsonProperty("string")
    STRING,
    @JsonProperty("number")
    NUMBER,
    @JsonProperty("object")
    OBJECT,
    @JsonProperty("array")
    ARRAY,
    @JsonProperty("boolean")
    BOOLEAN,
}
