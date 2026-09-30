package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yof {
    public static final yof n = new yof("", "", "", "", null, null, n2f.a, null, null, null, null, 8096);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final List f;
    public final n2f g;
    public final List h;
    public final List i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ yof(String str, String str2, String str3, String str4, Integer num, List list, n2f n2fVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
        int i2 = i & 32;
        pu4 pu4Var = pu4.a;
        this(str, str2, str3, str4, num, i2 != 0 ? pu4Var : list, n2fVar, pu4Var, pu4Var, (i & 512) != 0 ? null : bool, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : bool2, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : bool4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yof)) {
            return false;
        }
        yof yofVar = (yof) obj;
        return pa7.t(this.a, yofVar.a) && pa7.t(this.b, yofVar.b) && pa7.t(this.c, yofVar.c) && pa7.t(this.d, yofVar.d) && pa7.t(this.e, yofVar.e) && pa7.t(this.f, yofVar.f) && this.g == yofVar.g && pa7.t(this.h, yofVar.h) && pa7.t(this.i, yofVar.i) && pa7.t(this.j, yofVar.j) && pa7.t(this.k, yofVar.k) && pa7.t(this.l, yofVar.l) && pa7.t(this.m, yofVar.m);
    }

    public final int hashCode() {
        int iC = ub3.c(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        int iA = tec.a(tec.a((this.g.hashCode() + tec.a((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.f)) * 31, 31, this.h), 31, this.i);
        Boolean bool = this.j;
        int iHashCode = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.k;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.l;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.m;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("UserProfileInfo(nickname=", this.a, ", gender=", this.b, ", birthday=");
        ub3.v(sbO, this.c, ", selfDescription=", this.d, ", customizedCardBack=");
        sbO.append(this.e);
        sbO.append(", purchasedSkins=");
        sbO.append(this.f);
        sbO.append(", usingSkinType=");
        sbO.append(this.g);
        sbO.append(", quinSource=");
        sbO.append(this.h);
        sbO.append(", intentions=");
        sbO.append(this.i);
        sbO.append(", optOutAllServerPush=");
        sbO.append(this.j);
        sbO.append(", optOutDailyTarotLocalPush=");
        sbO.append(this.k);
        sbO.append(", optOutTomorrowTarotLocalPush=");
        sbO.append(this.l);
        sbO.append(", appReviewClaimed=");
        sbO.append(this.m);
        sbO.append(")");
        return sbO.toString();
    }

    public yof(String str, String str2, String str3, String str4, Integer num, List list, n2f n2fVar, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        n2fVar.getClass();
        list2.getClass();
        list3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = list;
        this.g = n2fVar;
        this.h = list2;
        this.i = list3;
        this.j = bool;
        this.k = bool2;
        this.l = bool3;
        this.m = bool4;
    }
}
