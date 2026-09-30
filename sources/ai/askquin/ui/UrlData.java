package ai.askquin.ui;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dzb;
import defpackage.ef8;
import defpackage.ezb;
import defpackage.hf8;
import defpackage.kv2;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.thf;
import defpackage.tyc;
import defpackage.uhf;
import defpackage.xyc;
import defpackage.z7c;
import java.time.Instant;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J&\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lai/askquin/ui/UrlData;", "", "", "url", "expired", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/UrlData;Lag2;Lnyc;)V", "write$Self", "Ljava/time/Instant;", "expiredAt", "()Ljava/time/Instant;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/UrlData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getExpired", "Companion", "thf", "uhf", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UrlData {
    public static final int $stable = 0;
    public static final uhf Companion = new uhf();
    private final String expired;
    private final String url;

    public /* synthetic */ UrlData(int i, String str, String str2, xyc xycVar) {
        if (1 != (i & 1)) {
            an1.R(i, 1, thf.a.e());
            throw null;
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.expired = null;
        } else {
            this.expired = str2;
        }
    }

    public static /* synthetic */ UrlData copy$default(UrlData urlData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlData.url;
        }
        if ((i & 2) != 0) {
            str2 = urlData.expired;
        }
        return urlData.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(UrlData self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.url);
        if (!output.g(serialDesc) && self.expired == null) {
            return;
        }
        output.A(serialDesc, 1, p4e.a, self.expired);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExpired() {
        return this.expired;
    }

    public final UrlData copy(String url, String expired) {
        url.getClass();
        return new UrlData(url, expired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlData)) {
            return false;
        }
        UrlData urlData = (UrlData) other;
        return pa7.t(this.url, urlData.url) && pa7.t(this.expired, urlData.expired);
    }

    public final Instant expiredAt() {
        String str = this.expired;
        if (str == null) {
            return null;
        }
        try {
            return Instant.parse(str);
        } catch (Throwable th) {
            Throwable thA = ezb.a(new dzb(th));
            if (thA == null) {
                return null;
            }
            hf8.Q.getClass();
            kv2.A("Failed to parse date: ", this.expired, ef8.a("Quin.UrlData"), thA);
            return null;
        }
    }

    public final String getExpired() {
        return this.expired;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.expired;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return tec.m("UrlData(url=", this.url, ", expired=", this.expired, ")");
    }

    public UrlData(String str, String str2) {
        str.getClass();
        this.url = str;
        this.expired = str2;
    }

    public /* synthetic */ UrlData(String str, String str2, int i, rp3 rp3Var) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
