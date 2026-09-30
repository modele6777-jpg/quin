package defpackage;

import ai.askquin.R;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class red {
    public static final x6f a = b21.T(300, 0, hs4.a, 2);

    public static final void a(dd2 dd2Var, l46 l46Var, int i) {
        dd2 dd2Var2;
        l46 l46Var2;
        l46Var.h0(1033612924);
        int i2 = 1;
        if (l46Var.W(i & 1, (i & 19) != 18)) {
            String strH = tgc.h(R.string.m3c_bottom_sheet_drag_handle_description, l46Var);
            mq6 mq6Var = new mq6(ndb.Z);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, mq6Var);
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
            dd2Var2 = dd2Var;
            l46Var2 = l46Var;
            a0f.b(xze.a(l46Var), af1.b0(2059851063, new nf3(strH, i2), l46Var), a0f.c(l46Var), null, false, dd2Var2, l46Var2, 100663344);
            l46Var2.r(true);
        } else {
            dd2Var2 = dd2Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var2, i, 29);
        }
    }
}
