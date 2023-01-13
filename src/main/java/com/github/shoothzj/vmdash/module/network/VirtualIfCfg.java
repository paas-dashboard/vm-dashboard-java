package com.github.shoothzj.vmdash.module.network;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class VirtualIfCfg {

    private String name;

    private String virtualName;

    private String ip;

    public VirtualIfCfg() {
    }
}
