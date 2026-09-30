package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class if3 implements l26 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ke3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public if3(String str, ke3 ke3Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = ke3Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            float f = i7h.j;
            float f2 = i7h.h;
            g09 g09Var = g09.a;
            j09 j09VarI = b.i(g09Var, f, f2);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarI);
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
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new i73(13);
                l46Var.p0(objR);
            }
            j09 j09VarA = vwc.a(g09Var, (a26) objR);
            ke3 ke3Var = this.b;
            long j = ke3Var.o;
            boolean z = this.d;
            boolean z2 = this.e;
            if (z && z2) {
                j = ke3Var.p;
            } else if (z && !z2) {
                j = ke3Var.q;
            } else if (this.c && z2) {
                j = ke3Var.t;
            } else if (z2) {
                j = ke3Var.n;
            }
            long j2 = j;
            l46Var.f0(-969417610);
            h0e h0eVarA = qkd.a(j2, vpf.Z(t39.c, l46Var), null, l46Var, 0, 12);
            l46Var.r(false);
            nte.b(this.a, j09VarA, ((y72) h0eVarA.getValue()).a, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 261112);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
