package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.annual.AnnualDomainEntryRoute;
import ai.askquin.ui.annual.AnnualDomainReportDetailRoute;
import ai.askquin.ui.annual.AnnualDomainReportSummaryRoute;
import ai.askquin.ui.annual.AnnualDrawingRoute;
import ai.askquin.ui.annual.AnnualGenderRoute;
import ai.askquin.ui.annual.AnnualIntroRoute;
import ai.askquin.ui.annual.AnnualMonthlyEntryRoute;
import ai.askquin.ui.annual.AnnualMonthlyReportDetailRoute;
import ai.askquin.ui.annual.AnnualMonthlyReportSummaryRoute;
import ai.askquin.ui.annual.AnnualMonthlyShortSummaryRoute;
import ai.askquin.ui.annual.AnnualNicknameRoute;
import ai.askquin.ui.annual.AnnualOverviewReportRoute;
import ai.askquin.ui.annual.AnnualRelationshipRoute;
import ai.askquin.ui.annual.AnnualUserRoleRoute;
import ai.askquin.ui.annual.model.AnnualActionFor;
import ai.askquin.ui.draw.photo.homepage.SpreadInfoEntryRoute;
import ai.askquin.ui.fourseasons.FourSeasonsIntroRoute;
import ai.askquin.ui.fourseasons.FourSeasonsShareURLRoute;
import ai.askquin.ui.fourseasons.SeasonalGenderRoute;
import ai.askquin.ui.fourseasons.SeasonalPhysicalCameraRoute;
import ai.askquin.ui.fourseasons.SeasonalPhysicalDrawRoute;
import ai.askquin.ui.fourseasons.SeasonalQuestionRoute;
import ai.askquin.ui.fourseasons.SeasonalRelationshipRoute;
import ai.askquin.ui.fourseasons.SeasonalRoleRoute;
import ai.askquin.ui.fourseasons.SeasonalSpreadRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$AnalysisQuestionRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$Report;
import ai.askquin.ui.seasonal.SeasonalFollowUpRoute;
import ai.askquin.ui.seasonal.SeasonalLoadingRoute;
import ai.askquin.ui.seasonal.SeasonalReadingRoute;
import ai.askquin.ui.seasonal.SeasonalSummaryRoute;
import ai.askquin.ui.settings.profile.AccountProfileRoute$AccountProfile;
import ai.askquin.ui.settings.profile.AccountProfileRoute$SetBios;
import ai.askquin.ui.settings.profile.AccountProfileRoute$SetBirthday;
import ai.askquin.ui.settings.profile.AccountProfileRoute$SetGender;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$AllCardBySkinRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinDetailRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinGraphEntryRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z8 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka9 b;

    public /* synthetic */ z8(ka9 ka9Var, int i) {
        this.a = i;
        this.b = ka9Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        ycc yccVarA;
        ycc yccVarA2;
        int i = this.a;
        int i2 = 7;
        int i3 = 9;
        int i4 = 16;
        int i5 = 15;
        int i6 = 14;
        int i7 = 13;
        int i8 = 18;
        int i9 = 17;
        int i10 = 2;
        int i11 = 10;
        int i12 = 0;
        int i13 = 1;
        int i14 = 6;
        wef wefVar = wef.a;
        ka9 ka9Var = this.b;
        switch (i) {
            case 0:
                ea eaVar = (ea) obj;
                eaVar.getClass();
                ka9.e(ka9Var, eaVar, null, 6);
                return wefVar;
            case 1:
                za9 za9Var = (za9) obj;
                za9Var.getClass();
                dd2 dd2Var = new dd2(new y8(ka9Var, i12), true, -736648202);
                kob kobVar = job.a;
                em7 em7VarB = kobVar.b(AccountProfileRoute$AccountProfile.class);
                qu4 qu4Var = qu4.a;
                rs0.o(za9Var, em7VarB, qu4Var, null, null, null, null, dd2Var);
                rs0.o(za9Var, kobVar.b(AccountProfileRoute$SetGender.class), qu4Var, null, null, null, null, new dd2(new y8(ka9Var, i13), true, -1762045729));
                rs0.o(za9Var, kobVar.b(AccountProfileRoute$SetBirthday.class), qu4Var, null, null, null, null, new dd2(new y8(ka9Var, i10), true, -1525875906));
                rs0.o(za9Var, kobVar.b(AccountProfileRoute$SetBios.class), qu4Var, null, null, null, null, new dd2(new y8(ka9Var, 3), true, -1289706083));
                return wefVar;
            case 2:
                AnnualActionFor annualActionFor = (AnnualActionFor) obj;
                annualActionFor.getClass();
                int i15 = c40.a[annualActionFor.ordinal()];
                if (i15 == 1) {
                    ka9.e(ka9Var, AnnualMonthlyReportSummaryRoute.INSTANCE, null, 6);
                } else {
                    if (i15 != 2) {
                        ap.c();
                        return null;
                    }
                    ka9.e(ka9Var, AnnualDomainReportSummaryRoute.INSTANCE, null, 6);
                }
                return wefVar;
            case 3:
                String str = (String) obj;
                str.getClass();
                ka9.e(ka9Var, new AnnualMonthlyShortSummaryRoute(str), null, 6);
                return wefVar;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    ka9.e(ka9Var, AnnualDomainReportSummaryRoute.INSTANCE, null, 6);
                } else {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05.a, new zv(14), 2);
                    ka9.e(ka9Var, AnnualDomainEntryRoute.INSTANCE, null, 6);
                }
                return wefVar;
            case 5:
                za9 za9Var2 = (za9) obj;
                za9Var2.getClass();
                dd2 dd2Var2 = new dd2(new y8(ka9Var, 12), true, 915654852);
                kob kobVar2 = job.a;
                em7 em7VarB2 = kobVar2.b(AnnualIntroRoute.class);
                qu4 qu4Var2 = qu4.a;
                rs0.o(za9Var2, em7VarB2, qu4Var2, null, null, null, null, dd2Var2);
                rs0.o(za9Var2, kobVar2.b(AnnualNicknameRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, 8), true, -1678301303));
                rs0.o(za9Var2, kobVar2.b(AnnualGenderRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, i3), true, -1191347982));
                rs0.o(za9Var2, kobVar2.b(AnnualUserRoleRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, i11), true, -955669807));
                rs0.o(za9Var2, kobVar2.b(AnnualRelationshipRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, 11), true, -719991632));
                rs0.o(za9Var2, kobVar2.b(AnnualMonthlyEntryRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, i7), true, 1785903739));
                rs0.o(za9Var2, kobVar2.b(AnnualMonthlyReportSummaryRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, i5), true, -1807128964));
                rs0.o(za9Var2, kobVar2.b(AnnualMonthlyReportDetailRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, i4), true, -1105194371));
                rs0.o(za9Var2, kobVar2.b(AnnualMonthlyShortSummaryRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, i9), true, -403259778));
                rs0.o(za9Var2, kobVar2.b(AnnualDomainEntryRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, i8), true, 298674815));
                rs0.o(za9Var2, kobVar2.b(AnnualDomainReportSummaryRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, 4), true, 1000609408));
                rs0.o(za9Var2, kobVar2.b(AnnualDomainReportDetailRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, 5), true, 1702544001));
                rs0.o(za9Var2, kobVar2.b(AnnualOverviewReportRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, i14), true, -1890488702));
                rs0.o(za9Var2, kobVar2.b(AnnualDrawingRoute.class), qu4Var2, null, null, null, null, new dd2(new y8(ka9Var, i2), true, -1188554109));
                return wefVar;
            case 6:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                tarotSkinIdentify.getClass();
                ka9.e(ka9Var, new SkinNavigationRoute$SkinGraphEntryRoute(false, true, tarotSkinIdentify, 1, (rp3) null), null, 6);
                return wefVar;
            case 7:
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) obj;
                tarotSkinIdentify2.getClass();
                ka9.e(ka9Var, new SkinNavigationRoute$SkinGraphEntryRoute(false, true, tarotSkinIdentify2, 1, (rp3) null), null, 6);
                return wefVar;
            case 8:
                TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) obj;
                tarotSkinIdentify3.getClass();
                ka9.e(ka9Var, new SkinNavigationRoute$SkinGraphEntryRoute(false, true, tarotSkinIdentify3, 1, (rp3) null), null, 6);
                return wefVar;
            case 9:
                List list = (List) obj;
                list.getClass();
                da9 da9VarC = ka9Var.c();
                if (da9VarC != null && (yccVarA = da9VarC.a()) != null) {
                    ArrayList arrayList = new ArrayList(t72.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((TarotCardChoice) it.next()).getCard().name());
                    }
                    yccVarA.d("camera_result_cards", arrayList);
                    ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Boolean.valueOf(((TarotCardChoice) it2.next()).isReversed()));
                    }
                    yccVarA.d("camera_result_reversed", arrayList2);
                }
                ka9Var.g();
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                TarotSkinIdentify tarotSkinIdentify4 = (TarotSkinIdentify) obj;
                tarotSkinIdentify4.getClass();
                ka9.e(ka9Var, new SkinNavigationRoute$SkinGraphEntryRoute(true, false, tarotSkinIdentify4, 2, (rp3) null), null, 6);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                TarotSkinIdentify tarotSkinIdentify5 = (TarotSkinIdentify) obj;
                tarotSkinIdentify5.getClass();
                ka9.e(ka9Var, new SkinNavigationRoute$SkinGraphEntryRoute(false, false, tarotSkinIdentify5, 3, (rp3) null), null, 6);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                za9 za9Var3 = (za9) obj;
                za9Var3.getClass();
                dd2 dd2Var3 = new dd2(new y8(ka9Var, 23), true, -984631913);
                kob kobVar3 = job.a;
                rs0.o(za9Var3, kobVar3.b(FourSeasonsIntroRoute.class), qu4.a, null, null, null, null, dd2Var3);
                rs0.t(za9Var3, kobVar3.b(FourSeasonsShareURLRoute.class), new s84(false, false, 7), new dd2(new b40(ka9Var, i13), true, 513737556));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                List list2 = (List) obj;
                list2.getClass();
                da9 da9VarC2 = ka9Var.c();
                if (da9VarC2 != null && (yccVarA2 = da9VarC2.a()) != null) {
                    ArrayList arrayList3 = new ArrayList(t72.u(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((TarotCardChoice) it3.next()).getCard().name());
                    }
                    yccVarA2.d("seasonal_camera_result_cards", arrayList3);
                    ArrayList arrayList4 = new ArrayList(t72.u(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(Boolean.valueOf(((TarotCardChoice) it4.next()).isReversed()));
                    }
                    yccVarA2.d("seasonal_camera_result_reversed", arrayList4);
                }
                ka9Var.g();
                return wefVar;
            case 14:
                za9 za9Var4 = (za9) obj;
                za9Var4.getClass();
                dd2 dd2Var4 = new dd2(new y8(ka9Var, 24), true, 215163638);
                kob kobVar4 = job.a;
                em7 em7VarB3 = kobVar4.b(SeasonalGenderRoute.class);
                qu4 qu4Var3 = qu4.a;
                rs0.o(za9Var4, em7VarB3, qu4Var3, null, null, null, null, dd2Var4);
                rs0.o(za9Var4, kobVar4.b(SeasonalRoleRoute.class), qu4Var3, null, null, null, null, new dd2(new y8(ka9Var, 25), true, 1441101997));
                rs0.o(za9Var4, kobVar4.b(SeasonalRelationshipRoute.class), qu4Var3, null, null, null, null, new dd2(new y8(ka9Var, 26), true, 400810158));
                rs0.o(za9Var4, kobVar4.b(SeasonalQuestionRoute.class), qu4Var3, null, null, null, null, new dd2(new y8(ka9Var, 27), true, -639481681));
                rs0.o(za9Var4, kobVar4.b(SeasonalSpreadRoute.class), qu4Var3, null, null, null, null, new dd2(new y8(ka9Var, 28), true, -1679773520));
                rs0.o(za9Var4, kobVar4.b(SeasonalPhysicalDrawRoute.class), qu4Var3, null, null, null, null, new dd2(new y8(ka9Var, 29), true, 1574901937));
                rs0.o(za9Var4, kobVar4.b(SeasonalPhysicalCameraRoute.class), qu4Var3, null, null, null, null, new dd2(new xw5(ka9Var, i12), true, 534610098));
                return wefVar;
            case 15:
                String str2 = (String) obj;
                str2.getClass();
                ka9.e(ka9Var, new PersonalityRoutes$AnalysisQuestionRoute(str2), null, 6);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                String str3 = (String) obj;
                str3.getClass();
                ka9Var.d(new q4a(9), new PersonalityRoutes$AnalysisQuestionRoute(str3));
                return wefVar;
            case 17:
                String str4 = (String) obj;
                str4.getClass();
                ka9.e(ka9Var, new PersonalityRoutes$Report(str4), null, 6);
                return wefVar;
            case 18:
                List list3 = (List) obj;
                list3.getClass();
                ka9.e(ka9Var, new SpreadInfoEntryRoute(list3), null, 6);
                return wefVar;
            case 19:
                za9 za9Var5 = (za9) obj;
                za9Var5.getClass();
                dd2 dd2Var5 = new dd2(new xw5(ka9Var, i7), true, -428081773);
                kob kobVar5 = job.a;
                em7 em7VarB4 = kobVar5.b(SeasonalLoadingRoute.class);
                qu4 qu4Var4 = qu4.a;
                rs0.o(za9Var5, em7VarB4, qu4Var4, null, null, null, null, dd2Var5);
                rs0.o(za9Var5, kobVar5.b(SeasonalReadingRoute.class), qu4Var4, null, null, null, null, new dd2(new xw5(ka9Var, i6), true, -902395382));
                rs0.o(za9Var5, kobVar5.b(SeasonalSummaryRoute.class), qu4Var4, null, null, null, null, new dd2(new xw5(ka9Var, i5), true, -1606258357));
                rs0.o(za9Var5, kobVar5.b(SeasonalFollowUpRoute.class), qu4Var4, null, null, null, null, new dd2(new xw5(ka9Var, i4), true, 1984845964));
                return wefVar;
            case 20:
                TarotSkinIdentify tarotSkinIdentify6 = (TarotSkinIdentify) obj;
                tarotSkinIdentify6.getClass();
                ka9.e(ka9Var, new SkinNavigationRoute$SkinDetailRoute(tarotSkinIdentify6, true), null, 6);
                return wefVar;
            case 21:
                TarotSkinIdentify tarotSkinIdentify7 = (TarotSkinIdentify) obj;
                tarotSkinIdentify7.getClass();
                ka9.e(ka9Var, new SkinNavigationRoute$AllCardBySkinRoute(tarotSkinIdentify7), null, 6);
                return wefVar;
            default:
                za9 za9Var6 = (za9) obj;
                za9Var6.getClass();
                dd2 dd2Var6 = new dd2(new xw5(ka9Var, i9), true, -1887285481);
                kob kobVar6 = job.a;
                em7 em7VarB5 = kobVar6.b(SkinNavigationRoute$SkinMallRoute.class);
                qu4 qu4Var5 = qu4.a;
                rs0.o(za9Var6, em7VarB5, qu4Var5, null, null, null, null, dd2Var6);
                rs0.o(za9Var6, kobVar6.b(SkinNavigationRoute$SkinDetailRoute.class), qu4Var5, null, null, null, null, new dd2(new xw5(ka9Var, i8), true, 1382284288));
                rs0.o(za9Var6, kobVar6.b(SkinNavigationRoute$AllCardBySkinRoute.class), qu4Var5, null, null, null, null, new dd2(new xw5(ka9Var, 19), true, 1618454111));
                return wefVar;
        }
    }
}
