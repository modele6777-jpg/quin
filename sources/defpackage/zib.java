package defpackage;

import ai.askquin.datastore.reviewreward.ReviewRewardStore;
import ai.askquin.model.Scene;
import ai.askquin.ui.annual.ResumeRoute;
import ai.askquin.ui.conversation.SceneTarot;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.LinkedHashMap;
import tech.chatmind.api.RedeemResponse;
import tech.chatmind.api.Role;
import tech.chatmind.api.dto.ScenarioPattern;
import tech.chatmind.api.personality.RomanceSection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zib implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ zib(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return RedeemResponse._childSerializers$_anonymous_();
            case 2:
                return ResumeRoute._init_$_anonymous_();
            case 3:
                return ResumeRoute.DomainDetail._init_$_anonymous_();
            case 4:
                return ResumeRoute.DomainEntry._init_$_anonymous_();
            case 5:
                return ResumeRoute.DomainSummary._init_$_anonymous_();
            case 6:
                return ResumeRoute.Drawing._childSerializers$_anonymous_();
            case 7:
                return ResumeRoute.Drawing._childSerializers$_anonymous_$0();
            case 8:
                return ResumeRoute.Generating._childSerializers$_anonymous_();
            case 9:
                return ResumeRoute.MonthlyDetail._init_$_anonymous_();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return ResumeRoute.MonthlyEntry._init_$_anonymous_();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return ResumeRoute.MonthlySummary._init_$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return ResumeRoute.Overview._init_$_anonymous_();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                oq8 oq8Var = rzb.a;
                return rzb.a((hm9) jk9.b.getValue());
            case 14:
                oq8 oq8Var2 = rzb.a;
                return rzb.a((hm9) di.a.getValue());
            case 15:
                oq8 oq8Var3 = rzb.a;
                return rzb.a((hm9) be5.a.getValue());
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return ReviewRewardStore._childSerializers$_anonymous_();
            case 17:
                return mue.d;
            case 18:
                return t72.I(d4c.d, f4c.d, k4c.d, h4c.d, i4c.d, j4c.d, e4c.d);
            case 19:
                pr4 pr4Var = q4c.a;
                return o4c.i;
            case 20:
                return new r4c();
            case 21:
                return new a5c();
            case 22:
                return Role._init_$_anonymous_();
            case 23:
                return RomanceSection._childSerializers$_anonymous_();
            case 24:
                return new rcc(new LinkedHashMap());
            case 25:
                return null;
            case 26:
                return ScenarioPattern._childSerializers$_anonymous_();
            case 27:
                return Scene._childSerializers$_anonymous_();
            case 28:
                return SceneTarot._childSerializers$_anonymous_();
            default:
                return SceneTarot._childSerializers$_anonymous_$0();
        }
    }
}
