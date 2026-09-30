package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h01 {
    public static final f01 a = new f01();

    public static final void a(c4c c4cVar, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(917212583);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            f01 f01Var = q4c.c(q4c.b(c4cVar, l46Var)).d;
            f01Var.getClass();
            l46Var.f0(973002064);
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            wue wueVar = q4c.c(q4c.b(c4cVar, l46Var)).a;
            wueVar.getClass();
            float F = sw3Var.F(wueVar.a) / 2.0f;
            l46Var.r(false);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = mr.e;
                l46Var.p0(objR);
            }
            xn8 xn8Var = (xn8) objR;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            l46Var.f0(1403188091);
            f01Var.a(c4cVar, l46Var, i3);
            l46Var.r(false);
            tq.a(ynb.d0(0.0f, F, 0.0f, F, 5, g09Var), null, dd2Var, l46Var, (i2 << 3) & 896, 2);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(c4cVar, dd2Var, i, 5);
        }
    }
}
