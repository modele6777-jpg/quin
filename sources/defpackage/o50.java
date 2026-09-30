package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.router.GiftCardPerspective;
import ai.askquin.ui.share.SharedDivination;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.ShareSummaryContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o50 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o50(Bitmap bitmap, String str, a26 a26Var, boolean z, int i) {
        this.a = 21;
        this.d = bitmap;
        this.e = str;
        this.c = a26Var;
        this.b = z;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        j09 j09VarR;
        gd7 gd7Var;
        int i = this.a;
        g09 g09Var = g09.a;
        d31 d31Var = d31.a;
        i8c i8cVar = sf2.a;
        ov7 ov7Var = LayoutNode.h1;
        boolean z = this.b;
        wef wefVar = wef.a;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                od4.a(k99.P(3505), (dd2) obj3, (x16) obj4, (l46) obj, (String) obj5, this.b);
                break;
            case 1:
                he2 he2Var = hj6.x;
                he2 he2Var2 = hj6.y;
                he2 he2Var3 = hj6.z;
                m91 m91Var = (m91) obj4;
                gd7 gd7Var2 = (gd7) obj5;
                dd2 dd2Var = (dd2) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    if (z) {
                        if (1.0f <= 0.0d) {
                            g37.a("invalid weight; must be greater than zero");
                        }
                        j09VarR = new jw7(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                    } else {
                        j09VarR = b.r(g09Var);
                    }
                    j09 j09VarD = j09VarC.D(j09VarR);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                    g09 g09Var2 = g09Var;
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarD);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var3, l46Var, c92VarA);
                    dec.l(he2Var2, l46Var, u8aVarM);
                    dec.h(l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(he2Var, l46Var, j09VarJ);
                    l46Var.f0(1492730795);
                    Iterator it = m91Var.a().iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        int i3 = i2 + 1;
                        List list = (List) it.next();
                        g09 g09Var3 = g09Var2;
                        j09 j09VarD2 = b.c(g09Var3, 1.0f).D(z ? new jw7(1.0f, true) : b.r(g09Var3));
                        t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var, 0);
                        int iHashCode2 = Long.hashCode(l46Var.T);
                        u8a u8aVarM2 = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, j09VarD2);
                        lf2.q.getClass();
                        l46Var.j0();
                        boolean z2 = z;
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var3, l46Var, t7cVarA);
                        dec.l(he2Var2, l46Var, u8aVarM2);
                        dec.h(l46Var, Integer.valueOf(iHashCode2));
                        dec.k(l46Var);
                        dec.l(he2Var, l46Var, j09VarJ2);
                        l46Var.f0(-386799768);
                        Iterator it2 = list.iterator();
                        int i4 = 0;
                        while (it2.hasNext()) {
                            int i5 = i4 + 1;
                            d91 d91Var = (d91) it2.next();
                            Iterator it3 = it2;
                            j09 j09VarF = oa7.F(new jw7(1.0f, true));
                            boolean zG = l46Var.g(gd7Var2);
                            Object objR = l46Var.R();
                            if (zG || objR == i8cVar) {
                                gd7Var = gd7Var2;
                                objR = new w(1, gd7Var, gd7.class, "onFirstDayPlaced", "onFirstDayPlaced(Landroidx/compose/ui/layout/LayoutCoordinates;)V", 0, 15);
                                l46Var.p0(objR);
                            } else {
                                gd7Var = gd7Var2;
                            }
                            a26 a26Var = (a26) ((ym7) objR);
                            if (i2 == 0 && i4 == 0) {
                                j09VarF = ok8.E(j09VarF, a26Var);
                            }
                            xn8 xn8VarC = s21.c(ndb.b, false);
                            int iHashCode3 = Long.hashCode(l46Var.T);
                            u8a u8aVarM3 = l46Var.m();
                            j09 j09VarJ3 = m93.J(l46Var, j09VarF);
                            lf2.q.getClass();
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var3, l46Var, xn8VarC);
                            dec.l(he2Var2, l46Var, u8aVarM3);
                            dec.h(l46Var, Integer.valueOf(iHashCode3));
                            dec.k(l46Var);
                            dec.l(he2Var, l46Var, j09VarJ3);
                            dd2Var.t(d31Var, d91Var, l46Var, 6);
                            l46Var.r(true);
                            i4 = i5;
                            it2 = it3;
                            gd7Var2 = gd7Var;
                        }
                        l46Var.r(false);
                        l46Var.r(true);
                        it = it;
                        i2 = i3;
                        g09Var2 = g09Var3;
                        z = z2;
                    }
                    l46Var.r(false);
                    l46Var.r(true);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                qn4.l(this.b, (a26) obj5, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case 3:
                h0e h0eVar = (h0e) obj4;
                a26 a26Var2 = (a26) obj5;
                xp1 xp1Var = (xp1) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else if (!z && ((eie) h0eVar.getValue()).a) {
                    l46Var2.f0(2083190633);
                    j09 j09VarA0 = ynb.a0(mh3.N(b.r(g09Var)), 16.0f, 16.0f);
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    int iHashCode4 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM4 = l46Var2.m();
                    j09 j09VarJ4 = m93.J(l46Var2, j09VarA0);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC2);
                    dec.l(hj6.y, l46Var2, u8aVarM4);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode4));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ4);
                    j09 j09VarC2 = b.c(g09Var, 1.0f);
                    boolean zG2 = l46Var2.g(a26Var2) | l46Var2.i(xp1Var);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new ad1(3, a26Var2, xp1Var);
                        l46Var2.p0(objR2);
                    }
                    ym8.h(j09VarC2, false, null, false, (x16) objR2, l46Var2, 6, 14);
                    l46Var2.r(true);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(2083544281);
                    l46Var2.r(false);
                }
                break;
            case 4:
                Integer num = (Integer) obj4;
                dd2 dd2Var2 = (dd2) obj3;
                use useVar = (use) obj5;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else if (num != null && z) {
                    l46Var3.f0(1231461931);
                    lx0 lx0Var = ndb.b;
                    xn8 xn8VarC3 = s21.c(lx0Var, false);
                    int iHashCode5 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM5 = l46Var3.m();
                    g09 g09Var4 = g09.a;
                    j09 j09VarJ5 = m93.J(l46Var3, g09Var4);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    he2 he2Var4 = hj6.z;
                    dec.l(he2Var4, l46Var3, xn8VarC3);
                    he2 he2Var5 = hj6.y;
                    dec.l(he2Var5, l46Var3, u8aVarM5);
                    Integer numValueOf = Integer.valueOf(iHashCode5);
                    he2 he2Var6 = hj6.X;
                    dec.l(he2Var6, l46Var3, numValueOf);
                    dec.k(l46Var3);
                    he2 he2Var7 = hj6.x;
                    dec.l(he2Var7, l46Var3, j09VarJ5);
                    j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 20.0f, 7, g09Var4);
                    xn8 xn8VarC4 = s21.c(lx0Var, false);
                    int iHashCode6 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM6 = l46Var3.m();
                    j09 j09VarJ6 = m93.J(l46Var3, j09VarD0);
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(he2Var4, l46Var3, xn8VarC4);
                    dec.l(he2Var5, l46Var3, u8aVarM6);
                    ib8.s(iHashCode6, l46Var3, he2Var6, l46Var3);
                    dec.l(he2Var7, l46Var3, j09VarJ6);
                    dd2Var2.z(l46Var3, 0);
                    l46Var3.r(true);
                    i7h.b(useVar.d().c.length(), num.intValue(), d31Var.a(g09Var4, ndb.v), null, null, l46Var3, 0);
                    l46Var3.r(true);
                    l46Var3.r(false);
                } else {
                    l46Var3.f0(1231898163);
                    dd2Var2.z(l46Var3, 0);
                    l46Var3.r(false);
                }
                break;
            case 5:
                t69 t69Var = (t69) obj4;
                wne wneVar = (wne) obj5;
                h0e h0eVar2 = (h0e) obj3;
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    qk6.O0.a(this.b, false, t69Var, null, wneVar, g21.f, ((yi4) h0eVar2.getValue()).a, ((yi4) h0eVar2.getValue()).a, l46Var4, 100860336, 8);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                jgb.D((j09) obj4, this.b, (xw9) obj5, (dd2) obj3, (l46) obj, k99.P(3073));
                break;
            case 7:
                ((Integer) obj2).getClass();
                n16.i((j09) obj5, (z63) obj3, this.b, (x16) obj4, (l46) obj, k99.P(65));
                break;
            case 8:
                ((Integer) obj2).getClass();
                db6.c((String) obj5, this.b, (a26) obj3, (x16) obj4, (l46) obj, k99.P(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                dj6.j((d63) obj4, this.b, (xw9) obj5, (a26) obj3, (l46) obj, k99.P(1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                dj6.r((List) obj4, this.b, (a26) obj5, (j09) obj3, (l46) obj, k99.P(1));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                zk3.g((zj3) obj5, this.b, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                rxg.d(this.b, (a26) obj4, (j09) obj5, (dd2) obj3, (l46) obj, k99.P(3121));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                pa6.d((String) obj5, (GiftCardPerspective) obj3, this.b, (x16) obj4, (l46) obj, k99.P(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                pa6.p(k99.P(1), (x16) obj4, (l46) obj, (j09) obj3, (String) obj5, this.b);
                break;
            case 15:
                ((Integer) obj2).getClass();
                abg.k((x16) obj4, (l26) obj5, this.b, (a26) obj3, (l46) obj, k99.P(1));
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                wf3 wf3Var = (wf3) obj4;
                a26 a26Var3 = (a26) obj5;
                e89 e89Var = (e89) obj3;
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    oa7.b(null, 0L, 0.0f, af1.b0(-930872582, new ck(this.b, wf3Var, a26Var3, e89Var, 6), l46Var5), l46Var5, 3072, 7);
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                fu9.c((qhe) obj4, (TarotSkinIdentify) obj5, this.b, (j09) obj3, (l46) obj, k99.P(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                rs0.j((String) obj5, this.b, (qwc) obj4, (j09) obj3, (l46) obj, k99.P(513));
                break;
            case 19:
                ((Integer) obj2).getClass();
                z7c.a(this.b, (x16) obj4, (x16) obj5, (j09) obj3, (l46) obj, k99.P(1));
                break;
            case 20:
                j09 j09Var = (j09) obj4;
                lbd lbdVar = (lbd) obj5;
                e89 e89Var2 = (e89) obj3;
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    boolean z3 = ((abd) lbdVar.v.getValue()) == abd.c;
                    SharedDivination sharedDivination = lbdVar.d;
                    p6d.e(j09Var, z3, this.b, (a26) e89Var2.getValue(), sharedDivination.getQuestion(), sharedDivination.getCards(), sharedDivination.getExtraCards(), (ShareSummaryContent) lbdVar.g.getValue(), l46Var6, ShareSummaryContent.$stable << 21);
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                h7d.c((Bitmap) obj4, (String) obj5, (a26) obj3, this.b, (l46) obj, k99.P(24583));
                break;
            case 22:
                ((Integer) obj2).getClass();
                q7c.d((j09) obj5, (dvd) obj3, this.b, (x16) obj4, (l46) obj, k99.P(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                gcc.a((d0e) obj5, this.b, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case 24:
                kg4 kg4Var = (kg4) obj4;
                mue mueVar = (mue) obj5;
                mue mueVar2 = (mue) obj3;
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    jx0 jx0Var = ndb.Z;
                    j09 j09VarB = d31Var.b(g09Var);
                    c92 c92VarA2 = a92.a(xc0.e, jx0Var, l46Var7, 54);
                    int iHashCode7 = Long.hashCode(l46Var7.T);
                    u8a u8aVarM7 = l46Var7.m();
                    j09 j09VarJ7 = m93.J(l46Var7, j09VarB);
                    lf2.q.getClass();
                    l46Var7.j0();
                    if (l46Var7.S) {
                        l46Var7.l(ov7Var);
                    } else {
                        l46Var7.s0();
                    }
                    dec.l(hj6.z, l46Var7, c92VarA2);
                    dec.l(hj6.y, l46Var7, u8aVarM7);
                    dec.l(hj6.X, l46Var7, Integer.valueOf(iHashCode7));
                    dec.k(l46Var7);
                    dec.l(hj6.x, l46Var7, j09VarJ7);
                    String strValueOf = String.valueOf(kg4Var.a());
                    pr4 pr4Var = l8b.a;
                    nte.b(strValueOf, null, ((e8b) l46Var7.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var7, 0, 0, 131066);
                    nte.b(tm7.m(kg4Var, z, l46Var7, 0), null, ((e8b) l46Var7.k(pr4Var)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar2, l46Var7, 0, 0, 131066);
                    l46Var7.r(true);
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                q7c.h((j09) obj5, (mfc) obj3, this.b, (x16) obj4, (l46) obj, k99.P(1));
                break;
            case 26:
                egd egdVar = (egd) obj4;
                rcf rcfVar = (rcf) obj5;
                h0e h0eVar3 = (h0e) obj3;
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    l46Var8.Z();
                } else {
                    boolean zI = l46Var8.i(rcfVar);
                    Object objR3 = l46Var8.R();
                    if (zI || objR3 == i8cVar) {
                        yv9 yv9Var = new yv9(0, rcfVar, rcf.class, "onShuffleComplete", "onShuffleComplete()V", 0, 27);
                        l46Var8.p0(yv9Var);
                        objR3 = yv9Var;
                    }
                    rs0.k(egdVar, (x16) ((ym7) objR3), (psc) h0eVar3.getValue(), this.b, l46Var8, 0, 0);
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                aic.c((qmf) obj5, (x16) obj4, this.b, (a26) obj3, (l46) obj, k99.P(9));
                break;
            default:
                ((Integer) obj2).getClass();
                v2c.i((u4g) obj5, this.b, (x16) obj4, (x16) obj3, (l46) obj, k99.P(385));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ o50(int i, int i2, m26 m26Var, Object obj, Object obj2, boolean z) {
        this.a = i2;
        this.b = z;
        this.d = m26Var;
        this.e = obj;
        this.c = obj2;
    }

    public /* synthetic */ o50(Integer num, boolean z, dd2 dd2Var, use useVar) {
        this.a = 4;
        this.d = num;
        this.b = z;
        this.c = dd2Var;
        this.e = useVar;
    }

    public /* synthetic */ o50(Object obj, x16 x16Var, boolean z, Object obj2, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.d = x16Var;
        this.b = z;
        this.c = obj2;
    }

    public /* synthetic */ o50(Object obj, Object obj2, boolean z, x16 x16Var, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.c = obj2;
        this.b = z;
        this.d = x16Var;
    }

    public /* synthetic */ o50(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = obj3;
    }

    public /* synthetic */ o50(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = obj3;
    }

    public /* synthetic */ o50(Object obj, boolean z, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ o50(Object obj, boolean z, Object obj2, Object obj3, int i, int i2, boolean z2) {
        this.a = i2;
        this.e = obj;
        this.b = z;
        this.d = obj2;
        this.c = obj3;
    }

    public /* synthetic */ o50(String str, boolean z, a26 a26Var, x16 x16Var, int i) {
        this.a = 8;
        this.e = str;
        this.b = z;
        this.c = a26Var;
        this.d = x16Var;
    }

    public /* synthetic */ o50(boolean z, a26 a26Var, x16 x16Var, x16 x16Var2, int i) {
        this.a = 2;
        this.b = z;
        this.e = a26Var;
        this.d = x16Var;
        this.c = x16Var2;
    }

    public /* synthetic */ o50(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }
}
