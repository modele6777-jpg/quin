package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.material3.c;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wce implements l26 {
    public final /* synthetic */ j09 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r17 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ dd2 f;

    public wce(j09 j09Var, boolean z, c cVar, boolean z2, x16 x16Var, dd2 dd2Var) {
        this.a = j09Var;
        this.b = z;
        this.c = cVar;
        this.d = z2;
        this.e = x16Var;
        this.f = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            j09 j09VarC = b.c(n16.V(this.a, this.b, null, this.c, this.d, new i5c(4), this.e), 1.0f);
            c92 c92VarA = a92.a(xc0.e, ndb.Z, l46Var, 54);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
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
            ks0.q(6, this.f, e92.a, l46Var, true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
