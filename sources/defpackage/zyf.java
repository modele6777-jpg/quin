package defpackage;

import ai.askquin.R;
import android.graphics.Color;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zyf {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final at8 i;
    public static final at8 j;

    static {
        long jD = abg.d(4286547711L);
        long jD2 = abg.d(4294939633L);
        long jD3 = abg.d(4292071666L);
        long jD4 = abg.d(4289711355L);
        int i2 = y72.l;
        long jF = gec.F(237.0f, 0.22f, 0.15f, 0.0f, 24);
        long jF2 = gec.F(305.0f, 0.25f, 0.13f, 0.0f, 24);
        long jF3 = gec.F(245.0f, 0.18f, 0.17f, 0.0f, 24);
        long jF4 = gec.F(213.0f, 0.21f, 0.14f, 0.0f, 24);
        a = abg.c(1308622847);
        b = abg.c(872415231);
        c = abg.c(234881023);
        d = abg.c(452984831);
        e = abg.c(234881023);
        f = abg.c(452984831);
        g = abg.c(100663295);
        h = abg.c(234881023);
        i = new at8(jD, jD2, jD3, jD4, abg.d(4293453042L));
        j = new at8(jF, jF2, jF3, jF4, abg.d(4279440148L));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    public static final void a(final boolean z, final boolean z2, y72 y72Var, y72 y72Var2, l46 l46Var, int i2, int i3) {
        y72 y72Var3;
        int i4;
        y72 y72Var4;
        int i5;
        l46 l46Var2;
        y72 y72Var5;
        y72 y72Var6;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        l46Var.h0(1923026813);
        int i6 = i2 | (l46Var.h(z) ? 4 : 2) | (l46Var.h(z2) ? 32 : 16);
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            y72Var3 = y72Var;
        } else {
            y72Var3 = y72Var;
            i4 = i6 | (l46Var.g(y72Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i5 = i4 | 3072;
            y72Var4 = y72Var2;
        } else {
            y72Var4 = y72Var2;
            i5 = i4 | (l46Var.g(y72Var4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        int i9 = i5;
        if (l46Var.W(i9 & 1, (i9 & 1171) != 1170)) {
            y72 y72Var7 = i7 != 0 ? null : y72Var3;
            y72 y72Var8 = i8 == 0 ? y72Var4 : null;
            int i10 = i9 & 14;
            boolean z3 = (i10 == 4) | ((i9 & 7168) == 2048);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z3 || objR == i8cVar) {
                at8 at8Var = z ? j : i;
                at8Var.getClass();
                if (y72Var8 == null) {
                    objR = at8Var;
                } else {
                    float[] fArr = new float[3];
                    Color.colorToHSV(abg.Z(y72Var8.a), fArr);
                    if (fArr[1] < 0.12f) {
                        objR = at8Var;
                    } else {
                        float f2 = fArr[0];
                        objR = new at8(h(at8Var.a, f2), h(at8Var.b, f2), h(at8Var.c, f2), h(at8Var.d, f2), h(at8Var.e, f2));
                    }
                }
                l46Var.p0(objR);
            }
            at8 at8Var2 = (at8) objR;
            if (z2) {
                l46Var.f0(-1676019095);
                if (z) {
                    j7 = e;
                    j8 = f;
                    j6 = g;
                    j9 = h;
                } else {
                    j7 = a;
                    j8 = b;
                    j6 = c;
                    j9 = d;
                }
                if (y72Var7 == null) {
                    l46Var.f0(1192873222);
                    j10 = ((e8b) l46Var.k(l8b.a)).c;
                    l46Var.r(false);
                } else {
                    l46Var.f0(1192872509);
                    l46Var.r(false);
                    j10 = y72Var7.a;
                }
                l46Var.r(false);
                j4 = j8;
                j2 = j10;
                j5 = j7;
                j3 = j9;
            } else {
                l46Var.f0(-1675612840);
                l46Var.r(false);
                long j11 = at8Var2.a;
                long j12 = at8Var2.b;
                long j13 = at8Var2.c;
                long j14 = at8Var2.d;
                j2 = at8Var2.e;
                j3 = j14;
                j4 = j12;
                j5 = j11;
                j6 = j13;
            }
            p27 p27VarC0 = af1.c0("mesh", l46Var, 0);
            y72 y72Var9 = y72Var7;
            pd4 pd4Var = hs4.c;
            y72 y72Var10 = y72Var8;
            x6f x6fVarT = b21.T(8000, 0, pd4Var, 2);
            lrb lrbVar = lrb.b;
            final long j15 = j3;
            final long j16 = j6;
            final long j17 = j4;
            final m27 m27VarW = af1.w(p27VarC0, 0.0f, 1.0f, b21.D(x6fVarT, lrbVar, 4), "offset1", l46Var, 29112, 0);
            l27 l27VarD = b21.D(b21.T(6000, 0, pd4Var, 2), lrbVar, 4);
            boolean z4 = false;
            final m27 m27VarW2 = af1.w(p27VarC0, 1.0f, 0.0f, l27VarD, "offset2", l46Var, 29112, 0);
            l46Var2 = l46Var;
            FillElement fillElement = b.c;
            boolean zF = l46Var2.f(j2) | ((i9 & 112) == 32);
            if (i10 == 4) {
                z4 = true;
            }
            boolean zF2 = zF | z4 | l46Var2.f(j5) | l46Var2.g(m27VarW) | l46Var2.g(m27VarW2) | l46Var2.f(j17) | l46Var2.f(j16) | l46Var2.f(j15);
            Object objR2 = l46Var2.R();
            if (zF2 || objR2 == i8cVar) {
                final long j18 = j5;
                final long j19 = j2;
                a26 a26Var = new a26() { // from class: vyf
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        sn4 sn4Var = (sn4) obj;
                        sn4Var.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
                        sn4.y0(sn4Var, j19, 0L, 0L, 0.0f, null, 0, 126);
                        boolean z5 = z2;
                        boolean z6 = z;
                        a26 a26VarB = zyf.b(1.0f, z5, z6);
                        long j20 = j18;
                        List listI = t72.I(a26VarB.d(new y72(j20)), new y72(y72.b(j20, 0.0f)));
                        h0e h0eVar = m27VarW;
                        float fFloatValue = ((((Number) h0eVar.getValue()).floatValue() * 0.3f) + 0.2f) * fIntBitsToFloat;
                        h0e h0eVar2 = m27VarW2;
                        sn4.O0(sn4Var, gec.L(listI, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(((((Number) h0eVar2.getValue()).floatValue() * 0.2f) + 0.2f) * fIntBitsToFloat2)) & 4294967295L), fIntBitsToFloat * 1.0f), 0L, 0L, 0.0f, null, null, 0, 126);
                        a26 a26VarB2 = zyf.b(0.8f, z5, z6);
                        long j21 = j17;
                        List listI2 = t72.I(a26VarB2.d(new y72(j21)), new y72(y72.b(j21, 0.0f)));
                        float fFloatValue2 = (0.8f - (((Number) h0eVar2.getValue()).floatValue() * 0.3f)) * fIntBitsToFloat;
                        sn4.O0(sn4Var, gec.L(listI2, (((long) Float.floatToRawIntBits((0.7f - (((Number) h0eVar.getValue()).floatValue() * 0.2f)) * fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32), 0.9f * fIntBitsToFloat), 0L, 0L, 0.0f, null, null, 0, 126);
                        a26 a26VarB3 = zyf.b(0.7f, z5, z6);
                        long j22 = j16;
                        List listI3 = t72.I(a26VarB3.d(new y72(j22)), new y72(y72.b(j22, 0.0f)));
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((((Number) h0eVar.getValue()).floatValue() * 0.2f) + 0.5f) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(((((Number) h0eVar2.getValue()).floatValue() * 0.15f) + 0.5f) * fIntBitsToFloat2)) & 4294967295L);
                        float f3 = fIntBitsToFloat * 0.8f;
                        sn4.O0(sn4Var, gec.L(listI3, jFloatToRawIntBits, f3), 0L, 0L, 0.0f, null, null, 0, 126);
                        a26 a26VarB4 = zyf.b(0.7f, z5, z6);
                        long j23 = j15;
                        List listI4 = t72.I(a26VarB4.d(new y72(j23)), new y72(y72.b(j23, 0.0f)));
                        float fFloatValue3 = ((((Number) h0eVar2.getValue()).floatValue() * 0.4f) + 0.3f) * fIntBitsToFloat;
                        sn4.O0(sn4Var, gec.L(listI4, (((long) Float.floatToRawIntBits((0.8f - (((Number) h0eVar.getValue()).floatValue() * 0.3f)) * fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue3)) << 32), f3), 0L, 0L, 0.0f, null, null, 0, 126);
                        return wef.a;
                    }
                };
                l46Var2.p0(a26Var);
                objR2 = a26Var;
            }
            nk8.e(6, (a26) objR2, l46Var2, fillElement);
            y72Var6 = y72Var10;
            y72Var5 = y72Var9;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
            y72Var5 = y72Var3;
            y72Var6 = y72Var4;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t43(z, z2, y72Var5, y72Var6, i2, i3);
        }
    }

    public static final a26 b(float f2, boolean z, boolean z2) {
        if (z) {
            return qqf.d;
        }
        return z2 ? new yyf(0, f2) : new yyf(1, f2);
    }

    public static final void c(float f2, l46 l46Var, int i2) {
        int i3;
        g09 g09Var;
        y6c y6cVar;
        float f3;
        l46 l46Var2 = l46Var;
        y02 y02Var = g21.f;
        l46Var2.h0(-1283577142);
        int i4 = 2;
        int i5 = (i2 & 6) == 0 ? (l46Var2.d(f2) ? 4 : 2) | i2 : i2;
        if (l46Var2.W(i5 & 1, (i5 & 3) != 2)) {
            p27 p27VarC0 = af1.c0("wave", l46Var2, 0);
            l46Var2.f0(-862013884);
            z67 z67VarC0 = mh3.c0(0, 7);
            ArrayList arrayList = new ArrayList(t72.u(z67VarC0, 10));
            Iterator it = z67VarC0.iterator();
            while (((y67) it).c) {
                int iNextInt = ((q67) it).nextInt();
                ArrayList arrayList2 = arrayList;
                l46Var2 = l46Var;
                arrayList2.add(af1.w(p27VarC0, 0.0f, 1.0f, b21.D(b21.T((iNextInt * 60) + Constants.MINIMAL_ERROR_STATUS_CODE, 0, hs4.c, i4), lrb.b, 4), tec.e(iNextInt, "bar_"), l46Var, 4536, 0));
                arrayList = arrayList2;
                i4 = 2;
            }
            ArrayList arrayList3 = arrayList;
            l46Var2.r(false);
            float f4 = 0.5f;
            h0e h0eVarB = vx.b(f2, b21.P(0.5f, 200.0f, 4, null), "smoothLevel", null, l46Var2, (i5 & 14) | 3120, 20);
            boolean zB = if9.B(l46Var2);
            boolean zF = k8b.f((e8b) l46Var2.k(l8b.a));
            uc0 uc0Var = new uc0(8.0f, true, new qc0(0));
            kx0 kx0Var = ndb.z;
            g09 g09Var2 = g09.a;
            j09 j09VarD = b.d(g09Var2, 126.0f);
            t7c t7cVarA = s7c.a(uc0Var, kx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD);
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
            y6c y6cVarB = a7c.b(10.0f);
            l46Var2.f0(-782158742);
            int i6 = 0;
            for (Object obj : arrayList3) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    t72.Z();
                    throw null;
                }
                float fN = (mh3.n((((Number) ((h0e) obj).getValue()).floatValue() * 0.3f) + (((Number) h0eVarB.getValue()).floatValue() * (1.0f - ((Math.abs(i6 - 3) / 3.0f) * f4)) * 0.7f), 0.0f, 1.0f) * 106.0f) + 20.0f;
                if (zF) {
                    l46Var2.f0(-1263240482);
                    y6cVar = y6cVarB;
                    s21.a(rrb.j(tm7.o(oa7.E(db6.w(rrb.q(b.d(b.p(g09Var2, 20.0f), fN), 8.0f, y6cVarB, abg.c(872415231), abg.c(872415231), 4), 1.0f, abg.c(1728053247), y6cVar), y6cVar), abg.c(436207616), y02Var), y6cVar, new n4d(new dtd(abg.d(2147483648L)))), l46Var2, 0);
                    l46Var2.r(false);
                    g09Var = g09Var2;
                    f3 = 0.5f;
                } else {
                    g09 g09Var3 = g09Var2;
                    l46Var2.f0(-1262507983);
                    long jC = zB ? abg.c(872415231) : abg.d(2164260863L);
                    long jD = abg.d(zB ? 2148795714L : 2154254838L);
                    g09Var = g09Var3;
                    y6cVar = y6cVarB;
                    f3 = 0.5f;
                    s21.a(rrb.j(tm7.o(oa7.E(db6.w(rrb.q(b.d(b.p(g09Var, 20.0f), fN), 8.0f, y6cVarB, jC, jC, 4), 1.0f, zB ? abg.c(1728053247) : y72.e, y6cVar), y6cVar), y72.b(((e8b) l46Var2.k(l8b.a)).u, 0.5f), y02Var), y6cVar, new n4d(new dtd(jD))), l46Var2, 0);
                    l46Var2.r(false);
                }
                f4 = f3;
                g09Var2 = g09Var;
                i6 = i7;
                h0eVarB = h0eVarB;
                zB = zB;
                y6cVarB = y6cVar;
            }
            l46Var2.r(false);
            i3 = 1;
            l46Var2.r(true);
        } else {
            i3 = 1;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new wyf(f2, i2, i3);
        }
    }

    public static final void d(final int i2, float f2, l46 l46Var, final int i3) {
        int i4;
        final float f3 = f2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1070750218);
        if ((i3 & 6) == 0) {
            i4 = i3 | (l46Var2.e(i2) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var2.d(f3) ? 32 : 16;
        }
        int i5 = i4;
        if (l46Var2.W(i5 & 1, (i5 & 19) != 18)) {
            String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
            jx0 jx0Var = ndb.Z;
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var2, 48);
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
            String strQ = afc.q(R.string.voice_release_to_send, l46Var2);
            mue mueVar = pue.a;
            pr4 pr4Var = l8b.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var, 0, 0, 131066);
            o5c.f(l46Var, b.d(g09Var, 44.0f));
            long jL = w6c.l(17);
            ar5 ar5Var = ar5.w;
            nte.b(str, null, ((e8b) l46Var.k(pr4Var)).q, jL, ar5Var, yp5.d, w6c.k(0.1d), null, null, w6c.k(22.95d), 0, false, 0, 0, null, null, l46Var, 102260736, 48, 259626);
            l46Var2 = l46Var;
            o5c.f(l46Var2, b.d(g09Var, 24.0f));
            f3 = f2;
            c(f3, l46Var2, (i5 >> 3) & 14);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: xyf
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iP = k99.P(i3 | 1);
                    zyf.d(i2, f3, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void e(int i2, int i3, l46 l46Var, int i4) {
        int i5;
        long j2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-928138569);
        int i6 = (l46Var2.e(i2) ? 4 : 2) | i4 | 48;
        if (l46Var2.W(i6 & 1, (i6 & 19) != 18)) {
            pr4 pr4Var = l8b.a;
            if (k8b.f((e8b) l46Var2.k(pr4Var))) {
                l46Var2.f0(1412038396);
                l46Var2.r(false);
                j2 = y72.e;
            } else {
                l46Var2.f0(1412038980);
                j2 = ((e8b) l46Var2.k(pr4Var)).u;
                l46Var2.r(false);
            }
            long j3 = j2;
            h0e h0eVarB = vx.b(i2 / 60.0f, b21.T(1000, 0, hs4.c, 2), "progress", null, l46Var2, 3072, 20);
            g09 g09Var = g09.a;
            j09 j09VarL = b.l(g09Var, 114.0f);
            lx0 lx0Var = ndb.f;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarL);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            FillElement fillElement = b.c;
            boolean zG = l46Var2.g(h0eVarB) | l46Var2.f(j3);
            Object objR = l46Var2.R();
            if (zG || objR == sf2.a) {
                objR = new gz8(j3, h0eVarB, 1);
                l46Var2.p0(objR);
            }
            nk8.e(6, (a26) objR, l46Var2, fillElement);
            j09 j09VarE = oa7.E(k8b.h(b.l(g09Var, 108.0f), new agb(14), l46Var2, 6), a7c.a);
            long j4 = ((e8b) l46Var2.k(pr4Var)).c;
            if (we6.e(l46Var2)) {
                j4 = y72.j;
            }
            j09 j09VarO = tm7.o(j09VarE, j4, g21.f);
            xn8 xn8VarC2 = s21.c(lx0Var, false);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarO);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            gu6.b(od4.A(R.drawable.ic_microphone, 0, l46Var2), null, b.l(g09Var, 28.0f), ((e8b) l46Var2.k(pr4Var)).t, l46Var, 440, 0);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
            i5 = 60;
        } else {
            l46Var2.Z();
            i5 = i3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dq1(i2, i5, i4, 3);
        }
    }

    public static final void f(int i2, float f2, l46 l46Var, int i3) {
        l46Var.h0(1550143754);
        int i4 = (l46Var.e(i2) ? 4 : 2) | i3 | (l46Var.d(f2) ? 32 : 16);
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            o5c.f(l46Var, b.d(g09Var, 36.0f));
            d(i2, f2, l46Var, i4 & 126);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new wyf(i2, f2, i3);
        }
    }

    public static final float g(float f2) {
        float f3 = f2 % 360.0f;
        if (f3 < 0.0f) {
            f3 += 360.0f;
        }
        int iHSVToColor = Color.HSVToColor(new float[]{f3, 1.0f, 1.0f});
        return ((Color.blue(iHSVToColor) / 255.0f) * 0.114f) + ((Color.green(iHSVToColor) / 255.0f) * 0.587f) + ((Color.red(iHSVToColor) / 255.0f) * 0.299f);
    }

    public static final long h(long j2, float f2) {
        float[] fArr = new float[3];
        Color.colorToHSV(abg.Z(j2), fArr);
        float f3 = ((fArr[0] - 237.0f) + f2) % 360.0f;
        if (f3 < 0.0f) {
            f3 += 360.0f;
        }
        fArr[0] = f3;
        fArr[1] = mh3.n(mh3.n((1.0f - ((1.0f - g(f2)) * 0.3f)) / (1.0f - ((1.0f - g(237.0f)) * 0.3f)), 0.6f, 1.6f) * fArr[1], 0.0f, 1.0f);
        return abg.c(Color.HSVToColor(fArr));
    }
}
