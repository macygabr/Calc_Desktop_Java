package com.example.calc;

import java.io.IOException;

class NativeLib {

    static {
        String pathToJar = CalcApplication.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        pathToJar = pathToJar.substring(0, pathToJar.lastIndexOf("/")) + "/classes/lib/";

        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("win")) System.load(pathToJar + "native_lib.dll");
        else System.load(pathToJar + "native_lib.so");
    }

    public native String Arithmetic(String str, String x);

    public native double Graph(String str);

    public native boolean Init(String str);
}