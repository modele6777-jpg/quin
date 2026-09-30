package defpackage;

import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ar5 implements Comparable {
    public static final ar5 X;
    public static final ar5 Y;
    public static final ar5 b;
    public static final ar5 c;
    public static final ar5 d;
    public static final ar5 e;
    public static final ar5 f;
    public static final ar5 g;
    public static final ar5 v;
    public static final ar5 w;
    public static final ar5 x;
    public static final ar5 y;
    public static final ar5 z;
    public final int a;

    static {
        ar5 ar5Var = new ar5(100);
        ar5 ar5Var2 = new ar5(200);
        ar5 ar5Var3 = new ar5(300);
        ar5 ar5Var4 = new ar5(Constants.MINIMAL_ERROR_STATUS_CODE);
        b = ar5Var4;
        ar5 ar5Var5 = new ar5(500);
        c = ar5Var5;
        ar5 ar5Var6 = new ar5(600);
        d = ar5Var6;
        ar5 ar5Var7 = new ar5(700);
        e = ar5Var7;
        ar5 ar5Var8 = new ar5(800);
        ar5 ar5Var9 = new ar5(900);
        f = ar5Var;
        g = ar5Var2;
        v = ar5Var3;
        w = ar5Var4;
        x = ar5Var5;
        y = ar5Var6;
        z = ar5Var7;
        X = ar5Var8;
        Y = ar5Var9;
        t72.I(ar5Var, ar5Var2, ar5Var3, ar5Var4, ar5Var5, ar5Var6, ar5Var7, ar5Var8, ar5Var9);
    }

    public ar5(int i) {
        this.a = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        j37.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ar5 ar5Var) {
        return pa7.L(this.a, ar5Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ar5) {
            return this.a == ((ar5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return tec.f(this.a, "FontWeight(weight=", ")");
    }
}
