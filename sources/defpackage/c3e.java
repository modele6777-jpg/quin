package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c3e {
    public final int a;
    public final Size b;
    public final int c;
    public final String d;
    public final au9 e;
    public final zt9 f;
    public final bu9 g;
    public final af8 h;
    public final cu9 i;
    public xj1 j;

    public c3e(int i, int i2, af8 af8Var, zt9 zt9Var, au9 au9Var, bu9 bu9Var, cu9 cu9Var, Size size, String str) {
        size.getClass();
        str.getClass();
        this.a = i;
        this.b = size;
        this.c = i2;
        this.d = str;
        this.e = au9Var;
        this.f = zt9Var;
        this.g = bu9Var;
        this.h = af8Var;
        this.i = cu9Var;
    }

    public final boolean a() {
        cu9 cu9Var;
        bu9 bu9Var = this.g;
        if (bu9Var == null) {
            return true;
        }
        long j = bu9Var.a;
        if (bu9.a(j, 0L) || bu9.a(j, 1L) || bu9.a(j, 3L) || (cu9Var = this.i) == null) {
            return true;
        }
        long j2 = cu9Var.a;
        return cu9.a(j2, 0L) || cu9.a(j2, 1L);
    }

    public final String toString() {
        return qt9.a(this.a);
    }
}
