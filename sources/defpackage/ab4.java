package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ab4 implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ ab4(int i, String str) {
        this.c = i;
        this.b = str;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarQ = b.q(0.0f, 360.0f, b.c(b.d(g09Var, 48.0f), 1.0f), 1);
                    t7c t7cVarA = s7c.a(new uc0(8.0f, true, new jv2(3, ndb.Z)), ndb.z, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarQ);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, t7cVarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    j09 j09VarL = b.l(g09Var, 24.0f);
                    fy9 fy9VarA = od4.A(i2, 0, l46Var);
                    String str = this.b;
                    gu6.b(fy9VarA, str, j09VarL, 0L, l46Var, 392, 8);
                    nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
                    l46Var.r(true);
                }
                break;
            default:
                p79 p79Var = (p79) obj;
                hs3 hs3Var = (hs3) obj2;
                hs3 hs3Var2 = (hs3) obj3;
                p79Var.getClass();
                hs3Var.getClass();
                hs3Var2.getClass();
                p79Var.f(hs3Var.a, Boolean.TRUE);
                String str2 = this.b;
                if (str2 != null && i2 <= 2) {
                    p79Var.f(hs3Var2.a, str2);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ab4(String str, int i) {
        this.b = str;
        this.c = i;
    }
}
