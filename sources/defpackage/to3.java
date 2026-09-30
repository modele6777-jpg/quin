package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;
import ai.askquin.ui.router.AppRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class to3 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ to3(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        int i = this.a;
        boolean z = true;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                return th.getCause();
            case 1:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new cs3(iIntValue, ((Float) obj3).floatValue(), new h53(list, 3));
            case 2:
                exc.p((hxc) obj);
                return wefVar;
            case 3:
                return wefVar;
            case 4:
                ((ReviewRewardState) obj).getClass();
                return "已重置当前账号评价奖励状态";
            case 5:
                ((ReviewRewardState) obj).getClass();
                return "已设置 Snackbar 已领取曝光状态；需从历史打开已完成占卜或重建解读页面";
            case 6:
                ((ReviewRewardState) obj).getClass();
                return "已设置商店返回待展示状态；需从历史打开已完成占卜或重建解读页面";
            case 7:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                hf8.Q.getClass();
                ef8.a("DeviceTokenUpdate").h("Failed to update device token", th2);
                return wefVar;
            case 8:
                return Boolean.valueOf(vd0.P(obj));
            case 9:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("SELECT id FROM divination WHERE accountId = '' AND isLocalOnly = 1");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (x8cVarW0.R0()) {
                        arrayList.add(x8cVarW0.t0(0));
                    }
                    x8cVarW0.close();
                    return arrayList;
                } catch (Throwable th3) {
                    x8cVarW0.close();
                    throw th3;
                }
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW1 = q8cVar2.W0("SELECT id FROM divination WHERE accountId = ''");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (x8cVarW1.R0()) {
                        arrayList2.add(x8cVarW1.t0(0));
                    }
                    x8cVarW1.close();
                    return arrayList2;
                } catch (Throwable th4) {
                    x8cVarW1.close();
                    throw th4;
                }
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW2 = q8cVar3.W0("UPDATE divination SET deletedAt = NULL WHERE deletedAt IS NOT NULL");
                try {
                    x8cVarW2.R0();
                    return wefVar;
                } finally {
                    x8cVarW2.close();
                }
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                q8c q8cVar4 = (q8c) obj;
                q8cVar4.getClass();
                x8c x8cVarW3 = q8cVar4.W0("UPDATE divination SET syncedAt = NULL");
                try {
                    x8cVarW3.R0();
                    return wefVar;
                } finally {
                    x8cVarW3.close();
                }
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                q8c q8cVar5 = (q8c) obj;
                q8cVar5.getClass();
                x8c x8cVarW4 = q8cVar5.W0("SELECT COUNT(*) FROM divination WHERE deletedAt IS NOT NULL");
                try {
                    return Integer.valueOf(x8cVarW4.R0() ? (int) x8cVarW4.getLong(0) : 0);
                } finally {
                    x8cVarW4.close();
                }
            case 14:
                ib4 ib4Var = (ib4) obj;
                ib4Var.getClass();
                if (!(ib4Var instanceof gb4)) {
                    return ib4Var;
                }
                gb4 gb4Var = (gb4) ib4Var;
                return ((gb4Var.a instanceof id4) && !gb4Var.c && gb4Var.d == null) ? job.a.b(id4.class) : ib4Var;
            case 15:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                qb9Var.g = job.a.b(AppRoute.Conversation.class);
                qb9Var.e = false;
                qb9Var.a(-1);
                qb9Var.e = true;
                qb9Var.f = false;
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                kv2.y((l1f) obj, "btn", "skip_additional_info", "pathway", "general_additional_info_stage1");
                return wefVar;
            case 17:
                qb9 qb9Var2 = (qb9) obj;
                qb9Var2.getClass();
                qb9Var2.g = job.a.b(AppRoute.Conversation.class);
                qb9Var2.e = false;
                qb9Var2.a(-1);
                qb9Var2.e = true;
                qb9Var2.f = false;
                return wefVar;
            case 18:
                ot8 ot8Var = (ot8) obj;
                ot8Var.getClass();
                return Boolean.valueOf(ot8Var instanceof dt8);
            case 19:
                ot8 ot8Var2 = (ot8) obj;
                ot8Var2.getClass();
                return Boolean.valueOf((ot8Var2 instanceof et8) && !((et8) ot8Var2).c);
            case 20:
                return wefVar;
            case 21:
                ot8 ot8Var3 = (ot8) obj;
                ot8Var3.getClass();
                return Boolean.valueOf(ot8Var3 instanceof et8);
            case 22:
                ot8 ot8Var4 = (ot8) obj;
                ot8Var4.getClass();
                if (!(ot8Var4 instanceof ht8) && !(ot8Var4 instanceof ft8) && !(ot8Var4 instanceof gt8) && !(ot8Var4 instanceof jt8) && (!(ot8Var4 instanceof mh6) || !pa7.t(((mh6) ot8Var4).getId(), "qa-recommend-existing-follow-up"))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                ot8 ot8Var5 = (ot8) obj;
                ot8Var5.getClass();
                return Boolean.valueOf(ot8Var5 instanceof et8);
            case 24:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                tarotCardChoice.getClass();
                return tarotCardChoice.getCard().getCardKey();
            case 25:
                kv2.y((l1f) obj, "btn", "close", "pathway", "readingFeedback_popup");
                return wefVar;
            case 26:
                return Boolean.valueOf(((ot8) obj) instanceof dt8);
            case 27:
                kv2.y((l1f) obj, "btn", "YR2026_domains_startShuffle", "pathway", "YR2026_domains_spreadPreview");
                return wefVar;
            case 28:
                return wefVar;
            default:
                return wefVar;
        }
    }
}
