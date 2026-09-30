package defpackage;

import ai.askquin.ui.annual.AnnualDrawingRoute;
import ai.askquin.ui.annual.AnnualEntry;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zv implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ zv(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Long) obj).getClass();
                return wefVar;
            case 1:
                ax axVar = (ax) obj;
                axVar.getHandler().post(new wp(4, axVar.J0));
                return wefVar;
            case 2:
                return wefVar;
            case 3:
                return wefVar;
            case 4:
                return wefVar;
            case 5:
                return Boolean.valueOf(!(((g00) obj) instanceof ty9));
            case 6:
                kv2.y((l1f) obj, "btn", "YR2026_enterFromPopup", "pathway", "YR2026_popup");
                return wefVar;
            case 7:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("annual_fortune_member_gift_close", "popup");
                return wefVar;
            case 8:
                ((l1f) obj).a("YR2026_popup_forYearlyUser", "pagename");
                return wefVar;
            case 9:
                ((my) obj).getClass();
                return kn2.c0(rw4.f(b21.T(300, 0, null, 6), 2).a(rw4.m(b21.T(300, 0, null, 6), new zv(10))), rw4.g(b21.T(200, 0, null, 6), 2).a(rw4.o(b21.T(200, 0, null, 6), new zv(11))));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return Integer.valueOf(((Integer) obj).intValue() / 4);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a("YR2026_startReading", "btn");
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                l1fVar3.a("2026_yearlyReading", "page_name");
                return wefVar;
            case 14:
                kv2.y((l1f) obj, "btn", "YR2026_monthly_startSixDomains", "pathway", "YR2026_monthly_summary");
                return wefVar;
            case 15:
                kv2.y((l1f) obj, "btn", "replay", "pathway", "YR2026_summary");
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                kv2.y((l1f) obj, "btn", "YR2026_domains_viewDetails", "pathway", "YR2026_domains_overview");
                return wefVar;
            case 17:
                kv2.y((l1f) obj, "btn", "YR2026_viewSummary", "pathway", "YR2026_domains_details");
                return wefVar;
            case 18:
                qb9 qb9Var = (qb9) obj;
                em7 em7VarB = job.a.b(AnnualDrawingRoute.class);
                qb9Var.getClass();
                qb9Var.g = em7VarB;
                qb9Var.e = false;
                qb9Var.a(-1);
                qb9Var.e = true;
                qb9Var.f = false;
                return wefVar;
            case 19:
                qb9 qb9Var2 = (qb9) obj;
                AnnualEntry annualEntry = AnnualEntry.INSTANCE;
                qb9Var2.getClass();
                annualEntry.getClass();
                qb9Var2.h = annualEntry;
                qb9Var2.e = false;
                qb9Var2.a(-1);
                qb9Var2.e = false;
                qb9Var2.f = false;
                return wefVar;
            case 20:
                kv2.y((l1f) obj, "btn", "YR2026_monthly_startReading", "pathway", "YR2026_monthly_spreadResult");
                return wefVar;
            case 21:
                kv2.y((l1f) obj, "btn", "YR2026_domains_startReading", "pathway", "YR2026_domains_spreadResult");
                return wefVar;
            case 22:
                kv2.y((l1f) obj, "btn", "YR2026_monthly_startDraw", "pathway", "YR2026_monthly_drawPreview");
                return wefVar;
            case 23:
                kv2.y((l1f) obj, "btn", "YR2026_domains_startDraw", "pathway", "YR2026_domains_drawPreview");
                return wefVar;
            case 24:
                return (yg0) obj;
            case 25:
                kv2.y((l1f) obj, "btn", "cancel_auto_renewal_think_again", "pathway", "auto_renewal_manage_popup");
                return wefVar;
            case 26:
                kv2.y((l1f) obj, "btn", "cancel_auto_renewal_confirm", "pathway", "auto_renewal_manage_popup");
                return wefVar;
            case 27:
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                l1fVar4.a("cancel_auto_renew", "btn");
                return wefVar;
            case 28:
                at0 at0Var = (at0) obj;
                at0Var.getClass();
                qn4.G(at0Var);
                return wefVar;
            default:
                ((at0) obj).n1();
                return wefVar;
        }
    }
}
