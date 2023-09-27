package com.easybroker.properties.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class EasyBrokerPropertieResponse {

    private PaginationResponse pagination;

    private List<ContentPropertieResponse> content;
}
