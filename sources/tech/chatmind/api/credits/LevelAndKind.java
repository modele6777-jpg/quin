package tech.chatmind.api.credits;

import defpackage.ag2;
import defpackage.an1;
import defpackage.b48;
import defpackage.c48;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.o7e;
import defpackage.ov7;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Ltech/chatmind/api/credits/LevelAndKind;", "", "Lo7e;", "level", "Ltech/chatmind/api/credits/SubscriptionKind;", "kind", "<init>", "(Lo7e;Ltech/chatmind/api/credits/SubscriptionKind;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILo7e;Ltech/chatmind/api/credits/SubscriptionKind;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/credits/LevelAndKind;Lag2;Lnyc;)V", "write$Self", "component1", "()Lo7e;", "component2", "()Ltech/chatmind/api/credits/SubscriptionKind;", "copy", "(Lo7e;Ltech/chatmind/api/credits/SubscriptionKind;)Ltech/chatmind/api/credits/LevelAndKind;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lo7e;", "getLevel", "Ltech/chatmind/api/credits/SubscriptionKind;", "getKind", "Companion", "b48", "c48", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class LevelAndKind {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final c48 Companion = new c48();
    private final SubscriptionKind kind;
    private final o7e level;

    static {
        ov7 ov7Var = new ov7(3);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, ov7Var), eb3.N(z18Var, new ov7(4))};
    }

    public /* synthetic */ LevelAndKind(int i, o7e o7eVar, SubscriptionKind subscriptionKind, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, b48.a.e());
            throw null;
        }
        this.level = o7eVar;
        this.kind = subscriptionKind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_() {
        o7e[] o7eVarArrValues = o7e.values();
        o7eVarArrValues.getClass();
        return new wn2("net.xmind.donut.payment.SubscriptionLevel", o7eVarArrValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return SubscriptionKind.Companion.serializer();
    }

    public static /* synthetic */ LevelAndKind copy$default(LevelAndKind levelAndKind, o7e o7eVar, SubscriptionKind subscriptionKind, int i, Object obj) {
        if ((i & 1) != 0) {
            o7eVar = levelAndKind.level;
        }
        if ((i & 2) != 0) {
            subscriptionKind = levelAndKind.kind;
        }
        return levelAndKind.copy(o7eVar, subscriptionKind);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(LevelAndKind self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.level);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.kind);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final o7e getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SubscriptionKind getKind() {
        return this.kind;
    }

    public final LevelAndKind copy(o7e level, SubscriptionKind kind) {
        level.getClass();
        kind.getClass();
        return new LevelAndKind(level, kind);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LevelAndKind)) {
            return false;
        }
        LevelAndKind levelAndKind = (LevelAndKind) other;
        return this.level == levelAndKind.level && this.kind == levelAndKind.kind;
    }

    public final SubscriptionKind getKind() {
        return this.kind;
    }

    public final o7e getLevel() {
        return this.level;
    }

    public int hashCode() {
        return this.kind.hashCode() + (this.level.hashCode() * 31);
    }

    public String toString() {
        return "LevelAndKind(level=" + this.level + ", kind=" + this.kind + ")";
    }

    public LevelAndKind(o7e o7eVar, SubscriptionKind subscriptionKind) {
        o7eVar.getClass();
        subscriptionKind.getClass();
        this.level = o7eVar;
        this.kind = subscriptionKind;
    }
}
