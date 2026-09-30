package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ay9 {
    public static final zx9 a;
    public static final qx9 b;

    static {
        zx9 zx9Var = new zx9(0);
        a = zx9Var;
        b = new qx9(0, 0, 0, 0, 0, 0, gec.v, new kx7(2), jgb.k(nu4.a), zx9Var, ll2.b(0, 0, 0, 0, 15));
    }

    public static final long a(qx9 qx9Var, int i) {
        int i2 = qx9Var.c;
        int i3 = qx9Var.b;
        long j = ((long) i) * ((long) (i2 + i3));
        int i4 = -qx9Var.f;
        int i5 = qx9Var.d;
        long j2 = ((j + ((long) i4)) + ((long) i5)) - ((long) i2);
        int i6 = (int) (qx9Var.e == ks9.b ? qx9Var.i() >> 32 : qx9Var.i() & 4294967295L);
        long jO = j2 - ((long) (i6 - mh3.o(qx9Var.n.g(i6, i3, i4, i5), 0, i6)));
        if (jO < 0) {
            return 0L;
        }
        return jO;
    }

    public static final cs3 b(int i, int i2, int i3, x16 x16Var, l46 l46Var) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        vea veaVar = cs3.H;
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && l46Var.e(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && l46Var.d(0.0f)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ 384) <= 256 || !l46Var.g(x16Var)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objR = l46Var.R();
        if (z3 || objR == sf2.a) {
            objR = new m83(i, 4, x16Var);
            l46Var.p0(objR);
        }
        cs3 cs3Var = (cs3) vfh.J(objArr, veaVar, (x16) objR, l46Var, 0);
        cs3Var.G.setValue(x16Var);
        return cs3Var;
    }
}
