package defpackage;

import ai.askquin.data.quickdecision.QuickDecisionCard;
import ai.askquin.qa.bridge.a;
import ai.askquin.ui.router.AppRoute;
import ai.askquin.widget.QuickDecisionWidgetReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zea implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ zea(ww3 ww3Var) {
        this.a = 0;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01e1  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        String str;
        int i = this.a;
        int i2 = 3;
        int i3 = 4;
        LocalTime localTimeA = null;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                throw ks0.e(obj);
            case 1:
                kv2.y((l1f) obj, "btn", "invite_friends", "page_name", "invitation_popup");
                return wefVar;
            case 2:
                ila ilaVar = (ila) obj;
                if (ilaVar.isAttachedToWindow()) {
                    ilaVar.r();
                }
                return wefVar;
            case 3:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("voice_message_delete", "btn");
                return wefVar;
            case 4:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a("voice_message_play", "btn");
                return wefVar;
            case 5:
                kv2.y((l1f) obj, "btn", "voice_record_end", "end_type", "too_short");
                return wefVar;
            case 6:
                kv2.y((l1f) obj, "btn", "voice_record_end", "end_type", "manual");
                return wefVar;
            case 7:
                kv2.y((l1f) obj, "btn", "voice_record_end", "end_type", "timeout");
                return wefVar;
            case 8:
                Context context = (Context) obj;
                context.getClass();
                u8 u8Var = new u8(context, 28);
                LinkedHashSet linkedHashSet = add.a;
                linkedHashSet.getClass();
                zcd zcdVar = new zcd(linkedHashSet, null);
                ycd ycdVar = new ycd(3, null);
                LinkedHashSet linkedHashSet2 = bdd.a;
                linkedHashSet2.getClass();
                return t72.H(new xcd(u8Var, linkedHashSet2, zcdVar, ycdVar, null, null));
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                LocalTime localTimeK = k99.K(str2);
                if (localTimeK != null) {
                    LocalTime localTime = lze.a;
                    localTimeA = lze.a(localTimeK.getHour(), localTimeK.getMinute());
                }
                return Boolean.valueOf(localTimeA != null);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                String str3 = (String) obj;
                str3.getClass();
                return Boolean.valueOf(k99.K(str3) != null);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                j86 j86Var = (j86) obj;
                j86Var.getClass();
                return j86Var.c();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return dva.b;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Context context2 = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i4);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context2.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 14:
                gp7 gp7Var = (gp7) obj;
                gp7Var.a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                gp7Var.a(fValueOf, 300).b = u39.b;
                gp7Var.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                gp7Var.a(fValueOf2, 1800);
                gp7Var.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                gp7Var.a(fValueOf3, 3300);
                gp7Var.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                gp7Var.a(fValueOf4, 4800);
                gp7Var.a(fValueOf4, 6000);
                return wefVar;
            case 15:
                exc.l((hxc) obj, rwa.d);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((List) obj).getClass();
                return wefVar;
            case 17:
                t09 t09Var = (t09) obj;
                t09Var.getClass();
                aka akaVar = new aka(i2);
                o4e o4eVar = szc.v;
                kob kobVar = job.a;
                em7 em7VarB = kobVar.b(em1.class);
                lp7 lp7Var = lp7.a;
                t09Var.a(new ckd(new yw0(o4eVar, em7VarB, null, akaVar, lp7Var)));
                t09Var.a(new ckd(new yw0(o4eVar, kobVar.b(a.class), null, new aka(i3), lp7Var)));
                t09Var.a(new ckd(new yw0(o4eVar, kobVar.b(x2b.class), null, new aka(5), lp7Var)));
                return wefVar;
            case 18:
                bh7 bh7Var = (bh7) obj;
                bh7Var.getClass();
                bh7Var.c = true;
                return wefVar;
            case 19:
                ((my) obj).getClass();
                return kn2.c0(rw4.f(b21.T(Constants.MINIMAL_ERROR_STATUS_CODE, 250, null, 4), 2), rw4.g(b21.T(350, 0, null, 6), 2));
            case 20:
                w4b w4bVar = (w4b) obj;
                w4bVar.getClass();
                return job.a.b(w4bVar.getClass());
            case 21:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                l1fVar3.a("report_finish", "btn");
                return wefVar;
            case 22:
                kv2.y((l1f) obj, "btn", "start_reading", "pathway", "homepage_photoReading_spreadInfoPage");
                return wefVar;
            case 23:
                kv2.y((l1f) obj, "btn", "new_reading_tap", "pathway", "quick_decision");
                return wefVar;
            case 24:
                kv2.y((l1f) obj, "btn", "new_reading", "pathway", "quick_decision");
                return wefVar;
            case 25:
                QuickDecisionCard quickDecisionCard = (QuickDecisionCard) obj;
                int i5 = QuickDecisionWidgetReceiver.a;
                quickDecisionCard.getClass();
                return quickDecisionCard.getCardKey();
            case 26:
                kv2.y((l1f) obj, "btn", "claim", "pathway", "activity_popup");
                return wefVar;
            case 27:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                qb9Var.g = job.a.b(AppRoute.GiftCardPurchase.class);
                qb9Var.e = false;
                qb9Var.a(-1);
                qb9Var.e = true;
                qb9Var.f = false;
                return wefVar;
            case 28:
                kv2.y((l1f) obj, "value", "all_history", "page_name", "all_history");
                return wefVar;
            default:
                ((WebView) obj).getClass();
                return wefVar;
        }
    }

    public /* synthetic */ zea(int i) {
        this.a = i;
    }
}
