package defpackage;

import ai.askquin.R;
import ai.askquin.model.DailyFortuneDirectionContent;
import ai.askquin.qa.bridge.Danger;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import tech.chatmind.api.CountType;
import tech.chatmind.api.CountV2;
import tech.chatmind.api.personality.CosmicSection;
import tech.chatmind.api.personality.CpSection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class os2 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ os2(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                jcc.k(0, Integer.valueOf(R.string.rating_not_store_found));
                return wefVar;
            case 1:
                return wefVar;
            case 2:
                return CosmicSection._childSerializers$_anonymous_();
            case 3:
                return CountType._init_$_anonymous_();
            case 4:
                return CountV2._childSerializers$_anonymous_();
            case 5:
                return CpSection._childSerializers$_anonymous_();
            case 6:
                return CrashlyticsWorkers.Companion.checkBackgroundThread$lambda$2();
            case 7:
                return CrashlyticsWorkers.Companion.checkNotMainThread$lambda$0();
            case 8:
                return CrashlyticsWorkers.Companion.checkBlockingThread$lambda$1();
            case 9:
                return DailyCardBasicInfo._childSerializers$_anonymous_();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return DailyCardBasicInfo._childSerializers$_anonymous_$0();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return DailyCardBasicInfo._childSerializers$_anonymous_$1();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return wefVar;
            case 14:
                return DailyFortuneDirectionContent._childSerializers$_anonymous_();
            case 15:
                return DailyFortuneDirectionContent._childSerializers$_anonymous_$0();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return DailyFortuneDirectionContent._childSerializers$_anonymous_$1();
            case 17:
                return DailyFortuneGuideTrigger._init_$_anonymous_();
            case 18:
                return new a93(null);
            case 19:
                return wefVar;
            case 20:
                return "installed";
            case 21:
                x1f x1fVar = x1f.a;
                x1f.i(4, null, "app_install");
                return wefVar;
            case 22:
                x1f x1fVar2 = x1f.a;
                x1f.i(4, null, "app_open");
                return wefVar;
            case 23:
                th5 th5Var = cye.b;
                return gcc.E(z57.a.a(), fbc.d()).a().toString();
            case 24:
                return Danger._init_$_anonymous_();
            case 25:
                kob kobVar = job.a;
                return new kic("kotlinx.datetime.DateTimeUnit.DateBased", kobVar.b(ng3.class), new em7[]{kobVar.b(pg3.class), kobVar.b(rg3.class)}, new xn7[]{yg3.a, c19.a});
            case 26:
                return q1c.f(new zse(7, 0L, (String) null));
            case 27:
                return q1c.f(Boolean.FALSE);
            case 28:
                return Float.valueOf(0.0f);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
