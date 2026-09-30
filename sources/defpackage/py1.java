package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class py1 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy9 b;
    public final /* synthetic */ String c;

    public /* synthetic */ py1(fy9 fy9Var, String str, int i) {
        this.a = i;
        this.b = fy9Var;
        this.c = str;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    FillElement fillElement = b.c;
                    c92 c92VarA = a92.a(new uc0(8.0f, false, new jv2(2, ndb.z)), ndb.Z, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, fillElement);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    fy9 fy9Var = this.b;
                    if (fy9Var == null) {
                        l46Var.f0(-1020210150);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1020210149);
                        feg.j(fy9Var, null, b.l(g09Var, 36.0f), null, null, 0.0f, null, l46Var, 440, 120);
                        l46Var.r(false);
                    }
                    jme jmeVar = new jme(3);
                    mue mueVar = pue.a;
                    nte.b(this.c, null, 0L, 0L, null, null, 0L, null, jmeVar, 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130046);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            default:
                u7c u7cVar = (u7c) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                u7cVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(u7cVar) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                    return wefVar;
                }
                gu6.b(this.b, null, b.l(g09Var, 16.0f), 0L, l46Var2, 440, 8);
                j09 j09VarA = u7cVar.a(g09Var, 1.0f, true);
                ar5 ar5Var = ar5.c;
                int iOrdinal = ((e8b) l46Var2.k(l8b.a)).C.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        ap.c();
                        return null;
                    }
                    ar5Var = ar5.d;
                }
                nte.b(this.c, j09VarA, 0L, 0L, ar5Var, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 261052);
                return wefVar;
        }
    }
}
