package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.seasonal.SeasonalFollowUpRoute;
import ai.askquin.ui.seasonal.SeasonalReadingRoute;
import ai.askquin.ui.seasonal.SeasonalSummaryRoute;
import java.time.LocalDate;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iq1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ iq1(j09 j09Var, t2g t2gVar, LocalDate localDate, List list, x16 x16Var, a26 a26Var, int i) {
        this.a = 12;
        this.c = j09Var;
        this.d = t2gVar;
        this.e = localDate;
        this.g = list;
        this.b = x16Var;
        this.f = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        boolean z = false;
        int i2 = 1;
        wef wefVar = wef.a;
        Object obj3 = this.f;
        Object obj4 = this.b;
        Object obj5 = this.g;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                uq1.j((bod) obj8, (TarotCardType) obj7, (TarotSkinIdentify) obj6, (a26) obj3, (x16) obj4, (x16) obj5, (l46) obj, k99.P(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                nk8.f((j09) obj8, (String) obj7, (dd2) obj6, (dd2) obj3, (s84) obj5, (x16) obj4, (l46) obj, k99.P(3457));
                break;
            case 2:
                ((Integer) obj2).getClass();
                dj6.e((String) obj8, (String) obj7, (TarotCardChoice) obj3, (String) obj5, (TarotSkinIdentify) obj6, (x16) obj4, (l46) obj, k99.P(196609));
                break;
            case 3:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                String str = (String) obj2;
                str.getClass();
                ((l26) obj8).z("chart_view", str);
                ((a26) obj3).d(num);
                ynb.V((aw2) obj7, null, null, new qj3((jx7) obj6, (l26) obj4, (lx4) obj5, iIntValue, str, null), 3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                zk3.d((ol3) obj8, (r0) obj7, (x16) obj4, (x16) obj5, (a26) obj3, (x16) obj6, (l46) obj, k99.P(73));
                break;
            case 5:
                ((Integer) obj2).getClass();
                j74.o((ka9) obj8, (x16) obj4, (x16) obj5, (x16) obj7, (x16) obj6, (a26) obj3, (l46) obj, k99.P(1));
                break;
            case 6:
                lsc lscVar = (lsc) obj8;
                uqc uqcVar = (uqc) obj7;
                List list = (List) obj6;
                ycc yccVar = (ycc) obj3;
                ka9 ka9Var = (ka9) obj4;
                orc orcVar = (orc) obj5;
                l46 l46Var = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var.W(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    l46Var.Z();
                } else {
                    mic micVar = lscVar.e;
                    boolean z2 = uqcVar.c;
                    boolean zI = l46Var.i(yccVar);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new io4(yccVar, 2);
                        l46Var.p0(objR);
                    }
                    x16 x16Var = (x16) objR;
                    boolean zI2 = l46Var.i(ka9Var);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new vw5(ka9Var, 8);
                        l46Var.p0(objR2);
                    }
                    x16 x16Var2 = (x16) objR2;
                    boolean zI3 = l46Var.i(orcVar) | l46Var.g(lscVar) | l46Var.i(ka9Var) | l46Var.i(uqcVar);
                    Object objR3 = l46Var.R();
                    if (zI3 || objR3 == i8cVar) {
                        ww5 ww5Var = new ww5(orcVar, lscVar, ka9Var, uqcVar, 1);
                        l46Var.p0(ww5Var);
                        objR3 = ww5Var;
                    }
                    a26 a26Var = (a26) objR3;
                    boolean zI4 = l46Var.i(ka9Var);
                    Object objR4 = l46Var.R();
                    if (zI4 || objR4 == i8cVar) {
                        objR4 = new vw5(ka9Var, 9);
                        l46Var.p0(objR4);
                    }
                    jzb.b(micVar, z2, list, x16Var, x16Var2, a26Var, (x16) objR4, l46Var, 0);
                }
                break;
            case 7:
                SeasonalFollowUpRoute seasonalFollowUpRoute = (SeasonalFollowUpRoute) obj8;
                SolarTerm solarTerm = (SolarTerm) obj7;
                orc orcVar2 = (orc) obj6;
                ka9 ka9Var2 = (ka9) obj3;
                h0e h0eVar = (h0e) obj4;
                h0e h0eVar2 = (h0e) obj5;
                l46 l46Var2 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    fpc fpcVar = (fpc) h0eVar.getValue();
                    int year = seasonalFollowUpRoute.getYear();
                    boolean analyticsEnabled = seasonalFollowUpRoute.getAnalyticsEnabled();
                    erc ercVar = (erc) h0eVar2.getValue();
                    boolean zI5 = l46Var2.i(orcVar2) | l46Var2.i(seasonalFollowUpRoute) | l46Var2.e(solarTerm.ordinal());
                    Object objR5 = l46Var2.R();
                    if (zI5 || objR5 == i8cVar) {
                        objR5 = new bv9(orcVar2, seasonalFollowUpRoute, solarTerm, 7);
                        l46Var2.p0(objR5);
                    }
                    a26 a26Var2 = (a26) objR5;
                    boolean zI6 = l46Var2.i(ka9Var2);
                    Object objR6 = l46Var2.R();
                    if (zI6 || objR6 == i8cVar) {
                        objR6 = new tmc(ka9Var2, 4);
                        l46Var2.p0(objR6);
                    }
                    jlc.f(fpcVar, year, solarTerm, analyticsEnabled, ercVar, a26Var2, (x16) objR6, l46Var2, 0);
                }
                break;
            case 8:
                ka9 ka9Var3 = (ka9) obj8;
                orc orcVar3 = (orc) obj7;
                SeasonalReadingRoute seasonalReadingRoute = (SeasonalReadingRoute) obj6;
                SolarTerm solarTerm2 = (SolarTerm) obj3;
                h0e h0eVar3 = (h0e) obj4;
                e89 e89Var = (e89) obj5;
                l46 l46Var3 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var3.W(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    grc grcVar = (grc) h0eVar3.getValue();
                    boolean zI7 = l46Var3.i(ka9Var3);
                    Object objR7 = l46Var3.R();
                    if (zI7 || objR7 == i8cVar) {
                        objR7 = new vw5(ka9Var3, 29);
                        l46Var3.p0(objR7);
                    }
                    x16 x16Var3 = (x16) objR7;
                    boolean zI8 = l46Var3.i(orcVar3) | l46Var3.i(seasonalReadingRoute) | l46Var3.e(solarTerm2.ordinal());
                    Object objR8 = l46Var3.R();
                    if (zI8 || objR8 == i8cVar) {
                        objR8 = new smc(orcVar3, seasonalReadingRoute, solarTerm2, z ? 1 : 0);
                        l46Var3.p0(objR8);
                    }
                    dnc.a(grcVar, x16Var3, (x16) objR8, af1.b0(-1118402957, new r19(seasonalReadingRoute, solarTerm2, ka9Var3, e89Var, 10), l46Var3), l46Var3, 3072);
                }
                break;
            case 9:
                ka9 ka9Var4 = (ka9) obj8;
                orc orcVar4 = (orc) obj7;
                SeasonalSummaryRoute seasonalSummaryRoute = (SeasonalSummaryRoute) obj6;
                SolarTerm solarTerm3 = (SolarTerm) obj3;
                h0e h0eVar4 = (h0e) obj4;
                h0e h0eVar5 = (h0e) obj5;
                l46 l46Var4 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    grc grcVar2 = (grc) h0eVar4.getValue();
                    boolean zI9 = l46Var4.i(ka9Var4);
                    Object objR9 = l46Var4.R();
                    if (zI9 || objR9 == i8cVar) {
                        objR9 = new tmc(ka9Var4, 1);
                        l46Var4.p0(objR9);
                    }
                    x16 x16Var4 = (x16) objR9;
                    boolean zI10 = l46Var4.i(orcVar4) | l46Var4.i(seasonalSummaryRoute) | l46Var4.e(solarTerm3.ordinal());
                    Object objR10 = l46Var4.R();
                    if (zI10 || objR10 == i8cVar) {
                        objR10 = new smc(orcVar4, seasonalSummaryRoute, solarTerm3, i2);
                        l46Var4.p0(objR10);
                    }
                    dnc.a(grcVar2, x16Var4, (x16) objR10, af1.b0(-1822265932, new r19(seasonalSummaryRoute, solarTerm3, ka9Var4, h0eVar5, 11), l46Var4), l46Var4, 3072);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                lmb lmbVar = (lmb) obj8;
                imb imbVar = (imb) obj7;
                egd egdVar = (egd) obj6;
                tia tiaVar = (tia) obj3;
                x16 x16Var5 = (x16) obj4;
                x16 x16Var6 = (x16) obj5;
                ((oia) obj).getClass();
                lmbVar.element = hl9.g(lmbVar.element, ((hl9) obj2).a);
                if (!imbVar.element && !egdVar.b() && Math.abs(Float.intBitsToFloat((int) (lmbVar.element >> 32))) > ((obe) tiaVar).getDensity() * 24.0f) {
                    imbVar.element = true;
                    x16Var5.invoke();
                    x16Var6.invoke();
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                v6f.a((w6f) obj8, (x16) obj4, (x16) obj5, (x16) obj7, (x16) obj6, (j09) obj3, (l46) obj, k99.P(1));
                break;
            default:
                ((Integer) obj2).getClass();
                n3d.c((j09) obj8, (t2g) obj7, (LocalDate) obj6, (List) obj5, (x16) obj4, (a26) obj3, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ iq1(l26 l26Var, a26 a26Var, aw2 aw2Var, jx7 jx7Var, l26 l26Var2, lx4 lx4Var) {
        this.a = 3;
        this.c = l26Var;
        this.f = a26Var;
        this.d = aw2Var;
        this.e = jx7Var;
        this.b = l26Var2;
        this.g = lx4Var;
    }

    public /* synthetic */ iq1(ol3 ol3Var, r0 r0Var, x16 x16Var, x16 x16Var2, a26 a26Var, x16 x16Var3, int i) {
        this.a = 4;
        this.c = ol3Var;
        this.d = r0Var;
        this.b = x16Var;
        this.g = x16Var2;
        this.f = a26Var;
        this.e = x16Var3;
    }

    public /* synthetic */ iq1(j09 j09Var, String str, dd2 dd2Var, dd2 dd2Var2, s84 s84Var, x16 x16Var, int i) {
        this.a = 1;
        this.c = j09Var;
        this.d = str;
        this.e = dd2Var;
        this.f = dd2Var2;
        this.g = s84Var;
        this.b = x16Var;
    }

    public /* synthetic */ iq1(bod bodVar, TarotCardType tarotCardType, TarotSkinIdentify tarotSkinIdentify, a26 a26Var, x16 x16Var, x16 x16Var2, int i) {
        this.a = 0;
        this.c = bodVar;
        this.d = tarotCardType;
        this.e = tarotSkinIdentify;
        this.f = a26Var;
        this.b = x16Var;
        this.g = x16Var2;
    }

    public /* synthetic */ iq1(Object obj, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = x16Var;
        this.g = x16Var2;
        this.d = x16Var3;
        this.e = x16Var4;
        this.f = obj2;
    }

    public /* synthetic */ iq1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
        this.g = obj6;
    }

    public /* synthetic */ iq1(String str, String str2, TarotCardChoice tarotCardChoice, String str3, TarotSkinIdentify tarotSkinIdentify, x16 x16Var, int i) {
        this.a = 2;
        this.c = str;
        this.d = str2;
        this.f = tarotCardChoice;
        this.g = str3;
        this.e = tarotSkinIdentify;
        this.b = x16Var;
    }
}
