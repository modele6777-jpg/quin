package ai.askquin.ui.annual;

import ai.askquin.ui.annual.model.AnnualActionFor;
import defpackage.ag2;
import defpackage.an1;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p10;
import defpackage.q10;
import defpackage.r10;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lai/askquin/ui/annual/AnnualDrawingRoute;", "", "Lai/askquin/ui/annual/model/AnnualActionFor;", "actionFor", "", "resumeFromIndex", "<init>", "(Lai/askquin/ui/annual/model/AnnualActionFor;I)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/annual/model/AnnualActionFor;ILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/annual/AnnualDrawingRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/ui/annual/model/AnnualActionFor;", "component2", "()I", "copy", "(Lai/askquin/ui/annual/model/AnnualActionFor;I)Lai/askquin/ui/annual/AnnualDrawingRoute;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/ui/annual/model/AnnualActionFor;", "getActionFor", "I", "getResumeFromIndex", "Companion", "q10", "r10", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AnnualDrawingRoute {
    public static final int $stable = 0;
    private final AnnualActionFor actionFor;
    private final int resumeFromIndex;
    public static final r10 Companion = new r10();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new p10(2)), null};

    public /* synthetic */ AnnualDrawingRoute(int i, AnnualActionFor annualActionFor, int i2, xyc xycVar) {
        if (1 != (i & 1)) {
            an1.R(i, 1, q10.a.e());
            throw null;
        }
        this.actionFor = annualActionFor;
        if ((i & 2) == 0) {
            this.resumeFromIndex = 0;
        } else {
            this.resumeFromIndex = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return AnnualActionFor.Companion.serializer();
    }

    public static /* synthetic */ AnnualDrawingRoute copy$default(AnnualDrawingRoute annualDrawingRoute, AnnualActionFor annualActionFor, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            annualActionFor = annualDrawingRoute.actionFor;
        }
        if ((i2 & 2) != 0) {
            i = annualDrawingRoute.resumeFromIndex;
        }
        return annualDrawingRoute.copy(annualActionFor, i);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(AnnualDrawingRoute self, ag2 output, nyc serialDesc) {
        output.p(serialDesc, 0, (xn7) $childSerializers[0].getValue(), self.actionFor);
        if (!output.g(serialDesc) && self.resumeFromIndex == 0) {
            return;
        }
        output.v(1, self.resumeFromIndex, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnnualActionFor getActionFor() {
        return this.actionFor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResumeFromIndex() {
        return this.resumeFromIndex;
    }

    public final AnnualDrawingRoute copy(AnnualActionFor actionFor, int resumeFromIndex) {
        actionFor.getClass();
        return new AnnualDrawingRoute(actionFor, resumeFromIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnualDrawingRoute)) {
            return false;
        }
        AnnualDrawingRoute annualDrawingRoute = (AnnualDrawingRoute) other;
        return this.actionFor == annualDrawingRoute.actionFor && this.resumeFromIndex == annualDrawingRoute.resumeFromIndex;
    }

    public final AnnualActionFor getActionFor() {
        return this.actionFor;
    }

    public final int getResumeFromIndex() {
        return this.resumeFromIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.resumeFromIndex) + (this.actionFor.hashCode() * 31);
    }

    public String toString() {
        return "AnnualDrawingRoute(actionFor=" + this.actionFor + ", resumeFromIndex=" + this.resumeFromIndex + ")";
    }

    public AnnualDrawingRoute(AnnualActionFor annualActionFor, int i) {
        annualActionFor.getClass();
        this.actionFor = annualActionFor;
        this.resumeFromIndex = i;
    }

    public /* synthetic */ AnnualDrawingRoute(AnnualActionFor annualActionFor, int i, int i2, rp3 rp3Var) {
        this(annualActionFor, (i2 & 2) != 0 ? 0 : i);
    }
}
