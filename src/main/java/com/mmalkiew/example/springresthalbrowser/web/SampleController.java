package com.mmalkiew.example.springresthalbrowser.web;

import com.mmalkiew.example.springresthalbrowser.model.Sample;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ExposesResourceFor(Sample.class)
public class SampleController {


    @GetMapping(path = "/test", produces = "application/json")
    @RestResource
    public Sample sampleGet() {
        Sample sample = new Sample();
        sample.setFirstName("test");
        sample.setLastName("test last name");
        return sample;
    }
}
