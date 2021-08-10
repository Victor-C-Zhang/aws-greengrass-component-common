/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.amazon.aws.iot.greengrass.component.common;

import java.util.HashMap;
import java.util.Map;

public class TemplateParameterSchema extends HashMap<String, TemplateParameter> {
    private static final long serialVersionUID = -5896184342259928914L;

    public TemplateParameterSchema(Map<String, TemplateParameter> other) {
        super(other);
    }

    public TemplateParameterSchema() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Map)) {
            return false;
        }
        Map other = (Map) o;
        if (this.size() != other.size()) {
            return false;
        }
        for (Map.Entry<String, TemplateParameter> e : this.entrySet()) {
            if (other.get(e.getKey()) == null || !e.getValue().equals(other.get(e.getKey()))) {
                return false;
            }
        }

        return true;
    }

    @SuppressWarnings("PMD.UselessOverridingMethod")
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('{');
        for (Map.Entry<String, TemplateParameter> e : this.entrySet()) {
            builder.append(" \"").append(e.getKey()).append("\": ");
            builder.append(e.getValue().toString());
            builder.append(',');
        }
        builder.append(" }");
        return builder.toString();
    }
}
