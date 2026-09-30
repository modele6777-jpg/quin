package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x6b {
    public final long a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Instant g;
    public final String h;
    public final Instant i;
    public final String j;

    public /* synthetic */ x6b(long j, String str, boolean z, String str2, String str3, String str4, Instant instant, String str5, Instant instant2, String str6, int i) {
        this((i & 1) != 0 ? 0L : j, str, z, str2, str3, str4, instant, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? ib8.i() : str5, (i & 256) != 0 ? null : instant2, (i & 512) != 0 ? "" : str6);
    }

    public static x6b a(x6b x6bVar, long j, String str, String str2, int i) {
        long j2 = (i & 1) != 0 ? x6bVar.a : j;
        String str3 = x6bVar.b;
        boolean z = x6bVar.c;
        String str4 = x6bVar.d;
        String str5 = x6bVar.e;
        String str6 = x6bVar.f;
        Instant instant = x6bVar.g;
        String str7 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? x6bVar.h : str;
        Instant instant2 = x6bVar.i;
        String str8 = (i & 512) != 0 ? x6bVar.j : str2;
        x6bVar.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        instant.getClass();
        str7.getClass();
        str8.getClass();
        return new x6b(j2, str3, z, str4, str5, str6, instant, str7, instant2, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6b)) {
            return false;
        }
        x6b x6bVar = (x6b) obj;
        return this.a == x6bVar.a && pa7.t(this.b, x6bVar.b) && this.c == x6bVar.c && pa7.t(this.d, x6bVar.d) && pa7.t(this.e, x6bVar.e) && pa7.t(this.f, x6bVar.f) && pa7.t(this.g, x6bVar.g) && pa7.t(this.h, x6bVar.h) && pa7.t(this.i, x6bVar.i) && pa7.t(this.j, x6bVar.j);
    }

    public final int hashCode() {
        int iC = ub3.c((this.g.hashCode() + ub3.c(ub3.c(ub3.c(ub3.d(ub3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
        Instant instant = this.i;
        return this.j.hashCode() + ((iC + (instant == null ? 0 : instant.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickDecisionEntity(id=");
        sb.append(this.a);
        sb.append(", cardKey=");
        sb.append(this.b);
        sb.append(", isReversed=");
        sb.append(this.c);
        sb.append(", answer=");
        sb.append(this.d);
        ub3.v(sb, ", tagline=", this.e, ", reading=", this.f);
        sb.append(", drawnAt=");
        sb.append(this.g);
        sb.append(", chatId=");
        sb.append(this.h);
        sb.append(", syncedAt=");
        sb.append(this.i);
        sb.append(", accountId=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public x6b(long j, String str, boolean z, String str2, String str3, String str4, Instant instant, String str5, Instant instant2, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = instant;
        this.h = str5;
        this.i = instant2;
        this.j = str6;
    }
}
