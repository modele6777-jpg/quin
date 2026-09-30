package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e95 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final Long i;
    public final Long j;
    public final int k;
    public final Long l;
    public final boolean m;
    public final String n;
    public final String o;

    public e95(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, Long l, Long l2, int i, Long l3, boolean z, String str8, String str9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = str6;
        this.h = str7;
        this.i = l;
        this.j = l2;
        this.k = i;
        this.l = l3;
        this.m = z;
        this.n = str8;
        this.o = str9;
    }

    public static e95 a(e95 e95Var, String str, String str2, Long l, int i, Long l2, String str3, int i2) {
        String str4 = e95Var.a;
        String str5 = e95Var.b;
        String str6 = e95Var.c;
        String str7 = e95Var.d;
        String str8 = e95Var.e;
        long j = e95Var.f;
        String str9 = (i2 & 64) != 0 ? e95Var.g : str;
        String str10 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? e95Var.h : str2;
        Long l3 = (i2 & 256) != 0 ? e95Var.i : l;
        Long l4 = e95Var.j;
        int i3 = (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? e95Var.k : i;
        Long l5 = (i2 & 2048) != 0 ? e95Var.l : l2;
        boolean z = (i2 & 4096) != 0 ? e95Var.m : true;
        String str11 = (i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? e95Var.n : str3;
        String str12 = (i2 & 16384) != 0 ? e95Var.o : "5.23.0";
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str8.getClass();
        return new e95(str4, str5, str6, str7, str8, j, str9, str10, l3, l4, i3, l5, z, str11, str12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e95)) {
            return false;
        }
        e95 e95Var = (e95) obj;
        return pa7.t(this.a, e95Var.a) && pa7.t(this.b, e95Var.b) && pa7.t(this.c, e95Var.c) && this.d.equals(e95Var.d) && pa7.t(this.e, e95Var.e) && this.f == e95Var.f && pa7.t(this.g, e95Var.g) && pa7.t(this.h, e95Var.h) && pa7.t(this.i, e95Var.i) && pa7.t(this.j, e95Var.j) && this.k == e95Var.k && pa7.t(this.l, e95Var.l) && this.m == e95Var.m && pa7.t(this.n, e95Var.n) && pa7.t(this.o, e95Var.o);
    }

    public final int hashCode() {
        int iB = ib8.b(ub3.c(ub3.c(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.i;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.j;
        int iB2 = ub3.b(this.k, (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31);
        Long l3 = this.l;
        int iD = ub3.d((iB2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.m);
        String str3 = this.n;
        int iHashCode4 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("ExternalShareOperation(id=", this.a, ", source=", this.b, ", format=");
        ub3.v(sbO, this.c, ", scene=", this.d, ", pathway=");
        sbO.append(this.e);
        sbO.append(", startedAt=");
        sbO.append(this.f);
        ub3.v(sbO, ", target=", this.g, ", result=", this.h);
        sbO.append(", chooserCleanupAfter=");
        sbO.append(this.i);
        sbO.append(", qqLaunchStartedAt=");
        sbO.append(this.j);
        sbO.append(", analyticsAttemptCount=");
        sbO.append(this.k);
        sbO.append(", analyticsLastAttemptAt=");
        sbO.append(this.l);
        sbO.append(", terminalFailureFeedbackConsumed=");
        sbO.append(this.m);
        sbO.append(", resultAppState=");
        sbO.append(this.n);
        return ib8.m(sbO, ", resultAppVersion=", this.o, ")");
    }
}
