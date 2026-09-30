package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.AppSettings;
import tech.chatmind.api.DeviceTokenRequest;
import tech.chatmind.api.PopupData;
import tech.chatmind.api.PopupRequest;
import tech.chatmind.api.UserInfo;
import tech.chatmind.api.account.model.CsrfResponse;
import tech.chatmind.api.account.model.SendCodeResponse;
import tech.chatmind.api.account.model.SignResponse;
import tech.chatmind.api.account.model.SignWithEmailRequestBody;
import tech.chatmind.api.account.model.SignWithGoogleRequestBody;
import tech.chatmind.api.account.model.SignWithOneLoginRequestBody;
import tech.chatmind.api.account.model.SignWithPhoneRequestBody;
import tech.chatmind.api.account.model.SignWithWeChatRequestBody;
import tech.chatmind.api.payment.PaywallSkusEnvelope;
import tech.chatmind.api.server.NullableServerResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0004J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010$J \u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b'\u0010\u000fJ*\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010(\u001a\u00020\u000bH§@¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020&H§@¢\u0006\u0004\b+\u0010\u0004J\u001a\u0010.\u001a\u00020&2\b\b\u0001\u0010-\u001a\u00020,H§@¢\u0006\u0004\b.\u0010/J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020100H§@¢\u0006\u0004\b2\u0010\u0004J\u0010\u00104\u001a\u000203H§@¢\u0006\u0004\b4\u0010\u0004J\"\u00107\u001a\b\u0012\u0004\u0012\u0002060%2\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b7\u0010\u000f¨\u00068À\u0006\u0003"}, d2 = {"Ld56;", "", "Ltech/chatmind/api/UserInfo;", "e", "(Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/PopupRequest;", "request", "Ltech/chatmind/api/server/NullableServerResponse;", "Ltech/chatmind/api/PopupData;", "c", "(Ltech/chatmind/api/PopupRequest;Lxn2;)Ljava/lang/Object;", "", "phone", "Ltech/chatmind/api/account/model/SendCodeResponse;", "j", "(Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "email", "l", "Ltech/chatmind/api/account/model/CsrfResponse;", "q", "Ltech/chatmind/api/account/model/SignWithPhoneRequestBody;", "body", "Ltech/chatmind/api/account/model/SignResponse;", "b", "(Ltech/chatmind/api/account/model/SignWithPhoneRequestBody;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/account/model/SignWithEmailRequestBody;", "i", "(Ltech/chatmind/api/account/model/SignWithEmailRequestBody;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/account/model/SignWithGoogleRequestBody;", "m", "(Ltech/chatmind/api/account/model/SignWithGoogleRequestBody;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/account/model/SignWithWeChatRequestBody;", "a", "(Ltech/chatmind/api/account/model/SignWithWeChatRequestBody;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/account/model/SignWithOneLoginRequestBody;", "n", "(Ltech/chatmind/api/account/model/SignWithOneLoginRequestBody;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/server/ServerResponse;", "Lwef;", "f", "code", "d", "(Ljava/lang/String;Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "p", "Ltech/chatmind/api/DeviceTokenRequest;", "deviceId", "o", "(Ltech/chatmind/api/DeviceTokenRequest;Lxn2;)Ljava/lang/Object;", "Lqyb;", "Lvyb;", "h", "Ltech/chatmind/api/AppSettings;", "k", "scene", "Ltech/chatmind/api/payment/PaywallSkusEnvelope;", "g", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface d56 {
    @iw9("/api/auth/callback/wechat")
    Object a(@w01 SignWithWeChatRequestBody signWithWeChatRequestBody, xn2<? super SignResponse> xn2Var);

    @iw9("/api/auth/callback/phone")
    Object b(@w01 SignWithPhoneRequestBody signWithPhoneRequestBody, xn2<? super SignResponse> xn2Var);

    @iw9("/api/check-popup")
    Object c(@w01 PopupRequest popupRequest, xn2<? super NullableServerResponse<PopupData>> xn2Var);

    @iw9("/api/user/bind-phone")
    @pr5
    Object d(@qc5("phone") String str, @qc5("code") String str2, xn2<? super ServerResponse<wef>> xn2Var);

    @y36("/api/auth/session")
    Object e(xn2<? super UserInfo> xn2Var);

    @iw9("/api/user/check-bind-phone")
    @pr5
    Object f(@qc5("phone") String str, xn2<? super ServerResponse<wef>> xn2Var);

    @y36("/api/payment/paywall-skus")
    Object g(@a4b("scene") String str, xn2<? super ServerResponse<PaywallSkusEnvelope>> xn2Var);

    @iw9("/api/auth/signout")
    Object h(xn2<? super qyb<vyb>> xn2Var);

    @iw9("/api/auth/callback/email")
    Object i(@w01 SignWithEmailRequestBody signWithEmailRequestBody, xn2<? super SignResponse> xn2Var);

    @iw9("/api/auth/send-sms-code")
    @pr5
    Object j(@qc5("phone") String str, xn2<? super NullableServerResponse<SendCodeResponse>> xn2Var);

    @y36("/api/settings/query")
    Object k(xn2<? super AppSettings> xn2Var);

    @iw9("/api/auth/send-email-code")
    @pr5
    Object l(@qc5("email") String str, xn2<? super NullableServerResponse<SendCodeResponse>> xn2Var);

    @iw9("/api/auth/callback/google-sdk")
    Object m(@w01 SignWithGoogleRequestBody signWithGoogleRequestBody, xn2<? super SignResponse> xn2Var);

    @iw9("/api/auth/callback/phone-one-tap")
    Object n(@w01 SignWithOneLoginRequestBody signWithOneLoginRequestBody, xn2<? super SignResponse> xn2Var);

    @iw9("api/user/device-token")
    Object o(@w01 DeviceTokenRequest deviceTokenRequest, xn2<? super wef> xn2Var);

    @iw9("/api/user/compensate-v4")
    Object p(xn2<? super wef> xn2Var);

    @y36("/api/auth/csrf")
    Object q(xn2<? super CsrfResponse> xn2Var);
}
