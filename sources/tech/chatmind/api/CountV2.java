package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.os2;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tw2;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.uw2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006-"}, d2 = {"Ltech/chatmind/api/CountV2;", "", "Ltech/chatmind/api/CountType;", "type", "", "usedCount", "totalCount", "<init>", "(Ltech/chatmind/api/CountType;II)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/CountType;IILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/CountV2;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/CountType;", "component2", "()I", "component3", "copy", "(Ltech/chatmind/api/CountType;II)Ltech/chatmind/api/CountV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/CountType;", "getType", "I", "getUsedCount", "getTotalCount", "Companion", "tw2", "uw2", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class CountV2 {
    public static final int $stable = 0;
    private final int totalCount;
    private final CountType type;
    private final int usedCount;
    public static final uw2 Companion = new uw2();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new os2(4)), null, null};

    public /* synthetic */ CountV2(int i, CountType countType, int i2, int i3, xyc xycVar) {
        if (6 != (i & 6)) {
            an1.R(i, 6, tw2.a.e());
            throw null;
        }
        if ((i & 1) == 0) {
            this.type = CountType.UNKNOWN;
        } else {
            this.type = countType;
        }
        this.usedCount = i2;
        this.totalCount = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return CountType.Companion.serializer();
    }

    public static /* synthetic */ CountV2 copy$default(CountV2 countV2, CountType countType, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            countType = countV2.type;
        }
        if ((i3 & 2) != 0) {
            i = countV2.usedCount;
        }
        if ((i3 & 4) != 0) {
            i2 = countV2.totalCount;
        }
        return countV2.copy(countType, i, i2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(CountV2 self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.type != CountType.UNKNOWN) {
            output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.type);
        }
        output.v(1, self.usedCount, serialDesc);
        output.v(2, self.totalCount, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CountType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUsedCount() {
        return this.usedCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final CountV2 copy(CountType type, int usedCount, int totalCount) {
        type.getClass();
        return new CountV2(type, usedCount, totalCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountV2)) {
            return false;
        }
        CountV2 countV2 = (CountV2) other;
        return this.type == countV2.type && this.usedCount == countV2.usedCount && this.totalCount == countV2.totalCount;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final CountType getType() {
        return this.type;
    }

    public final int getUsedCount() {
        return this.usedCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalCount) + ub3.b(this.usedCount, this.type.hashCode() * 31, 31);
    }

    public String toString() {
        CountType countType = this.type;
        int i = this.usedCount;
        int i2 = this.totalCount;
        StringBuilder sb = new StringBuilder("CountV2(type=");
        sb.append(countType);
        sb.append(", usedCount=");
        sb.append(i);
        sb.append(", totalCount=");
        return tec.g(i2, ")", sb);
    }

    public CountV2(CountType countType, int i, int i2) {
        countType.getClass();
        this.type = countType;
        this.usedCount = i;
        this.totalCount = i2;
    }

    public /* synthetic */ CountV2(CountType countType, int i, int i2, int i3, rp3 rp3Var) {
        this((i3 & 1) != 0 ? CountType.UNKNOWN : countType, i, i2);
    }
}
