package com.redhat.soloint.controller;

import com.redhat.openapi.api.SanityApi;
import com.redhat.openapi.model.SanityResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SanityController implements SanityApi {
    @Override
    public ResponseEntity<SanityResponse> sanityGet() {
        SanityResponse sanityResponse = new SanityResponse();
        sanityResponse.setMessage("All fine");
        return  ResponseEntity.ok(sanityResponse);
    }
}
