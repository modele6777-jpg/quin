package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.h2g;
import defpackage.i2g;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b0\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b1\u0010\u001a¨\u00065"}, d2 = {"Ltech/chatmind/api/payment/WechatPayParams2;", "", "", "noncestr", "timestamp", "packageValue", "sign", "prepayid", "signType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/WechatPayParams2;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/payment/WechatPayParams2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNoncestr", "getTimestamp", "getPackageValue", "getPackageValue$annotations", "()V", "getSign", "getPrepayid", "getSignType", "Companion", "h2g", "i2g", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class WechatPayParams2 {
    public static final int $stable = 0;
    public static final i2g Companion = new i2g();
    private final String noncestr;
    private final String packageValue;
    private final String prepayid;
    private final String sign;
    private final String signType;
    private final String timestamp;

    public WechatPayParams2(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.noncestr = str;
        this.timestamp = str2;
        this.packageValue = str3;
        this.sign = str4;
        this.prepayid = str5;
        this.signType = str6;
    }

    public static /* synthetic */ WechatPayParams2 copy$default(WechatPayParams2 wechatPayParams2, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wechatPayParams2.noncestr;
        }
        if ((i & 2) != 0) {
            str2 = wechatPayParams2.timestamp;
        }
        if ((i & 4) != 0) {
            str3 = wechatPayParams2.packageValue;
        }
        if ((i & 8) != 0) {
            str4 = wechatPayParams2.sign;
        }
        if ((i & 16) != 0) {
            str5 = wechatPayParams2.prepayid;
        }
        if ((i & 32) != 0) {
            str6 = wechatPayParams2.signType;
        }
        String str7 = str5;
        String str8 = str6;
        return wechatPayParams2.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(WechatPayParams2 self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.noncestr);
        output.w(serialDesc, 1, self.timestamp);
        output.w(serialDesc, 2, self.packageValue);
        output.w(serialDesc, 3, self.sign);
        output.w(serialDesc, 4, self.prepayid);
        output.w(serialDesc, 5, self.signType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNoncestr() {
        return this.noncestr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPackageValue() {
        return this.packageValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrepayid() {
        return this.prepayid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSignType() {
        return this.signType;
    }

    public final WechatPayParams2 copy(String noncestr, String timestamp, String packageValue, String sign, String prepayid, String signType) {
        noncestr.getClass();
        timestamp.getClass();
        packageValue.getClass();
        sign.getClass();
        prepayid.getClass();
        signType.getClass();
        return new WechatPayParams2(noncestr, timestamp, packageValue, sign, prepayid, signType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WechatPayParams2)) {
            return false;
        }
        WechatPayParams2 wechatPayParams2 = (WechatPayParams2) other;
        return pa7.t(this.noncestr, wechatPayParams2.noncestr) && pa7.t(this.timestamp, wechatPayParams2.timestamp) && pa7.t(this.packageValue, wechatPayParams2.packageValue) && pa7.t(this.sign, wechatPayParams2.sign) && pa7.t(this.prepayid, wechatPayParams2.prepayid) && pa7.t(this.signType, wechatPayParams2.signType);
    }

    public final String getNoncestr() {
        return this.noncestr;
    }

    public final String getPackageValue() {
        return this.packageValue;
    }

    public final String getPrepayid() {
        return this.prepayid;
    }

    public final String getSign() {
        return this.sign;
    }

    public final String getSignType() {
        return this.signType;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.signType.hashCode() + ub3.c(ub3.c(ub3.c(ub3.c(this.noncestr.hashCode() * 31, 31, this.timestamp), 31, this.packageValue), 31, this.sign), 31, this.prepayid);
    }

    public String toString() {
        String str = this.noncestr;
        String str2 = this.timestamp;
        String str3 = this.packageValue;
        String str4 = this.sign;
        String str5 = this.prepayid;
        String str6 = this.signType;
        StringBuilder sbO = ib8.o("WechatPayParams2(noncestr=", str, ", timestamp=", str2, ", packageValue=");
        ub3.v(sbO, str3, ", sign=", str4, ", prepayid=");
        return ks0.m(sbO, str5, ", signType=", str6, ")");
    }

    @syc("package")
    public static /* synthetic */ void getPackageValue$annotations() {
    }

    public /* synthetic */ WechatPayParams2(int i, String str, String str2, String str3, String str4, String str5, String str6, xyc xycVar) {
        if (63 != (i & 63)) {
            an1.R(i, 63, h2g.a.e());
            throw null;
        }
        this.noncestr = str;
        this.timestamp = str2;
        this.packageValue = str3;
        this.sign = str4;
        this.prepayid = str5;
        this.signType = str6;
    }
}
