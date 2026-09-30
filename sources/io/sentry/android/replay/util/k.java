package io.sentry.android.replay.util;

import android.os.Build;
import defpackage.ap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static String a(i iVar) {
        String str;
        iVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i = j.a[iVar.ordinal()];
        if (i == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i != 2) {
                ap.c();
                return null;
            }
            str = Build.SOC_MANUFACTURER;
        }
        str.getClass();
        return str;
    }
}
