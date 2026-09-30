package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d8c {
    public d8c() {
        new ConcurrentHashMap();
    }

    public static final void a(int i, boolean z, j09 j09Var, x16 x16Var, a26 a26Var, l46 l46Var, int i2) {
        int i3;
        Object htfVar;
        use useVar;
        e89 e89Var;
        long jB;
        x16Var.getClass();
        a26Var.getClass();
        l46Var.h0(1083261012);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i4 |= l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i4 & 1, (i4 & 9363) != 9362)) {
            use useVarO = n3d.o(null, l46Var, 3);
            int i5 = i4 & 14;
            boolean z2 = i5 == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z2 || objR == obj) {
                objR = new x84();
                l46Var.p0(objR);
            }
            x84 x84Var = (x84) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new fo5();
                l46Var.p0(objR2);
            }
            fo5 fo5Var = (fo5) objR2;
            e89 e89VarI = q1c.i(x16Var, l46Var);
            e89 e89VarI2 = q1c.i(a26Var, l46Var);
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = af1.E(l46Var);
                l46Var.p0(objR3);
            }
            aw2 aw2Var = (aw2) objR3;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i4 & 112) == 32) | l46Var.i(aw2Var) | l46Var.g(useVarO) | l46Var.g(e89VarI);
            Object objR4 = l46Var.R();
            if (zI || objR4 == obj) {
                useVar = useVarO;
                e89Var = e89VarI2;
                htfVar = new htf(z, aw2Var, useVar, e89VarI, null);
                l46Var.p0(htfVar);
            } else {
                htfVar = objR4;
                e89Var = e89VarI2;
                useVar = useVarO;
            }
            af1.o((l26) htfVar, l46Var, boolValueOf);
            boolean zG = l46Var.g(useVar) | (i5 == 4) | l46Var.g(e89Var);
            Object objR5 = l46Var.R();
            if (zG || objR5 == obj) {
                objR5 = new itf(useVar, 6, e89Var, null);
                l46Var.p0(objR5);
            }
            af1.p(useVar, 6, (l26) objR5, l46Var);
            m27 m27VarW = af1.w(af1.c0("cursor_infinite_transition", l46Var, 0), 1.0f, 0.0f, b21.D(b21.T(500, 0, hs4.c, 2), lrb.b, 4), "cursor_alpha", l46Var, 29112, 0);
            Object objR6 = l46Var.R();
            if (objR6 == obj) {
                objR6 = new jtf(fo5Var, null);
                l46Var.p0(objR6);
            }
            af1.o((l26) objR6, l46Var, wef.a);
            if (z) {
                l46Var.f0(-953926063);
                jB = y72.b(((m82) l46Var.k(o82.a)).w, 0.32f);
                l46Var.r(false);
            } else {
                l46Var.f0(-953860157);
                jB = ((m82) l46Var.k(o82.a)).a;
                l46Var.r(false);
            }
            long j = jB;
            Object objR7 = l46Var.R();
            if (objR7 == obj) {
                objR7 = ib8.e(l46Var);
            }
            mh3.b(new e1b[]{zg2.r.a(av4.a), fne.b.a(zu4.a)}, af1.b0(1151538068, new se3(j09Var, fo5Var, useVar, x84Var, (t69) objR7, j, m27VarW), l46Var), l46Var, 48);
            i3 = 6;
        } else {
            l46Var.Z();
            i3 = i;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lc2(i3, z, j09Var, x16Var, a26Var, i2);
        }
    }

    public static final void b(j09 j09Var, x4d x4dVar, xw9 xw9Var, dd2 dd2Var, l46 l46Var, int i, int i2) {
        l46Var.h0(677890064);
        int i3 = i | 16;
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | Constants.MINIMAL_ERROR_STATUS_CODE;
        } else if ((i & 384) == 0) {
            i3 |= l46Var.g(xw9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                x4dVar = a7c.b(20.0f);
                if (i4 != 0) {
                    xw9Var = ynb.q(0.0f, 0.0f, 3);
                }
            } else {
                l46Var.Z();
            }
            l46Var.s();
            j09 j09VarE = oa7.E(j09Var, x4dVar);
            pr4 pr4Var = l8b.a;
            j09 j09VarY = ynb.Y(db6.w(tm7.o(j09VarE, ((e8b) l46Var.k(pr4Var)).f, g21.f), 0.0f, ((e8b) l46Var.k(pr4Var)).d, x4dVar), xw9Var);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarY);
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
            dd2Var.m(d31.a, l46Var, 54);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        x4d x4dVar2 = x4dVar;
        xw9 xw9Var2 = xw9Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vi(j09Var, x4dVar2, xw9Var2, dd2Var, i, i2, 5, false);
        }
    }

    public static final void c(ted tedVar, long j, long j2, final a26 a26Var, final x16 x16Var, l46 l46Var, final int i) {
        ted tedVar2;
        final long j3;
        final long j4;
        long jB;
        long j5;
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-827159161);
        int i2 = i | 3218 | (l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                ted tedVarF = zz8.f(0, 3, null, l46Var);
                y11 y11Var = y11.a;
                tedVar2 = tedVarF;
                jB = y11.b(l46Var);
                j5 = ((e8b) l46Var.k(l8b.a)).f;
            } else {
                l46Var.Z();
                tedVar2 = tedVar;
                jB = j;
                j5 = j2;
            }
            l46Var.s();
            zz8.a(x16Var, null, tedVar2, 0.0f, false, a7c.b(32.0f), ((m82) l46Var.k(o82.a)).n, 0L, jB, null, null, null, af1.b0(755381093, new ied(j5, a26Var, x16Var), l46Var), l46Var, 6, 3078, 6554);
            j4 = j5;
            j3 = jB;
        } else {
            l46Var.Z();
            tedVar2 = tedVar;
            j3 = j;
            j4 = j2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final ted tedVar3 = tedVar2;
            ojbVarV.d = new l26(j3, j4, a26Var, x16Var, i) { // from class: jed
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ a26 d;
                public final /* synthetic */ x16 e;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(196609);
                    d8c.c(this.a, this.b, this.c, this.d, this.e, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void d(j09 j09Var, x16 x16Var, fy9 fy9Var, String str, l46 l46Var, int i) {
        int i2;
        pr4 pr4Var;
        int i3;
        int i4;
        long jD;
        u51 u51VarA;
        l46Var.h0(2076870419);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(fy9Var) : l46Var.i(fy9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.g(str) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            pr4 pr4Var2 = l8b.a;
            int iOrdinal = ((e8b) l46Var.k(pr4Var2)).C.ordinal();
            if (iOrdinal == 0) {
                pr4Var = pr4Var2;
                i3 = 0;
                i4 = 1;
                l46Var.f0(-1327637278);
                bx9 bx9Var = v51.a;
                long j = ((e8b) l46Var.k(pr4Var)).q;
                if (g21.S(l46Var)) {
                    l46Var.f0(1065554747);
                    l46Var.r(false);
                    jD = abg.d(4294638330L);
                } else {
                    l46Var.f0(1065555703);
                    jD = ((e8b) l46Var.k(pr4Var)).b;
                    l46Var.r(false);
                }
                u51VarA = v51.a(jD, j, 0L, 0L, l46Var, 12);
                l46Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw tec.d(1065549003, l46Var, false);
                }
                l46Var.f0(-1327444551);
                bx9 bx9Var2 = v51.a;
                pr4Var = pr4Var2;
                i3 = 0;
                i4 = 1;
                u51VarA = v51.a(eze.a(l46Var).b.z(l46Var), eze.a(l46Var).b.A(l46Var), 0L, 0L, l46Var, 12);
                l46Var.r(false);
            }
            cgg.a(x16Var, j09Var, false, we6.f(a7c.a, l46Var), u51VarA, new z51(14.0f, an1.K0, an1.H0, an1.I0), we6.a(x57.b(((e8b) l46Var.k(pr4Var)).d, 1.0f), l46Var, i3), null, af1.b0(40336131, new py1(fy9Var, str, i4), l46Var), l46Var, ((i2 >> 3) & 14) | 805306368 | ((i2 << 3) & 112), 388);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(j09Var, x16Var, fy9Var, str, i, 18);
        }
    }

    public static final void e(fy9 fy9Var, x16 x16Var, l46 l46Var, int i) {
        long jD;
        l46Var.h0(-1716547064);
        int i2 = (l46Var.i(fy9Var) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarL = b.l(g09Var, 56.0f);
            y6c y6cVar = a7c.a;
            j09 j09VarE = oa7.E(rrb.q(j09VarL, 16.0f, y6cVar, 0L, 0L, 28), y6cVar);
            if (g21.S(l46Var)) {
                l46Var.f0(-334277991);
                l46Var.r(false);
                jD = abg.d(4294638330L);
            } else {
                l46Var.f0(-334276715);
                jD = ((e8b) l46Var.k(l8b.a)).b;
                l46Var.r(false);
            }
            if (we6.e(l46Var)) {
                jD = y72.j;
            }
            j09 j09VarC = androidx.compose.foundation.b.c(tm7.o(j09VarE, jD, g21.f), false, null, null, x16Var, 15);
            q11 q11VarA = we6.a(x57.b(((e8b) l46Var.k(l8b.a)).d, 1.0f), l46Var, 0);
            j09 j09VarX = db6.x(j09VarC, q11VarA.a, q11VarA.b, y6cVar);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarX);
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
            feg.j(fy9Var, null, b.l(g09Var, 24.0f), null, an2.e, 0.0f, null, l46Var, 25016 | (i2 & 14), 104);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(fy9Var, x16Var, i, 6);
        }
    }

    public static final void f(a26 a26Var, l46 l46Var, int i) {
        int i2;
        a26Var.getClass();
        l46Var.h0(1641039179);
        if ((i & 48) == 0) {
            i2 = (l46Var.i(a26Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (l46Var.W(i2 & 1, (i2 & 17) != 16)) {
            fy9 fy9VarA = od4.A(R.drawable.ic_qq, 0, l46Var);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                objR = new a5b(a26Var, 2);
                l46Var.p0(objR);
            }
            e(fy9VarA, (x16) objR, l46Var, 8);
            fy9 fy9VarA2 = od4.A(R.drawable.ic_qzone, 0, l46Var);
            boolean z2 = i3 == 32;
            Object objR2 = l46Var.R();
            if (z2 || objR2 == i8cVar) {
                objR2 = new a5b(a26Var, 3);
                l46Var.p0(objR2);
            }
            e(fy9VarA2, (x16) objR2, l46Var, 8);
            fy9 fy9VarA3 = od4.A(R.drawable.ic_wechat, 0, l46Var);
            boolean z3 = i3 == 32;
            Object objR3 = l46Var.R();
            if (z3 || objR3 == i8cVar) {
                objR3 = new a5b(a26Var, 4);
                l46Var.p0(objR3);
            }
            e(fy9VarA3, (x16) objR3, l46Var, 8);
            fy9 fy9VarA4 = od4.A(R.drawable.ic_wechat_moments, 0, l46Var);
            boolean z4 = i3 == 32;
            Object objR4 = l46Var.R();
            if (z4 || objR4 == i8cVar) {
                objR4 = new a5b(a26Var, 5);
                l46Var.p0(objR4);
            }
            e(fy9VarA4, (x16) objR4, l46Var, 8);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xr1(a26Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028c  */
    /* JADX WARN: Code duplicated, block: B:103:0x02de  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[PHI: r2 r5
  0x008b: PHI (r2v15 int) = (r2v9 int), (r2v8 int), (r2v17 int) binds: [B:51:0x009e, B:45:0x0087, B:46:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r5v32 long) = (r5v2 long), (r5v0 long), (r5v0 long) binds: [B:51:0x009e, B:45:0x0087, B:46:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0183  */
    /* JADX WARN: Code duplicated, block: B:65:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x020c  */
    /* JADX WARN: Code duplicated, block: B:74:0x021c  */
    /* JADX WARN: Code duplicated, block: B:77:0x022c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0236  */
    /* JADX WARN: Code duplicated, block: B:82:0x0239  */
    /* JADX WARN: Code duplicated, block: B:87:0x0266  */
    /* JADX WARN: Code duplicated, block: B:90:0x0270  */
    /* JADX WARN: Code duplicated, block: B:92:0x0273  */
    /* JADX WARN: Code duplicated, block: B:95:0x027f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0281  */
    /* JADX WARN: Code duplicated, block: B:99:0x0288  */
    public static final void g(long j, x16 x16Var, a26 a26Var, x16 x16Var2, l46 l46Var, int i, int i2) {
        x16 x16Var3;
        int i3;
        boolean z;
        long j2;
        x16 x16Var4;
        ojb ojbVarV;
        int i4;
        x16 x16Var5;
        g09 g09Var;
        boolean z2;
        ov7 ov7Var;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        he2 he2Var4;
        int i5;
        x16 x16Var6;
        int i6;
        he2 he2Var5;
        int i7;
        float f;
        float f2;
        x16 x16Var7;
        float f3;
        boolean z3;
        Object objR;
        int i8;
        int i9;
        l46 l46Var2 = l46Var;
        kx0 kx0Var = ndb.y;
        a26Var.getClass();
        x16Var2.getClass();
        l46Var2.h0(-505402452);
        long j3 = j;
        int i10 = (((i2 & 1) == 0 && l46Var2.f(j3)) ? 4 : 2) | i;
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                x16Var3 = x16Var;
                i10 |= l46Var2.i(x16Var3) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (l46Var2.i(a26Var)) {
                    i9 = 256;
                } else {
                    i9 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i10 |= i9;
            }
            if ((i & 3072) == 0) {
                if (l46Var2.i(x16Var2)) {
                    i8 = 2048;
                } else {
                    i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i10 |= i8;
            }
            i3 = 0;
            if ((i10 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var2.W(i10 & 1, z)) {
                l46Var2.b0();
                if ((i & 1) != 0 || l46Var2.C()) {
                    if ((i2 & 1) != 0) {
                        j3 = ((e8b) l46Var2.k(l8b.a)).f;
                        i10 &= -15;
                    }
                    if (i11 != 0) {
                        i4 = i10;
                        x16Var5 = null;
                    }
                    l46Var2.s();
                    g09Var = g09.a;
                    j09 j09VarN = mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 12.0f, 7, tm7.o(b.c(g09Var, 1.0f), j3, g21.f)));
                    c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(i3)), ndb.Y, l46Var2, 6);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarN);
                    lf2.q.getClass();
                    l46Var2.j0();
                    z2 = l46Var2.S;
                    ov7Var = LayoutNode.h1;
                    if (z2) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, c92VarA);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf);
                    dec.k(l46Var2);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ);
                    long j4 = j3;
                    i5 = i4;
                    x16Var6 = x16Var5;
                    oa7.d(null, 0.0f, ((e8b) l46Var2.k(l8b.a)).A, l46Var2, 0, 3);
                    ca2.a.getClass();
                    if (ca2.c) {
                        i6 = i5;
                        he2Var5 = he2Var2;
                        i7 = 0;
                        l46Var2.f0(-96403936);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-96633615);
                        j09 j09VarB0 = ynb.b0(32.0f, 0.0f, b.d(b.c(g09Var, 1.0f), 56.0f), 2);
                        t7c t7cVarA = s7c.a(xc0.g, kx0Var, l46Var2, 6);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarB0);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, t7cVarA);
                        he2Var5 = he2Var2;
                        dec.l(he2Var5, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ2);
                        i6 = i5;
                        f(a26Var, l46Var2, ((i6 >> 3) & 112) | 6);
                        l46Var2.r(true);
                        i7 = 0;
                        l46Var2.r(false);
                    }
                    j09 j09VarB1 = ynb.b0(32.0f, 0.0f, b.d(b.c(g09Var, 1.0f), 48.0f), 2);
                    t7c t7cVarA2 = s7c.a(new uc0(12.0f, true, new qc0(i7)), kx0Var, l46Var2, 6);
                    int iHashCode3 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM3 = l46Var2.m();
                    j09 j09VarJ3 = m93.J(l46Var2, j09VarB1);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, t7cVarA2);
                    dec.l(he2Var5, l46Var2, u8aVarM3);
                    ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ3);
                    if (x16Var6 == null) {
                        l46Var2.f0(-370264194);
                        l46Var2.r(false);
                        f2 = 0.0f;
                        x16Var7 = x16Var6;
                    } else {
                        l46Var2.f0(-370264193);
                        if (1.0f <= 0.0d) {
                            g37.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        } else {
                            f = 1.0f;
                        }
                        f2 = 0.0f;
                        d(new jw7(f, true), x16Var6, od4.A(R.drawable.ic_save, 0, l46Var2), afc.q(R.string.text_save, l46Var2), l46Var2, (i6 & 112) | 512);
                        x16Var7 = x16Var6;
                        l46Var2.r(false);
                    }
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f3 = Float.MAX_VALUE;
                    } else {
                        f3 = 1.0f;
                    }
                    jw7 jw7Var = new jw7(f3, true);
                    if ((i6 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR = l46Var2.R();
                    if (z3 || objR == sf2.a) {
                        objR = new a5b(a26Var, 6);
                        l46Var2.p0(objR);
                    }
                    d(jw7Var, (x16) objR, od4.A(R.drawable.ic_share, 0, l46Var2), afc.q(R.string.text_share, l46Var2), l46Var2, 512);
                    l46Var2.r(true);
                    cgg.m(x16Var2, ynb.b0(32.0f, f2, b.c(g09Var, 1.0f), 2), false, null, null, null, rs0.l, l46Var, ((i6 >> 9) & 14) | 805306416, 508);
                    l46Var2 = l46Var;
                    l46Var2.r(true);
                    j2 = j4;
                    x16Var4 = x16Var7;
                } else {
                    l46Var2.Z();
                    if ((i2 & 1) != 0) {
                        i10 &= -15;
                    }
                }
                i4 = i10;
                x16Var5 = x16Var3;
                l46Var2.s();
                g09Var = g09.a;
                j09 j09VarN2 = mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 12.0f, 7, tm7.o(b.c(g09Var, 1.0f), j3, g21.f)));
                c92 c92VarA2 = a92.a(new uc0(24.0f, true, new qc0(i3)), ndb.Y, l46Var2, 6);
                int iHashCode4 = Long.hashCode(l46Var2.T);
                u8a u8aVarM4 = l46Var2.m();
                j09 j09VarJ4 = m93.J(l46Var2, j09VarN2);
                lf2.q.getClass();
                l46Var2.j0();
                z2 = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z2) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var2, c92VarA2);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM4);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf2);
                dec.k(l46Var2);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ4);
                long j5 = j3;
                i5 = i4;
                x16Var6 = x16Var5;
                oa7.d(null, 0.0f, ((e8b) l46Var2.k(l8b.a)).A, l46Var2, 0, 3);
                ca2.a.getClass();
                if (ca2.c) {
                    l46Var2.f0(-96633615);
                    j09 j09VarB2 = ynb.b0(32.0f, 0.0f, b.d(b.c(g09Var, 1.0f), 56.0f), 2);
                    t7c t7cVarA3 = s7c.a(xc0.g, kx0Var, l46Var2, 6);
                    int iHashCode5 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM5 = l46Var2.m();
                    j09 j09VarJ5 = m93.J(l46Var2, j09VarB2);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, t7cVarA3);
                    he2Var5 = he2Var2;
                    dec.l(he2Var5, l46Var2, u8aVarM5);
                    ib8.s(iHashCode5, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ5);
                    i6 = i5;
                    f(a26Var, l46Var2, ((i6 >> 3) & 112) | 6);
                    l46Var2.r(true);
                    i7 = 0;
                    l46Var2.r(false);
                } else {
                    i6 = i5;
                    he2Var5 = he2Var2;
                    i7 = 0;
                    l46Var2.f0(-96403936);
                    l46Var2.r(false);
                }
                j09 j09VarB3 = ynb.b0(32.0f, 0.0f, b.d(b.c(g09Var, 1.0f), 48.0f), 2);
                t7c t7cVarA4 = s7c.a(new uc0(12.0f, true, new qc0(i7)), kx0Var, l46Var2, 6);
                int iHashCode6 = Long.hashCode(l46Var2.T);
                u8a u8aVarM6 = l46Var2.m();
                j09 j09VarJ6 = m93.J(l46Var2, j09VarB3);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, t7cVarA4);
                dec.l(he2Var5, l46Var2, u8aVarM6);
                ib8.s(iHashCode6, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ6);
                if (x16Var6 == null) {
                    l46Var2.f0(-370264194);
                    l46Var2.r(false);
                    f2 = 0.0f;
                    x16Var7 = x16Var6;
                } else {
                    l46Var2.f0(-370264193);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    f2 = 0.0f;
                    d(new jw7(f, true), x16Var6, od4.A(R.drawable.ic_save, 0, l46Var2), afc.q(R.string.text_save, l46Var2), l46Var2, (i6 & 112) | 512);
                    x16Var7 = x16Var6;
                    l46Var2.r(false);
                }
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f3 = Float.MAX_VALUE;
                } else {
                    f3 = 1.0f;
                }
                jw7 jw7Var2 = new jw7(f3, true);
                if ((i6 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objR = l46Var2.R();
                if (z3) {
                    objR = new a5b(a26Var, 6);
                    l46Var2.p0(objR);
                } else {
                    objR = new a5b(a26Var, 6);
                    l46Var2.p0(objR);
                }
                d(jw7Var2, (x16) objR, od4.A(R.drawable.ic_share, 0, l46Var2), afc.q(R.string.text_share, l46Var2), l46Var2, 512);
                l46Var2.r(true);
                cgg.m(x16Var2, ynb.b0(32.0f, f2, b.c(g09Var, 1.0f), 2), false, null, null, null, rs0.l, l46Var, ((i6 >> 9) & 14) | 805306416, 508);
                l46Var2 = l46Var;
                l46Var2.r(true);
                j2 = j5;
                x16Var4 = x16Var7;
            } else {
                l46Var2.Z();
                j2 = j3;
                x16Var4 = x16Var3;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new du6(j2, x16Var4, a26Var, x16Var2, i, i2);
            }
        }
        i10 |= 48;
        x16Var3 = x16Var;
        if ((i & 384) == 0) {
            if (l46Var2.i(a26Var)) {
                i9 = 256;
            } else {
                i9 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i10 |= i9;
        }
        if ((i & 3072) == 0) {
            if (l46Var2.i(x16Var2)) {
                i8 = 2048;
            } else {
                i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i10 |= i8;
        }
        i3 = 0;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var2.W(i10 & 1, z)) {
            l46Var2.b0();
            if ((i & 1) != 0) {
                if ((i2 & 1) != 0) {
                    j3 = ((e8b) l46Var2.k(l8b.a)).f;
                    i10 &= -15;
                }
                if (i11 != 0) {
                    i4 = i10;
                    x16Var5 = null;
                } else {
                    i4 = i10;
                    x16Var5 = x16Var3;
                }
            } else {
                if ((i2 & 1) != 0) {
                    j3 = ((e8b) l46Var2.k(l8b.a)).f;
                    i10 &= -15;
                }
                if (i11 != 0) {
                    i4 = i10;
                    x16Var5 = null;
                } else {
                    i4 = i10;
                    x16Var5 = x16Var3;
                }
            }
            l46Var2.s();
            g09Var = g09.a;
            j09 j09VarN3 = mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 12.0f, 7, tm7.o(b.c(g09Var, 1.0f), j3, g21.f)));
            c92 c92VarA3 = a92.a(new uc0(24.0f, true, new qc0(i3)), ndb.Y, l46Var2, 6);
            int iHashCode7 = Long.hashCode(l46Var2.T);
            u8a u8aVarM7 = l46Var2.m();
            j09 j09VarJ7 = m93.J(l46Var2, j09VarN3);
            lf2.q.getClass();
            l46Var2.j0();
            z2 = l46Var2.S;
            ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA3);
            he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM7);
            Integer numValueOf3 = Integer.valueOf(iHashCode7);
            he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf3);
            dec.k(l46Var2);
            he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ7);
            long j6 = j3;
            i5 = i4;
            x16Var6 = x16Var5;
            oa7.d(null, 0.0f, ((e8b) l46Var2.k(l8b.a)).A, l46Var2, 0, 3);
            ca2.a.getClass();
            if (ca2.c) {
                l46Var2.f0(-96633615);
                j09 j09VarB4 = ynb.b0(32.0f, 0.0f, b.d(b.c(g09Var, 1.0f), 56.0f), 2);
                t7c t7cVarA5 = s7c.a(xc0.g, kx0Var, l46Var2, 6);
                int iHashCode8 = Long.hashCode(l46Var2.T);
                u8a u8aVarM8 = l46Var2.m();
                j09 j09VarJ8 = m93.J(l46Var2, j09VarB4);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, t7cVarA5);
                he2Var5 = he2Var2;
                dec.l(he2Var5, l46Var2, u8aVarM8);
                ib8.s(iHashCode8, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ8);
                i6 = i5;
                f(a26Var, l46Var2, ((i6 >> 3) & 112) | 6);
                l46Var2.r(true);
                i7 = 0;
                l46Var2.r(false);
            } else {
                i6 = i5;
                he2Var5 = he2Var2;
                i7 = 0;
                l46Var2.f0(-96403936);
                l46Var2.r(false);
            }
            j09 j09VarB5 = ynb.b0(32.0f, 0.0f, b.d(b.c(g09Var, 1.0f), 48.0f), 2);
            t7c t7cVarA6 = s7c.a(new uc0(12.0f, true, new qc0(i7)), kx0Var, l46Var2, 6);
            int iHashCode9 = Long.hashCode(l46Var2.T);
            u8a u8aVarM9 = l46Var2.m();
            j09 j09VarJ9 = m93.J(l46Var2, j09VarB5);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA6);
            dec.l(he2Var5, l46Var2, u8aVarM9);
            ib8.s(iHashCode9, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ9);
            if (x16Var6 == null) {
                l46Var2.f0(-370264194);
                l46Var2.r(false);
                f2 = 0.0f;
                x16Var7 = x16Var6;
            } else {
                l46Var2.f0(-370264193);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                f2 = 0.0f;
                d(new jw7(f, true), x16Var6, od4.A(R.drawable.ic_save, 0, l46Var2), afc.q(R.string.text_save, l46Var2), l46Var2, (i6 & 112) | 512);
                x16Var7 = x16Var6;
                l46Var2.r(false);
            }
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = 1.0f;
            }
            jw7 jw7Var3 = new jw7(f3, true);
            if ((i6 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            objR = l46Var2.R();
            if (z3) {
                objR = new a5b(a26Var, 6);
                l46Var2.p0(objR);
            } else {
                objR = new a5b(a26Var, 6);
                l46Var2.p0(objR);
            }
            d(jw7Var3, (x16) objR, od4.A(R.drawable.ic_share, 0, l46Var2), afc.q(R.string.text_share, l46Var2), l46Var2, 512);
            l46Var2.r(true);
            cgg.m(x16Var2, ynb.b0(32.0f, f2, b.c(g09Var, 1.0f), 2), false, null, null, null, rs0.l, l46Var, ((i6 >> 9) & 14) | 805306416, 508);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j2 = j6;
            x16Var4 = x16Var7;
        } else {
            l46Var2.Z();
            j2 = j3;
            x16Var4 = x16Var3;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new du6(j2, x16Var4, a26Var, x16Var2, i, i2);
        }
    }

    public static final void h(int i, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(-2094313205);
        int i3 = 2;
        int i4 = 4;
        int i5 = i2 | (l46Var.e(i) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        boolean z = false;
        if (l46Var.W(i5 & 1, (i5 & 1171) != 1170)) {
            xdc.a(b.c, af1.b0(1648989639, new fkc(i4, x16Var3), l46Var), af1.b0(1516665894, new b20(x16Var, x16Var2, z, 27), l46Var), null, null, 0, ((e8b) l46Var.k(l8b.a)).a, 0L, null, af1.b0(-20562148, new qs1(i, i3), l46Var), l46Var, 805306806, 440);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ai1(i, x16Var, x16Var2, x16Var3, i2);
        }
    }

    public static final void i(int i, dd2 dd2Var, x16 x16Var, l46 l46Var, String str, boolean z) {
        int i2;
        String str2;
        l46Var.h0(-514379383);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            j09 j09VarP = pa7.p(b.l(g09.a, 56.0f), z ? 1.0f : 0.38f);
            boolean z2 = (i2 & 14) == 4;
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                str2 = str;
                objR = new alc(str2, 5);
                l46Var.p0(objR);
            } else {
                str2 = str;
            }
            j09 j09VarB = vwc.b(j09VarP, false, (a26) objR);
            y6c y6cVar = a7c.a;
            j09 j09VarC = androidx.compose.foundation.b.c(oa7.E(j09VarB, y6cVar), z, null, new i5c(0), x16Var, 10);
            pr4 pr4Var = l8b.a;
            long j = ((e8b) l46Var.k(pr4Var)).c;
            long j2 = ((e8b) l46Var.k(pr4Var)).a;
            if (!we6.e(l46Var)) {
                j = j2;
            }
            j09 j09VarO = tm7.o(j09VarC, j, g21.f);
            q11 q11VarB = x57.b(((e8b) l46Var.k(pr4Var)).A, 0.5f);
            j09 j09VarX = db6.x(j09VarO, q11VarB.a, q11VarB.b, y6cVar);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarX);
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
            tec.q((i2 >> 9) & 14, dd2Var, l46Var, true);
        } else {
            str2 = str;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60(i, 13, dd2Var, str2, x16Var, z);
        }
    }

    public static final void j(fy9 fy9Var, String str, boolean z, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1733896533);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(fy9Var) : l46Var.i(fy9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 3;
            i((i3 & 896) | (i3 & 14) | 3072 | (i3 & 112), af1.b0(293993271, new j16(fy9Var), l46Var), x16Var, l46Var, str, z);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60((Object) fy9Var, str, z, (Object) x16Var, i, 12);
        }
    }

    public static final void k(String str, boolean z, boolean z2, x16 x16Var, l46 l46Var, int i) {
        int i2;
        boolean z3;
        u51 u51VarA;
        q11 q11Var;
        l46Var.h0(1930483522);
        int i3 = i & 6;
        v7c v7cVar = v7c.a;
        if (i3 == 0) {
            i2 = (l46Var.g(v7cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i4 = i2;
        if (l46Var.W(i4 & 1, (i4 & 9363) != 9362)) {
            j09 j09VarD = b.d(v7cVar.a(g09.a, 1.0f, true), 48.0f);
            x4d x4dVar = a7c.a;
            x4dVar.getClass();
            if (we6.e(l46Var)) {
                x4dVar = g21.f;
            }
            x4d x4dVar2 = x4dVar;
            if (z) {
                l46Var.f0(1422820278);
                bx9 bx9Var = v51.a;
                b1b b1bVar = o82.a;
                z3 = false;
                u51VarA = v51.a(((m82) l46Var.k(b1bVar)).a, ((m82) l46Var.k(b1bVar)).b, 0L, 0L, l46Var, 12);
                l46Var.r(false);
            } else {
                z3 = false;
                l46Var.f0(1422993909);
                bx9 bx9Var2 = v51.a;
                b1b b1bVar2 = l8b.a;
                u51VarA = v51.a(((e8b) l46Var.k(b1bVar2)).c, ((e8b) l46Var.k(b1bVar2)).q, 0L, 0L, l46Var, 12);
                l46Var.r(false);
            }
            u51 u51Var = u51VarA;
            if (z) {
                l46Var.f0(1423155822);
                l46Var.r(z3);
                q11Var = null;
            } else {
                l46Var.f0(1423181087);
                q11 q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).A, 0.5f);
                l46Var.r(z3);
                q11Var = q11VarB;
            }
            cgg.a(x16Var, j09VarD, z2, x4dVar2, u51Var, null, q11Var, null, af1.b0(-1792410286, new ob0(str, 27), l46Var), l46Var, ((i4 >> 12) & 14) | 805306368 | ((i4 >> 3) & 896), 416);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t43(str, z, z2, x16Var, i, 3);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10381. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void l(java.lang.String r23, java.util.List r24, boolean r25, defpackage.x16 r26, defpackage.a26 r27, defpackage.j09 r28, defpackage.l46 r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d8c.l(java.lang.String, java.util.List, boolean, x16, a26, j09, l46, int):void");
    }

    public static final long q() {
        return Thread.currentThread().getId();
    }

    public static final Object r(l26 l26Var) {
        Thread.interrupted();
        return z5c.I(nu4.a, new c8c(l26Var, null));
    }

    public static final String s(ti7 ti7Var, String str) {
        Object obj = ti7Var.get(str);
        yi7 yi7Var = obj instanceof yi7 ? (yi7) obj : null;
        if (yi7Var != null) {
            if (!yi7Var.d()) {
                yi7Var = null;
            }
            if (yi7Var != null) {
                e37 e37Var = oh7.a;
                if (yi7Var instanceof qi7) {
                    return null;
                }
                return yi7Var.c();
            }
        }
        return null;
    }

    public static final g57 t(x47 x47Var) {
        return new g57(x47Var.a, x47Var.b, x47Var.c, x47Var.d);
    }

    public abstract Typeface m(Context context, qq5 qq5Var, Resources resources, int i);

    public abstract Typeface n(Context context, er5[] er5VarArr, int i);

    public Typeface o(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface p(Context context, Resources resources, int i, String str);

    public abstract void u(y8h y8hVar, y8h y8hVar2);

    public abstract void v(y8h y8hVar, Thread thread);

    public abstract boolean w(bbh bbhVar, j1h j1hVar, j1h j1hVar2);

    public abstract boolean x(bbh bbhVar, Object obj, Object obj2);

    public abstract boolean y(bbh bbhVar, y8h y8hVar, y8h y8hVar2);
}
