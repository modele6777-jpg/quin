package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w35 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;

    public /* synthetic */ w35(e89 e89Var, int i) {
        this.a = i;
        this.b = e89Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        wef wefVar = wef.a;
        e89 e89Var = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarZ = ynb.Z(g09Var, 16.0f);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarZ);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    pr4 pr4Var = r9f.a;
                    nte.b("Test Results:", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).h, l46Var, 6, 0, 131070);
                    nte.b((String) e89Var.getValue(), ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, g09Var), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).l, l46Var, 48, 0, 131068);
                    l46Var.r(true);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    Object objR = l46Var2.R();
                    if (objR == sf2.a) {
                        objR = new x08(e89Var, 9);
                        l46Var2.p0(objR);
                    }
                    bm8.h((x16) objR, null, false, null, null, eb3.c, l46Var2, 1572870, 62);
                }
                break;
            default:
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var3, 54);
                    int iHashCode2 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM2 = l46Var3.m();
                    g09 g09Var2 = g09.a;
                    j09 j09VarJ2 = m93.J(l46Var3, g09Var2);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, t7cVarA);
                    dec.l(hj6.y, l46Var3, u8aVarM2);
                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode2));
                    dec.k(l46Var3);
                    dec.l(hj6.x, l46Var3, j09VarJ2);
                    String strQ = afc.q(((Boolean) e89Var.getValue()).booleanValue() ? R.string.upgrade_paywall_show_fewer_plans : R.string.upgrade_paywall_view_all_plans, l46Var3);
                    mue mueVar = pue.a;
                    mue mueVarF = pue.f(l46Var3);
                    pr4 pr4Var2 = l8b.a;
                    nte.b(strQ, new jw7(1.0f, false), ((e8b) l46Var3.k(pr4Var2)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarF, l46Var3, 0, 0, 131064);
                    gu6.a(((Boolean) e89Var.getValue()).booleanValue() ? z5c.x() : if9.x(), null, b.l(g09Var2, 20.0f), ((e8b) l46Var3.k(pr4Var2)).q, l46Var3, 432, 0);
                    l46Var3.r(true);
                }
                break;
        }
        return wefVar;
    }
}
