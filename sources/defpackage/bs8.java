package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bs8 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ dd2 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public bs8(dd2 dd2Var, dd2 dd2Var2, dd2 dd2Var3) {
        this.b = dd2Var;
        this.c = dd2Var2;
        this.d = dd2Var3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        Object obj3 = this.d;
        dd2 dd2Var = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarD0 = mh3.d0(urg.T(ynb.b0(0.0f, 8.0f, (j09) obj4, 1)), (ghc) obj3, false, 14);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                    int iW = an1.w(l46Var);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarD0);
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
                    ks0.q(6, dd2Var, e92.a, l46Var, true);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                dd2 dd2Var2 = (dd2) obj3;
                dd2 dd2Var3 = (dd2) obj4;
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    boolean zG = l46Var2.g(dd2Var) | l46Var2.g(dd2Var3) | l46Var2.g(dd2Var2);
                    Object objR = l46Var2.R();
                    if (zG || objR == sf2.a) {
                        objR = new o7b(dd2Var, dd2Var3, dd2Var2, 13);
                        l46Var2.p0(objR);
                    }
                    m6e.a(j09VarC, (l26) objR, l46Var2, 6, 0);
                }
                break;
            default:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    j09 j09VarU = m93.u(g09Var, new kt3(5, (n3f) obj4));
                    c0f c0fVar = (c0f) obj3;
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iW2 = an1.w(l46Var3);
                    u8a u8aVarM2 = l46Var3.m();
                    j09 j09VarJ2 = m93.J(l46Var3, j09VarU);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, xn8VarC);
                    dec.l(hj6.y, l46Var3, u8aVarM2);
                    he2 he2Var2 = hj6.X;
                    if (l46Var3.S || !pa7.t(l46Var3.R(), Integer.valueOf(iW2))) {
                        tec.r(iW2, l46Var3, iW2, he2Var2);
                    }
                    dec.l(hj6.x, l46Var3, j09VarJ2);
                    dd2Var.m(c0fVar, l46Var3, 6);
                    l46Var3.r(true);
                }
                break;
        }
        return wefVar;
    }

    public bs8(j09 j09Var, ghc ghcVar, dd2 dd2Var) {
        this.c = j09Var;
        this.d = ghcVar;
        this.b = dd2Var;
    }

    public bs8(n3f n3fVar, dd2 dd2Var, c0f c0fVar) {
        this.c = n3fVar;
        this.b = dd2Var;
        this.d = c0fVar;
    }
}
