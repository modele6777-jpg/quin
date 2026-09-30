package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i73 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ i73(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        int i2 = 6;
        h83 h83Var = null;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                DailyFortuneGuideTrigger dailyFortuneGuideTrigger = (DailyFortuneGuideTrigger) obj;
                dailyFortuneGuideTrigger.getClass();
                return dailyFortuneGuideTrigger.getAnalyticsValue();
            case 1:
                n73 n73Var = (n73) obj;
                n73Var.getClass();
                return n73Var.b();
            case 2:
                List list = (List) obj;
                list.getClass();
                if (list.size() != 2) {
                    list = null;
                }
                return new g83(list != null ? new e83(((Boolean) list.get(0)).booleanValue(), ((Boolean) list.get(1)).booleanValue()) : null);
            case 3:
                List list2 = (List) obj;
                list2.getClass();
                if (list2.size() != 4) {
                    list2 = null;
                }
                if (list2 != null) {
                    h83Var = new h83(new e83(((Number) list2.get(0)).intValue() == 1, ((Number) list2.get(1)).intValue() == 1), ((Number) list2.get(2)).intValue(), ((Number) list2.get(3)).intValue());
                }
                return new a93(h83Var);
            case 4:
                kv2.y((l1f) obj, "value", "homepage", "page_name", "homepage");
                return wefVar;
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            case 6:
                File file = (File) obj;
                file.getClass();
                return Boolean.valueOf(file.isFile());
            case 7:
                File file2 = (File) obj;
                file2.getClass();
                return Boolean.valueOf(file2.isFile());
            case 8:
                t09 t09Var = (t09) obj;
                t09Var.getClass();
                qv2 qv2Var = new qv2(5);
                o4e o4eVar = szc.v;
                kob kobVar = job.a;
                em7 em7VarB = kobVar.b(xof.class);
                lp7 lp7Var = lp7.a;
                t09Var.a(new ckd(new yw0(o4eVar, em7VarB, null, qv2Var, lp7Var)));
                t09Var.a(new ckd(new yw0(o4eVar, kobVar.b(gd8.class), null, new qv2(i2), lp7Var)));
                t09Var.a(new ckd(new yw0(o4eVar, kobVar.b(zcb.class), null, new qv2(7), lp7Var)));
                t09Var.a(new ckd(new yw0(o4eVar, kobVar.b(p1c.class), null, new qv2(8), lp7Var)));
                return wefVar;
            case 9:
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                exc.d((hxc) obj);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                exc.d((hxc) obj);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return wefVar;
            case 14:
                exc.i((hxc) obj, new rgc(new os2(28), new os2(29)));
                return wefVar;
            case 15:
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return obj instanceof Object[] ? qd0.t0((Object[]) obj, null, "[", "]", new i73(16), 25) : String.valueOf(obj);
            case 17:
                ((hxc) obj).getClass();
                return wefVar;
            case 18:
                ((hxc) obj).getClass();
                return wefVar;
            case 19:
                ((hxc) obj).getClass();
                return wefVar;
            case 20:
                ((hxc) obj).getClass();
                return wefVar;
            case 21:
                ((hxc) obj).getClass();
                return wefVar;
            case 22:
                ((my) obj).getClass();
                return kn2.c0(rw4.f(b21.T(200, 0, null, 6), 2), rw4.g(b21.T(200, 0, null, 6), 2));
            case 23:
                ((sn4) obj).getClass();
                return wefVar;
            case 24:
                TarotCardType tarotCardType = (TarotCardType) obj;
                tarotCardType.getClass();
                return tarotCardType.getCardKey();
            case 25:
                kv2.y((l1f) obj, "btn", "onsite_draw_card", "pathway", "general");
                return wefVar;
            case 26:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("go_deck_store", "btn");
                return wefVar;
            case 27:
                ((sn4) obj).getClass();
                return wefVar;
            case 28:
                ((sn4) obj).getClass();
                return wefVar;
            default:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.a("use_deck_reading", "btn");
                l1fVar2.a("mixed_tarot", "product_id");
                return wefVar;
        }
    }
}
