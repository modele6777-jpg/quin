package tech.chatmind.api;

import defpackage.ag2;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.pma;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.vd8;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Ltech/chatmind/api/PopupRequest;", "", "", "locale", "version", "platform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/PopupRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/PopupRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLocale", "getVersion", "getPlatform", "Companion", "oma", "pma", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PopupRequest {
    public static final int $stable = 0;
    public static final pma Companion = new pma();
    private final String locale;
    private final String platform;
    private final String version;

    public /* synthetic */ PopupRequest(int i, String str, String str2, String str3, xyc xycVar) {
        this.locale = (i & 1) == 0 ? vd8.d() : str;
        if ((i & 2) == 0) {
            this.version = "5.23.0";
        } else {
            this.version = str2;
        }
        if ((i & 4) == 0) {
            this.platform = "android";
        } else {
            this.platform = str3;
        }
    }

    public static /* synthetic */ PopupRequest copy$default(PopupRequest popupRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popupRequest.locale;
        }
        if ((i & 2) != 0) {
            str2 = popupRequest.version;
        }
        if ((i & 4) != 0) {
            str3 = popupRequest.platform;
        }
        return popupRequest.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(PopupRequest self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || !pa7.t(self.locale, vd8.d())) {
            output.w(serialDesc, 0, self.locale);
        }
        if (output.g(serialDesc) || !pa7.t(self.version, "5.23.0")) {
            output.w(serialDesc, 1, self.version);
        }
        if (!output.g(serialDesc) && pa7.t(self.platform, "android")) {
            return;
        }
        output.w(serialDesc, 2, self.platform);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public final PopupRequest copy(String locale, String version, String platform) {
        locale.getClass();
        version.getClass();
        platform.getClass();
        return new PopupRequest(locale, version, platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopupRequest)) {
            return false;
        }
        PopupRequest popupRequest = (PopupRequest) other;
        return pa7.t(this.locale, popupRequest.locale) && pa7.t(this.version, popupRequest.version) && pa7.t(this.platform, popupRequest.platform);
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.platform.hashCode() + ub3.c(this.locale.hashCode() * 31, 31, this.version);
    }

    public String toString() {
        String str = this.locale;
        String str2 = this.version;
        return ks0.l(ib8.o("PopupRequest(locale=", str, ", version=", str2, ", platform="), this.platform, ")");
    }

    public PopupRequest(String str, String str2, String str3) {
        tec.x(str, str2, str3);
        this.locale = str;
        this.version = str2;
        this.platform = str3;
    }

    public PopupRequest() {
        this((String) null, (String) null, (String) null, 7, (rp3) null);
    }

    public /* synthetic */ PopupRequest(String str, String str2, String str3, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? vd8.d() : str, (i & 2) != 0 ? "5.23.0" : str2, (i & 4) != 0 ? "android" : str3);
    }
}
