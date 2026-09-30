package defpackage;

import ai.askquin.R;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import sun.misc.Unsafe;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q7c {
    /* JADX WARN: Code duplicated, block: B:102:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x012a  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x0137  */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0173  */
    /* JADX WARN: Code duplicated, block: B:123:0x0177  */
    /* JADX WARN: Code duplicated, block: B:126:0x018e  */
    /* JADX WARN: Code duplicated, block: B:127:0x019a  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:137:0x022d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0238  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    public static final void a(final j09 j09Var, final fy9 fy9Var, final String str, final String str2, b41 b41Var, int i, boolean z, final boolean z2, final x16 x16Var, l46 l46Var, final int i2, final int i3, final int i4) {
        j09 j09Var2;
        int i5;
        b41 b41Var2;
        int i6;
        int i7;
        int i8;
        final int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        boolean z4;
        final b41 b41Var3;
        final boolean z5;
        ojb ojbVarV;
        b41 b41Var4;
        boolean z6;
        pr4 pr4Var;
        final boolean zF;
        bx9 bx9Var;
        boolean z7;
        Object objR;
        long j;
        y6c y6cVar;
        int i14;
        int i15;
        l46Var.h0(-1183555927);
        if ((i2 & 6) == 0) {
            j09Var2 = j09Var;
            i5 = (l46Var.g(j09Var2) ? 4 : 2) | i2;
        } else {
            j09Var2 = j09Var;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? l46Var.g(fy9Var) : l46Var.i(fy9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i5 |= l46Var.g(str2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i16 = i4 & 16;
        if (i16 == 0) {
            if ((i2 & 24576) == 0) {
                b41Var2 = b41Var;
                i5 |= l46Var.g(b41Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((i4 & 32) != 0) {
                i5 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (l46Var.g(null)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i5 |= i6;
            }
            i7 = 1572864 | i5;
            i8 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i8 != 0) {
                if ((12582912 & i2) == 0) {
                    i9 = i;
                    if (l46Var.e(i9)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i7 |= i10;
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                    i7 |= 100663296;
                    z3 = z;
                } else {
                    z3 = z;
                    if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z3)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i7 |= i12;
                    }
                }
                if ((i2 & 805306368) == 0) {
                    if (l46Var.h(z2)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i7 |= i15;
                }
                if ((i3 & 6) == 0) {
                    if (l46Var.i(x16Var)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i3 | i14;
                } else {
                    i13 = i3;
                }
                if ((i7 & 306783379) == 306783378 || (i13 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i7 & 1, z4)) {
                    if (i16 != 0) {
                        b41Var4 = null;
                    } else {
                        b41Var4 = b41Var2;
                    }
                    if (i8 != 0) {
                        i9 = 0;
                    }
                    if (i11 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    pr4Var = l8b.a;
                    zF = k8b.f((e8b) l46Var.k(pr4Var));
                    if (zF) {
                        bx9Var = new bx9(24.0f, 20.0f, 24.0f, 20.0f);
                    } else {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    final bx9 bx9Var2 = bx9Var;
                    j09 j09VarC = b.c(b.r(j09Var2), 1.0f);
                    z7 = (i7 & 1879048192) == 536870912;
                    objR = l46Var.R();
                    if (z7 || objR == sf2.a) {
                        objR = new pi2(z2, 7);
                        l46Var.p0(objR);
                    }
                    j09 j09VarB = vwc.b(j09VarC, false, (a26) objR);
                    l46Var.f0(769111674);
                    if (zF) {
                        l46Var.f0(769112692);
                        l46Var.r(false);
                        j = y72.j;
                    } else if (g21.S(l46Var)) {
                        l46Var.f0(769114140);
                        j = ((e8b) l46Var.k(pr4Var)).f;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(769115510);
                        j = ((e8b) l46Var.k(pr4Var)).m;
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                    rp1 rp1VarP = z5c.p(j, 0L, l46Var, 24576, 14);
                    if (zF) {
                        l46Var.f0(769117807);
                        y6cVar = eze.a(l46Var).a.j;
                    } else {
                        l46Var.f0(769118867);
                        y6cVar = ((s5d) l46Var.k(u5d.a)).e;
                    }
                    l46Var.r(false);
                    final boolean z8 = z6;
                    y6c y6cVar2 = y6cVar;
                    final String str3 = null;
                    final int i17 = i9;
                    final b41 b41Var5 = b41Var4;
                    bzd.c(x16Var, j09VarB, false, y6cVar2, rp1VarP, null, af1.b0(853307358, new n26() { // from class: ivd
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r22v3, types: [l46] */
                        /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
                        /* JADX WARN: Type inference failed for: r2v19, types: [int] */
                        /* JADX WARN: Type inference failed for: r2v44 */
                        /* JADX WARN: Type inference failed for: r2v46 */
                        /* JADX WARN: Type inference failed for: r8v10, types: [l46] */
                        /* JADX WARN: Type inference failed for: r8v11, types: [l46] */
                        /* JADX WARN: Type inference failed for: r8v13, types: [l46] */
                        /* JADX WARN: Type inference failed for: r8v16 */
                        /* JADX WARN: Type inference failed for: r8v17 */
                        /* JADX WARN: Type inference failed for: r8v18 */
                        /* JADX WARN: Type inference failed for: r8v19 */
                        /* JADX WARN: Type inference failed for: r8v7, types: [l46] */
                        /* JADX WARN: Type inference failed for: r8v9, types: [l46] */
                        @Override // defpackage.n26
                        public final Object m(Object obj, Object obj2, Object obj3) {
                            long j2;
                            y6c y6cVarB;
                            he2 he2Var;
                            he2 he2Var2;
                            ov7 ov7Var;
                            he2 he2Var3;
                            boolean z9;
                            l46 l46Var2;
                            boolean z10;
                            l46 l46Var3;
                            ?? r2;
                            ?? r8;
                            ?? r9;
                            l46 l46Var4 = (l46) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            lx0 lx0Var = ndb.f;
                            ((d92) obj).getClass();
                            if (l46Var4.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                g09 g09Var = g09.a;
                                j09 j09VarY = ynb.Y(g09Var, bx9Var2);
                                xn8 xn8VarC = s21.c(ndb.b, false);
                                int iHashCode = Long.hashCode(l46Var4.T);
                                u8a u8aVarM = l46Var4.m();
                                j09 j09VarJ = m93.J(l46Var4, j09VarY);
                                lf2.q.getClass();
                                l46Var4.j0();
                                boolean z11 = l46Var4.S;
                                ov7 ov7Var2 = LayoutNode.h1;
                                if (z11) {
                                    l46Var4.l(ov7Var2);
                                } else {
                                    l46Var4.s0();
                                }
                                he2 he2Var4 = hj6.z;
                                dec.l(he2Var4, l46Var4, xn8VarC);
                                he2 he2Var5 = hj6.y;
                                dec.l(he2Var5, l46Var4, u8aVarM);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                he2 he2Var6 = hj6.X;
                                dec.l(he2Var6, l46Var4, numValueOf);
                                dec.k(l46Var4);
                                he2 he2Var7 = hj6.x;
                                dec.l(he2Var7, l46Var4, j09VarJ);
                                j09 j09VarZ = ynb.Z(g09Var, we6.e(l46Var4) ? 0.0f : 4.0f);
                                float f = 4.0f;
                                t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(0)), ndb.z, l46Var4, 54);
                                int iHashCode2 = Long.hashCode(l46Var4.T);
                                u8a u8aVarM2 = l46Var4.m();
                                j09 j09VarJ2 = m93.J(l46Var4, j09VarZ);
                                l46Var4.j0();
                                if (l46Var4.S) {
                                    l46Var4.l(ov7Var2);
                                } else {
                                    l46Var4.s0();
                                }
                                dec.l(he2Var4, l46Var4, t7cVarA);
                                dec.l(he2Var5, l46Var4, u8aVarM2);
                                ib8.s(iHashCode2, l46Var4, he2Var6, l46Var4);
                                dec.l(he2Var7, l46Var4, j09VarJ2);
                                int i18 = 5;
                                fy9 fy9Var2 = fy9Var;
                                String str4 = str;
                                int i19 = 6;
                                if (fy9Var2 == null) {
                                    l46Var4.f0(12947258);
                                    l46Var4.r(false);
                                    he2Var5 = he2Var5;
                                    he2Var = he2Var7;
                                    he2Var2 = he2Var4;
                                    ov7Var = ov7Var2;
                                    str4 = str4;
                                    r2 = 0;
                                    z10 = true;
                                    f = 4.0f;
                                    lx0Var = lx0Var;
                                    he2Var3 = he2Var6;
                                    l46Var3 = l46Var4;
                                } else {
                                    l46Var4.f0(11659518);
                                    j09 j09VarH = k8b.h(k8b.g(g09Var, new agb(i18), l46Var4, 6), new agb(i19), l46Var4, 0);
                                    boolean z12 = zF;
                                    if (z12) {
                                        l46Var4.f0(-1523637033);
                                        j2 = ((e8b) l46Var4.k(l8b.a)).a;
                                    } else {
                                        l46Var4.f0(-1523636139);
                                        j2 = ((e8b) l46Var4.k(l8b.a)).m;
                                    }
                                    l46Var4.r(false);
                                    if (z12) {
                                        l46Var4.f0(-1523634592);
                                        l46Var4.r(false);
                                        y6cVarB = a7c.b(4.0f);
                                    } else {
                                        l46Var4.f0(-1523632462);
                                        y6cVarB = ((s5d) l46Var4.k(u5d.a)).e;
                                        l46Var4.r(false);
                                    }
                                    j09 j09VarO = tm7.o(j09VarH, j2, y6cVarB);
                                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                                    int iHashCode3 = Long.hashCode(l46Var4.T);
                                    u8a u8aVarM3 = l46Var4.m();
                                    j09 j09VarJ3 = m93.J(l46Var4, j09VarO);
                                    l46Var4.j0();
                                    if (l46Var4.S) {
                                        l46Var4.l(ov7Var2);
                                    } else {
                                        l46Var4.s0();
                                    }
                                    dec.l(he2Var4, l46Var4, xn8VarC2);
                                    dec.l(he2Var5, l46Var4, u8aVarM3);
                                    ib8.s(iHashCode3, l46Var4, he2Var6, l46Var4);
                                    dec.l(he2Var7, l46Var4, j09VarJ3);
                                    if (fy9Var2 != null) {
                                        l46Var4.f0(-1138844003);
                                        he2Var = he2Var7;
                                        he2Var3 = he2Var6;
                                        he2Var2 = he2Var4;
                                        ov7Var = ov7Var2;
                                        feg.j(fy9Var2, str4, null, null, an2.e, 0.0f, null, l46Var4, 24584, 108);
                                        l46 l46Var5 = l46Var4;
                                        z9 = false;
                                        l46Var5.r(false);
                                        l46Var2 = l46Var5;
                                    } else {
                                        he2Var = he2Var7;
                                        he2Var2 = he2Var4;
                                        ov7Var = ov7Var2;
                                        he2Var3 = he2Var6;
                                        l46Var4.f0(-1138624399);
                                        n16.h(0, 0, ynb.Z(g09Var, 0.0f), false, null, xo1.d, l46Var4, 200112, 16);
                                        z9 = false;
                                        l46Var4.r(false);
                                        l46Var2 = l46Var4;
                                    }
                                    z10 = true;
                                    l46Var2.r(true);
                                    l46Var2.r(z9);
                                    r2 = z9;
                                    l46Var3 = l46Var2;
                                }
                                jw7 jw7Var = new jw7(1.0f, z10);
                                c92 c92VarA = a92.a(new uc0(f, z10, new qc0(r2)), ndb.Y, l46Var3, 6);
                                int iHashCode4 = Long.hashCode(l46Var3.T);
                                u8a u8aVarM4 = l46Var3.m();
                                j09 j09VarJ4 = m93.J(l46Var3, jw7Var);
                                l46Var3.j0();
                                if (l46Var3.S) {
                                    l46Var3.l(ov7Var);
                                } else {
                                    l46Var3.s0();
                                }
                                dec.l(he2Var2, l46Var3, c92VarA);
                                dec.l(he2Var5, l46Var3, u8aVarM4);
                                ib8.s(iHashCode4, l46Var3, he2Var3, l46Var3);
                                he2 he2Var8 = he2Var;
                                dec.l(he2Var8, l46Var3, j09VarJ4);
                                String str5 = str2;
                                l46 l46Var6 = l46Var3;
                                he2 he2Var9 = he2Var5;
                                he2 he2Var10 = he2Var3;
                                he2 he2Var11 = he2Var2;
                                ?? r29 = r2;
                                lx0 lx0Var2 = lx0Var;
                                ov7 ov7Var3 = ov7Var;
                                nte.b(str4, null, 0L, w6c.l(str5 == null ? 21 : 15), ar5.c, null, 0L, null, null, w6c.l(24), 0, false, 0, 0, null, null, l46Var6, 1572864, 48, 260014);
                                ?? r10 = l46Var6;
                                if (str5 == null) {
                                    r10.f0(-1079338949);
                                    r10.r(r29);
                                    r8 = r10;
                                } else {
                                    r10.f0(-1079338948);
                                    nte.b(str5, null, ((m82) r10.k(o82.a)).g, w6c.l(12), null, null, 0L, null, null, w6c.l(16), 0, false, 0, 0, null, null, r10, 24576, 48, 260074);
                                    ?? r11 = r10;
                                    r11.r(r29);
                                    r8 = r11;
                                }
                                int i20 = i17;
                                if (i20 <= 0 || !z8) {
                                    r8.f0(-1078844188);
                                    r8.r(r29);
                                    r9 = r8;
                                } else {
                                    r8.f0(-1079073278);
                                    String strR = afc.r(R.string.spread_reads_cost, new Object[]{Integer.valueOf(i20)}, r8);
                                    mue mueVar = pue.a;
                                    ?? r22 = r8;
                                    nte.b(strR, null, ((e8b) r8.k(l8b.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, we6.e(r8) ? pue.g(r8) : pue.j(r8), r22, 0, 0, 131066);
                                    ?? r12 = r22;
                                    r12.r(r29);
                                    r9 = r12;
                                }
                                r9.r(true);
                                j09 j09VarL = b.l(g09Var, 48.0f);
                                xn8 xn8VarC3 = s21.c(lx0Var2, r29);
                                int iHashCode5 = Long.hashCode(r9.T);
                                u8a u8aVarM5 = r9.m();
                                j09 j09VarJ5 = m93.J(r9, j09VarL);
                                r9.j0();
                                if (r9.S) {
                                    r9.l(ov7Var3);
                                } else {
                                    r9.s0();
                                }
                                dec.l(he2Var11, r9, xn8VarC3);
                                dec.l(he2Var9, r9, u8aVarM5);
                                ib8.s(iHashCode5, r9, he2Var10, r9);
                                dec.l(he2Var8, r9, j09VarJ5);
                                Object objR2 = r9.R();
                                i8c i8cVar = sf2.a;
                                Object obj4 = objR2;
                                if (objR2 == i8cVar) {
                                    znd zndVar = new znd(3);
                                    r9.p0(zndVar);
                                    obj4 = zndVar;
                                }
                                j09 j09VarA = vwc.a(g09Var, (a26) obj4);
                                x16 x16Var2 = x16Var;
                                boolean zG = r9.g(x16Var2);
                                Object objR3 = r9.R();
                                Object obj5 = objR3;
                                if (zG || objR3 == i8cVar) {
                                    lnc lncVar = new lnc(5, x16Var2);
                                    r9.p0(lncVar);
                                    obj5 = lncVar;
                                }
                                qk2.i(z2, j09VarA, false, 20.0f, null, (a26) obj5, r9, 3072, 20);
                                r9.r(true);
                                r9.r(true);
                                String str6 = str3;
                                if (str6 == null) {
                                    r9.f0(1623524145);
                                    r9.r(r29);
                                } else {
                                    r9.f0(1623524146);
                                    q7c.g(ynb.d0(0.0f, 8.0f, 16.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), str6, b41Var5, r9, r29 == true ? 1 : 0);
                                    r9.r(r29);
                                }
                                r9.r(true);
                            } else {
                                l46Var4.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, (i13 & 14) | 100663296);
                    i9 = i17;
                    b41Var3 = b41Var5;
                    z5 = z8;
                } else {
                    l46Var.Z();
                    b41Var3 = b41Var2;
                    z5 = z3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: jvd
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q7c.a(j09Var, fy9Var, str, str2, b41Var3, i9, z5, z2, x16Var, (l46) obj, k99.P(i2 | 1), k99.P(i3), i4);
                            return wef.a;
                        }
                    };
                }
            }
            i7 = 14155776 | i5;
            i9 = i;
            i11 = i4 & 256;
            if (i11 != 0) {
                i7 |= 100663296;
                z3 = z;
            } else {
                z3 = z;
                if ((i2 & 100663296) == 0) {
                    if (l46Var.h(z3)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i7 |= i12;
                }
            }
            if ((i2 & 805306368) == 0) {
                if (l46Var.h(z2)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i7 |= i15;
            }
            if ((i3 & 6) == 0) {
                if (l46Var.i(x16Var)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i3 | i14;
            } else {
                i13 = i3;
            }
            if ((i7 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (l46Var.W(i7 & 1, z4)) {
                if (i16 != 0) {
                    b41Var4 = null;
                } else {
                    b41Var4 = b41Var2;
                }
                if (i8 != 0) {
                    i9 = 0;
                }
                if (i11 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                pr4Var = l8b.a;
                zF = k8b.f((e8b) l46Var.k(pr4Var));
                if (zF) {
                    bx9Var = new bx9(24.0f, 20.0f, 24.0f, 20.0f);
                } else {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                }
                final bx9 bx9Var3 = bx9Var;
                j09 j09VarC2 = b.c(b.r(j09Var2), 1.0f);
                if ((i7 & 1879048192) == 536870912) {
                }
                objR = l46Var.R();
                if (z7) {
                    objR = new pi2(z2, 7);
                    l46Var.p0(objR);
                } else {
                    objR = new pi2(z2, 7);
                    l46Var.p0(objR);
                }
                j09 j09VarB2 = vwc.b(j09VarC2, false, (a26) objR);
                l46Var.f0(769111674);
                if (zF) {
                    l46Var.f0(769112692);
                    l46Var.r(false);
                    j = y72.j;
                } else if (g21.S(l46Var)) {
                    l46Var.f0(769114140);
                    j = ((e8b) l46Var.k(pr4Var)).f;
                    l46Var.r(false);
                } else {
                    l46Var.f0(769115510);
                    j = ((e8b) l46Var.k(pr4Var)).m;
                    l46Var.r(false);
                }
                l46Var.r(false);
                rp1 rp1VarP2 = z5c.p(j, 0L, l46Var, 24576, 14);
                if (zF) {
                    l46Var.f0(769117807);
                    y6cVar = eze.a(l46Var).a.j;
                } else {
                    l46Var.f0(769118867);
                    y6cVar = ((s5d) l46Var.k(u5d.a)).e;
                }
                l46Var.r(false);
                final boolean z9 = z6;
                y6c y6cVar3 = y6cVar;
                final String str4 = null;
                final int i18 = i9;
                final b41 b41Var6 = b41Var4;
                bzd.c(x16Var, j09VarB2, false, y6cVar3, rp1VarP2, null, af1.b0(853307358, new n26() { // from class: ivd
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r22v3, types: [l46] */
                    /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
                    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v44 */
                    /* JADX WARN: Type inference failed for: r2v46 */
                    /* JADX WARN: Type inference failed for: r8v10, types: [l46] */
                    /* JADX WARN: Type inference failed for: r8v11, types: [l46] */
                    /* JADX WARN: Type inference failed for: r8v13, types: [l46] */
                    /* JADX WARN: Type inference failed for: r8v16 */
                    /* JADX WARN: Type inference failed for: r8v17 */
                    /* JADX WARN: Type inference failed for: r8v18 */
                    /* JADX WARN: Type inference failed for: r8v19 */
                    /* JADX WARN: Type inference failed for: r8v7, types: [l46] */
                    /* JADX WARN: Type inference failed for: r8v9, types: [l46] */
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        long j2;
                        y6c y6cVarB;
                        he2 he2Var;
                        he2 he2Var2;
                        ov7 ov7Var;
                        he2 he2Var3;
                        boolean z10;
                        l46 l46Var2;
                        boolean z11;
                        l46 l46Var3;
                        ?? r2;
                        ?? r8;
                        ?? r9;
                        l46 l46Var4 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        lx0 lx0Var = ndb.f;
                        ((d92) obj).getClass();
                        if (l46Var4.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                            g09 g09Var = g09.a;
                            j09 j09VarY = ynb.Y(g09Var, bx9Var3);
                            xn8 xn8VarC = s21.c(ndb.b, false);
                            int iHashCode = Long.hashCode(l46Var4.T);
                            u8a u8aVarM = l46Var4.m();
                            j09 j09VarJ = m93.J(l46Var4, j09VarY);
                            lf2.q.getClass();
                            l46Var4.j0();
                            boolean z12 = l46Var4.S;
                            ov7 ov7Var2 = LayoutNode.h1;
                            if (z12) {
                                l46Var4.l(ov7Var2);
                            } else {
                                l46Var4.s0();
                            }
                            he2 he2Var4 = hj6.z;
                            dec.l(he2Var4, l46Var4, xn8VarC);
                            he2 he2Var5 = hj6.y;
                            dec.l(he2Var5, l46Var4, u8aVarM);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            he2 he2Var6 = hj6.X;
                            dec.l(he2Var6, l46Var4, numValueOf);
                            dec.k(l46Var4);
                            he2 he2Var7 = hj6.x;
                            dec.l(he2Var7, l46Var4, j09VarJ);
                            j09 j09VarZ = ynb.Z(g09Var, we6.e(l46Var4) ? 0.0f : 4.0f);
                            float f = 4.0f;
                            t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(0)), ndb.z, l46Var4, 54);
                            int iHashCode2 = Long.hashCode(l46Var4.T);
                            u8a u8aVarM2 = l46Var4.m();
                            j09 j09VarJ2 = m93.J(l46Var4, j09VarZ);
                            l46Var4.j0();
                            if (l46Var4.S) {
                                l46Var4.l(ov7Var2);
                            } else {
                                l46Var4.s0();
                            }
                            dec.l(he2Var4, l46Var4, t7cVarA);
                            dec.l(he2Var5, l46Var4, u8aVarM2);
                            ib8.s(iHashCode2, l46Var4, he2Var6, l46Var4);
                            dec.l(he2Var7, l46Var4, j09VarJ2);
                            int i19 = 5;
                            fy9 fy9Var2 = fy9Var;
                            String str5 = str;
                            int i110 = 6;
                            if (fy9Var2 == null) {
                                l46Var4.f0(12947258);
                                l46Var4.r(false);
                                he2Var5 = he2Var5;
                                he2Var = he2Var7;
                                he2Var2 = he2Var4;
                                ov7Var = ov7Var2;
                                str5 = str5;
                                r2 = 0;
                                z11 = true;
                                f = 4.0f;
                                lx0Var = lx0Var;
                                he2Var3 = he2Var6;
                                l46Var3 = l46Var4;
                            } else {
                                l46Var4.f0(11659518);
                                j09 j09VarH = k8b.h(k8b.g(g09Var, new agb(i19), l46Var4, 6), new agb(i110), l46Var4, 0);
                                boolean z13 = zF;
                                if (z13) {
                                    l46Var4.f0(-1523637033);
                                    j2 = ((e8b) l46Var4.k(l8b.a)).a;
                                } else {
                                    l46Var4.f0(-1523636139);
                                    j2 = ((e8b) l46Var4.k(l8b.a)).m;
                                }
                                l46Var4.r(false);
                                if (z13) {
                                    l46Var4.f0(-1523634592);
                                    l46Var4.r(false);
                                    y6cVarB = a7c.b(4.0f);
                                } else {
                                    l46Var4.f0(-1523632462);
                                    y6cVarB = ((s5d) l46Var4.k(u5d.a)).e;
                                    l46Var4.r(false);
                                }
                                j09 j09VarO = tm7.o(j09VarH, j2, y6cVarB);
                                xn8 xn8VarC2 = s21.c(lx0Var, false);
                                int iHashCode3 = Long.hashCode(l46Var4.T);
                                u8a u8aVarM3 = l46Var4.m();
                                j09 j09VarJ3 = m93.J(l46Var4, j09VarO);
                                l46Var4.j0();
                                if (l46Var4.S) {
                                    l46Var4.l(ov7Var2);
                                } else {
                                    l46Var4.s0();
                                }
                                dec.l(he2Var4, l46Var4, xn8VarC2);
                                dec.l(he2Var5, l46Var4, u8aVarM3);
                                ib8.s(iHashCode3, l46Var4, he2Var6, l46Var4);
                                dec.l(he2Var7, l46Var4, j09VarJ3);
                                if (fy9Var2 != null) {
                                    l46Var4.f0(-1138844003);
                                    he2Var = he2Var7;
                                    he2Var3 = he2Var6;
                                    he2Var2 = he2Var4;
                                    ov7Var = ov7Var2;
                                    feg.j(fy9Var2, str5, null, null, an2.e, 0.0f, null, l46Var4, 24584, 108);
                                    l46 l46Var5 = l46Var4;
                                    z10 = false;
                                    l46Var5.r(false);
                                    l46Var2 = l46Var5;
                                } else {
                                    he2Var = he2Var7;
                                    he2Var2 = he2Var4;
                                    ov7Var = ov7Var2;
                                    he2Var3 = he2Var6;
                                    l46Var4.f0(-1138624399);
                                    n16.h(0, 0, ynb.Z(g09Var, 0.0f), false, null, xo1.d, l46Var4, 200112, 16);
                                    z10 = false;
                                    l46Var4.r(false);
                                    l46Var2 = l46Var4;
                                }
                                z11 = true;
                                l46Var2.r(true);
                                l46Var2.r(z10);
                                r2 = z10;
                                l46Var3 = l46Var2;
                            }
                            jw7 jw7Var = new jw7(1.0f, z11);
                            c92 c92VarA = a92.a(new uc0(f, z11, new qc0(r2)), ndb.Y, l46Var3, 6);
                            int iHashCode4 = Long.hashCode(l46Var3.T);
                            u8a u8aVarM4 = l46Var3.m();
                            j09 j09VarJ4 = m93.J(l46Var3, jw7Var);
                            l46Var3.j0();
                            if (l46Var3.S) {
                                l46Var3.l(ov7Var);
                            } else {
                                l46Var3.s0();
                            }
                            dec.l(he2Var2, l46Var3, c92VarA);
                            dec.l(he2Var5, l46Var3, u8aVarM4);
                            ib8.s(iHashCode4, l46Var3, he2Var3, l46Var3);
                            he2 he2Var8 = he2Var;
                            dec.l(he2Var8, l46Var3, j09VarJ4);
                            String str6 = str2;
                            l46 l46Var6 = l46Var3;
                            he2 he2Var9 = he2Var5;
                            he2 he2Var10 = he2Var3;
                            he2 he2Var11 = he2Var2;
                            ?? r29 = r2;
                            lx0 lx0Var2 = lx0Var;
                            ov7 ov7Var3 = ov7Var;
                            nte.b(str5, null, 0L, w6c.l(str6 == null ? 21 : 15), ar5.c, null, 0L, null, null, w6c.l(24), 0, false, 0, 0, null, null, l46Var6, 1572864, 48, 260014);
                            ?? r10 = l46Var6;
                            if (str6 == null) {
                                r10.f0(-1079338949);
                                r10.r(r29);
                                r8 = r10;
                            } else {
                                r10.f0(-1079338948);
                                nte.b(str6, null, ((m82) r10.k(o82.a)).g, w6c.l(12), null, null, 0L, null, null, w6c.l(16), 0, false, 0, 0, null, null, r10, 24576, 48, 260074);
                                ?? r11 = r10;
                                r11.r(r29);
                                r8 = r11;
                            }
                            int i20 = i18;
                            if (i20 <= 0 || !z9) {
                                r8.f0(-1078844188);
                                r8.r(r29);
                                r9 = r8;
                            } else {
                                r8.f0(-1079073278);
                                String strR = afc.r(R.string.spread_reads_cost, new Object[]{Integer.valueOf(i20)}, r8);
                                mue mueVar = pue.a;
                                ?? r22 = r8;
                                nte.b(strR, null, ((e8b) r8.k(l8b.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, we6.e(r8) ? pue.g(r8) : pue.j(r8), r22, 0, 0, 131066);
                                ?? r12 = r22;
                                r12.r(r29);
                                r9 = r12;
                            }
                            r9.r(true);
                            j09 j09VarL = b.l(g09Var, 48.0f);
                            xn8 xn8VarC3 = s21.c(lx0Var2, r29);
                            int iHashCode5 = Long.hashCode(r9.T);
                            u8a u8aVarM5 = r9.m();
                            j09 j09VarJ5 = m93.J(r9, j09VarL);
                            r9.j0();
                            if (r9.S) {
                                r9.l(ov7Var3);
                            } else {
                                r9.s0();
                            }
                            dec.l(he2Var11, r9, xn8VarC3);
                            dec.l(he2Var9, r9, u8aVarM5);
                            ib8.s(iHashCode5, r9, he2Var10, r9);
                            dec.l(he2Var8, r9, j09VarJ5);
                            Object objR2 = r9.R();
                            i8c i8cVar = sf2.a;
                            Object obj4 = objR2;
                            if (objR2 == i8cVar) {
                                znd zndVar = new znd(3);
                                r9.p0(zndVar);
                                obj4 = zndVar;
                            }
                            j09 j09VarA = vwc.a(g09Var, (a26) obj4);
                            x16 x16Var2 = x16Var;
                            boolean zG = r9.g(x16Var2);
                            Object objR3 = r9.R();
                            Object obj5 = objR3;
                            if (zG || objR3 == i8cVar) {
                                lnc lncVar = new lnc(5, x16Var2);
                                r9.p0(lncVar);
                                obj5 = lncVar;
                            }
                            qk2.i(z2, j09VarA, false, 20.0f, null, (a26) obj5, r9, 3072, 20);
                            r9.r(true);
                            r9.r(true);
                            String str7 = str4;
                            if (str7 == null) {
                                r9.f0(1623524145);
                                r9.r(r29);
                            } else {
                                r9.f0(1623524146);
                                q7c.g(ynb.d0(0.0f, 8.0f, 16.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), str7, b41Var6, r9, r29 == true ? 1 : 0);
                                r9.r(r29);
                            }
                            r9.r(true);
                        } else {
                            l46Var4.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, (i13 & 14) | 100663296);
                i9 = i18;
                b41Var3 = b41Var6;
                z5 = z9;
            } else {
                l46Var.Z();
                b41Var3 = b41Var2;
                z5 = z3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: jvd
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q7c.a(j09Var, fy9Var, str, str2, b41Var3, i9, z5, z2, x16Var, (l46) obj, k99.P(i2 | 1), k99.P(i3), i4);
                        return wef.a;
                    }
                };
            }
        }
        i5 |= 24576;
        b41Var2 = b41Var;
        if ((i4 & 32) != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if (l46Var.g(null)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i5 |= i6;
        }
        i7 = 1572864 | i5;
        i8 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i8 != 0) {
            if ((12582912 & i2) == 0) {
                i9 = i;
                if (l46Var.e(i9)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i7 |= i10;
            }
            i11 = i4 & 256;
            if (i11 != 0) {
                i7 |= 100663296;
                z3 = z;
            } else {
                z3 = z;
                if ((i2 & 100663296) == 0) {
                    if (l46Var.h(z3)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i7 |= i12;
                }
            }
            if ((i2 & 805306368) == 0) {
                if (l46Var.h(z2)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i7 |= i15;
            }
            if ((i3 & 6) == 0) {
                if (l46Var.i(x16Var)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i3 | i14;
            } else {
                i13 = i3;
            }
            if ((i7 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (l46Var.W(i7 & 1, z4)) {
                if (i16 != 0) {
                    b41Var4 = null;
                } else {
                    b41Var4 = b41Var2;
                }
                if (i8 != 0) {
                    i9 = 0;
                }
                if (i11 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                pr4Var = l8b.a;
                zF = k8b.f((e8b) l46Var.k(pr4Var));
                if (zF) {
                    bx9Var = new bx9(24.0f, 20.0f, 24.0f, 20.0f);
                } else {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                }
                final bx9 bx9Var4 = bx9Var;
                j09 j09VarC3 = b.c(b.r(j09Var2), 1.0f);
                if ((i7 & 1879048192) == 536870912) {
                }
                objR = l46Var.R();
                if (z7) {
                    objR = new pi2(z2, 7);
                    l46Var.p0(objR);
                } else {
                    objR = new pi2(z2, 7);
                    l46Var.p0(objR);
                }
                j09 j09VarB3 = vwc.b(j09VarC3, false, (a26) objR);
                l46Var.f0(769111674);
                if (zF) {
                    l46Var.f0(769112692);
                    l46Var.r(false);
                    j = y72.j;
                } else if (g21.S(l46Var)) {
                    l46Var.f0(769114140);
                    j = ((e8b) l46Var.k(pr4Var)).f;
                    l46Var.r(false);
                } else {
                    l46Var.f0(769115510);
                    j = ((e8b) l46Var.k(pr4Var)).m;
                    l46Var.r(false);
                }
                l46Var.r(false);
                rp1 rp1VarP3 = z5c.p(j, 0L, l46Var, 24576, 14);
                if (zF) {
                    l46Var.f0(769117807);
                    y6cVar = eze.a(l46Var).a.j;
                } else {
                    l46Var.f0(769118867);
                    y6cVar = ((s5d) l46Var.k(u5d.a)).e;
                }
                l46Var.r(false);
                final boolean z10 = z6;
                y6c y6cVar4 = y6cVar;
                final String str5 = null;
                final int i19 = i9;
                final b41 b41Var7 = b41Var4;
                bzd.c(x16Var, j09VarB3, false, y6cVar4, rp1VarP3, null, af1.b0(853307358, new n26() { // from class: ivd
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r22v3, types: [l46] */
                    /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
                    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v44 */
                    /* JADX WARN: Type inference failed for: r2v46 */
                    /* JADX WARN: Type inference failed for: r8v10, types: [l46] */
                    /* JADX WARN: Type inference failed for: r8v11, types: [l46] */
                    /* JADX WARN: Type inference failed for: r8v13, types: [l46] */
                    /* JADX WARN: Type inference failed for: r8v16 */
                    /* JADX WARN: Type inference failed for: r8v17 */
                    /* JADX WARN: Type inference failed for: r8v18 */
                    /* JADX WARN: Type inference failed for: r8v19 */
                    /* JADX WARN: Type inference failed for: r8v7, types: [l46] */
                    /* JADX WARN: Type inference failed for: r8v9, types: [l46] */
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        long j2;
                        y6c y6cVarB;
                        he2 he2Var;
                        he2 he2Var2;
                        ov7 ov7Var;
                        he2 he2Var3;
                        boolean z11;
                        l46 l46Var2;
                        boolean z12;
                        l46 l46Var3;
                        ?? r2;
                        ?? r8;
                        ?? r9;
                        l46 l46Var4 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        lx0 lx0Var = ndb.f;
                        ((d92) obj).getClass();
                        if (l46Var4.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                            g09 g09Var = g09.a;
                            j09 j09VarY = ynb.Y(g09Var, bx9Var4);
                            xn8 xn8VarC = s21.c(ndb.b, false);
                            int iHashCode = Long.hashCode(l46Var4.T);
                            u8a u8aVarM = l46Var4.m();
                            j09 j09VarJ = m93.J(l46Var4, j09VarY);
                            lf2.q.getClass();
                            l46Var4.j0();
                            boolean z13 = l46Var4.S;
                            ov7 ov7Var2 = LayoutNode.h1;
                            if (z13) {
                                l46Var4.l(ov7Var2);
                            } else {
                                l46Var4.s0();
                            }
                            he2 he2Var4 = hj6.z;
                            dec.l(he2Var4, l46Var4, xn8VarC);
                            he2 he2Var5 = hj6.y;
                            dec.l(he2Var5, l46Var4, u8aVarM);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            he2 he2Var6 = hj6.X;
                            dec.l(he2Var6, l46Var4, numValueOf);
                            dec.k(l46Var4);
                            he2 he2Var7 = hj6.x;
                            dec.l(he2Var7, l46Var4, j09VarJ);
                            j09 j09VarZ = ynb.Z(g09Var, we6.e(l46Var4) ? 0.0f : 4.0f);
                            float f = 4.0f;
                            t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(0)), ndb.z, l46Var4, 54);
                            int iHashCode2 = Long.hashCode(l46Var4.T);
                            u8a u8aVarM2 = l46Var4.m();
                            j09 j09VarJ2 = m93.J(l46Var4, j09VarZ);
                            l46Var4.j0();
                            if (l46Var4.S) {
                                l46Var4.l(ov7Var2);
                            } else {
                                l46Var4.s0();
                            }
                            dec.l(he2Var4, l46Var4, t7cVarA);
                            dec.l(he2Var5, l46Var4, u8aVarM2);
                            ib8.s(iHashCode2, l46Var4, he2Var6, l46Var4);
                            dec.l(he2Var7, l46Var4, j09VarJ2);
                            int i110 = 5;
                            fy9 fy9Var2 = fy9Var;
                            String str6 = str;
                            int i111 = 6;
                            if (fy9Var2 == null) {
                                l46Var4.f0(12947258);
                                l46Var4.r(false);
                                he2Var5 = he2Var5;
                                he2Var = he2Var7;
                                he2Var2 = he2Var4;
                                ov7Var = ov7Var2;
                                str6 = str6;
                                r2 = 0;
                                z12 = true;
                                f = 4.0f;
                                lx0Var = lx0Var;
                                he2Var3 = he2Var6;
                                l46Var3 = l46Var4;
                            } else {
                                l46Var4.f0(11659518);
                                j09 j09VarH = k8b.h(k8b.g(g09Var, new agb(i110), l46Var4, 6), new agb(i111), l46Var4, 0);
                                boolean z14 = zF;
                                if (z14) {
                                    l46Var4.f0(-1523637033);
                                    j2 = ((e8b) l46Var4.k(l8b.a)).a;
                                } else {
                                    l46Var4.f0(-1523636139);
                                    j2 = ((e8b) l46Var4.k(l8b.a)).m;
                                }
                                l46Var4.r(false);
                                if (z14) {
                                    l46Var4.f0(-1523634592);
                                    l46Var4.r(false);
                                    y6cVarB = a7c.b(4.0f);
                                } else {
                                    l46Var4.f0(-1523632462);
                                    y6cVarB = ((s5d) l46Var4.k(u5d.a)).e;
                                    l46Var4.r(false);
                                }
                                j09 j09VarO = tm7.o(j09VarH, j2, y6cVarB);
                                xn8 xn8VarC2 = s21.c(lx0Var, false);
                                int iHashCode3 = Long.hashCode(l46Var4.T);
                                u8a u8aVarM3 = l46Var4.m();
                                j09 j09VarJ3 = m93.J(l46Var4, j09VarO);
                                l46Var4.j0();
                                if (l46Var4.S) {
                                    l46Var4.l(ov7Var2);
                                } else {
                                    l46Var4.s0();
                                }
                                dec.l(he2Var4, l46Var4, xn8VarC2);
                                dec.l(he2Var5, l46Var4, u8aVarM3);
                                ib8.s(iHashCode3, l46Var4, he2Var6, l46Var4);
                                dec.l(he2Var7, l46Var4, j09VarJ3);
                                if (fy9Var2 != null) {
                                    l46Var4.f0(-1138844003);
                                    he2Var = he2Var7;
                                    he2Var3 = he2Var6;
                                    he2Var2 = he2Var4;
                                    ov7Var = ov7Var2;
                                    feg.j(fy9Var2, str6, null, null, an2.e, 0.0f, null, l46Var4, 24584, 108);
                                    l46 l46Var5 = l46Var4;
                                    z11 = false;
                                    l46Var5.r(false);
                                    l46Var2 = l46Var5;
                                } else {
                                    he2Var = he2Var7;
                                    he2Var2 = he2Var4;
                                    ov7Var = ov7Var2;
                                    he2Var3 = he2Var6;
                                    l46Var4.f0(-1138624399);
                                    n16.h(0, 0, ynb.Z(g09Var, 0.0f), false, null, xo1.d, l46Var4, 200112, 16);
                                    z11 = false;
                                    l46Var4.r(false);
                                    l46Var2 = l46Var4;
                                }
                                z12 = true;
                                l46Var2.r(true);
                                l46Var2.r(z11);
                                r2 = z11;
                                l46Var3 = l46Var2;
                            }
                            jw7 jw7Var = new jw7(1.0f, z12);
                            c92 c92VarA = a92.a(new uc0(f, z12, new qc0(r2)), ndb.Y, l46Var3, 6);
                            int iHashCode4 = Long.hashCode(l46Var3.T);
                            u8a u8aVarM4 = l46Var3.m();
                            j09 j09VarJ4 = m93.J(l46Var3, jw7Var);
                            l46Var3.j0();
                            if (l46Var3.S) {
                                l46Var3.l(ov7Var);
                            } else {
                                l46Var3.s0();
                            }
                            dec.l(he2Var2, l46Var3, c92VarA);
                            dec.l(he2Var5, l46Var3, u8aVarM4);
                            ib8.s(iHashCode4, l46Var3, he2Var3, l46Var3);
                            he2 he2Var8 = he2Var;
                            dec.l(he2Var8, l46Var3, j09VarJ4);
                            String str7 = str2;
                            l46 l46Var6 = l46Var3;
                            he2 he2Var9 = he2Var5;
                            he2 he2Var10 = he2Var3;
                            he2 he2Var11 = he2Var2;
                            ?? r29 = r2;
                            lx0 lx0Var2 = lx0Var;
                            ov7 ov7Var3 = ov7Var;
                            nte.b(str6, null, 0L, w6c.l(str7 == null ? 21 : 15), ar5.c, null, 0L, null, null, w6c.l(24), 0, false, 0, 0, null, null, l46Var6, 1572864, 48, 260014);
                            ?? r10 = l46Var6;
                            if (str7 == null) {
                                r10.f0(-1079338949);
                                r10.r(r29);
                                r8 = r10;
                            } else {
                                r10.f0(-1079338948);
                                nte.b(str7, null, ((m82) r10.k(o82.a)).g, w6c.l(12), null, null, 0L, null, null, w6c.l(16), 0, false, 0, 0, null, null, r10, 24576, 48, 260074);
                                ?? r11 = r10;
                                r11.r(r29);
                                r8 = r11;
                            }
                            int i20 = i19;
                            if (i20 <= 0 || !z10) {
                                r8.f0(-1078844188);
                                r8.r(r29);
                                r9 = r8;
                            } else {
                                r8.f0(-1079073278);
                                String strR = afc.r(R.string.spread_reads_cost, new Object[]{Integer.valueOf(i20)}, r8);
                                mue mueVar = pue.a;
                                ?? r22 = r8;
                                nte.b(strR, null, ((e8b) r8.k(l8b.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, we6.e(r8) ? pue.g(r8) : pue.j(r8), r22, 0, 0, 131066);
                                ?? r12 = r22;
                                r12.r(r29);
                                r9 = r12;
                            }
                            r9.r(true);
                            j09 j09VarL = b.l(g09Var, 48.0f);
                            xn8 xn8VarC3 = s21.c(lx0Var2, r29);
                            int iHashCode5 = Long.hashCode(r9.T);
                            u8a u8aVarM5 = r9.m();
                            j09 j09VarJ5 = m93.J(r9, j09VarL);
                            r9.j0();
                            if (r9.S) {
                                r9.l(ov7Var3);
                            } else {
                                r9.s0();
                            }
                            dec.l(he2Var11, r9, xn8VarC3);
                            dec.l(he2Var9, r9, u8aVarM5);
                            ib8.s(iHashCode5, r9, he2Var10, r9);
                            dec.l(he2Var8, r9, j09VarJ5);
                            Object objR2 = r9.R();
                            i8c i8cVar = sf2.a;
                            Object obj4 = objR2;
                            if (objR2 == i8cVar) {
                                znd zndVar = new znd(3);
                                r9.p0(zndVar);
                                obj4 = zndVar;
                            }
                            j09 j09VarA = vwc.a(g09Var, (a26) obj4);
                            x16 x16Var2 = x16Var;
                            boolean zG = r9.g(x16Var2);
                            Object objR3 = r9.R();
                            Object obj5 = objR3;
                            if (zG || objR3 == i8cVar) {
                                lnc lncVar = new lnc(5, x16Var2);
                                r9.p0(lncVar);
                                obj5 = lncVar;
                            }
                            qk2.i(z2, j09VarA, false, 20.0f, null, (a26) obj5, r9, 3072, 20);
                            r9.r(true);
                            r9.r(true);
                            String str8 = str5;
                            if (str8 == null) {
                                r9.f0(1623524145);
                                r9.r(r29);
                            } else {
                                r9.f0(1623524146);
                                q7c.g(ynb.d0(0.0f, 8.0f, 16.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), str8, b41Var7, r9, r29 == true ? 1 : 0);
                                r9.r(r29);
                            }
                            r9.r(true);
                        } else {
                            l46Var4.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, (i13 & 14) | 100663296);
                i9 = i19;
                b41Var3 = b41Var7;
                z5 = z10;
            } else {
                l46Var.Z();
                b41Var3 = b41Var2;
                z5 = z3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: jvd
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q7c.a(j09Var, fy9Var, str, str2, b41Var3, i9, z5, z2, x16Var, (l46) obj, k99.P(i2 | 1), k99.P(i3), i4);
                        return wef.a;
                    }
                };
            }
        }
        i7 = 14155776 | i5;
        i9 = i;
        i11 = i4 & 256;
        if (i11 != 0) {
            i7 |= 100663296;
            z3 = z;
        } else {
            z3 = z;
            if ((i2 & 100663296) == 0) {
                if (l46Var.h(z3)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i7 |= i12;
            }
        }
        if ((i2 & 805306368) == 0) {
            if (l46Var.h(z2)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i7 |= i15;
        }
        if ((i3 & 6) == 0) {
            if (l46Var.i(x16Var)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i3 | i14;
        } else {
            i13 = i3;
        }
        if ((i7 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (l46Var.W(i7 & 1, z4)) {
            if (i16 != 0) {
                b41Var4 = null;
            } else {
                b41Var4 = b41Var2;
            }
            if (i8 != 0) {
                i9 = 0;
            }
            if (i11 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            pr4Var = l8b.a;
            zF = k8b.f((e8b) l46Var.k(pr4Var));
            if (zF) {
                bx9Var = new bx9(24.0f, 20.0f, 24.0f, 20.0f);
            } else {
                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
            }
            final bx9 bx9Var5 = bx9Var;
            j09 j09VarC4 = b.c(b.r(j09Var2), 1.0f);
            if ((i7 & 1879048192) == 536870912) {
            }
            objR = l46Var.R();
            if (z7) {
                objR = new pi2(z2, 7);
                l46Var.p0(objR);
            } else {
                objR = new pi2(z2, 7);
                l46Var.p0(objR);
            }
            j09 j09VarB4 = vwc.b(j09VarC4, false, (a26) objR);
            l46Var.f0(769111674);
            if (zF) {
                l46Var.f0(769112692);
                l46Var.r(false);
                j = y72.j;
            } else if (g21.S(l46Var)) {
                l46Var.f0(769114140);
                j = ((e8b) l46Var.k(pr4Var)).f;
                l46Var.r(false);
            } else {
                l46Var.f0(769115510);
                j = ((e8b) l46Var.k(pr4Var)).m;
                l46Var.r(false);
            }
            l46Var.r(false);
            rp1 rp1VarP4 = z5c.p(j, 0L, l46Var, 24576, 14);
            if (zF) {
                l46Var.f0(769117807);
                y6cVar = eze.a(l46Var).a.j;
            } else {
                l46Var.f0(769118867);
                y6cVar = ((s5d) l46Var.k(u5d.a)).e;
            }
            l46Var.r(false);
            final boolean z11 = z6;
            y6c y6cVar5 = y6cVar;
            final String str6 = null;
            final int i110 = i9;
            final b41 b41Var8 = b41Var4;
            bzd.c(x16Var, j09VarB4, false, y6cVar5, rp1VarP4, null, af1.b0(853307358, new n26() { // from class: ivd
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r22v3, types: [l46] */
                /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
                /* JADX WARN: Type inference failed for: r2v19, types: [int] */
                /* JADX WARN: Type inference failed for: r2v44 */
                /* JADX WARN: Type inference failed for: r2v46 */
                /* JADX WARN: Type inference failed for: r8v10, types: [l46] */
                /* JADX WARN: Type inference failed for: r8v11, types: [l46] */
                /* JADX WARN: Type inference failed for: r8v13, types: [l46] */
                /* JADX WARN: Type inference failed for: r8v16 */
                /* JADX WARN: Type inference failed for: r8v17 */
                /* JADX WARN: Type inference failed for: r8v18 */
                /* JADX WARN: Type inference failed for: r8v19 */
                /* JADX WARN: Type inference failed for: r8v7, types: [l46] */
                /* JADX WARN: Type inference failed for: r8v9, types: [l46] */
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    long j2;
                    y6c y6cVarB;
                    he2 he2Var;
                    he2 he2Var2;
                    ov7 ov7Var;
                    he2 he2Var3;
                    boolean z12;
                    l46 l46Var2;
                    boolean z13;
                    l46 l46Var3;
                    ?? r2;
                    ?? r8;
                    ?? r9;
                    l46 l46Var4 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    lx0 lx0Var = ndb.f;
                    ((d92) obj).getClass();
                    if (l46Var4.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        g09 g09Var = g09.a;
                        j09 j09VarY = ynb.Y(g09Var, bx9Var5);
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode = Long.hashCode(l46Var4.T);
                        u8a u8aVarM = l46Var4.m();
                        j09 j09VarJ = m93.J(l46Var4, j09VarY);
                        lf2.q.getClass();
                        l46Var4.j0();
                        boolean z14 = l46Var4.S;
                        ov7 ov7Var2 = LayoutNode.h1;
                        if (z14) {
                            l46Var4.l(ov7Var2);
                        } else {
                            l46Var4.s0();
                        }
                        he2 he2Var4 = hj6.z;
                        dec.l(he2Var4, l46Var4, xn8VarC);
                        he2 he2Var5 = hj6.y;
                        dec.l(he2Var5, l46Var4, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2 he2Var6 = hj6.X;
                        dec.l(he2Var6, l46Var4, numValueOf);
                        dec.k(l46Var4);
                        he2 he2Var7 = hj6.x;
                        dec.l(he2Var7, l46Var4, j09VarJ);
                        j09 j09VarZ = ynb.Z(g09Var, we6.e(l46Var4) ? 0.0f : 4.0f);
                        float f = 4.0f;
                        t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(0)), ndb.z, l46Var4, 54);
                        int iHashCode2 = Long.hashCode(l46Var4.T);
                        u8a u8aVarM2 = l46Var4.m();
                        j09 j09VarJ2 = m93.J(l46Var4, j09VarZ);
                        l46Var4.j0();
                        if (l46Var4.S) {
                            l46Var4.l(ov7Var2);
                        } else {
                            l46Var4.s0();
                        }
                        dec.l(he2Var4, l46Var4, t7cVarA);
                        dec.l(he2Var5, l46Var4, u8aVarM2);
                        ib8.s(iHashCode2, l46Var4, he2Var6, l46Var4);
                        dec.l(he2Var7, l46Var4, j09VarJ2);
                        int i111 = 5;
                        fy9 fy9Var2 = fy9Var;
                        String str7 = str;
                        int i112 = 6;
                        if (fy9Var2 == null) {
                            l46Var4.f0(12947258);
                            l46Var4.r(false);
                            he2Var5 = he2Var5;
                            he2Var = he2Var7;
                            he2Var2 = he2Var4;
                            ov7Var = ov7Var2;
                            str7 = str7;
                            r2 = 0;
                            z13 = true;
                            f = 4.0f;
                            lx0Var = lx0Var;
                            he2Var3 = he2Var6;
                            l46Var3 = l46Var4;
                        } else {
                            l46Var4.f0(11659518);
                            j09 j09VarH = k8b.h(k8b.g(g09Var, new agb(i111), l46Var4, 6), new agb(i112), l46Var4, 0);
                            boolean z15 = zF;
                            if (z15) {
                                l46Var4.f0(-1523637033);
                                j2 = ((e8b) l46Var4.k(l8b.a)).a;
                            } else {
                                l46Var4.f0(-1523636139);
                                j2 = ((e8b) l46Var4.k(l8b.a)).m;
                            }
                            l46Var4.r(false);
                            if (z15) {
                                l46Var4.f0(-1523634592);
                                l46Var4.r(false);
                                y6cVarB = a7c.b(4.0f);
                            } else {
                                l46Var4.f0(-1523632462);
                                y6cVarB = ((s5d) l46Var4.k(u5d.a)).e;
                                l46Var4.r(false);
                            }
                            j09 j09VarO = tm7.o(j09VarH, j2, y6cVarB);
                            xn8 xn8VarC2 = s21.c(lx0Var, false);
                            int iHashCode3 = Long.hashCode(l46Var4.T);
                            u8a u8aVarM3 = l46Var4.m();
                            j09 j09VarJ3 = m93.J(l46Var4, j09VarO);
                            l46Var4.j0();
                            if (l46Var4.S) {
                                l46Var4.l(ov7Var2);
                            } else {
                                l46Var4.s0();
                            }
                            dec.l(he2Var4, l46Var4, xn8VarC2);
                            dec.l(he2Var5, l46Var4, u8aVarM3);
                            ib8.s(iHashCode3, l46Var4, he2Var6, l46Var4);
                            dec.l(he2Var7, l46Var4, j09VarJ3);
                            if (fy9Var2 != null) {
                                l46Var4.f0(-1138844003);
                                he2Var = he2Var7;
                                he2Var3 = he2Var6;
                                he2Var2 = he2Var4;
                                ov7Var = ov7Var2;
                                feg.j(fy9Var2, str7, null, null, an2.e, 0.0f, null, l46Var4, 24584, 108);
                                l46 l46Var5 = l46Var4;
                                z12 = false;
                                l46Var5.r(false);
                                l46Var2 = l46Var5;
                            } else {
                                he2Var = he2Var7;
                                he2Var2 = he2Var4;
                                ov7Var = ov7Var2;
                                he2Var3 = he2Var6;
                                l46Var4.f0(-1138624399);
                                n16.h(0, 0, ynb.Z(g09Var, 0.0f), false, null, xo1.d, l46Var4, 200112, 16);
                                z12 = false;
                                l46Var4.r(false);
                                l46Var2 = l46Var4;
                            }
                            z13 = true;
                            l46Var2.r(true);
                            l46Var2.r(z12);
                            r2 = z12;
                            l46Var3 = l46Var2;
                        }
                        jw7 jw7Var = new jw7(1.0f, z13);
                        c92 c92VarA = a92.a(new uc0(f, z13, new qc0(r2)), ndb.Y, l46Var3, 6);
                        int iHashCode4 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM4 = l46Var3.m();
                        j09 j09VarJ4 = m93.J(l46Var3, jw7Var);
                        l46Var3.j0();
                        if (l46Var3.S) {
                            l46Var3.l(ov7Var);
                        } else {
                            l46Var3.s0();
                        }
                        dec.l(he2Var2, l46Var3, c92VarA);
                        dec.l(he2Var5, l46Var3, u8aVarM4);
                        ib8.s(iHashCode4, l46Var3, he2Var3, l46Var3);
                        he2 he2Var8 = he2Var;
                        dec.l(he2Var8, l46Var3, j09VarJ4);
                        String str8 = str2;
                        l46 l46Var6 = l46Var3;
                        he2 he2Var9 = he2Var5;
                        he2 he2Var10 = he2Var3;
                        he2 he2Var11 = he2Var2;
                        ?? r29 = r2;
                        lx0 lx0Var2 = lx0Var;
                        ov7 ov7Var3 = ov7Var;
                        nte.b(str7, null, 0L, w6c.l(str8 == null ? 21 : 15), ar5.c, null, 0L, null, null, w6c.l(24), 0, false, 0, 0, null, null, l46Var6, 1572864, 48, 260014);
                        ?? r10 = l46Var6;
                        if (str8 == null) {
                            r10.f0(-1079338949);
                            r10.r(r29);
                            r8 = r10;
                        } else {
                            r10.f0(-1079338948);
                            nte.b(str8, null, ((m82) r10.k(o82.a)).g, w6c.l(12), null, null, 0L, null, null, w6c.l(16), 0, false, 0, 0, null, null, r10, 24576, 48, 260074);
                            ?? r11 = r10;
                            r11.r(r29);
                            r8 = r11;
                        }
                        int i20 = i110;
                        if (i20 <= 0 || !z11) {
                            r8.f0(-1078844188);
                            r8.r(r29);
                            r9 = r8;
                        } else {
                            r8.f0(-1079073278);
                            String strR = afc.r(R.string.spread_reads_cost, new Object[]{Integer.valueOf(i20)}, r8);
                            mue mueVar = pue.a;
                            ?? r22 = r8;
                            nte.b(strR, null, ((e8b) r8.k(l8b.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, we6.e(r8) ? pue.g(r8) : pue.j(r8), r22, 0, 0, 131066);
                            ?? r12 = r22;
                            r12.r(r29);
                            r9 = r12;
                        }
                        r9.r(true);
                        j09 j09VarL = b.l(g09Var, 48.0f);
                        xn8 xn8VarC3 = s21.c(lx0Var2, r29);
                        int iHashCode5 = Long.hashCode(r9.T);
                        u8a u8aVarM5 = r9.m();
                        j09 j09VarJ5 = m93.J(r9, j09VarL);
                        r9.j0();
                        if (r9.S) {
                            r9.l(ov7Var3);
                        } else {
                            r9.s0();
                        }
                        dec.l(he2Var11, r9, xn8VarC3);
                        dec.l(he2Var9, r9, u8aVarM5);
                        ib8.s(iHashCode5, r9, he2Var10, r9);
                        dec.l(he2Var8, r9, j09VarJ5);
                        Object objR2 = r9.R();
                        i8c i8cVar = sf2.a;
                        Object obj4 = objR2;
                        if (objR2 == i8cVar) {
                            znd zndVar = new znd(3);
                            r9.p0(zndVar);
                            obj4 = zndVar;
                        }
                        j09 j09VarA = vwc.a(g09Var, (a26) obj4);
                        x16 x16Var2 = x16Var;
                        boolean zG = r9.g(x16Var2);
                        Object objR3 = r9.R();
                        Object obj5 = objR3;
                        if (zG || objR3 == i8cVar) {
                            lnc lncVar = new lnc(5, x16Var2);
                            r9.p0(lncVar);
                            obj5 = lncVar;
                        }
                        qk2.i(z2, j09VarA, false, 20.0f, null, (a26) obj5, r9, 3072, 20);
                        r9.r(true);
                        r9.r(true);
                        String str9 = str6;
                        if (str9 == null) {
                            r9.f0(1623524145);
                            r9.r(r29);
                        } else {
                            r9.f0(1623524146);
                            q7c.g(ynb.d0(0.0f, 8.0f, 16.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), str9, b41Var8, r9, r29 == true ? 1 : 0);
                            r9.r(r29);
                        }
                        r9.r(true);
                    } else {
                        l46Var4.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, (i13 & 14) | 100663296);
            i9 = i110;
            b41Var3 = b41Var8;
            z5 = z11;
        } else {
            l46Var.Z();
            b41Var3 = b41Var2;
            z5 = z3;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: jvd
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q7c.a(j09Var, fy9Var, str, str2, b41Var3, i9, z5, z2, x16Var, (l46) obj, k99.P(i2 | 1), k99.P(i3), i4);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(List list, j09 j09Var, ii6 ii6Var, l46 l46Var, int i, int i2) {
        ii6 ii6Var2;
        int i3;
        ii6 ii6Var3;
        l46 l46Var2;
        ojb ojbVarV;
        ejc ejcVar;
        mue mueVar;
        ArrayList arrayList;
        l46 l46Var3 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        list.getClass();
        l46Var3.h0(-1026757648);
        int i4 = i | (l46Var3.g(list) ? 4 : 2);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            ii6Var2 = ii6Var;
        } else {
            ii6Var2 = ii6Var;
            i3 = i4 | (l46Var3.g(ii6Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        int i6 = 0;
        if (l46Var3.W(i3 & 1, (i3 & 147) != 146)) {
            he2 he2Var5 = he2Var2;
            ii6Var3 = i5 != 0 ? null : ii6Var2;
            if (list.isEmpty()) {
                ojbVarV = l46Var3.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    ejcVar = new ejc(list, j09Var, ii6Var3, i, i2, 1);
                }
            } else {
                mue mueVar2 = pue.a;
                mue mueVarD = pue.d(l46Var3);
                l46Var3.f0(1128393698);
                ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iOrdinal = ((mlc) it.next()).a.ordinal();
                    int i7 = R.string.seasonal_guide_label_action;
                    if (iOrdinal != 0 && iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            i7 = R.string.seasonal_guide_label_love;
                        } else if (iOrdinal == 3) {
                            i7 = R.string.seasonal_guide_label_mind;
                        } else {
                            if (iOrdinal != 4) {
                                ap.c();
                                return;
                            }
                            i7 = R.string.seasonal_guide_label_reality;
                        }
                    }
                    arrayList2.add(afc.q(i7, l46Var3));
                }
                l46Var3.r(false);
                aue aueVarA = uyb.A(0, 1, l46Var3);
                sw3 sw3Var = (sw3) l46Var3.k(zg2.h);
                boolean zG = l46Var3.g(arrayList2) | l46Var3.g(mueVarD) | l46Var3.g(sw3Var);
                Object objR = l46Var3.R();
                if (zG || objR == sf2.a) {
                    Iterator it2 = arrayList2.iterator();
                    if (!it2.hasNext()) {
                        s8f.c();
                        return;
                    }
                    mueVar = mueVarD;
                    char c = ' ';
                    Integer numValueOf = Integer.valueOf((int) (aue.a(aueVarA, (String) it2.next(), mueVar, 0L, 1020).c >> 32));
                    while (it2.hasNext()) {
                        char c2 = c;
                        arrayList2 = arrayList2;
                        Integer numValueOf2 = Integer.valueOf((int) (aue.a(aueVarA, (String) it2.next(), mueVar, 0L, 1020).c >> c2));
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                        c = c2;
                    }
                    arrayList = arrayList2;
                    objR = (yi4) mh3.l(new yi4(sw3Var.Z(numValueOf.intValue())), new yi4(31.0f));
                    l46Var3.p0(objR);
                } else {
                    mueVar = mueVarD;
                    arrayList = arrayList2;
                }
                float f = ((yi4) objR).a;
                j09 j09VarZ = ynb.Z(q6c.j(j09Var, ii6Var3, l46Var3), 20.0f);
                float f2 = 12.0f;
                c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i6)), ndb.Y, l46Var3, 6);
                int iHashCode = Long.hashCode(l46Var3.T);
                u8a u8aVarM = l46Var3.m();
                j09 j09VarJ = m93.J(l46Var3, j09VarZ);
                lf2.q.getClass();
                l46Var3.j0();
                boolean z = l46Var3.S;
                x16 x16Var = LayoutNode.h1;
                if (z) {
                    l46Var3.l(x16Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var4, l46Var3, c92VarA);
                dec.l(he2Var3, l46Var3, u8aVarM);
                ib8.s(iHashCode, l46Var3, he2Var5, l46Var3);
                Iterator itS = kv2.s(l46Var3, j09VarJ, he2Var, -148866259, list);
                int i8 = 0;
                l46 l46Var4 = l46Var3;
                while (itS.hasNext()) {
                    Object next = itS.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        t72.Z();
                        throw null;
                    }
                    mlc mlcVar = (mlc) next;
                    t7c t7cVarA = s7c.a(new uc0(f2, true, new qc0(i6)), ndb.y, l46Var4, 6);
                    int iHashCode2 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM2 = l46Var4.m();
                    g09 g09Var = g09.a;
                    j09 j09VarJ2 = m93.J(l46Var4, g09Var);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(x16Var);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(he2Var4, l46Var4, t7cVarA);
                    dec.l(he2Var3, l46Var4, u8aVarM2);
                    ib8.s(iHashCode2, l46Var4, he2Var5, l46Var4);
                    dec.l(he2Var, l46Var4, j09VarJ2);
                    j09 j09VarP = b.p(g09Var, f);
                    ArrayList arrayList3 = arrayList;
                    he2 he2Var6 = he2Var;
                    he2 he2Var7 = he2Var3;
                    mue mueVar3 = mueVar;
                    nte.b((String) arrayList3.get(i8), j09VarP, bx5.d(l46Var4), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar3, l46Var, 0, 0, 131064);
                    jw7 jw7Var = new jw7(1.0f, true);
                    String str = mlcVar.b;
                    mue mueVar4 = pue.a;
                    nte.b(str, jw7Var, ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var), l46Var, 0, 0, 131064);
                    l46 l46Var5 = l46Var;
                    l46Var5.r(true);
                    i6 = 0;
                    i8 = i9;
                    f = f;
                    x16Var = x16Var;
                    mueVar = mueVar3;
                    arrayList = arrayList3;
                    he2Var = he2Var6;
                    ii6Var3 = ii6Var3;
                    he2Var3 = he2Var7;
                    he2Var4 = he2Var4;
                    f2 = 12.0f;
                    he2Var5 = he2Var5;
                    l46Var4 = l46Var5;
                }
                l46Var4.r(i6);
                l46Var4.r(true);
                l46Var2 = l46Var4;
            }
            ojbVarV.d = ejcVar;
        }
        l46Var3.Z();
        ii6Var3 = ii6Var2;
        l46Var2 = l46Var3;
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ejcVar = new ejc(list, j09Var, ii6Var3, i, i2, 2);
            ojbVarV.d = ejcVar;
        }
    }

    public static final void c(final String str, final j09 j09Var, ii6 ii6Var, l46 l46Var, final int i, final int i2) {
        ii6 ii6Var2;
        int i3;
        final ii6 ii6Var3;
        ojb ojbVarV;
        l26 l26Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(735914002);
        int i4 = i | (l46Var2.g(str) ? 4 : 2);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            ii6Var2 = ii6Var;
        } else {
            ii6Var2 = ii6Var;
            i3 = i4 | (l46Var2.g(ii6Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        int i6 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            final ii6 ii6Var4 = i5 != 0 ? null : ii6Var2;
            if (v4e.Q(str)) {
                ojbVarV = l46Var2.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i7 = 0;
                l26Var = new l26(str, j09Var, ii6Var4, i, i2, i7) { // from class: fsc
                    public final /* synthetic */ int a;
                    public final /* synthetic */ String b;
                    public final /* synthetic */ j09 c;
                    public final /* synthetic */ ii6 d;
                    public final /* synthetic */ int e;

                    {
                        this.a = i7;
                        this.e = i2;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i8 = this.a;
                        wef wefVar = wef.a;
                        switch (i8) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(49);
                                q7c.c(this.b, this.c, this.d, (l46) obj, iP, this.e);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(49);
                                q7c.c(this.b, this.c, this.d, (l46) obj, iP2, this.e);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                ii6 ii6Var5 = ii6Var4;
                j09 j09VarF = urg.F(ynb.a0(q6c.j(j09Var, ii6Var5, l46Var2), 20.0f, 12.0f), ia7.a);
                t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(i6)), ndb.z, l46Var2, 54);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarF);
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
                j09 j09VarP = b.p(ynb.b0(0.0f, 8.0f, b.b, 1), 4.0f);
                pr4 pr4Var = l8b.a;
                s21.a(tm7.o(j09VarP, ((e8b) l46Var2.k(pr4Var)).A, a7c.b(2.0f)), l46Var2, 0);
                int i8 = i3;
                jw7 jw7Var = new jw7(1.0f, true);
                mue mueVar = pue.a;
                nte.b(str, jw7Var, ((e8b) l46Var2.k(pr4Var)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, w6c.k(40.5d), null, null, 16646111), l46Var2, i8 & 14, 0, 131064);
                l46Var2 = l46Var2;
                l46Var2.r(true);
                ii6Var3 = ii6Var5;
            }
            ojbVarV.d = l26Var;
        }
        l46Var2.Z();
        ii6Var3 = ii6Var2;
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final int i9 = 1;
            l26Var = new l26(str, j09Var, ii6Var3, i, i2, i9) { // from class: fsc
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ j09 c;
                public final /* synthetic */ ii6 d;
                public final /* synthetic */ int e;

                {
                    this.a = i9;
                    this.e = i2;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i10 = this.a;
                    wef wefVar = wef.a;
                    switch (i10) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(49);
                            q7c.c(this.b, this.c, this.d, (l46) obj, iP, this.e);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(49);
                            q7c.c(this.b, this.c, this.d, (l46) obj, iP2, this.e);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void d(j09 j09Var, dvd dvdVar, boolean z, x16 x16Var, l46 l46Var, int i) {
        j09 j09Var2;
        dvdVar.getClass();
        x16Var.getClass();
        l46Var.h0(-1549940183);
        int i2 = i | 6 | (l46Var.g(dvdVar) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            int iC = k8b.f((e8b) l46Var.k(l8b.a)) ? dvdVar.c() : dvdVar.a();
            g09 g09Var = g09.a;
            a(g09Var, od4.A(iC, 0, l46Var), dvdVar.b(l46Var), null, null, 0, false, z, x16Var, l46Var, 224326 | ((i2 << 21) & 1879048192), (i2 >> 9) & 14, 448);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50((Object) j09Var2, (Object) dvdVar, z, x16Var, i, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x017a  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void e(j09 j09Var, final ale aleVar, boolean z, int i, boolean z2, final boolean z3, final x16 x16Var, l46 l46Var, final int i2, final int i3) {
        boolean z4;
        int i4;
        final int i5;
        int i6;
        int i7;
        int i8;
        boolean z5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z6;
        final j09 j09Var2;
        final boolean z7;
        final boolean z8;
        ojb ojbVarV;
        boolean z9;
        int i14;
        int iA;
        b68 b68Var;
        aleVar.getClass();
        x16Var.getClass();
        l46Var.h0(-524346602);
        int i15 = i2 | 6 | (l46Var.e(aleVar.ordinal()) ? 32 : 16);
        int i16 = i3 & 8;
        if (i16 == 0) {
            if ((i2 & 3072) == 0) {
                z4 = z;
                i15 |= l46Var.h(z4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i4 = i3 & 16;
            if (i4 != 0) {
                i7 = i15 | 24576;
                i5 = i;
            } else {
                i5 = i;
                if (l46Var.e(i5)) {
                    i6 = 16384;
                } else {
                    i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i7 = i15 | i6;
            }
            i8 = i3 & 32;
            if (i8 != 0) {
                i10 = i7 | 196608;
                z5 = z2;
            } else {
                z5 = z2;
                if (l46Var.h(z5)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i10 = i7 | i9;
            }
            if (l46Var.h(z3)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            int i17 = i10 | i11;
            if (l46Var.i(x16Var)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i13 = i17 | i12;
            if ((4793363 & i13) != 4793362) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i13 & 1, z6)) {
                if (i16 != 0) {
                    z9 = false;
                } else {
                    z9 = z4;
                }
                if (i4 != 0) {
                    i14 = 0;
                } else {
                    i14 = i5;
                }
                if (i8 != 0) {
                    z5 = true;
                }
                if (k8b.f((e8b) l46Var.k(l8b.a))) {
                    iA = aleVar.c();
                } else {
                    iA = aleVar.a();
                }
                fy9 fy9VarA = od4.A(iA, 0, l46Var);
                String strQ = afc.q(aleVar.i(), l46Var);
                String strQ2 = afc.q(aleVar.g(), l46Var);
                if (aleVar.k() || z9) {
                    b68Var = null;
                } else {
                    b68Var = new b68(t72.I(new y72(abg.d(4283058762L)), new y72(abg.d(4287269516L)), new y72(abg.d(4290625215L)), new y72(abg.d(4286151031L)), new y72(abg.d(4281413937L))), null, 0L, 9187343241974906880L);
                }
                b68 b68Var2 = b68Var;
                int i18 = i13 << 9;
                int i19 = (29360128 & i18) | 70 | (234881024 & i18) | (i18 & 1879048192);
                int i20 = (i13 >> 21) & 14;
                g09 g09Var = g09.a;
                a(g09Var, fy9VarA, strQ, strQ2, b68Var2, i14, z5, z3, x16Var, l46Var, i19, i20, 96);
                j09Var2 = g09Var;
                i5 = i14;
                z7 = z9;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                z7 = z4;
            }
            z8 = z5;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: hvd
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q7c.e(j09Var2, aleVar, z7, i5, z8, z3, x16Var, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i15 |= 3072;
        z4 = z;
        i4 = i3 & 16;
        if (i4 != 0) {
            i7 = i15 | 24576;
            i5 = i;
        } else {
            i5 = i;
            if (l46Var.e(i5)) {
                i6 = 16384;
            } else {
                i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i7 = i15 | i6;
        }
        i8 = i3 & 32;
        if (i8 != 0) {
            i10 = i7 | 196608;
            z5 = z2;
        } else {
            z5 = z2;
            if (l46Var.h(z5)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i10 = i7 | i9;
        }
        if (l46Var.h(z3)) {
            i11 = 1048576;
        } else {
            i11 = 524288;
        }
        int i110 = i10 | i11;
        if (l46Var.i(x16Var)) {
            i12 = 8388608;
        } else {
            i12 = 4194304;
        }
        i13 = i110 | i12;
        if ((4793363 & i13) != 4793362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (l46Var.W(i13 & 1, z6)) {
            if (i16 != 0) {
                z9 = false;
            } else {
                z9 = z4;
            }
            if (i4 != 0) {
                i14 = 0;
            } else {
                i14 = i5;
            }
            if (i8 != 0) {
                z5 = true;
            }
            if (k8b.f((e8b) l46Var.k(l8b.a))) {
                iA = aleVar.c();
            } else {
                iA = aleVar.a();
            }
            fy9 fy9VarA2 = od4.A(iA, 0, l46Var);
            String strQ3 = afc.q(aleVar.i(), l46Var);
            String strQ4 = afc.q(aleVar.g(), l46Var);
            if (aleVar.k()) {
                b68Var = null;
            } else {
                b68Var = null;
            }
            b68 b68Var3 = b68Var;
            int i111 = i13 << 9;
            int i112 = (29360128 & i111) | 70 | (234881024 & i111) | (i111 & 1879048192);
            int i21 = (i13 >> 21) & 14;
            g09 g09Var2 = g09.a;
            a(g09Var2, fy9VarA2, strQ3, strQ4, b68Var3, i14, z5, z3, x16Var, l46Var, i112, i21, 96);
            j09Var2 = g09Var2;
            i5 = i14;
            z7 = z9;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z7 = z4;
        }
        z8 = z5;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: hvd
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q7c.e(j09Var2, aleVar, z7, i5, z8, z3, x16Var, (l46) obj, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void f(j09 j09Var, String str, String str2, int i, int i2, boolean z, boolean z2, x16 x16Var, l46 l46Var, int i3) {
        j09 j09Var2;
        la5 la5VarG;
        str.getClass();
        x16Var.getClass();
        l46Var.h0(513612124);
        int i4 = i3 | 6 | (l46Var.g(str) ? 32 : 16) | (l46Var.g(str2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.e(i) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.e(i2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(z) ? 131072 : 65536) | (l46Var.h(z2) ? 1048576 : 524288) | (l46Var.i(x16Var) ? 8388608 : 4194304);
        if (l46Var.W(i4 & 1, (4793491 & i4) != 4793490)) {
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            fy9 fy9VarA = null;
            if (i > 0) {
                ale.a.getClass();
                la5VarG = pzd.g(i);
            } else {
                la5VarG = null;
            }
            if (la5VarG == null) {
                l46Var.f0(-1949240466);
                l46Var.r(false);
            } else {
                l46Var.f0(-1949240465);
                fy9VarA = od4.A(zF ? la5VarG.a() : la5VarG.a(), 0, l46Var);
                l46Var.r(false);
            }
            int i5 = i4 << 3;
            int i6 = i4 << 9;
            g09 g09Var = g09.a;
            a(g09Var, fy9VarA, str, str2, null, i2, z, z2, x16Var, l46Var, (i5 & 7168) | (i5 & 896) | 70 | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192), (i4 >> 21) & 14, 112);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb0(j09Var2, str, str2, i, i2, z, z2, x16Var, i3);
        }
    }

    public static final void g(j09 j09Var, String str, b41 b41Var, l46 l46Var, int i) {
        l46 l46Var2;
        j09 j09VarO;
        l46Var.h0(1962108813);
        int i2 = i | (l46Var.g(j09Var) ? 4 : 2) | (l46Var.g(str) ? 32 : 16) | (l46Var.g(b41Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            long jD = abg.d(4283058762L);
            g09 g09Var = g09.a;
            if (b41Var == null || (j09VarO = tm7.n(g09Var, b41Var, a7c.b(12.0f), 4)) == null) {
                j09VarO = tm7.o(g09Var, jD, a7c.b(12.0f));
            }
            j09 j09VarB0 = ynb.b0(4.0f, 0.0f, j09Var.D(j09VarO), 2);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
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
            long jL = w6c.l(9);
            long jL2 = w6c.l(11);
            ar5 ar5Var = ar5.e;
            long j = ((m82) l46Var.k(o82.a)).e;
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            nte.b(upperCase, null, j, jL, ar5Var, null, 0L, null, null, jL2, 0, false, 0, 0, null, null, l46Var, 1597440, 48, 260010);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, j09Var, str, b41Var, 12);
        }
    }

    public static final void h(j09 j09Var, mfc mfcVar, boolean z, x16 x16Var, l46 l46Var, int i) {
        long jL;
        he2 he2Var;
        g09 g09Var;
        he2 he2Var2;
        long jD;
        int i2;
        int i3;
        String str;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        l46 l46Var2 = l46Var;
        y02 y02Var = g21.f;
        mfcVar.getClass();
        x16Var.getClass();
        l46Var2.h0(1515265850);
        int i6 = i | (l46Var2.g(j09Var) ? 4 : 2) | (l46Var2.e(mfcVar.ordinal()) ? 32 : 16) | (l46Var2.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i6 & 1, (i6 & 1171) != 1170)) {
            y6c y6cVarB = a7c.b(12.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z4 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var3 = hj6.z;
            dec.l(he2Var3, l46Var2, c92VarA);
            he2 he2Var4 = hj6.y;
            dec.l(he2Var4, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var5 = hj6.X;
            dec.l(he2Var5, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var6 = hj6.x;
            dec.l(he2Var6, l46Var2, j09VarJ);
            g09 g09Var2 = g09.a;
            j09 j09VarE = oa7.E(dj6.w(b.c(g09Var2, 1.0f), 0.5714286f), y6cVarB);
            float f = z ? 2.0f : 1.0f;
            if (z) {
                l46Var2.f0(-1631048238);
                jL = l8b.b(l46Var2);
            } else {
                l46Var2.f0(-1631047368);
                jL = l8b.l(l46Var2);
            }
            l46Var2.r(false);
            j09 j09VarC = androidx.compose.foundation.b.c(db6.w(j09VarE, f, jL, y6cVarB), false, null, null, x16Var, 15);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var3, l46Var2, xn8VarC);
            dec.l(he2Var4, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var5, l46Var2);
            dec.l(he2Var6, l46Var2, j09VarJ2);
            mfc mfcVar2 = mfc.a;
            m8c m8cVar = an2.a;
            d31 d31Var = d31.a;
            if (mfcVar == mfcVar2) {
                l46Var2.f0(-1543957539);
                he2Var2 = he2Var3;
                g09Var = g09Var2;
                he2Var = he2Var6;
                feg.j(od4.A(R.drawable.bg_draw_card, 0, l46Var2), null, tm7.o(d31Var.b(g09Var2), abg.d(4294967295L), y02Var), null, m8cVar, 0.0f, null, l46Var2, 24632, 104);
                l46Var2.r(false);
            } else {
                he2Var = he2Var6;
                g09Var = g09Var2;
                he2Var2 = he2Var3;
                l46Var2.f0(-1543696860);
                l46Var2.r(false);
            }
            j09 j09VarB = d31Var.b(g09Var);
            int iOrdinal = mfcVar.ordinal();
            if (iOrdinal == 0) {
                jD = y72.j;
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return;
                }
                jD = abg.d(4279440148L);
            }
            j09 j09VarO = tm7.o(j09VarB, jD, y02Var);
            lx0 lx0Var = ndb.c;
            int iOrdinal2 = mfcVar.ordinal();
            if (iOrdinal2 != 0) {
                i2 = 1;
                if (iOrdinal2 != 1) {
                    ap.c();
                    return;
                }
                i3 = R.drawable.img_theme_neo;
            } else {
                i2 = 1;
                i3 = R.drawable.img_theme_colorful;
            }
            fy9 fy9VarA = od4.A(i3, 0, l46Var2);
            int iOrdinal3 = mfcVar.ordinal();
            if (iOrdinal3 == 0) {
                str = "Classic theme preview";
            } else {
                if (iOrdinal3 != i2) {
                    ap.c();
                    return;
                }
                str = "Neo theme preview";
            }
            feg.j(fy9VarA, str, j09VarO, lx0Var, m8cVar, 0.0f, null, l46Var2, 27656, 96);
            ib8.t(l46Var2, true, g09Var, 12.0f, l46Var2);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var2, l46Var2, t7cVarA);
            dec.l(he2Var4, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var5, l46Var2);
            dec.l(he2Var, l46Var2, j09VarJ3);
            boolean z5 = (i6 & 7168) == 2048;
            Object objR = l46Var2.R();
            if (z5 || objR == sf2.a) {
                objR = new lnc(8, x16Var);
                l46Var2.p0(objR);
            }
            qk2.i(z, null, false, 0.0f, null, (a26) objR, l46Var, (i6 >> 6) & 14, 30);
            int iOrdinal4 = mfcVar.ordinal();
            if (iOrdinal4 != 0) {
                z2 = true;
                if (iOrdinal4 != 1) {
                    throw tec.d(-1904605989, l46Var, false);
                }
                i4 = -1904601907;
                i5 = R.string.theme_greyscale;
                z3 = false;
            } else {
                z2 = true;
                z3 = false;
                i4 = -1904604436;
                i5 = R.string.theme_colorful;
            }
            String strI = tec.i(l46Var, i4, i5, l46Var, z3);
            mue mueVar = oue.a;
            boolean z6 = z2;
            nte.b(strI, null, l8b.b(l46Var), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(z6);
            l46Var2.r(z6);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50((Object) j09Var, (Object) mfcVar, z, x16Var, i, 25);
        }
    }

    public static final void i(j09 j09Var, mfc mfcVar, List list, a26 a26Var, l46 l46Var, int i, int i2) {
        List list2;
        int i3;
        j09 j09Var2;
        List list3;
        mfcVar.getClass();
        a26Var.getClass();
        l46Var.h0(-1384863956);
        int i4 = i | 6 | (l46Var.e(mfcVar.ordinal()) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            list2 = list;
        } else {
            list2 = list;
            i3 = i4 | (l46Var.g(list2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        int i6 = i3 | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i7 = 0;
        if (l46Var.W(i6 & 1, (i6 & 1171) != 1170)) {
            List listI = i5 != 0 ? t72.I(mfc.a, mfc.b) : list2;
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(16.0f, true, new qc0(i7)), ndb.y, l46Var, 6);
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
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            Iterator itS = kv2.s(l46Var, j09VarJ, hj6.x, 1047166615, listI);
            while (itS.hasNext()) {
                mfc mfcVar2 = (mfc) itS.next();
                jw7 jw7Var = new jw7(1.0f, true);
                boolean z = mfcVar == mfcVar2;
                boolean zE = ((i6 & 7168) == 2048) | l46Var.e(mfcVar2.ordinal());
                Object objR = l46Var.R();
                if (zE || objR == sf2.a) {
                    objR = new ykc(24, a26Var, mfcVar2);
                    l46Var.p0(objR);
                }
                h(jw7Var, mfcVar2, z, (x16) objR, l46Var, 0);
            }
            l46Var.r(false);
            l46Var.r(true);
            list3 = listI;
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            list3 = list2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(j09Var2, mfcVar, list3, a26Var, i, i2, 23);
        }
    }

    public static final long j(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static m8g k(l46 l46Var) {
        View view = (View) l46Var.k(uq.f);
        m8g m8gVarM = m(view);
        boolean zI = l46Var.i(m8gVarM) | l46Var.i(view);
        Object objR = l46Var.R();
        if (zI || objR == sf2.a) {
            objR = new p0g(4, m8gVarM, view);
            l46Var.p0(objR);
        }
        af1.g(m8gVarM, (a26) objR, l46Var);
        return m8gVarM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final tt7 l(tt7 tt7Var) {
        tt7Var.getClass();
        if (tt7Var instanceof y8f) {
            return ((y8f) tt7Var).p();
        }
        return null;
    }

    public static m8g m(View view) {
        m8g m8gVar;
        WeakHashMap weakHashMap = m8g.w;
        synchronized (weakHashMap) {
            try {
                Object m8gVar2 = weakHashMap.get(view);
                if (m8gVar2 == null) {
                    m8gVar2 = new m8g(view);
                    weakHashMap.put(view, m8gVar2);
                }
                m8gVar = (m8g) m8gVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m8gVar;
    }

    public static final long n(float f, float f2, float f3, float f4) {
        float f5 = f + f2;
        float f6 = 2.0f * f5;
        float f7 = ((f4 * f6) / f3) % f6;
        if (f7 < f) {
            return (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        if (f7 < f5) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f7 - f)) & 4294967295L);
        }
        float f8 = f * 2.0f;
        if (f7 >= f8 + f2) {
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f6 - f7)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(((2.0f * f2) + f8) - f7) << 32);
    }

    public static final j09 o(j09 j09Var, final float f, final List list, final int i) {
        j09Var.getClass();
        return m93.u(j09Var, new n26() { // from class: rcd
            @Override // defpackage.n26
            public final Object m(Object obj, Object obj2, Object obj3) {
                j09 j09Var2 = (j09) obj;
                l46 l46Var = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var2.getClass();
                l46Var.f0(177531634);
                sw3 sw3Var = (sw3) l46Var.k(zg2.h);
                final float fP0 = sw3Var.p0(2.0f);
                final float fP1 = sw3Var.p0(f);
                p27 p27VarC0 = af1.c0(null, l46Var, 1);
                final int i2 = i;
                final m27 m27VarW = af1.w(p27VarC0, 0.0f, i2, b21.D(b21.T(i2, 0, hs4.c, 2), null, 6), null, l46Var, 4152, 8);
                boolean zD = l46Var.d(fP1) | l46Var.g(m27VarW) | l46Var.e(i2) | l46Var.d(fP0);
                final List list2 = list;
                boolean zI = l46Var.i(list2) | zD;
                Object objR = l46Var.R();
                if (zI || objR == sf2.a) {
                    a26 a26Var = new a26() { // from class: qcd
                        @Override // defpackage.a26
                        public final Object d(Object obj4) {
                            sn4 sn4Var = (sn4) obj4;
                            sn4Var.getClass();
                            zt ztVarA = cu.a();
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
                            float f2 = fP1;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
                            zt.c(ztVarA, w6c.a(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))));
                            float fFloatValue = ((Number) m27VarW.getValue()).floatValue();
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
                            int i3 = i2;
                            float f3 = i3;
                            sn4.s(sn4Var, ztVarA, new b68(list2, null, q7c.n(fIntBitsToFloat3, fIntBitsToFloat4, f3, fFloatValue), q7c.n(Float.intBitsToFloat((int) (sn4Var.f() >> 32)), Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)), f3, (fFloatValue + (i3 / 2)) % f3)), 0.0f, new d5e(fP0, 0.0f, 0, 0, null, 30), null, 0, 52);
                            return wef.a;
                        }
                    };
                    l46Var.p0(a26Var);
                    objR = a26Var;
                }
                j09 j09VarS = b21.s(j09Var2, (a26) objR);
                l46Var.r(false);
                return j09VarS;
            }
        });
    }

    public static final jgf p(jgf jgfVar, tt7 tt7Var) {
        jgfVar.getClass();
        tt7Var.getClass();
        return t(jgfVar, l(tt7Var));
    }

    public static final yn8 q(p7c p7cVar, int i, int i2, int i3, int i4, int i5, zn8 zn8Var, List list, cea[] ceaVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            tn8 tn8Var = (tn8) list2.get(i14);
            float fS = o7c.s(o7c.r(tn8Var));
            if (fS > 0.0f) {
                f2 += fS;
                i15++;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                cea ceaVarV = ceaVarArr[i14];
                if (ceaVarV == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    ceaVarV = tn8Var.v(p7cVar.g(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                cea ceaVar = ceaVarV;
                int iJ = p7cVar.j(ceaVar);
                int i18 = p7cVar.i(ceaVar);
                iArr2[i10 - i6] = iJ;
                int i19 = i17 - iJ;
                if (i19 < 0) {
                    i19 = 0;
                }
                iMin = Math.min(i5, i19);
                i16 += iJ + iMin;
                iMax = Math.max(iMax, i18);
                ceaVarArr[i10] = ceaVar;
                i15 = i11;
            }
            i14 = i10 + 1;
            j = j;
        }
        long j2 = j;
        int i20 = i15;
        if (i20 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j3 = ((long) (i20 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i21 = i6; i21 < i7; i21++) {
                jRound -= (long) Math.round(o7c.s(o7c.r((tn8) list2.get(i21))) * f3);
            }
            int i22 = i6;
            int i23 = iMax;
            int i24 = 0;
            while (i22 < i7) {
                if (ceaVarArr[i22] == null) {
                    tn8 tn8Var2 = (tn8) list2.get(i22);
                    f = f3;
                    r7c r7cVarR = o7c.r(tn8Var2);
                    float fS2 = o7c.s(r7cVarR);
                    if (fS2 <= 0.0f) {
                        g37.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j4 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fS2 * f) + iSignum);
                    cea ceaVarV2 = tn8Var2.v(p7cVar.g((!(r7cVarR != null ? r7cVarR.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iJ2 = p7cVar.j(ceaVarV2);
                    int i25 = p7cVar.i(ceaVarV2);
                    iArr2[i22 - i6] = iJ2;
                    i24 += iJ2;
                    int iMax3 = Math.max(i23, i25);
                    ceaVarArr[i22] = ceaVarV2;
                    i23 = iMax3;
                    jRound = j4;
                } else {
                    f = f3;
                }
                i22++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (((long) i24) + j3);
            int i26 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i26) {
                i9 = i26;
            }
            iMax = i23;
        }
        int i27 = i9 + i16;
        if (i27 < 0) {
            i27 = 0;
        }
        int iMax4 = Math.max(i27, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        p7cVar.f(iMax4, iArr2, iArr3, zn8Var);
        return p7cVar.h(ceaVarArr, zn8Var, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    public static final qhe r(TarotCardChoice tarotCardChoice) {
        tarotCardChoice.getClass();
        return new qhe(tarotCardChoice.getCard().getCardKey(), !tarotCardChoice.isReversed() ? 1 : 0);
    }

    public static trf s(int i, String str) {
        return new trf(new g57(0, 0, 0, 0), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final jgf t(jgf jgfVar, tt7 tt7Var) {
        jgfVar.getClass();
        if (jgfVar instanceof y8f) {
            return t(((y8f) jgfVar).M(), tt7Var);
        }
        if (tt7Var == null || tt7Var.equals(jgfVar)) {
            return jgfVar;
        }
        if (jgfVar instanceof tjd) {
            return new xjd((tjd) jgfVar, tt7Var);
        }
        if (jgfVar instanceof bj5) {
            return new ej5((bj5) jgfVar, tt7Var);
        }
        ap.c();
        return null;
    }

    public static /* synthetic */ boolean u(Unsafe unsafe, ivg ivgVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(ivgVar, j, obj, obj2)) {
            if (unsafe.getObject(ivgVar, j) != obj && unsafe.getObject(ivgVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
