package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.k62;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.qpf;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.u6e;
import defpackage.v6e;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Ltech/chatmind/api/SubmitSpreadRequest;", "", "Ltech/chatmind/api/UserSelectedSpread;", "userSelectedSpread", "Ltech/chatmind/api/CloudMixedDeckSnapshot;", "mixedDeckSnapshot", "<init>", "(Ltech/chatmind/api/UserSelectedSpread;Ltech/chatmind/api/CloudMixedDeckSnapshot;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/UserSelectedSpread;Ltech/chatmind/api/CloudMixedDeckSnapshot;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/SubmitSpreadRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/UserSelectedSpread;", "component2", "()Ltech/chatmind/api/CloudMixedDeckSnapshot;", "copy", "(Ltech/chatmind/api/UserSelectedSpread;Ltech/chatmind/api/CloudMixedDeckSnapshot;)Ltech/chatmind/api/SubmitSpreadRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/UserSelectedSpread;", "getUserSelectedSpread", "Ltech/chatmind/api/CloudMixedDeckSnapshot;", "getMixedDeckSnapshot", "Companion", "u6e", "v6e", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SubmitSpreadRequest {
    private final CloudMixedDeckSnapshot mixedDeckSnapshot;
    private final UserSelectedSpread userSelectedSpread;
    public static final v6e Companion = new v6e();
    public static final int $stable = CloudMixedDeckSnapshot.$stable;

    public /* synthetic */ SubmitSpreadRequest(int i, UserSelectedSpread userSelectedSpread, CloudMixedDeckSnapshot cloudMixedDeckSnapshot, xyc xycVar) {
        if (1 != (i & 1)) {
            an1.R(i, 1, u6e.a.e());
            throw null;
        }
        this.userSelectedSpread = userSelectedSpread;
        if ((i & 2) == 0) {
            this.mixedDeckSnapshot = null;
        } else {
            this.mixedDeckSnapshot = cloudMixedDeckSnapshot;
        }
    }

    public static /* synthetic */ SubmitSpreadRequest copy$default(SubmitSpreadRequest submitSpreadRequest, UserSelectedSpread userSelectedSpread, CloudMixedDeckSnapshot cloudMixedDeckSnapshot, int i, Object obj) {
        if ((i & 1) != 0) {
            userSelectedSpread = submitSpreadRequest.userSelectedSpread;
        }
        if ((i & 2) != 0) {
            cloudMixedDeckSnapshot = submitSpreadRequest.mixedDeckSnapshot;
        }
        return submitSpreadRequest.copy(userSelectedSpread, cloudMixedDeckSnapshot);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SubmitSpreadRequest self, ag2 output, nyc serialDesc) {
        output.p(serialDesc, 0, qpf.a, self.userSelectedSpread);
        if (!output.g(serialDesc) && self.mixedDeckSnapshot == null) {
            return;
        }
        output.A(serialDesc, 1, k62.a, self.mixedDeckSnapshot);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserSelectedSpread getUserSelectedSpread() {
        return this.userSelectedSpread;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CloudMixedDeckSnapshot getMixedDeckSnapshot() {
        return this.mixedDeckSnapshot;
    }

    public final SubmitSpreadRequest copy(UserSelectedSpread userSelectedSpread, CloudMixedDeckSnapshot mixedDeckSnapshot) {
        userSelectedSpread.getClass();
        return new SubmitSpreadRequest(userSelectedSpread, mixedDeckSnapshot);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitSpreadRequest)) {
            return false;
        }
        SubmitSpreadRequest submitSpreadRequest = (SubmitSpreadRequest) other;
        return pa7.t(this.userSelectedSpread, submitSpreadRequest.userSelectedSpread) && pa7.t(this.mixedDeckSnapshot, submitSpreadRequest.mixedDeckSnapshot);
    }

    public final CloudMixedDeckSnapshot getMixedDeckSnapshot() {
        return this.mixedDeckSnapshot;
    }

    public final UserSelectedSpread getUserSelectedSpread() {
        return this.userSelectedSpread;
    }

    public int hashCode() {
        int iHashCode = this.userSelectedSpread.hashCode() * 31;
        CloudMixedDeckSnapshot cloudMixedDeckSnapshot = this.mixedDeckSnapshot;
        return iHashCode + (cloudMixedDeckSnapshot == null ? 0 : cloudMixedDeckSnapshot.hashCode());
    }

    public String toString() {
        return "SubmitSpreadRequest(userSelectedSpread=" + this.userSelectedSpread + ", mixedDeckSnapshot=" + this.mixedDeckSnapshot + ")";
    }

    public SubmitSpreadRequest(UserSelectedSpread userSelectedSpread, CloudMixedDeckSnapshot cloudMixedDeckSnapshot) {
        userSelectedSpread.getClass();
        this.userSelectedSpread = userSelectedSpread;
        this.mixedDeckSnapshot = cloudMixedDeckSnapshot;
    }

    public /* synthetic */ SubmitSpreadRequest(UserSelectedSpread userSelectedSpread, CloudMixedDeckSnapshot cloudMixedDeckSnapshot, int i, rp3 rp3Var) {
        this(userSelectedSpread, (i & 2) != 0 ? null : cloudMixedDeckSnapshot);
    }
}
