package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.c77;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.o8a;
import defpackage.p8a;
import defpackage.pa7;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Ltech/chatmind/api/Period;", "", "", "count", "Ltech/chatmind/api/PeriodUnit;", "unit", "<init>", "(Ljava/lang/Integer;Ltech/chatmind/api/PeriodUnit;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ltech/chatmind/api/PeriodUnit;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/Period;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ltech/chatmind/api/PeriodUnit;", "copy", "(Ljava/lang/Integer;Ltech/chatmind/api/PeriodUnit;)Ltech/chatmind/api/Period;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getCount", "Ltech/chatmind/api/PeriodUnit;", "getUnit", "Companion", "o8a", "p8a", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class Period {
    public static final int $stable = 0;
    private final Integer count;
    private final PeriodUnit unit;
    public static final p8a Companion = new p8a();
    private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new vy9(22))};

    public /* synthetic */ Period(int i, Integer num, PeriodUnit periodUnit, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, o8a.a.e());
            throw null;
        }
        this.count = num;
        this.unit = periodUnit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return PeriodUnit.Companion.serializer();
    }

    public static /* synthetic */ Period copy$default(Period period, Integer num, PeriodUnit periodUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            num = period.count;
        }
        if ((i & 2) != 0) {
            periodUnit = period.unit;
        }
        return period.copy(num, periodUnit);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(Period self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.A(serialDesc, 0, c77.a, self.count);
        output.A(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.unit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PeriodUnit getUnit() {
        return this.unit;
    }

    public final Period copy(Integer count, PeriodUnit unit) {
        return new Period(count, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Period)) {
            return false;
        }
        Period period = (Period) other;
        return pa7.t(this.count, period.count) && this.unit == period.unit;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final PeriodUnit getUnit() {
        return this.unit;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        PeriodUnit periodUnit = this.unit;
        return iHashCode + (periodUnit != null ? periodUnit.hashCode() : 0);
    }

    public String toString() {
        return "Period(count=" + this.count + ", unit=" + this.unit + ")";
    }

    public Period(Integer num, PeriodUnit periodUnit) {
        this.count = num;
        this.unit = periodUnit;
    }
}
