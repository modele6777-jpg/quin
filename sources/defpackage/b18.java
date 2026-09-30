package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b18 implements yn8 {
    public final c18 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final yn8 e;
    public final float f;
    public final boolean g;
    public final aw2 h;
    public final sw3 i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final ks9 p;
    public final int q;
    public final int r;

    public b18(c18 c18Var, int i, boolean z, float f, yn8 yn8Var, float f2, boolean z2, aw2 aw2Var, sw3 sw3Var, long j, int i2, List list, int i3, int i4, int i5, ks9 ks9Var, int i6, int i7) {
        this.a = c18Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = yn8Var;
        this.f = f2;
        this.g = z2;
        this.h = aw2Var;
        this.i = sw3Var;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = ks9Var;
        this.q = i6;
        this.r = i7;
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

    public final b18 h(int i, boolean z) {
        c18 c18Var;
        int i2;
        int i3;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (c18Var = this.a) == null) {
            return null;
        }
        int iC = c18Var.c();
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= iC) {
            return null;
        }
        c18 c18Var2 = (c18) s72.v0(list);
        c18 c18Var3 = (c18) s72.F0(list);
        if (c18Var2.v || c18Var3.v) {
            return null;
        }
        int i5 = c18Var2.o;
        int i6 = this.n;
        int i7 = this.m;
        if (i < 0) {
            if (Math.min((c18Var2.c() + i5) - i7, (c18Var3.c() + c18Var3.o) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - i5, i6 - c18Var3.o) <= i) {
            return null;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            c18 c18Var4 = (c18) list.get(i8);
            boolean z2 = c18Var4.c;
            int[] iArr = c18Var4.z;
            if (!c18Var4.v) {
                c18Var4.o += i;
                int length = iArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = i9 & 1;
                    if ((z2 && i10 != 0) || (!z2 && i10 == 0)) {
                        iArr[i9] = iArr[i9] + i;
                    }
                }
                if (z) {
                    int size2 = c18Var4.b.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        kz7 kz7VarA = c18Var4.m.a(i11, c18Var4.k);
                        if (kz7VarA != null) {
                            long j = kz7VarA.l;
                            if (z2) {
                                i2 = (int) (j >> 32);
                                i3 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = ((int) (j >> 32)) + i;
                                i3 = (int) (j & 4294967295L);
                            }
                            kz7VarA.l = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                        } else {
                            i4 = i4;
                        }
                        i11++;
                        i4 = i4;
                    }
                }
            }
            i8++;
            i4 = i4;
        }
        return new b18(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final long i() {
        yn8 yn8Var = this.e;
        return (((long) yn8Var.d()) << 32) | (((long) yn8Var.c()) & 4294967295L);
    }
}
