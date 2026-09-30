package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mt {
    public static final nma a = new nma(true);

    public static final void a(final boolean z, final x16 x16Var, final j09 j09Var, long j, ghc ghcVar, nma nmaVar, x4d x4dVar, final long j2, float f, final dd2 dd2Var, l46 l46Var, final int i) {
        final long j3;
        final ghc ghcVar2;
        final nma nmaVar2;
        final x4d x4dVar2;
        final float f2;
        long jFloatToRawIntBits;
        ghc ghcVar3;
        x4d x4dVarB;
        float f3;
        nma nmaVar3;
        l46Var.h0(1725609375);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | 732160 | (l46Var.f(j2) ? 8388608 : 4194304) | 905969664;
        int i3 = 1;
        if (l46Var.W(i2 & 1, (306783379 & i2) != 306783378)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                ghc ghcVarT = mh3.T(l46Var);
                float f4 = rr8.a;
                ghcVar3 = ghcVarT;
                x4dVarB = u5d.b(eb3.Y, l46Var);
                f3 = rr8.a;
                nmaVar3 = a;
            } else {
                l46Var.Z();
                jFloatToRawIntBits = j;
                ghcVar3 = ghcVar;
                nmaVar3 = nmaVar;
                x4dVarB = x4dVar;
                f3 = f;
            }
            l46Var.s();
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = new o89(Boolean.FALSE);
                l46Var.p0(objR);
            }
            o89 o89Var = (o89) objR;
            o89Var.f(Boolean.valueOf(z));
            if (((Boolean) o89Var.b.getValue()).booleanValue() || ((Boolean) o89Var.c.getValue()).booleanValue()) {
                l46Var.f0(1165905588);
                Object objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = q1c.f(new r2f(r2f.b));
                    l46Var.p0(objR2);
                }
                e89 e89Var = (e89) objR2;
                sw3 sw3Var = (sw3) l46Var.k(zg2.h);
                boolean zG = l46Var.g(sw3Var);
                Object objR3 = l46Var.R();
                if (zG || objR3 == obj) {
                    objR3 = new qq4(jFloatToRawIntBits, sw3Var, new hr(e89Var, i3));
                    l46Var.p0(objR3);
                }
                pu.a((qq4) objR3, x16Var, nmaVar3, af1.b0(-917492520, new lt(j09Var, o89Var, e89Var, ghcVar3, x4dVarB, j2, f3, dd2Var), l46Var), l46Var, 3504, 0);
                l46Var.r(false);
            } else {
                l46Var.f0(1166965571);
                l46Var.r(false);
            }
            j3 = jFloatToRawIntBits;
            ghcVar2 = ghcVar3;
            x4dVar2 = x4dVarB;
            f2 = f3;
            nmaVar2 = nmaVar3;
        } else {
            l46Var.Z();
            j3 = j;
            ghcVar2 = ghcVar;
            nmaVar2 = nmaVar;
            x4dVar2 = x4dVar;
            f2 = f;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(z, x16Var, j09Var, j3, ghcVar2, nmaVar2, x4dVar2, j2, f2, dd2Var, i) { // from class: kt
                public final /* synthetic */ boolean a;
                public final /* synthetic */ x16 b;
                public final /* synthetic */ j09 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ ghc e;
                public final /* synthetic */ nma f;
                public final /* synthetic */ x4d g;
                public final /* synthetic */ long v;
                public final /* synthetic */ float w;
                public final /* synthetic */ dd2 x;

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(433);
                    mt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj2, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(dd2 dd2Var, x16 x16Var, j09 j09Var, boolean z, tr8 tr8Var, xw9 xw9Var, l46 l46Var, int i) {
        j09 j09Var2;
        boolean z2;
        tr8 tr8Var2;
        xw9 xw9Var2;
        int i2;
        tr8 tr8Var3;
        j09 j09Var3;
        xw9 xw9Var3;
        boolean z3;
        l46Var.h0(-532959117);
        int i3 = i | (l46Var.i(x16Var) ? 32 : 16) | 113995136;
        if (l46Var.W(i3 & 1, (38347923 & i3) != 38347922)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                float f = rr8.a;
                tr8 tr8VarA = rr8.a((m82) l46Var.k(o82.a));
                i2 = i3 & (-3670017);
                bx9 bx9Var = rr8.b;
                tr8Var3 = tr8VarA;
                j09Var3 = g09.a;
                xw9Var3 = bx9Var;
                z3 = true;
            } else {
                l46Var.Z();
                i2 = i3 & (-3670017);
                j09Var3 = j09Var;
                z3 = z;
                tr8Var3 = tr8Var;
                xw9Var3 = xw9Var;
            }
            l46Var.s();
            g21.l(dd2Var, x16Var, j09Var3, z3, tr8Var3, xw9Var3, l46Var, 268435454 & i2);
            tr8Var2 = tr8Var3;
            xw9Var2 = xw9Var3;
            j09Var2 = j09Var3;
            z2 = z3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z2 = z;
            tr8Var2 = tr8Var;
            xw9Var2 = xw9Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jt(dd2Var, x16Var, j09Var2, z2, tr8Var2, xw9Var2, i);
        }
    }
}
