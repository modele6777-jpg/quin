package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.d2g;
import defpackage.l2g;
import defpackage.m2g;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J8\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010 ¨\u00063"}, d2 = {"Ltech/chatmind/api/payment/WechatPayResponse;", "", "", "errorCode", "", "success", "", "errorMessage", "Ltech/chatmind/api/payment/WechatPayData;", "data", "<init>", "(IZLjava/lang/String;Ltech/chatmind/api/payment/WechatPayData;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IIZLjava/lang/String;Ltech/chatmind/api/payment/WechatPayData;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/WechatPayResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()I", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "()Ltech/chatmind/api/payment/WechatPayData;", "copy", "(IZLjava/lang/String;Ltech/chatmind/api/payment/WechatPayData;)Ltech/chatmind/api/payment/WechatPayResponse;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getErrorCode", "Z", "getSuccess", "Ljava/lang/String;", "getErrorMessage", "Ltech/chatmind/api/payment/WechatPayData;", "getData", "Companion", "l2g", "m2g", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class WechatPayResponse {
    public static final int $stable = 0;
    public static final m2g Companion = new m2g();
    private final WechatPayData data;
    private final int errorCode;
    private final String errorMessage;
    private final boolean success;

    public /* synthetic */ WechatPayResponse(int i, int i2, boolean z, String str, WechatPayData wechatPayData, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, l2g.a.e());
            throw null;
        }
        this.errorCode = i2;
        this.success = z;
        this.errorMessage = str;
        this.data = wechatPayData;
    }

    public static /* synthetic */ WechatPayResponse copy$default(WechatPayResponse wechatPayResponse, int i, boolean z, String str, WechatPayData wechatPayData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wechatPayResponse.errorCode;
        }
        if ((i2 & 2) != 0) {
            z = wechatPayResponse.success;
        }
        if ((i2 & 4) != 0) {
            str = wechatPayResponse.errorMessage;
        }
        if ((i2 & 8) != 0) {
            wechatPayData = wechatPayResponse.data;
        }
        return wechatPayResponse.copy(i, z, str, wechatPayData);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(WechatPayResponse self, ag2 output, nyc serialDesc) {
        output.v(0, self.errorCode, serialDesc);
        output.o(serialDesc, 1, self.success);
        output.w(serialDesc, 2, self.errorMessage);
        output.p(serialDesc, 3, d2g.a, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WechatPayData getData() {
        return this.data;
    }

    public final WechatPayResponse copy(int errorCode, boolean success, String errorMessage, WechatPayData data) {
        errorMessage.getClass();
        data.getClass();
        return new WechatPayResponse(errorCode, success, errorMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WechatPayResponse)) {
            return false;
        }
        WechatPayResponse wechatPayResponse = (WechatPayResponse) other;
        return this.errorCode == wechatPayResponse.errorCode && this.success == wechatPayResponse.success && pa7.t(this.errorMessage, wechatPayResponse.errorMessage) && pa7.t(this.data, wechatPayResponse.data);
    }

    public final WechatPayData getData() {
        return this.data;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.data.hashCode() + ub3.c(ub3.d(Integer.hashCode(this.errorCode) * 31, 31, this.success), 31, this.errorMessage);
    }

    public String toString() {
        return "WechatPayResponse(errorCode=" + this.errorCode + ", success=" + this.success + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ")";
    }

    public WechatPayResponse(int i, boolean z, String str, WechatPayData wechatPayData) {
        str.getClass();
        wechatPayData.getClass();
        this.errorCode = i;
        this.success = z;
        this.errorMessage = str;
        this.data = wechatPayData;
    }
}
