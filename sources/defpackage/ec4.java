package defpackage;

import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import java.time.Instant;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ec4 {
    public final String a;
    public final Instant b;
    public final Instant c;
    public final String d;
    public final int e;
    public final Instant f;
    public final boolean g;
    public final SceneTarot h;
    public final InterruptedDrawing i;
    public final String j;
    public final String k;
    public final List l;
    public final Integer m;
    public final PhysicalDeckReading n;
    public final boolean o;

    public ec4(String str, Instant instant, Instant instant2, String str2, int i, Instant instant3, boolean z, SceneTarot sceneTarot, InterruptedDrawing interruptedDrawing, String str3, String str4, List list, Integer num, PhysicalDeckReading physicalDeckReading, boolean z2) {
        str.getClass();
        instant.getClass();
        instant2.getClass();
        str2.getClass();
        this.a = str;
        this.b = instant;
        this.c = instant2;
        this.d = str2;
        this.e = i;
        this.f = instant3;
        this.g = z;
        this.h = sceneTarot;
        this.i = interruptedDrawing;
        this.j = str3;
        this.k = str4;
        this.l = list;
        this.m = num;
        this.n = physicalDeckReading;
        this.o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec4)) {
            return false;
        }
        ec4 ec4Var = (ec4) obj;
        return pa7.t(this.a, ec4Var.a) && pa7.t(this.b, ec4Var.b) && pa7.t(this.c, ec4Var.c) && pa7.t(this.d, ec4Var.d) && this.e == ec4Var.e && pa7.t(this.f, ec4Var.f) && this.g == ec4Var.g && pa7.t(this.h, ec4Var.h) && pa7.t(this.i, ec4Var.i) && pa7.t(this.j, ec4Var.j) && pa7.t(this.k, ec4Var.k) && pa7.t(this.l, ec4Var.l) && pa7.t(this.m, ec4Var.m) && pa7.t(this.n, ec4Var.n) && this.o == ec4Var.o;
    }

    public final int hashCode() {
        int iB = ub3.b(this.e, ub3.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31);
        Instant instant = this.f;
        int iD = ub3.d((iB + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.g);
        SceneTarot sceneTarot = this.h;
        int iHashCode = (iD + (sceneTarot == null ? 0 : sceneTarot.hashCode())) * 31;
        InterruptedDrawing interruptedDrawing = this.i;
        int iHashCode2 = (iHashCode + (interruptedDrawing == null ? 0 : interruptedDrawing.hashCode())) * 31;
        String str = this.j;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.l;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.m;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        PhysicalDeckReading physicalDeckReading = this.n;
        return Boolean.hashCode(this.o) + ((iHashCode6 + (physicalDeckReading != null ? physicalDeckReading.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivinationItem(id=");
        sb.append(this.a);
        sb.append(", createAt=");
        sb.append(this.b);
        sb.append(", updateAt=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", messageCount=");
        sb.append(this.e);
        sb.append(", drawnAt=");
        sb.append(this.f);
        sb.append(", hasFeedback=");
        sb.append(this.g);
        sb.append(", sceneTarot=");
        sb.append(this.h);
        sb.append(", interruptedDrawing=");
        sb.append(this.i);
        sb.append(", divinationType=");
        sb.append(this.j);
        sb.append(", usedSkinType=");
        ib8.v(sb, this.k, ", aiRecommendedSpreads=", this.l, ", selectedAiSpreadIndex=");
        sb.append(this.m);
        sb.append(", physicalDeckReading=");
        sb.append(this.n);
        sb.append(", isLocalOnly=");
        return ub3.m(sb, this.o, ")");
    }
}
