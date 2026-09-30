package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xce {
    public static final float a;

    static {
        n82 n82Var = bua.a;
        a = 16.0f;
        w6c.l(20);
    }

    public static final void a(final boolean z, final x16 x16Var, final j09 j09Var, boolean z2, final long j, final long j2, final dd2 dd2Var, l46 l46Var, final int i) {
        final boolean z3;
        boolean z4;
        l46Var.h0(-1573136853);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | 3072 | (l46Var.f(j) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.f(j2) ? 131072 : 65536) | 1572864;
        if (l46Var.W(i2 & 1, (4793491 & i2) != 4793490)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                z4 = true;
            } else {
                l46Var.Z();
                z4 = z2;
            }
            l46Var.s();
            boolean z5 = z4;
            int i3 = i2 >> 12;
            b(j, j2, z, af1.b0(1128552423, new wce(j09Var, z, d5c.a(0.0f, 2, j, true), z5, x16Var, dd2Var), l46Var), l46Var, (i3 & 112) | (i3 & 14) | 3072 | ((i2 << 6) & 896));
            z3 = z5;
        } else {
            l46Var.Z();
            z3 = z2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(z, x16Var, j09Var, z3, j, j2, dd2Var, i) { // from class: vce
                public final /* synthetic */ boolean a;
                public final /* synthetic */ x16 b;
                public final /* synthetic */ j09 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ dd2 g;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(12582913);
                    xce.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(long j, long j2, boolean z, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        boolean z2;
        fxd fxdVarZ;
        l46Var.h0(-833145221);
        if ((i & 6) == 0) {
            i2 = (l46Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.f(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            p3f p3fVarI0 = g21.i0(Boolean.valueOf(z2), null, l46Var, i3 & 14, 2);
            vz9 vz9Var = p3fVarI0.d;
            boolean zBooleanValue = ((Boolean) vz9Var.getValue()).booleanValue();
            l46Var.f0(-1069234984);
            long j3 = zBooleanValue ? j : j2;
            l46Var.r(false);
            p82 p82VarE = y72.e(j3);
            boolean zG = l46Var.g(p82VarE);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                Object y6fVar = new y6f(xx.X, new w82(p82VarE));
                l46Var.p0(y6fVar);
                objR = y6fVar;
            }
            y6f y6fVar2 = (y6f) objR;
            boolean zBooleanValue2 = ((Boolean) p3fVarI0.a.a()).booleanValue();
            l46Var.f0(-1069234984);
            y72 y72VarC = tec.c(l46Var, false, zBooleanValue2 ? j : j2);
            boolean zBooleanValue3 = ((Boolean) vz9Var.getValue()).booleanValue();
            l46Var.f0(-1069234984);
            y72 y72VarC2 = tec.c(l46Var, false, zBooleanValue3 ? j : j2);
            i3f i3fVarF = p3fVarI0.f();
            l46Var.f0(1058649156);
            if (i3fVarF.c(Boolean.FALSE, Boolean.TRUE)) {
                l46Var.f0(272207019);
                fxdVarZ = vpf.Z(t39.c, l46Var);
                l46Var.r(false);
            } else {
                l46Var.f0(272326989);
                fxdVarZ = vpf.Z(t39.d, l46Var);
                l46Var.r(false);
            }
            l46Var.r(false);
            k3f k3fVarH = g21.H(p3fVarI0, y72VarC, y72VarC2, fxdVarZ, y6fVar2, l46Var, 0);
            pr4 pr4Var = em2.a;
            y72 y72Var = (y72) k3fVarH.x.getValue();
            long j4 = y72Var.a;
            mh3.a(pr4Var.a(y72Var), dd2Var, l46Var, (i3 & 112) | 8);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eu6(j, j2, z2, dd2Var, i);
        }
    }
}
