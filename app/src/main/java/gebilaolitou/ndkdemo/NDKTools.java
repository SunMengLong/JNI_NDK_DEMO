package gebilaolitou.ndkdemo;

/**
 * Created by 10007358 on 2020/6/18.
 */

public class NDKTools {

    static {
        System.loadLibrary("ndkdemotest-jni");
    }

    public static native String getStringFromNDK();
}
