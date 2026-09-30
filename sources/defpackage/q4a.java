package defpackage;

import ai.askquin.ui.draw.photo.homepage.PhysicalDeckCameraRoute;
import ai.askquin.ui.draw.photo.homepage.PhysicalDeckReadingRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadPreviewRoute;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$LockedReport;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$PersonalityIntroRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$StartAnalysisRoute;
import ai.askquin.ui.router.AppRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q4a implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ q4a(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        String str;
        Object dzbVar;
        String str2;
        Object dzbVar2;
        String str3;
        o7a n7aVar;
        int i = this.a;
        Boolean bool = null;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                qb9Var.g = job.a.b(PaywallRoute.InterceptPaywall.class);
                qb9Var.e = false;
                qb9Var.a(-1);
                qb9Var.e = true;
                qb9Var.f = false;
                return wefVar;
            case 1:
                qb9 qb9Var2 = (qb9) obj;
                qb9Var2.getClass();
                qb9Var2.b = true;
                return wefVar;
            case 2:
                qb9 qb9Var3 = (qb9) obj;
                em7 em7VarB = job.a.b(AppRoute.Paywall.class);
                qb9Var3.getClass();
                qb9Var3.g = em7VarB;
                qb9Var3.e = false;
                qb9Var3.a(-1);
                qb9Var3.e = true;
                qb9Var3.f = false;
                return wefVar;
            case 3:
                kv2.y((l1f) obj, "btn", "invite_friends", "pathway", "paywall_d");
                return wefVar;
            case 4:
                kv2.y((l1f) obj, "btn", "challenge_entry", "pathway", "paywall_d");
                return wefVar;
            case 5:
                ((my) obj).getClass();
                return kn2.c0(rw4.f(b21.T(300, 0, null, 6), 2), rw4.g(b21.T(300, 0, null, 6), 2));
            case 6:
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty() || (str = (String) s72.y0(1, list)) == null) {
                    return null;
                }
                try {
                    dzbVar = e8d.valueOf(str);
                    break;
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                e8d e8dVar = (e8d) dzbVar;
                if (e8dVar == null) {
                    return null;
                }
                String str4 = (String) s72.x0(list);
                if (!pa7.t(str4, "save")) {
                    if (!pa7.t(str4, "share") || (str2 = (String) s72.y0(2, list)) == null) {
                        return null;
                    }
                    try {
                        dzbVar2 = gbd.valueOf(str2);
                    } catch (Throwable th2) {
                        dzbVar2 = new dzb(th2);
                    }
                    if (dzbVar2 instanceof dzb) {
                        dzbVar2 = null;
                    }
                    gbd gbdVar = (gbd) dzbVar2;
                    if (gbdVar == null || (str3 = (String) s72.y0(3, list)) == null) {
                        return null;
                    }
                    if (v4e.Q(str3)) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        return null;
                    }
                    n7aVar = new n7a(e8dVar, gbdVar, str3);
                    break;
                } else {
                    n7aVar = new m7a(e8dVar);
                }
                String str5 = (String) s72.y0(4, list);
                if (pa7.t(str5, "granted")) {
                    bool = Boolean.TRUE;
                } else if (pa7.t(str5, "denied")) {
                    bool = Boolean.FALSE;
                }
                return new l7a(n7aVar, bool);
            case 7:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("report_goQuin", "btn");
                return wefVar;
            case 8:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a("report_share", "btn");
                return wefVar;
            case 9:
                qb9 qb9Var4 = (qb9) obj;
                qb9Var4.getClass();
                qb9Var4.g = job.a.b(PersonalityRoutes$StartAnalysisRoute.class);
                qb9Var4.e = false;
                qb9Var4.a(-1);
                qb9Var4.e = true;
                qb9Var4.f = false;
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                qb9 qb9Var5 = (qb9) obj;
                qb9Var5.getClass();
                qb9Var5.g = job.a.b(PersonalityRoutes$LockedReport.class);
                qb9Var5.e = false;
                qb9Var5.a(-1);
                qb9Var5.e = true;
                qb9Var5.f = false;
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                l1fVar3.a("report_sharePicture", "btn");
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                l1fVar4.a("report_share", "btn");
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l1f l1fVar5 = (l1f) obj;
                l1fVar5.getClass();
                l1fVar5.a("report_share", "btn");
                return wefVar;
            case 14:
                qb9 qb9Var6 = (qb9) obj;
                qb9Var6.getClass();
                PersonalityRoutes$PersonalityIntroRoute personalityRoutes$PersonalityIntroRoute = PersonalityRoutes$PersonalityIntroRoute.INSTANCE;
                personalityRoutes$PersonalityIntroRoute.getClass();
                qb9Var6.h = personalityRoutes$PersonalityIntroRoute;
                qb9Var6.e = false;
                qb9Var6.a(-1);
                qb9Var6.e = false;
                qb9Var6.f = false;
                return wefVar;
            case 15:
                qb9 qb9Var7 = (qb9) obj;
                qb9Var7.getClass();
                PersonalityRoutes$PersonalityIntroRoute personalityRoutes$PersonalityIntroRoute2 = PersonalityRoutes$PersonalityIntroRoute.INSTANCE;
                personalityRoutes$PersonalityIntroRoute2.getClass();
                qb9Var7.h = personalityRoutes$PersonalityIntroRoute2;
                qb9Var7.e = false;
                qb9Var7.a(-1);
                qb9Var7.e = false;
                qb9Var7.f = false;
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((my) obj).getClass();
                y6f y6fVar = rw4.a;
                return new f45(new o3f((x95) null, (ood) null, (vv1) null, new aec(0.0f, r2f.b, b21.P(0.0f, 400.0f, 5, null)), (LinkedHashMap) null, 119)).a(rw4.g(null, 3));
            case 17:
                ((my) obj).getClass();
                return rw4.n(3, null).a(rw4.f(null, 3));
            case 18:
                ((my) obj).getClass();
                return rw4.p(3, null).a(rw4.g(null, 3));
            case 19:
                kv2.y((l1f) obj, "btn", "retake_photo", "pathway", "homepage_photoReading_cardPreview");
                return wefVar;
            case 20:
                kv2.y((l1f) obj, "btn", "photo_recognize", "pathway", "draw");
                return wefVar;
            case 21:
                kv2.y((l1f) obj, "btn", "next_step", "pathway", "homepage_photoReading_cardPreview");
                return wefVar;
            case 22:
                kv2.y((l1f) obj, "btn", "add_more_info", "pathway", "homepage_photoReading_cardPreview");
                return wefVar;
            case 23:
                kv2.y((l1f) obj, "btn", "deck_select", "pathway", "draw");
                return wefVar;
            case 24:
                kv2.y((l1f) obj, "btn", "start_reading_directly", "pathway", "homepage_photoReading_cardPreview");
                return wefVar;
            case 25:
                ((Integer) obj).getClass();
                return wefVar;
            case 26:
                qb9 qb9Var8 = (qb9) obj;
                qb9Var8.getClass();
                qb9Var8.g = job.a.b(PhysicalDeckCameraRoute.class);
                qb9Var8.e = false;
                qb9Var8.a(-1);
                qb9Var8.e = true;
                qb9Var8.f = false;
                return wefVar;
            case 27:
                qb9 qb9Var9 = (qb9) obj;
                qb9Var9.getClass();
                qb9Var9.g = job.a.b(SpreadPreviewRoute.class);
                qb9Var9.e = false;
                qb9Var9.a(-1);
                qb9Var9.e = true;
                qb9Var9.f = false;
                return wefVar;
            case 28:
                qb9 qb9Var10 = (qb9) obj;
                em7 em7VarB2 = job.a.b(PhysicalDeckReadingRoute.class);
                qb9Var10.getClass();
                qb9Var10.g = em7VarB2;
                qb9Var10.e = false;
                qb9Var10.a(-1);
                qb9Var10.e = true;
                qb9Var10.f = false;
                return wefVar;
            default:
                return wefVar;
        }
    }
}
