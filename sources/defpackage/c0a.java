package defpackage;

import android.app.ActivityManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0a {
    public static final boolean a;

    static {
        ClassLoader classLoader;
        char[] cArr = d0a.d;
        boolean z = true;
        if (!bm8.v("robolectric", Build.FINGERPRINT) && (((classLoader = d0a.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) && !ActivityManager.isRunningInTestHarness())) {
            z = false;
        }
        a = z;
    }
}
