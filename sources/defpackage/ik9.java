package defpackage;

import ai.askquin.App;
import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.draw.navhost.OnSiteDialogRoute;
import ai.askquin.ui.onboard.OnboardBirthdayRoute;
import ai.askquin.ui.onboard.OnboardHearFromRoute;
import ai.askquin.ui.onboard.OnboardOverviewRoute;
import ai.askquin.ui.onboard.OnboardRealTarotRoute;
import ai.askquin.ui.onboard.OnboardThemeSelectionRoute;
import ai.askquin.ui.onboard.OnboardWelcomeBackFromUpgrade;
import ai.askquin.ui.onboard.OnboardWelcomeBackRoute;
import ai.askquin.ui.onboard.OnboardWelcomeRoute;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik9 implements x16 {
    public final /* synthetic */ int a;

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a81 a81Var = new a81(new File(cn1.z().getCacheDir(), "http-cache"));
                gm9 gm9Var = new gm9();
                gm9Var.c.add(new ba1(4));
                hf8.Q.getClass();
                us6 us6Var = new us6(new r45(14, ef8.a("OkHttp")));
                us6Var.b = ts6.b;
                gm9Var.d.add(us6Var);
                gm9Var.c.add(new gd9());
                gm9Var.c.add(new ba1(6));
                PersistentCookieJar persistentCookieJar = jk9.a;
                persistentCookieJar.getClass();
                gm9Var.k = persistentCookieJar;
                gm9Var.l = a81Var;
                return new hm9(gm9Var);
            case 1:
                int i = App.a;
                return new z91(jk9.a());
            case 2:
                return new z91(new hm9(new gm9()));
            case 3:
                return OnSiteDialogRoute._init_$_anonymous_();
            case 4:
                return OnboardBirthdayRoute._init_$_anonymous_();
            case 5:
                return q1c.f(Boolean.FALSE);
            case 6:
                return wef.a;
            case 7:
                return OnboardHearFromRoute._init_$_anonymous_();
            case 8:
                return wef.a;
            case 9:
                return OnboardOverviewRoute._init_$_anonymous_();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return OnboardRealTarotRoute._init_$_anonymous_();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return OnboardThemeSelectionRoute._init_$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return OnboardWelcomeBackFromUpgrade._init_$_anonymous_();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return OnboardWelcomeBackRoute._init_$_anonymous_();
            case 14:
                return OnboardWelcomeRoute._init_$_anonymous_();
            case 15:
                return Operation.Ask._init_$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return Operation.Chat._init_$_anonymous_();
            case 17:
                return Operation.Explanation._init_$_anonymous_();
            case 18:
                return Operation.Pattern._init_$_anonymous_();
            case 19:
                return Operation.SubmitSpread._childSerializers$_anonymous_();
            case 20:
                return new ju9();
            case 21:
                return OverviewItem.ClarifyingCardItem._childSerializers$_anonymous_();
            case 22:
                return OverviewItem.ClarifyingCardItem._childSerializers$_anonymous_$0();
            case 23:
                return OverviewItem.ClarifyingCardItem._childSerializers$_anonymous_$1();
            case 24:
                return OverviewItem.ContinuationChatSlice._init_$_anonymous_();
            case 25:
                return OverviewItem.Divider._init_$_anonymous_();
            case 26:
                return OverviewItem.FailReason._init_$_anonymous_();
            case 27:
                return OverviewItem.Loading._init_$_anonymous_();
            case 28:
                return OverviewItem.NewReadingItem._childSerializers$_anonymous_();
            default:
                return OverviewItem.Share._init_$_anonymous_();
        }
    }

    public /* synthetic */ ik9(int i) {
        this.a = i;
    }
}
