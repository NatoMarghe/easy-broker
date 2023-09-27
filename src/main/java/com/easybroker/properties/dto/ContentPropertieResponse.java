package com.easybroker.properties.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ContentPropertieResponse {
    private String publicId;
    private String title;
    private String titleImageFull;
    private String titleImageThumb;
    private String location;
    private List<OperationPropertieResponse> operations;
}
