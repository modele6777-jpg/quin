package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c18 implements vz7 {
    public final int a;
    public final List b;
    public final boolean c;
    public final xi d;
    public final kx0 e;
    public final cv7 f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final Object k;
    public final Object l;
    public final oz7 m;
    public final long n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public boolean v;
    public int w = Integer.MIN_VALUE;
    public int x;
    public int y;
    public final int[] z;

    public c18(int i, List list, boolean z, xi xiVar, kx0 kx0Var, cv7 cv7Var, int i2, int i3, int i4, long j, Object obj, Object obj2, oz7 oz7Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = xiVar;
        this.e = kx0Var;
        this.f = cv7Var;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = j;
        this.k = obj;
        this.l = obj2;
        this.m = oz7Var;
        this.n = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            cea ceaVar = (cea) list.get(i6);
            boolean z2 = this.c;
            i5 += z2 ? ceaVar.b : ceaVar.a;
            iMax = Math.max(iMax, !z2 ? ceaVar.b : ceaVar.a);
        }
        this.p = i5;
        this.u = iMax;
        this.z = new int[this.b.size() * 2];
        if (this.c) {
            this.t = this.i;
            this.r = i5;
            this.q = iMax;
            this.s = 0;
            return;
        }
        this.t = 0;
        this.r = iMax;
        this.q = i5;
        this.s = this.i;
    }

    public final int a(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    @Override // defpackage.vz7
    public final int b() {
        return 1;
    }

    public final int c() {
        int i;
        int i2;
        if (this.c) {
            i = this.r;
            i2 = this.t;
        } else {
            i = this.q;
            i2 = this.s;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void d(bea beaVar, boolean z) {
        if (this.w == Integer.MIN_VALUE) {
            l37.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            cea ceaVar = (cea) list.get(i);
            int i2 = this.x;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? ceaVar.b : ceaVar.a);
            int i4 = this.y;
            long jM = m(i);
            kz7 kz7VarA = this.m.a(i, this.k);
            ke6 ke6Var = null;
            if (kz7VarA != null) {
                if (z) {
                    kz7VarA.n = jM;
                } else {
                    if (!w67.b(kz7VarA.n, 9223372034707292159L)) {
                        jM = kz7VarA.n;
                    }
                    long jD = w67.d(jM, ((w67) kz7VarA.r.getValue()).a);
                    if (((a(jM) <= i3 && a(jD) <= i3) || (a(jM) >= i4 && a(jD) >= i4)) && ((Boolean) kz7VarA.h.getValue()).booleanValue()) {
                        ynb.V(kz7VarA.a, null, null, new gz7(kz7VarA, null), 3);
                    }
                    jM = jD;
                }
                ke6Var = kz7VarA.o;
            } else {
                list = list;
                size = size;
            }
            long jD2 = w67.d(jM, this.j);
            if (!z && kz7VarA != null) {
                kz7VarA.m = jD2;
            }
            if (z2) {
                if (ke6Var != null) {
                    beaVar.e(ceaVar);
                    ceaVar.e0(w67.d(jD2, ceaVar.e), 0.0f, ke6Var);
                } else {
                    bea.r(beaVar, ceaVar, jD2);
                }
            } else if (ke6Var == null) {
                bea.p(beaVar, ceaVar, jD2);
            } else if (beaVar.c() == cv7.a || beaVar.d() == 0) {
                beaVar.e(ceaVar);
                ceaVar.e0(w67.d(jD2, ceaVar.e), 0.0f, ke6Var);
            } else {
                int iD = (beaVar.d() - ceaVar.a) - ((int) (jD2 >> 32));
                beaVar.e(ceaVar);
                ceaVar.e0(w67.d((((long) ((int) (jD2 & 4294967295L))) & 4294967295L) | (((long) iD) << 32), ceaVar.e), 0.0f, ke6Var);
            }
            i++;
            list = list;
            size = size;
        }
    }

    public final void e(int i, int i2, int i3) {
        int i4;
        this.o = i;
        boolean z = this.c;
        this.w = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            cea ceaVar = (cea) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.z;
            if (z) {
                xi xiVar = this.d;
                if (xiVar == null) {
                    throw ub3.e("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = xiVar.a(ceaVar.a, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = ceaVar.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                kx0 kx0Var = this.e;
                if (kx0Var == null) {
                    throw ub3.e("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = kx0Var.a(ceaVar.b, i3);
                i4 = ceaVar.a;
            }
            i += i4;
        }
        this.x = -this.g;
        this.y = this.w + this.h;
    }

    @Override // defpackage.vz7
    public final void g(int i, int i2, int i3, int i4) {
        e(i, i3, i4);
    }

    @Override // defpackage.vz7
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.vz7
    public final Object getKey() {
        return this.k;
    }

    @Override // defpackage.vz7
    public final int h() {
        return this.s;
    }

    @Override // defpackage.vz7
    public final int i() {
        return this.r;
    }

    @Override // defpackage.vz7
    public final long j() {
        return this.n;
    }

    @Override // defpackage.vz7
    public final List k() {
        return this.b;
    }

    @Override // defpackage.vz7
    public final int l() {
        return this.t;
    }

    @Override // defpackage.vz7
    public final long m(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.o;
            return this.c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.z;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    @Override // defpackage.vz7
    public final int n() {
        return 0;
    }

    @Override // defpackage.vz7
    public final int o() {
        return this.q;
    }

    @Override // defpackage.vz7
    public final void p() {
        this.v = true;
    }
}
