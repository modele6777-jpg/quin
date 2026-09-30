package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v6f {
    public static final long a = abg.d(4282137664L);

    public static final void a(w6f w6fVar, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, j09 j09Var, l46 l46Var, int i) {
        j09 j09Var2;
        w6fVar.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        l46Var.h0(1491882251);
        int i2 = i | (l46Var.i(w6fVar) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | 196608;
        if (!l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            l46Var.Z();
            j09Var2 = j09Var;
        } else {
            if (w6fVar.b == d6f.a) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new u6f(w6fVar, x16Var, x16Var2, x16Var3, x16Var4, i);
                    return;
                }
                return;
            }
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(b.c(g09Var, 1.0f), 16.0f, 8.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            pr4 pr4Var = l8b.a;
            nae.a(null, k8b.f((e8b) l46Var.k(pr4Var)) ? a7c.b(30.0f) : a7c.b(16.0f), a, 0L, 0.0f, 0.0f, x57.b(((e8b) l46Var.k(pr4Var)).A, 0.5f), af1.b0(-1055399572, new u6f(w6fVar, x16Var2, x16Var, x16Var3, x16Var4), l46Var), l46Var, 12583296, 57);
            l46Var.r(true);
            j09Var2 = g09Var;
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new iq1(w6fVar, x16Var, x16Var2, x16Var3, x16Var4, j09Var2, i, 11);
        }
    }
}
