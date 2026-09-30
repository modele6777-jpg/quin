package tech.chatmind.api;

import defpackage.ag2;
import defpackage.ib8;
import defpackage.m12;
import defpackage.nyc;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0018¨\u00060"}, d2 = {"Ltech/chatmind/api/ClaimReadingsResponse;", "", "", "total", "claimedCount", "skippedCount", "notFoundCount", "failedCount", "<init>", "(IIIII)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IIIIIILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/ClaimReadingsResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "component5", "copy", "(IIIII)Ltech/chatmind/api/ClaimReadingsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTotal", "getClaimedCount", "getSkippedCount", "getNotFoundCount", "getFailedCount", "Companion", "l12", "m12", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ClaimReadingsResponse {
    public static final int $stable = 0;
    public static final m12 Companion = new m12();
    private final int claimedCount;
    private final int failedCount;
    private final int notFoundCount;
    private final int skippedCount;
    private final int total;

    public /* synthetic */ ClaimReadingsResponse(int i, int i2, int i3, int i4, int i5, int i6, xyc xycVar) {
        if ((i & 1) == 0) {
            this.total = 0;
        } else {
            this.total = i2;
        }
        if ((i & 2) == 0) {
            this.claimedCount = 0;
        } else {
            this.claimedCount = i3;
        }
        if ((i & 4) == 0) {
            this.skippedCount = 0;
        } else {
            this.skippedCount = i4;
        }
        if ((i & 8) == 0) {
            this.notFoundCount = 0;
        } else {
            this.notFoundCount = i5;
        }
        if ((i & 16) == 0) {
            this.failedCount = 0;
        } else {
            this.failedCount = i6;
        }
    }

    public static /* synthetic */ ClaimReadingsResponse copy$default(ClaimReadingsResponse claimReadingsResponse, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = claimReadingsResponse.total;
        }
        if ((i6 & 2) != 0) {
            i2 = claimReadingsResponse.claimedCount;
        }
        if ((i6 & 4) != 0) {
            i3 = claimReadingsResponse.skippedCount;
        }
        if ((i6 & 8) != 0) {
            i4 = claimReadingsResponse.notFoundCount;
        }
        if ((i6 & 16) != 0) {
            i5 = claimReadingsResponse.failedCount;
        }
        int i7 = i5;
        int i8 = i3;
        return claimReadingsResponse.copy(i, i2, i8, i4, i7);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(ClaimReadingsResponse self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.total != 0) {
            output.v(0, self.total, serialDesc);
        }
        if (output.g(serialDesc) || self.claimedCount != 0) {
            output.v(1, self.claimedCount, serialDesc);
        }
        if (output.g(serialDesc) || self.skippedCount != 0) {
            output.v(2, self.skippedCount, serialDesc);
        }
        if (output.g(serialDesc) || self.notFoundCount != 0) {
            output.v(3, self.notFoundCount, serialDesc);
        }
        if (!output.g(serialDesc) && self.failedCount == 0) {
            return;
        }
        output.v(4, self.failedCount, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getClaimedCount() {
        return this.claimedCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSkippedCount() {
        return this.skippedCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getNotFoundCount() {
        return this.notFoundCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFailedCount() {
        return this.failedCount;
    }

    public final ClaimReadingsResponse copy(int total, int claimedCount, int skippedCount, int notFoundCount, int failedCount) {
        return new ClaimReadingsResponse(total, claimedCount, skippedCount, notFoundCount, failedCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaimReadingsResponse)) {
            return false;
        }
        ClaimReadingsResponse claimReadingsResponse = (ClaimReadingsResponse) other;
        return this.total == claimReadingsResponse.total && this.claimedCount == claimReadingsResponse.claimedCount && this.skippedCount == claimReadingsResponse.skippedCount && this.notFoundCount == claimReadingsResponse.notFoundCount && this.failedCount == claimReadingsResponse.failedCount;
    }

    public final int getClaimedCount() {
        return this.claimedCount;
    }

    public final int getFailedCount() {
        return this.failedCount;
    }

    public final int getNotFoundCount() {
        return this.notFoundCount;
    }

    public final int getSkippedCount() {
        return this.skippedCount;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Integer.hashCode(this.failedCount) + ub3.b(this.notFoundCount, ub3.b(this.skippedCount, ub3.b(this.claimedCount, Integer.hashCode(this.total) * 31, 31), 31), 31);
    }

    public String toString() {
        int i = this.total;
        int i2 = this.claimedCount;
        int i3 = this.skippedCount;
        int i4 = this.notFoundCount;
        int i5 = this.failedCount;
        StringBuilder sbN = ib8.n(i, i2, "ClaimReadingsResponse(total=", ", claimedCount=", ", skippedCount=");
        ub3.u(sbN, i3, ", notFoundCount=", i4, ", failedCount=");
        return tec.g(i5, ")", sbN);
    }

    public ClaimReadingsResponse(int i, int i2, int i3, int i4, int i5) {
        this.total = i;
        this.claimedCount = i2;
        this.skippedCount = i3;
        this.notFoundCount = i4;
        this.failedCount = i5;
    }

    public ClaimReadingsResponse() {
        this(0, 0, 0, 0, 0, 31, (rp3) null);
    }

    public /* synthetic */ ClaimReadingsResponse(int i, int i2, int i3, int i4, int i5, int i6, rp3 rp3Var) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
