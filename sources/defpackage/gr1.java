package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gr1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd2 b;

    public /* synthetic */ gr1(dd2 dd2Var, int i) {
        this.a = i;
        this.b = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        e92 e92Var = e92.a;
        sc0 sc0Var = xc0.c;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        ov7 ov7Var = LayoutNode.h1;
        dd2 dd2Var = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    c92 c92VarA = a92.a(sc0Var, ndb.Y, l46Var, 0);
                    int iW = an1.w(l46Var);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, g09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    he2 he2Var = hj6.X;
                    if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                        tec.r(iW, l46Var, iW, he2Var);
                    }
                    dec.l(hj6.x, l46Var, j09VarJ);
                    ks0.q(6, dd2Var, e92Var, l46Var, true);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    c92 c92VarA2 = a92.a(sc0Var, ndb.Y, l46Var2, 0);
                    int iW2 = an1.w(l46Var2);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, g09Var);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, c92VarA2);
                    dec.l(hj6.y, l46Var2, u8aVarM2);
                    he2 he2Var2 = hj6.X;
                    if (l46Var2.S || !pa7.t(l46Var2.R(), Integer.valueOf(iW2))) {
                        tec.r(iW2, l46Var2, iW2, he2Var2);
                    }
                    dec.l(hj6.x, l46Var2, j09VarJ2);
                    ks0.q(6, dd2Var, e92Var, l46Var2, true);
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 0.0f, 10, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iW3 = an1.w(l46Var3);
                    u8a u8aVarM3 = l46Var3.m();
                    j09 j09VarJ3 = m93.J(l46Var3, j09VarD0);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, xn8VarC);
                    dec.l(hj6.y, l46Var3, u8aVarM3);
                    he2 he2Var3 = hj6.X;
                    if (l46Var3.S || !pa7.t(l46Var3.R(), Integer.valueOf(iW3))) {
                        tec.r(iW3, l46Var3, iW3, he2Var3);
                    }
                    dec.l(hj6.x, l46Var3, j09VarJ3);
                    tec.q(0, dd2Var, l46Var3, true);
                }
                break;
            default:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    j09 j09VarE = vfh.E(g09Var, "Container");
                    xn8 xn8VarC2 = s21.c(ndb.b, true);
                    int iW4 = an1.w(l46Var4);
                    u8a u8aVarM4 = l46Var4.m();
                    j09 j09VarJ4 = m93.J(l46Var4, j09VarE);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, xn8VarC2);
                    dec.l(hj6.y, l46Var4, u8aVarM4);
                    he2 he2Var4 = hj6.X;
                    if (l46Var4.S || !pa7.t(l46Var4.R(), Integer.valueOf(iW4))) {
                        tec.r(iW4, l46Var4, iW4, he2Var4);
                    }
                    dec.l(hj6.x, l46Var4, j09VarJ4);
                    tec.q(0, dd2Var, l46Var4, true);
                }
                break;
        }
        return wefVar;
    }
}
