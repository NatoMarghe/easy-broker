package com.easybroker.properties;

import com.easybroker.properties.dto.ContentPropertieResponse;
import com.easybroker.properties.dto.EasyBrokerPropertieResponse;
import com.easybroker.properties.service.PropertieService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class TestServiceProperties {

    private PropertieService propertieService;

    public TestServiceProperties() {
        this.propertieService = new PropertieService(new RestTemplate());
    }

    @Test
    public void testResultOK() {

        ResponseEntity<EasyBrokerPropertieResponse> result = propertieService.getAllProperties();

        Assert.assertEquals(result.getStatusCode().is2xxSuccessful(), true);
        Assert.assertEquals(result.getBody().getPagination().getPage().intValue(), 1);
        Assert.assertNotNull(result.getBody().getContent());
    }
}
