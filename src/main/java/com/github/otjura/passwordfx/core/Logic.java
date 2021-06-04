/*
 * Copyright Otso Rajala <ojrajala@gmail.com>, 2021
 */
package com.github.otjura.passwordfx.core;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Common static logic utility methods for all classes.
 */
public final class Logic
{
    public static String randomAlphanumeric(int length)
    {
        return RandomStringUtils.randomAlphanumeric(length);
    }
}
