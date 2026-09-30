package defpackage;

import io.sentry.android.core.b1;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gf8 {
    public static final cf8 a = new cf8();

    public static void a() {
        a.getClass();
    }

    public static void b(String str) {
        a.getClass();
        HashSet hashSet = cf8.a;
        if (hashSet.contains(str)) {
            return;
        }
        b1.n("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        a.getClass();
        HashSet hashSet = cf8.a;
        if (hashSet.contains(str)) {
            return;
        }
        b1.n("LOTTIE", str, th);
        hashSet.add(str);
    }
}
