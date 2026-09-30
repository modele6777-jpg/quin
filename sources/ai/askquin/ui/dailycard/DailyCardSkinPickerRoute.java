package ai.askquin.ui.dailycard;

import defpackage.ag2;
import defpackage.an1;
import defpackage.e53;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tec;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lai/askquin/ui/dailycard/DailyCardSkinPickerRoute;", "", "", "date", "segmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/dailycard/DailyCardSkinPickerRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/dailycard/DailyCardSkinPickerRoute;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getSegmentId", "Companion", "ai/askquin/ui/dailycard/d", "e53", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
final /* data */ class DailyCardSkinPickerRoute {
    public static final e53 Companion = new e53();
    private final String date;
    private final String segmentId;

    public /* synthetic */ DailyCardSkinPickerRoute(int i, String str, String str2, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, d.a.e());
            throw null;
        }
        this.date = str;
        this.segmentId = str2;
    }

    public static /* synthetic */ DailyCardSkinPickerRoute copy$default(DailyCardSkinPickerRoute dailyCardSkinPickerRoute, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyCardSkinPickerRoute.date;
        }
        if ((i & 2) != 0) {
            str2 = dailyCardSkinPickerRoute.segmentId;
        }
        return dailyCardSkinPickerRoute.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(DailyCardSkinPickerRoute self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.date);
        output.w(serialDesc, 1, self.segmentId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSegmentId() {
        return this.segmentId;
    }

    public final DailyCardSkinPickerRoute copy(String date, String segmentId) {
        date.getClass();
        segmentId.getClass();
        return new DailyCardSkinPickerRoute(date, segmentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyCardSkinPickerRoute)) {
            return false;
        }
        DailyCardSkinPickerRoute dailyCardSkinPickerRoute = (DailyCardSkinPickerRoute) other;
        return pa7.t(this.date, dailyCardSkinPickerRoute.date) && pa7.t(this.segmentId, dailyCardSkinPickerRoute.segmentId);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getSegmentId() {
        return this.segmentId;
    }

    public int hashCode() {
        return this.segmentId.hashCode() + (this.date.hashCode() * 31);
    }

    public String toString() {
        return tec.m("DailyCardSkinPickerRoute(date=", this.date, ", segmentId=", this.segmentId, ")");
    }

    public DailyCardSkinPickerRoute(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.date = str;
        this.segmentId = str2;
    }
}
