package defpackage;

import ai.askquin.datastore.model.UserProfile;
import ai.askquin.ui.onboard.model.UserIntentionType;
import ai.askquin.ui.settings.model.UsageCount;
import ai.askquin.ui.settings.model.UsageType;
import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.format.DateTimeFormatterBuilder;
import tech.chatmind.api.UsageBillingResponse;
import tech.chatmind.api.UserProfileResult;
import tech.chatmind.api.UserProfileUpdateRequestBody;
import tech.chatmind.api.UserSelectedSpread;
import tech.chatmind.api.credits.UsageBilling;
import tech.chatmind.api.events.model.UserPopupEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ehf implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ ehf(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
            case 1:
                return wefVar;
            case 2:
                return q1c.f(Boolean.FALSE);
            case 3:
                return q1c.f(u7e.c.a());
            case 4:
                jcc.k(1, "调试预览，不会发起购买或修改账户权益");
                return wefVar;
            case 5:
                return UsageBilling._childSerializers$_anonymous_();
            case 6:
                return UsageBillingResponse._childSerializers$_anonymous_();
            case 7:
                return UsageCount._childSerializers$_anonymous_();
            case 8:
                return UsageType._init_$_anonymous_();
            case 9:
                p2g p2gVar = p2g.a;
                p2g.b(cn1.z());
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return UserIntentionType._init_$_anonymous_();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return UserPopupEvent._childSerializers$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return UserPopupEvent._childSerializers$_anonymous_$0();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return UserProfile._childSerializers$_anonymous_();
            case 14:
                return UserProfile._childSerializers$_anonymous_$0();
            case 15:
                return UserProfileResult._childSerializers$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return UserProfileResult._childSerializers$_anonymous_$0();
            case 17:
                return UserProfileResult._childSerializers$_anonymous_$1();
            case 18:
                return UserProfileUpdateRequestBody._childSerializers$_anonymous_();
            case 19:
                return UserProfileUpdateRequestBody._childSerializers$_anonymous_$0();
            case 20:
                return UserSelectedSpread._childSerializers$_anonymous_();
            case 21:
                return UserSubscriptionInformation._childSerializers$_anonymous_();
            case 22:
                return UserSubscriptionInformation._childSerializers$_anonymous_$0();
            case 23:
                return UserSubscriptionInformation._childSerializers$_anonymous_$1();
            case 24:
                zpf zpfVar = new zpf(new mx(1, false));
                z7f.o(zpfVar, new a26[]{new k8f(16)}, new k8f(17));
                return new aqf(zpfVar.build());
            case 25:
                zpf zpfVar2 = new zpf(new mx(1, false));
                z7f.o(zpfVar2, new a26[]{new k8f(18)}, new k8f(19));
                return new aqf(zpfVar2.build());
            case 26:
                mx mxVar = new mx(1, false);
                uw9 uw9Var = uw9.b;
                mxVar.a(new rid(new ru0(new hqf(uw9Var))));
                mxVar.a(new ru0(new eqf(uw9Var)));
                return new aqf(new v81(mxVar.a));
            case 27:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 28:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            default:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
        }
    }
}
