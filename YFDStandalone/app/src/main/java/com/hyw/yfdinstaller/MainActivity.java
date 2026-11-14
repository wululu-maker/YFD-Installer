package com.hyw.yfdinstaller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Full source is in MainActivity.java.part0 .. part4.
 * Run: bash scripts/join_MainActivity.sh
 * before building, to reconstruct this file from parts.
 *
 * Or use the complete file from YFDStandalone-source.zip.
 */
public final class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        TextView t = new TextView(this);
        t.setText("请先运行 scripts/join_MainActivity.sh 合并完整 MainActivity 源码后再编译。");
        t.setPadding(48, 48, 48, 48);
        setContentView(t);
    }
}
