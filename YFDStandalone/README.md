# YFD 独立安装器（源码）

从会话编译产物 `YFD-Standalone-Installer.apk` 反编译还原的 Android 工程。

| 项 | 值 |
|---|---|
| 应用名 | YFD 独立安装器 |
| applicationId | `com.yfdinstaller` |
| 代码包名 | `com.hyw.yfdinstaller` |
| FileProvider | `com.yfdinstaller.fileprovider` |
| 版本 | 1.0.0 |
| minSdk / targetSdk | 23 / 28 |

## 功能概要

- 多选 APK、批量安装
- APKM / XAPK / ZIP 分包识别
- 本地文件搜索与排序
- 安装记录
- YFD Binder 安装 / 卸载与服务诊断
- 悬浮窗操作面板
- 半透明分区界面（Android 12+ 可使用背景模糊）

## 构建

Android Studio 打开本目录，安装 SDK 35 与 JDK 17，同步 Gradle 后 Build APK。

> 说明：Java 源码由 jadx 从 APK 反编译得到，可能与原始工程在格式与局部结构上有差异，但逻辑与包配置与发布 APK 一致。
