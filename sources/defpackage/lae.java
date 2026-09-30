package defpackage;

import androidx.compose.foundation.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lae implements l26 {
    public final /* synthetic */ j09 a;
    public final /* synthetic */ x4d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ q11 e;
    public final /* synthetic */ t69 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ x16 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ dd2 x;

    public lae(j09 j09Var, x4d x4dVar, long j, float f, q11 q11Var, t69 t69Var, boolean z, x16 x16Var, float f2, dd2 dd2Var) {
        this.a = j09Var;
        this.b = x4dVar;
        this.c = j;
        this.d = f;
        this.e = q11Var;
        this.f = t69Var;
        this.g = z;
        this.v = x16Var;
        this.w = f2;
        this.x = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            oq6 oq6Var = p77.a;
            j09 j09VarP = xo1.p(b.b(nae.d(this.a.D(xv8.a), this.b, nae.e(this.c, this.d, l46Var), this.e, ((sw3) l46Var.k(zg2.h)).p0(this.w)), this.f, d5c.a(0.0f, 7, 0L, false), this.g, null, this.v, 24));
            xn8 xn8VarC = s21.c(ndb.b, true);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarP);
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
            tec.q(0, this.x, l46Var, true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
