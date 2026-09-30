package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ax7 implements vz7 {
    public final int a;
    public final Object b;
    public final int c;
    public final cv7 d;
    public final int e;
    public final int f;
    public final List g;
    public final long h;
    public final Object i;
    public final oz7 j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public int s = Integer.MIN_VALUE;
    public int t;
    public int u;
    public final long v;
    public long w;
    public int x;
    public int y;
    public boolean z;

    public ax7(int i, Object obj, int i2, int i3, cv7 cv7Var, int i4, int i5, List list, long j, Object obj2, oz7 oz7Var, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = cv7Var;
        this.e = i4;
        this.f = i5;
        this.g = list;
        this.h = j;
        this.i = obj2;
        this.j = oz7Var;
        this.k = j2;
        this.l = i6;
        this.m = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((cea) list.get(i8)).b);
        }
        this.n = iMax;
        this.r = i3;
        this.p = iMax;
        int i9 = this.c;
        this.o = i9;
        this.q = 0;
        this.v = (((long) i9) << 32) | (((long) iMax) & 4294967295L);
        this.w = 0L;
        this.x = -1;
        this.y = -1;
    }

    public final int a() {
        return this.p + this.r;
    }

    @Override // defpackage.vz7
    public final int b() {
        return this.m;
    }

    public final void c(bea beaVar, boolean z) {
        if (this.s == Integer.MIN_VALUE) {
            l37.a("position() should be called first");
        }
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cea ceaVar = (cea) list.get(i);
            int i2 = this.t - ceaVar.b;
            int i3 = this.u;
            long j = this.w;
            kz7 kz7VarA = this.j.a(i, this.b);
            ke6 ke6Var = null;
            if (kz7VarA != null) {
                if (z) {
                    kz7VarA.n = j;
                } else {
                    long jD = w67.d(!w67.b(kz7VarA.n, 9223372034707292159L) ? kz7VarA.n : j, ((w67) kz7VarA.r.getValue()).a);
                    int i4 = (int) (j & 4294967295L);
                    if (((i4 <= i2 && ((int) (jD & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (jD & 4294967295L)) >= i3)) && ((Boolean) kz7VarA.h.getValue()).booleanValue()) {
                        ynb.V(kz7VarA.a, null, null, new gz7(kz7VarA, null), 3);
                    }
                    j = jD;
                }
                ke6Var = kz7VarA.o;
            }
            long jD2 = w67.d(j, this.h);
            if (!z && kz7VarA != null) {
                kz7VarA.m = jD2;
            }
            if (ke6Var != null) {
                beaVar.e(ceaVar);
                ceaVar.e0(w67.d(jD2, ceaVar.e), 0.0f, ke6Var);
            } else {
                bea.r(beaVar, ceaVar, jD2);
            }
        }
    }

    public final void d(int i, int i2, int i3, int i4, int i5, int i6) {
        this.s = i4;
        if (this.d == cv7.b) {
            i2 = (i3 - i2) - this.c;
        }
        this.w = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.x = i5;
        this.y = i6;
        this.t = -this.e;
        this.u = i4 + this.f;
    }

    @Override // defpackage.vz7
    public final void g(int i, int i2, int i3, int i4) {
        d(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.vz7
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.vz7
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.vz7
    public final int h() {
        return this.q;
    }

    @Override // defpackage.vz7
    public final int i() {
        return this.p;
    }

    @Override // defpackage.vz7
    public final long j() {
        return this.k;
    }

    @Override // defpackage.vz7
    public final List k() {
        return this.g;
    }

    @Override // defpackage.vz7
    public final int l() {
        return this.r;
    }

    @Override // defpackage.vz7
    public final long m(int i) {
        return this.w;
    }

    @Override // defpackage.vz7
    public final int n() {
        return this.l;
    }

    @Override // defpackage.vz7
    public final int o() {
        return this.o;
    }

    @Override // defpackage.vz7
    public final void p() {
        this.z = true;
    }
}
