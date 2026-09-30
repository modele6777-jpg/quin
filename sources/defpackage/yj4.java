package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj4 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;

    public /* synthetic */ yj4(a26 a26Var, int i) {
        this.a = i;
        this.b = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                a26Var.d(new hl9(((oia) obj2).c));
                break;
            default:
                iwa iwaVar = (iwa) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? l46Var.g(iwaVar) : l46Var.i(iwaVar) ? 4 : 2;
                }
                int i2 = iIntValue;
                int i3 = 18;
                if (!l46Var.W(i2 & 1, (i2 & 19) != 18)) {
                    l46Var.Z();
                } else {
                    g09 g09Var = g09.a;
                    if (iwaVar != null) {
                        l46Var.f0(-1116622507);
                        jx0 jx0Var = ndb.Z;
                        c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), jx0Var, l46Var, 54);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ = m93.J(l46Var, g09Var);
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
                        gh6 gh6VarW0 = kj0.w0(l46Var);
                        j09 j09VarB = b.b(0.0f, 56.0f, ynb.b0(16.0f, 0.0f, b.c(new mq6(jx0Var), 1.0f), 2), 1);
                        y6c y6cVarA = a7c.a();
                        pr4 pr4Var = o82.a;
                        q11 q11VarB = x57.b(((m82) l46Var.k(pr4Var)).a, 1.0f);
                        bx9 bx9Var = v51.a;
                        u51 u51VarG = v51.g(((e8b) l46Var.k(l8b.a)).j, ((m82) l46Var.k(pr4Var)).a, l46Var, 12);
                        boolean zI = l46Var.i(gh6VarW0) | l46Var.g(a26Var) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && l46Var.i(iwaVar)));
                        Object objR = l46Var.R();
                        if (zI || objR == sf2.a) {
                            objR = new n25(gh6VarW0, a26Var, iwaVar, 12);
                            l46Var.p0(objR);
                        }
                        cgg.k((x16) objR, j09VarB, false, y6cVarA, u51VarG, q11VarB, null, af1.b0(-236557417, new g20(i3, iwaVar), l46Var), l46Var, 805306368, 420);
                        l46Var.r(true);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1116933034);
                        bzd.k(b.d(b.c(g09Var, 1.0f), 124.0f), true, 0L, bxa.a, l46Var, 27702, 4);
                        l46Var.r(false);
                    }
                }
                break;
        }
        return wefVar;
    }
}
