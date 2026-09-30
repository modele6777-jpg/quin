package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.d2g;
import defpackage.e2g;
import defpackage.f2g;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Ltech/chatmind/api/payment/WechatPayData;", "", "", "outTradeNo", "Ltech/chatmind/api/payment/WechatPayParams;", "payParams", "<init>", "(Ljava/lang/String;Ltech/chatmind/api/payment/WechatPayParams;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ltech/chatmind/api/payment/WechatPayParams;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/WechatPayData;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ltech/chatmind/api/payment/WechatPayParams;", "copy", "(Ljava/lang/String;Ltech/chatmind/api/payment/WechatPayParams;)Ltech/chatmind/api/payment/WechatPayData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOutTradeNo", "Ltech/chatmind/api/payment/WechatPayParams;", "getPayParams", "Companion", "d2g", "e2g", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class WechatPayData {
    public static final int $stable = 0;
    public static final e2g Companion = new e2g();
    private final String outTradeNo;
    private final WechatPayParams payParams;

    public /* synthetic */ WechatPayData(int i, String str, WechatPayParams wechatPayParams, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, d2g.a.e());
            throw null;
        }
        this.outTradeNo = str;
        this.payParams = wechatPayParams;
    }

    public static /* synthetic */ WechatPayData copy$default(WechatPayData wechatPayData, String str, WechatPayParams wechatPayParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wechatPayData.outTradeNo;
        }
        if ((i & 2) != 0) {
            wechatPayParams = wechatPayData.payParams;
        }
        return wechatPayData.copy(str, wechatPayParams);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(WechatPayData self, ag2 output, nyc serialDesc) {
        output.A(serialDesc, 0, p4e.a, self.outTradeNo);
        output.A(serialDesc, 1, f2g.a, self.payParams);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOutTradeNo() {
        return this.outTradeNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WechatPayParams getPayParams() {
        return this.payParams;
    }

    public final WechatPayData copy(String outTradeNo, WechatPayParams payParams) {
        return new WechatPayData(outTradeNo, payParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WechatPayData)) {
            return false;
        }
        WechatPayData wechatPayData = (WechatPayData) other;
        return pa7.t(this.outTradeNo, wechatPayData.outTradeNo) && pa7.t(this.payParams, wechatPayData.payParams);
    }

    public final String getOutTradeNo() {
        return this.outTradeNo;
    }

    public final WechatPayParams getPayParams() {
        return this.payParams;
    }

    public int hashCode() {
        String str = this.outTradeNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        WechatPayParams wechatPayParams = this.payParams;
        return iHashCode + (wechatPayParams != null ? wechatPayParams.hashCode() : 0);
    }

    public String toString() {
        return "WechatPayData(outTradeNo=" + this.outTradeNo + ", payParams=" + this.payParams + ")";
    }

    public WechatPayData(String str, WechatPayParams wechatPayParams) {
        this.outTradeNo = str;
        this.payParams = wechatPayParams;
    }
}
