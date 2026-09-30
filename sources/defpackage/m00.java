package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m00 {
    public static final iy9 a;

    static {
        pu4 pu4Var = pu4.a;
        a = new iy9(pu4Var, pu4Var);
    }

    public static final void a(k00 k00Var, List list, l46 l46Var, int i) {
        l46Var.h0(-1794596951);
        int i2 = (i & 6) == 0 ? (l46Var.g(k00Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= l46Var.i(list) ? 32 : 16;
        }
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j00 j00Var = (j00) list.get(i4);
                n26 n26Var = (n26) j00Var.a;
                int i5 = j00Var.b;
                int i6 = j00Var.c;
                Object objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = mr.d;
                    l46Var.p0(objR);
                }
                xn8 xn8Var = (xn8) objR;
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, g09.a);
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
                n26Var.m(k00Var.subSequence(i5, i6).b, l46Var, 0);
                l46Var.r(true);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(k00Var, list, i, i3);
        }
    }
}
