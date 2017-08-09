package com.company;

/**
 * Created by prade on 8/9/2017.
 */
public class SomeBase {

    @Deprecated
    /**
     @deprecated Use newMethod instead.
     */
    public void oldMethod(String methodName){
        System.out.println(methodName);
    }

    public void  newMethod(String methodName, int maxLength){
        String trimmed = methodName.substring(maxLength);
        System.out.println(trimmed);
    }
}
