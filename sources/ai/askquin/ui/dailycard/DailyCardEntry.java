package ai.askquin.ui.dailycard;

import defpackage.ag2;
import defpackage.cye;
import defpackage.fbc;
import defpackage.gcc;
import defpackage.k33;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.th5;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z57;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lai/askquin/ui/dailycard/DailyCardEntry;", "", "", "source", "targetDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/dailycard/DailyCardEntry;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/dailycard/DailyCardEntry;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "getTargetDate", "Companion", "j33", "k33", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DailyCardEntry {
    public static final int $stable = 0;
    public static final k33 Companion = new k33();
    private final String source;
    private final String targetDate;

    public DailyCardEntry(int i, String str, String str2, xyc xycVar) {
        this.source = (i & 1) == 0 ? "unknown" : str;
        if ((i & 2) != 0) {
            this.targetDate = str2;
        } else {
            th5 th5Var = cye.b;
            this.targetDate = gcc.E(z57.a.a(), fbc.d()).a().toString();
        }
    }

    public static /* synthetic */ DailyCardEntry copy$default(DailyCardEntry dailyCardEntry, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyCardEntry.source;
        }
        if ((i & 2) != 0) {
            str2 = dailyCardEntry.targetDate;
        }
        return dailyCardEntry.copy(str, str2);
    }

    public static final void write$Self$Quin_conversation_gpRelease(DailyCardEntry self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || !pa7.t(self.source, "unknown")) {
            output.w(serialDesc, 0, self.source);
        }
        if (!output.g(serialDesc)) {
            String str = self.targetDate;
            th5 th5Var = cye.b;
            if (pa7.t(str, gcc.E(z57.a.a(), fbc.d()).a().toString())) {
                return;
            }
        }
        output.w(serialDesc, 1, self.targetDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTargetDate() {
        return this.targetDate;
    }

    public final DailyCardEntry copy(String source, String targetDate) {
        source.getClass();
        targetDate.getClass();
        return new DailyCardEntry(source, targetDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyCardEntry)) {
            return false;
        }
        DailyCardEntry dailyCardEntry = (DailyCardEntry) other;
        return pa7.t(this.source, dailyCardEntry.source) && pa7.t(this.targetDate, dailyCardEntry.targetDate);
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTargetDate() {
        return this.targetDate;
    }

    public int hashCode() {
        return this.targetDate.hashCode() + (this.source.hashCode() * 31);
    }

    public String toString() {
        return tec.m("DailyCardEntry(source=", this.source, ", targetDate=", this.targetDate, ")");
    }

    public DailyCardEntry() {
        this((String) null, (String) null, 3, (rp3) null);
    }

    public DailyCardEntry(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.source = str;
        this.targetDate = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DailyCardEntry(String str, String str2, int i, rp3 rp3Var) {
        str = (i & 1) != 0 ? "unknown" : str;
        if ((i & 2) != 0) {
            th5 th5Var = cye.b;
            str2 = gcc.E(z57.a.a(), fbc.d()).a().toString();
        }
        this(str, str2);
    }
}
