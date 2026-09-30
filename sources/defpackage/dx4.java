package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dx4 implements r37 {
    public static final ssg a;
    public static final ssg b;
    public static final ssg c;
    public static final ssg d;

    static {
        mjg mjgVarE = ssg.E();
        mjgVarE.K('0', '9');
        mjgVarE.K('A', 'F');
        mjgVarE.K('a', 'f');
        a = new ssg(mjgVarE);
        mjg mjgVarE2 = ssg.E();
        mjgVarE2.K('0', '9');
        b = new ssg(mjgVarE2);
        mjg mjgVarE3 = ssg.E();
        mjgVarE3.K('A', 'Z');
        mjgVarE3.K('a', 'z');
        ssg ssgVar = new ssg(mjgVarE3);
        c = ssgVar;
        mjg mjgVarL = ssgVar.L();
        mjgVarL.K('0', '9');
        d = new ssg(mjgVarL);
    }

    public static fz3 b(xg3 xg3Var, una unaVar) {
        return new fz3(28, new ime(jr6.a(xg3Var.e(unaVar, xg3Var.n()).e())), xg3Var.n());
    }

    @Override // defpackage.r37
    public final fz3 a(x37 x37Var) {
        xg3 xg3Var = x37Var.y;
        una unaVarN = xg3Var.n();
        xg3Var.j();
        char cM = xg3Var.m();
        if (cM != '#') {
            if (!((BitSet) c.b).get(cM)) {
                return null;
            }
            xg3Var.g(d);
            if (xg3Var.k(';')) {
                return b(xg3Var, unaVarN);
            }
            return null;
        }
        xg3Var.j();
        if (xg3Var.k('x') || xg3Var.k('X')) {
            int iG = xg3Var.g(a);
            if (1 > iG || iG > 6 || !xg3Var.k(';')) {
                return null;
            }
            return b(xg3Var, unaVarN);
        }
        int iG2 = xg3Var.g(b);
        if (1 > iG2 || iG2 > 7 || !xg3Var.k(';')) {
            return null;
        }
        return b(xg3Var, unaVarN);
    }
}
