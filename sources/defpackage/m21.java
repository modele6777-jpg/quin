package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m21 {
    public static final /* synthetic */ m21 a = new m21();
    public static final String b = n21.class.getSimpleName();

    public static n21 a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return o21.a;
        }
        if (i >= 29) {
            return qk6.e;
        }
        return i >= 28 ? hj6.e : ndb.G0;
    }
}
