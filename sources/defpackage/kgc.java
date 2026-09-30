package defpackage;

import ai.askquin.data.SeasonalDraftStore$Draft;
import ai.askquin.data.SeasonalReadingStore$Snapshot;
import ai.askquin.ui.fourseasons.SeasonalGenderRoute;
import ai.askquin.ui.fourseasons.SeasonalPhysicalCameraRoute;
import ai.askquin.ui.fourseasons.SeasonalPhysicalDrawRoute;
import ai.askquin.ui.fourseasons.SeasonalQuestionRoute;
import ai.askquin.ui.seasonal.SeasonalEntry;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.seasonal.model.SeasonalCard;
import tech.chatmind.api.seasonal.model.SeasonalCareerStatus;
import tech.chatmind.api.seasonal.model.SeasonalFollowUp;
import tech.chatmind.api.seasonal.model.SeasonalGender;
import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;
import tech.chatmind.api.seasonal.model.SeasonalHistoryResponse;
import tech.chatmind.api.seasonal.model.SeasonalLoveStatus;
import tech.chatmind.api.seasonal.model.SeasonalPosition;
import tech.chatmind.api.seasonal.model.SeasonalReading;
import tech.chatmind.api.seasonal.model.SeasonalReadingCard;
import tech.chatmind.api.seasonal.model.SeasonalReadingRequest;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kgc implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ kgc(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return wef.a;
            case 1:
                return new ghc(0);
            case 2:
                return new csc(false);
            case 3:
                return q1c.f(Boolean.FALSE);
            case 4:
                return q1c.f(Boolean.FALSE);
            case 5:
                return SeasonalCard._childSerializers$_anonymous_();
            case 6:
                return q1c.f(0L);
            case 7:
                return SeasonalCareerStatus._init_$_anonymous_();
            case 8:
                return SeasonalDraftStore$Draft._childSerializers$_anonymous_();
            case 9:
                return SeasonalDraftStore$Draft._childSerializers$_anonymous_$0();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return SeasonalEntry._init_$_anonymous_();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return SeasonalFollowUp._childSerializers$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return SeasonalGender._init_$_anonymous_();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return SeasonalGenderRoute._init_$_anonymous_();
            case 14:
                return SeasonalHistoryItem._childSerializers$_anonymous_();
            case 15:
                return SeasonalHistoryResponse._childSerializers$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return SeasonalLoveStatus._init_$_anonymous_();
            case 17:
                return SeasonalPhysicalCameraRoute._init_$_anonymous_();
            case 18:
                return SeasonalPhysicalDrawRoute._init_$_anonymous_();
            case 19:
                return SeasonalPosition._init_$_anonymous_();
            case 20:
                return SeasonalQuestionRoute._init_$_anonymous_();
            case 21:
                return SeasonalReading._childSerializers$_anonymous_();
            case 22:
                return SeasonalReadingCard._childSerializers$_anonymous_();
            case 23:
                return SeasonalReadingRequest._childSerializers$_anonymous_();
            case 24:
                return SeasonalReadingRequest._childSerializers$_anonymous_$0();
            case 25:
                return SeasonalReadingResponse._childSerializers$_anonymous_();
            case 26:
                return SeasonalReadingResponse._childSerializers$_anonymous_$0();
            case 27:
                return SeasonalReadingResponse._childSerializers$_anonymous_$1();
            case 28:
                return SeasonalReadingStore$Snapshot._childSerializers$_anonymous_();
            default:
                return SeasonalReadingStore$Snapshot._childSerializers$_anonymous_$0();
        }
    }
}
