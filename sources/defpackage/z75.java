package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z75 implements lla {
    public final int a;
    public final e89 b;
    public final hr c;
    public final nm d;
    public final nm e;
    public final x6g f;
    public final x6g g;
    public final om v;
    public final om w;
    public final y6g x;
    public final y6g y;

    public z75(sw3 sw3Var, int i, e89 e89Var, hr hrVar) {
        int iD0 = sw3Var.D0(48.0f);
        this.a = i;
        this.b = e89Var;
        this.c = hrVar;
        jx0 jx0Var = ndb.Y;
        this.d = new nm(jx0Var, jx0Var, 0);
        jx0 jx0Var2 = ndb.E0;
        this.e = new nm(jx0Var2, jx0Var2, 0);
        this.f = new x6g(vd0.d);
        this.g = new x6g(vd0.e);
        kx0 kx0Var = ndb.y;
        kx0 kx0Var2 = ndb.X;
        this.v = new om(kx0Var, kx0Var2, 0);
        this.w = new om(kx0Var2, kx0Var, 0);
        this.x = new y6g(kx0Var, iD0);
        this.y = new y6g(kx0Var2, iD0);
    }

    @Override // defpackage.lla
    public final long x(a77 a77Var, long j, cv7 cv7Var, long j2) {
        a77 a77Var2;
        char c;
        long j3;
        int iA;
        e89 e89Var = this.b;
        if (e89Var != null) {
            e89Var.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + this.a)) & 4294967295L);
        int i = (int) (j5 >> 32);
        int i2 = 0;
        List listI = t72.I(this.d, this.e, ((int) (a77Var.a() >> 32)) < i / 2 ? this.f : this.g);
        int size = listI.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                a77Var2 = a77Var;
                c = c2;
                j3 = j4;
                iA = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i4 = (int) (j2 >> c);
            int i5 = size;
            int i6 = i3;
            a77Var2 = a77Var;
            List list = listI;
            iA = ((is8) listI.get(i3)).a(a77Var2, j5, i4, cv7Var);
            if (i6 == list.size() - 1 || (iA >= 0 && i4 + iA <= i)) {
                break;
            }
            i3 = i6 + 1;
            listI = list;
            size = i5;
            c2 = c;
            j4 = j3;
        }
        int i7 = (int) (j5 & j3);
        List listI2 = t72.I(this.v, this.w, ((int) (a77Var2.a() & j3)) < i7 / 2 ? this.x : this.y);
        int size2 = listI2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = (int) (j2 & j3);
            int iA2 = ((js8) listI2.get(i8)).a(a77Var2, j5, i9);
            if (i8 == listI2.size() - 1 || (iA2 >= 0 && i9 + iA2 <= i7)) {
                i2 = iA2;
                break;
            }
        }
        long j6 = (((long) iA) << c) | (((long) i2) & j3);
        this.c.z(a77Var2, n16.n(j6, j2));
        return j6;
    }
}
