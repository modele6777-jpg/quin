package defpackage;

import ai.askquin.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m43 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d63 b;

    public /* synthetic */ m43(d63 d63Var, int i) {
        this.a = i;
        this.b = d63Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        d63 d63Var = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, g09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    boolean z = l46Var.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    j09 j09VarZ = ynb.Z(dj6.H(g09Var, l46Var, 1), 20.0f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarZ);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, xn8VarC);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    dj6.u(0, 2, l46Var, null, d63Var.e);
                    l46Var.r(true);
                    qn4.j(d63Var.h, d63Var.i, null, null, l46Var, 0, 12);
                    l46Var.r(true);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    String strR = afc.r(R.string.daily_fortune_choose_deck_title, new Object[]{afc.q(d63Var.c.getCard().getTitleRes(), l46Var2)}, l46Var2);
                    mue mueVar = pue.a;
                    nte.b(strR, b.a(ynb.b0(24.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 2), "daily_card_skin_picker_title"), ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, cr5.b(), 0L, null, 0, 0L, null, null, 16777183), l46Var2, 48, 0, 130040);
                }
                break;
        }
        return wefVar;
    }
}
