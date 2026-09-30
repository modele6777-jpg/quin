package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v6d {
    static {
        y72.b(abg.d(4279440148L), 0.84f);
        y72.b(abg.d(4294967295L), 0.84f);
    }

    public static final void a(int i, l46 l46Var, j09 j09Var, String str) {
        String str2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(639098271);
        int i2 = i | (l46Var2.g(str) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            l46Var2.b0();
            if ((i & 1) != 0 && !l46Var2.C()) {
                l46Var2.Z();
            }
            l46Var2.s();
            c92 c92VarA = a92.a(new uc0(4.0f, false, new jv2(2, ndb.z)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            feg.j(od4.A(g21.S(l46Var2) ? R.drawable.share_top_logo_light : R.drawable.share_top_logo_dark, 0, l46Var2), afc.q(R.string.app_name, l46Var2), b.p(g09.a, 108.0f), null, an2.e, 0.0f, null, l46Var2, 24968, 104);
            mue mueVar = pue.a;
            str2 = str;
            nte.b(str2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, pue.j(l46Var), l46Var, (i2 >> 3) & 14, 24576, 114686);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            str2 = str;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p8(j09Var, str2, i, 11);
        }
    }
}
