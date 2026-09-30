package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y75 {
    public final /* synthetic */ e89 a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ s69 c;
    public final /* synthetic */ s69 d;

    public y75(e89 e89Var, e89 e89Var2, s69 s69Var, s69 s69Var2) {
        this.a = e89Var;
        this.b = e89Var2;
        this.c = s69Var;
        this.d = s69Var2;
    }

    public final void a(final boolean z, final x16 x16Var, j09 j09Var, ghc ghcVar, boolean z2, x4d x4dVar, long j, float f, final dd2 dd2Var, l46 l46Var, final int i, final int i2) {
        int i3;
        final j09 j09Var2;
        final ghc ghcVar2;
        final boolean z3;
        final x4d x4dVar2;
        final long j2;
        final float f2;
        ghc ghcVarT;
        boolean z4;
        j09 j09Var3;
        ghc ghcVar3;
        l46Var.h0(-126848451);
        int i4 = i | (l46Var.h(z) ? 4 : 2) | 919168384;
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var.i(dd2Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(this) ? 32 : 16;
        }
        if (l46Var.W(i4 & 1, ((306783379 & i4) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                ghcVarT = mh3.T(l46Var);
                float f3 = rr8.a;
                x4d x4dVarB = u5d.b(eb3.Y, l46Var);
                long jD = o82.d(eb3.z, l46Var);
                f2 = rr8.a;
                z4 = true;
                j2 = jD;
                x4dVar2 = x4dVarB;
                j09Var3 = g09.a;
            } else {
                l46Var.Z();
                j09Var3 = j09Var;
                ghcVarT = ghcVar;
                z4 = z2;
                x4dVar2 = x4dVar;
                j2 = j;
                f2 = f;
            }
            l46Var.s();
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                Object vz9Var = new vz9(wef.a, qk6.L0);
                l46Var.p0(vz9Var);
                objR = vz9Var;
            }
            e89 e89Var = (e89) objR;
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            WeakHashMap weakHashMap = m8g.w;
            int i5 = q7c.k(l46Var).f.e().b;
            if (z) {
                l46Var.f0(629991660);
                Object objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = new ok3(e89Var, 16);
                    l46Var.p0(objR2);
                }
                i7h.d((x16) objR2, l46Var, 6);
                l46Var.r(false);
            } else {
                ghcVarT = ghcVarT;
                l46Var.f0(630077189);
                l46Var.r(false);
            }
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = new o89(Boolean.FALSE);
                l46Var.p0(objR3);
            }
            o89 o89Var = (o89) objR3;
            o89Var.f(Boolean.valueOf(z));
            if (((Boolean) o89Var.b.getValue()).booleanValue() || ((Boolean) o89Var.c.getValue()).booleanValue()) {
                l46Var.f0(630396489);
                Object objR4 = l46Var.R();
                if (objR4 == obj) {
                    objR4 = q1c.f(new r2f(r2f.b));
                    l46Var.p0(objR4);
                }
                e89 e89Var2 = (e89) objR4;
                boolean zG = l46Var.g(sw3Var) | l46Var.e(i5);
                Object objR5 = l46Var.R();
                if (zG || objR5 == obj) {
                    objR5 = new z75(sw3Var, i5, e89Var, new hr(e89Var2, 8));
                    l46Var.p0(objR5);
                }
                z75 z75Var = (z75) objR5;
                ((v75) this.b.getValue()).getClass();
                ((Boolean) this.a.getValue()).getClass();
                ghcVar3 = ghcVarT;
                j09Var3 = j09Var3;
                z4 = z4;
                pu.a(z75Var, x16Var, new nma(!((Boolean) b21.M(0, 7, l46Var).getValue()).booleanValue() ? 393248 : 393216, true), af1.b0(2063119149, new x75(this, j09Var3, z4, o89Var, e89Var2, ghcVar3, x4dVar2, j2, f2, dd2Var), l46Var), l46Var, 3120, 0);
                l46Var.r(false);
            } else {
                l46Var.f0(631807237);
                l46Var.r(false);
                ghcVar3 = ghcVarT;
            }
            j09Var2 = j09Var3;
            ghcVar2 = ghcVar3;
            z3 = z4;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            ghcVar2 = ghcVar;
            z3 = z2;
            x4dVar2 = x4dVar;
            j2 = j;
            f2 = f;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(z, x16Var, j09Var2, ghcVar2, z3, x4dVar2, j2, f2, dd2Var, i, i2) { // from class: w75
                public final /* synthetic */ boolean b;
                public final /* synthetic */ x16 c;
                public final /* synthetic */ j09 d;
                public final /* synthetic */ ghc e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ x4d g;
                public final /* synthetic */ long v;
                public final /* synthetic */ float w;
                public final /* synthetic */ dd2 x;
                public final /* synthetic */ int y;

                {
                    this.y = i2;
                }

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(49);
                    int iP2 = k99.P(this.y);
                    this.a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj2, iP, iP2);
                    return wef.a;
                }
            };
        }
    }
}
