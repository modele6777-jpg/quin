package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ub9 {
    public static final d11 b;
    public static final c11 c;
    public static final c11 d;
    public static final d11 e;
    public static final c11 f;
    public static final c11 g;
    public static final d11 h;
    public static final c11 i;
    public static final c11 j;
    public static final d11 k;
    public static final c11 l;
    public static final c11 m;
    public static final d11 n;
    public static final c11 o;
    public static final c11 p;
    public final boolean a;

    static {
        boolean z = false;
        b = new d11(z, 2);
        boolean z2 = true;
        c = new c11(z2, 4);
        d = new c11(z2, 5);
        e = new d11(z, 3);
        f = new c11(z2, 6);
        g = new c11(z2, 7);
        h = new d11(z, 1);
        i = new c11(z2, 2);
        j = new c11(z2, 3);
        int i2 = 0;
        k = new d11(z, i2);
        l = new c11(z2, i2);
        m = new c11(z2, 1);
        n = new d11(z2, 4);
        o = new c11(z2, 8);
        p = new c11(z2, 9);
    }

    public ub9(boolean z) {
        this.a = z;
    }

    public abstract Object a(String str, Bundle bundle);

    public String b() {
        return "nav_type";
    }

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public boolean g(Object obj, Object obj2) {
        return pa7.t(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
