/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.amazon.aws.iot.greengrass.component.common;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TemplateParameterTest extends BaseRecipeTest {
    @Test
    void GIVEN_parameter_with_illegal_type_THEN_throw_json_format_exception() {
        String filename = "template-recipe-bad-schema-type.yaml";
        Path recipePath = getResourcePath(filename);

        assertThrows(InvalidFormatException.class, () ->
            DESERIALIZER_YAML.readValue(new String(Files.readAllBytes(recipePath)), ComponentRecipe.class));
    }
}
