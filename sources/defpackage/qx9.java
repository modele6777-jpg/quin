package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qx9 implements yn8 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final ks9 e;
    public final int f;
    public final int g;
    public final int h;
    public final ao8 i;
    public final ao8 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final frd n;
    public final yn8 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final aw2 s;
    public final sw3 t;
    public final long u;

    public qx9(List list, int i, int i2, int i3, ks9 ks9Var, int i4, int i5, int i6, ao8 ao8Var, ao8 ao8Var2, float f, int i7, boolean z, frd frdVar, yn8 yn8Var, boolean z2, List list2, List list3, aw2 aw2Var, sw3 sw3Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = ks9Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = ao8Var;
        this.j = ao8Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = frdVar;
        this.o = yn8Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = aw2Var;
        this.t = sw3Var;
        this.u = j;
    }

    @Override // defpackage.yn8
    public final Map a() {
        return this.o.a();
    }

    @Override // defpackage.yn8
    public final void b() {
        this.o.b();
    }

    @Override // defpackage.yn8
    public final int c() {
        return this.o.c();
    }

    @Override // defpackage.yn8
    public final int d() {
        return this.o.d();
    }

    @Override // defpackage.yn8
    public final a26 e() {
        return this.o.e();
    }

    @Override // defpackage.yn8
    public final l26 f() {
        return this.o.f();
    }

    @Override // defpackage.yn8
    public final a26 g() {
        return this.o.g();
    }

    public final qx9 h(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        ao8 ao8Var = (ao8) s72.v0(list);
        ao8 ao8Var2 = (ao8) s72.F0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((ao8Var.j + i3) - i5, (ao8Var2.j + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - ao8Var.j, i4 - ao8Var2.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((ao8) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((ao8) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((ao8) list3.get(i8)).a(i);
        }
        return new qx9(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long i() {
        yn8 yn8Var = this.o;
        return (((long) yn8Var.d()) << 32) | (((long) yn8Var.c()) & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ qx9(int i, int i2, int i3, int i4, int i5, int i6, frd frdVar, yn8 yn8Var, aw2 aw2Var, sw3 sw3Var, long j) {
        pu4 pu4Var = pu4.a;
        this(pu4Var, i, i2, i3, ks9.b, i4, i5, i6, null, null, 0.0f, 0, false, frdVar, yn8Var, false, pu4Var, pu4Var, aw2Var, sw3Var, j);
    }
}
