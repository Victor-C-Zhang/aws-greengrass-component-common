/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.amazon.aws.iot.greengrass.component.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize(builder = TemplateParameter.TemplateParameterBuilder.class)
public class TemplateParameter {
    @NonNull
    TemplateParameterType type;

    @NonNull
    @Builder.Default
    Boolean required = false;

    Object defaultValue;

    @JsonPOJOBuilder(withPrefix = "")
    public static class TemplateParameterBuilder {
    }
}
