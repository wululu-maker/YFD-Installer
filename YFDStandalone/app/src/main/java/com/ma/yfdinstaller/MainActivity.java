package com.ma.yfdinstaller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 完整源码见同目录 MainActivity.java.gz.b64.part0..7
 * 运行: bash scripts/decode_MainActivity.sh
 */
public final class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        TextView t = new TextView(this);
        t.setText("请先运行 scripts/decode_MainActivity.sh 合并完整 MainActivity 后再编译。");
        t.setPadding(48, 48, 48, 48);
        setContentView(t);
    }
}
