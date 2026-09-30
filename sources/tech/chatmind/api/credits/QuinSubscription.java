package tech.chatmind.api.credits;

import defpackage.ag2;
import defpackage.an1;
import defpackage.b48;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.s8b;
import defpackage.t8b;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import defpackage.za8;
import java.time.LocalDateTime;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019¨\u0006."}, d2 = {"Ltech/chatmind/api/credits/QuinSubscription;", "", "Ltech/chatmind/api/credits/LevelAndKind;", "levelAndKind", "Ljava/time/LocalDateTime;", "expiredTime", "<init>", "(Ltech/chatmind/api/credits/LevelAndKind;Ljava/time/LocalDateTime;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/credits/LevelAndKind;Ljava/time/LocalDateTime;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/credits/QuinSubscription;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/credits/LevelAndKind;", "component2", "()Ljava/time/LocalDateTime;", "copy", "(Ltech/chatmind/api/credits/LevelAndKind;Ljava/time/LocalDateTime;)Ltech/chatmind/api/credits/QuinSubscription;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/credits/LevelAndKind;", "getLevelAndKind", "Ljava/time/LocalDateTime;", "getExpiredTime", "getExpiredTime$annotations", "()V", "Companion", "s8b", "t8b", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class QuinSubscription {
    public static final int $stable = 8;
    public static final t8b Companion = new t8b();
    private final LocalDateTime expiredTime;
    private final LevelAndKind levelAndKind;

    public /* synthetic */ QuinSubscription(int i, LevelAndKind levelAndKind, LocalDateTime localDateTime, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, s8b.a.e());
            throw null;
        }
        this.levelAndKind = levelAndKind;
        this.expiredTime = localDateTime;
    }

    public static /* synthetic */ QuinSubscription copy$default(QuinSubscription quinSubscription, LevelAndKind levelAndKind, LocalDateTime localDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            levelAndKind = quinSubscription.levelAndKind;
        }
        if ((i & 2) != 0) {
            localDateTime = quinSubscription.expiredTime;
        }
        return quinSubscription.copy(levelAndKind, localDateTime);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(QuinSubscription self, ag2 output, nyc serialDesc) {
        output.p(serialDesc, 0, b48.a, self.levelAndKind);
        output.A(serialDesc, 1, za8.a, self.expiredTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LevelAndKind getLevelAndKind() {
        return this.levelAndKind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDateTime getExpiredTime() {
        return this.expiredTime;
    }

    public final QuinSubscription copy(LevelAndKind levelAndKind, LocalDateTime expiredTime) {
        levelAndKind.getClass();
        return new QuinSubscription(levelAndKind, expiredTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuinSubscription)) {
            return false;
        }
        QuinSubscription quinSubscription = (QuinSubscription) other;
        return pa7.t(this.levelAndKind, quinSubscription.levelAndKind) && pa7.t(this.expiredTime, quinSubscription.expiredTime);
    }

    public final LocalDateTime getExpiredTime() {
        return this.expiredTime;
    }

    public final LevelAndKind getLevelAndKind() {
        return this.levelAndKind;
    }

    public int hashCode() {
        int iHashCode = this.levelAndKind.hashCode() * 31;
        LocalDateTime localDateTime = this.expiredTime;
        return iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode());
    }

    public String toString() {
        return "QuinSubscription(levelAndKind=" + this.levelAndKind + ", expiredTime=" + this.expiredTime + ")";
    }

    @tyc(with = za8.class)
    public static /* synthetic */ void getExpiredTime$annotations() {
    }

    public QuinSubscription(LevelAndKind levelAndKind, LocalDateTime localDateTime) {
        levelAndKind.getClass();
        this.levelAndKind = levelAndKind;
        this.expiredTime = localDateTime;
    }
}
