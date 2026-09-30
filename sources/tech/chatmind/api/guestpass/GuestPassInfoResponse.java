package tech.chatmind.api.guestpass;

import defpackage.ag2;
import defpackage.ib8;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.uf6;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bBO\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001dJL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b/\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b0\u0010\u001d¨\u00064"}, d2 = {"Ltech/chatmind/api/guestpass/GuestPassInfoResponse;", "", "", "code", "shareUrl", "", "remaining", "totalGranted", "creditsPerPass", "validDays", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIII)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IIIILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/guestpass/GuestPassInfoResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;IIII)Ltech/chatmind/api/guestpass/GuestPassInfoResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getShareUrl", "I", "getRemaining", "getTotalGranted", "getCreditsPerPass", "getValidDays", "Companion", "tf6", "uf6", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class GuestPassInfoResponse {
    public static final int $stable = 0;
    public static final uf6 Companion = new uf6();
    private final String code;
    private final int creditsPerPass;
    private final int remaining;
    private final String shareUrl;
    private final int totalGranted;
    private final int validDays;

    public /* synthetic */ GuestPassInfoResponse(int i, String str, String str2, int i2, int i3, int i4, int i5, xyc xycVar) {
        if ((i & 1) == 0) {
            this.code = "";
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.shareUrl = "";
        } else {
            this.shareUrl = str2;
        }
        if ((i & 4) == 0) {
            this.remaining = 0;
        } else {
            this.remaining = i2;
        }
        if ((i & 8) == 0) {
            this.totalGranted = 0;
        } else {
            this.totalGranted = i3;
        }
        if ((i & 16) == 0) {
            this.creditsPerPass = 0;
        } else {
            this.creditsPerPass = i4;
        }
        if ((i & 32) == 0) {
            this.validDays = 0;
        } else {
            this.validDays = i5;
        }
    }

    public static /* synthetic */ GuestPassInfoResponse copy$default(GuestPassInfoResponse guestPassInfoResponse, String str, String str2, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = guestPassInfoResponse.code;
        }
        if ((i5 & 2) != 0) {
            str2 = guestPassInfoResponse.shareUrl;
        }
        if ((i5 & 4) != 0) {
            i = guestPassInfoResponse.remaining;
        }
        if ((i5 & 8) != 0) {
            i2 = guestPassInfoResponse.totalGranted;
        }
        if ((i5 & 16) != 0) {
            i3 = guestPassInfoResponse.creditsPerPass;
        }
        if ((i5 & 32) != 0) {
            i4 = guestPassInfoResponse.validDays;
        }
        int i6 = i3;
        int i7 = i4;
        return guestPassInfoResponse.copy(str, str2, i, i2, i6, i7);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(GuestPassInfoResponse self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || !pa7.t(self.code, "")) {
            output.w(serialDesc, 0, self.code);
        }
        if (output.g(serialDesc) || !pa7.t(self.shareUrl, "")) {
            output.w(serialDesc, 1, self.shareUrl);
        }
        if (output.g(serialDesc) || self.remaining != 0) {
            output.v(2, self.remaining, serialDesc);
        }
        if (output.g(serialDesc) || self.totalGranted != 0) {
            output.v(3, self.totalGranted, serialDesc);
        }
        if (output.g(serialDesc) || self.creditsPerPass != 0) {
            output.v(4, self.creditsPerPass, serialDesc);
        }
        if (!output.g(serialDesc) && self.validDays == 0) {
            return;
        }
        output.v(5, self.validDays, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRemaining() {
        return this.remaining;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalGranted() {
        return this.totalGranted;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCreditsPerPass() {
        return this.creditsPerPass;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getValidDays() {
        return this.validDays;
    }

    public final GuestPassInfoResponse copy(String code, String shareUrl, int remaining, int totalGranted, int creditsPerPass, int validDays) {
        code.getClass();
        shareUrl.getClass();
        return new GuestPassInfoResponse(code, shareUrl, remaining, totalGranted, creditsPerPass, validDays);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuestPassInfoResponse)) {
            return false;
        }
        GuestPassInfoResponse guestPassInfoResponse = (GuestPassInfoResponse) other;
        return pa7.t(this.code, guestPassInfoResponse.code) && pa7.t(this.shareUrl, guestPassInfoResponse.shareUrl) && this.remaining == guestPassInfoResponse.remaining && this.totalGranted == guestPassInfoResponse.totalGranted && this.creditsPerPass == guestPassInfoResponse.creditsPerPass && this.validDays == guestPassInfoResponse.validDays;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getCreditsPerPass() {
        return this.creditsPerPass;
    }

    public final int getRemaining() {
        return this.remaining;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final int getTotalGranted() {
        return this.totalGranted;
    }

    public final int getValidDays() {
        return this.validDays;
    }

    public int hashCode() {
        return Integer.hashCode(this.validDays) + ub3.b(this.creditsPerPass, ub3.b(this.totalGranted, ub3.b(this.remaining, ub3.c(this.code.hashCode() * 31, 31, this.shareUrl), 31), 31), 31);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.shareUrl;
        int i = this.remaining;
        int i2 = this.totalGranted;
        int i3 = this.creditsPerPass;
        int i4 = this.validDays;
        StringBuilder sbO = ib8.o("GuestPassInfoResponse(code=", str, ", shareUrl=", str2, ", remaining=");
        ub3.u(sbO, i, ", totalGranted=", i2, ", creditsPerPass=");
        sbO.append(i3);
        sbO.append(", validDays=");
        sbO.append(i4);
        sbO.append(")");
        return sbO.toString();
    }

    public GuestPassInfoResponse() {
        this((String) null, (String) null, 0, 0, 0, 0, 63, (rp3) null);
    }

    public GuestPassInfoResponse(String str, String str2, int i, int i2, int i3, int i4) {
        str.getClass();
        str2.getClass();
        this.code = str;
        this.shareUrl = str2;
        this.remaining = i;
        this.totalGranted = i2;
        this.creditsPerPass = i3;
        this.validDays = i4;
    }

    public /* synthetic */ GuestPassInfoResponse(String str, String str2, int i, int i2, int i3, int i4, int i5, rp3 rp3Var) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4);
    }
}
