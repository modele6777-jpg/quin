package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.o58;
import defpackage.p4e;
import defpackage.p58;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u001a¨\u00064"}, d2 = {"Ltech/chatmind/api/LimitedQuota;", "", "", "category", "", "totalCount", "usedCount", "expiredAt", "productName", "orderId", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/LimitedQuota;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/LimitedQuota;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCategory", "I", "getTotalCount", "getUsedCount", "getExpiredAt", "getProductName", "getOrderId", "Companion", "p58", "o58", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class LimitedQuota {
    public static final int $stable = 0;
    public static final String CATEGORY_TIME_MEMBERSHIP = "v4-time-membership";
    public static final p58 Companion = new p58();
    private final String category;
    private final String expiredAt;
    private final String orderId;
    private final String productName;
    private final int totalCount;
    private final int usedCount;

    public /* synthetic */ LimitedQuota(int i, String str, int i2, int i3, String str2, String str3, String str4, xyc xycVar) {
        if (31 != (i & 31)) {
            an1.R(i, 31, o58.a.e());
            throw null;
        }
        this.category = str;
        this.totalCount = i2;
        this.usedCount = i3;
        this.expiredAt = str2;
        this.productName = str3;
        if ((i & 32) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str4;
        }
    }

    public static /* synthetic */ LimitedQuota copy$default(LimitedQuota limitedQuota, String str, int i, int i2, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = limitedQuota.category;
        }
        if ((i3 & 2) != 0) {
            i = limitedQuota.totalCount;
        }
        if ((i3 & 4) != 0) {
            i2 = limitedQuota.usedCount;
        }
        if ((i3 & 8) != 0) {
            str2 = limitedQuota.expiredAt;
        }
        if ((i3 & 16) != 0) {
            str3 = limitedQuota.productName;
        }
        if ((i3 & 32) != 0) {
            str4 = limitedQuota.orderId;
        }
        String str5 = str3;
        String str6 = str4;
        return limitedQuota.copy(str, i, i2, str2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(LimitedQuota self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.category);
        output.v(1, self.totalCount, serialDesc);
        output.v(2, self.usedCount, serialDesc);
        p4e p4eVar = p4e.a;
        output.A(serialDesc, 3, p4eVar, self.expiredAt);
        output.w(serialDesc, 4, self.productName);
        if (!output.g(serialDesc) && self.orderId == null) {
            return;
        }
        output.A(serialDesc, 5, p4eVar, self.orderId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUsedCount() {
        return this.usedCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpiredAt() {
        return this.expiredAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final LimitedQuota copy(String category, int totalCount, int usedCount, String expiredAt, String productName, String orderId) {
        category.getClass();
        productName.getClass();
        return new LimitedQuota(category, totalCount, usedCount, expiredAt, productName, orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitedQuota)) {
            return false;
        }
        LimitedQuota limitedQuota = (LimitedQuota) other;
        return pa7.t(this.category, limitedQuota.category) && this.totalCount == limitedQuota.totalCount && this.usedCount == limitedQuota.usedCount && pa7.t(this.expiredAt, limitedQuota.expiredAt) && pa7.t(this.productName, limitedQuota.productName) && pa7.t(this.orderId, limitedQuota.orderId);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getExpiredAt() {
        return this.expiredAt;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getUsedCount() {
        return this.usedCount;
    }

    public int hashCode() {
        int iB = ub3.b(this.usedCount, ub3.b(this.totalCount, this.category.hashCode() * 31, 31), 31);
        String str = this.expiredAt;
        int iC = ub3.c((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.productName);
        String str2 = this.orderId;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.category;
        int i = this.totalCount;
        int i2 = this.usedCount;
        String str2 = this.expiredAt;
        String str3 = this.productName;
        String str4 = this.orderId;
        StringBuilder sbP = ks0.p("LimitedQuota(category=", str, ", totalCount=", i, ", usedCount=");
        sbP.append(i2);
        sbP.append(", expiredAt=");
        sbP.append(str2);
        sbP.append(", productName=");
        return ks0.m(sbP, str3, ", orderId=", str4, ")");
    }

    public LimitedQuota(String str, int i, int i2, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.category = str;
        this.totalCount = i;
        this.usedCount = i2;
        this.expiredAt = str2;
        this.productName = str3;
        this.orderId = str4;
    }

    public /* synthetic */ LimitedQuota(String str, int i, int i2, String str2, String str3, String str4, int i3, rp3 rp3Var) {
        this(str, i, i2, str2, str3, (i3 & 32) != 0 ? null : str4);
    }
}
