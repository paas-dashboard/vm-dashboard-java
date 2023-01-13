package com.github.shoothzj.vmdash.controller.network;

import com.github.shoothzj.vmdash.module.network.IfCfg;
import com.github.shoothzj.vmdash.util.IpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IfController {

    @GetMapping(path = "/api/network/interfaces")
    public List<IfCfg> getNetworkInterfaces() {
        return IpUtil.getIfCfgs();
    }
}
