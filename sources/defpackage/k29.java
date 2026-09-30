package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k29 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o29 b;

    public /* synthetic */ k29(o29 o29Var, int i) {
        this.a = i;
        this.b = o29Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        o29 o29Var = this.b;
        switch (i) {
            case 0:
                j09 j09Var = (j09) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j09Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(j09Var) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else {
                    if9.h(j09Var, o29Var, l46Var, (iIntValue & 14) | 64);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    bx9 bx9Var = new bx9(20.0f, 20.0f, 20.0f, 20.0f);
                    uc0 uc0Var = new uc0(12.0f, true, new qc0(0));
                    boolean zI = l46Var2.i(o29Var);
                    Object objR = l46Var2.R();
                    if (zI || objR == sf2.a) {
                        objR = new za6(29, o29Var);
                        l46Var2.p0(objR);
                    }
                    af1.t(j09VarC, null, bx9Var, uc0Var, null, null, false, null, (a26) objR, l46Var2, 24966, 490);
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    feg.o(afc.q(R.string.text_month_label, l46Var3), o29Var.d, null, 0.0f, 24.0f, l46Var3, 24576);
                }
                break;
            default:
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    l46Var4.Z();
                } else {
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var4, 0);
                    int iHashCode = Long.hashCode(l46Var4.T);
                    u8a u8aVarM = l46Var4.m();
                    j09 j09VarJ = m93.J(l46Var4, g09Var);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(LayoutNode.h1);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, c92VarA);
                    dec.l(hj6.y, l46Var4, u8aVarM);
                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ);
                    String str = o29Var.e;
                    mue mueVar = pue.a;
                    nte.b(str, null, ((e8b) l46Var4.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var4), l46Var4, 0, 0, 131066);
                    if (ca2.a.a()) {
                        l46Var4.f0(-375248592);
                        jgb.c(null, l46Var4, 6);
                        l46Var4.r(false);
                    } else {
                        l46Var4.f0(-375210152);
                        l46Var4.r(false);
                    }
                    l46Var4.r(true);
                }
                break;
        }
        return wefVar;
    }
}
