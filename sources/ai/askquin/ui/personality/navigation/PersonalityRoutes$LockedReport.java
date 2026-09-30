package ai.askquin.ui.personality.navigation;

import defpackage.an1;
import defpackage.ib8;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xba;
import defpackage.xyc;
import defpackage.yba;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0016¨\u0006%"}, d2 = {"ai/askquin/ui/personality/navigation/PersonalityRoutes$LockedReport", "", "", "testId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Lxyc;)V", "Lai/askquin/ui/personality/navigation/PersonalityRoutes$LockedReport;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/personality/navigation/PersonalityRoutes$LockedReport;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lai/askquin/ui/personality/navigation/PersonalityRoutes$LockedReport;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestId", "Companion", "xba", "yba", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PersonalityRoutes$LockedReport {
    public static final int $stable = 0;
    public static final yba Companion = new yba();
    private final String testId;

    public /* synthetic */ PersonalityRoutes$LockedReport(int i, String str, xyc xycVar) {
        if (1 == (i & 1)) {
            this.testId = str;
        } else {
            an1.R(i, 1, xba.a.e());
            throw null;
        }
    }

    public static /* synthetic */ PersonalityRoutes$LockedReport copy$default(PersonalityRoutes$LockedReport personalityRoutes$LockedReport, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalityRoutes$LockedReport.testId;
        }
        return personalityRoutes$LockedReport.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    public final PersonalityRoutes$LockedReport copy(String testId) {
        testId.getClass();
        return new PersonalityRoutes$LockedReport(testId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PersonalityRoutes$LockedReport) && pa7.t(this.testId, ((PersonalityRoutes$LockedReport) other).testId);
    }

    public final String getTestId() {
        return this.testId;
    }

    public int hashCode() {
        return this.testId.hashCode();
    }

    public String toString() {
        return ib8.j("LockedReport(testId=", this.testId, ")");
    }

    public PersonalityRoutes$LockedReport(String str) {
        str.getClass();
        this.testId = str;
    }
}
