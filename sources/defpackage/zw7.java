package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zw7 implements yn8 {
    public final bx7 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final yn8 e;
    public final float f;
    public final boolean g;
    public final aw2 h;
    public final sw3 i;
    public final int j;
    public final a26 k;
    public final a26 l;
    public final int m;
    public final List n;
    public final int o;
    public final int p;
    public final int q;
    public final ks9 r;
    public final int s;
    public final int t;

    public zw7(bx7 bx7Var, int i, boolean z, float f, yn8 yn8Var, float f2, boolean z2, aw2 aw2Var, sw3 sw3Var, int i2, a26 a26Var, a26 a26Var2, int i3, List list, int i4, int i5, int i6, ks9 ks9Var, int i7, int i8) {
        this.a = bx7Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = yn8Var;
        this.f = f2;
        this.g = z2;
        this.h = aw2Var;
        this.i = sw3Var;
        this.j = i2;
        this.k = a26Var;
        this.l = a26Var2;
        this.m = i3;
        this.n = list;
        this.o = i4;
        this.p = i5;
        this.q = i6;
        this.r = ks9Var;
        this.s = i7;
        this.t = i8;
    }

    @Override // defpackage.yn8
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.yn8
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.yn8
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.yn8
    public final int d() {
        return this.e.d();
    }

    @Override // defpackage.yn8
    public final a26 e() {
        return this.e.e();
    }

    @Override // defpackage.yn8
    public final l26 f() {
        return this.e.f();
    }

    @Override // defpackage.yn8
    public final a26 g() {
        return this.e.g();
    }

    public final zw7 h(int i, boolean z) {
        bx7 bx7Var;
        List list;
        int i2;
        long j;
        if (this.g) {
            return null;
        }
        List list2 = this.n;
        if (list2.isEmpty() || (bx7Var = this.a) == null) {
            return null;
        }
        int i3 = bx7Var.g;
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        ax7 ax7Var = (ax7) s72.v0(list2);
        ax7 ax7Var2 = (ax7) s72.F0(list2);
        if (ax7Var.z || ax7Var2.z) {
            return null;
        }
        int i5 = this.p;
        int i6 = this.o;
        ks9 ks9Var = this.r;
        if (i < 0) {
            if (Math.min((ax7Var.a() + xo1.G(ax7Var, ks9Var)) - i6, (ax7Var2.a() + xo1.G(ax7Var2, ks9Var)) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - xo1.G(ax7Var, ks9Var), i5 - xo1.G(ax7Var2, ks9Var)) <= i) {
            return null;
        }
        int size = list2.size();
        int i7 = 0;
        while (i7 < size) {
            ax7 ax7Var3 = (ax7) list2.get(i7);
            ax7Var3.getClass();
            if (ax7Var3.z) {
                list = list2;
                i2 = size;
            } else {
                long j2 = ax7Var3.w;
                long j3 = 4294967295L;
                ax7Var3.w = (((long) ((int) (j2 >> 32))) << 32) | (((long) (((int) (j2 & 4294967295L)) + i)) & 4294967295L);
                if (z) {
                    int size2 = ax7Var3.g.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        kz7 kz7VarA = ax7Var3.j.a(i8, ax7Var3.b);
                        if (kz7VarA != null) {
                            long j4 = kz7VarA.l;
                            j = j3;
                            kz7VarA.l = (((long) (((int) (j4 & j)) + i)) & j) | (((long) ((int) (j4 >> 32))) << 32);
                        } else {
                            j = j3;
                        }
                        i8++;
                        list2 = list2;
                        j3 = j;
                        size = size;
                    }
                }
                list = list2;
                i2 = size;
            }
            i7++;
            i4 = i4;
            list2 = list;
            size = i2;
        }
        return new zw7(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, list2, this.o, this.p, this.q, ks9Var, this.s, this.t);
    }

    public final long i() {
        yn8 yn8Var = this.e;
        return (((long) yn8Var.d()) << 32) | (((long) yn8Var.c()) & 4294967295L);
    }
}
