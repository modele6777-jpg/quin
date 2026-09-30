package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mb0 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ mb0(x16 x16Var, boolean z, int i) {
        this.a = i;
        this.c = x16Var;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:63:0x0433 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0435  */
    /* JADX WARN: Code duplicated, block: B:65:0x0469  */
    /* JADX WARN: Code duplicated, block: B:68:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0532  */
    /* JADX WARN: Code duplicated, block: B:75:0x0547  */
    /* JADX WARN: Code duplicated, block: B:77:0x055e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0572  */
    /* JADX WARN: Code duplicated, block: B:82:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x05e5  */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        boolean z;
        pr4 pr4Var;
        long jB;
        boolean z2;
        long j;
        Object objI;
        boolean z3;
        FillElement fillElement;
        mue mueVar;
        mue mueVarA;
        int i;
        mue mueVar2;
        mue mueVarA2;
        boolean z4;
        long j2;
        long j3;
        int i2 = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        i8c i8cVar = sf2.a;
        x16 x16Var = this.c;
        boolean z5 = this.b;
        wef wefVar = wef.a;
        switch (i2) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    x16 x16Var2 = this.c;
                    if (!z5) {
                        l46Var.f0(-53722372);
                        bm8.h(x16Var2, null, false, null, null, vfh.h, l46Var, 1572864, 62);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-53871823);
                        c8b.a(null, false, false, ((e8b) l46Var.k(l8b.a)).q, x16Var2, l46Var, 384, 3);
                        l46Var.r(false);
                    }
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    pa7.a(null, 0L, 0L, null, null, b21.g, !z5, false, this.c, l46Var2, 196608, 159);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                kj0.h(z5, x16Var, (l46) obj, k99.P(1));
                break;
            case 3:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    pa7.d(null, 0L, 0L, null, null, null, !z5, this.c, l46Var3, 0, 63);
                }
                break;
            case 4:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    dd2 dd2Var = db6.d;
                    dd2 dd2Var2 = db6.e;
                    boolean zH = l46Var4.h(z5) | l46Var4.g(x16Var);
                    Object objR = l46Var4.R();
                    if (zH || objR == i8cVar) {
                        objR = new on2(z5, x16Var, 4);
                        l46Var4.p0(objR);
                    }
                    pa7.a(null, 0L, 0L, null, dd2Var, dd2Var2, false, false, (x16) objR, l46Var4, 221184, 207);
                }
                break;
            case 5:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    c8b.i(b.f(56.0f, 0.0f, mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2))), 2), afc.q(R.string.onboarding_theme_complete_button, l46Var5), null, null, 0L, 0.0f, this.b, null, null, false, null, null, this.c, l46Var5, 0, 0, 4028);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                bzd.j(z5, x16Var, (l46) obj, k99.P(1));
                break;
            case 7:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    pa7.a(null, 0L, 0L, null, af1.b0(-1526277214, new ci1(z5, 6), l46Var6), z5c.d, false, false, this.c, l46Var6, 221184, 207);
                }
                break;
            case 8:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    tq.c(b.c(g09Var, 1.0f), null, false, false, this.c, af1.b0(-1530531863, new ci1(z5, 8), l46Var7), l46Var7, 196614, 14);
                }
                break;
            case 9:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    l46Var8.Z();
                } else {
                    pa7.a(null, 0L, 0L, null, af1.b0(1830677628, new ci1(z5, 11), l46Var8), eb3.d, false, false, this.c, l46Var8, 221184, 207);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l46Var9.Z();
                } else {
                    j09 j09VarB = g09.a;
                    j09 j09VarB0 = ynb.b0(0.0f, 24.0f, j09VarB, 1);
                    if (z5) {
                        l46Var9.f0(303384609);
                        pr4Var = l8b.a;
                        jB = y72.b(((e8b) l46Var9.k(pr4Var)).s, 0.38f);
                        z = false;
                    } else {
                        z = false;
                        l46Var9.f0(303385629);
                        pr4Var = l8b.a;
                        jB = ((e8b) l46Var9.k(pr4Var)).s;
                    }
                    l46Var9.r(z);
                    x4d x4dVarB = a7c.b(10.0f);
                    if (we6.e(l46Var9)) {
                        x4dVarB = g21.f;
                    }
                    j09 j09VarW = db6.w(j09VarB0, 1.0f, jB, x4dVarB);
                    if (z5) {
                        l46Var9.f0(303389718);
                        l46Var9.r(false);
                    } else {
                        l46Var9.f0(303391002);
                        Object objR2 = l46Var9.R();
                        if (objR2 == i8cVar) {
                            objR2 = ib8.e(l46Var9);
                        }
                        j09VarB = androidx.compose.foundation.b.b(j09VarB, (t69) objR2, null, false, null, this.c, 28);
                        l46Var9.r(false);
                    }
                    j09 j09VarA0 = ynb.a0(j09VarW.D(j09VarB), 12.0f, 3.5f);
                    t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var9, 48);
                    int iHashCode = Long.hashCode(l46Var9.T);
                    u8a u8aVarM = l46Var9.m();
                    j09 j09VarJ = m93.J(l46Var9, j09VarA0);
                    lf2.q.getClass();
                    l46Var9.j0();
                    if (l46Var9.S) {
                        l46Var9.l(ov7Var);
                    } else {
                        l46Var9.s0();
                    }
                    dec.l(hj6.z, l46Var9, t7cVarA);
                    dec.l(hj6.y, l46Var9, u8aVarM);
                    dec.l(hj6.X, l46Var9, Integer.valueOf(iHashCode));
                    dec.k(l46Var9);
                    dec.l(hj6.x, l46Var9, j09VarJ);
                    String strQ = afc.q(R.string.spread_custom, l46Var9);
                    mue mueVar3 = pue.a;
                    mue mueVarI = pue.i(l46Var9);
                    if (z5) {
                        l46Var9.f0(-853001063);
                        j = ((e8b) l46Var9.k(pr4Var)).s;
                        z2 = false;
                    } else {
                        z2 = false;
                        l46Var9.f0(-853000168);
                        j = ((e8b) l46Var9.k(pr4Var)).q;
                    }
                    l46Var9.r(z2);
                    nte.b(strQ, null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarI, l46Var9, 0, 0, 131066);
                    l46Var9.r(true);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                b7e.b(z5, x16Var, (l46) obj, k99.P(1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var10.Z();
                } else {
                    Context context = (Context) l46Var10.k(uq.b);
                    pr4 pr4Var2 = l8b.a;
                    boolean zF = k8b.f((e8b) l46Var10.k(pr4Var2));
                    boolean z6 = !zF;
                    boolean zH2 = l46Var10.h(zF);
                    Object objR3 = l46Var10.R();
                    if (zH2 || objR3 == i8cVar) {
                        List listK0 = zF ? qd0.k0(new v4d[]{b7e.e(context, R.drawable.ic_confetti_flag), b7e.e(context, R.drawable.ic_confetti_bulb)}) : qd0.k0(new v4d[]{b7e.e(context, R.drawable.ic_confetti_diamond), b7e.e(context, R.drawable.ic_confetti_lightning)});
                        List listH = t72.H(new zkd(32, 0.0f, 6));
                        List listH2 = t72.H(-1);
                        TimeUnit.SECONDS.getClass();
                        et4 et4Var = new et4();
                        et4Var.a = 3000L;
                        et4Var.b = 0.06666667f;
                        s0a s0aVar = new s0a(90, 20, 10.0f, 14.0f, 0.97f, listH, listH2, listK0, new sna(new tna(0.0d, 0.0d), new tna(1.0d, 0.0d)), new r6c(7), et4Var);
                        et4 et4Var2 = new et4();
                        et4Var2.a = 3000L;
                        et4Var2.b = 0.1f;
                        s0a s0aVar2 = new s0a(315, 40, 15.0f, 20.0f, 0.95f, listH, listH2, listK0, new tna(0.0d, 0.3d), new r6c(7), et4Var2);
                        et4 et4Var3 = new et4();
                        et4Var3.a = 3000L;
                        et4Var3.b = 0.1f;
                        objI = t72.I(s0aVar, s0aVar2, new s0a(225, 40, 15.0f, 20.0f, 0.95f, listH, listH2, listK0, new tna(1.0d, 0.3d), new r6c(7), et4Var3));
                        l46Var10.p0(objI);
                    } else {
                        objI = objR3;
                    }
                    List list = (List) objI;
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var10.T);
                    u8a u8aVarM2 = l46Var10.m();
                    j09 j09VarJ2 = m93.J(l46Var10, g09Var);
                    lf2.q.getClass();
                    l46Var10.j0();
                    if (l46Var10.S) {
                        l46Var10.l(ov7Var);
                    } else {
                        l46Var10.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var10, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var10, u8aVarM2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var10, numValueOf);
                    dec.k(l46Var10);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var10, j09VarJ2);
                    d31 d31Var = d31.a;
                    if (zF) {
                        z3 = false;
                        l46Var10.f0(895706681);
                        FillElement fillElement2 = b.c;
                        feg.j(od4.A(R.drawable.bg_subscription_congratulation_greyscale, 0, l46Var10), "", fillElement2, null, an2.a, 0.0f, null, l46Var10, 25016, 104);
                        l46Var10.r(false);
                        fillElement = fillElement2;
                    } else {
                        l46Var10.f0(895257801);
                        fillElement = b.c;
                        z3 = false;
                        s21.a(tm7.o(fillElement, ((e8b) l46Var10.k(pr4Var2)).i, g21.f), l46Var10, 0);
                        feg.j(od4.A(R.drawable.bg_subscription_congratulation_wecom, 0, l46Var10), null, d31Var.a(b.c(g09Var, 1.0f), ndb.c), null, an2.d, 0.0f, null, l46Var10, 24632, 104);
                        l46Var10.r(false);
                    }
                    FillElement fillElement3 = fillElement;
                    j09 j09VarD0 = ynb.d0(0.0f, 24.0f, 0.0f, 88.0f, 5, ynb.b0(32.0f, 0.0f, mh3.Y(mh3.d0(fillElement, mh3.T(l46Var10), z3, 14)), 2));
                    jx0 jx0Var = ndb.Z;
                    c92 c92VarA = a92.a(xc0.e, jx0Var, l46Var10, 54);
                    int iHashCode3 = Long.hashCode(l46Var10.T);
                    u8a u8aVarM3 = l46Var10.m();
                    j09 j09VarJ3 = m93.J(l46Var10, j09VarD0);
                    l46Var10.j0();
                    if (l46Var10.S) {
                        l46Var10.l(ov7Var);
                    } else {
                        l46Var10.s0();
                    }
                    dec.l(he2Var, l46Var10, c92VarA);
                    dec.l(he2Var2, l46Var10, u8aVarM3);
                    ib8.s(iHashCode3, l46Var10, he2Var3, l46Var10);
                    dec.l(he2Var4, l46Var10, j09VarJ3);
                    c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), jx0Var, l46Var10, 54);
                    int iHashCode4 = Long.hashCode(l46Var10.T);
                    u8a u8aVarM4 = l46Var10.m();
                    j09 j09VarJ4 = m93.J(l46Var10, g09Var);
                    l46Var10.j0();
                    if (l46Var10.S) {
                        l46Var10.l(ov7Var);
                    } else {
                        l46Var10.s0();
                    }
                    dec.l(he2Var, l46Var10, c92VarA2);
                    dec.l(he2Var2, l46Var10, u8aVarM4);
                    ib8.s(iHashCode4, l46Var10, he2Var3, l46Var10);
                    dec.l(he2Var4, l46Var10, j09VarJ4);
                    feg.j(od4.A(zF ? R.drawable.img_clap : R.drawable.img_wecom_bow, 0, l46Var10), null, b.l(g09Var, 88.0f), null, null, 0.0f, null, l46Var10, 440, 120);
                    String strQ2 = afc.q(z5 != 0 ? R.string.paywall_congratulation_wecom_title : R.string.paywall_congratulation_title, l46Var10);
                    if (zF) {
                        if (z5 != 0) {
                            l46Var10.f0(-1644198946);
                            mue mueVar4 = pue.a;
                            mueVarA = mue.a(pue.n(l46Var10), ((e8b) l46Var10.k(pr4Var2)).q, 0L, null, cr5.e, 0L, null, 3, 0L, null, null, 16744414);
                            l46Var10.r(false);
                        } else {
                            l46Var10.f0(-1644197578);
                            mue mueVar5 = new mue(y72.b(((m82) l46Var10.k(o82.a)).o, 0.88f), w6c.l(32), ar5.d, null, ((y8b) l46Var10.k(x8b.a)).c, 0L, 0L, 3, 0, w6c.k(41.6d), null, null, 16613336);
                            l46Var10.r(false);
                            mueVar = mueVar5;
                        }
                        nte.b(strQ2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var10, 0, 0, 131070);
                        j09 j09VarC = b.c(g09Var, 1.0f);
                        if (z5 != 0) {
                            i = R.string.paywall_congratulation_wecom_subtitle;
                        } else {
                            i = R.string.paywall_congratulation_content;
                        }
                        String strQ3 = afc.q(i, l46Var10);
                        if (!zF) {
                            if (z5 != 0) {
                                l46Var10.f0(-1644184479);
                                mue mueVar6 = pue.a;
                                mueVarA2 = mue.a(pue.c(l46Var10), ((e8b) l46Var10.k(pr4Var2)).r, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446);
                                l46Var10.r(false);
                            } else {
                                l46Var10.f0(-1644183014);
                                mue mueVar7 = new mue(((m82) l46Var10.k(o82.a)).g, w6c.l(17), null, null, ((y8b) l46Var10.k(x8b.a)).b, 0L, 0L, 3, 0, w6c.l(26), null, null, 16613340);
                                l46Var10.r(false);
                                mueVar2 = mueVar7;
                            }
                            nte.b(strQ3, j09VarC, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar2, l46Var10, 48, 0, 131068);
                            l46Var10.r(true);
                            if (z5) {
                                ib8.r(24.0f, 2081027661, l46Var10, l46Var10, g09Var);
                                b7e.c(0, l46Var10, zF);
                                o5c.f(l46Var10, b.d(g09Var, 24.0f));
                                b7e.d(0, l46Var10, zF);
                                l46Var10.r(false);
                            } else {
                                l46Var10.f0(2081213134);
                                l46Var10.r(false);
                            }
                            l46Var10.r(true);
                            j09 j09VarB1 = ynb.b0(32.0f, 0.0f, b.b(0.0f, 56.0f, ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, b.c(d31Var.a(mh3.N(g09Var), ndb.w), 1.0f)), 1), 2);
                            bx9 bx9Var = v51.a;
                            if (zF) {
                                l46Var10.f0(1275899661);
                                j2 = ((e8b) l46Var10.k(pr4Var2)).a;
                                z4 = false;
                                l46Var10.r(false);
                            } else {
                                z4 = false;
                                l46Var10.f0(1275900661);
                                int i3 = g82.z;
                                j2 = ((e8b) l46Var10.k(pr4Var2)).g;
                                l46Var10.r(false);
                            }
                            long j4 = j2;
                            if (zF) {
                                l46Var10.f0(1275904172);
                                j3 = ((e8b) l46Var10.k(pr4Var2)).q;
                                l46Var10.r(z4);
                            } else {
                                l46Var10.f0(1275905964);
                                j3 = ((m82) l46Var10.k(o82.a)).e;
                                l46Var10.r(z4);
                            }
                            cgg.a(this.c, j09VarB1, false, eze.a(l46Var10).a.a, v51.a(j3, j4, 0L, 0L, l46Var10, 12), null, null, null, af1.b0(-1868289714, new g8(z6, 7), l46Var10), l46Var10, 805306368, 484);
                            if (((Boolean) l46Var10.k(h57.a)).booleanValue()) {
                                l46Var10.f0(899012676);
                                l46Var10.r(false);
                            } else {
                                l46Var10.f0(898894473);
                                vpf.f(6, 4, l46Var10, fillElement3, list);
                                l46Var10.r(false);
                            }
                            l46Var10.r(true);
                        } else {
                            l46Var10.f0(-1644186303);
                            mue mueVar8 = pue.a;
                            mueVarA2 = mue.a(pue.e(l46Var10), ((e8b) l46Var10.k(pr4Var2)).v, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446);
                            l46Var10.r(false);
                        }
                        mueVar2 = mueVarA2;
                        nte.b(strQ3, j09VarC, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar2, l46Var10, 48, 0, 131068);
                        l46Var10.r(true);
                        if (z5) {
                            ib8.r(24.0f, 2081027661, l46Var10, l46Var10, g09Var);
                            b7e.c(0, l46Var10, zF);
                            o5c.f(l46Var10, b.d(g09Var, 24.0f));
                            b7e.d(0, l46Var10, zF);
                            l46Var10.r(false);
                        } else {
                            l46Var10.f0(2081213134);
                            l46Var10.r(false);
                        }
                        l46Var10.r(true);
                        j09 j09VarB2 = ynb.b0(32.0f, 0.0f, b.b(0.0f, 56.0f, ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, b.c(d31Var.a(mh3.N(g09Var), ndb.w), 1.0f)), 1), 2);
                        bx9 bx9Var2 = v51.a;
                        if (zF) {
                            l46Var10.f0(1275899661);
                            j2 = ((e8b) l46Var10.k(pr4Var2)).a;
                            z4 = false;
                            l46Var10.r(false);
                        } else {
                            z4 = false;
                            l46Var10.f0(1275900661);
                            int i4 = g82.z;
                            j2 = ((e8b) l46Var10.k(pr4Var2)).g;
                            l46Var10.r(false);
                        }
                        long j5 = j2;
                        if (zF) {
                            l46Var10.f0(1275904172);
                            j3 = ((e8b) l46Var10.k(pr4Var2)).q;
                            l46Var10.r(z4);
                        } else {
                            l46Var10.f0(1275905964);
                            j3 = ((m82) l46Var10.k(o82.a)).e;
                            l46Var10.r(z4);
                        }
                        cgg.a(this.c, j09VarB2, false, eze.a(l46Var10).a.a, v51.a(j3, j5, 0L, 0L, l46Var10, 12), null, null, null, af1.b0(-1868289714, new g8(z6, 7), l46Var10), l46Var10, 805306368, 484);
                        if (((Boolean) l46Var10.k(h57.a)).booleanValue()) {
                            l46Var10.f0(898894473);
                            vpf.f(6, 4, l46Var10, fillElement3, list);
                            l46Var10.r(false);
                        } else {
                            l46Var10.f0(899012676);
                            l46Var10.r(false);
                        }
                        l46Var10.r(true);
                    } else {
                        l46Var10.f0(-1644200674);
                        mue mueVar9 = pue.a;
                        mueVarA = mue.a(pue.n(l46Var10), ((e8b) l46Var10.k(pr4Var2)).v, 0L, null, cr5.c, 0L, null, 3, 0L, null, null, 16744414);
                        l46Var10.r(false);
                    }
                    mueVar = mueVarA;
                    nte.b(strQ2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var10, 0, 0, 131070);
                    j09 j09VarC2 = b.c(g09Var, 1.0f);
                    if (z5 != 0) {
                        i = R.string.paywall_congratulation_wecom_subtitle;
                    } else {
                        i = R.string.paywall_congratulation_content;
                    }
                    String strQ4 = afc.q(i, l46Var10);
                    if (!zF) {
                        if (z5 != 0) {
                            l46Var10.f0(-1644184479);
                            mue mueVar10 = pue.a;
                            mueVarA2 = mue.a(pue.c(l46Var10), ((e8b) l46Var10.k(pr4Var2)).r, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446);
                            l46Var10.r(false);
                        } else {
                            l46Var10.f0(-1644183014);
                            mue mueVar11 = new mue(((m82) l46Var10.k(o82.a)).g, w6c.l(17), null, null, ((y8b) l46Var10.k(x8b.a)).b, 0L, 0L, 3, 0, w6c.l(26), null, null, 16613340);
                            l46Var10.r(false);
                            mueVar2 = mueVar11;
                        }
                        nte.b(strQ4, j09VarC2, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar2, l46Var10, 48, 0, 131068);
                        l46Var10.r(true);
                        if (z5) {
                            ib8.r(24.0f, 2081027661, l46Var10, l46Var10, g09Var);
                            b7e.c(0, l46Var10, zF);
                            o5c.f(l46Var10, b.d(g09Var, 24.0f));
                            b7e.d(0, l46Var10, zF);
                            l46Var10.r(false);
                        } else {
                            l46Var10.f0(2081213134);
                            l46Var10.r(false);
                        }
                        l46Var10.r(true);
                        j09 j09VarB3 = ynb.b0(32.0f, 0.0f, b.b(0.0f, 56.0f, ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, b.c(d31Var.a(mh3.N(g09Var), ndb.w), 1.0f)), 1), 2);
                        bx9 bx9Var3 = v51.a;
                        if (zF) {
                            l46Var10.f0(1275899661);
                            j2 = ((e8b) l46Var10.k(pr4Var2)).a;
                            z4 = false;
                            l46Var10.r(false);
                        } else {
                            z4 = false;
                            l46Var10.f0(1275900661);
                            int i5 = g82.z;
                            j2 = ((e8b) l46Var10.k(pr4Var2)).g;
                            l46Var10.r(false);
                        }
                        long j6 = j2;
                        if (zF) {
                            l46Var10.f0(1275904172);
                            j3 = ((e8b) l46Var10.k(pr4Var2)).q;
                            l46Var10.r(z4);
                        } else {
                            l46Var10.f0(1275905964);
                            j3 = ((m82) l46Var10.k(o82.a)).e;
                            l46Var10.r(z4);
                        }
                        cgg.a(this.c, j09VarB3, false, eze.a(l46Var10).a.a, v51.a(j3, j6, 0L, 0L, l46Var10, 12), null, null, null, af1.b0(-1868289714, new g8(z6, 7), l46Var10), l46Var10, 805306368, 484);
                        if (((Boolean) l46Var10.k(h57.a)).booleanValue()) {
                            l46Var10.f0(898894473);
                            vpf.f(6, 4, l46Var10, fillElement3, list);
                            l46Var10.r(false);
                        } else {
                            l46Var10.f0(899012676);
                            l46Var10.r(false);
                        }
                        l46Var10.r(true);
                    } else {
                        l46Var10.f0(-1644186303);
                        mue mueVar12 = pue.a;
                        mueVarA2 = mue.a(pue.e(l46Var10), ((e8b) l46Var10.k(pr4Var2)).v, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446);
                        l46Var10.r(false);
                    }
                    mueVar2 = mueVarA2;
                    nte.b(strQ4, j09VarC2, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar2, l46Var10, 48, 0, 131068);
                    l46Var10.r(true);
                    if (z5) {
                        ib8.r(24.0f, 2081027661, l46Var10, l46Var10, g09Var);
                        b7e.c(0, l46Var10, zF);
                        o5c.f(l46Var10, b.d(g09Var, 24.0f));
                        b7e.d(0, l46Var10, zF);
                        l46Var10.r(false);
                    } else {
                        l46Var10.f0(2081213134);
                        l46Var10.r(false);
                    }
                    l46Var10.r(true);
                    j09 j09VarB4 = ynb.b0(32.0f, 0.0f, b.b(0.0f, 56.0f, ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, b.c(d31Var.a(mh3.N(g09Var), ndb.w), 1.0f)), 1), 2);
                    bx9 bx9Var4 = v51.a;
                    if (zF) {
                        l46Var10.f0(1275899661);
                        j2 = ((e8b) l46Var10.k(pr4Var2)).a;
                        z4 = false;
                        l46Var10.r(false);
                    } else {
                        z4 = false;
                        l46Var10.f0(1275900661);
                        int i6 = g82.z;
                        j2 = ((e8b) l46Var10.k(pr4Var2)).g;
                        l46Var10.r(false);
                    }
                    long j7 = j2;
                    if (zF) {
                        l46Var10.f0(1275904172);
                        j3 = ((e8b) l46Var10.k(pr4Var2)).q;
                        l46Var10.r(z4);
                    } else {
                        l46Var10.f0(1275905964);
                        j3 = ((m82) l46Var10.k(o82.a)).e;
                        l46Var10.r(z4);
                    }
                    cgg.a(this.c, j09VarB4, false, eze.a(l46Var10).a.a, v51.a(j3, j7, 0L, 0L, l46Var10, 12), null, null, null, af1.b0(-1868289714, new g8(z6, 7), l46Var10), l46Var10, 805306368, 484);
                    if (((Boolean) l46Var10.k(h57.a)).booleanValue()) {
                        l46Var10.f0(898894473);
                        vpf.f(6, 4, l46Var10, fillElement3, list);
                        l46Var10.r(false);
                    } else {
                        l46Var10.f0(899012676);
                        l46Var10.r(false);
                    }
                    l46Var10.r(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b7e.a(z5, x16Var, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ mb0(boolean z, x16 x16Var, int i) {
        this.a = i;
        this.b = z;
        this.c = x16Var;
    }

    public /* synthetic */ mb0(boolean z, x16 x16Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = x16Var;
    }
}
