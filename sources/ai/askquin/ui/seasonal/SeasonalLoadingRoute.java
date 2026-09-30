package ai.askquin.ui.seasonal;

import defpackage.ag2;
import defpackage.an1;
import defpackage.hmc;
import defpackage.imc;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002./B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lai/askquin/ui/seasonal/SeasonalLoadingRoute;", "", "", "year", "", "solarTerm", "", "analyticsEnabled", "resume", "<init>", "(ILjava/lang/String;ZZ)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IILjava/lang/String;ZZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/seasonal/SeasonalLoadingRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "copy", "(ILjava/lang/String;ZZ)Lai/askquin/ui/seasonal/SeasonalLoadingRoute;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getYear", "Ljava/lang/String;", "getSolarTerm", "Z", "getAnalyticsEnabled", "getResume", "Companion", "hmc", "imc", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SeasonalLoadingRoute {
    public static final int $stable = 0;
    public static final imc Companion = new imc();
    private final boolean analyticsEnabled;
    private final boolean resume;
    private final String solarTerm;
    private final int year;

    public /* synthetic */ SeasonalLoadingRoute(int i, int i2, String str, boolean z, boolean z2, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, hmc.a.e());
            throw null;
        }
        this.year = i2;
        this.solarTerm = str;
        this.analyticsEnabled = z;
        if ((i & 8) == 0) {
            this.resume = false;
        } else {
            this.resume = z2;
        }
    }

    public static /* synthetic */ SeasonalLoadingRoute copy$default(SeasonalLoadingRoute seasonalLoadingRoute, int i, String str, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = seasonalLoadingRoute.year;
        }
        if ((i2 & 2) != 0) {
            str = seasonalLoadingRoute.solarTerm;
        }
        if ((i2 & 4) != 0) {
            z = seasonalLoadingRoute.analyticsEnabled;
        }
        if ((i2 & 8) != 0) {
            z2 = seasonalLoadingRoute.resume;
        }
        return seasonalLoadingRoute.copy(i, str, z, z2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(SeasonalLoadingRoute self, ag2 output, nyc serialDesc) {
        output.v(0, self.year, serialDesc);
        output.w(serialDesc, 1, self.solarTerm);
        output.o(serialDesc, 2, self.analyticsEnabled);
        if (output.g(serialDesc) || self.resume) {
            output.o(serialDesc, 3, self.resume);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSolarTerm() {
        return this.solarTerm;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAnalyticsEnabled() {
        return this.analyticsEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getResume() {
        return this.resume;
    }

    public final SeasonalLoadingRoute copy(int year, String solarTerm, boolean analyticsEnabled, boolean resume) {
        solarTerm.getClass();
        return new SeasonalLoadingRoute(year, solarTerm, analyticsEnabled, resume);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonalLoadingRoute)) {
            return false;
        }
        SeasonalLoadingRoute seasonalLoadingRoute = (SeasonalLoadingRoute) other;
        return this.year == seasonalLoadingRoute.year && pa7.t(this.solarTerm, seasonalLoadingRoute.solarTerm) && this.analyticsEnabled == seasonalLoadingRoute.analyticsEnabled && this.resume == seasonalLoadingRoute.resume;
    }

    public final boolean getAnalyticsEnabled() {
        return this.analyticsEnabled;
    }

    public final boolean getResume() {
        return this.resume;
    }

    public final String getSolarTerm() {
        return this.solarTerm;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return Boolean.hashCode(this.resume) + ub3.d(ub3.c(Integer.hashCode(this.year) * 31, 31, this.solarTerm), 31, this.analyticsEnabled);
    }

    public String toString() {
        return "SeasonalLoadingRoute(year=" + this.year + ", solarTerm=" + this.solarTerm + ", analyticsEnabled=" + this.analyticsEnabled + ", resume=" + this.resume + ")";
    }

    public SeasonalLoadingRoute(int i, String str, boolean z, boolean z2) {
        str.getClass();
        this.year = i;
        this.solarTerm = str;
        this.analyticsEnabled = z;
        this.resume = z2;
    }

    public /* synthetic */ SeasonalLoadingRoute(int i, String str, boolean z, boolean z2, int i2, rp3 rp3Var) {
        this(i, str, z, (i2 & 8) != 0 ? false : z2);
    }
}
