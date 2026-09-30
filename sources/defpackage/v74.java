package defpackage;

import ai.askquin.ui.conversation.DrawCardAnswer;
import ai.askquin.ui.divination.DivinationNavigationRoute$DivinationRoot;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.draw.navhost.DrawCardExitAlert;
import ai.askquin.ui.draw.navhost.DrawCardPopupCardAlert;
import ai.askquin.ui.draw.navhost.EmptyPhotoPatternRoute;
import ai.askquin.ui.draw.photo.homepage.DrawnCardsConfirmRoute;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.DrawClarifyingCardRequest;
import tech.chatmind.api.EmotionTheme;
import tech.chatmind.api.annual.model.DomainContent;
import tech.chatmind.api.annual.model.DomainReportRequestBody;
import tech.chatmind.api.events.model.EventInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v74 implements x16 {
    public final /* synthetic */ int a;

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                return (d56) rzb.b().b(d56.class);
            case 1:
                return new fba();
            case 2:
                return DivinationNavigationRoute$DivinationRoot._init_$_anonymous_();
            case 3:
                return DomainContent._childSerializers$_anonymous_();
            case 4:
                return new sz9(0);
            case 5:
                return DomainReportRequestBody._childSerializers$_anonymous_();
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return DrawCardAnswer._childSerializers$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return DrawCardAnswer._childSerializers$_anonymous_$0();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return DrawCardAnswer._childSerializers$_anonymous_$1();
            case 14:
                return DrawCardExitAlert._init_$_anonymous_();
            case 15:
                return DrawCardPopupCardAlert._init_$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return DrawCardSaves._childSerializers$_anonymous_();
            case 17:
                return DrawCardSaves._childSerializers$_anonymous_$0();
            case 18:
                return DrawCardSaves._childSerializers$_anonymous_$1();
            case 19:
                return 2;
            case 20:
                return DrawClarifyingCardRequest._childSerializers$_anonymous_();
            case 21:
                return new Handler(Looper.getMainLooper());
            case 22:
                return wefVar;
            case 23:
                return DrawnCardsConfirmRoute._childSerializers$_anonymous_();
            case 24:
                return DrawnCardsConfirmRoute._childSerializers$_anonymous_$0();
            case 25:
                return EmotionTheme._init_$_anonymous_();
            case 26:
                return EmptyPhotoPatternRoute._init_$_anonymous_();
            case 27:
                return EventInfo._childSerializers$_anonymous_();
            case 28:
                return EventInfo._childSerializers$_anonymous_$0();
            default:
                return EventInfo._childSerializers$_anonymous_$1();
        }
    }

    public /* synthetic */ v74(int i) {
        this.a = i;
    }
}
