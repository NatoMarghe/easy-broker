package com.easybroker.properties.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PaginationResponse {
    private Integer limit;
    private Integer page;
    private Long total;
    private String nextPage;
}
