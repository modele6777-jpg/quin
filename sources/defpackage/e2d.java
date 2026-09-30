package defpackage;

import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$GraphEntry;
import ai.askquin.ui.persistence.serialization.SerializableDivinationState;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e2d implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ e2d(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                ynb.V(lw2.a, null, null, new i2d(xqa.x.a, num, null), 3);
                return wefVar;
            case 1:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("membership_card", "btn");
                return wefVar;
            case 2:
                kv2.y((l1f) obj, "btn", "input_code", "page_name", "invite");
                return wefVar;
            case 3:
                kv2.y((l1f) obj, "btn", "invite_friends", "pathway", "account");
                return wefVar;
            case 4:
                kv2.y((l1f) obj, "btn", "wecom_entry", "pathway", "account");
                return wefVar;
            case 5:
                kv2.y((l1f) obj, "btn", "2026_yearlyReading", "pathway", "account");
                return wefVar;
            case 6:
                kv2.y((l1f) obj, "btn", "gift_card_entry", "pathway", "account");
                return wefVar;
            case 7:
                kv2.y((l1f) obj, "btn", "add_widget", "pathway", "account");
                return wefVar;
            case 8:
                kv2.y((l1f) obj, "btn", "friend_coupon_entry", "pathway", "account_page");
                return wefVar;
            case 9:
                gbd gbdVar = (gbd) obj;
                gbdVar.getClass();
                int iOrdinal = gbdVar.ordinal();
                if (iOrdinal == 0) {
                    return "qq";
                }
                if (iOrdinal == 1) {
                    return "qq_zone";
                }
                if (iOrdinal == 2) {
                    return "wechat";
                }
                if (iOrdinal == 3) {
                    return "moments";
                }
                if (iOrdinal == 4) {
                    return "more";
                }
                ap.c();
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((yg0) obj).getClass();
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                exc.f(hxcVar, "QR code");
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                rf0 rf0Var = (rf0) obj;
                rf0Var.getClass();
                return Boolean.valueOf(rf0Var.a.equals(gg0.l));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                rf0 rf0Var2 = (rf0) obj;
                rf0Var2.getClass();
                return Boolean.valueOf(rf0Var2.a instanceof cg0);
            case 14:
                rf0 rf0Var3 = (rf0) obj;
                rf0Var3.getClass();
                return Boolean.valueOf(rf0Var3.a.equals(qf0.l));
            case 15:
                rf0 rf0Var4 = (rf0) obj;
                rf0Var4.getClass();
                return fyc.x(new ve5(o5c.h(rf0Var4), true, new e2d(12)), new sf0(rf0Var4, 5));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                rf0 rf0Var5 = (rf0) obj;
                rf0Var5.getClass();
                return Boolean.valueOf(rf0Var5.a instanceof pf0);
            case 17:
                ((oad) obj).getClass();
                return wefVar;
            case 18:
                t12 t12Var = (t12) obj;
                t12Var.getClass();
                ft8 ft8Var = t12Var.b;
                List list = ft8Var != null ? ft8Var.b : null;
                if (list == null) {
                    list = pu4.a;
                }
                return fyc.x(new td0(1, list), new ckb(23, t12Var));
            case 19:
                ((my) obj).getClass();
                return kn2.c0(rw4.f(b21.T(300, 0, null, 6), 2), rw4.g(b21.T(300, 0, null, 6), 2));
            case 20:
                ((Long) obj).getClass();
                return wefVar;
            case 21:
                ((Long) obj).getClass();
                return wefVar;
            case 22:
                return SerializableDivinationState.CardsDecided.Companion.serializer();
            case 23:
                return SerializableDivinationState.WaitConfirm.Companion.serializer();
            case 24:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.n(180.0f);
                return wefVar;
            case 25:
                xh6 xh6Var = (xh6) obj;
                xh6Var.getClass();
                q03 q03Var = gs4.b;
                q03Var.getClass();
                ci6 ci6Var = new ci6(q03Var, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY))));
                if (!ci6Var.equals(xh6Var.Y0)) {
                    xh6Var.F0 |= 4096;
                    xh6Var.Y0 = ci6Var;
                }
                if (!yi4.b(12.0f, xh6Var.R0)) {
                    xh6Var.F0 |= 32;
                    xh6Var.R0 = 12.0f;
                }
                return wefVar;
            case 26:
                hxc hxcVar2 = (hxc) obj;
                hxcVar2.getClass();
                exc.m(hxcVar2, 0);
                return wefVar;
            case 27:
                kv2.y((l1f) obj, "pathway", "tarot_store", "triggered_by", "tarot_store");
                return wefVar;
            case 28:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                qb9Var.g = job.a.b(ExploreTarotRoute$GraphEntry.class);
                qb9Var.e = false;
                qb9Var.a(-1);
                qb9Var.e = true;
                qb9Var.f = false;
                qb9Var.b = true;
                return wefVar;
            default:
                qb9 qb9Var2 = (qb9) obj;
                em7 em7VarB = job.a.b(SkinNavigationRoute$SkinMallRoute.class);
                qb9Var2.getClass();
                qb9Var2.g = em7VarB;
                qb9Var2.e = false;
                qb9Var2.a(-1);
                qb9Var2.e = true;
                qb9Var2.f = false;
                return wefVar;
        }
    }
}
