package com.easybroker.properties.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class OperationPropertieResponse {
    private OperationType type;
    private Long amount;
    private String currency;
    private String formattedAmount;
    private CommissionPropertieResponse commission;
    private String unit;
    private Integer bedrooms;
    private Integer bathrooms;
    private Integer parkingSpaces;
    private PropertyType propertyType;
    private Integer lotSize;
    private Integer constructionSize;
    private LocalDateTime updated_at;
    private String agent;
    private boolean showPrices;
    private boolean shareCommission;
}
