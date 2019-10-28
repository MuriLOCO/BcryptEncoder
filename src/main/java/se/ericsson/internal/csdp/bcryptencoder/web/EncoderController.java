package se.ericsson.internal.csdp.bcryptencoder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se.ericsson.internal.csdp.bcryptencoder.service.EncoderService;

import javax.annotation.security.PermitAll;

@RestController
public class EncoderController {

    @Autowired
    private EncoderService encoderService;

    @RequestMapping(value = "/encode", method = RequestMethod.POST)
    public String encodePassword(@RequestParam(required = true) String password){
        return encoderService.encode(password);
    }
}
