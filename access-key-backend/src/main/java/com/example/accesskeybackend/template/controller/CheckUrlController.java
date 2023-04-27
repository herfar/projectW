package com.example.accesskeybackend.template.controller;

import org.springframework.web.bind.annotation.*;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/api/web")
public class CheckUrlController {

    @ResponseStatus
    @GetMapping("/checkIpv6Support")
    public boolean checkIpv6(@RequestParam String siteUrl) throws UnknownHostException {
        InetAddress address = InetAddress.getByName(siteUrl);
        return address instanceof Inet6Address;
    }
}
