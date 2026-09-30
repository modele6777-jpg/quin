package ai.askquin.ui.draw.navhost;

import defpackage.ag2;
import defpackage.nyc;
import defpackage.rbf;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b\u0004\u0010\u0016¨\u0006&"}, d2 = {"Lai/askquin/ui/draw/navhost/UnifiedDrawingRoute;", "", "", "isSceneDivination", "isQuickDraw", "<init>", "(ZZ)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/draw/navhost/UnifiedDrawingRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lai/askquin/ui/draw/navhost/UnifiedDrawingRoute;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Companion", "qbf", "rbf", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UnifiedDrawingRoute {
    public static final int $stable = 0;
    public static final rbf Companion = new rbf();
    private final boolean isQuickDraw;
    private final boolean isSceneDivination;

    public /* synthetic */ UnifiedDrawingRoute(int i, boolean z, boolean z2, xyc xycVar) {
        if ((i & 1) == 0) {
            this.isSceneDivination = false;
        } else {
            this.isSceneDivination = z;
        }
        if ((i & 2) == 0) {
            this.isQuickDraw = false;
        } else {
            this.isQuickDraw = z2;
        }
    }

    public static /* synthetic */ UnifiedDrawingRoute copy$default(UnifiedDrawingRoute unifiedDrawingRoute, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = unifiedDrawingRoute.isSceneDivination;
        }
        if ((i & 2) != 0) {
            z2 = unifiedDrawingRoute.isQuickDraw;
        }
        return unifiedDrawingRoute.copy(z, z2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(UnifiedDrawingRoute self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.isSceneDivination) {
            output.o(serialDesc, 0, self.isSceneDivination);
        }
        if (output.g(serialDesc) || self.isQuickDraw) {
            output.o(serialDesc, 1, self.isQuickDraw);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSceneDivination() {
        return this.isSceneDivination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsQuickDraw() {
        return this.isQuickDraw;
    }

    public final UnifiedDrawingRoute copy(boolean isSceneDivination, boolean isQuickDraw) {
        return new UnifiedDrawingRoute(isSceneDivination, isQuickDraw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedDrawingRoute)) {
            return false;
        }
        UnifiedDrawingRoute unifiedDrawingRoute = (UnifiedDrawingRoute) other;
        return this.isSceneDivination == unifiedDrawingRoute.isSceneDivination && this.isQuickDraw == unifiedDrawingRoute.isQuickDraw;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isQuickDraw) + (Boolean.hashCode(this.isSceneDivination) * 31);
    }

    public final boolean isQuickDraw() {
        return this.isQuickDraw;
    }

    public final boolean isSceneDivination() {
        return this.isSceneDivination;
    }

    public String toString() {
        return "UnifiedDrawingRoute(isSceneDivination=" + this.isSceneDivination + ", isQuickDraw=" + this.isQuickDraw + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UnifiedDrawingRoute() {
        boolean z = false;
        this(z, z, 3, (rp3) null);
    }

    public UnifiedDrawingRoute(boolean z, boolean z2) {
        this.isSceneDivination = z;
        this.isQuickDraw = z2;
    }

    public /* synthetic */ UnifiedDrawingRoute(boolean z, boolean z2, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
