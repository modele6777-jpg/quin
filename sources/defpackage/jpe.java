package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jpe implements l26 {
    public final /* synthetic */ h0e a;
    public final /* synthetic */ long b;
    public final /* synthetic */ mue c;
    public final /* synthetic */ l26 d;

    public jpe(k3f k3fVar, long j, mue mueVar, l26 l26Var) {
        this.a = k3fVar;
        this.b = j;
        this.c = mueVar;
        this.d = l26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            h0e h0eVar = this.a;
            boolean zG = l46Var.g(h0eVar);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new wh1(14, h0eVar);
                l46Var.p0(objR);
            }
            j09 j09VarX = bzd.x(g09.a, (a26) objR);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarX);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            iec.b(this.b, this.c, this.d, l46Var, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
