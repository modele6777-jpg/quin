package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb5 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ use b;

    public /* synthetic */ rb5(use useVar, int i) {
        this.a = i;
        this.b = useVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    cn1.j(b.c(g09Var, 1.0f), this.b, null, null, 0L, null, null, null, null, null, null, null, null, false, 0.0f, 0.0f, l46Var, 6, 0, 65532);
                }
                break;
            default:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarB0 = ynb.b0(24.0f, 0.0f, eb3.E(ynb.Y(b.c, xw9Var), xw9Var), 2);
                    c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarB0);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, c92VarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    b21.b(0, l46Var2, null, afc.q(R.string.annual_nickname_title, l46Var2));
                    String strQ = afc.q(R.string.annual_profile_enter_tips, l46Var2);
                    mue mueVar = pue.a;
                    mue mueVarE = pue.e(l46Var2);
                    pr4 pr4Var = l8b.a;
                    nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarE, l46Var2, 0, 0, 131066);
                    o5c.f(l46Var2, b.d(g09Var, 12.0f));
                    j09 j09VarF = b.f(42.0f, 0.0f, b.q(108.0f, 0.0f, g09Var, 2), 2);
                    mue mueVarA = mue.a(pue.n(l46Var2), ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446);
                    dtd dtdVar = new dtd(((e8b) l46Var2.k(pr4Var)).r);
                    use useVar = this.b;
                    tv0.b(useVar, j09VarF, false, null, mueVarA, null, null, null, null, null, dtdVar, new kb6(23, useVar), null, l46Var2, 48, 0, 22492);
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }
}
