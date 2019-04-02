package com.jwt.demo.utilities;

public class Utility {

    public final String LOGGING_PATTERN = getCurrentClassName()+" line ";

    public String getCurrentClassName()
    {
        Class<?> enclosingClass = getClass().getEnclosingClass();
        if (enclosingClass != null) {
            return enclosingClass.getName();
        } else {
            return getClass().getName();
        }
    }

    public static int getLineNumber() {

        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
