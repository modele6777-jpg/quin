package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.by2;
import defpackage.cy2;
import defpackage.h2g;
import defpackage.ib8;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Ltech/chatmind/api/payment/CreateSubscriptionResponse;", "", "", "outTradeNo", "contractId", "Ltech/chatmind/api/payment/WechatPayParams2;", "payParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/payment/WechatPayParams2;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ltech/chatmind/api/payment/WechatPayParams2;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/CreateSubscriptionResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ltech/chatmind/api/payment/WechatPayParams2;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/payment/WechatPayParams2;)Ltech/chatmind/api/payment/CreateSubscriptionResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOutTradeNo", "getContractId", "Ltech/chatmind/api/payment/WechatPayParams2;", "getPayParams", "Companion", "by2", "cy2", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class CreateSubscriptionResponse {
    public static final int $stable = 0;
    public static final cy2 Companion = new cy2();
    private final String contractId;
    private final String outTradeNo;
    private final WechatPayParams2 payParams;

    public /* synthetic */ CreateSubscriptionResponse(int i, String str, String str2, WechatPayParams2 wechatPayParams2, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, by2.a.e());
            throw null;
        }
        this.outTradeNo = str;
        this.contractId = str2;
        this.payParams = wechatPayParams2;
    }

    public static /* synthetic */ CreateSubscriptionResponse copy$default(CreateSubscriptionResponse createSubscriptionResponse, String str, String str2, WechatPayParams2 wechatPayParams2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSubscriptionResponse.outTradeNo;
        }
        if ((i & 2) != 0) {
            str2 = createSubscriptionResponse.contractId;
        }
        if ((i & 4) != 0) {
            wechatPayParams2 = createSubscriptionResponse.payParams;
        }
        return createSubscriptionResponse.copy(str, str2, wechatPayParams2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(CreateSubscriptionResponse self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.outTradeNo);
        output.w(serialDesc, 1, self.contractId);
        output.p(serialDesc, 2, h2g.a, self.payParams);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOutTradeNo() {
        return this.outTradeNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContractId() {
        return this.contractId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WechatPayParams2 getPayParams() {
        return this.payParams;
    }

    public final CreateSubscriptionResponse copy(String outTradeNo, String contractId, WechatPayParams2 payParams) {
        outTradeNo.getClass();
        contractId.getClass();
        payParams.getClass();
        return new CreateSubscriptionResponse(outTradeNo, contractId, payParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateSubscriptionResponse)) {
            return false;
        }
        CreateSubscriptionResponse createSubscriptionResponse = (CreateSubscriptionResponse) other;
        return pa7.t(this.outTradeNo, createSubscriptionResponse.outTradeNo) && pa7.t(this.contractId, createSubscriptionResponse.contractId) && pa7.t(this.payParams, createSubscriptionResponse.payParams);
    }

    public final String getContractId() {
        return this.contractId;
    }

    public final String getOutTradeNo() {
        return this.outTradeNo;
    }

    public final WechatPayParams2 getPayParams() {
        return this.payParams;
    }

    public int hashCode() {
        return this.payParams.hashCode() + ub3.c(this.outTradeNo.hashCode() * 31, 31, this.contractId);
    }

    public String toString() {
        String str = this.outTradeNo;
        String str2 = this.contractId;
        WechatPayParams2 wechatPayParams2 = this.payParams;
        StringBuilder sbO = ib8.o("CreateSubscriptionResponse(outTradeNo=", str, ", contractId=", str2, ", payParams=");
        sbO.append(wechatPayParams2);
        sbO.append(")");
        return sbO.toString();
    }

    public CreateSubscriptionResponse(String str, String str2, WechatPayParams2 wechatPayParams2) {
        str.getClass();
        str2.getClass();
        wechatPayParams2.getClass();
        this.outTradeNo = str;
        this.contractId = str2;
        this.payParams = wechatPayParams2;
    }
}
