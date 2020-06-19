package gebilaolitou.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * JNI/NDK实战，传统方式的流程
     * 参考博客：https://www.jianshu.com/p/b4431ac22ec2
     */

    private TextView ndkString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ndkString = findViewById(R.id.ndk_string);
        String ndkText = NDKTools.getStringFromNDK();
        ndkString.setText(ndkText);
    }
}
