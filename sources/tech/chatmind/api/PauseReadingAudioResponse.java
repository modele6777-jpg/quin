package tech.chatmind.api;

import defpackage.ag2;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.n2a;
import defpackage.nyc;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.vy9;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Ltech/chatmind/api/PauseReadingAudioResponse;", "", "Ltech/chatmind/api/PauseReadingAudioStatus;", "status", "<init>", "(Ltech/chatmind/api/PauseReadingAudioStatus;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/PauseReadingAudioStatus;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/PauseReadingAudioResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/PauseReadingAudioStatus;", "copy", "(Ltech/chatmind/api/PauseReadingAudioStatus;)Ltech/chatmind/api/PauseReadingAudioResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/PauseReadingAudioStatus;", "getStatus", "Companion", "m2a", "n2a", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PauseReadingAudioResponse {
    public static final int $stable = 0;
    private final PauseReadingAudioStatus status;
    public static final n2a Companion = new n2a();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new vy9(3))};

    public /* synthetic */ PauseReadingAudioResponse(int i, PauseReadingAudioStatus pauseReadingAudioStatus, xyc xycVar) {
        if ((i & 1) == 0) {
            this.status = PauseReadingAudioStatus.UNKNOWN;
        } else {
            this.status = pauseReadingAudioStatus;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return PauseReadingAudioStatus.Companion.serializer();
    }

    public static /* synthetic */ PauseReadingAudioResponse copy$default(PauseReadingAudioResponse pauseReadingAudioResponse, PauseReadingAudioStatus pauseReadingAudioStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            pauseReadingAudioStatus = pauseReadingAudioResponse.status;
        }
        return pauseReadingAudioResponse.copy(pauseReadingAudioStatus);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(PauseReadingAudioResponse self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (!output.g(serialDesc) && self.status == PauseReadingAudioStatus.UNKNOWN) {
            return;
        }
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PauseReadingAudioStatus getStatus() {
        return this.status;
    }

    public final PauseReadingAudioResponse copy(PauseReadingAudioStatus status) {
        status.getClass();
        return new PauseReadingAudioResponse(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PauseReadingAudioResponse) && this.status == ((PauseReadingAudioResponse) other).status;
    }

    public final PauseReadingAudioStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return "PauseReadingAudioResponse(status=" + this.status + ")";
    }

    public PauseReadingAudioResponse() {
        this((PauseReadingAudioStatus) null, 1, (rp3) (0 == true ? 1 : 0));
    }

    public PauseReadingAudioResponse(PauseReadingAudioStatus pauseReadingAudioStatus) {
        pauseReadingAudioStatus.getClass();
        this.status = pauseReadingAudioStatus;
    }

    public /* synthetic */ PauseReadingAudioResponse(PauseReadingAudioStatus pauseReadingAudioStatus, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? PauseReadingAudioStatus.UNKNOWN : pauseReadingAudioStatus);
    }
}
