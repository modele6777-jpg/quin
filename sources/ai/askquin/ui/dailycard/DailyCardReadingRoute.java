package ai.askquin.ui.dailycard;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.x33;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lai/askquin/ui/dailycard/DailyCardReadingRoute;", "", "", "date", "segmentId", "skinName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/dailycard/DailyCardReadingRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/dailycard/DailyCardReadingRoute;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getSegmentId", "getSkinName", "Companion", "ai/askquin/ui/dailycard/a", "x33", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
final /* data */ class DailyCardReadingRoute {
    public static final x33 Companion = new x33();
    private final String date;
    private final String segmentId;
    private final String skinName;

    public /* synthetic */ DailyCardReadingRoute(int i, String str, String str2, String str3, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, a.a.e());
            throw null;
        }
        this.date = str;
        this.segmentId = str2;
        this.skinName = str3;
    }

    public static /* synthetic */ DailyCardReadingRoute copy$default(DailyCardReadingRoute dailyCardReadingRoute, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyCardReadingRoute.date;
        }
        if ((i & 2) != 0) {
            str2 = dailyCardReadingRoute.segmentId;
        }
        if ((i & 4) != 0) {
            str3 = dailyCardReadingRoute.skinName;
        }
        return dailyCardReadingRoute.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(DailyCardReadingRoute self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.date);
        output.w(serialDesc, 1, self.segmentId);
        output.w(serialDesc, 2, self.skinName);
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
    public final String getSkinName() {
        return this.skinName;
    }

    public final DailyCardReadingRoute copy(String date, String segmentId, String skinName) {
        date.getClass();
        segmentId.getClass();
        skinName.getClass();
        return new DailyCardReadingRoute(date, segmentId, skinName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyCardReadingRoute)) {
            return false;
        }
        DailyCardReadingRoute dailyCardReadingRoute = (DailyCardReadingRoute) other;
        return pa7.t(this.date, dailyCardReadingRoute.date) && pa7.t(this.segmentId, dailyCardReadingRoute.segmentId) && pa7.t(this.skinName, dailyCardReadingRoute.skinName);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getSegmentId() {
        return this.segmentId;
    }

    public final String getSkinName() {
        return this.skinName;
    }

    public int hashCode() {
        return this.skinName.hashCode() + ub3.c(this.date.hashCode() * 31, 31, this.segmentId);
    }

    public String toString() {
        String str = this.date;
        String str2 = this.segmentId;
        return ks0.l(ib8.o("DailyCardReadingRoute(date=", str, ", segmentId=", str2, ", skinName="), this.skinName, ")");
    }

    public DailyCardReadingRoute(String str, String str2, String str3) {
        tec.x(str, str2, str3);
        this.date = str;
        this.segmentId = str2;
        this.skinName = str3;
    }
}
