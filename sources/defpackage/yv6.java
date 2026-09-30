package defpackage;

import ai.askquin.ui.persistence.database.InterruptedDrawing;
import android.os.Build;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.message.model.InAppMessage;
import tech.chatmind.api.message.model.InAppMessageIntensity;
import tech.chatmind.api.message.model.InAppMessageList;
import tech.chatmind.api.message.model.InAppMessageType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yv6 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ yv6(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                js3 js3Var = ga4.a;
                return mk8.a.f;
            case 1:
                return (gib) drf.a.getValue();
            case 2:
                return InAppMessage._childSerializers$_anonymous_();
            case 3:
                return InAppMessage._childSerializers$_anonymous_$0();
            case 4:
                return InAppMessage._childSerializers$_anonymous_$1();
            case 5:
                return InAppMessageIntensity._init_$_anonymous_();
            case 6:
                return InAppMessageList._childSerializers$_anonymous_();
            case 7:
                return InAppMessageType._init_$_anonymous_();
            case 8:
                pr4 pr4Var = o17.a;
                return wp3.a;
            case 9:
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new yi4(48.0f);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return InterruptedDrawing._childSerializers$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return InterruptedDrawing._childSerializers$_anonymous_$0();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return InterruptedDrawing._childSerializers$_anonymous_$1();
            case 14:
            case 15:
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return bj7.b;
            case 17:
                return ri7.b;
            case 18:
                return zh7.b;
            case 19:
                return wi7.b;
            case 20:
                return ah7.b;
            case 21:
                return Boolean.valueOf(Build.BRAND.equals(Constants.REFERRER_API_GOOGLE));
            case 22:
                throw new IllegalStateException("should not be used in favor of LocalKoinScopeContext");
            case 23:
                throw new IllegalStateException("should not be used in favor of getKoin()");
            case 24:
                hr7 hr7Var = af8.Z;
                if (hr7Var != null) {
                    return new le2((nfc) hr7Var.c.e, new yv6(28));
                }
                qc0.p("KoinApplication has not been started");
                return null;
            case 25:
                hr7 hr7Var2 = af8.Z;
                if (hr7Var2 != null) {
                    return new le2(hr7Var2, new yv6(29));
                }
                qc0.p("KoinApplication has not been started");
                return null;
            case 26:
                hr7 hr7Var3 = af8.Z;
                if (hr7Var3 != null) {
                    return hr7Var3;
                }
                qc0.p("KoinApplication has not been started");
                return null;
            case 27:
                hr7 hr7Var4 = af8.Z;
                if (hr7Var4 != null) {
                    return (nfc) hr7Var4.c.e;
                }
                qc0.p("KoinApplication has not been started");
                return null;
            case 28:
                hr7 hr7Var5 = af8.Z;
                if (hr7Var5 != null) {
                    return (nfc) hr7Var5.c.e;
                }
                qc0.p("KoinApplication has not been started");
                return null;
            default:
                hr7 hr7Var6 = af8.Z;
                if (hr7Var6 != null) {
                    return hr7Var6;
                }
                qc0.p("KoinApplication has not been started");
                return null;
        }
    }
}
