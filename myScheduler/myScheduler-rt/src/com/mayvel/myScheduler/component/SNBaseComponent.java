package com.mayvel.myScheduler.component;

import javax.baja.sys.Sys;
import javax.baja.sys.Type;

public interface SNBaseComponent {
    Type TYPE = Sys.loadType(SNBaseComponent.class);

    boolean hasvalidLicense();

    void checkValidLicense();
}