package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.fourseasons.FourSeasonsEntry;
import ai.askquin.ui.seasonal.SeasonalFollowUpRoute;
import ai.askquin.ui.seasonal.SeasonalLoadingRoute;
import ai.askquin.ui.seasonal.SeasonalReadingRoute;
import ai.askquin.ui.seasonal.SeasonalSummaryRoute;
import ai.askquin.ui.share.SharedDivination;
import ai.askquin.ui.web.WebViewActivity;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r19 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r19(grc grcVar, x16 x16Var, x16 x16Var2, dd2 dd2Var, int i) {
        this.a = 12;
        this.c = grcVar;
        this.b = x16Var;
        this.d = x16Var2;
        this.e = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var;
        he2 he2Var;
        final int i;
        int i2 = this.a;
        g09 g09Var = g09.a;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i2) {
            case 0:
                x16 x16Var = (x16) obj4;
                a29 a29Var = (a29) obj6;
                a26 a26Var = (a26) obj5;
                s69 s69Var = (s69) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pa7.d(null, 0L, 0L, null, af1.b0(624116093, new wf8(3, a29Var), l46Var2), af1.b0(246200806, new j41(a26Var, s69Var, a29Var, 12), l46Var2), false, x16Var, l46Var2, 221184, 79);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 1:
                ((Integer) obj2).getClass();
                cgg.j((x16) obj4, (wp9) obj6, (List) obj5, (x16) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 2:
                ((Integer) obj2).getClass();
                fu9.a((ArrayList) obj4, (List) obj6, (TarotSkinIdentify) obj5, (Map) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 3:
                List list = (List) obj6;
                x16 x16Var2 = (x16) obj4;
                String str = (String) obj5;
                h0e h0eVar = (h0e) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    t4c.c(null, null, null, list.size(), 1, 0L, 0.0f, new g20(26, list), x16Var2, af1.b0(-1027761508, new p93(list, str, h0eVar, 3), l46Var3), l46Var3, 24576, 231);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 4:
                ((Integer) obj2).getClass();
                i7h.g((String) obj6, (a26) obj5, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 5:
                ((Integer) obj2).getClass();
                tq.l((t6b) obj6, (xw9) obj5, (x16) obj4, (l26) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 6:
                String str2 = (String) obj4;
                qwc qwcVar = (qwc) obj6;
                j09 j09Var = (j09) obj5;
                e89 e89Var = (e89) obj3;
                l46 l46Var4 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                    vea veaVar = qwc.d;
                    rs0.j(str2, zBooleanValue, qwcVar, j09Var, l46Var4, 512);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 7:
                c4c c4cVar = (c4c) obj4;
                m4c m4cVar = (m4c) obj6;
                j09 j09Var2 = (j09) obj5;
                lhb lhbVar = (lhb) obj3;
                l46 l46Var5 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pr4 pr4Var = mhb.a;
                    j09Var2.getClass();
                    lhbVar.getClass();
                    j09 j09VarW = nk8.w(j09Var2, new lgb(lhbVar, 2));
                    boolean zI = l46Var5.i(lhbVar);
                    Object objR = l46Var5.R();
                    if (zI || objR == i8cVar) {
                        objR = new lgb(lhbVar, 0);
                        l46Var5.p0(objR);
                    }
                    rrb.f(c4cVar, m4cVar, j09VarW, (a26) objR, false, 0, 0, l46Var5, 0, 56);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 8:
                ((Integer) obj2).getClass();
                q3c.a((j09) obj4, (String) obj6, (List) obj5, (fy9) obj3, (l46) obj, k99.P(4103));
                return wefVar;
            case 9:
                ii6 ii6Var = (ii6) obj6;
                x16 x16Var3 = (x16) obj4;
                a26 a26Var2 = (a26) obj5;
                h0e h0eVar2 = (h0e) obj3;
                l46 l46Var6 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zlc zlcVar = (zlc) h0eVar2.getValue();
                    boolean zG = l46Var6.g(x16Var3) | l46Var6.g(a26Var2);
                    Object objR2 = l46Var6.R();
                    if (zG || objR2 == i8cVar) {
                        objR2 = new slc(x16Var3, a26Var2);
                        l46Var6.p0(objR2);
                    }
                    vlc.d(zlcVar, ii6Var, x16Var3, (a26) objR2, ynb.b0(24.0f, 0.0f, g09Var, 2), l46Var6, 24576);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                SeasonalReadingRoute seasonalReadingRoute = (SeasonalReadingRoute) obj4;
                SolarTerm solarTerm = (SolarTerm) obj6;
                ka9 ka9Var = (ka9) obj5;
                e89 e89Var2 = (e89) obj3;
                l46 l46Var7 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fpc fpcVar = (fpc) e89Var2.getValue();
                    int year = seasonalReadingRoute.getYear();
                    boolean zIsRevisit = seasonalReadingRoute.isRevisit();
                    boolean analyticsEnabled = seasonalReadingRoute.getAnalyticsEnabled();
                    boolean zI2 = l46Var7.i(ka9Var);
                    Object objR3 = l46Var7.R();
                    if (zI2 || objR3 == i8cVar) {
                        objR3 = new tmc(ka9Var, 3);
                        l46Var7.p0(objR3);
                    }
                    x16 x16Var4 = (x16) objR3;
                    boolean zI3 = l46Var7.i(ka9Var) | l46Var7.i(seasonalReadingRoute);
                    Object objR4 = l46Var7.R();
                    if (zI3 || objR4 == i8cVar) {
                        objR4 = new ykc(1, ka9Var, seasonalReadingRoute);
                        l46Var7.p0(objR4);
                    }
                    o5c.c(fpcVar, year, solarTerm, zIsRevisit, analyticsEnabled, x16Var4, (x16) objR4, l46Var7, 0);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                final SeasonalSummaryRoute seasonalSummaryRoute = (SeasonalSummaryRoute) obj4;
                SolarTerm solarTerm2 = (SolarTerm) obj6;
                final ka9 ka9Var2 = (ka9) obj5;
                h0e h0eVar3 = (h0e) obj3;
                l46 l46Var8 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var8.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    fpc fpcVar2 = (fpc) h0eVar3.getValue();
                    int year2 = seasonalSummaryRoute.getYear();
                    boolean zIsRevisit2 = seasonalSummaryRoute.isRevisit();
                    boolean analyticsEnabled2 = seasonalSummaryRoute.getAnalyticsEnabled();
                    boolean zI4 = l46Var8.i(ka9Var2);
                    Object objR5 = l46Var8.R();
                    if (zI4 || objR5 == i8cVar) {
                        objR5 = new tmc(ka9Var2, 2);
                        l46Var8.p0(objR5);
                    }
                    x16 x16Var5 = (x16) objR5;
                    boolean zI5 = l46Var8.i(ka9Var2) | l46Var8.i(seasonalSummaryRoute);
                    Object objR6 = l46Var8.R();
                    if (zI5 || objR6 == i8cVar) {
                        final int i3 = 0;
                        objR6 = new x16() { // from class: vmc
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i4 = i3;
                                wef wefVar2 = wef.a;
                                SeasonalSummaryRoute seasonalSummaryRoute2 = seasonalSummaryRoute;
                                ka9 ka9Var3 = ka9Var2;
                                switch (i4) {
                                    case 0:
                                        ka9Var3.d(new ckb(13, seasonalSummaryRoute2), new SeasonalReadingRoute(seasonalSummaryRoute2.getYear(), seasonalSummaryRoute2.getSolarTerm(), true, seasonalSummaryRoute2.getAnalyticsEnabled()));
                                        break;
                                    default:
                                        ka9.e(ka9Var3, new SeasonalFollowUpRoute(seasonalSummaryRoute2.getYear(), seasonalSummaryRoute2.getSolarTerm(), seasonalSummaryRoute2.getAnalyticsEnabled()), null, 6);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var8.p0(objR6);
                    }
                    x16 x16Var6 = (x16) objR6;
                    boolean zI6 = l46Var8.i(ka9Var2) | l46Var8.i(seasonalSummaryRoute);
                    Object objR7 = l46Var8.R();
                    if (zI6 || objR7 == i8cVar) {
                        final int i4 = 1;
                        objR7 = new x16() { // from class: vmc
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i5 = i4;
                                wef wefVar2 = wef.a;
                                SeasonalSummaryRoute seasonalSummaryRoute2 = seasonalSummaryRoute;
                                ka9 ka9Var3 = ka9Var2;
                                switch (i5) {
                                    case 0:
                                        ka9Var3.d(new ckb(13, seasonalSummaryRoute2), new SeasonalReadingRoute(seasonalSummaryRoute2.getYear(), seasonalSummaryRoute2.getSolarTerm(), true, seasonalSummaryRoute2.getAnalyticsEnabled()));
                                        break;
                                    default:
                                        ka9.e(ka9Var3, new SeasonalFollowUpRoute(seasonalSummaryRoute2.getYear(), seasonalSummaryRoute2.getSolarTerm(), seasonalSummaryRoute2.getAnalyticsEnabled()), null, 6);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var8.p0(objR7);
                    }
                    z7c.b(fpcVar2, year2, solarTerm2, zIsRevisit2, analyticsEnabled2, x16Var5, x16Var6, (x16) objR7, l46Var8, 0);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                dnc.a((grc) obj6, (x16) obj4, (x16) obj5, (dd2) obj3, (l46) obj, k99.P(3073));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                orc orcVar = (orc) obj4;
                final SeasonalLoadingRoute seasonalLoadingRoute = (SeasonalLoadingRoute) obj6;
                SolarTerm solarTerm3 = (SolarTerm) obj5;
                final ka9 ka9Var3 = (ka9) obj3;
                l46 l46Var9 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    int year3 = seasonalLoadingRoute.getYear();
                    boolean analyticsEnabled3 = seasonalLoadingRoute.getAnalyticsEnabled();
                    boolean resume = seasonalLoadingRoute.getResume();
                    boolean zI7 = l46Var9.i(ka9Var3);
                    Object objR8 = l46Var9.R();
                    if (zI7 || objR8 == i8cVar) {
                        objR8 = new tmc(ka9Var3, 0);
                        l46Var9.p0(objR8);
                    }
                    x16 x16Var7 = (x16) objR8;
                    boolean zI8 = l46Var9.i(ka9Var3) | l46Var9.i(seasonalLoadingRoute);
                    Object objR9 = l46Var9.R();
                    if (zI8 || objR9 == i8cVar) {
                        final int i5 = 0;
                        objR9 = new x16() { // from class: umc
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i6 = i5;
                                wef wefVar2 = wef.a;
                                SeasonalLoadingRoute seasonalLoadingRoute2 = seasonalLoadingRoute;
                                ka9 ka9Var4 = ka9Var3;
                                switch (i6) {
                                    case 0:
                                        ka9Var4.d(new ckb(12, seasonalLoadingRoute2), new SeasonalReadingRoute(seasonalLoadingRoute2.getYear(), seasonalLoadingRoute2.getSolarTerm(), false, seasonalLoadingRoute2.getAnalyticsEnabled()));
                                        break;
                                    default:
                                        ka9Var4.d(new pdc(28), new FourSeasonsEntry(seasonalLoadingRoute2.getYear(), seasonalLoadingRoute2.getSolarTerm(), seasonalLoadingRoute2.getAnalyticsEnabled() ? "unknown" : "qa"));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var9.p0(objR9);
                    }
                    x16 x16Var8 = (x16) objR9;
                    boolean zI9 = l46Var9.i(ka9Var3) | l46Var9.i(seasonalLoadingRoute);
                    Object objR10 = l46Var9.R();
                    if (zI9 || objR10 == i8cVar) {
                        final int i6 = 1;
                        objR10 = new x16() { // from class: umc
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i7 = i6;
                                wef wefVar2 = wef.a;
                                SeasonalLoadingRoute seasonalLoadingRoute2 = seasonalLoadingRoute;
                                ka9 ka9Var4 = ka9Var3;
                                switch (i7) {
                                    case 0:
                                        ka9Var4.d(new ckb(12, seasonalLoadingRoute2), new SeasonalReadingRoute(seasonalLoadingRoute2.getYear(), seasonalLoadingRoute2.getSolarTerm(), false, seasonalLoadingRoute2.getAnalyticsEnabled()));
                                        break;
                                    default:
                                        ka9Var4.d(new pdc(28), new FourSeasonsEntry(seasonalLoadingRoute2.getYear(), seasonalLoadingRoute2.getSolarTerm(), seasonalLoadingRoute2.getAnalyticsEnabled() ? "unknown" : "qa"));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var9.p0(objR10);
                    }
                    int i7 = orc.H0;
                    uyb.e(orcVar, year3, solarTerm3, analyticsEnabled3, resume, x16Var7, x16Var8, (x16) objR10, l46Var9, 8);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 14:
                x16 x16Var9 = (x16) obj4;
                SolarTerm solarTerm4 = (SolarTerm) obj6;
                x16 x16Var10 = (x16) obj5;
                fpc fpcVar3 = (fpc) obj3;
                l46 l46Var10 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i8 = 1;
                if (l46Var10.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    pa7.d(null, 0L, 0L, null, af1.b0(420907537, new roc(i8, solarTerm4), l46Var10), af1.b0(1760277512, new s19(10, x16Var10, fpcVar3), l46Var10), false, x16Var9, l46Var10, 221184, 79);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case 15:
                e8d e8dVar = (e8d) obj4;
                Bitmap bitmap = (Bitmap) obj6;
                a26 a26Var3 = (a26) obj5;
                SharedDivination sharedDivination = (SharedDivination) obj3;
                l46 l46Var11 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (l46Var11.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    int iOrdinal = e8dVar.ordinal();
                    if (iOrdinal == 0) {
                        l46Var11.f0(2117852845);
                        h7d.d(bitmap, a26Var3, l46Var11, 0);
                        l46Var11.r(false);
                    } else if (iOrdinal == 1) {
                        l46Var11.f0(2117855517);
                        h7d.c(bitmap, sharedDivination.getDivinationId(), a26Var3, true, l46Var11, 24582);
                        l46Var11.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw tec.d(2117851731, l46Var11, false);
                        }
                        l46Var11.f0(2117863625);
                        j7d.b(b.c(g09Var, 1.0f), sharedDivination, a26Var3, l46Var11, (SharedDivination.$stable << 3) | 390);
                        l46Var11.r(false);
                    }
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                tgc.a((zke) obj6, (a26) obj5, (a26) obj3, (x16) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 17:
                ((Integer) obj2).getClass();
                wle.c((tr2) obj4, (j09) obj6, (a26) obj5, (a26) obj3, (l46) obj, k99.P(9));
                return wefVar;
            case 18:
                WebViewActivity webViewActivity = (WebViewActivity) obj6;
                x16 x16Var11 = (x16) obj4;
                e89 e89Var3 = (e89) obj5;
                e89 e89Var4 = (e89) obj3;
                l46 l46Var12 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i9 = WebViewActivity.T0;
                if (l46Var12.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String str3 = (String) e89Var3.getValue();
                    boolean zI10 = l46Var12.i(webViewActivity);
                    Object objR11 = l46Var12.R();
                    if (zI10 || objR11 == i8cVar) {
                        objR11 = new smc(webViewActivity, e89Var4, e89Var3, 11);
                        l46Var12.p0(objR11);
                    }
                    webViewActivity.q(str3, x16Var11, (x16) objR11, l46Var12, 0);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case 19:
                ((Integer) obj2).getClass();
                int i10 = WebViewActivity.T0;
                ((WebViewActivity) obj6).q((String) obj5, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                return wefVar;
            default:
                d3g d3gVar = (d3g) obj6;
                final c3g c3gVar = (c3g) obj5;
                jx jxVar = c3gVar.a;
                x16 x16Var12 = (x16) obj4;
                o8b o8bVar = (o8b) obj3;
                l46 l46Var13 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!l46Var13.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    l46Var13.Z();
                    return wefVar;
                }
                FillElement fillElement = b.c;
                xn8 xn8VarC = s21.c(ndb.f, false);
                int iHashCode = Long.hashCode(l46Var13.T);
                u8a u8aVarM = l46Var13.m();
                j09 j09VarJ = m93.J(l46Var13, fillElement);
                lf2.q.getClass();
                l46Var13.j0();
                boolean z = l46Var13.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z) {
                    l46Var13.l(ov7Var);
                } else {
                    l46Var13.s0();
                }
                he2 he2Var2 = hj6.z;
                dec.l(he2Var2, l46Var13, xn8VarC);
                he2 he2Var3 = hj6.y;
                dec.l(he2Var3, l46Var13, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var4 = hj6.X;
                dec.l(he2Var4, l46Var13, numValueOf);
                dec.k(l46Var13);
                he2 he2Var5 = hj6.x;
                dec.l(he2Var5, l46Var13, j09VarJ);
                i3g.b(0, l46Var13);
                if (k8b.e((e8b) l46Var13.k(l8b.a))) {
                    l46Var13.f0(740371750);
                    he2Var = he2Var3;
                    vtb.k((((Number) jxVar.e()).floatValue() * 600.0f) + d3gVar.c, 1.0f - ((Number) jxVar.e()).floatValue(), d3gVar.e, l46Var13, 6, 0);
                    l46Var = l46Var13;
                    i3g.c(6, l46Var);
                    l46Var.r(false);
                } else {
                    l46Var = l46Var13;
                    he2Var = he2Var3;
                    l46Var.f0(740647681);
                    boolean zG2 = l46Var.g(d3gVar);
                    Object objR12 = l46Var.R();
                    if (zG2 || objR12 == i8cVar) {
                        objR12 = new g3g(d3gVar, null);
                        l46Var.p0(objR12);
                    }
                    af1.o((l26) objR12, l46Var, wefVar);
                    l46Var.r(false);
                }
                j09 j09VarH = k8b.h(k8b.g(b.c(g09Var, 1.0f), new agb(20), l46Var, 6), new agb(21), l46Var, 0);
                boolean zG3 = l46Var.g(c3gVar);
                Object objR13 = l46Var.R();
                if (zG3 || objR13 == i8cVar) {
                    i = 0;
                    objR13 = new a26() { // from class: e3g
                        @Override // defpackage.a26
                        public final Object d(Object obj7) {
                            int i11 = i;
                            wef wefVar2 = wef.a;
                            c3g c3gVar2 = c3gVar;
                            g0c g0cVar = (g0c) obj7;
                            g0cVar.getClass();
                            switch (i11) {
                                case 0:
                                    g0cVar.G(((Number) c3gVar2.a.e()).floatValue() * g0cVar.I0.getDensity() * 100.0f);
                                    g0cVar.b(1.0f - ((Number) c3gVar2.b.e()).floatValue());
                                    break;
                                default:
                                    g0cVar.G(((Number) c3gVar2.a.e()).floatValue() * g0cVar.I0.getDensity() * 100.0f);
                                    g0cVar.b(1.0f - ((Number) c3gVar2.b.e()).floatValue());
                                    break;
                            }
                            return wefVar2;
                        }
                    };
                    l46Var.p0(objR13);
                } else {
                    i = 0;
                }
                j09 j09VarX = bzd.x(j09VarH, (a26) objR13);
                c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i)), ndb.Z, l46Var, 54);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarX);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var2, l46Var, c92VarA);
                dec.l(he2Var, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var4, l46Var);
                dec.l(he2Var5, l46Var, j09VarJ2);
                int i11 = 0;
                i3g.a(tm7.N(0.0f, d3gVar.a, g09Var, 1), l46Var, 0);
                boolean z2 = d3gVar.d;
                cx4 cx4VarF = rw4.f(b21.T(750, 0, null, 6), 2);
                f45 f45VarG = rw4.g(null, 3);
                boolean zG4 = l46Var.g(d3gVar);
                Object objR14 = l46Var.R();
                if (zG4 || objR14 == i8cVar) {
                    objR14 = new f3g(i11, d3gVar);
                    l46Var.p0(objR14);
                }
                m93.b(e92.a, z2, bzd.x(g09Var, (a26) objR14), cx4VarF, f45VarG, null, af1.b0(-1821132365, new s19(24, o8bVar, c3gVar), l46Var), l46Var, 1600518, 16);
                l46Var.r(true);
                if (x16Var12 != null) {
                    l46Var.f0(742449184);
                    boolean z3 = d3gVar.d;
                    cx4 cx4VarF2 = rw4.f(null, 3);
                    f45 f45VarG2 = rw4.g(null, 3);
                    j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, d31.a.a(g09Var, ndb.w));
                    boolean zG5 = l46Var.g(c3gVar);
                    Object objR15 = l46Var.R();
                    if (zG5 || objR15 == i8cVar) {
                        final int i12 = 1;
                        objR15 = new a26() { // from class: e3g
                            @Override // defpackage.a26
                            public final Object d(Object obj7) {
                                int i13 = i12;
                                wef wefVar2 = wef.a;
                                c3g c3gVar2 = c3gVar;
                                g0c g0cVar = (g0c) obj7;
                                g0cVar.getClass();
                                switch (i13) {
                                    case 0:
                                        g0cVar.G(((Number) c3gVar2.a.e()).floatValue() * g0cVar.I0.getDensity() * 100.0f);
                                        g0cVar.b(1.0f - ((Number) c3gVar2.b.e()).floatValue());
                                        break;
                                    default:
                                        g0cVar.G(((Number) c3gVar2.a.e()).floatValue() * g0cVar.I0.getDensity() * 100.0f);
                                        g0cVar.b(1.0f - ((Number) c3gVar2.b.e()).floatValue());
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR15);
                    }
                    m93.d(z3, bzd.x(j09VarD0, (a26) objR15), cx4VarF2, f45VarG2, null, af1.b0(-1054629105, new s19(23, c3gVar, x16Var12), l46Var), l46Var, 200064, 16);
                    l46Var.r(false);
                } else {
                    l46Var.f0(743038525);
                    l46Var.r(false);
                }
                l46Var.r(true);
                return wefVar;
        }
    }

    public /* synthetic */ r19(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ r19(zke zkeVar, a26 a26Var, a26 a26Var2, x16 x16Var, int i) {
        this.a = 16;
        this.c = zkeVar;
        this.d = a26Var;
        this.e = a26Var2;
        this.b = x16Var;
    }

    public /* synthetic */ r19(d3g d3gVar, c3g c3gVar, x16 x16Var, o8b o8bVar) {
        this.a = 20;
        this.c = d3gVar;
        this.d = c3gVar;
        this.b = x16Var;
        this.e = o8bVar;
    }

    public /* synthetic */ r19(Object obj, x16 x16Var, Object obj2, e89 e89Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = x16Var;
        this.d = obj2;
        this.e = e89Var;
    }

    public /* synthetic */ r19(Object obj, Object obj2, x16 x16Var, m26 m26Var, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = x16Var;
        this.e = m26Var;
    }

    public /* synthetic */ r19(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
