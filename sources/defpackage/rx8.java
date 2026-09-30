package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rx8 {
    public static final long a = abg.d(4281610827L);

    public static final void a(int i, dd2 dd2Var, l46 l46Var, boolean z) {
        d00 d00Var;
        ojb ojbVarV;
        l46Var.h0(-1729579738);
        int i2 = 2;
        int i3 = (l46Var.h(z) ? 4 : 2) | i;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            pr4 pr4Var = l8b.a;
            e8b e8bVar = (e8b) l46Var.k(pr4Var);
            if (z && k8b.e(e8bVar)) {
                l46Var.f0(812862844);
                l46Var.r(false);
                long j = y72.e;
                long j2 = e8bVar.a;
                long j3 = e8bVar.b;
                long j4 = e8bVar.c;
                long j5 = e8bVar.d;
                long j6 = e8bVar.e;
                long j7 = e8bVar.f;
                long j8 = e8bVar.g;
                long j9 = e8bVar.h;
                long j10 = e8bVar.k;
                long j11 = e8bVar.l;
                long j12 = e8bVar.m;
                long j13 = e8bVar.n;
                long j14 = e8bVar.o;
                long j15 = e8bVar.p;
                long j16 = e8bVar.q;
                long j17 = e8bVar.r;
                long j18 = e8bVar.s;
                long j19 = e8bVar.t;
                long j20 = e8bVar.v;
                long j21 = e8bVar.w;
                long j22 = e8bVar.x;
                long j23 = e8bVar.y;
                long j24 = e8bVar.z;
                long j25 = e8bVar.A;
                long j26 = e8bVar.B;
                mfc mfcVar = e8bVar.C;
                mfcVar.getClass();
                long j27 = a;
                mh3.a(pr4Var.a(new e8b(j2, j3, j4, j5, j6, j7, j8, j9, j27, j, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j27, j20, j21, j22, j23, j24, j25, j26, mfcVar)), af1.b0(1716701670, new qx1(dd2Var, 10), l46Var), l46Var, 56);
            } else {
                l46Var.f0(812834014);
                dd2Var.z(l46Var, 6);
                l46Var.r(false);
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    d00Var = new d00(z, dd2Var, i, i2);
                }
            }
            ojbVarV.d = d00Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            d00Var = new d00(z, dd2Var, i, 3);
            ojbVarV.d = d00Var;
        }
    }
}
