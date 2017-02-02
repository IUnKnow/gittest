package com.example.lb.apptest;

import android.app.Application;
import android.content.Context;
import android.os.Build;

/**
 * Created by libo on 2017/1/12.
 */

public class App extends Application {
    private static Context context;
    private static boolean loadFromLib;
    public static Application newApp;
    public static Application runApp;
    private static String soName;
    public static String strEntryApplication;
    public static   int nCount;

    static {
        nCount = 0;
    }

    public App(){
        System.out.print("hello");
    }




    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        context = base;
        if (runApp != null){
            runApp  = this;
        }

        if (newApp == null){
            String strPath = "/data/data/" + base.getPackageName() + ".jiagu";
            Boolean bisX86Arch = isX86Arch();
            Boolean boolean1 = Boolean.valueOf(false);
            Boolean boolean2 = Boolean.valueOf(false);

            if((Build.CPU_ABI.contains("64")) || (Build.CPU_ABI2.contains("64"))) {
                boolean2 = Boolean.valueOf(true);
            }
        }
    }


    public static Boolean isX86Arch(){
        return  false;
    }
}
