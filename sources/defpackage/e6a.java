package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e6a {
    public static final long a = abg.d(4292659575L);
    public static final /* synthetic */ int b = 0;

    static {
        t72.I(new i5a("月卡订阅", "¥18.8/月", "低至 ¥0.31/次", null, null, true, false, null, 440), new i5a("年卡订阅", "¥98/年", null, "¥8.17/月", "限时折扣", false, false, null, 460), new i5a("五次占卜", "¥10", "¥2/次", null, null, false, false, null, 504));
    }

    public static final void a(String str, boolean z, boolean z2, j09 j09Var, x16 x16Var, l46 l46Var, int i) {
        str.getClass();
        x16Var.getClass();
        l46Var.h0(-1145492674);
        int i2 = (l46Var.g(str) ? 4 : 2) | i | (l46Var.h(z) ? 32 : 16) | (l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (!l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            l46Var.Z();
        } else if (z2) {
            l46Var.f0(-1856920608);
            b(((i2 >> 3) & 7168) | (i2 & 126) | 384, x16Var, l46Var, j09Var, str, z);
            l46Var.r(false);
        } else {
            l46Var.f0(-1856783774);
            q8b.a(str, x16Var, j09Var, null, z, l46Var, (i2 & 14) | ((i2 >> 9) & 112) | 384 | ((i2 << 9) & 57344), 8);
            l46Var.r(false);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z50(str, z, z2, j09Var, x16Var, i);
        }
    }

    public static final void b(int i, x16 x16Var, l46 l46Var, j09 j09Var, String str, boolean z) {
        String str2;
        int i2;
        l46 l46Var2;
        l46Var.h0(-1285182422);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (l46Var.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            gh6 gh6VarW0 = kj0.w0(l46Var);
            j09 j09VarP = pa7.p(ynb.Z(j09Var, 6.0f), z ? 1.0f : 0.38f);
            boolean zI = ((i2 & 7168) == 2048) | l46Var.i(gh6VarW0);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new sj2(gh6VarW0, x16Var, 3);
                l46Var.p0(objR);
            }
            j09 j09VarA = b.a(tm7.o(androidx.compose.foundation.b.c(j09VarP, z, null, null, (x16) objR, 14), a, g21.f), 218.0f, 56.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA);
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
            long j = ((e8b) l46Var.k(l8b.a)).a;
            mue mueVar = pue.a;
            String str3 = str2;
            nte.b(str3, null, j, 0L, ar5.e, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.p(l46Var), l46Var, (i2 & 14) | 1572864, 0, 129850);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a6a(str, z, j09Var, x16Var, i);
        }
    }

    public static final void c(x16 x16Var, l46 l46Var, int i) {
        l46Var.h0(-202351628);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            pa7.c(null, 0L, 0L, null, null, null, af1.b0(-540877596, new fi4(24, feg.c(x16Var, l46Var, ((i2 << 3) & 112) | 6)), l46Var), l46Var, 1572864, 63);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fi4(i, 25, x16Var);
        }
    }

    public static final void d(final List list, final l5a l5aVar, final int i, final bwa bwaVar, final boolean z, final boolean z2, final boolean z3, final a26 a26Var, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final x16 x16Var5, final x16 x16Var6, l46 l46Var, final int i2, final int i3) {
        int i4;
        x16 x16Var7;
        l46 l46Var2 = l46Var;
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        x16Var5.getClass();
        x16Var6.getClass();
        l46Var2.h0(-1179198411);
        int i5 = i2 | (l46Var2.g(list) ? 4 : 2) | (l46Var2.e(l5aVar.ordinal()) ? 32 : 16);
        boolean zE = l46Var2.e(i);
        int i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        int i7 = i5 | (zE ? 256 : 128);
        boolean zG = l46Var2.g(bwaVar);
        int i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        int i9 = i7 | (zG ? 2048 : 1024) | (l46Var2.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.h(z2) ? 131072 : 65536) | (l46Var2.h(z3) ? 1048576 : 524288) | (l46Var2.i(a26Var) ? 8388608 : 4194304) | (l46Var2.i(x16Var) ? 67108864 : 33554432) | (l46Var2.i(x16Var2) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (l46Var2.i(x16Var3) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var2.i(x16Var4) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (l46Var2.i(x16Var5)) {
                i6 = 256;
            }
            i4 |= i6;
        }
        if ((i3 & 3072) == 0) {
            if (l46Var2.i(x16Var6)) {
                i8 = 2048;
            }
            i4 |= i8;
        }
        if (l46Var2.W(i9 & 1, ((306783379 & i9) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            final boolean zF = k8b.f((e8b) l46Var2.k(l8b.a));
            final boolean z4 = !zF;
            Object[] objArr = new Object[0];
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new vy9(14);
                l46Var2.p0(objR);
            }
            final e89 e89Var = (e89) vfh.I(objArr, (x16) objR, l46Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = new vy9(15);
                l46Var2.p0(objR2);
            }
            final e89 e89Var2 = (e89) vfh.I(objArr2, (x16) objR2, l46Var2, 48);
            FillElement fillElement = b.c;
            x16Var7 = x16Var;
            xdc.a(fillElement, af1.b0(15647985, new fi4(26, x16Var3), l46Var2), af1.b0(-872389552, new l26() { // from class: b6a
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    long j;
                    l46 l46Var3 = (l46) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        if (z4) {
                            l46Var3.f0(-847734497);
                            j = ((e8b) l46Var3.k(l8b.a)).a;
                        } else {
                            l46Var3.f0(-847733603);
                            j = ((e8b) l46Var3.k(l8b.a)).e;
                        }
                        l46Var3.r(false);
                        long j2 = j;
                        final boolean z5 = z2;
                        final boolean z6 = zF;
                        final e89 e89Var3 = e89Var;
                        final x16 x16Var8 = x16Var;
                        final e89 e89Var4 = e89Var2;
                        final bwa bwaVar2 = bwaVar;
                        final boolean z7 = z3;
                        oa7.b(null, j2, 0.0f, af1.b0(604533772, new n26() { // from class: z5a
                            @Override // defpackage.n26
                            public final Object m(Object obj3, Object obj4, Object obj5) {
                                int i10;
                                int i11;
                                String strI;
                                String strR;
                                l46 l46Var4 = (l46) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((c31) obj3).getClass();
                                if (l46Var4.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    g09 g09Var = g09.a;
                                    j09 j09VarN = mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 8.0f, 7, ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2)));
                                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var4, 48);
                                    int iHashCode = Long.hashCode(l46Var4.T);
                                    u8a u8aVarM = l46Var4.m();
                                    j09 j09VarJ = m93.J(l46Var4, j09VarN);
                                    lf2.q.getClass();
                                    l46Var4.j0();
                                    if (l46Var4.S) {
                                        l46Var4.l(LayoutNode.h1);
                                    } else {
                                        l46Var4.s0();
                                    }
                                    dec.l(hj6.z, l46Var4, c92VarA);
                                    dec.l(hj6.y, l46Var4, u8aVarM);
                                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode));
                                    dec.k(l46Var4);
                                    dec.l(hj6.x, l46Var4, j09VarJ);
                                    String strQ = afc.q(R.string.paywall_cta_continue, l46Var4);
                                    j09 j09VarC = b.c(g09Var, 1.0f);
                                    e89 e89Var5 = e89Var3;
                                    boolean zG2 = l46Var4.g(e89Var5);
                                    x16 x16Var9 = x16Var8;
                                    boolean zG3 = zG2 | l46Var4.g(x16Var9);
                                    e89 e89Var6 = e89Var4;
                                    boolean zG4 = zG3 | l46Var4.g(e89Var6);
                                    Object objR3 = l46Var4.R();
                                    i8c i8cVar2 = sf2.a;
                                    if (zG4 || objR3 == i8cVar2) {
                                        objR3 = new ki3(x16Var9, e89Var5, e89Var6, 4);
                                        l46Var4.p0(objR3);
                                    }
                                    e6a.a(strQ, z5, z6, j09VarC, (x16) objR3, l46Var4, 3072);
                                    o5c.f(l46Var4, b.d(g09Var, 8.0f));
                                    bwa bwaVar3 = bwaVar2;
                                    String strR2 = null;
                                    if (bwaVar3 instanceof z6e) {
                                        l46Var4.f0(-2129586466);
                                        z6e z6eVar = (z6e) bwaVar3;
                                        if (!p4a.a(z6eVar, z7)) {
                                            bwaVar3 = null;
                                        }
                                        z6e z6eVar2 = (z6e) bwaVar3;
                                        String strB = z6eVar2 != null ? p4a.b(z6eVar2) : null;
                                        if (strB != null) {
                                            l46Var4.f0(-2129432954);
                                            strR = afc.r(R.string.paywall_cta_first_month_auto_renew, new Object[]{z6eVar.y(), strB}, l46Var4);
                                            l46Var4.r(false);
                                        } else {
                                            l46Var4.f0(-2129266391);
                                            int iOrdinal = z6eVar.h().ordinal();
                                            if (iOrdinal != 0) {
                                                if (iOrdinal != 1) {
                                                    l46Var4.f0(-2129047874);
                                                    l46Var4.r(false);
                                                    strI = "";
                                                } else {
                                                    i10 = 1732434349;
                                                    i11 = R.string.paywall_sku_per_year;
                                                }
                                                strR = z6eVar.y() + strI + " " + afc.q(R.string.paywall_cta_auto_renew, l46Var4);
                                                l46Var4.r(false);
                                            } else {
                                                i10 = 1732431662;
                                                i11 = R.string.paywall_sku_per_month;
                                            }
                                            strI = tec.i(l46Var4, i10, i11, l46Var4, false);
                                            strR = z6eVar.y() + strI + " " + afc.q(R.string.paywall_cta_auto_renew, l46Var4);
                                            l46Var4.r(false);
                                        }
                                        strR2 = strR + "\n" + afc.q(R.string.paywall_cta_credit_refresh_monthly, l46Var4);
                                        l46Var4.r(false);
                                    } else if (bwaVar3 instanceof n07) {
                                        l46Var4.f0(-2128813171);
                                        n07 n07Var = (n07) bwaVar3;
                                        p07 p07VarG = n07Var.g();
                                        thb thbVar = p07VarG instanceof thb ? (thb) p07VarG : null;
                                        strR2 = afc.r(R.string.paywall_cta_reading_pack_desc, new Object[]{n07Var.y(), Integer.valueOf(thbVar != null ? thbVar.d() : 5)}, l46Var4);
                                        l46Var4.r(false);
                                    } else {
                                        l46Var4.f0(-2128625219);
                                        l46Var4.r(false);
                                    }
                                    String str = strR2;
                                    Object objR4 = l46Var4.R();
                                    if (objR4 == i8cVar2) {
                                        objR4 = new q4a(5);
                                        l46Var4.p0(objR4);
                                    }
                                    kn2.c(str, null, (a26) objR4, null, "ctaSubtitle", null, k99.e, l46Var4, 1597824, 42);
                                    l46 l46Var5 = l46Var4;
                                    ca2.a.getClass();
                                    if (ca2.c) {
                                        l46Var5.f0(-1054436736);
                                        l46Var5.r(false);
                                    } else {
                                        l46Var5.f0(-1054577042);
                                        boolean zBooleanValue = ((Boolean) e89Var5.getValue()).booleanValue();
                                        boolean zG5 = l46Var5.g(e89Var5);
                                        Object objR5 = l46Var5.R();
                                        if (zG5 || objR5 == i8cVar2) {
                                            objR5 = new w77(e89Var5, 5);
                                            l46Var5.p0(objR5);
                                        }
                                        ynb.s(null, zBooleanValue, (a26) objR5, null, null, false, l46Var5, 0, 57);
                                        l46Var5 = l46Var5;
                                        l46Var5.r(false);
                                    }
                                    l46Var5.r(true);
                                } else {
                                    l46Var4.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var3), l46Var3, 3072, 5);
                    } else {
                        l46Var3.Z();
                    }
                    return wef.a;
                }
            }, l46Var2), null, null, 0, 0L, 0L, null, af1.b0(1943937350, new n26() { // from class: c6a
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    xw9 xw9Var = (xw9) obj;
                    l46 l46Var3 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    xw9Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var3.g(xw9Var) ? 4 : 2;
                    }
                    if (l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        rs0.f(b.c, false, af1.b0(1641103491, new i53(zF, xw9Var, list, a26Var, bwaVar, l5aVar, i, x16Var4, x16Var5, x16Var2, x16Var6), l46Var3), l46Var3, 390, 2);
                    } else {
                        l46Var3.Z();
                    }
                    return wef.a;
                }
            }, l46Var2), l46Var, 805306806, 504);
            l46Var2 = l46Var;
            if (((Boolean) e89Var2.getValue()).booleanValue()) {
                l46Var2.f0(-956842360);
                k00 k00VarM = z5c.m(1, l46Var2, null);
                String strQ = afc.q(R.string.confirm_to_purchase, l46Var2);
                String strQ2 = afc.q(R.string.disagree, l46Var2);
                String strQ3 = afc.q(R.string.continute_to_purchase, l46Var2);
                dd2 dd2VarB0 = af1.b0(1520648555, new xg(k00VarM, 5), l46Var2);
                boolean zG2 = l46Var2.g(e89Var2);
                Object objR3 = l46Var2.R();
                if (zG2 || objR3 == i8cVar) {
                    objR3 = new x08(e89Var2, 20);
                    l46Var2.p0(objR3);
                }
                x16 x16Var8 = (x16) objR3;
                boolean zG3 = ((i9 & 234881024) == 67108864) | l46Var2.g(e89Var2) | l46Var2.g(e89Var);
                Object objR4 = l46Var2.R();
                if (zG3 || objR4 == i8cVar) {
                    objR4 = new ki3(x16Var7, e89Var2, e89Var, 5);
                    l46Var2.p0(objR4);
                }
                kj0.F(strQ, dd2VarB0, strQ3, strQ2, false, false, null, null, x16Var8, (x16) objR4, l46Var, 48, 240);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-956376275);
                l46Var2.r(false);
            }
            if (z) {
                l46Var2.f0(-956341462);
                j09 j09VarO = tm7.o(fillElement, y72.b(y72.b, 0.5f), g21.f);
                Object objR5 = l46Var2.R();
                if (objR5 == i8cVar) {
                    objR5 = new vy9(16);
                    l46Var2.p0(objR5);
                }
                j09 j09VarC = androidx.compose.foundation.b.c(j09VarO, false, null, null, (x16) objR5, 15);
                xn8 xn8VarC = s21.c(ndb.f, false);
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
                dec.l(hj6.z, l46Var2, xn8VarC);
                dec.l(hj6.y, l46Var2, u8aVarM);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(hj6.x, l46Var2, j09VarJ);
                axa.a(0.0f, 0.0f, 0, 48, 61, y72.e, 0L, l46Var2, null);
                l46Var2.r(true);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-956092563);
                l46Var2.r(false);
            }
        } else {
            x16Var7 = x16Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final x16 x16Var9 = x16Var7;
            ojbVarV.d = new l26(list, l5aVar, i, bwaVar, z, z2, z3, a26Var, x16Var9, x16Var2, x16Var3, x16Var4, x16Var5, x16Var6, i2, i3) { // from class: d6a
                public final /* synthetic */ x16 X;
                public final /* synthetic */ x16 Y;
                public final /* synthetic */ int Z;
                public final /* synthetic */ List a;
                public final /* synthetic */ l5a b;
                public final /* synthetic */ int c;
                public final /* synthetic */ bwa d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ a26 v;
                public final /* synthetic */ x16 w;
                public final /* synthetic */ x16 x;
                public final /* synthetic */ x16 y;
                public final /* synthetic */ x16 z;

                {
                    this.Z = i3;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    int iP2 = k99.P(this.Z);
                    e6a.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, (l46) obj, iP, iP2);
                    return wef.a;
                }
            };
        }
    }
}
