package org.aoju.bus.gitlab.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.aoju.bus.gitlab.utils.JacksonJson;
import org.aoju.bus.gitlab.utils.JacksonJsonEnumHelper;

public class CommitRef {

    private RefType type;
    private String name;

    public RefType getType() {
        return type;
    }

    public void setType(RefType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }

    public enum RefType {
        BRANCH, TAG, ALL;

        private static JacksonJsonEnumHelper<RefType> enumHelper = new JacksonJsonEnumHelper<>(RefType.class);

        @JsonCreator
        public static RefType forValue(String value) {
            return enumHelper.forValue(value);
        }

        @JsonValue
        public String toValue() {
            return (enumHelper.toString(this));
        }

        @Override
        public String toString() {
            return (enumHelper.toString(this));
        }
    }
}
