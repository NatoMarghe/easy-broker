package com.easybroker.properties.service;

import com.easybroker.properties.dto.EasyBrokerPropertieResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Objects;

@Service
public class PropertieService {

    @Value("${app.easybroker.url:}")
    private String easyBrokerUrl;

    private final RestTemplate restTemplate;

    public PropertieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<EasyBrokerPropertieResponse> getAllProperties() {
        try {
            if (Objects.isNull(easyBrokerUrl)) {
                easyBrokerUrl = "https://api.stagingeb.com/v1/";
            }
            String url = easyBrokerUrl + Constants.PROPERTIE_GET_ALL_PATH;

            HttpHeaders headers = new HttpHeaders();

            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("X-Authorization","l7u502p8v46ba3ppgvj5y2aad50lb9");

            HttpEntity<EasyBrokerPropertieResponse> entity = new HttpEntity<>(headers);

            ResponseEntity<EasyBrokerPropertieResponse> response = restTemplate.exchange(
                    url, HttpMethod.GET, entity,
                    new ParameterizedTypeReference<>() {
                    });
            return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
        } catch (RestClientException e) {
            throw e;
        }
    }
}
