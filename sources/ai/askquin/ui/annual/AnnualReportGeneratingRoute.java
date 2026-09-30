package ai.askquin.ui.annual;

import ai.askquin.ui.annual.model.AnnualActionFor;
import defpackage.an1;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.n40;
import defpackage.o40;
import defpackage.p10;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lai/askquin/ui/annual/AnnualReportGeneratingRoute;", "", "Lai/askquin/ui/annual/model/AnnualActionFor;", "actionFor", "<init>", "(Lai/askquin/ui/annual/model/AnnualActionFor;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/annual/model/AnnualActionFor;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/annual/AnnualReportGeneratingRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/ui/annual/model/AnnualActionFor;", "copy", "(Lai/askquin/ui/annual/model/AnnualActionFor;)Lai/askquin/ui/annual/AnnualReportGeneratingRoute;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/ui/annual/model/AnnualActionFor;", "getActionFor", "Companion", "n40", "o40", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AnnualReportGeneratingRoute {
    public static final int $stable = 0;
    private final AnnualActionFor actionFor;
    public static final o40 Companion = new o40();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new p10(15))};

    public /* synthetic */ AnnualReportGeneratingRoute(int i, AnnualActionFor annualActionFor, xyc xycVar) {
        if (1 == (i & 1)) {
            this.actionFor = annualActionFor;
        } else {
            an1.R(i, 1, n40.a.e());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return AnnualActionFor.Companion.serializer();
    }

    public static /* synthetic */ AnnualReportGeneratingRoute copy$default(AnnualReportGeneratingRoute annualReportGeneratingRoute, AnnualActionFor annualActionFor, int i, Object obj) {
        if ((i & 1) != 0) {
            annualActionFor = annualReportGeneratingRoute.actionFor;
        }
        return annualReportGeneratingRoute.copy(annualActionFor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnnualActionFor getActionFor() {
        return this.actionFor;
    }

    public final AnnualReportGeneratingRoute copy(AnnualActionFor actionFor) {
        actionFor.getClass();
        return new AnnualReportGeneratingRoute(actionFor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnnualReportGeneratingRoute) && this.actionFor == ((AnnualReportGeneratingRoute) other).actionFor;
    }

    public final AnnualActionFor getActionFor() {
        return this.actionFor;
    }

    public int hashCode() {
        return this.actionFor.hashCode();
    }

    public String toString() {
        return "AnnualReportGeneratingRoute(actionFor=" + this.actionFor + ")";
    }

    public AnnualReportGeneratingRoute(AnnualActionFor annualActionFor) {
        annualActionFor.getClass();
        this.actionFor = annualActionFor;
    }
}
