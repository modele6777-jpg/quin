package io.sentry.util;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final boolean a;
    public static final boolean b;

    static {
        boolean zEquals;
        try {
            zEquals = "The Android Project".equals(System.getProperty("java.vendor"));
            a = zEquals;
        } catch (Throwable unused) {
            a = false;
            zEquals = false;
        }
        if (zEquals) {
            b = false;
            return;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                b = Double.parseDouble(property) >= 9.0d;
            } else {
                b = false;
            }
        } catch (Throwable unused2) {
            b = false;
        }
    }
}
