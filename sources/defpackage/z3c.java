package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z3c {
    public static final pr4 a = new pr4(0, new ead(2));

    public static final void a(j09 j09Var, o4c o4cVar, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-1671508753);
        int i2 = (l46Var.g(j09Var) ? 4 : 2) | i | (l46Var.g(o4cVar) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            b(af1.b0(-195697503, new y3c(j09Var, o4cVar, dd2Var), l46Var), l46Var, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new y3c(j09Var, o4cVar, dd2Var, i);
        }
    }

    public static final void b(dd2 dd2Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(716390213);
        if (!l46Var.W(i & 1, (i & 3) != 2)) {
            l46Var2 = l46Var;
            l46Var2.Z();
        } else if (((Boolean) l46Var.k(a)).booleanValue()) {
            l46Var2 = l46Var;
            l46Var2.f0(289006828);
            dd2Var.z(l46Var2, 6);
            l46Var2.r(false);
        } else {
            l46Var.f0(288492941);
            l46Var2 = l46Var;
            t4c.b(new b3b(28), ee2.a, y.J0, ee2.b, af1.b0(-1491968376, new qx1(dd2Var, 19), l46Var), l46Var2, 27696);
            l46Var2.r(false);
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i, 20);
        }
    }
}
