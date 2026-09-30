package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zze implements l26 {
    public final /* synthetic */ float a;
    public final /* synthetic */ long b;
    public final /* synthetic */ dd2 c;

    public zze(float f, long j, dd2 dd2Var) {
        this.a = f;
        this.b = j;
        this.c = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            bx9 bx9Var = a0f.a;
            j09 j09VarY = ynb.Y(b.o(g09.a, 40.0f, 24.0f, this.a, 8), a0f.a);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarY);
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
            mh3.b(new e1b[]{ib8.f(this.b, em2.a), nte.a.a(r9f.a(z7f.j, l46Var))}, this.c, l46Var, 8);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
