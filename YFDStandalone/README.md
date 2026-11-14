# YFD 独立安装器（源码）

从会话编译产物 `YFD-Standalone-Installer.apk` 反编译还原的 Android 工程。

| 项 | 值 |
|---|---|
| 应用名 | YFD 独立安装器 |
| applicationId | `com.yfdinstaller` |
| 代码包名 | `com.ma.yfdinstaller` |
| FileProvider | `com.yfdinstaller.fileprovider` |
| 版本 | 1.0.0 |
| minSdk / targetSdk | 23 / 28 |

## 还原完整 MainActivity

```bash
bash scripts/decode_MainActivity.sh
```

生成 `app/src/main/java/com/ma/yfdinstaller/MainActivity.java`。

## 构建

1. `bash scripts/decode_MainActivity.sh`
2. Android Studio 打开本目录（SDK 35 + JDK 17）
3. Build APK

> 代码包名使用 `com.ma.yfdinstaller`（已去掉 hyw）。
