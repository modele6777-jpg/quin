package defpackage;

import ai.askquin.ui.conversation.ConversationRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pg2 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ pg2(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
            case 1:
            case 2:
                return null;
            case 3:
                zg2.b("LocalViewConfiguration");
                throw null;
            case 4:
                zg2.b("LocalWindowInfo");
                throw null;
            case 5:
                return new yg2();
            case 6:
                return null;
            case 7:
                zg2.b("LocalAutofillTree");
                throw null;
            case 8:
                zg2.b("LocalAutofillManager");
                throw null;
            case 9:
                zg2.b("LocalClipboardManager");
                throw null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                zg2.b("LocalClipboard");
                throw null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                zg2.b("LocalGraphicsContext");
                throw null;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                zg2.b("LocalFontFamilyResolver");
                throw null;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                zg2.b("LocalDensity");
                throw null;
            case 14:
                zg2.b("LocalFocusManager");
                throw null;
            case 15:
                zg2.b("LocalFontLoader");
                throw null;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                zg2.b("LocalHapticFeedback");
                throw null;
            case 17:
                zg2.b("LocalInputManager");
                throw null;
            case 18:
                zg2.b("LocalLayoutDirection");
                throw null;
            case 19:
                zg2.b("LocalProvidableLocaleList");
                throw null;
            case 20:
            case 21:
                return null;
            case 22:
                zg2.b("LocalTextToolbar");
                throw null;
            case 23:
                zg2.b("LocalUriHandler");
                throw null;
            case 24:
                wf2.b("Unexpected call to default provider");
                throw new nt7();
            case 25:
                return q1c.f(Boolean.FALSE);
            case 26:
                return wefVar;
            case 27:
                return ConversationRoute.Conversation._init_$_anonymous_();
            case 28:
                return ConversationRoute.InvitationDialog._init_$_anonymous_();
            default:
                return wefVar;
        }
    }
}
