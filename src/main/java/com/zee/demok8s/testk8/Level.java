package com.zee.demok8s.testk8;

import java.util.Arrays;

/**
 * @author : Ezekiel Eromosei
 * @code @created : 15 Jun, 2024
 */

public enum Level {
    NOVICE, EXPERT;

    public static Level getLevel(final String level) {
        return Arrays.stream(Level.values())
                .filter(lev -> lev.name().equalsIgnoreCase(level))
                .findFirst().orElse(Level.NOVICE);

    }
}
