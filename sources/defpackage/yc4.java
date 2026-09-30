package defpackage;

import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.Instant;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yc4 {
    public final String a;
    public final boolean b;
    public final Instant c;
    public final Instant d;
    public final Instant e;
    public final String f;
    public final int g;
    public final fb4 h;
    public final boolean i;
    public final SceneTarot j;
    public final InterruptedDrawing k;
    public final String l;
    public final String m;
    public final List n;
    public final Integer o;
    public final Instant p;
    public final Instant q;
    public final String r;
    public final PhysicalDeckReading s;
    public final String t;
    public final tdb u;
    public final List v;

    public /* synthetic */ yc4(String str, boolean z, Instant instant, Instant instant2, Instant instant3, String str2, int i, fb4 fb4Var, boolean z2, SceneTarot sceneTarot, InterruptedDrawing interruptedDrawing, String str3, String str4, List list, Integer num, Instant instant4, Instant instant5, String str5, PhysicalDeckReading physicalDeckReading, int i2) {
        this(str, z, instant, instant2, instant3, str2, i, fb4Var, z2, sceneTarot, interruptedDrawing, str3, (i2 & 4096) != 0 ? null : str4, list, num, instant4, (65536 & i2) != 0 ? null : instant5, (131072 & i2) != 0 ? "" : str5, (262144 & i2) != 0 ? null : physicalDeckReading, (i2 & 524288) == 0 ? "CursorWindow probe row" : "", tdb.b, null);
    }

    public static yc4 a(yc4 yc4Var, String str, boolean z, Instant instant, Instant instant2, int i, fb4 fb4Var, InterruptedDrawing interruptedDrawing, Instant instant3, Instant instant4, String str2, String str3, tdb tdbVar, ld4 ld4Var, int i2) {
        String str4 = (i2 & 1) != 0 ? yc4Var.a : str;
        boolean z2 = (i2 & 2) != 0 ? yc4Var.b : z;
        Instant instant5 = yc4Var.c;
        Instant instant6 = (i2 & 8) != 0 ? yc4Var.d : instant;
        Instant instant7 = (i2 & 16) != 0 ? yc4Var.e : instant2;
        String str5 = yc4Var.f;
        int i3 = (i2 & 64) != 0 ? yc4Var.g : i;
        fb4 fb4Var2 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? yc4Var.h : fb4Var;
        boolean z3 = (i2 & 256) != 0 ? yc4Var.i : false;
        SceneTarot sceneTarot = yc4Var.j;
        InterruptedDrawing interruptedDrawing2 = (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? yc4Var.k : interruptedDrawing;
        String str6 = yc4Var.l;
        String str7 = yc4Var.m;
        List list = yc4Var.n;
        Integer num = yc4Var.o;
        Instant instant8 = (i2 & 32768) != 0 ? yc4Var.p : instant3;
        Instant instant9 = (i2 & 65536) != 0 ? yc4Var.q : instant4;
        String str8 = (i2 & 131072) != 0 ? yc4Var.r : str2;
        PhysicalDeckReading physicalDeckReading = yc4Var.s;
        String str9 = (i2 & 524288) != 0 ? yc4Var.t : str3;
        tdb tdbVar2 = (i2 & 1048576) != 0 ? yc4Var.u : tdbVar;
        List list2 = (i2 & 2097152) != 0 ? yc4Var.v : ld4Var;
        yc4Var.getClass();
        str4.getClass();
        instant5.getClass();
        instant6.getClass();
        str5.getClass();
        fb4Var2.getClass();
        str8.getClass();
        str9.getClass();
        tdbVar2.getClass();
        return new yc4(str4, z2, instant5, instant6, instant7, str5, i3, fb4Var2, z3, sceneTarot, interruptedDrawing2, str6, str7, list, num, instant8, instant9, str8, physicalDeckReading, str9, tdbVar2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc4)) {
            return false;
        }
        yc4 yc4Var = (yc4) obj;
        return pa7.t(this.a, yc4Var.a) && this.b == yc4Var.b && pa7.t(this.c, yc4Var.c) && pa7.t(this.d, yc4Var.d) && pa7.t(this.e, yc4Var.e) && pa7.t(this.f, yc4Var.f) && this.g == yc4Var.g && pa7.t(this.h, yc4Var.h) && this.i == yc4Var.i && pa7.t(this.j, yc4Var.j) && pa7.t(this.k, yc4Var.k) && pa7.t(this.l, yc4Var.l) && pa7.t(this.m, yc4Var.m) && pa7.t(this.n, yc4Var.n) && pa7.t(this.o, yc4Var.o) && pa7.t(this.p, yc4Var.p) && pa7.t(this.q, yc4Var.q) && pa7.t(this.r, yc4Var.r) && pa7.t(this.s, yc4Var.s) && pa7.t(this.t, yc4Var.t) && this.u == yc4Var.u && pa7.t(this.v, yc4Var.v);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ub3.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        Instant instant = this.e;
        int iD = ub3.d((this.h.hashCode() + ub3.b(this.g, ub3.c((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.f), 31)) * 31, 31, this.i);
        SceneTarot sceneTarot = this.j;
        int iHashCode2 = (iD + (sceneTarot == null ? 0 : sceneTarot.hashCode())) * 31;
        InterruptedDrawing interruptedDrawing = this.k;
        int iHashCode3 = (iHashCode2 + (interruptedDrawing == null ? 0 : interruptedDrawing.hashCode())) * 31;
        String str = this.l;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.n;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.o;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Instant instant2 = this.p;
        int iHashCode8 = (iHashCode7 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.q;
        int iC = ub3.c((iHashCode8 + (instant3 == null ? 0 : instant3.hashCode())) * 31, 31, this.r);
        PhysicalDeckReading physicalDeckReading = this.s;
        int iHashCode9 = (this.u.hashCode() + ub3.c((iC + (physicalDeckReading == null ? 0 : physicalDeckReading.hashCode())) * 31, 31, this.t)) * 31;
        List list2 = this.v;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivinationSnapshot(id=");
        sb.append(this.a);
        sb.append(", isLocalOnly=");
        sb.append(this.b);
        sb.append(", createAt=");
        sb.append(this.c);
        sb.append(", updateAt=");
        sb.append(this.d);
        sb.append(", drawnAt=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", messageCount=");
        sb.append(this.g);
        sb.append(", content=");
        sb.append(this.h);
        sb.append(", hasFeedback=");
        sb.append(this.i);
        sb.append(", sceneTarot=");
        sb.append(this.j);
        sb.append(", interruptedDrawing=");
        sb.append(this.k);
        sb.append(", divinationType=");
        sb.append(this.l);
        sb.append(", usedSkinType=");
        ib8.v(sb, this.m, ", aiRecommendedSpreads=", this.n, ", selectedAiSpreadIndex=");
        sb.append(this.o);
        sb.append(", syncedAt=");
        sb.append(this.p);
        sb.append(", deletedAt=");
        sb.append(this.q);
        sb.append(", accountId=");
        sb.append(this.r);
        sb.append(", physicalDeckReading=");
        sb.append(this.s);
        sb.append(", previewMessage=");
        sb.append(this.t);
        sb.append(", readState=");
        sb.append(this.u);
        sb.append(", summaryCards=");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }

    public yc4(String str, boolean z, Instant instant, Instant instant2, Instant instant3, String str2, int i, fb4 fb4Var, boolean z2, SceneTarot sceneTarot, InterruptedDrawing interruptedDrawing, String str3, String str4, List list, Integer num, Instant instant4, Instant instant5, String str5, PhysicalDeckReading physicalDeckReading, String str6, tdb tdbVar, List list2) {
        str.getClass();
        instant.getClass();
        instant2.getClass();
        str2.getClass();
        str5.getClass();
        str6.getClass();
        tdbVar.getClass();
        this.a = str;
        this.b = z;
        this.c = instant;
        this.d = instant2;
        this.e = instant3;
        this.f = str2;
        this.g = i;
        this.h = fb4Var;
        this.i = z2;
        this.j = sceneTarot;
        this.k = interruptedDrawing;
        this.l = str3;
        this.m = str4;
        this.n = list;
        this.o = num;
        this.p = instant4;
        this.q = instant5;
        this.r = str5;
        this.s = physicalDeckReading;
        this.t = str6;
        this.u = tdbVar;
        this.v = list2;
    }
}
