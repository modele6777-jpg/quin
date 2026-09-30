package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xld {
    public static final y6c a = a7c.b(100.0f);
    public static final bx9 b = new bx9(24.0f, 4.0f, 24.0f, 4.0f);

    public static final void a(j09 j09Var, List list, yx9 yx9Var, l46 l46Var, int i) {
        j09 j09Var2;
        yx9 yx9Var2;
        yx9 yx9VarB;
        int i2;
        j09 j09Var3;
        List list2 = list;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1360519995);
        int i3 = i | 6 | (l46Var2.g(list2) ? 32 : 16) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            l46Var2.b0();
            int i4 = i & 1;
            g09 g09Var = g09.a;
            i8c i8cVar = sf2.a;
            if (i4 == 0 || l46Var2.C()) {
                boolean z = (i3 & 112) == 32;
                Object objR = l46Var2.R();
                if (z || objR == i8cVar) {
                    objR = new h53(list2, 9);
                    l46Var2.p0(objR);
                }
                yx9VarB = ay9.b(0, 0, 3, (x16) objR, l46Var2);
                i2 = i3 & (-897);
                j09Var3 = g09Var;
            } else {
                l46Var2.Z();
                yx9VarB = yx9Var;
                i2 = i3 & (-897);
                j09Var3 = j09Var;
            }
            l46Var2.s();
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = af1.E(l46Var2);
                l46Var2.p0(objR2);
            }
            aw2 aw2Var = (aw2) objR2;
            int i5 = i2 & 112;
            boolean zG = (i5 == 32) | l46Var2.g(yx9VarB);
            Object objR3 = l46Var2.R();
            if (zG || objR3 == i8cVar) {
                objR3 = new vld(list2, yx9VarB, null);
                l46Var2.p0(objR3);
            }
            af1.o((l26) objR3, l46Var2, yx9VarB);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var3);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            yx9 yx9Var3 = yx9VarB;
            cn1.h(0.0f, 0, 0, 16382, null, af1.b0(-1442027740, new m4a(list2, 2), l46Var2), l46Var, null, null, null, null, null, yx9Var3, null, null, false);
            l46Var2 = l46Var;
            j09 j09VarC = b.c(g09Var, 1.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var2, 0);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            j09 j09VarC2 = b.c(j09Var3, 1.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarC2);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            bx9 bx9VarQ = ynb.q(24.0f, 0.0f, 2);
            boolean zG2 = l46Var2.g(yx9Var3) | (i5 == 32) | l46Var2.i(aw2Var);
            Object objR4 = l46Var2.R();
            if (zG2 || objR4 == i8cVar) {
                list2 = list;
                objR4 = new bv9(list2, yx9Var3, aw2Var, 12);
                l46Var2.p0(objR4);
            } else {
                list2 = list;
            }
            af1.t(null, null, bx9VarQ, null, null, null, false, null, (a26) objR4, l46Var2, 384, 507);
            tec.s(l46Var2, true, true, true);
            j09Var2 = j09Var3;
            yx9Var2 = yx9Var3;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
            yx9Var2 = yx9Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, j09Var2, list2, yx9Var2, 11);
        }
    }

    public static final void b(final j09 j09Var, final boolean z, final boolean z2, final boolean z3, final boolean z4, final String str, final String str2, final ij ijVar, final boolean z5, final boolean z6, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final boolean z7, final boolean z8, final x16 x16Var5, final x16 x16Var6, final x16 x16Var7, l46 l46Var, final int i) {
        str.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        x16Var5.getClass();
        x16Var6.getClass();
        x16Var7.getClass();
        l46Var.h0(1635226887);
        int i2 = i | (l46Var.g(j09Var) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z4) ? 16384 : 8192) | (l46Var.g(str) ? 131072 : 65536) | (l46Var.g(str2) ? 1048576 : 524288) | (l46Var.i(ijVar) ? 8388608 : 4194304) | (l46Var.h(z5) ? 67108864 : 33554432) | (l46Var.h(z6) ? 536870912 : 268435456);
        int i3 = (l46Var.i(x16Var) ? (char) 4 : (char) 2) | (l46Var.i(x16Var2) ? ' ' : (char) 16) | (l46Var.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z7) ? (char) 16384 : (char) 8192) | (l46Var.h(z8) ? (char) 0 : (char) 0) | (l46Var.i(x16Var5) ? (char) 0 : (char) 0) | (l46Var.i(x16Var6) ? (char) 0 : (char) 0) | (l46Var.i(x16Var7) ? (char) 0 : (char) 0);
        if (l46Var.W(i2 & 1, ((i2 & 306783379) == 306783378 && (38347923 & i3) == 38347922) ? false : true)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            final e89 e89Var = (e89) objR;
            boolean z9 = ((i2 & 896) == 256) | ((57344 & i3) == 16384) | ((i3 & 458752) == 131072) | ((i2 & 234881024) == 67108864) | ((i2 & 1879048192) == 536870912) | ((i2 & 3670016) == 1048576) | ((i2 & 458752) == 131072) | ((i2 & 29360128) == 8388608 || l46Var.i(ijVar)) | ((i3 & 7168) == 2048);
            Object objR2 = l46Var.R();
            if (z9 || objR2 == i8cVar) {
                a26 a26Var = new a26() { // from class: sld
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        ij ijVar2;
                        bv7 bv7Var = (bv7) obj;
                        bv7Var.getClass();
                        e89 e89Var2 = e89Var;
                        if (!((Boolean) e89Var2.getValue()).booleanValue() && !z2 && !z7 && !z8 && !z5 && !z6 && ((!v4e.Q(str2) || !v4e.Q(str) || ((ijVar2 = ijVar) != null && ijVar2.a())) && ((int) (bv7Var.l() >> 32)) > 0)) {
                            hkb hkbVarN = vd0.N(bv7Var, true);
                            if (hkbVarN.d - hkbVarN.b > 0.0f) {
                                e89Var2.setValue(Boolean.TRUE);
                                x16Var4.invoke();
                            }
                        }
                        return wef.a;
                    }
                };
                l46Var.p0(a26Var);
                objR2 = a26Var;
            }
            oa7.b(nk8.w(j09Var, (a26) objR2), 0L, 0.0f, af1.b0(-1477444917, new n26() { // from class: tld
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    gh6 gh6Var;
                    gh6 gh6Var2;
                    String strI;
                    String strI2;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c31) obj).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        g09 g09Var = g09.a;
                        j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                        c92 c92VarA = a92.a(new uc0(10.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarB0);
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
                        boolean z10 = z5;
                        if (z10 || z6) {
                            l46Var2.f0(-2066132069);
                            c8b.i(b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1), afc.q(z10 ? R.string.deck_selection_back_to_selection : R.string.daily_fortune_back_to_fortune, l46Var2), null, null, 0L, 0.0f, false, null, null, false, null, null, z10 ? x16Var6 : x16Var7, l46Var2, 6, 0, 4092);
                            l46Var2 = l46Var2;
                            l46Var2.r(false);
                        } else if (z8) {
                            l46Var2.f0(-2065713104);
                            nte.b(afc.q(R.string.skin_store_awaiting_payment, l46Var2), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 261118);
                            l46Var2 = l46Var2;
                            axa.a(0.0f, 0.0f, 0, 6, 62, 0L, 0L, l46Var2, b.l(g09Var, 20.0f));
                            l46Var2.r(false);
                        } else {
                            boolean z11 = z7;
                            boolean z12 = z3;
                            if (z11) {
                                l46Var2.f0(-2065496414);
                                nte.b(afc.q(R.string.skin_store_pending, l46Var2), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 261118);
                                c8b.i(null, afc.q(R.string.skin_store_refresh, l46Var2), null, null, 0L, 0.0f, !z12, null, null, false, null, null, x16Var5, l46Var2, 0, 0, 4029);
                                l46Var2 = l46Var2;
                                l46Var2.r(false);
                            } else if (z2) {
                                l46Var2.f0(-2063216147);
                                l46Var2.r(false);
                            } else {
                                l46Var2.f0(-2065155445);
                                gh6 gh6VarW0 = kj0.w0(l46Var2);
                                if (z4) {
                                    l46Var2.f0(-2065116354);
                                    j09 j09VarF = b.f(56.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                                    String str3 = str;
                                    if (v4e.Q(str3)) {
                                        strI2 = tec.i(l46Var2, 626127509, R.string.skin_detail_subscribe_yearly_unlock_all, l46Var2, false);
                                    } else {
                                        l46Var2.f0(-2064987735);
                                        strI2 = afc.r(R.string.skin_store_annual_price, new Object[]{str3}, l46Var2);
                                        l46Var2.r(false);
                                    }
                                    String strQ = afc.q(R.string.skin_store_annual_benefits, l46Var2);
                                    mue mueVar = oue.a;
                                    mue mueVarG = pue.g(l46Var2);
                                    long j = ((e8b) l46Var2.k(l8b.a)).v;
                                    boolean z13 = (z12 || v4e.Q(str3)) ? false : true;
                                    String str4 = strI2;
                                    x4d x4dVar = xld.a;
                                    x4dVar.getClass();
                                    if (we6.e(l46Var2)) {
                                        x4dVar = g21.f;
                                    }
                                    gh6Var = gh6VarW0;
                                    c8b.i(j09VarF, str4, strQ, mueVarG, j, 4.0f, z13, x4dVar, null, false, xld.b, null, x16Var2, l46Var2, 196614, 6, 2816);
                                    l46Var2 = l46Var2;
                                    l46Var2.r(false);
                                } else {
                                    gh6Var = gh6VarW0;
                                    l46Var2.f0(-2064333139);
                                    l46Var2.r(false);
                                }
                                ij ijVar2 = ijVar;
                                i8c i8cVar2 = sf2.a;
                                if (ijVar2 == null || !ijVar2.a()) {
                                    gh6Var2 = gh6Var;
                                    l46Var2.f0(-2063890707);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(-2064272224);
                                    String strR = afc.r(R.string.skin_store_all_decks_price, new Object[]{Integer.valueOf(ijVar2.b.size()), ijVar2.a.y()}, l46Var2);
                                    boolean z14 = !z12;
                                    gh6Var2 = gh6Var;
                                    boolean zI = l46Var2.i(gh6Var2);
                                    x16 x16Var8 = x16Var3;
                                    boolean zG = zI | l46Var2.g(x16Var8);
                                    Object objR3 = l46Var2.R();
                                    if (zG || objR3 == i8cVar2) {
                                        objR3 = new sj2(gh6Var2, x16Var8, 8);
                                        l46Var2.p0(objR3);
                                    }
                                    xld.d(0, (x16) objR3, l46Var2, strR, z14);
                                    l46Var2.r(false);
                                }
                                String str5 = str2;
                                if (v4e.Q(str5)) {
                                    strI = tec.i(l46Var2, 626164939, R.string.skin_detail_one_time_purchase, l46Var2, false);
                                } else {
                                    l46Var2.f0(-2063819407);
                                    strI = afc.r(R.string.skin_store_single_price, new Object[]{str5}, l46Var2);
                                    l46Var2.r(false);
                                }
                                boolean zI2 = l46Var2.i(gh6Var2);
                                x16 x16Var9 = x16Var;
                                boolean zG2 = zI2 | l46Var2.g(x16Var9);
                                Object objR4 = l46Var2.R();
                                if (zG2 || objR4 == i8cVar2) {
                                    objR4 = new sj2(gh6Var2, x16Var9, 9);
                                    l46Var2.p0(objR4);
                                }
                                x16 x16Var10 = (x16) objR4;
                                boolean z15 = z;
                                if (ijVar2 == null || !ijVar2.a()) {
                                    l46Var2.f0(-2063438448);
                                    xld.d(0, x16Var10, l46Var2, strI, z15);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(-2063531851);
                                    xld.e(0, x16Var10, l46Var2, strI, z15);
                                    l46Var2.r(false);
                                }
                                if (z12) {
                                    l46Var2.f0(-2063316339);
                                    axa.a(0.0f, 0.0f, 0, 6, 62, 0L, 0L, l46Var2, b.l(g09Var, 20.0f));
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(-2063224083);
                                    l46Var2.r(false);
                                }
                                l46Var2.r(false);
                            }
                        }
                        String strQ2 = afc.q(R.string.skin_store_disclaimer, l46Var2);
                        mue mueVar2 = oue.a;
                        l46 l46Var3 = l46Var2;
                        nte.b(strQ2, null, ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.g(l46Var2), l46Var3, 0, 0, 130042);
                        l46Var3.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3072, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(z, z2, z3, z4, str, str2, ijVar, z5, z6, x16Var, x16Var2, x16Var3, x16Var4, z7, z8, x16Var5, x16Var6, x16Var7, i) { // from class: uld
                public final /* synthetic */ boolean E0;
                public final /* synthetic */ x16 F0;
                public final /* synthetic */ x16 G0;
                public final /* synthetic */ x16 H0;
                public final /* synthetic */ x16 X;
                public final /* synthetic */ x16 Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String g;
                public final /* synthetic */ ij v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ x16 y;
                public final /* synthetic */ x16 z;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(16777217);
                    xld.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, this.E0, this.F0, this.G0, this.H0, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void c(j09 j09Var, final mmd mmdVar, final ynd yndVar, final boolean z, final String str, final boolean z2, final boolean z3, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final x16 x16Var5, final boolean z4, final boolean z5, final ij ijVar, final boolean z6, final a26 a26Var, final x16 x16Var6, final x16 x16Var7, final x16 x16Var8, final x16 x16Var9, final x16 x16Var10, l46 l46Var, final int i) {
        final j09 j09Var2;
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        x16Var5.getClass();
        a26Var.getClass();
        x16Var6.getClass();
        x16Var7.getClass();
        x16Var8.getClass();
        x16Var9.getClass();
        x16Var10.getClass();
        l46Var.h0(389087082);
        int i2 = i | 6 | (l46Var.g(mmdVar) ? 32 : 16) | (l46Var.g(yndVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(str) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(z2) ? 131072 : 65536) | (l46Var.h(z3) ? 1048576 : 524288) | (l46Var.i(x16Var) ? 8388608 : 4194304) | (l46Var.i(x16Var2) ? 67108864 : 33554432) | (l46Var.i(x16Var3) ? 536870912 : 268435456);
        if (l46Var.W(i2 & 1, ((i2 & 306783379) == 306783378 && ((((((((((32774 | (l46Var.i(x16Var5) ? ' ' : (char) 16)) | (l46Var.h(z4) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)) | (l46Var.h(z5) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE)) | (l46Var.i(ijVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE)) | (l46Var.h(z6) ? 131072 : 65536)) | (l46Var.i(a26Var) ? (char) 0 : (char) 0)) | (l46Var.i(x16Var6) ? (char) 0 : (char) 0)) | (l46Var.i(x16Var7) ? (char) 0 : (char) 0)) | (l46Var.i(x16Var8) ? (char) 0 : (char) 0)) & 306783379) == 306783378 && (((l46Var.i(x16Var9) ? (char) 4 : (char) 2) | (l46Var.i(x16Var10) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            final mld mldVarQ = hfc.q(mmdVar.a);
            final ii6 ii6VarB0 = g21.b0(l46Var);
            xdc.a(null, af1.b0(-1214227930, new p4c(9, x16Var10, ii6VarB0), l46Var), af1.b0(357006853, new l26() { // from class: pld
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    String strY;
                    mmd mmdVar2 = mmdVar;
                    n07 n07Var = mmdVar2.b;
                    l46 l46Var2 = (l46) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 12.0f, 7, mh3.N(b.c(g09.a, 1.0f)));
                        boolean z7 = z6;
                        boolean z8 = (z7 || mmdVar2.c || n07Var == null) ? false : true;
                        boolean z9 = mmdVar2.c;
                        if (n07Var == null || (strY = n07Var.y()) == null) {
                            strY = "";
                        }
                        String str2 = strY;
                        boolean z10 = z2;
                        ynd yndVar2 = yndVar;
                        xld.b(j09VarD0, z8, z9, z7, z, str, str2, ijVar, z10 && yndVar2 != null, z3 && yndVar2 != null, x16Var, x16Var2, x16Var3, x16Var4, z4, z5, x16Var5, x16Var7, x16Var8, l46Var2, 16777216);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), null, null, 0, ((e8b) l46Var.k(l8b.a)).e, 0L, null, af1.b0(1190250491, new n26() { // from class: qld
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v10 */
                /* JADX WARN: Type inference failed for: r12v8, types: [l46] */
                /* JADX WARN: Type inference failed for: r12v9 */
                /* JADX WARN: Type inference failed for: r15v10, types: [boolean, byte] */
                /* JADX WARN: Type inference failed for: r15v11 */
                /* JADX WARN: Type inference failed for: r15v12 */
                /* JADX WARN: Type inference failed for: r15v9 */
                /* JADX WARN: Type inference failed for: r22v4, types: [l46] */
                /* JADX WARN: Type inference failed for: r2v13 */
                /* JADX WARN: Type inference failed for: r2v15, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r2v56 */
                /* JADX WARN: Type inference failed for: r43v2 */
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    String strY;
                    TarotSkinIdentify tarotSkinIdentify;
                    float f;
                    String strB;
                    boolean z7;
                    ?? r2;
                    ?? r12;
                    ?? r15;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    String strR;
                    x16 x16Var11;
                    Object obj4;
                    xw9 xw9Var = (xw9) obj;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    xw9Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(xw9Var) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        g09 g09Var = g09.a;
                        j09 j09VarD0 = mh3.d0(g21.P(g09Var, ii6VarB0), mh3.T(l46Var2), false, 14);
                        jx0 jx0Var = ndb.Z;
                        sc0 sc0Var = xc0.c;
                        c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var2, 48);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarD0);
                        lf2.q.getClass();
                        l46Var2.j0();
                        boolean z8 = l46Var2.S;
                        ov7 ov7Var = LayoutNode.h1;
                        if (z8) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        he2 he2Var = hj6.z;
                        dec.l(he2Var, l46Var2, c92VarA);
                        he2 he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var2, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2 he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var2, numValueOf);
                        dec.k(l46Var2);
                        he2 he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var2, j09VarJ);
                        mld mldVar = mldVarQ;
                        xld.a(null, mldVar.a(l46Var2), null, l46Var2, 0);
                        j09 j09VarB0 = ynb.b0(24.0f, 0.0f, ynb.d0(0.0f, 20.0f, 0.0f, 20.0f, 5, g09Var), 2);
                        c92 c92VarA2 = a92.a(sc0Var, ndb.Y, l46Var2, 48);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarB0);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, c92VarA2);
                        dec.l(he2Var2, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ2);
                        j09 j09VarC = b.c(g09Var, 1.0f);
                        t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
                        int iHashCode3 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM3 = l46Var2.m();
                        j09 j09VarJ3 = m93.J(l46Var2, j09VarC);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, t7cVarA);
                        dec.l(he2Var2, l46Var2, u8aVarM3);
                        ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ3);
                        jw7 jw7Var = new jw7(1.0f, true);
                        String strQ = afc.q(mldVar.m(), l46Var2);
                        mue mueVar = pue.a;
                        nte.b(strQ, jw7Var, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.m(l46Var2), 0L, 0L, ar5.d, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777179), l46Var2, 0, 0, 131068);
                        l46 l46Var3 = l46Var2;
                        o5c.f(l46Var3, b.p(g09Var, 8.0f));
                        mmd mmdVar2 = mmdVar;
                        boolean z9 = mmdVar2.c;
                        n07 n07Var = mmdVar2.b;
                        TarotSkinIdentify tarotSkinIdentify2 = mmdVar2.a;
                        if (z9) {
                            l46Var3.f0(-1287923474);
                            afc.a(null, l46Var3, 0);
                            l46Var3.r(false);
                            tarotSkinIdentify = tarotSkinIdentify2;
                            f = 0.48f;
                            r2 = 0;
                            z7 = true;
                            r12 = l46Var3;
                        } else {
                            l46Var3.f0(-1287844238);
                            j09 j09VarU0 = kj0.u0(b.b(60.0f, 0.0f, g09Var, 2), n07Var == null, ((s5d) l46Var3.k(u5d.a)).b, vd0.u0(l46Var3));
                            c92 c92VarA3 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.E0, l46Var3, 54);
                            int iHashCode4 = Long.hashCode(l46Var3.T);
                            u8a u8aVarM4 = l46Var3.m();
                            j09 j09VarJ4 = m93.J(l46Var3, j09VarU0);
                            l46Var3.j0();
                            if (l46Var3.S) {
                                l46Var3.l(ov7Var);
                            } else {
                                l46Var3.s0();
                            }
                            dec.l(he2Var, l46Var3, c92VarA3);
                            dec.l(he2Var2, l46Var3, u8aVarM4);
                            ib8.s(iHashCode4, l46Var3, he2Var3, l46Var3);
                            dec.l(he2Var4, l46Var3, j09VarJ4);
                            if (n07Var == null || (strY = n07Var.y()) == null) {
                                strY = "";
                            }
                            long jL = w6c.l(24);
                            ar5 ar5Var = ar5.e;
                            tarotSkinIdentify = tarotSkinIdentify2;
                            f = 0.48f;
                            nte.b(strY, null, 0L, jL, ar5Var, null, 0L, null, new jme(6), 0L, 0, false, 0, 0, null, null, l46Var3, 1597440, 0, 261038);
                            if (n07Var == null || (strB = n07Var.b()) == null) {
                                strB = "";
                            }
                            nte.b(strB, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), y72.b(((m82) l46Var3.k(o82.a)).q, 0.48f), w6c.l(13), ar5Var, null, 0L, null, 0, 0L, null, null, 16773112), l46Var3, 0, 0, 131070);
                            l46 l46Var4 = l46Var3;
                            z7 = true;
                            l46Var4.r(true);
                            r2 = 0;
                            l46Var4.r(false);
                            r12 = l46Var4;
                        }
                        r12.r(z7);
                        if (!tarotSkinIdentify.getIsModianCollab() || mldVar.i() == null) {
                            r12.f0(-1855949797);
                            r12.r(r2);
                        } else {
                            ib8.r(6.0f, -1856051663, r12, r12, g09Var);
                            hy9.d(mldVar.i().intValue(), r2, r12, null);
                            r12.r(r2);
                        }
                        o5c.f(r12, b.d(g09Var, 12.0f));
                        String strQ2 = afc.q(mldVar.l(), r12);
                        mue mueVar2 = oue.a;
                        ?? r22 = r12;
                        nte.b(strQ2, null, ((e8b) r12.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(r12), r22, 0, 0, 131066);
                        o5c.f(r22, b.d(g09Var, 8.0f));
                        nte.b(afc.q(mldVar.d(), r22), null, y72.b(((m82) r22.k(o82.a)).q, f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(r22), r22, 0, 0, 131066);
                        o5c.f(r22, b.d(g09Var, xw9Var.a()));
                        r22.r(true);
                        ynd yndVar2 = yndVar;
                        if (yndVar2 == null || z2 || z3) {
                            r22.f0(-119969615);
                            r22.r(false);
                        } else {
                            r22.f0(-122023272);
                            boolean zEquals = yndVar2.equals(vnd.a);
                            if (zEquals && tarotSkinIdentify.getRequiresDownload()) {
                                i3 = -121934271;
                                i4 = R.string.skin_purchase_success_go_download;
                                r15 = 0;
                            } else {
                                r15 = 0;
                                r15 = 0;
                                if (zEquals) {
                                    i3 = -121827197;
                                    i4 = R.string.skin_purchase_success_tips_text;
                                } else {
                                    i3 = -121743745;
                                    i4 = R.string.skin_purchase_success_my_tarot_text;
                                }
                            }
                            String strI = tec.i(r22, i3, i4, r22, r15);
                            if (zEquals) {
                                i5 = -121614723;
                                i6 = R.string.skin_purchase_success_negative_button;
                            } else {
                                i5 = -121525691;
                                i6 = R.string.skin_purchase_success_not_now;
                            }
                            String strI2 = tec.i(r22, i5, i6, r22, r15);
                            if (zEquals && tarotSkinIdentify.getRequiresDownload()) {
                                i7 = -121373853;
                                i8 = R.string.skin_purchase_success_go_button;
                            } else if (zEquals) {
                                i7 = -121268360;
                                i8 = R.string.skin_purchase_success_tips_positive_button;
                            } else {
                                i7 = -121174554;
                                i8 = R.string.skin_purchase_success_go_now;
                            }
                            String strI3 = tec.i(r22, i7, i8, r22, r15);
                            if (yndVar2 instanceof und) {
                                r22.f0(688833973);
                                strR = afc.r(R.string.skin_purchase_all_decks_success_title, new Object[]{Integer.valueOf(((und) yndVar2).a)}, r22);
                                r22.r(r15);
                            } else if (yndVar2 instanceof xnd) {
                                r22.f0(688839831);
                                strR = afc.r(R.string.skin_purchase_success_tips_title, new Object[]{afc.q(hfc.q(((xnd) yndVar2).a).m(), r22)}, r22);
                                r22.r(r15);
                            } else {
                                r22.f0(688845791);
                                strR = afc.r(R.string.skin_purchase_success_tips_title, new Object[]{afc.q(hfc.q(tarotSkinIdentify).m(), r22)}, r22);
                                r22.r(r15);
                            }
                            if (yndVar2 instanceof wnd) {
                                r22.f0(-120142254);
                                a26 a26Var2 = a26Var;
                                boolean zG = r22.g(a26Var2) | r22.i(yndVar2);
                                Object objR = r22.R();
                                if (zG || objR == sf2.a) {
                                    obj4 = objR;
                                    ykc ykcVar = new ykc(9, a26Var2, yndVar2);
                                    r22.p0(ykcVar);
                                    obj4 = ykcVar;
                                }
                                obj4 = objR;
                                x16Var11 = (x16) obj4;
                                r22.r(r15);
                            } else {
                                r22.f0(688864751);
                                r22.r(r15);
                                x16Var11 = x16Var6;
                            }
                            kj0.F(strR, af1.b0(1457890043, new knc(strI, 1, r15), r22), strI3, strI2, false, false, null, null, x16Var9, x16Var11, r22, 48, 240);
                            r22.r(r15);
                        }
                        r22.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 805306800, 441);
            j09Var2 = g09.a;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(mmdVar, yndVar, z, str, z2, z3, x16Var, x16Var2, x16Var3, x16Var4, x16Var5, z4, z5, ijVar, z6, a26Var, x16Var6, x16Var7, x16Var8, x16Var9, x16Var10, i) { // from class: rld
                public final /* synthetic */ boolean E0;
                public final /* synthetic */ a26 F0;
                public final /* synthetic */ x16 G0;
                public final /* synthetic */ x16 H0;
                public final /* synthetic */ x16 I0;
                public final /* synthetic */ x16 J0;
                public final /* synthetic */ x16 K0;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ ij Z;
                public final /* synthetic */ mmd b;
                public final /* synthetic */ ynd c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ x16 v;
                public final /* synthetic */ x16 w;
                public final /* synthetic */ x16 x;
                public final /* synthetic */ x16 y;
                public final /* synthetic */ x16 z;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(3073);
                    xld.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void d(int i, x16 x16Var, l46 l46Var, String str, boolean z) {
        String str2;
        l46Var.h0(-1701456533);
        int i2 = (l46Var.g(str) ? 4 : 2) | i | (l46Var.h(z) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            j09 j09VarF = b.f(56.0f, 0.0f, b.c(g09.a, 1.0f), 2);
            x4d x4dVar = a;
            x4dVar.getClass();
            if (we6.e(l46Var)) {
                x4dVar = g21.f;
            }
            x4d x4dVar2 = x4dVar;
            pr4 pr4Var = l8b.a;
            q11 q11VarB = x57.b(((e8b) l46Var.k(pr4Var)).s, 1.0f);
            bx9 bx9Var = v51.a;
            str2 = str;
            cgg.k(x16Var, j09VarF, z, x4dVar2, v51.g(0L, ((e8b) l46Var.k(pr4Var)).q, l46Var, 13), q11VarB, b, af1.b0(-2063784263, new ob0(str2, 28), l46Var), l46Var, ((i2 >> 6) & 14) | 817889328 | ((i2 << 3) & 896), 288);
        } else {
            str2 = str;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ku7(str2, z, x16Var, i, 5);
        }
    }

    public static final void e(int i, x16 x16Var, l46 l46Var, String str, boolean z) {
        l46Var.h0(-2004047942);
        int i2 = (l46Var.g(str) ? 4 : 2) | i | (l46Var.h(z) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            g21.r(af1.b0(1544467517, new av(x16Var, z, y72.b(((e8b) l46Var.k(l8b.a)).q, z ? 1.0f : 0.38f), str), l46Var), l46Var, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ku7(str, z, x16Var, i, 4);
        }
    }
}
