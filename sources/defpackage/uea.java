package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uea {
    public static uea a;

    public static uea a() {
        uea ueaVar = a;
        if (ueaVar != null) {
            return ueaVar;
        }
        try {
            if ("The Android Project".equalsIgnoreCase(System.getProperty("java.vendor"))) {
                int i = fu.b;
                a = (uea) fu.class.newInstance();
            } else {
                a = (uea) Class.forName("com.google.android.filament.DesktopPlatform").newInstance();
            }
        } catch (Exception unused) {
        }
        uea ueaVar2 = a;
        if (ueaVar2 != null) {
            return ueaVar2;
        }
        rea reaVar = new rea();
        a = reaVar;
        return reaVar;
    }

    public abstract boolean b(Surface surface);
}
