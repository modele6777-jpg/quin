package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fu6 {
    public static final cq5 a;

    static {
        List listAsList = Arrays.asList(urg.f(R.font.never_mind_regular, null, 14), urg.f(R.font.never_mind_bold, ar5.z, 12));
        listAsList.getClass();
        a = new cq5(listAsList);
    }

    public static final void a(boolean z, yi yiVar, l46 l46Var, int i) {
        int i2;
        yi yiVar2;
        l46Var.h0(-1125128156);
        if ((i & 6) == 0) {
            i2 = (l46Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            yiVar2 = ndb.f;
            j09 j09VarL = b.l(g09.a, 48.0f);
            xn8 xn8VarC = s21.c(yiVar2, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarL);
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
            cn1.f(Boolean.valueOf(z), null, b21.T(150, 0, null, 6), "CheckIcon", vd0.g, l46Var, (i3 & 14) | 28032, 2);
            l46Var.r(true);
        } else {
            l46Var.Z();
            yiVar2 = yiVar;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iv1(i, i4, yiVar2, z);
        }
    }

    public static final void b(int i, int i2, long j, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(250191304);
        int i3 = (((i2 & 1) == 0 && l46Var.f(j)) ? 4 : 2) | i;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            } else if ((i2 & 1) != 0) {
                j = ((m82) l46Var.k(o82.a)).q;
                i3 &= -15;
            }
            long j2 = j;
            l46Var.s();
            l46Var2 = l46Var;
            c(null, j2, false, 0L, l46Var2, ((i3 << 6) & 896) | 6);
            j = j2;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new v76(i, i2, j);
        }
    }

    public static final void c(j09 j09Var, long j, boolean z, long j2, l46 l46Var, int i) {
        int i2;
        j09 j09Var2;
        boolean z2;
        long j3;
        int i3;
        j09 j09Var3;
        boolean z3;
        long j4;
        l46Var.h0(-1143182524);
        if ((i & 6) == 0) {
            i2 = (l46Var.g("\ue07e") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= l46Var.f(j) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = i4 | 3072;
        if ((i & 24576) == 0) {
            i5 = i4 | 11264;
        }
        if (l46Var.W(i5 & 1, (i5 & 9363) != 9362)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                long j5 = ((mue) l46Var.k(nte.a)).a.b;
                i3 = i5 & (-57345);
                j09Var3 = g09.a;
                z3 = true;
                j4 = j5;
            } else {
                l46Var.Z();
                i3 = i5 & (-57345);
                j09Var3 = j09Var;
                z3 = z;
                j4 = j2;
            }
            int i6 = i3;
            l46Var.s();
            long j6 = j4;
            nte.b("\ue07e", pa7.p(j09Var3, ((Number) vx.b(z3 ? 1.0f : 0.5f, null, "FontIconAlpha", null, l46Var, 3072, 22).getValue()).floatValue()), j, j6, null, a, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, (i6 & 14) | 12582912 | (i6 & 896), 0, 261992);
            j3 = j6;
            z2 = z3;
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z2 = z;
            j3 = j2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eu6(j09Var2, j, z2, j3, i);
        }
    }
}
