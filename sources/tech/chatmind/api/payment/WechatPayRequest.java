package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ib8;
import defpackage.j2g;
import defpackage.k2g;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Ltech/chatmind/api/payment/WechatPayRequest;", "", "", "uid", "planKey", "platform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/WechatPayRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/payment/WechatPayRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUid", "getPlanKey", "getPlatform", "Companion", "j2g", "k2g", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class WechatPayRequest {
    public static final int $stable = 0;
    public static final k2g Companion = new k2g();
    private final String planKey;
    private final String platform;
    private final String uid;

    public /* synthetic */ WechatPayRequest(int i, String str, String str2, String str3, xyc xycVar) {
        if (2 != (i & 2)) {
            an1.R(i, 2, j2g.a.e());
            throw null;
        }
        if ((i & 1) == 0) {
            this.uid = null;
        } else {
            this.uid = str;
        }
        this.planKey = str2;
        if ((i & 4) == 0) {
            this.platform = "APP";
        } else {
            this.platform = str3;
        }
    }

    public static /* synthetic */ WechatPayRequest copy$default(WechatPayRequest wechatPayRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wechatPayRequest.uid;
        }
        if ((i & 2) != 0) {
            str2 = wechatPayRequest.planKey;
        }
        if ((i & 4) != 0) {
            str3 = wechatPayRequest.platform;
        }
        return wechatPayRequest.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(WechatPayRequest self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.uid != null) {
            output.A(serialDesc, 0, p4e.a, self.uid);
        }
        output.w(serialDesc, 1, self.planKey);
        if (!output.g(serialDesc) && pa7.t(self.platform, "APP")) {
            return;
        }
        output.w(serialDesc, 2, self.platform);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlanKey() {
        return this.planKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public final WechatPayRequest copy(String uid, String planKey, String platform) {
        planKey.getClass();
        platform.getClass();
        return new WechatPayRequest(uid, planKey, platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WechatPayRequest)) {
            return false;
        }
        WechatPayRequest wechatPayRequest = (WechatPayRequest) other;
        return pa7.t(this.uid, wechatPayRequest.uid) && pa7.t(this.planKey, wechatPayRequest.planKey) && pa7.t(this.platform, wechatPayRequest.platform);
    }

    public final String getPlanKey() {
        return this.planKey;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        return this.platform.hashCode() + ub3.c((str == null ? 0 : str.hashCode()) * 31, 31, this.planKey);
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.planKey;
        return ks0.l(ib8.o("WechatPayRequest(uid=", str, ", planKey=", str2, ", platform="), this.platform, ")");
    }

    public WechatPayRequest(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.uid = str;
        this.planKey = str2;
        this.platform = str3;
    }

    public /* synthetic */ WechatPayRequest(String str, String str2, String str3, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? "APP" : str3);
    }
}
