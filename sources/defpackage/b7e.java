package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b7e {
    public static final long a = abg.c(268435455);
    public static final long b = abg.c(352321535);

    public static final void a(boolean z, x16 x16Var, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(1530622211);
        int i2 = (l46Var.h(z) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            o7c.b(af1.b0(339145944, new mb0(x16Var, z, 12), l46Var), l46Var, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb0(z, x16Var, i, 13);
        }
    }

    public static final void b(boolean z, x16 x16Var, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(-1768510104);
        int i2 = (l46Var.h(z) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(fcb.class), null, null);
                l46Var.p0(objR);
            }
            fcb fcbVar = (fcb) objR;
            gh6 gh6VarW0 = kj0.w0(l46Var);
            boolean zI = l46Var.i(gh6VarW0) | l46Var.i(fcbVar) | ((i2 & 14) == 4);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new a7e(gh6VarW0, fcbVar, z, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, wef.a);
            a(z, x16Var, l46Var, i2 & 126);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb0(z, x16Var, i, 11);
        }
    }

    public static final void c(int i, l46 l46Var, boolean z) {
        l46Var.h0(829695709);
        int i2 = (l46Var.h(z) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            y6c y6cVarB = a7c.b(z ? 4.0f : 32.0f);
            long j = a;
            g09 g09Var = g09.a;
            j09 j09VarZ = ynb.Z(db6.w(tm7.o(g09Var, j, y6cVarB), 1.0f, b, y6cVarB), 24.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarZ);
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
            feg.j(od4.A(R.drawable.qr_code_wecom_member, 0, l46Var), null, oa7.E(b.l(g09Var, 180.0f), a7c.b(z ? 0.0f : 16.0f)), null, an2.b, 0.0f, null, l46Var, 24632, 104);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ci1(z, i, 13);
        }
    }

    public static final void d(int i, l46 l46Var, boolean z) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(421370224);
        int i2 = i | (l46Var.h(z) ? 4 : 2);
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            y6c y6cVarB = a7c.b(14.0f);
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(tm7.o(oa7.E(g09Var, y6cVarB), z ? y72.j : b, g21.f), 16.0f, 10.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            feg.j(od4.A(R.drawable.ic_wecom_hint_bulb, 0, l46Var2), null, b.l(g09Var, 20.0f), null, null, 0.0f, null, l46Var2, 440, 120);
            nte.b(afc.q(R.string.paywall_congratulation_wecom_hint, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var2.k(l8b.a)).r, w6c.l(15), ar5.b, null, ((y8b) l46Var2.k(x8b.a)).b, 0L, 0L, 0, 0, w6c.l(24), null, null, 16646104), l46Var, 0, 0, 131070);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ci1(z, i, 12);
        }
    }

    public static final v4d e(Context context, int i) {
        Drawable drawableT = x57.T(context, i);
        if (drawableT == null) {
            return null;
        }
        return new v4d(new zn4(drawableT, drawableT.getIntrinsicWidth(), drawableT.getIntrinsicHeight()), false, true);
    }
}
