package defpackage;

import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import java.time.Instant;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lc4 {
    public final String a;
    public final Instant b;
    public final Instant c;
    public final Instant d;
    public final String e;
    public final int f;
    public final boolean g;
    public final SceneTarot h;
    public final InterruptedDrawing i;
    public final String j;
    public final String k;
    public final Integer l;
    public final PhysicalDeckReading m;
    public final String n;
    public final tdb o;
    public final List p;
    public final boolean q;

    public lc4(String str, Instant instant, Instant instant2, Instant instant3, String str2, int i, boolean z, SceneTarot sceneTarot, InterruptedDrawing interruptedDrawing, String str3, String str4, Integer num, PhysicalDeckReading physicalDeckReading, String str5, tdb tdbVar, List list, boolean z2) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        tdbVar.getClass();
        this.a = str;
        this.b = instant;
        this.c = instant2;
        this.d = instant3;
        this.e = str2;
        this.f = i;
        this.g = z;
        this.h = sceneTarot;
        this.i = interruptedDrawing;
        this.j = str3;
        this.k = str4;
        this.l = num;
        this.m = physicalDeckReading;
        this.n = str5;
        this.o = tdbVar;
        this.p = list;
        this.q = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc4)) {
            return false;
        }
        lc4 lc4Var = (lc4) obj;
        return pa7.t(this.a, lc4Var.a) && this.b.equals(lc4Var.b) && this.c.equals(lc4Var.c) && pa7.t(this.d, lc4Var.d) && pa7.t(this.e, lc4Var.e) && this.f == lc4Var.f && this.g == lc4Var.g && pa7.t(this.h, lc4Var.h) && pa7.t(this.i, lc4Var.i) && pa7.t(this.j, lc4Var.j) && pa7.t(this.k, lc4Var.k) && pa7.t(this.l, lc4Var.l) && pa7.t(this.m, lc4Var.m) && pa7.t(this.n, lc4Var.n) && this.o == lc4Var.o && pa7.t(this.p, lc4Var.p) && this.q == lc4Var.q;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Instant instant = this.d;
        int iD = ub3.d(ub3.b(this.f, ub3.c((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.e), 31), 31, this.g);
        SceneTarot sceneTarot = this.h;
        int iHashCode2 = (iD + (sceneTarot == null ? 0 : sceneTarot.hashCode())) * 31;
        InterruptedDrawing interruptedDrawing = this.i;
        int iHashCode3 = (iHashCode2 + (interruptedDrawing == null ? 0 : interruptedDrawing.hashCode())) * 31;
        String str = this.j;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 961;
        Integer num = this.l;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        PhysicalDeckReading physicalDeckReading = this.m;
        int iHashCode7 = (this.o.hashCode() + ub3.c((iHashCode6 + (physicalDeckReading == null ? 0 : physicalDeckReading.hashCode())) * 31, 31, this.n)) * 31;
        List list = this.p;
        return Boolean.hashCode(this.q) + ((iHashCode7 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivinationListItem(id=");
        sb.append(this.a);
        sb.append(", createAt=");
        sb.append(this.b);
        sb.append(", updateAt=");
        sb.append(this.c);
        sb.append(", drawnAt=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", messageCount=");
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
        sb.append(this.k);
        sb.append(", aiRecommendedSpreads=null, selectedAiSpreadIndex=");
        sb.append(this.l);
        sb.append(", physicalDeckReading=");
        sb.append(this.m);
        sb.append(", previewMessage=");
        sb.append(this.n);
        sb.append(", readState=");
        sb.append(this.o);
        sb.append(", summaryCards=");
        sb.append(this.p);
        sb.append(", isLocalOnly=");
        return ub3.m(sb, this.q, ")");
    }
}
