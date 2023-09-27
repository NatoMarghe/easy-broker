package com.easybroker.properties.controller;

import com.easybroker.properties.dto.EasyBrokerPropertieResponse;
import com.easybroker.properties.service.PropertieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/easybroker/internal/v1/propertie")
public class PropertieController {

    private final PropertieService propertieService;

    public PropertieController(PropertieService propertieService) {
        this.propertieService = propertieService;
    }

    @GetMapping("/all")
    public ResponseEntity<EasyBrokerPropertieResponse> getAllProperties() throws Exception {
        return propertieService.getAllProperties();
    }
}
