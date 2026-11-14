package com.ma.yfdinstaller;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class ApkProvider extends ContentProvider {
    public static final String AUTHORITY = "com.yfdinstaller.fileprovider";

    public static Uri uriFor(File file) {
        return new Uri.Builder().scheme("content").authority(AUTHORITY).appendPath("apk").appendPath(file.getName()).build();
    }

    @Override
    public boolean onCreate() {
        return true;
    }

    @Override
    public String getType(Uri uri) {
        return "application/vnd.android.package-archive";
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        if (!"r".equals(mode)) {
            throw new FileNotFoundException("Read only");
        }
        if (uri == null || uri.getPathSegments().size() != 2 || !"apk".equals(uri.getPathSegments().get(0))) {
            throw new FileNotFoundException("Invalid URI");
        }
        String name = uri.getLastPathSegment();
        if (name == null || name.contains("/") || name.contains("\\") || name.contains("..")) {
            throw new FileNotFoundException("Invalid filename");
        }
        File base = new File(getContext().getFilesDir(), "install_apks");
        File target = new File(base, name);
        try {
            String basePath = base.getCanonicalPath() + File.separator;
            if (!target.getCanonicalPath().startsWith(basePath) || !target.isFile()) {
                throw new FileNotFoundException("APK not found");
            }
            return ParcelFileDescriptor.open(target, 268435456);
        } catch (IOException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }
}
