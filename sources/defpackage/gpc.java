package defpackage;

import ai.askquin.ui.fourseasons.SeasonalRelationshipRoute;
import ai.askquin.ui.fourseasons.SeasonalRoleRoute;
import ai.askquin.ui.fourseasons.SeasonalSpreadRoute;
import ai.askquin.ui.persistence.serialization.SerializableDivinationState;
import ai.askquin.ui.persistence.serialization.SerializableMessage;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import tech.chatmind.api.seasonal.model.SeasonalStatus;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gpc implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ gpc(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        nu4 nu4Var = nu4.a;
        switch (i) {
            case 0:
                return SeasonalRelationshipRoute._init_$_anonymous_();
            case 1:
                return SeasonalRoleRoute._init_$_anonymous_();
            case 2:
                return SeasonalSpreadRoute._init_$_anonymous_();
            case 3:
                return SeasonalStatus._init_$_anonymous_();
            case 4:
                return SeasonalUserInfo._childSerializers$_anonymous_();
            case 5:
                return SeasonalUserInfo._childSerializers$_anonymous_$0();
            case 6:
                return SeasonalUserInfo._childSerializers$_anonymous_$1();
            case 7:
                return wef.a;
            case 8:
                return new owc(1L);
            case 9:
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new qwc();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return SerializableDivinationState.Analysis._childSerializers$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return SerializableDivinationState.Analysis._childSerializers$_anonymous_$0();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return SerializableDivinationState.Analysis._childSerializers$_anonymous_$1();
            case 14:
                return SerializableDivinationState.CardsDecided._childSerializers$_anonymous_();
            case 15:
                return SerializableDivinationState.CardsExplanation._childSerializers$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return SerializableDivinationState.DrawnCardsAwaitingQuestion._init_$_anonymous_();
            case 17:
                return SerializableDivinationState.WaitConfirm._childSerializers$_anonymous_();
            case 18:
                return SerializableDivinationState.WaitQuestion._init_$_anonymous_();
            case 19:
                return SerializableMessage.CardChoices._childSerializers$_anonymous_();
            case 20:
                return SerializableMessage.ClarifyingCardDraw._childSerializers$_anonymous_();
            case 21:
                try {
                    return vpf.T(fyc.A(fyc.p(Arrays.asList(new jm9()).iterator())));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case 22:
                try {
                    return vpf.T(fyc.A(fyc.p(Arrays.asList(new q76(), new sbe()).iterator())));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            case 23:
                return new qh6(p4e.a, eva.a, 1);
            case 24:
                hs3 hs3Var = xqa.w;
                return Integer.valueOf(((Number) z5c.I(nu4Var, new z1d(hs3Var.a, hs3Var.b, null))).intValue());
            case 25:
                hs3 hs3Var2 = xqa.x;
                return Integer.valueOf(((Number) z5c.I(nu4Var, new f2d(hs3Var2.a, hs3Var2.b, null))).intValue());
            case 26:
                return new s5d(b5d.a, b5d.b, b5d.c, b5d.d, b5d.f);
            case 27:
                return new t5d();
            case 28:
                return null;
            default:
                return q1c.f(null);
        }
    }
}
