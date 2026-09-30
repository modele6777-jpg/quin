package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tb7 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ tb7(int i, b18 b18Var) {
        this.a = 17;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        int i2 = 20;
        int i3 = 18;
        int i4 = 17;
        int i5 = 16;
        int i6 = 19;
        int i7 = 0;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((l1f) obj).a("2405", "aid");
                return wefVar;
            case 1:
                kv2.y((l1f) obj, "btn", "invite_friends_cta", "pathway", "invite_friends_page");
                return wefVar;
            case 2:
                ((l1f) obj).a("2405", "aid");
                return wefVar;
            case 3:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "redeem_gift_card", "pathway", "account");
                l1fVar.a("redeem_code", "redeem_method");
                return wefVar;
            case 4:
                kv2.y((l1f) obj, "btn", "redeem_code_submit", "pathway", "account");
                return wefVar;
            case 5:
                ((l1f) obj).getClass();
                return wefVar;
            case 6:
                q22 q22Var = (q22) obj;
                q22Var.getClass();
                q22Var.a("JsonPrimitive", new rh7(new yv6(i5)), (12 & 8) == 0);
                q22Var.a("JsonNull", new rh7(new yv6(i4)), (12 & 8) == 0);
                q22Var.a("JsonLiteral", new rh7(new yv6(i3)), (12 & 8) == 0);
                q22Var.a("JsonObject", new rh7(new yv6(i6)), (12 & 8) == 0);
                q22Var.a("JsonArray", new rh7(new yv6(i2)), (12 & 8) == 0);
                return wefVar;
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                nh7 nh7Var = (nh7) entry.getValue();
                StringBuilder sb = new StringBuilder();
                n4e.a(str, sb);
                sb.append(':');
                sb.append(nh7Var);
                return sb.toString();
            case 8:
                t09 t09Var = (t09) obj;
                t09Var.getClass();
                sz5 sz5Var = new sz5(i5);
                o4e o4eVar = szc.v;
                kob kobVar = job.a;
                em7 em7VarB = kobVar.b(nb4.class);
                lp7 lp7Var = lp7.a;
                t09Var.a(new ckd(new yw0(o4eVar, em7VarB, null, sz5Var, lp7Var)));
                t09Var.a(new ckd(new yw0(o4eVar, kobVar.b(g6b.class), null, new sz5(i4), lp7Var)));
                t09Var.a(new ckd(new yw0(o4eVar, kobVar.b(vc4.class), null, new sz5(i3), lp7Var)));
                t09Var.a(new ckd(new yw0(o4eVar, kobVar.b(bz6.class), null, new sz5(i6), lp7Var)));
                t09Var.a(new ckd(new yw0(o4eVar, kobVar.b(fba.class), null, new sz5(i2), lp7Var)));
                dze dzeVar = new dze(i6);
                em7 em7VarB2 = kobVar.b(wk8.class);
                lp7 lp7Var2 = lp7.b;
                t09Var.a(new w95(new yw0(o4eVar, em7VarB2, null, dzeVar, lp7Var2)));
                t09Var.a(new w95(new yw0(o4eVar, kobVar.b(sv6.class), null, new sz5(21), lp7Var2)));
                return wefVar;
            case 9:
                Locale locale = (Locale) obj;
                Locale[] localeArr = vd8.a;
                locale.getClass();
                String strC = vd8.c(locale);
                strC.getClass();
                return strC;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj).getClass();
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                List list = (List) obj;
                return new jx7(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj).getClass();
                return pu4.a;
            case 14:
                ((Integer) obj).getClass();
                return -1;
            case 15:
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                List list2 = (List) obj;
                return new j18(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 17:
                return wefVar;
            case 18:
                Throwable th = (Throwable) obj;
                th.getClass();
                return th.getCause();
            case 19:
                ((bea) obj).getClass();
                return wefVar;
            case 20:
                return wefVar;
            case 21:
                return wefVar;
            case 22:
                return wefVar;
            case 23:
                u68 u68Var = (u68) obj;
                u68Var.getClass();
                q3c q3cVar = u68Var.c;
                if (q3cVar instanceof u68) {
                    return (u68) q3cVar;
                }
                return null;
            case 24:
                u68 u68Var2 = (u68) obj;
                u68Var2.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(u68Var2.a);
                sb2.append('=');
                sb2.append(u68Var2.b);
                return sb2.toString();
            case 25:
                return wefVar;
            case 26:
                fg3 fg3Var = (fg3) obj;
                fg3Var.getClass();
                z7f.u(fg3Var, 't');
                return wefVar;
            case 27:
                fg3 fg3Var2 = (fg3) obj;
                fg3Var2.getClass();
                z7f.u(fg3Var2, 'T');
                return wefVar;
            case 28:
                ((gg3) obj).getClass();
                return wefVar;
            default:
                gg3 gg3Var = (gg3) obj;
                gg3Var.getClass();
                z7f.u(gg3Var, ':');
                ((v5) gg3Var).b(new ru0(new osc(uw9.b)));
                z7f.V(gg3Var, "", new nd8(i7));
                return wefVar;
        }
    }

    public /* synthetic */ tb7(int i) {
        this.a = i;
    }
}
