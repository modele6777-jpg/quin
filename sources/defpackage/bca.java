package defpackage;

import ai.askquin.data.quickdecision.QuickDecisionAnswer;
import ai.askquin.data.quickdecision.QuickDecisionCard;
import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.draw.navhost.PhotoPatternRoute;
import ai.askquin.ui.draw.navhost.PostDrawInfoRoute;
import ai.askquin.ui.draw.photo.homepage.PhysicalDeckCameraRoute;
import ai.askquin.ui.draw.photo.homepage.PhysicalDeckCardConfirmRoute;
import ai.askquin.ui.draw.photo.homepage.PhysicalDeckReadingRoute;
import ai.askquin.ui.draw.photo.homepage.QuestionInputRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$Share;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$StartAnalysisRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.QueryQuestionRequest;
import tech.chatmind.api.QueryQuestionResponse;
import tech.chatmind.api.Question;
import tech.chatmind.api.QuestionRequest;
import tech.chatmind.api.events.model.Popup;
import tech.chatmind.api.events.model.PopupAction;
import tech.chatmind.api.events.model.PopupActionType;
import tech.chatmind.api.events.model.PopupTrackingEvent;
import tech.chatmind.api.personality.PersonalitySection;
import tech.chatmind.api.personality.ProfessionSection;
import tech.chatmind.api.personality.model.QuestionResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bca implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ bca(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return PersonalityRoutes$Share._init_$_anonymous_();
            case 1:
                return PersonalityRoutes$StartAnalysisRoute._init_$_anonymous_();
            case 2:
                return PersonalitySection._childSerializers$_anonymous_();
            case 3:
                return PhotoPatternRoute._childSerializers$_anonymous_();
            case 4:
                return PhysicalDeckCameraRoute._init_$_anonymous_();
            case 5:
                return PhysicalDeckCardConfirmRoute._init_$_anonymous_();
            case 6:
                return PhysicalDeckReading._childSerializers$_anonymous_();
            case 7:
                return PhysicalDeckReading._childSerializers$_anonymous_$0();
            case 8:
                return PhysicalDeckReadingRoute._init_$_anonymous_();
            case 9:
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                js3 js3Var = ga4.a;
                return hr3.c;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return null;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Popup._childSerializers$_anonymous_();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Popup._childSerializers$_anonymous_$0();
            case 14:
                return PopupAction._childSerializers$_anonymous_();
            case 15:
                return PopupActionType._init_$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return wef.a;
            case 17:
                return q1c.f(Boolean.TRUE);
            case 18:
                return PopupTrackingEvent._childSerializers$_anonymous_();
            case 19:
                return PostDrawInfoRoute._init_$_anonymous_();
            case 20:
                return ProfessionSection._childSerializers$_anonymous_();
            case 21:
                return QueryQuestionRequest._childSerializers$_anonymous_();
            case 22:
                return QueryQuestionResponse._childSerializers$_anonymous_();
            case 23:
                return Question._childSerializers$_anonymous_();
            case 24:
                return QuestionInputRoute._childSerializers$_anonymous_();
            case 25:
                return QuestionInputRoute._childSerializers$_anonymous_$0();
            case 26:
                return QuestionRequest._childSerializers$_anonymous_();
            case 27:
                return QuestionResponse._childSerializers$_anonymous_();
            case 28:
                return QuickDecisionAnswer._init_$_anonymous_();
            default:
                return QuickDecisionCard._childSerializers$_anonymous_();
        }
    }
}
