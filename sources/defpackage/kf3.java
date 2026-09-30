package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kf3 implements o26 {
    public final /* synthetic */ j91 a;
    public final /* synthetic */ n91 b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ c91 d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ ne3 f;
    public final /* synthetic */ euc g;
    public final /* synthetic */ ke3 v;

    public kf3(j91 j91Var, n91 n91Var, a26 a26Var, c91 c91Var, Long l, ne3 ne3Var, euc eucVar, ke3 ke3Var) {
        this.a = j91Var;
        this.b = n91Var;
        this.c = a26Var;
        this.d = c91Var;
        this.e = l;
        this.f = ne3Var;
        this.g = eucVar;
        this.v = ke3Var;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mx7 mx7Var = (mx7) obj;
        int iIntValue = ((Number) obj2).intValue();
        l46 l46Var = (l46) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (l46Var.g(mx7Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= l46Var.e(iIntValue) ? 32 : 16;
        }
        if (l46Var.W(i & 1, (i & 147) != 146)) {
            j91 j91Var = this.a;
            l91 l91Var = (l91) j91Var;
            l91Var.getClass();
            n91 n91VarE = this.b;
            if (iIntValue > 0) {
                n91VarE = l91Var.e(Instant.ofEpochMilli(n91VarE.e).atZone(l91.e).toLocalDate().plusMonths(iIntValue));
            }
            j09 j09VarB = mx7.b(mx7Var);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB);
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
            vf3.i(n91VarE, this.c, this.d.d, this.e, this.f, this.g, this.v, j91Var.a, l46Var, 221184);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
