package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0f {
    public static final bx9 a = new bx9(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final c0f c0fVar, j09 j09Var, float f, x4d x4dVar, long j, long j2, final dd2 dd2Var, l46 l46Var, final int i) {
        int i2;
        j09 j09Var2;
        final float f2;
        final x4d x4dVar2;
        final long j3;
        final long j4;
        float f3;
        long jD;
        int i3;
        x4d x4dVar3;
        long j5;
        l46Var.h0(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(c0fVar) : l46Var.i(c0fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= l46Var.i(dd2Var) ? 536870912 : 268435456;
        }
        if (l46Var.W(i5 & 1, (306783379 & i5) != 306783378)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                f3 = xze.a;
                x4d x4dVarB = u5d.b(z7f.h, l46Var);
                long jD2 = o82.d(z7f.i, l46Var);
                jD = o82.d(z7f.g, l46Var);
                i3 = i5 & (-4186113);
                x4dVar3 = x4dVarB;
                j5 = jD2;
                j09Var2 = g09.a;
            } else {
                l46Var.Z();
                i3 = i5 & (-4186113);
                j09Var2 = j09Var;
                f3 = f;
                x4dVar3 = x4dVar;
                j5 = j;
                jD = j2;
            }
            l46Var.s();
            l46Var.f0(-1719831991);
            l46Var.r(false);
            int i6 = i3 >> 9;
            nae.a(j09Var2, x4dVar3, jD, 0L, 0.0f, 0.0f, null, af1.b0(-1573998995, new zze(f3, j5, dd2Var), l46Var), l46Var, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            f2 = f3;
            j3 = j5;
            x4dVar2 = x4dVar3;
            j4 = jD;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            f2 = f;
            x4dVar2 = x4dVar;
            j3 = j;
            j4 = j2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final j09 j09Var3 = j09Var2;
            ojbVarV.d = new l26() { // from class: yze
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a0f.a(c0fVar, j09Var3, f2, x4dVar2, j3, j4, dd2Var, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void b(lla llaVar, dd2 dd2Var, d0f d0fVar, j09 j09Var, boolean z, dd2 dd2Var2, l46 l46Var, int i) {
        int i2;
        j09 j09Var2;
        boolean z2;
        l46Var.h0(-293753984);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(llaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(d0fVar) : l46Var.i(d0fVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i4 |= l46Var.i(dd2Var2) ? 67108864 : 33554432;
        }
        if (l46Var.W(i4 & 1, (38347923 & i4) != 38347922)) {
            n3f n3fVarH0 = g21.h0(((h0f) d0fVar).b, "tooltip transition", l46Var, 48);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(null);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                new xfc(e89Var, 10);
                objR2 = new c0f();
                l46Var.p0(objR2);
            }
            kj0.c(llaVar, af1.b0(-527401546, new bs8(n3fVarH0, dd2Var, (c0f) objR2), l46Var), d0fVar, af1.b0(-23901870, new fw0(i3, e89Var, dd2Var2), l46Var), l46Var, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128));
            j09Var2 = g09.a;
            z2 = true;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z2 = z;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(llaVar, dd2Var, d0fVar, j09Var2, z2, dd2Var2, i);
        }
    }

    public static final h0f c(l46 l46Var) {
        b99 b99Var = dw0.a;
        boolean zH = l46Var.h(false) | l46Var.g(b99Var);
        Object objR = l46Var.R();
        if (zH || objR == sf2.a) {
            objR = new h0f(b99Var);
            l46Var.p0(objR);
        }
        return (h0f) objR;
    }
}
