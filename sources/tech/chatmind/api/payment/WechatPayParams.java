package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.f2g;
import defpackage.g2g;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.syc;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b0\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b1\u0010\u001a¨\u00065"}, d2 = {"Ltech/chatmind/api/payment/WechatPayParams;", "", "", "nonceStr", "timeStamp", "packageValue", "paySign", "prepayId", "signType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/WechatPayParams;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/payment/WechatPayParams;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNonceStr", "getTimeStamp", "getPackageValue", "getPackageValue$annotations", "()V", "getPaySign", "getPrepayId", "getSignType", "Companion", "f2g", "g2g", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class WechatPayParams {
    public static final int $stable = 0;
    public static final g2g Companion = new g2g();
    private final String nonceStr;
    private final String packageValue;
    private final String paySign;
    private final String prepayId;
    private final String signType;
    private final String timeStamp;

    public WechatPayParams(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.nonceStr = str;
        this.timeStamp = str2;
        this.packageValue = str3;
        this.paySign = str4;
        this.prepayId = str5;
        this.signType = str6;
    }

    public static /* synthetic */ WechatPayParams copy$default(WechatPayParams wechatPayParams, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wechatPayParams.nonceStr;
        }
        if ((i & 2) != 0) {
            str2 = wechatPayParams.timeStamp;
        }
        if ((i & 4) != 0) {
            str3 = wechatPayParams.packageValue;
        }
        if ((i & 8) != 0) {
            str4 = wechatPayParams.paySign;
        }
        if ((i & 16) != 0) {
            str5 = wechatPayParams.prepayId;
        }
        if ((i & 32) != 0) {
            str6 = wechatPayParams.signType;
        }
        String str7 = str5;
        String str8 = str6;
        return wechatPayParams.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(WechatPayParams self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.nonceStr);
        output.w(serialDesc, 1, self.timeStamp);
        output.w(serialDesc, 2, self.packageValue);
        output.w(serialDesc, 3, self.paySign);
        output.w(serialDesc, 4, self.prepayId);
        output.w(serialDesc, 5, self.signType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNonceStr() {
        return this.nonceStr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPackageValue() {
        return this.packageValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaySign() {
        return this.paySign;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrepayId() {
        return this.prepayId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSignType() {
        return this.signType;
    }

    public final WechatPayParams copy(String nonceStr, String timeStamp, String packageValue, String paySign, String prepayId, String signType) {
        nonceStr.getClass();
        timeStamp.getClass();
        packageValue.getClass();
        paySign.getClass();
        prepayId.getClass();
        signType.getClass();
        return new WechatPayParams(nonceStr, timeStamp, packageValue, paySign, prepayId, signType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WechatPayParams)) {
            return false;
        }
        WechatPayParams wechatPayParams = (WechatPayParams) other;
        return pa7.t(this.nonceStr, wechatPayParams.nonceStr) && pa7.t(this.timeStamp, wechatPayParams.timeStamp) && pa7.t(this.packageValue, wechatPayParams.packageValue) && pa7.t(this.paySign, wechatPayParams.paySign) && pa7.t(this.prepayId, wechatPayParams.prepayId) && pa7.t(this.signType, wechatPayParams.signType);
    }

    public final String getNonceStr() {
        return this.nonceStr;
    }

    public final String getPackageValue() {
        return this.packageValue;
    }

    public final String getPaySign() {
        return this.paySign;
    }

    public final String getPrepayId() {
        return this.prepayId;
    }

    public final String getSignType() {
        return this.signType;
    }

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return this.signType.hashCode() + ub3.c(ub3.c(ub3.c(ub3.c(this.nonceStr.hashCode() * 31, 31, this.timeStamp), 31, this.packageValue), 31, this.paySign), 31, this.prepayId);
    }

    public String toString() {
        String str = this.nonceStr;
        String str2 = this.timeStamp;
        String str3 = this.packageValue;
        String str4 = this.paySign;
        String str5 = this.prepayId;
        String str6 = this.signType;
        StringBuilder sbO = ib8.o("WechatPayParams(nonceStr=", str, ", timeStamp=", str2, ", packageValue=");
        ub3.v(sbO, str3, ", paySign=", str4, ", prepayId=");
        return ks0.m(sbO, str5, ", signType=", str6, ")");
    }

    @syc("package")
    public static /* synthetic */ void getPackageValue$annotations() {
    }

    public /* synthetic */ WechatPayParams(int i, String str, String str2, String str3, String str4, String str5, String str6, xyc xycVar) {
        if (63 != (i & 63)) {
            an1.R(i, 63, f2g.a.e());
            throw null;
        }
        this.nonceStr = str;
        this.timeStamp = str2;
        this.packageValue = str3;
        this.paySign = str4;
        this.prepayId = str5;
        this.signType = str6;
    }
}
