package com.github.shoothzj.vmdash.module.network;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class IfCfg {

    private String name;

    private String ip;

    private List<VirtualIfCfg> virtualIfCfgs;

    public IfCfg() {
    }
}
