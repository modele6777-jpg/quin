package ai.askquin.ui.quickdecision;

import defpackage.ag2;
import defpackage.an1;
import defpackage.nyc;
import defpackage.o6b;
import defpackage.p4e;
import defpackage.p6b;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lai/askquin/ui/quickdecision/QuickDecisionDetailRoute;", "", "", "id", "", "source", "<init>", "(JLjava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IJLjava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/quickdecision/QuickDecisionDetailRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lai/askquin/ui/quickdecision/QuickDecisionDetailRoute;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "Ljava/lang/String;", "getSource", "Companion", "o6b", "p6b", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class QuickDecisionDetailRoute {
    public static final int $stable = 0;
    public static final p6b Companion = new p6b();
    private final long id;
    private final String source;

    public /* synthetic */ QuickDecisionDetailRoute(int i, long j, String str, xyc xycVar) {
        if (1 != (i & 1)) {
            an1.R(i, 1, o6b.a.e());
            throw null;
        }
        this.id = j;
        if ((i & 2) == 0) {
            this.source = null;
        } else {
            this.source = str;
        }
    }

    public static /* synthetic */ QuickDecisionDetailRoute copy$default(QuickDecisionDetailRoute quickDecisionDetailRoute, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = quickDecisionDetailRoute.id;
        }
        if ((i & 2) != 0) {
            str = quickDecisionDetailRoute.source;
        }
        return quickDecisionDetailRoute.copy(j, str);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(QuickDecisionDetailRoute self, ag2 output, nyc serialDesc) {
        output.k(serialDesc, 0, self.id);
        if (!output.g(serialDesc) && self.source == null) {
            return;
        }
        output.A(serialDesc, 1, p4e.a, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final QuickDecisionDetailRoute copy(long id, String source) {
        return new QuickDecisionDetailRoute(id, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickDecisionDetailRoute)) {
            return false;
        }
        QuickDecisionDetailRoute quickDecisionDetailRoute = (QuickDecisionDetailRoute) other;
        return this.id == quickDecisionDetailRoute.id && pa7.t(this.source, quickDecisionDetailRoute.source);
    }

    public final long getId() {
        return this.id;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.source;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "QuickDecisionDetailRoute(id=" + this.id + ", source=" + this.source + ")";
    }

    public QuickDecisionDetailRoute(long j, String str) {
        this.id = j;
        this.source = str;
    }

    public /* synthetic */ QuickDecisionDetailRoute(long j, String str, int i, rp3 rp3Var) {
        this(j, (i & 2) != 0 ? null : str);
    }
}
