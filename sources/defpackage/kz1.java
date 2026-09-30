package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kz1 {
    public static final bx9 a;

    static {
        ynb.q(8.0f, 0.0f, 2);
        a = ynb.q(8.0f, 0.0f, 2);
        ynb.q(8.0f, 0.0f, 2);
    }

    public static final void a(final dd2 dd2Var, final mue mueVar, final long j, final long j2, final long j3, final float f, final xw9 xw9Var, l46 l46Var, final int i) {
        l46Var.h0(-2070754602);
        int i2 = i | (l46Var.i(dd2Var) ? 4 : 2) | (l46Var.g(mueVar) ? 32 : 16) | (l46Var.f(j) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(null) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(null) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(null) ? 131072 : 65536) | (l46Var.f(j2) ? 1048576 : 524288) | (l46Var.f(j3) ? 8388608 : 4194304) | (l46Var.d(f) ? 67108864 : 33554432) | (l46Var.g(xw9Var) ? 536870912 : 268435456);
        if (l46Var.W(i2 & 1, (306783379 & i2) != 306783378)) {
            mh3.b(new e1b[]{ib8.f(j, em2.a), nte.a.a(mueVar)}, af1.b0(-668234218, new iz1(f, xw9Var, j2, dd2Var, j3), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(mueVar, j, j2, j3, f, xw9Var, i) { // from class: hz1
                public final /* synthetic */ mue b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ float f;
                public final /* synthetic */ xw9 g;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    kz1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final x16 x16Var, final dd2 dd2Var, j09 j09Var, boolean z2, x4d x4dVar, final auc aucVar, duc ducVar, q11 q11Var, l46 l46Var, final int i) {
        final j09 j09Var2;
        final boolean z3;
        final x4d x4dVar2;
        final duc ducVar2;
        final q11 q11Var2;
        duc ducVar3;
        int i2;
        x4d x4dVar3;
        q11 q11VarB;
        boolean z4;
        j09 j09Var3;
        l46Var.h0(-1385473344);
        int i3 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | 5991424 | (l46Var.g(aucVar) ? 67108864 : 33554432) | 268435456;
        if (l46Var.W(i3 & 1, (306783379 & i3) != 306783378)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                x4d x4dVarB = u5d.b(n16.g, l46Var);
                ducVar3 = new duc(n16.p, n16.j);
                i2 = i3 & (-1908408321);
                long jD = o82.d(n16.q, l46Var);
                long j = y72.j;
                y72.b(o82.d(n16.m, l46Var), n16.n);
                float f = n16.r;
                if (z) {
                    jD = j;
                }
                if (z) {
                    f = 0.0f;
                }
                x4dVar3 = x4dVarB;
                q11VarB = x57.b(jD, f);
                z4 = true;
                j09Var3 = g09.a;
            } else {
                l46Var.Z();
                i2 = i3 & (-1908408321);
                j09Var3 = j09Var;
                z4 = z2;
                x4dVar3 = x4dVar;
                ducVar3 = ducVar;
                q11VarB = q11Var;
            }
            l46Var.s();
            mue mueVarA = r9f.a(n16.s, l46Var);
            float f2 = mh3.M;
            c(z, j09Var3, x16Var, z4, dd2Var, mueVarA, x4dVar3, aucVar, ducVar3, q11VarB, 32.0f, a, l46Var, (i2 & 14) | 12582960 | ((i2 << 3) & 896) | 102263808, ((i2 >> 24) & 14) | 224256);
            j09Var2 = j09Var3;
            x4dVar2 = x4dVar3;
            q11Var2 = q11VarB;
            z3 = z4;
            ducVar2 = ducVar3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z3 = z2;
            x4dVar2 = x4dVar;
            ducVar2 = ducVar;
            q11Var2 = q11Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(z, x16Var, dd2Var, j09Var2, z3, x4dVar2, aucVar, ducVar2, q11Var2, i) { // from class: fz1
                public final /* synthetic */ boolean a;
                public final /* synthetic */ x16 b;
                public final /* synthetic */ dd2 c;
                public final /* synthetic */ j09 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ x4d f;
                public final /* synthetic */ auc g;
                public final /* synthetic */ duc v;
                public final /* synthetic */ q11 w;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(385);
                    kz1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0220  */
    public static final void c(final boolean z, final j09 j09Var, final x16 x16Var, final boolean z2, final dd2 dd2Var, final mue mueVar, final x4d x4dVar, final auc aucVar, final duc ducVar, final q11 q11Var, final float f, final xw9 xw9Var, l46 l46Var, final int i, final int i2) {
        int i3;
        int i4;
        long j;
        float f2;
        jx jxVar;
        boolean z3;
        wz wzVar;
        l46Var.h0(1786844928);
        if ((i & 6) == 0) {
            i3 = (l46Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = i & 3072;
        int i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i5 == 0) {
            i3 |= l46Var.h(z2) ? 2048 : 1024;
        }
        int i7 = i & 24576;
        int i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i7 == 0) {
            i3 |= l46Var.i(dd2Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= l46Var.g(mueVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= l46Var.i(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= l46Var.i(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= l46Var.i(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= l46Var.g(x4dVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (l46Var.g(aucVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(ducVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.g(q11Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            if (l46Var.d(f)) {
                i6 = 2048;
            }
            i4 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (l46Var.g(xw9Var)) {
                i8 = 16384;
            }
            i4 |= i8;
        }
        if ((i2 & 196608) == 0) {
            i4 |= l46Var.g(null) ? 131072 : 65536;
        }
        int i9 = i3;
        int i10 = 1;
        if (l46Var.W(i9 & 1, ((306783379 & i3) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            l46Var.f0(73215547);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = ib8.e(l46Var);
            }
            t69 t69Var = (t69) objR;
            l46Var.r(false);
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new cz1(i10);
                l46Var.p0(objR2);
            }
            j09 j09VarB = vwc.b(j09Var, false, (a26) objR2);
            if (z2) {
                j = !z ? aucVar.a : aucVar.i;
            } else {
                j = z ? aucVar.j : aucVar.e;
            }
            long j2 = j;
            if (ducVar == null) {
                l46Var.f0(73531126);
                l46Var.r(false);
                t69Var = t69Var;
                wzVar = null;
            } else {
                l46Var.f0(-828912021);
                int i11 = ((i9 >> 9) & 14) | ((i4 << 3) & 896);
                Object objR3 = l46Var.R();
                if (objR3 == obj) {
                    objR3 = new jsd();
                    l46Var.p0(objR3);
                }
                jsd jsdVar = (jsd) objR3;
                Object objR4 = l46Var.R();
                if (objR4 == obj) {
                    objR4 = q1c.f(null);
                    l46Var.p0(objR4);
                }
                e89 e89Var = (e89) objR4;
                boolean zG = l46Var.g(t69Var);
                Object objR5 = l46Var.R();
                if (zG || objR5 == obj) {
                    objR5 = new buc(t69Var, jsdVar, null);
                    l46Var.p0(objR5);
                }
                af1.o((l26) objR5, l46Var, t69Var);
                l77 l77Var = (l77) s72.H0(jsdVar);
                if (!z2 || (l77Var instanceof pta)) {
                    f2 = 0.0f;
                } else if (l77Var instanceof yq6) {
                    f2 = ducVar.a;
                } else if (!(l77Var instanceof rn5) && (l77Var instanceof al4)) {
                    f2 = ducVar.b;
                } else {
                    f2 = 0.0f;
                }
                Object objR6 = l46Var.R();
                if (objR6 == obj) {
                    objR6 = new jx(new yi4(f2), xo1.i, null, 12);
                    l46Var.p0(objR6);
                }
                jx jxVar2 = (jx) objR6;
                yi4 yi4Var = new yi4(f2);
                boolean zI = l46Var.i(jxVar2) | l46Var.d(f2) | ((((i11 & 14) ^ 6) > 4 && l46Var.h(z2)) || (i11 & 6) == 4) | l46Var.i(l77Var);
                Object objR7 = l46Var.R();
                if (zI || objR7 == obj) {
                    jxVar = jxVar2;
                    z3 = false;
                    Object cucVar = new cuc(jxVar, f2, z2, l77Var, e89Var, null);
                    l46Var.p0(cucVar);
                    objR7 = cucVar;
                } else {
                    jxVar = jxVar2;
                    z3 = false;
                }
                af1.o((l26) objR7, l46Var, yi4Var);
                wzVar = jxVar.c;
                l46Var.r(z3);
            }
            nae.b(z, x16Var, j09VarB, z2, x4dVar, j2, wzVar != null ? ((yi4) wzVar.b.getValue()).a : 0.0f, q11Var, t69Var, af1.b0(-990050154, new jz1(aucVar, z2, z, dd2Var, mueVar, f, xw9Var), l46Var), l46Var, (i9 & 14) | ((i9 >> 3) & 112) | (i9 & 7168) | ((i9 >> 15) & 57344) | ((i4 << 21) & 1879048192), 192);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: gz1
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(i | 1);
                    int iP2 = k99.P(i2);
                    kz1.c(z, j09Var, x16Var, z2, dd2Var, mueVar, x4dVar, aucVar, ducVar, q11Var, f, xw9Var, (l46) obj2, iP, iP2);
                    return wef.a;
                }
            };
        }
    }
}
