package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qx8 {
    public static final y6c a = a7c.b(32.0f);
    public static final y6c b = a7c.b(12.0f);
    public static final y6c c = a7c.b(100.0f);
    public static final bx9 d = new bx9(24.0f, 4.0f, 24.0f, 4.0f);

    public static final void a(String str, ij ijVar, boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        str.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(128344547);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.i(ijVar) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            t72.b(x16Var3, new s84(false, false, 3), af1.b0(-1821027988, new px8(str, ijVar, z, x16Var, x16Var2, x16Var3), l46Var), l46Var, 438, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new px8(str, ijVar, z, x16Var, x16Var2, x16Var3, i, 1);
        }
    }

    public static final void b(String str, ij ijVar, boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        str.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(-136849170);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.i(ijVar) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var3) ? 131072 : 65536);
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            j09 j09VarA0 = ynb.a0(b.c, 12.0f, 24.0f);
            xn8 xn8VarC = s21.c(ndb.w, false);
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
            nae.a(androidx.compose.ui.platform.b.a(b.c(g09.a, 1.0f), "mixedUnlockDialog"), a, ((e8b) l46Var.k(l8b.a)).c, 0L, 0.0f, 0.0f, null, af1.b0(-1330992241, new px8(x16Var3, str, ijVar, z, x16Var, x16Var2), l46Var), l46Var, 12582966, 120);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new px8(str, ijVar, z, x16Var, x16Var2, x16Var3, i, 3);
        }
    }

    public static final void c(String str, ij ijVar, boolean z, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        String strI;
        l46 l46Var2 = l46Var;
        y02 y02Var = g21.f;
        l46Var2.h0(-1475081910);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.i(ijVar) ? 32 : 16) | (l46Var2.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        boolean z2 = false;
        if (l46Var2.W(i2 & 1, (i2 & 9363) != 9362)) {
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
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
            j09 j09VarA = androidx.compose.ui.platform.b.a(b.f(56.0f, 0.0f, b.c(g09Var, 1.0f), 2), "mixedUnlockAnnual");
            if (v4e.Q(str)) {
                strI = tec.i(l46Var2, 738502512, R.string.skin_detail_subscribe_yearly_unlock_all, l46Var2, false);
            } else {
                l46Var2.f0(738414255);
                strI = afc.r(R.string.mixed_annual_price, new Object[]{str}, l46Var2);
                l46Var2.r(false);
            }
            String strQ = afc.q(R.string.mixed_annual_benefits, l46Var2);
            mue mueVar = oue.a;
            mue mueVarG = pue.g(l46Var2);
            pr4 pr4Var = l8b.a;
            long j = ((e8b) l46Var2.k(pr4Var)).v;
            if (!z && !v4e.Q(str)) {
                z2 = true;
            }
            y6c y6cVar = c;
            y6cVar.getClass();
            x4d x4dVar = we6.e(l46Var2) ? y02Var : y6cVar;
            x4d x4dVar2 = y02Var;
            boolean z3 = false;
            bx9 bx9Var = d;
            c8b.i(j09VarA, strI, strQ, mueVarG, j, 4.0f, z2, x4dVar, null, false, bx9Var, null, x16Var, l46Var, 196614, ((i2 >> 3) & 896) | 6, 2816);
            o5c.f(l46Var, b.d(g09Var, 10.0f));
            gh6 gh6VarW0 = kj0.w0(l46Var);
            j09 j09VarA2 = androidx.compose.ui.platform.b.a(b.f(56.0f, 0.0f, b.c(g09Var, 1.0f), 2), "mixedUnlockAllDecks");
            boolean z4 = (z || ijVar == null || !ijVar.a()) ? false : true;
            if (!we6.e(l46Var)) {
                x4dVar2 = y6cVar;
            }
            q11 q11VarB = x57.b(((e8b) l46Var.k(pr4Var)).s, 1.0f);
            bx9 bx9Var2 = v51.a;
            u51 u51VarG = v51.g(0L, ((e8b) l46Var.k(pr4Var)).q, l46Var, 13);
            boolean zI = l46Var.i(gh6VarW0);
            if ((i2 & 57344) == 16384) {
                z3 = true;
            }
            boolean z5 = zI | z3;
            Object objR = l46Var.R();
            if (z5 || objR == sf2.a) {
                objR = new sj2(gh6VarW0, x16Var2, 2);
                l46Var.p0(objR);
            }
            cgg.k((x16) objR, j09VarA2, z4, x4dVar2, u51VarG, q11VarB, bx9Var, af1.b0(-2246862, new g20(19, ijVar), l46Var), l46Var, 817889328, 288);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l30(str, ijVar, z, x16Var, x16Var2, i, 6);
        }
    }
}
