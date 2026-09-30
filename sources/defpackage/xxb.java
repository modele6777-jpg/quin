package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xxb {
    public static final void a(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(36860908);
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            j09 j09VarA0 = ynb.a0(mh3.L(mh3.N(b.c(g09.a, 1.0f))), 16.0f, 12.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA0);
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
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i, 24);
        }
    }

    public static final void b(int i, x16 x16Var, x16 x16Var2, l46 l46Var, boolean z) {
        l46Var.h0(-1382182457);
        int i2 = (l46Var.h(z) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            a(af1.b0(-848343011, new ei4(x16Var, z, x16Var2), l46Var), l46Var, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new np1(z, x16Var, x16Var2, i, 4);
        }
    }

    public static final void c(int i, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        x16Var.getClass();
        l46Var.h0(-929182446);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            pa7.a(null, 0L, 0L, null, af1.b0(2050760732, new os1(i, 7), l46Var), null, false, false, x16Var, l46Var, ((i4 << 21) & 234881024) | 24576, 239);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r83(i, i2, x16Var);
        }
    }

    public static final void d(final int i, final String str, final boolean z, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final dd2 dd2Var, l46 l46Var, int i2) {
        str.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(745834608);
        int i3 = i2 | (l46Var.g(str) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if ((i2 & 196608) == 0) {
            i3 |= l46Var.i(x16Var3) ? 131072 : 65536;
        }
        if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
            g21.o(null, af1.b0(-1143929652, new n26() { // from class: dmc
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c31) obj).getClass();
                    int i4 = 1;
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        xdc.a(b.c, af1.b0(1782300296, new lk3(i, x16Var), l46Var2), af1.b0(-90913241, new np1(z, x16Var3, x16Var2, 5), l46Var2), null, null, 0, y72.j, 0L, null, af1.b0(1816905117, new i28(str, dd2Var, i4), l46Var2), l46Var2, 806879670, 440);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 48, 1);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t42(i, str, z, x16Var, x16Var2, x16Var3, dd2Var, i2);
        }
    }

    public static final void e(int i, x16 x16Var, l46 l46Var, String str, boolean z) {
        long j;
        str.getClass();
        x16Var.getClass();
        l46Var.h0(1777017178);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            j09 j09VarF = b.f(96.0f, 0.0f, b.c(g09.a, 1.0f), 2);
            y6c y6cVarB = a7c.b(20.0f);
            pr4 pr4Var = l8b.a;
            long j2 = ((e8b) l46Var.k(pr4Var)).g;
            float f = z ? 2.0f : 0.5f;
            if (z) {
                l46Var.f0(-1683464462);
                j = bx5.b(l46Var).a;
            } else {
                l46Var.f0(-1683463282);
                j = ((e8b) l46Var.k(pr4Var)).B;
            }
            l46Var.r(false);
            nae.c(x16Var, j09VarF, false, y6cVarB, j2, 0L, 0.0f, 0.0f, x57.b(j, f), null, af1.b0(972519727, new y01(z, str, 8), l46Var), l46Var, ((i2 >> 6) & 14) | 48, 740);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ku7(str, z, x16Var, i, 3);
        }
    }

    public static final void f(int i, x16 x16Var, l46 l46Var, j09 j09Var, String str, boolean z) {
        j09 j09Var2;
        str.getClass();
        x16Var.getClass();
        l46Var.h0(1106774016);
        int i2 = i | (l46Var.g(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        int i3 = i2 | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | 3072;
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            x4d x4dVar = eze.a(l46Var).a.a;
            bx9 bx9Var = v51.a;
            long j = bx5.b(l46Var).a;
            pr4 pr4Var = l8b.a;
            g09 g09Var = g09.a;
            cgg.a(x16Var, g09Var, z, x4dVar, v51.a(j, ((e8b) l46Var.k(pr4Var)).v, y72.b(bx5.b(l46Var).a, 0.38f), y72.b(((e8b) l46Var.k(pr4Var)).v, 0.38f), l46Var, 0), null, null, null, af1.b0(1113582096, new ob0(str, 22), l46Var), l46Var, ((i3 >> 6) & 14) | 805306416 | ((i3 << 3) & 896), 480);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a6a(str, z, x16Var, j09Var2, i);
        }
    }

    public static final void g(int i, x16 x16Var, l46 l46Var, j09 j09Var, String str) {
        j09 j09Var2;
        str.getClass();
        x16Var.getClass();
        l46Var.h0(-1154717458);
        int i2 = (l46Var.g(str) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16) | 384;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            g09 g09Var = g09.a;
            cgg.m(x16Var, g09Var, false, null, null, null, af1.b0(1454695505, new ob0(str, 23), l46Var), l46Var, ((i2 >> 3) & 14) | 805306416, 508);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r(str, x16Var, j09Var2, i, 3);
        }
    }

    public static final void h(int i, l46 l46Var, j09 j09Var, String str, String str2) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-884940816);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.g(str2) ? 32 : 16);
        int i3 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i3)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
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
            i(i2 & 14, l46Var2, null, str);
            mue mueVar = pue.a;
            nte.b(str2, b.c(g09.a, 1.0f), ((e8b) l46Var2.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, ((i2 >> 3) & 14) | 48, 0, 130040);
            l46Var2 = l46Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ke0(i, str, str2, j09Var, 4);
        }
    }

    public static final void i(int i, l46 l46Var, j09 j09Var, String str) {
        int i2;
        j09 j09Var2;
        str.getClass();
        l46Var.h0(-1103307200);
        if ((i & 6) == 0) {
            i2 = i | (l46Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            mue mueVar = pue.a;
            nte.b(str, j09VarC, ((e8b) l46Var.k(l8b.a)).q, 0L, null, cr5.c, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.m(l46Var), l46Var, i3 & 14, 0, 129912);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o43(str, j09Var2, i, 6, (byte) 0);
        }
    }

    public static final void j(d6f d6fVar, x16 x16Var, j09 j09Var, l46 l46Var, int i) {
        j09 j09Var2;
        d6fVar.getClass();
        x16Var.getClass();
        l46Var.h0(2088609912);
        int i2 = i | (l46Var.e(d6fVar.ordinal()) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | 384;
        boolean z = false;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            if (d6fVar != d6f.b && d6fVar != d6f.c) {
                z = true;
            }
            g09 g09Var = g09.a;
            j09 j09VarB = g21.B(g09Var, z, x16Var);
            x4d x4dVarB = a7c.b(20.0f);
            if (we6.e(l46Var)) {
                x4dVarB = g21.f;
            }
            x4d x4dVar = x4dVarB;
            long jB = y72.b(((m82) l46Var.k(o82.a)).r, 0.6f);
            if (we6.e(l46Var)) {
                jB = y72.j;
            }
            nae.a(j09VarB, x4dVar, jB, 0L, 0.0f, 0.0f, null, af1.b0(-2132550829, new z8d(11, d6fVar), l46Var), l46Var, 12582912, 120);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, d6fVar, x16Var, j09Var2, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:112:0x0232  */
    /* JADX WARN: Code duplicated, block: B:114:0x0236  */
    /* JADX WARN: Code duplicated, block: B:116:0x023e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0241  */
    /* JADX WARN: Code duplicated, block: B:120:0x026c  */
    /* JADX WARN: Code duplicated, block: B:121:0x026e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0286  */
    /* JADX WARN: Code duplicated, block: B:127:0x028f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0295 A[PHI: r4
  0x0295: PHI (r4v26 mue) = (r4v21 mue), (r4v27 mue) binds: [B:129:0x0293, B:125:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x0297  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    /* JADX WARN: Code duplicated, block: B:81:0x010e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0116  */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0145  */
    /* JADX WARN: Code duplicated, block: B:92:0x014b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0154  */
    /* JADX WARN: Code duplicated, block: B:97:0x0182  */
    public static final void k(final int i, final z67 z67Var, final a26 a26Var, final j09 j09Var, final String[] strArr, xi xiVar, float f, int i2, float f2, mue mueVar, a26 a26Var2, l46 l46Var, final int i3, final int i4) {
        float f3;
        int i5;
        float f4;
        int i6;
        int i7;
        a26 a26Var3;
        char c;
        boolean z;
        final xi xiVar2;
        final mue mueVar2;
        final float f5;
        final float f6;
        final a26 a26Var4;
        final int i8;
        ojb ojbVarV;
        jx0 jx0Var;
        float f7;
        mue mueVarA;
        int i9;
        int i10;
        float f8;
        a26 a26Var5;
        xi xiVar3;
        final int i11;
        int iO;
        j18 j18VarA;
        m8c m8cVar;
        boolean zG;
        Object obj;
        ard ardVarE0;
        boolean zG2;
        Object obj2;
        e89 e89VarI;
        e89 e89VarI2;
        e89 e89VarI3;
        boolean zG3;
        Object s3gVar;
        ard ardVar;
        a26 a26Var6;
        int i12;
        int i13;
        final j18 j18Var;
        lx0 lx0Var;
        final lx0 lx0Var2;
        int i14;
        mue mueVar3;
        int i15;
        int i16;
        final float f9;
        Object obj3;
        a26Var.getClass();
        l46Var.h0(-1764148262);
        int i17 = i3 | (l46Var.e(i) ? 4 : 2) | (l46Var.i(z67Var) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(strArr) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i18 = 196608 | i17;
        int i19 = i4 & 64;
        if (i19 == 0) {
            if ((i3 & 1572864) == 0) {
                f3 = f;
                i18 |= l46Var.d(f3) ? 1048576 : 524288;
            }
            i5 = i18 | 12582912;
            if ((i3 & 100663296) == 0) {
                if ((i4 & 256) == 0) {
                    f4 = f2;
                    int i20 = l46Var.d(f4) ? 67108864 : 33554432;
                    i5 |= i20;
                } else {
                    f4 = f2;
                }
                i5 |= i20;
            } else {
                f4 = f2;
            }
            i6 = i5 | (((i4 & 512) == 0 || !l46Var.g(mueVar)) ? 268435456 : 536870912);
            i7 = i4 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i7 != 0) {
                c = 6;
                a26Var3 = a26Var2;
            } else {
                a26Var3 = a26Var2;
                if (l46Var.i(a26Var3)) {
                    c = 4;
                } else {
                    c = 2;
                }
            }
            if ((i6 & 306783379) == 306783378 || (c & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i6 & 1, z)) {
                l46Var.b0();
                if ((i3 & 1) != 0 || l46Var.C()) {
                    jx0Var = ndb.Z;
                    if (i19 != 0) {
                        float f10 = m3g.b;
                        f3 = 36.0f;
                    }
                    if ((i4 & 256) != 0) {
                        f7 = 5.0f * f3;
                        i6 &= -234881025;
                    } else {
                        f7 = f4;
                    }
                    if ((i4 & 512) != 0) {
                        mue mueVar4 = pue.a;
                        mueVarA = mue.a(pue.b(l46Var), 0L, m3g.a, null, null, 0L, null, 0, 0L, null, null, 16777213);
                        i6 &= -1879048193;
                    } else {
                        mueVarA = mueVar;
                    }
                    if (i7 != 0) {
                        xiVar3 = jx0Var;
                        i9 = i6;
                        i10 = 5;
                        f8 = f3;
                        a26Var5 = null;
                    } else {
                        i9 = i6;
                        i10 = 5;
                        f8 = f3;
                        a26Var5 = a26Var3;
                        xiVar3 = jx0Var;
                    }
                } else {
                    l46Var.Z();
                    if ((i4 & 256) != 0) {
                        i6 &= -234881025;
                    }
                    if ((i4 & 512) != 0) {
                        i6 &= -1879048193;
                    }
                    i10 = i2;
                    f8 = f3;
                    i9 = i6;
                    f7 = f4;
                    a26Var5 = a26Var3;
                    xiVar3 = xiVar;
                    mueVarA = mueVar;
                }
                l46Var.s();
                int i21 = z67Var.b;
                int i22 = z67Var.a;
                int i23 = i21 - i22;
                i11 = i23 + 1;
                iO = mh3.o(i - i22, 0, i23);
                j18VarA = k18.a(iO, 2, l46Var);
                m8cVar = m8c.d;
                zG = l46Var.g(j18VarA);
                Object objR = l46Var.R();
                Object obj4 = sf2.a;
                obj = objR;
                if (zG || objR == obj4) {
                    Object e18Var = new e18(j18VarA, m8cVar);
                    l46Var.p0(e18Var);
                    obj = e18Var;
                }
                ardVarE0 = ynb.e0((erd) obj, l46Var);
                Integer numValueOf = Integer.valueOf(i);
                zG2 = l46Var.g(j18VarA) | l46Var.e(iO);
                float f11 = f7;
                Object objR2 = l46Var.R();
                if (!zG2 || objR2 == obj4) {
                    Object q3gVar = new q3g(j18VarA, iO, null);
                    l46Var.p0(q3gVar);
                    obj2 = q3gVar;
                } else {
                    obj2 = objR2;
                }
                af1.p(numValueOf, z67Var, (l26) obj2, l46Var);
                e89VarI = q1c.i(Integer.valueOf(i), l46Var);
                e89VarI2 = q1c.i(a26Var, l46Var);
                e89VarI3 = q1c.i(a26Var5, l46Var);
                zG3 = l46Var.g(j18VarA) | l46Var.g(e89VarI3) | l46Var.e(i11) | l46Var.i(z67Var) | l46Var.g(e89VarI) | l46Var.g(e89VarI2);
                Object objR3 = l46Var.R();
                if (!zG3 || objR3 == obj4) {
                    ardVar = ardVarE0;
                    a26Var6 = a26Var5;
                    i12 = 1;
                    i13 = 0;
                    s3gVar = new s3g(j18VarA, i11, z67Var, e89VarI3, e89VarI, e89VarI2, null);
                    j18Var = j18VarA;
                    l46Var.p0(s3gVar);
                } else {
                    ardVar = ardVarE0;
                    a26Var6 = a26Var5;
                    j18Var = j18VarA;
                    i13 = 0;
                    s3gVar = objR3;
                    i12 = 1;
                }
                af1.p(j18Var, z67Var, (l26) s3gVar, l46Var);
                if (pa7.t(xiVar3, ndb.Y)) {
                    lx0Var = ndb.e;
                } else if (pa7.t(xiVar3, ndb.E0)) {
                    lx0Var = ndb.g;
                } else {
                    lx0Var = ndb.f;
                }
                lx0Var2 = lx0Var;
                bx9 bx9VarQ = ynb.q(0.0f, (f11 - f8) / 2.0f, i12);
                j09 j09VarF = oa7.F(b.d(j09Var, f11));
                int i24 = (l46Var.e(i11) ? 1 : 0) | (l46Var.i(strArr) ? 1 : 0) | (l46Var.i(z67Var) ? 1 : 0);
                if ((i9 & 3670016) == 1048576) {
                    i14 = i12;
                } else {
                    i14 = i13;
                }
                int i25 = (((i24 | i14) | (l46Var.g(j18Var) ? 1 : 0)) == true ? 1 : 0) | (l46Var.g(lx0Var2) ? 1 : 0);
                if (((i9 & 1879048192) ^ 805306368) > 536870912) {
                    mueVar3 = mueVarA;
                    if (!l46Var.g(mueVar3)) {
                        i15 = i12;
                    }
                    i16 = i25 | i15;
                    Object objR4 = l46Var.R();
                    if (i16 == 0 || objR4 == obj4) {
                        final mue mueVar5 = mueVar3;
                        f9 = f8;
                        Object obj5 = new a26() { // from class: o3g
                            @Override // defpackage.a26
                            public final Object d(Object obj6) {
                                v08 v08Var = (v08) obj6;
                                v08Var.getClass();
                                v08.Y(v08Var, i11, new ksf(19), new dd2(new ajd(strArr, z67Var, f9, j18Var, lx0Var2, mueVar5, 1), true, 1442050808), 4);
                                return wef.a;
                            }
                        };
                        mueVar3 = mueVar5;
                        l46Var.p0(obj5);
                        obj3 = obj5;
                    } else {
                        f9 = f8;
                        obj3 = objR4;
                    }
                    af1.s(j09VarF, j18Var, bx9VarQ, null, xiVar3, ardVar, false, null, (a26) obj3, l46Var, 196608, 408);
                    mueVar2 = mueVar3;
                    f5 = f9;
                    f6 = f11;
                    xiVar2 = xiVar3;
                    i8 = i10;
                    a26Var4 = a26Var6;
                } else {
                    mueVar3 = mueVarA;
                }
                if ((i9 & 805306368) == 536870912) {
                    i15 = i12;
                } else {
                    i15 = i13;
                }
                i16 = i25 | i15;
                Object objR5 = l46Var.R();
                if (i16 == 0) {
                    final mue mueVar6 = mueVar3;
                    f9 = f8;
                    Object obj6 = new a26() { // from class: o3g
                        @Override // defpackage.a26
                        public final Object d(Object obj7) {
                            v08 v08Var = (v08) obj7;
                            v08Var.getClass();
                            v08.Y(v08Var, i11, new ksf(19), new dd2(new ajd(strArr, z67Var, f9, j18Var, lx0Var2, mueVar6, 1), true, 1442050808), 4);
                            return wef.a;
                        }
                    };
                    mueVar3 = mueVar6;
                    l46Var.p0(obj6);
                    obj3 = obj6;
                } else {
                    final mue mueVar7 = mueVar3;
                    f9 = f8;
                    Object obj7 = new a26() { // from class: o3g
                        @Override // defpackage.a26
                        public final Object d(Object obj8) {
                            v08 v08Var = (v08) obj8;
                            v08Var.getClass();
                            v08.Y(v08Var, i11, new ksf(19), new dd2(new ajd(strArr, z67Var, f9, j18Var, lx0Var2, mueVar7, 1), true, 1442050808), 4);
                            return wef.a;
                        }
                    };
                    mueVar3 = mueVar7;
                    l46Var.p0(obj7);
                    obj3 = obj7;
                }
                af1.s(j09VarF, j18Var, bx9VarQ, null, xiVar3, ardVar, false, null, (a26) obj3, l46Var, 196608, 408);
                mueVar2 = mueVar3;
                f5 = f9;
                f6 = f11;
                xiVar2 = xiVar3;
                i8 = i10;
                a26Var4 = a26Var6;
            } else {
                l46Var.Z();
                xiVar2 = xiVar;
                mueVar2 = mueVar;
                f5 = f3;
                f6 = f4;
                a26Var4 = a26Var3;
                i8 = i2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: p3g
                    @Override // defpackage.l26
                    public final Object z(Object obj8, Object obj9) {
                        ((Integer) obj9).getClass();
                        int iP = k99.P(i3 | 1);
                        xxb.k(i, z67Var, a26Var, j09Var, strArr, xiVar2, f5, i8, f6, mueVar2, a26Var4, (l46) obj8, iP, i4);
                        return wef.a;
                    }
                };
            }
        }
        i18 = 1769472 | i17;
        f3 = f;
        i5 = i18 | 12582912;
        if ((i3 & 100663296) == 0) {
            if ((i4 & 256) == 0) {
                f4 = f2;
                if (l46Var.d(f4)) {
                }
                i5 |= i20;
            } else {
                f4 = f2;
            }
            i5 |= i20;
        } else {
            f4 = f2;
        }
        i6 = i5 | (((i4 & 512) == 0 || !l46Var.g(mueVar)) ? 268435456 : 536870912);
        i7 = i4 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i7 != 0) {
            c = 6;
            a26Var3 = a26Var2;
        } else {
            a26Var3 = a26Var2;
            if (l46Var.i(a26Var3)) {
                c = 4;
            } else {
                c = 2;
            }
        }
        if ((i6 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (l46Var.W(i6 & 1, z)) {
            l46Var.b0();
            if ((i3 & 1) != 0) {
                jx0Var = ndb.Z;
                if (i19 != 0) {
                    float f12 = m3g.b;
                    f3 = 36.0f;
                }
                if ((i4 & 256) != 0) {
                    f7 = 5.0f * f3;
                    i6 &= -234881025;
                } else {
                    f7 = f4;
                }
                if ((i4 & 512) != 0) {
                    mue mueVar8 = pue.a;
                    mueVarA = mue.a(pue.b(l46Var), 0L, m3g.a, null, null, 0L, null, 0, 0L, null, null, 16777213);
                    i6 &= -1879048193;
                } else {
                    mueVarA = mueVar;
                }
                if (i7 != 0) {
                    xiVar3 = jx0Var;
                    i9 = i6;
                    i10 = 5;
                    f8 = f3;
                    a26Var5 = null;
                } else {
                    i9 = i6;
                    i10 = 5;
                    f8 = f3;
                    a26Var5 = a26Var3;
                    xiVar3 = jx0Var;
                }
            } else {
                jx0Var = ndb.Z;
                if (i19 != 0) {
                    float f13 = m3g.b;
                    f3 = 36.0f;
                }
                if ((i4 & 256) != 0) {
                    f7 = 5.0f * f3;
                    i6 &= -234881025;
                } else {
                    f7 = f4;
                }
                if ((i4 & 512) != 0) {
                    mue mueVar9 = pue.a;
                    mueVarA = mue.a(pue.b(l46Var), 0L, m3g.a, null, null, 0L, null, 0, 0L, null, null, 16777213);
                    i6 &= -1879048193;
                } else {
                    mueVarA = mueVar;
                }
                if (i7 != 0) {
                    xiVar3 = jx0Var;
                    i9 = i6;
                    i10 = 5;
                    f8 = f3;
                    a26Var5 = null;
                } else {
                    i9 = i6;
                    i10 = 5;
                    f8 = f3;
                    a26Var5 = a26Var3;
                    xiVar3 = jx0Var;
                }
            }
            l46Var.s();
            int i26 = z67Var.b;
            int i27 = z67Var.a;
            int i28 = i26 - i27;
            i11 = i28 + 1;
            iO = mh3.o(i - i27, 0, i28);
            j18VarA = k18.a(iO, 2, l46Var);
            m8cVar = m8c.d;
            zG = l46Var.g(j18VarA);
            Object objR6 = l46Var.R();
            Object obj8 = sf2.a;
            obj = objR6;
            if (zG) {
                Object e18Var2 = new e18(j18VarA, m8cVar);
                l46Var.p0(e18Var2);
                obj = e18Var2;
            } else {
                Object e18Var3 = new e18(j18VarA, m8cVar);
                l46Var.p0(e18Var3);
                obj = e18Var3;
            }
            ardVarE0 = ynb.e0((erd) obj, l46Var);
            Integer numValueOf2 = Integer.valueOf(i);
            zG2 = l46Var.g(j18VarA) | l46Var.e(iO);
            float f14 = f7;
            Object objR7 = l46Var.R();
            if (zG2) {
                Object q3gVar2 = new q3g(j18VarA, iO, null);
                l46Var.p0(q3gVar2);
                obj2 = q3gVar2;
            } else {
                Object q3gVar3 = new q3g(j18VarA, iO, null);
                l46Var.p0(q3gVar3);
                obj2 = q3gVar3;
            }
            af1.p(numValueOf2, z67Var, (l26) obj2, l46Var);
            e89VarI = q1c.i(Integer.valueOf(i), l46Var);
            e89VarI2 = q1c.i(a26Var, l46Var);
            e89VarI3 = q1c.i(a26Var5, l46Var);
            zG3 = l46Var.g(j18VarA) | l46Var.g(e89VarI3) | l46Var.e(i11) | l46Var.i(z67Var) | l46Var.g(e89VarI) | l46Var.g(e89VarI2);
            Object objR8 = l46Var.R();
            if (zG3) {
                ardVar = ardVarE0;
                a26Var6 = a26Var5;
                i12 = 1;
                i13 = 0;
                s3gVar = new s3g(j18VarA, i11, z67Var, e89VarI3, e89VarI, e89VarI2, null);
                j18Var = j18VarA;
                l46Var.p0(s3gVar);
            } else {
                ardVar = ardVarE0;
                a26Var6 = a26Var5;
                i12 = 1;
                i13 = 0;
                s3gVar = new s3g(j18VarA, i11, z67Var, e89VarI3, e89VarI, e89VarI2, null);
                j18Var = j18VarA;
                l46Var.p0(s3gVar);
            }
            af1.p(j18Var, z67Var, (l26) s3gVar, l46Var);
            if (pa7.t(xiVar3, ndb.Y)) {
                lx0Var = ndb.e;
            } else if (pa7.t(xiVar3, ndb.E0)) {
                lx0Var = ndb.g;
            } else {
                lx0Var = ndb.f;
            }
            lx0Var2 = lx0Var;
            bx9 bx9VarQ2 = ynb.q(0.0f, (f14 - f8) / 2.0f, i12);
            j09 j09VarF2 = oa7.F(b.d(j09Var, f14));
            int i29 = (l46Var.e(i11) ? 1 : 0) | (l46Var.i(strArr) ? 1 : 0) | (l46Var.i(z67Var) ? 1 : 0);
            if ((i9 & 3670016) == 1048576) {
                i14 = i12;
            } else {
                i14 = i13;
            }
            int i210 = (((i29 | i14) | (l46Var.g(j18Var) ? 1 : 0)) == true ? 1 : 0) | (l46Var.g(lx0Var2) ? 1 : 0);
            if (((i9 & 1879048192) ^ 805306368) > 536870912) {
                mueVar3 = mueVarA;
                if (!l46Var.g(mueVar3)) {
                    i15 = i12;
                }
                i16 = i210 | i15;
                Object objR9 = l46Var.R();
                if (i16 == 0) {
                    final mue mueVar10 = mueVar3;
                    f9 = f8;
                    Object obj9 = new a26() { // from class: o3g
                        @Override // defpackage.a26
                        public final Object d(Object obj10) {
                            v08 v08Var = (v08) obj10;
                            v08Var.getClass();
                            v08.Y(v08Var, i11, new ksf(19), new dd2(new ajd(strArr, z67Var, f9, j18Var, lx0Var2, mueVar10, 1), true, 1442050808), 4);
                            return wef.a;
                        }
                    };
                    mueVar3 = mueVar10;
                    l46Var.p0(obj9);
                    obj3 = obj9;
                } else {
                    final mue mueVar11 = mueVar3;
                    f9 = f8;
                    Object obj10 = new a26() { // from class: o3g
                        @Override // defpackage.a26
                        public final Object d(Object obj11) {
                            v08 v08Var = (v08) obj11;
                            v08Var.getClass();
                            v08.Y(v08Var, i11, new ksf(19), new dd2(new ajd(strArr, z67Var, f9, j18Var, lx0Var2, mueVar11, 1), true, 1442050808), 4);
                            return wef.a;
                        }
                    };
                    mueVar3 = mueVar11;
                    l46Var.p0(obj10);
                    obj3 = obj10;
                }
                af1.s(j09VarF2, j18Var, bx9VarQ2, null, xiVar3, ardVar, false, null, (a26) obj3, l46Var, 196608, 408);
                mueVar2 = mueVar3;
                f5 = f9;
                f6 = f14;
                xiVar2 = xiVar3;
                i8 = i10;
                a26Var4 = a26Var6;
            } else {
                mueVar3 = mueVarA;
            }
            if ((i9 & 805306368) == 536870912) {
                i15 = i12;
            } else {
                i15 = i13;
            }
            i16 = i210 | i15;
            Object objR10 = l46Var.R();
            if (i16 == 0) {
                final mue mueVar12 = mueVar3;
                f9 = f8;
                Object obj11 = new a26() { // from class: o3g
                    @Override // defpackage.a26
                    public final Object d(Object obj12) {
                        v08 v08Var = (v08) obj12;
                        v08Var.getClass();
                        v08.Y(v08Var, i11, new ksf(19), new dd2(new ajd(strArr, z67Var, f9, j18Var, lx0Var2, mueVar12, 1), true, 1442050808), 4);
                        return wef.a;
                    }
                };
                mueVar3 = mueVar12;
                l46Var.p0(obj11);
                obj3 = obj11;
            } else {
                final mue mueVar13 = mueVar3;
                f9 = f8;
                Object obj12 = new a26() { // from class: o3g
                    @Override // defpackage.a26
                    public final Object d(Object obj13) {
                        v08 v08Var = (v08) obj13;
                        v08Var.getClass();
                        v08.Y(v08Var, i11, new ksf(19), new dd2(new ajd(strArr, z67Var, f9, j18Var, lx0Var2, mueVar13, 1), true, 1442050808), 4);
                        return wef.a;
                    }
                };
                mueVar3 = mueVar13;
                l46Var.p0(obj12);
                obj3 = obj12;
            }
            af1.s(j09VarF2, j18Var, bx9VarQ2, null, xiVar3, ardVar, false, null, (a26) obj3, l46Var, 196608, 408);
            mueVar2 = mueVar3;
            f5 = f9;
            f6 = f14;
            xiVar2 = xiVar3;
            i8 = i10;
            a26Var4 = a26Var6;
        } else {
            l46Var.Z();
            xiVar2 = xiVar;
            mueVar2 = mueVar;
            f5 = f3;
            f6 = f4;
            a26Var4 = a26Var3;
            i8 = i2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: p3g
                @Override // defpackage.l26
                public final Object z(Object obj13, Object obj14) {
                    ((Integer) obj14).getClass();
                    int iP = k99.P(i3 | 1);
                    xxb.k(i, z67Var, a26Var, j09Var, strArr, xiVar2, f5, i8, f6, mueVar2, a26Var4, (l46) obj13, iP, i4);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0127  */
    /* JADX WARN: Code duplicated, block: B:89:0x012b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01de  */
    public static final void l(final j09 j09Var, float f, float f2, tc0 tc0Var, long j, final dd2 dd2Var, l46 l46Var, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        float f4;
        int i5;
        int i6;
        tc0 tc0Var2;
        int i7;
        long j2;
        boolean z;
        final float f5;
        final float f6;
        final tc0 tc0Var3;
        final long j3;
        ojb ojbVarV;
        float f7;
        boolean z2;
        ov7 ov7Var;
        int i8;
        int i9;
        l46Var.h0(1851071364);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                f3 = f;
                i3 |= l46Var.d(f3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    f4 = f2;
                    if (l46Var.d(f4)) {
                        i5 = 256;
                    } else {
                        i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        tc0Var2 = tc0Var;
                        if (l46Var.g(tc0Var2)) {
                            i7 = 2048;
                        } else {
                            i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            j2 = j;
                            if (l46Var.f(j2)) {
                                i9 = 16384;
                            }
                            i3 |= i9;
                        } else {
                            j2 = j;
                        }
                        i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        i3 |= i9;
                    } else {
                        j2 = j;
                    }
                    if ((196608 & i) == 0) {
                        if (l46Var.i(dd2Var)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i3 & 1, z)) {
                        l46Var.b0();
                        if ((i & 1) != 0 || l46Var.C()) {
                            if (i10 != 0) {
                                float f8 = m3g.b;
                                f7 = 180.0f;
                            } else {
                                f7 = f3;
                            }
                            if (i4 != 0) {
                                float f9 = m3g.b;
                                f4 = 36.0f;
                            }
                            if (i6 != 0) {
                                tc0Var2 = xc0.a;
                            }
                            if ((i2 & 16) != 0) {
                                float f10 = m3g.b;
                                i3 &= -57345;
                                j2 = ((e8b) l46Var.k(l8b.a)).b;
                            }
                        } else {
                            l46Var.Z();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            f7 = f3;
                        }
                        l46Var.s();
                        float f11 = (f7 - f4) / 2.0f;
                        j09 j09VarD = b.d(b.c(j09Var, 1.0f), f7);
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        float f12 = f4;
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ = m93.J(l46Var, j09VarD);
                        lf2.q.getClass();
                        l46Var.j0();
                        z2 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z2) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2 he2Var = hj6.z;
                        dec.l(he2Var, l46Var, xn8VarC);
                        he2 he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2 he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf);
                        dec.k(l46Var);
                        he2 he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ);
                        float f13 = f7;
                        s21.a(tm7.o(oa7.E(tm7.N(0.0f, f11, b.d(b.c(g09.a, 1.0f), f12), 1), a7c.b(m3g.b)), j2, g21.f), l46Var, 0);
                        FillElement fillElement = b.c;
                        int i11 = i3 >> 6;
                        int i12 = (i11 & 7168) | (i11 & 112) | 390;
                        t7c t7cVarA = s7c.a(tc0Var2, ndb.z, l46Var, ((i12 >> 3) & 14) | 48);
                        int iHashCode2 = Long.hashCode(l46Var.T);
                        u8a u8aVarM2 = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, fillElement);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, t7cVarA);
                        dec.l(he2Var2, l46Var, u8aVarM2);
                        ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ2);
                        dd2Var.m(v7c.a, l46Var, Integer.valueOf(((i12 >> 6) & 112) | 6));
                        l46Var.r(true);
                        l46Var.r(true);
                        f5 = f13;
                        f6 = f12;
                    } else {
                        l46Var.Z();
                        f5 = f3;
                        f6 = f4;
                    }
                    tc0Var3 = tc0Var2;
                    j3 = j2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: n3g
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                xxb.l(j09Var, f5, f6, tc0Var3, j3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 3072;
                tc0Var2 = tc0Var;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (l46Var.f(j2)) {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    } else {
                        j2 = j;
                    }
                    i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    i3 |= i9;
                } else {
                    j2 = j;
                }
                if ((196608 & i) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i3 & 1, z)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            float f14 = m3g.b;
                            f7 = 180.0f;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            float f15 = m3g.b;
                            f4 = 36.0f;
                        }
                        if (i6 != 0) {
                            tc0Var2 = xc0.a;
                        }
                        if ((i2 & 16) != 0) {
                            float f16 = m3g.b;
                            i3 &= -57345;
                            j2 = ((e8b) l46Var.k(l8b.a)).b;
                        }
                    } else {
                        if (i10 != 0) {
                            float f17 = m3g.b;
                            f7 = 180.0f;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            float f18 = m3g.b;
                            f4 = 36.0f;
                        }
                        if (i6 != 0) {
                            tc0Var2 = xc0.a;
                        }
                        if ((i2 & 16) != 0) {
                            float f19 = m3g.b;
                            i3 &= -57345;
                            j2 = ((e8b) l46Var.k(l8b.a)).b;
                        }
                    }
                    l46Var.s();
                    float f110 = (f7 - f4) / 2.0f;
                    j09 j09VarD2 = b.d(b.c(j09Var, 1.0f), f7);
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    float f111 = f4;
                    int iHashCode3 = Long.hashCode(l46Var.T);
                    u8a u8aVarM3 = l46Var.m();
                    j09 j09VarJ3 = m93.J(l46Var, j09VarD2);
                    lf2.q.getClass();
                    l46Var.j0();
                    z2 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z2) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var5 = hj6.z;
                    dec.l(he2Var5, l46Var, xn8VarC2);
                    he2 he2Var6 = hj6.y;
                    dec.l(he2Var6, l46Var, u8aVarM3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    he2 he2Var7 = hj6.X;
                    dec.l(he2Var7, l46Var, numValueOf2);
                    dec.k(l46Var);
                    he2 he2Var8 = hj6.x;
                    dec.l(he2Var8, l46Var, j09VarJ3);
                    float f112 = f7;
                    s21.a(tm7.o(oa7.E(tm7.N(0.0f, f110, b.d(b.c(g09.a, 1.0f), f111), 1), a7c.b(m3g.b)), j2, g21.f), l46Var, 0);
                    FillElement fillElement2 = b.c;
                    int i13 = i3 >> 6;
                    int i14 = (i13 & 7168) | (i13 & 112) | 390;
                    t7c t7cVarA2 = s7c.a(tc0Var2, ndb.z, l46Var, ((i14 >> 3) & 14) | 48);
                    int iHashCode4 = Long.hashCode(l46Var.T);
                    u8a u8aVarM4 = l46Var.m();
                    j09 j09VarJ4 = m93.J(l46Var, fillElement2);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var5, l46Var, t7cVarA2);
                    dec.l(he2Var6, l46Var, u8aVarM4);
                    ib8.s(iHashCode4, l46Var, he2Var7, l46Var);
                    dec.l(he2Var8, l46Var, j09VarJ4);
                    dd2Var.m(v7c.a, l46Var, Integer.valueOf(((i14 >> 6) & 112) | 6));
                    l46Var.r(true);
                    l46Var.r(true);
                    f5 = f112;
                    f6 = f111;
                } else {
                    l46Var.Z();
                    f5 = f3;
                    f6 = f4;
                }
                tc0Var3 = tc0Var2;
                j3 = j2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: n3g
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            xxb.l(j09Var, f5, f6, tc0Var3, j3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 384;
            f4 = f2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    tc0Var2 = tc0Var;
                    if (l46Var.g(tc0Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (l46Var.f(j2)) {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    } else {
                        j2 = j;
                    }
                    i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    i3 |= i9;
                } else {
                    j2 = j;
                }
                if ((196608 & i) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i3 & 1, z)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            float f113 = m3g.b;
                            f7 = 180.0f;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            float f114 = m3g.b;
                            f4 = 36.0f;
                        }
                        if (i6 != 0) {
                            tc0Var2 = xc0.a;
                        }
                        if ((i2 & 16) != 0) {
                            float f115 = m3g.b;
                            i3 &= -57345;
                            j2 = ((e8b) l46Var.k(l8b.a)).b;
                        }
                    } else {
                        if (i10 != 0) {
                            float f116 = m3g.b;
                            f7 = 180.0f;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            float f117 = m3g.b;
                            f4 = 36.0f;
                        }
                        if (i6 != 0) {
                            tc0Var2 = xc0.a;
                        }
                        if ((i2 & 16) != 0) {
                            float f118 = m3g.b;
                            i3 &= -57345;
                            j2 = ((e8b) l46Var.k(l8b.a)).b;
                        }
                    }
                    l46Var.s();
                    float f119 = (f7 - f4) / 2.0f;
                    j09 j09VarD3 = b.d(b.c(j09Var, 1.0f), f7);
                    xn8 xn8VarC3 = s21.c(ndb.b, false);
                    float f1110 = f4;
                    int iHashCode5 = Long.hashCode(l46Var.T);
                    u8a u8aVarM5 = l46Var.m();
                    j09 j09VarJ5 = m93.J(l46Var, j09VarD3);
                    lf2.q.getClass();
                    l46Var.j0();
                    z2 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z2) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var9 = hj6.z;
                    dec.l(he2Var9, l46Var, xn8VarC3);
                    he2 he2Var10 = hj6.y;
                    dec.l(he2Var10, l46Var, u8aVarM5);
                    Integer numValueOf3 = Integer.valueOf(iHashCode5);
                    he2 he2Var11 = hj6.X;
                    dec.l(he2Var11, l46Var, numValueOf3);
                    dec.k(l46Var);
                    he2 he2Var12 = hj6.x;
                    dec.l(he2Var12, l46Var, j09VarJ5);
                    float f1111 = f7;
                    s21.a(tm7.o(oa7.E(tm7.N(0.0f, f119, b.d(b.c(g09.a, 1.0f), f1110), 1), a7c.b(m3g.b)), j2, g21.f), l46Var, 0);
                    FillElement fillElement3 = b.c;
                    int i15 = i3 >> 6;
                    int i16 = (i15 & 7168) | (i15 & 112) | 390;
                    t7c t7cVarA3 = s7c.a(tc0Var2, ndb.z, l46Var, ((i16 >> 3) & 14) | 48);
                    int iHashCode6 = Long.hashCode(l46Var.T);
                    u8a u8aVarM6 = l46Var.m();
                    j09 j09VarJ6 = m93.J(l46Var, fillElement3);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var9, l46Var, t7cVarA3);
                    dec.l(he2Var10, l46Var, u8aVarM6);
                    ib8.s(iHashCode6, l46Var, he2Var11, l46Var);
                    dec.l(he2Var12, l46Var, j09VarJ6);
                    dd2Var.m(v7c.a, l46Var, Integer.valueOf(((i16 >> 6) & 112) | 6));
                    l46Var.r(true);
                    l46Var.r(true);
                    f5 = f1111;
                    f6 = f1110;
                } else {
                    l46Var.Z();
                    f5 = f3;
                    f6 = f4;
                }
                tc0Var3 = tc0Var2;
                j3 = j2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: n3g
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            xxb.l(j09Var, f5, f6, tc0Var3, j3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            tc0Var2 = tc0Var;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (l46Var.f(j2)) {
                        i9 = 16384;
                    }
                    i3 |= i9;
                } else {
                    j2 = j;
                }
                i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i3 |= i9;
            } else {
                j2 = j;
            }
            if ((196608 & i) == 0) {
                if (l46Var.i(dd2Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        float f1112 = m3g.b;
                        f7 = 180.0f;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        float f1113 = m3g.b;
                        f4 = 36.0f;
                    }
                    if (i6 != 0) {
                        tc0Var2 = xc0.a;
                    }
                    if ((i2 & 16) != 0) {
                        float f1114 = m3g.b;
                        i3 &= -57345;
                        j2 = ((e8b) l46Var.k(l8b.a)).b;
                    }
                } else {
                    if (i10 != 0) {
                        float f1115 = m3g.b;
                        f7 = 180.0f;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        float f1116 = m3g.b;
                        f4 = 36.0f;
                    }
                    if (i6 != 0) {
                        tc0Var2 = xc0.a;
                    }
                    if ((i2 & 16) != 0) {
                        float f1117 = m3g.b;
                        i3 &= -57345;
                        j2 = ((e8b) l46Var.k(l8b.a)).b;
                    }
                }
                l46Var.s();
                float f1118 = (f7 - f4) / 2.0f;
                j09 j09VarD4 = b.d(b.c(j09Var, 1.0f), f7);
                xn8 xn8VarC4 = s21.c(ndb.b, false);
                float f1119 = f4;
                int iHashCode7 = Long.hashCode(l46Var.T);
                u8a u8aVarM7 = l46Var.m();
                j09 j09VarJ7 = m93.J(l46Var, j09VarD4);
                lf2.q.getClass();
                l46Var.j0();
                z2 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z2) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var13 = hj6.z;
                dec.l(he2Var13, l46Var, xn8VarC4);
                he2 he2Var14 = hj6.y;
                dec.l(he2Var14, l46Var, u8aVarM7);
                Integer numValueOf4 = Integer.valueOf(iHashCode7);
                he2 he2Var15 = hj6.X;
                dec.l(he2Var15, l46Var, numValueOf4);
                dec.k(l46Var);
                he2 he2Var16 = hj6.x;
                dec.l(he2Var16, l46Var, j09VarJ7);
                float f11110 = f7;
                s21.a(tm7.o(oa7.E(tm7.N(0.0f, f1118, b.d(b.c(g09.a, 1.0f), f1119), 1), a7c.b(m3g.b)), j2, g21.f), l46Var, 0);
                FillElement fillElement4 = b.c;
                int i17 = i3 >> 6;
                int i18 = (i17 & 7168) | (i17 & 112) | 390;
                t7c t7cVarA4 = s7c.a(tc0Var2, ndb.z, l46Var, ((i18 >> 3) & 14) | 48);
                int iHashCode8 = Long.hashCode(l46Var.T);
                u8a u8aVarM8 = l46Var.m();
                j09 j09VarJ8 = m93.J(l46Var, fillElement4);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var13, l46Var, t7cVarA4);
                dec.l(he2Var14, l46Var, u8aVarM8);
                ib8.s(iHashCode8, l46Var, he2Var15, l46Var);
                dec.l(he2Var16, l46Var, j09VarJ8);
                dd2Var.m(v7c.a, l46Var, Integer.valueOf(((i18 >> 6) & 112) | 6));
                l46Var.r(true);
                l46Var.r(true);
                f5 = f11110;
                f6 = f1119;
            } else {
                l46Var.Z();
                f5 = f3;
                f6 = f4;
            }
            tc0Var3 = tc0Var2;
            j3 = j2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: n3g
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xxb.l(j09Var, f5, f6, tc0Var3, j3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 48;
        f3 = f;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                f4 = f2;
                if (l46Var.d(f4)) {
                    i5 = 256;
                } else {
                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    tc0Var2 = tc0Var;
                    if (l46Var.g(tc0Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (l46Var.f(j2)) {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    } else {
                        j2 = j;
                    }
                    i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    i3 |= i9;
                } else {
                    j2 = j;
                }
                if ((196608 & i) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i3 & 1, z)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            float f11111 = m3g.b;
                            f7 = 180.0f;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            float f11112 = m3g.b;
                            f4 = 36.0f;
                        }
                        if (i6 != 0) {
                            tc0Var2 = xc0.a;
                        }
                        if ((i2 & 16) != 0) {
                            float f11113 = m3g.b;
                            i3 &= -57345;
                            j2 = ((e8b) l46Var.k(l8b.a)).b;
                        }
                    } else {
                        if (i10 != 0) {
                            float f11114 = m3g.b;
                            f7 = 180.0f;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            float f11115 = m3g.b;
                            f4 = 36.0f;
                        }
                        if (i6 != 0) {
                            tc0Var2 = xc0.a;
                        }
                        if ((i2 & 16) != 0) {
                            float f11116 = m3g.b;
                            i3 &= -57345;
                            j2 = ((e8b) l46Var.k(l8b.a)).b;
                        }
                    }
                    l46Var.s();
                    float f11117 = (f7 - f4) / 2.0f;
                    j09 j09VarD5 = b.d(b.c(j09Var, 1.0f), f7);
                    xn8 xn8VarC5 = s21.c(ndb.b, false);
                    float f11118 = f4;
                    int iHashCode9 = Long.hashCode(l46Var.T);
                    u8a u8aVarM9 = l46Var.m();
                    j09 j09VarJ9 = m93.J(l46Var, j09VarD5);
                    lf2.q.getClass();
                    l46Var.j0();
                    z2 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z2) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var17 = hj6.z;
                    dec.l(he2Var17, l46Var, xn8VarC5);
                    he2 he2Var18 = hj6.y;
                    dec.l(he2Var18, l46Var, u8aVarM9);
                    Integer numValueOf5 = Integer.valueOf(iHashCode9);
                    he2 he2Var19 = hj6.X;
                    dec.l(he2Var19, l46Var, numValueOf5);
                    dec.k(l46Var);
                    he2 he2Var110 = hj6.x;
                    dec.l(he2Var110, l46Var, j09VarJ9);
                    float f11119 = f7;
                    s21.a(tm7.o(oa7.E(tm7.N(0.0f, f11117, b.d(b.c(g09.a, 1.0f), f11118), 1), a7c.b(m3g.b)), j2, g21.f), l46Var, 0);
                    FillElement fillElement5 = b.c;
                    int i19 = i3 >> 6;
                    int i110 = (i19 & 7168) | (i19 & 112) | 390;
                    t7c t7cVarA5 = s7c.a(tc0Var2, ndb.z, l46Var, ((i110 >> 3) & 14) | 48);
                    int iHashCode10 = Long.hashCode(l46Var.T);
                    u8a u8aVarM10 = l46Var.m();
                    j09 j09VarJ10 = m93.J(l46Var, fillElement5);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var17, l46Var, t7cVarA5);
                    dec.l(he2Var18, l46Var, u8aVarM10);
                    ib8.s(iHashCode10, l46Var, he2Var19, l46Var);
                    dec.l(he2Var110, l46Var, j09VarJ10);
                    dd2Var.m(v7c.a, l46Var, Integer.valueOf(((i110 >> 6) & 112) | 6));
                    l46Var.r(true);
                    l46Var.r(true);
                    f5 = f11119;
                    f6 = f11118;
                } else {
                    l46Var.Z();
                    f5 = f3;
                    f6 = f4;
                }
                tc0Var3 = tc0Var2;
                j3 = j2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: n3g
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            xxb.l(j09Var, f5, f6, tc0Var3, j3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            tc0Var2 = tc0Var;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (l46Var.f(j2)) {
                        i9 = 16384;
                    }
                    i3 |= i9;
                } else {
                    j2 = j;
                }
                i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i3 |= i9;
            } else {
                j2 = j;
            }
            if ((196608 & i) == 0) {
                if (l46Var.i(dd2Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        float f111110 = m3g.b;
                        f7 = 180.0f;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        float f111111 = m3g.b;
                        f4 = 36.0f;
                    }
                    if (i6 != 0) {
                        tc0Var2 = xc0.a;
                    }
                    if ((i2 & 16) != 0) {
                        float f111112 = m3g.b;
                        i3 &= -57345;
                        j2 = ((e8b) l46Var.k(l8b.a)).b;
                    }
                } else {
                    if (i10 != 0) {
                        float f111113 = m3g.b;
                        f7 = 180.0f;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        float f111114 = m3g.b;
                        f4 = 36.0f;
                    }
                    if (i6 != 0) {
                        tc0Var2 = xc0.a;
                    }
                    if ((i2 & 16) != 0) {
                        float f111115 = m3g.b;
                        i3 &= -57345;
                        j2 = ((e8b) l46Var.k(l8b.a)).b;
                    }
                }
                l46Var.s();
                float f111116 = (f7 - f4) / 2.0f;
                j09 j09VarD6 = b.d(b.c(j09Var, 1.0f), f7);
                xn8 xn8VarC6 = s21.c(ndb.b, false);
                float f111117 = f4;
                int iHashCode11 = Long.hashCode(l46Var.T);
                u8a u8aVarM11 = l46Var.m();
                j09 j09VarJ11 = m93.J(l46Var, j09VarD6);
                lf2.q.getClass();
                l46Var.j0();
                z2 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z2) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var111 = hj6.z;
                dec.l(he2Var111, l46Var, xn8VarC6);
                he2 he2Var112 = hj6.y;
                dec.l(he2Var112, l46Var, u8aVarM11);
                Integer numValueOf6 = Integer.valueOf(iHashCode11);
                he2 he2Var113 = hj6.X;
                dec.l(he2Var113, l46Var, numValueOf6);
                dec.k(l46Var);
                he2 he2Var114 = hj6.x;
                dec.l(he2Var114, l46Var, j09VarJ11);
                float f111118 = f7;
                s21.a(tm7.o(oa7.E(tm7.N(0.0f, f111116, b.d(b.c(g09.a, 1.0f), f111117), 1), a7c.b(m3g.b)), j2, g21.f), l46Var, 0);
                FillElement fillElement6 = b.c;
                int i111 = i3 >> 6;
                int i112 = (i111 & 7168) | (i111 & 112) | 390;
                t7c t7cVarA6 = s7c.a(tc0Var2, ndb.z, l46Var, ((i112 >> 3) & 14) | 48);
                int iHashCode12 = Long.hashCode(l46Var.T);
                u8a u8aVarM12 = l46Var.m();
                j09 j09VarJ12 = m93.J(l46Var, fillElement6);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var111, l46Var, t7cVarA6);
                dec.l(he2Var112, l46Var, u8aVarM12);
                ib8.s(iHashCode12, l46Var, he2Var113, l46Var);
                dec.l(he2Var114, l46Var, j09VarJ12);
                dd2Var.m(v7c.a, l46Var, Integer.valueOf(((i112 >> 6) & 112) | 6));
                l46Var.r(true);
                l46Var.r(true);
                f5 = f111118;
                f6 = f111117;
            } else {
                l46Var.Z();
                f5 = f3;
                f6 = f4;
            }
            tc0Var3 = tc0Var2;
            j3 = j2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: n3g
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xxb.l(j09Var, f5, f6, tc0Var3, j3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 384;
        f4 = f2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                tc0Var2 = tc0Var;
                if (l46Var.g(tc0Var2)) {
                    i7 = 2048;
                } else {
                    i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (l46Var.f(j2)) {
                        i9 = 16384;
                    }
                    i3 |= i9;
                } else {
                    j2 = j;
                }
                i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i3 |= i9;
            } else {
                j2 = j;
            }
            if ((196608 & i) == 0) {
                if (l46Var.i(dd2Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        float f111119 = m3g.b;
                        f7 = 180.0f;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        float f1111110 = m3g.b;
                        f4 = 36.0f;
                    }
                    if (i6 != 0) {
                        tc0Var2 = xc0.a;
                    }
                    if ((i2 & 16) != 0) {
                        float f1111111 = m3g.b;
                        i3 &= -57345;
                        j2 = ((e8b) l46Var.k(l8b.a)).b;
                    }
                } else {
                    if (i10 != 0) {
                        float f1111112 = m3g.b;
                        f7 = 180.0f;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        float f1111113 = m3g.b;
                        f4 = 36.0f;
                    }
                    if (i6 != 0) {
                        tc0Var2 = xc0.a;
                    }
                    if ((i2 & 16) != 0) {
                        float f1111114 = m3g.b;
                        i3 &= -57345;
                        j2 = ((e8b) l46Var.k(l8b.a)).b;
                    }
                }
                l46Var.s();
                float f1111115 = (f7 - f4) / 2.0f;
                j09 j09VarD7 = b.d(b.c(j09Var, 1.0f), f7);
                xn8 xn8VarC7 = s21.c(ndb.b, false);
                float f1111116 = f4;
                int iHashCode13 = Long.hashCode(l46Var.T);
                u8a u8aVarM13 = l46Var.m();
                j09 j09VarJ13 = m93.J(l46Var, j09VarD7);
                lf2.q.getClass();
                l46Var.j0();
                z2 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z2) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var115 = hj6.z;
                dec.l(he2Var115, l46Var, xn8VarC7);
                he2 he2Var116 = hj6.y;
                dec.l(he2Var116, l46Var, u8aVarM13);
                Integer numValueOf7 = Integer.valueOf(iHashCode13);
                he2 he2Var117 = hj6.X;
                dec.l(he2Var117, l46Var, numValueOf7);
                dec.k(l46Var);
                he2 he2Var118 = hj6.x;
                dec.l(he2Var118, l46Var, j09VarJ13);
                float f1111117 = f7;
                s21.a(tm7.o(oa7.E(tm7.N(0.0f, f1111115, b.d(b.c(g09.a, 1.0f), f1111116), 1), a7c.b(m3g.b)), j2, g21.f), l46Var, 0);
                FillElement fillElement7 = b.c;
                int i113 = i3 >> 6;
                int i114 = (i113 & 7168) | (i113 & 112) | 390;
                t7c t7cVarA7 = s7c.a(tc0Var2, ndb.z, l46Var, ((i114 >> 3) & 14) | 48);
                int iHashCode14 = Long.hashCode(l46Var.T);
                u8a u8aVarM14 = l46Var.m();
                j09 j09VarJ14 = m93.J(l46Var, fillElement7);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var115, l46Var, t7cVarA7);
                dec.l(he2Var116, l46Var, u8aVarM14);
                ib8.s(iHashCode14, l46Var, he2Var117, l46Var);
                dec.l(he2Var118, l46Var, j09VarJ14);
                dd2Var.m(v7c.a, l46Var, Integer.valueOf(((i114 >> 6) & 112) | 6));
                l46Var.r(true);
                l46Var.r(true);
                f5 = f1111117;
                f6 = f1111116;
            } else {
                l46Var.Z();
                f5 = f3;
                f6 = f4;
            }
            tc0Var3 = tc0Var2;
            j3 = j2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: n3g
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xxb.l(j09Var, f5, f6, tc0Var3, j3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 3072;
        tc0Var2 = tc0Var;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j2 = j;
                if (l46Var.f(j2)) {
                    i9 = 16384;
                }
                i3 |= i9;
            } else {
                j2 = j;
            }
            i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i3 |= i9;
        } else {
            j2 = j;
        }
        if ((196608 & i) == 0) {
            if (l46Var.i(dd2Var)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i3 & 1, z)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    float f1111118 = m3g.b;
                    f7 = 180.0f;
                } else {
                    f7 = f3;
                }
                if (i4 != 0) {
                    float f1111119 = m3g.b;
                    f4 = 36.0f;
                }
                if (i6 != 0) {
                    tc0Var2 = xc0.a;
                }
                if ((i2 & 16) != 0) {
                    float f11111110 = m3g.b;
                    i3 &= -57345;
                    j2 = ((e8b) l46Var.k(l8b.a)).b;
                }
            } else {
                if (i10 != 0) {
                    float f11111111 = m3g.b;
                    f7 = 180.0f;
                } else {
                    f7 = f3;
                }
                if (i4 != 0) {
                    float f11111112 = m3g.b;
                    f4 = 36.0f;
                }
                if (i6 != 0) {
                    tc0Var2 = xc0.a;
                }
                if ((i2 & 16) != 0) {
                    float f11111113 = m3g.b;
                    i3 &= -57345;
                    j2 = ((e8b) l46Var.k(l8b.a)).b;
                }
            }
            l46Var.s();
            float f11111114 = (f7 - f4) / 2.0f;
            j09 j09VarD8 = b.d(b.c(j09Var, 1.0f), f7);
            xn8 xn8VarC8 = s21.c(ndb.b, false);
            float f11111115 = f4;
            int iHashCode15 = Long.hashCode(l46Var.T);
            u8a u8aVarM15 = l46Var.m();
            j09 j09VarJ15 = m93.J(l46Var, j09VarD8);
            lf2.q.getClass();
            l46Var.j0();
            z2 = l46Var.S;
            ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var119 = hj6.z;
            dec.l(he2Var119, l46Var, xn8VarC8);
            he2 he2Var1110 = hj6.y;
            dec.l(he2Var1110, l46Var, u8aVarM15);
            Integer numValueOf8 = Integer.valueOf(iHashCode15);
            he2 he2Var1111 = hj6.X;
            dec.l(he2Var1111, l46Var, numValueOf8);
            dec.k(l46Var);
            he2 he2Var1112 = hj6.x;
            dec.l(he2Var1112, l46Var, j09VarJ15);
            float f11111116 = f7;
            s21.a(tm7.o(oa7.E(tm7.N(0.0f, f11111114, b.d(b.c(g09.a, 1.0f), f11111115), 1), a7c.b(m3g.b)), j2, g21.f), l46Var, 0);
            FillElement fillElement8 = b.c;
            int i115 = i3 >> 6;
            int i116 = (i115 & 7168) | (i115 & 112) | 390;
            t7c t7cVarA8 = s7c.a(tc0Var2, ndb.z, l46Var, ((i116 >> 3) & 14) | 48);
            int iHashCode16 = Long.hashCode(l46Var.T);
            u8a u8aVarM16 = l46Var.m();
            j09 j09VarJ16 = m93.J(l46Var, fillElement8);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var119, l46Var, t7cVarA8);
            dec.l(he2Var1110, l46Var, u8aVarM16);
            ib8.s(iHashCode16, l46Var, he2Var1111, l46Var);
            dec.l(he2Var1112, l46Var, j09VarJ16);
            dd2Var.m(v7c.a, l46Var, Integer.valueOf(((i116 >> 6) & 112) | 6));
            l46Var.r(true);
            l46Var.r(true);
            f5 = f11111116;
            f6 = f11111115;
        } else {
            l46Var.Z();
            f5 = f3;
            f6 = f4;
        }
        tc0Var3 = tc0Var2;
        j3 = j2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: n3g
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xxb.l(j09Var, f5, f6, tc0Var3, j3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    public static final int m(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final long n(long j, hkb hkbVar) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = hkbVar.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = hkbVar.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = hkbVar.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = hkbVar.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public static final ArrayList o(ArrayList arrayList, List list, c36 c36Var) {
        tt7 tt7VarF;
        list.getClass();
        arrayList.size();
        list.size();
        ArrayList<iy9> arrayListR1 = s72.r1(arrayList, list);
        ArrayList arrayList2 = new ArrayList(t72.u(arrayListR1, 10));
        for (iy9 iy9Var : arrayListR1) {
            tt7 tt7Var = (tt7) iy9Var.a();
            xrf xrfVar = (xrf) iy9Var.b();
            int i = xrfVar.g;
            h10 annotations = xrfVar.getAnnotations();
            t99 name = xrfVar.getName();
            name.getClass();
            boolean zE0 = xrfVar.E0();
            boolean z = xrfVar.w;
            boolean z2 = xrfVar.x;
            if (xrfVar.y != null) {
                int i2 = qz3.a;
                w09 w09VarC = oz3.c(c36Var);
                w09VarC.getClass();
                tt7VarF = w09VarC.f().f(tt7Var);
            } else {
                tt7VarF = null;
            }
            tt7 tt7Var2 = tt7VarF;
            ntd ntdVarE = xrfVar.e();
            ntdVarE.getClass();
            arrayList2.add(new xrf(c36Var, null, i, annotations, name, tt7Var, zE0, z, z2, tt7Var2, ntdVarE));
        }
        return arrayList2;
    }

    public static final long p(ute uteVar, long j) {
        hl9 hl9Var;
        bv7 bv7VarE = uteVar.e();
        if (bv7VarE != null) {
            bv7 bv7VarB = uteVar.b();
            if (bv7VarB != null) {
                hl9Var = new hl9((bv7VarE.h() && bv7VarB.h()) ? bv7VarE.K(bv7VarB, j) : j);
            } else {
                hl9Var = null;
            }
            if (hl9Var != null) {
                return hl9Var.a;
            }
        }
        return j;
    }

    public static final ky7 q(u09 u09Var) {
        u09 u09Var2;
        u09Var.getClass();
        int i = qz3.a;
        Iterator it = u09Var.S().c0().e().iterator();
        while (true) {
            if (!it.hasNext()) {
                u09Var2 = null;
                break;
            }
            tt7 tt7Var = (tt7) it.next();
            if (!xr7.y(tt7Var)) {
                y22 y22VarM = tt7Var.c0().m();
                if (oz3.l(y22VarM, l22.CLASS) || oz3.l(y22VarM, l22.ENUM_CLASS)) {
                    y22VarM.getClass();
                    u09Var2 = (u09) y22VarM;
                    break;
                }
            }
        }
        if (u09Var2 == null) {
            return null;
        }
        dr8 dr8VarC0 = u09Var2.c0();
        ky7 ky7Var = dr8VarC0 instanceof ky7 ? (ky7) dr8VarC0 : null;
        return ky7Var == null ? q(u09Var2) : ky7Var;
    }

    public static final boolean r(float f, float f2, zt ztVar) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        zt ztVarA = cu.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            cu.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = ztVarA.b;
        if (rectF == null) {
            rectF = new RectF();
            ztVarA.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = ztVarA.a;
        RectF rectF2 = ztVarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        zt ztVarA2 = cu.a();
        ztVarA2.i(ztVar, ztVarA, 1);
        boolean zIsEmpty = ztVarA2.a.isEmpty();
        ztVarA2.k();
        ztVarA.k();
        return !zIsEmpty;
    }

    public static final boolean s(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static boolean t(e1a e1aVar) {
        return !c5e.u(e1aVar.b(), ".class", true);
    }

    public static final long u(long j, String str, long j2, long j3) {
        String property;
        int i = sce.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lE = c5e.E(property);
        if (lE == null) {
            yg5.n("System property '", str, "' has unrecognized value '", property);
            return 0L;
        }
        long jLongValue = lE.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int v(int i, int i2, String str) {
        return (int) u(i, str, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static vqg w(smg smgVar, kxa kxaVar, ArrayList arrayList, boolean z) {
        vqg vqgVarB;
        jcc.n("reduce", 1, arrayList);
        jcc.o(2, "reduce", arrayList);
        vqg vqgVarG = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
        if (!(vqgVarG instanceof qpg)) {
            qc0.j("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            vqgVarB = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
            if (vqgVarB instanceof fog) {
                qc0.j("Failed to parse initial value");
                return null;
            }
        } else {
            if (smgVar.p() == 0) {
                qc0.p("Empty array with no initial value error");
                return null;
            }
            vqgVarB = null;
        }
        qpg qpgVar = (qpg) vqgVarG;
        int iP = smgVar.p();
        int i = z ? 0 : iP - 1;
        int i2 = z ? iP - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (vqgVarB == null) {
            vqgVarB = smgVar.q(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (smgVar.s(i)) {
                vqgVarB = qpgVar.b(kxaVar, Arrays.asList(vqgVarB, smgVar.q(i), new vog(Double.valueOf(i)), smgVar));
                if (vqgVarB instanceof fog) {
                    qc0.p("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return vqgVarB;
    }

    public static smg x(smg smgVar, kxa kxaVar, uqg uqgVar, Boolean bool, Boolean bool2) {
        smg smgVar2 = new smg();
        Iterator itO = smgVar.o();
        while (itO.hasNext()) {
            int iIntValue = ((Integer) itO.next()).intValue();
            if (smgVar.s(iIntValue)) {
                vqg vqgVarB = uqgVar.b(kxaVar, Arrays.asList(smgVar.q(iIntValue), new vog(Double.valueOf(iIntValue)), smgVar));
                if (vqgVarB.a().equals(bool)) {
                    break;
                }
                if (bool2 == null || vqgVarB.a().equals(bool2)) {
                    smgVar2.r(iIntValue, vqgVarB);
                }
            }
        }
        return smgVar2;
    }
}
