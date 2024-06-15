package com.zee.demok8s.testk8;

import java.util.Arrays;

/**
 * @author : Ezekiel Eromosei
 * @code @created : 15 Jun, 2024
 */

public enum Mode {
    DEVELOPMENT, PRODUCTION;

    public static Mode getMode(String modeString){
        return Arrays.stream(Mode.values())
                .filter(mode -> mode.name().equalsIgnoreCase(modeString))
                .findFirst().orElse(Mode.DEVELOPMENT);
    }
}
