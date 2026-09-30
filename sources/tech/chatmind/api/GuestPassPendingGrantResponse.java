package tech.chatmind.api;

import defpackage.ag2;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.yf6;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Ltech/chatmind/api/GuestPassPendingGrantResponse;", "", "", "count", "", "plan", "reason", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/GuestPassPendingGrantResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/GuestPassPendingGrantResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCount", "Ljava/lang/String;", "getPlan", "getReason", "Companion", "xf6", "yf6", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class GuestPassPendingGrantResponse {
    public static final int $stable = 0;
    public static final yf6 Companion = new yf6();
    private final int count;
    private final String plan;
    private final String reason;

    public /* synthetic */ GuestPassPendingGrantResponse(int i, int i2, String str, String str2, xyc xycVar) {
        this.count = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.plan = null;
        } else {
            this.plan = str;
        }
        if ((i & 4) == 0) {
            this.reason = "";
        } else {
            this.reason = str2;
        }
    }

    public static /* synthetic */ GuestPassPendingGrantResponse copy$default(GuestPassPendingGrantResponse guestPassPendingGrantResponse, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = guestPassPendingGrantResponse.count;
        }
        if ((i2 & 2) != 0) {
            str = guestPassPendingGrantResponse.plan;
        }
        if ((i2 & 4) != 0) {
            str2 = guestPassPendingGrantResponse.reason;
        }
        return guestPassPendingGrantResponse.copy(i, str, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(GuestPassPendingGrantResponse self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.count != 0) {
            output.v(0, self.count, serialDesc);
        }
        if (output.g(serialDesc) || self.plan != null) {
            output.A(serialDesc, 1, p4e.a, self.plan);
        }
        if (!output.g(serialDesc) && pa7.t(self.reason, "")) {
            return;
        }
        output.w(serialDesc, 2, self.reason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final GuestPassPendingGrantResponse copy(int count, String plan, String reason) {
        reason.getClass();
        return new GuestPassPendingGrantResponse(count, plan, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuestPassPendingGrantResponse)) {
            return false;
        }
        GuestPassPendingGrantResponse guestPassPendingGrantResponse = (GuestPassPendingGrantResponse) other;
        return this.count == guestPassPendingGrantResponse.count && pa7.t(this.plan, guestPassPendingGrantResponse.plan) && pa7.t(this.reason, guestPassPendingGrantResponse.reason);
    }

    public final int getCount() {
        return this.count;
    }

    public final String getPlan() {
        return this.plan;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        String str = this.plan;
        return this.reason.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        int i = this.count;
        String str = this.plan;
        String str2 = this.reason;
        StringBuilder sb = new StringBuilder("GuestPassPendingGrantResponse(count=");
        sb.append(i);
        sb.append(", plan=");
        sb.append(str);
        sb.append(", reason=");
        return ks0.l(sb, str2, ")");
    }

    public GuestPassPendingGrantResponse() {
        this(0, (String) null, (String) null, 7, (rp3) null);
    }

    public GuestPassPendingGrantResponse(int i, String str, String str2) {
        str2.getClass();
        this.count = i;
        this.plan = str;
        this.reason = str2;
    }

    public /* synthetic */ GuestPassPendingGrantResponse(int i, String str, String str2, int i2, rp3 rp3Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? "" : str2);
    }
}
