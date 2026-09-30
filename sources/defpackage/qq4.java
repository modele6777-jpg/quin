package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qq4 implements lla {
    public final y6g X;
    public final long a;
    public final sw3 b;
    public final int c;
    public final hr d;
    public final nm e;
    public final nm f;
    public final x6g g;
    public final x6g v;
    public final om w;
    public final om x;
    public final om y;
    public final y6g z;

    public qq4(long j, sw3 sw3Var, hr hrVar) {
        int iD0 = sw3Var.D0(48.0f);
        this.a = j;
        this.b = sw3Var;
        this.c = iD0;
        this.d = hrVar;
        int iD1 = sw3Var.D0(aj4.a(j));
        jx0 jx0Var = ndb.Y;
        this.e = new nm(jx0Var, jx0Var, iD1);
        jx0 jx0Var2 = ndb.E0;
        this.f = new nm(jx0Var2, jx0Var2, iD1);
        this.g = new x6g(vd0.d);
        this.v = new x6g(vd0.e);
        int iD2 = sw3Var.D0(aj4.b(j));
        kx0 kx0Var = ndb.y;
        kx0 kx0Var2 = ndb.X;
        this.w = new om(kx0Var, kx0Var2, iD2);
        this.x = new om(kx0Var2, kx0Var, iD2);
        this.y = new om(ndb.z, kx0Var, iD2);
        this.z = new y6g(kx0Var, iD0);
        this.X = new y6g(kx0Var2, iD0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qq4) {
            qq4 qq4Var = (qq4) obj;
            return this.a == qq4Var.a && pa7.t(this.b, qq4Var.b) && this.c == qq4Var.c && this.d == qq4Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.b(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) aj4.c(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }

    @Override // defpackage.lla
    public final long x(a77 a77Var, long j, cv7 cv7Var, long j2) {
        a77 a77Var2;
        long j3;
        char c;
        int iA;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        boolean z = true;
        List listI = t72.I(this.e, this.f, ((int) (a77Var.a() >> 32)) < i3 / 2 ? this.g : this.v);
        int size = listI.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                a77Var2 = a77Var;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            is8 is8Var = (is8) listI.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            a77Var2 = a77Var;
            iA = is8Var.a(a77Var2, j3, i5, cv7Var);
            if (i7 == listI.size() - 1 || (iA >= 0 && i5 + iA <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        List listI2 = t72.I(this.w, this.x, this.y, ((int) (a77Var2.a() & 4294967295L)) < i8 / 2 ? this.z : this.X);
        int size2 = listI2.size();
        int i9 = 0;
        while (i9 < size2) {
            boolean z2 = z;
            int i10 = (int) (j2 & 4294967295L);
            int iA2 = ((js8) listI2.get(i9)).a(a77Var2, j3, i10);
            if (i9 == listI2.size() - 1 || (iA2 >= (i2 = this.c) && i10 + iA2 <= i8 - i2)) {
                i = iA2;
                long j4 = (((long) iA) << c) | (((long) i) & 4294967295L);
                this.d.z(a77Var2, n16.n(j4, j2));
                return j4;
            }
            i9++;
            z = z2;
        }
        i = 0;
        long j5 = (((long) iA) << c) | (((long) i) & 4294967295L);
        this.d.z(a77Var2, n16.n(j5, j2));
        return j5;
    }
}
