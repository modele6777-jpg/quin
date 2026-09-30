package defpackage;

import ai.askquin.R;
import ai.askquin.model.CardAffirmationInfo;
import ai.askquin.qa.bridge.CapabilityDescriptor;
import ai.askquin.ui.account.component.AuthOption;
import ai.askquin.ui.account.navigation.AuthNavigation$AuthRoute;
import ai.askquin.ui.account.navigation.AuthNavigation$BindPhoneRoute;
import ai.askquin.ui.account.navigation.AuthNavigation$BindPhoneVerifyCodeRoute;
import ai.askquin.ui.account.navigation.AuthNavigation$EnterCodeRoute;
import ai.askquin.ui.draw.navhost.CameraPreviewRoute;
import ai.askquin.ui.draw.navhost.CardPickerRoute;
import ai.askquin.ui.draw.photo.homepage.CardLayoutConfig;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.generatecard.model.CardDetectionResponse;
import tech.chatmind.api.generatecard.model.CardPosition;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jl0 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ jl0(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                return AuthNavigation$AuthRoute._init_$_anonymous_();
            case 1:
                return AuthNavigation$BindPhoneRoute._childSerializers$_anonymous_();
            case 2:
                return AuthNavigation$BindPhoneVerifyCodeRoute._childSerializers$_anonymous_();
            case 3:
                return AuthNavigation$EnterCodeRoute._init_$_anonymous_();
            case 4:
                return AuthOption._init_$_anonymous_();
            case 5:
                return q1c.f(Boolean.FALSE);
            case 6:
                return new dtd(abg.c(1308617531));
            case 7:
                ace aceVar = BackportedFixQuirk.a;
                return new vs0();
            case 8:
            case 9:
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new hpb();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return CameraPreviewRoute._init_$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return CapabilityDescriptor._childSerializers$_anonymous_();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return CapabilityDescriptor._childSerializers$_anonymous_$0();
            case 14:
                return CapabilityDescriptor._childSerializers$_anonymous_$1();
            case 15:
                return CardAffirmationInfo._childSerializers$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return CardAffirmationInfo._childSerializers$_anonymous_$0();
            case 17:
                return CardAffirmationInfo._childSerializers$_anonymous_$1();
            case 18:
                return CardAffirmationInfo._childSerializers$_anonymous_$2();
            case 19:
                return wefVar;
            case 20:
                return CardDetectionResponse._childSerializers$_anonymous_();
            case 21:
                return CardLayoutConfig._childSerializers$_anonymous_();
            case 22:
                return CardPickerRoute._childSerializers$_anonymous_();
            case 23:
                return CardPosition._init_$_anonymous_();
            case 24:
                return null;
            case 25:
                throw new IllegalStateException("LocalCardZoom not provided");
            case 26:
                jcc.k(0, Integer.valueOf(R.string.toast_over_character_limit));
                return wefVar;
            case 27:
                return q1c.f(Boolean.FALSE);
            case 28:
                return q1c.f(0L);
            default:
                return wefVar;
        }
    }
}
