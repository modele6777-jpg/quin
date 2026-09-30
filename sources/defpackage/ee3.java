package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ee3 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;

    public /* synthetic */ ee3(e89 e89Var, int i) {
        this.a = i;
        this.b = e89Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var;
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.b;
        switch (i) {
            case 0:
                l46 l46Var2 = (l46) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!l46Var2.W(1 & iIntValue, (iIntValue & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    if (v4e.Q((CharSequence) e89Var.getValue())) {
                        l46Var = l46Var2;
                        l46Var.f0(-1548950640);
                    } else {
                        l46Var2.f0(-327061465);
                        nte.b((String) e89Var.getValue(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 262142);
                        l46Var = l46Var2;
                    }
                    l46Var.r(false);
                }
                break;
            default:
                l46 l46Var3 = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!l46Var3.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    Object objR = l46Var3.R();
                    if (objR == sf2.a) {
                        objR = new nd8(25);
                        l46Var3.p0(objR);
                    }
                    j09 j09VarB = vwc.b(g09.a, false, (a26) objR);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iW = an1.w(l46Var3);
                    u8a u8aVarM = l46Var3.m();
                    j09 j09VarJ = m93.J(l46Var3, j09VarB);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(LayoutNode.h1);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, xn8VarC);
                    dec.l(hj6.y, l46Var3, u8aVarM);
                    he2 he2Var = hj6.X;
                    if (l46Var3.S || !pa7.t(l46Var3.R(), Integer.valueOf(iW))) {
                        tec.r(iW, l46Var3, iW, he2Var);
                    }
                    dec.l(hj6.x, l46Var3, j09VarJ);
                    ((l26) e89Var.getValue()).z(l46Var3, 0);
                    l46Var3.r(true);
                }
                break;
        }
        return wefVar;
    }
}
