package defpackage;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gb {
    public final String a;
    public final boolean b;
    public final String c;
    public final Integer d;
    public final Instant e;
    public final boolean f;

    public gb(String str, boolean z, String str2, Integer num, Instant instant, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = num;
        this.e = instant;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return pa7.t(this.a, gbVar.a) && this.b == gbVar.b && pa7.t(this.c, gbVar.c) && pa7.t(this.d, gbVar.d) && pa7.t(this.e, gbVar.e) && this.f == gbVar.f;
    }

    public final int hashCode() {
        int iD = ub3.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Instant instant = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AccountUsageDetailRowModel(label=" + this.a + ", active=" + this.b + ", expiresAt=" + this.c + ", remainingPercent=" + this.d + ", sortAt=" + this.e + ", showInfoBadge=" + this.f + ")";
    }

    public /* synthetic */ gb(String str, boolean z, String str2, Instant instant) {
        this(str, z, str2, null, instant, false);
    }
}
