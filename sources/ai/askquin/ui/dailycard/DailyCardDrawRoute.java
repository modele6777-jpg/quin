package ai.askquin.ui.dailycard;

import defpackage.ag2;
import defpackage.an1;
import defpackage.c33;
import defpackage.d33;
import defpackage.ib8;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b\u0006\u0010\u001b¨\u0006+"}, d2 = {"Lai/askquin/ui/dailycard/DailyCardDrawRoute;", "", "", "date", "segmentId", "", "isTomorrow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/dailycard/DailyCardDrawRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lai/askquin/ui/dailycard/DailyCardDrawRoute;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getSegmentId", "Z", "Companion", "c33", "d33", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DailyCardDrawRoute {
    public static final int $stable = 0;
    public static final d33 Companion = new d33();
    private final String date;
    private final boolean isTomorrow;
    private final String segmentId;

    public /* synthetic */ DailyCardDrawRoute(int i, String str, String str2, boolean z, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, c33.a.e());
            throw null;
        }
        this.date = str;
        this.segmentId = str2;
        this.isTomorrow = z;
    }

    public static /* synthetic */ DailyCardDrawRoute copy$default(DailyCardDrawRoute dailyCardDrawRoute, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyCardDrawRoute.date;
        }
        if ((i & 2) != 0) {
            str2 = dailyCardDrawRoute.segmentId;
        }
        if ((i & 4) != 0) {
            z = dailyCardDrawRoute.isTomorrow;
        }
        return dailyCardDrawRoute.copy(str, str2, z);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(DailyCardDrawRoute self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.date);
        output.w(serialDesc, 1, self.segmentId);
        output.o(serialDesc, 2, self.isTomorrow);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSegmentId() {
        return this.segmentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsTomorrow() {
        return this.isTomorrow;
    }

    public final DailyCardDrawRoute copy(String date, String segmentId, boolean isTomorrow) {
        date.getClass();
        segmentId.getClass();
        return new DailyCardDrawRoute(date, segmentId, isTomorrow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyCardDrawRoute)) {
            return false;
        }
        DailyCardDrawRoute dailyCardDrawRoute = (DailyCardDrawRoute) other;
        return pa7.t(this.date, dailyCardDrawRoute.date) && pa7.t(this.segmentId, dailyCardDrawRoute.segmentId) && this.isTomorrow == dailyCardDrawRoute.isTomorrow;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getSegmentId() {
        return this.segmentId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTomorrow) + ub3.c(this.date.hashCode() * 31, 31, this.segmentId);
    }

    public final boolean isTomorrow() {
        return this.isTomorrow;
    }

    public String toString() {
        String str = this.date;
        String str2 = this.segmentId;
        return ub3.m(ib8.o("DailyCardDrawRoute(date=", str, ", segmentId=", str2, ", isTomorrow="), this.isTomorrow, ")");
    }

    public DailyCardDrawRoute(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.date = str;
        this.segmentId = str2;
        this.isTomorrow = z;
    }
}
