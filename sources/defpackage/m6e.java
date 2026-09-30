package defpackage;

import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m6e {
    public static final pzd a = new pzd(1);
    public static final Object b = new Object();

    public static final void a(j09 j09Var, l26 l26Var, l46 l46Var, int i, int i2) {
        int i3;
        l46Var.h0(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(l26Var) ? 32 : 16;
        }
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                j09Var = g09.a;
            }
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new q6e(af8.K0);
                l46Var.p0(objR);
            }
            b((q6e) objR, j09Var, l26Var, l46Var, (i3 << 3) & 1008);
        } else {
            l46Var.Z();
        }
        j09 j09Var2 = j09Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new or1(j09Var2, l26Var, i, i2, 11);
        }
    }

    public static final void b(q6e q6eVar, j09 j09Var, l26 l26Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-511989831);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (l46Var.i(q6eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(l46Var.T);
            j46 j46VarL = an1.L(l46Var);
            j09 j09VarJ = m93.J(l46Var, j09Var);
            u8a u8aVarM = l46Var.m();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(q6eVar.c, l46Var, q6eVar);
            dec.l(q6eVar.d, l46Var, j46VarL);
            dec.l(q6eVar.e, l46Var, l26Var);
            lf2.q.getClass();
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            l46Var.r(true);
            if (l46Var.F()) {
                l46Var.f0(-1259187287);
                l46Var.r(false);
            } else {
                l46Var.f0(-1259245908);
                boolean zI = l46Var.i(q6eVar);
                Object objR = l46Var.R();
                if (zI || objR == sf2.a) {
                    objR = new h2e(i3, q6eVar);
                    l46Var.p0(objR);
                }
                af1.u((x16) objR, l46Var);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, q6eVar, j09Var, l26Var, 19);
        }
    }
}
