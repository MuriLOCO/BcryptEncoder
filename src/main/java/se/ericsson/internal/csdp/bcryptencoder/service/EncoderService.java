package se.ericsson.internal.csdp.bcryptencoder.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EncoderService {

    private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public String encode(String password){
    return encoder.encode(password);
    }
}

