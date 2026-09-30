package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cr implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ j09 c;

    public /* synthetic */ cr(long j, j09 j09Var) {
        this.a = 0;
        this.b = j;
        this.c = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        j09 j09Var = this.c;
        wef wefVar = wef.a;
        long j = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09Var2 = this.c;
                    if (j == 9205357640488583168L) {
                        l46Var.f0(-1243644858);
                        fr.b(0, 0, l46Var, j09Var2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1244013944);
                        j09 j09VarJ = b.j(bj4.b(j), bj4.a(j), 0.0f, 0.0f, 12, j09Var2);
                        xn8 xn8VarC = s21.c(ndb.c, false);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, j09VarJ);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8VarC);
                        dec.l(hj6.y, l46Var, u8aVarM);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ2);
                        fr.b(0, 1, l46Var, null);
                        l46Var.r(true);
                        l46Var.r(false);
                    }
                }
                break;
            case 1:
                num.getClass();
                xj3.b(k99.P(1), j, l46Var, j09Var);
                break;
            case 2:
                num.getClass();
                t72.d(k99.P(49), j, l46Var, j09Var);
                break;
            default:
                num.getClass();
                h7d.b(k99.P(7), j, l46Var, j09Var);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ cr(long j, j09 j09Var, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.c = j09Var;
    }

    public /* synthetic */ cr(j09 j09Var, long j, int i) {
        this.a = 3;
        this.c = j09Var;
        this.b = j;
    }
}
