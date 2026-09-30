package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
class InstallerPackageNameProvider {
    private static final String NO_INSTALLER_PACKAGE_NAME = "";
    private String installerPackageName;

    private static String loadInstallerPackageName(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? NO_INSTALLER_PACKAGE_NAME : installerPackageName;
    }

    public synchronized String getInstallerPackageName(Context context) {
        String strLoadInstallerPackageName;
        try {
            strLoadInstallerPackageName = this.installerPackageName;
            if (strLoadInstallerPackageName == null) {
                strLoadInstallerPackageName = loadInstallerPackageName(context);
                this.installerPackageName = strLoadInstallerPackageName;
            }
        } catch (Throwable th) {
            throw th;
        }
        return NO_INSTALLER_PACKAGE_NAME.equals(strLoadInstallerPackageName) ? null : this.installerPackageName;
    }
}
