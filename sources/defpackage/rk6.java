package defpackage;

import ai.askquin.MainActivity;
import ai.askquin.R;
import ai.askquin.ui.conversation.ConversationActivity;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.divination.k;
import ai.askquin.ui.settings.language.LanguagesActivity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rk6 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rk6(x16 x16Var, dd2 dd2Var) {
        this.a = 11;
        this.c = x16Var;
        this.b = dd2Var;
    }

    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ?? r4;
        boolean z;
        l46 l46Var;
        l46 l46Var2;
        int i = this.a;
        int i2 = 17;
        d31 d31Var = d31.a;
        g09 g09Var = g09.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                zb4 zb4Var = (zb4) obj4;
                x16 x16Var = (x16) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    eb3.u(null, zb4Var, x16Var, l46Var3, 64, 1);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 1:
                ((Integer) obj2).getClass();
                tm7.e((c4c) obj4, (String) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 2:
                wb7 wb7Var = (wb7) obj4;
                x16 x16Var2 = (x16) obj3;
                l46 l46Var4 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Context context = (Context) l46Var4.k(uq.b);
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode = Long.hashCode(l46Var4.T);
                    u8a u8aVarM = l46Var4.m();
                    j09 j09VarJ = m93.J(l46Var4, g09Var);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, xn8VarC);
                    dec.l(hj6.y, l46Var4, u8aVarM);
                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ);
                    boolean zI = l46Var4.i(wb7Var) | l46Var4.i(context) | l46Var4.g(x16Var2);
                    Object objR = l46Var4.R();
                    if (zI || objR == i8cVar) {
                        objR = new it3(wb7Var, context, x16Var2, 15);
                        l46Var4.p0(objR);
                    }
                    a26 a26Var = (a26) objR;
                    boolean zI2 = l46Var4.i(wb7Var);
                    Object objR2 = l46Var4.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new rb7(wb7Var, 1);
                        l46Var4.p0(objR2);
                    }
                    z5c.b(null, a26Var, (x16) objR2, l46Var4, 0);
                    bzd.k(d31Var.b(g09Var), ((dg7) wb7Var.b.getValue()) != null, 0L, bxa.a, l46Var4, 27648, 4);
                    l46Var4.r(true);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 3:
                final lu7 lu7Var = (lu7) obj4;
                final LanguagesActivity languagesActivity = (LanguagesActivity) obj3;
                l46 l46Var5 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i3 = LanguagesActivity.Q0;
                if (l46Var5.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pr4 pr4Var = o82.a;
                    o7c.c(((m82) l46Var5.k(pr4Var)).n, y72.b(((m82) l46Var5.k(pr4Var)).o, 0.01f), li4.a(l46Var5), l46Var5, 0);
                    boolean zI3 = l46Var5.i(lu7Var) | l46Var5.i(languagesActivity);
                    Object objR3 = l46Var5.R();
                    if (zI3 || objR3 == i8cVar) {
                        r4 = 0;
                        final byte b = 0 == true ? 1 : 0;
                        objR3 = new x16() { // from class: iu7
                            @Override // defpackage.x16
                            public final Object invoke() throws Exception {
                                int i4 = b;
                                wef wefVar2 = wef.a;
                                LanguagesActivity languagesActivity2 = languagesActivity;
                                lu7 lu7Var2 = lu7Var;
                                switch (i4) {
                                    case 0:
                                        int i5 = LanguagesActivity.Q0;
                                        if (lu7Var2.b) {
                                            x57.V(languagesActivity2, ConversationActivity.class, new iy9[0]);
                                        }
                                        languagesActivity2.finish();
                                        break;
                                    default:
                                        int i6 = LanguagesActivity.Q0;
                                        if (lu7Var2.b) {
                                            x57.V(languagesActivity2, ConversationActivity.class, new iy9[0]);
                                        }
                                        languagesActivity2.finish();
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var5.p0(objR3);
                    } else {
                        r4 = 0;
                    }
                    final int i4 = 1;
                    rxg.a(r4, (x16) objR3, l46Var5, r4, 1);
                    boolean zI4 = l46Var5.i(lu7Var) | l46Var5.i(languagesActivity);
                    Object objR4 = l46Var5.R();
                    if (zI4 || objR4 == i8cVar) {
                        objR4 = new x16() { // from class: iu7
                            @Override // defpackage.x16
                            public final Object invoke() throws Exception {
                                int i5 = i4;
                                wef wefVar2 = wef.a;
                                LanguagesActivity languagesActivity2 = languagesActivity;
                                lu7 lu7Var2 = lu7Var;
                                switch (i5) {
                                    case 0:
                                        int i6 = LanguagesActivity.Q0;
                                        if (lu7Var2.b) {
                                            x57.V(languagesActivity2, ConversationActivity.class, new iy9[0]);
                                        }
                                        languagesActivity2.finish();
                                        break;
                                    default:
                                        int i7 = LanguagesActivity.Q0;
                                        if (lu7Var2.b) {
                                            x57.V(languagesActivity2, ConversationActivity.class, new iy9[0]);
                                        }
                                        languagesActivity2.finish();
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var5.p0(objR4);
                    }
                    x16 x16Var3 = (x16) objR4;
                    Locale locale = ((Configuration) l46Var5.k(uq.a)).getLocales().get(0);
                    locale.getClass();
                    boolean zI5 = l46Var5.i(lu7Var) | l46Var5.i(languagesActivity);
                    Object objR5 = l46Var5.R();
                    if (zI5 || objR5 == i8cVar) {
                        objR5 = new so5(19, lu7Var, languagesActivity);
                        l46Var5.p0(objR5);
                    }
                    vfh.g(x16Var3, locale, (a26) objR5, l46Var5, 0);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 4:
                ((Integer) obj2).getClass();
                vfh.f((Locale) obj4, (a26) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 5:
                zv7 zv7Var = (zv7) obj4;
                l26 l26Var = (l26) obj3;
                l46 l46Var6 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Boolean bool = (Boolean) zv7Var.g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    l46Var6.i0(bool);
                    boolean zH = l46Var6.h(zBooleanValue);
                    if (zBooleanValue) {
                        l26Var.z(l46Var6, 0);
                    } else {
                        if (l46Var6.l != 0) {
                            wf2.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!l46Var6.S) {
                            if (zH) {
                                kpd kpdVar = l46Var6.G;
                                int i5 = kpdVar.g;
                                int i6 = kpdVar.h;
                                tf2 tf2Var = l46Var6.M;
                                tf2Var.getClass();
                                tf2Var.d(false);
                                tf2Var.b.l.U(mq9.d);
                                ynb.g0(i5, i6, l46Var6.s);
                                l46Var6.G.t();
                            } else {
                                l46Var6.Y();
                            }
                        }
                    }
                    if (l46Var6.y && l46Var6.G.i == l46Var6.z) {
                        l46Var6.z = -1;
                        z = false;
                        l46Var6.y = false;
                    } else {
                        z = false;
                    }
                    l46Var6.r(z);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                ze6 ze6Var = (ze6) obj4;
                tc0 tc0Var = (tc0) obj3;
                sw3 sw3Var = (sw3) obj;
                kl2 kl2Var = (kl2) obj2;
                if (kl2.h(kl2Var.a) == Integer.MAX_VALUE) {
                    l37.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = kl2.h(kl2Var.a);
                int[] iArrI1 = s72.i1(ze6Var.a(sw3Var, iH, sw3Var.D0(tc0Var.f())));
                int[] iArr = new int[iArrI1.length];
                tc0Var.m(sw3Var, iH, iArrI1, cv7.a, iArr);
                return new fz3(i2, iArrI1, iArr);
            case 7:
                qz7 qz7Var = (qz7) obj4;
                pz7 pz7Var = (pz7) obj3;
                l46 l46Var7 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    rz7 rz7Var = (rz7) qz7Var.b.invoke();
                    int iE = pz7Var.c;
                    Object obj5 = pz7Var.a;
                    if ((iE >= rz7Var.a() || !rz7Var.b(iE).equals(obj5)) && (iE = rz7Var.e(obj5)) != -1) {
                        pz7Var.c = iE;
                    }
                    if (iE != -1) {
                        l46Var7.f0(-1664741271);
                        n16.r(rz7Var, qz7Var.a, iE, pz7Var.a, l46Var7, 0);
                        l46Var = l46Var7;
                        l46Var.r(false);
                    } else {
                        l46Var = l46Var7;
                        l46Var.f0(-1664505826);
                        l46Var.r(false);
                    }
                    boolean zI6 = l46Var.i(pz7Var);
                    Object objR6 = l46Var.R();
                    if (zI6 || objR6 == i8cVar) {
                        objR6 = new za6(i2, pz7Var);
                        l46Var.p0(objR6);
                    }
                    af1.g(obj5, (a26) objR6, l46Var);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 8:
                return ((tz7) obj3).a(new uz7((qz7) obj4, (r6e) obj), ((kl2) obj2).a);
            case 9:
                dd2 dd2Var = (dd2) obj4;
                Object obj6 = (o18) obj3;
                l46 l46Var8 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var8.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    dd2Var.m(obj6, l46Var8, 0);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                x57.A((MainActivity) obj4, (wk8) obj3, (l46) obj, k99.P(65));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                x16 x16Var4 = (x16) obj3;
                dd2 dd2Var2 = (dd2) obj4;
                l46 l46Var9 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    bm8.h(x16Var4, null, false, null, null, af1.b0(1111981750, new qx1(dd2Var2, 9), l46Var9), l46Var9, 1572864, 62);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                tq.k((qcc) obj4, (dd2) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                ((kb6) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 14:
                yf9 yf9Var = (yf9) obj4;
                vf9 vf9Var = (vf9) obj3;
                vl1 vl1Var = (vl1) obj;
                ke6 ke6Var = (ke6) obj2;
                LayoutNode layoutNode = yf9Var.J0;
                if (layoutNode.X()) {
                    yf9Var.g1 = vl1Var;
                    yf9Var.f1 = ke6Var;
                    wv7.a(layoutNode).getSnapshotObserver().a.d(yf9Var, yf9.n1, vf9Var);
                    yf9Var.j1 = false;
                } else {
                    yf9Var.j1 = true;
                }
                return wefVar;
            case 15:
                ((Integer) obj2).getClass();
                ((ej0) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                k.j((cgb) obj4, (ggb) obj3, (l46) obj, k99.P(65));
                return wefVar;
            case 17:
                OverviewItem.ServerMessageItem serverMessageItem = (OverviewItem.ServerMessageItem) obj4;
                a26 a26Var2 = (a26) obj3;
                l46 l46Var10 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var10.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    z7f.l(null, serverMessageItem.getText(), !serverMessageItem.getFinished(), 0, a26Var2, null, l46Var10, 0, 41);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case 18:
                jmb jmbVar = (jmb) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                jmbVar.element += ((d18) obj3).b.a(fFloatValue - jmbVar.element);
                return wefVar;
            case 19:
                ((Integer) obj2).getClass();
                o4a.a((j09) obj4, (bx9) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 20:
                a26 a26Var3 = (a26) obj4;
                dsb dsbVar = (dsb) obj3;
                l46 l46Var11 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                boolean zW = l46Var11.W(iIntValue9 & 1, (iIntValue9 & 3) != 2);
                wef wefVar2 = wef.a;
                if (!zW) {
                    l46Var11.Z();
                    return wefVar2;
                }
                boolean zS = g21.S(l46Var11);
                boolean zG = l46Var11.g(a26Var3);
                Object objR7 = l46Var11.R();
                if (zG || objR7 == i8cVar) {
                    objR7 = new k50(a26Var3, 11);
                    l46Var11.p0(objR7);
                }
                g09 g09Var2 = g09.a;
                j09 j09VarZ = dj6.z(56, (l26) objR7, g09Var2, wefVar2, Constants.LONG, zS, false, false);
                lx0 lx0Var = ndb.c;
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                int iHashCode2 = Long.hashCode(l46Var11.T);
                u8a u8aVarM2 = l46Var11.m();
                j09 j09VarJ2 = m93.J(l46Var11, j09VarZ);
                lf2.q.getClass();
                l46Var11.j0();
                if (l46Var11.S) {
                    l46Var11.l(ov7Var);
                } else {
                    l46Var11.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var11, xn8VarC2);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var11, u8aVarM2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var11, numValueOf);
                dec.k(l46Var11);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var11, j09VarJ2);
                feg.j(od4.A(R.drawable.bg_personality, 0, l46Var11), null, pa7.p(d31Var.a(b.d(b.c(g09Var2, 1.0f), 600.0f), ndb.w), 0.5f), null, an2.g, 0.0f, null, l46Var11, 24632, 104);
                c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var11, 48);
                int iHashCode3 = Long.hashCode(l46Var11.T);
                u8a u8aVarM3 = l46Var11.m();
                j09 j09VarJ3 = m93.J(l46Var11, g09Var2);
                l46Var11.j0();
                if (l46Var11.S) {
                    l46Var11.l(ov7Var);
                } else {
                    l46Var11.s0();
                }
                dec.l(he2Var, l46Var11, c92VarA);
                dec.l(he2Var2, l46Var11, u8aVarM3);
                ib8.s(iHashCode3, l46Var11, he2Var3, l46Var11);
                dec.l(he2Var4, l46Var11, j09VarJ3);
                ksb.d(oa7.E(g09Var2, a7c.b(24.0f)), ynb.r(0.0f, 100.0f, 0.0f, 0.0f, 13), dsbVar, l46Var11, (dsb.i << 6) | 48, 0);
                rxg.u(b.d(ynb.d0(0.0f, 52.0f, 0.0f, 16.0f, 5, g09Var2), 36.0f), l46Var11, 6);
                rxg.o(6, l46Var11);
                l46Var11.r(true);
                rxg.u(b.d(ynb.d0(0.0f, 24.0f, 0.0f, 40.0f, 5, d31Var.a(g09Var2, lx0Var)), 36.0f), l46Var11, 0);
                l46Var11.r(true);
                return wefVar2;
            case 21:
                ((Integer) obj2).getClass();
                ((w84) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 22:
                ((Integer) obj2).getClass();
                ((m6c) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 23:
                a26 a26Var4 = (a26) obj4;
                e89 e89Var = (e89) obj3;
                l46 l46Var12 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (l46Var12.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zG2 = l46Var12.g(a26Var4);
                    Object objR8 = l46Var12.R();
                    if (zG2 || objR8 == i8cVar) {
                        objR8 = new zh1(a26Var4, 29);
                        l46Var12.p0(objR8);
                    }
                    x16 x16Var5 = (x16) objR8;
                    Object objR9 = l46Var12.R();
                    if (objR9 == i8cVar) {
                        objR9 = new x08(e89Var, 26);
                        l46Var12.p0(objR9);
                    }
                    y7h.g(null, null, null, 0L, x16Var5, (x16) objR9, l46Var12, 196608, 15);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case 24:
                ((Integer) obj2).getClass();
                ((g5b) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 25:
                n26 n26Var = (n26) obj4;
                Object obj7 = (u7c) obj3;
                l46 l46Var13 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (l46Var13.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    n26Var.m(obj7, l46Var13, 0);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 26:
                ((Integer) obj2).getClass();
                an1.h((j09) obj4, (nqd) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 27:
                uqd uqdVar = (uqd) obj4;
                fqd fqdVar = (fqd) obj3;
                l46 l46Var14 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (l46Var14.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uqdVar.getClass();
                    l46Var14.f0(242755715);
                    boolean zG3 = l46Var14.g(fqdVar);
                    Object objR10 = l46Var14.R();
                    if (zG3 || objR10 == i8cVar) {
                        objR10 = new yv9(0, fqdVar, fqd.class, "dismiss", "dismiss()V", 0, 5);
                        l46Var14.p0(objR10);
                    }
                    bm8.h((x16) ((ym7) objR10), null, false, null, null, hkg.d, l46Var14, 1572864, 62);
                    l46Var14.r(false);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            case 28:
                d85 d85Var = (d85) obj4;
                uqd uqdVar2 = (uqd) obj3;
                l46 l46Var15 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (l46Var15.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var15, 54);
                    int iHashCode4 = Long.hashCode(l46Var15.T);
                    u8a u8aVarM4 = l46Var15.m();
                    j09 j09VarJ4 = m93.J(l46Var15, g09Var);
                    lf2.q.getClass();
                    l46Var15.j0();
                    if (l46Var15.S) {
                        l46Var15.l(ov7Var);
                    } else {
                        l46Var15.s0();
                    }
                    dec.l(hj6.z, l46Var15, t7cVarA);
                    dec.l(hj6.y, l46Var15, u8aVarM4);
                    dec.l(hj6.X, l46Var15, Integer.valueOf(iHashCode4));
                    dec.k(l46Var15);
                    dec.l(hj6.x, l46Var15, j09VarJ4);
                    Integer numD = d85Var.d();
                    if (numD == null) {
                        l46Var15.f0(1938275140);
                        l46Var15.r(false);
                        l46Var2 = l46Var15;
                    } else {
                        l46Var15.f0(1938275141);
                        gu6.b(od4.A(numD.intValue(), 0, l46Var15), null, null, y72.k, l46Var15, 3128, 4);
                        l46Var2 = l46Var15;
                        l46Var2.r(false);
                    }
                    l46Var2.f0(1939177117);
                    l46Var2.r(false);
                    nte.b(uqdVar2.a, ynb.d0(0.0f, 0.0f, 4.0f, 0.0f, 11, ynb.b0(0.0f, 8.0f, g09Var, 1)), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(0L, w6c.l(14), new ar5(Constants.MINIMAL_ERROR_STATUS_CODE), null, null, 0L, 0L, 0, 0, w6c.l(18), null, null, 16646137), l46Var2, 48, 0, 131068);
                    l46Var2.r(true);
                } else {
                    l46Var15.Z();
                }
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                ((v8b) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
        }
    }

    public /* synthetic */ rk6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ rk6(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
