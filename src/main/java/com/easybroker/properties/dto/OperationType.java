package com.easybroker.properties.dto;

public enum OperationType {
    sale(1),
    rental(2);
    private final int level;

    OperationType(int level) {
        this.level = level;
    }
}
