package defpackage;

import ai.askquin.R;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aoc implements goe {
    public final use a;

    public /* synthetic */ aoc(use useVar) {
        this.a = useVar;
    }

    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(1960483413);
        int i2 = i | (l46Var2.g(this) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, g09.a);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            if (this.a.d().c.length() == 0) {
                l46Var2.f0(815988150);
                String strQ = afc.q(R.string.seasonal_question_hint, l46Var2);
                mue mueVar = pue.a;
                nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var2), l46Var, 0, 0, 131066);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(816206855);
                l46Var2.r(false);
            }
            tec.q(6, dd2Var, l46Var2, true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(this, dd2Var, i, 3);
        }
    }
}
