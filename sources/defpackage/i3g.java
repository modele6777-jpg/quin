package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i3g {
    public static final iy9[] a;

    static {
        long jD = abg.d(4285159865L);
        a = new iy9[]{new iy9(Float.valueOf(0.0f), new y72(y72.b(jD, 0.0f))), new iy9(Float.valueOf(0.0667f), new y72(y72.b(jD, 0.00830131f))), new iy9(Float.valueOf(0.1333f), new y72(y72.b(jD, 0.0340896f))), new iy9(Float.valueOf(0.2f), new y72(y72.b(jD, 0.0783935f))), new iy9(Float.valueOf(0.2667f), new y72(y72.b(jD, 0.141515f))), new iy9(Float.valueOf(0.3333f), new y72(y72.b(jD, 0.222504f))), new iy9(Float.valueOf(0.4f), new y72(y72.b(jD, 0.318609f))), new iy9(Float.valueOf(0.4667f), new y72(y72.b(jD, 0.424984f))), new iy9(Float.valueOf(0.5333f), new y72(y72.b(jD, 0.535016f))), new iy9(Float.valueOf(0.6f), new y72(y72.b(jD, 0.641391f))), new iy9(Float.valueOf(0.6667f), new y72(y72.b(jD, 0.737496f))), new iy9(Float.valueOf(0.7333f), new y72(y72.b(jD, 0.818485f))), new iy9(Float.valueOf(0.8f), new y72(y72.b(jD, 0.881607f))), new iy9(Float.valueOf(0.8667f), new y72(y72.b(jD, 0.92591f)))};
    }

    public static final void a(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(2022136936);
        int i2 = i | (l46Var2.g(j09Var) ? 4 : 2);
        if (!l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2.Z();
        } else if (k8b.f((e8b) l46Var2.k(l8b.a))) {
            l46Var2.f0(270256582);
            feg.j(od4.A(R.drawable.logo_quin_large, 0, l46Var2), afc.q(R.string.app_name, l46Var2), b.m(j09Var, 130.0f, 52.0f), null, an2.b, 0.0f, null, l46Var2, 24584, 104);
            l46Var2.r(false);
        } else {
            l46Var2.f0(270515835);
            nte.b(afc.q(R.string.app_name, l46Var2), j09Var, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var2.k(nte.a), 0L, w6c.l(64), new ar5(496), ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777177), l46Var, (i2 << 3) & 112, 0, 131068);
            l46Var2 = l46Var;
            l46Var2.r(false);
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new do6(i, 13, j09Var);
        }
    }

    public static final void b(int i, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(405709553);
        if (l46Var.W(i & 1, i != 0)) {
            boolean zE = k8b.e((e8b) l46Var.k(l8b.a));
            m8c m8cVar = an2.a;
            if (zE) {
                l46Var.f0(455403112);
                l46Var2 = l46Var;
                feg.j(od4.A(R.drawable.bg_onboarding_hello, 0, l46Var), null, b.c, null, m8cVar, 0.0f, null, l46Var2, 25016, 104);
                l46Var2.r(false);
            } else {
                l46Var2 = l46Var;
                l46Var2.f0(455615431);
                feg.j(od4.A(R.drawable.bg_welcome_greyscale, 0, l46Var2), null, b.c, ndb.w, m8cVar, 0.0f, null, l46Var2, 28088, 96);
                l46Var2.r(false);
            }
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cwe(i, 8);
        }
    }

    public static final void c(int i, l46 l46Var) {
        l46Var.h0(-739536255);
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            j09 j09VarA = d31.a.a(b.d(b.c(g09.a, 1.0f), 168.0f), ndb.w);
            iy9[] iy9VarArr = a;
            s21.a(tm7.n(j09VarA, gec.O((iy9[]) Arrays.copyOf(iy9VarArr, iy9VarArr.length), 0.0f, 0.0f, 14), null, 6), l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cwe(i, 9);
        }
    }

    public static final void d(int i, x16 x16Var, l46 l46Var, j09 j09Var, boolean z) {
        j09 j09Var2;
        l46Var.h0(1979011909);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i | (l46Var.h(z) ? 32 : 16) | 384;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            String strQ = afc.q(R.string.onboarding_welcome_login_entry, l46Var);
            mue mueVar = pue.a;
            mue mueVarC = pue.c(l46Var);
            long j = ((e8b) l46Var.k(l8b.a)).r;
            x4d x4dVarB = a7c.b(8.0f);
            if (we6.e(l46Var)) {
                x4dVarB = g21.f;
            }
            g09 g09Var = g09.a;
            nte.b(strQ, ynb.a0(androidx.compose.foundation.b.c(oa7.E(g09Var, x4dVarB), z, null, null, x16Var, 14), 16.0f, 8.0f), j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarC, l46Var, 0, 0, 131064);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ii3(x16Var, z, j09Var2, i);
        }
    }

    public static final void e(x16 x16Var, x16 x16Var2, x2g x2gVar, l46 l46Var, int i) {
        x2g x2gVar2;
        x16Var.getClass();
        l46Var.h0(244770058);
        int i2 = i | (l46Var.i(x16Var) ? 4 : 2) | (l46Var.i(x16Var2) ? 32 : 16) | 384;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            x2g x2gVar3 = x2g.a;
            d3g d3gVarT = vtb.t(x2gVar3, l46Var);
            e89 e89VarI = q1c.i(x16Var, l46Var);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                xfc xfcVar = new xfc(e89VarI, 18);
                x6f x6fVar = ap9.a;
                Object bq9Var = new bq9(new fn6(22, xfcVar));
                l46Var.p0(bq9Var);
                objR = bq9Var;
            }
            Object obj2 = (bq9) objR;
            boolean zI = l46Var.i(obj2);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                Object ihfVar = new ihf(0, obj2, bq9.class, "invoke", "invoke()V", 0, 6);
                l46Var.p0(ihfVar);
                objR2 = ihfVar;
            }
            x16 x16Var3 = (x16) ((ym7) objR2);
            x16Var3.getClass();
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = new c3g();
                l46Var.p0(objR3);
            }
            c3g c3gVar = (c3g) objR3;
            e89 e89VarI2 = q1c.i(x16Var3, l46Var);
            Boolean bool = (Boolean) c3gVar.d.getValue();
            bool.getClass();
            boolean zG = l46Var.g(e89VarI2);
            Object objR4 = l46Var.R();
            if (zG || objR4 == obj) {
                objR4 = new h3g(c3gVar, e89VarI2, null);
                l46Var.p0(objR4);
            }
            af1.o((l26) objR4, l46Var, bool);
            o7c.b(af1.b0(474615263, new r19(d3gVarT, c3gVar, x16Var2, vtb.s(l46Var)), l46Var), l46Var, 6);
            x2gVar2 = x2gVar3;
        } else {
            l46Var.Z();
            x2gVar2 = x2gVar;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, x16Var, x16Var2, x2gVar2, 22);
        }
    }
}
