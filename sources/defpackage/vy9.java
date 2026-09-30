package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.ui.onboard.PendingUserProfile;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$AnalysisHistoryRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$PersonalityIntroRoute;
import android.graphics.PathMeasure;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.PauseReadingAudioResponse;
import tech.chatmind.api.PauseReadingAudioStatus;
import tech.chatmind.api.Period;
import tech.chatmind.api.PeriodUnit;
import tech.chatmind.api.personality.model.PersonalityAnalysis;
import tech.chatmind.api.personality.model.PersonalityAnalysisHistoryResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vy9 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ vy9(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                return ParamSpec._childSerializers$_anonymous_();
            case 1:
                return ParamType._init_$_anonymous_();
            case 2:
                return new bu(new PathMeasure());
            case 3:
                return PauseReadingAudioResponse._childSerializers$_anonymous_();
            case 4:
                return PauseReadingAudioStatus._init_$_anonymous_();
            case 5:
                return jgb.k(iqf.d());
            case 6:
                return ocd.b(0, 0, null, 7);
            case 7:
                return wefVar;
            case 8:
                return q1c.f(Boolean.FALSE);
            case 9:
                return q1c.f(Boolean.FALSE);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return 6;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return PaywallRoute.Paywall520._init_$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return PaywallRoute.UpgradePaywall._childSerializers$_anonymous_();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return (d56) rzb.b().b(d56.class);
            case 14:
                ca2.a.getClass();
                return q1c.f(Boolean.valueOf(ca2.c));
            case 15:
                return q1c.f(Boolean.FALSE);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return wefVar;
            case 17:
                return ib8.i();
            case 18:
                p4e p4eVar = p4e.a;
                return new qh6(p4eVar, p4eVar, 1);
            case 19:
                return new dd0(vhd.Companion.serializer(), 2);
            case 20:
                return PendingUserProfile._childSerializers$_anonymous_();
            case 21:
                return PendingUserProfile._childSerializers$_anonymous_$0();
            case 22:
                return Period._childSerializers$_anonymous_();
            case 23:
                return PeriodUnit._init_$_anonymous_();
            case 24:
                return PersonalityAnalysis._childSerializers$_anonymous_();
            case 25:
                return PersonalityAnalysis._childSerializers$_anonymous_$0();
            case 26:
                return PersonalityAnalysis._childSerializers$_anonymous_$1();
            case 27:
                return PersonalityAnalysisHistoryResponse._childSerializers$_anonymous_();
            case 28:
                return PersonalityRoutes$AnalysisHistoryRoute._init_$_anonymous_();
            default:
                return PersonalityRoutes$PersonalityIntroRoute._init_$_anonymous_();
        }
    }
}
