package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s21 {
    public static final w79 a = b(true);
    public static final w79 b = b(false);
    public static final u21 c = new u21(ndb.b, false);
    public static final mr d = mr.f;

    public static final void a(j09 j09Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-211209833);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(l46Var.T);
            j09 j09VarJ = m93.J(l46Var, j09Var);
            u8a u8aVarM = l46Var.m();
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, d);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb(j09Var, i, 3, b2);
        }
    }

    public static final w79 b(boolean z) {
        w79 w79Var = new w79(9);
        lx0 lx0Var = ndb.b;
        w79Var.m(lx0Var, new u21(lx0Var, z));
        lx0 lx0Var2 = ndb.c;
        w79Var.m(lx0Var2, new u21(lx0Var2, z));
        lx0 lx0Var3 = ndb.d;
        w79Var.m(lx0Var3, new u21(lx0Var3, z));
        lx0 lx0Var4 = ndb.e;
        w79Var.m(lx0Var4, new u21(lx0Var4, z));
        lx0 lx0Var5 = ndb.f;
        w79Var.m(lx0Var5, new u21(lx0Var5, z));
        lx0 lx0Var6 = ndb.g;
        w79Var.m(lx0Var6, new u21(lx0Var6, z));
        lx0 lx0Var7 = ndb.v;
        w79Var.m(lx0Var7, new u21(lx0Var7, z));
        lx0 lx0Var8 = ndb.w;
        w79Var.m(lx0Var8, new u21(lx0Var8, z));
        lx0 lx0Var9 = ndb.x;
        w79Var.m(lx0Var9, new u21(lx0Var9, z));
        return w79Var;
    }

    public static final xn8 c(yi yiVar, boolean z) {
        xn8 xn8Var = (xn8) (z ? a : b).g(yiVar);
        return xn8Var == null ? new u21(yiVar, z) : xn8Var;
    }

    public static final void d(bea beaVar, cea ceaVar, tn8 tn8Var, cv7 cv7Var, int i, int i2, yi yiVar) {
        yi yiVar2;
        Object objE = tn8Var.E();
        r21 r21Var = objE instanceof r21 ? (r21) objE : null;
        bea.j(beaVar, ceaVar, ((r21Var == null || (yiVar2 = r21Var.Z) == null) ? yiVar : yiVar2).a((((long) ceaVar.a) << 32) | (((long) ceaVar.b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), cv7Var));
    }
}
