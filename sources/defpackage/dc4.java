package defpackage;

import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dc4 {
    public final String a;
    public final Instant b;
    public final Instant c;
    public final Instant d;
    public final String e;
    public final fb4 f;
    public final boolean g;
    public final SceneTarot h;
    public final InterruptedDrawing i;
    public final String j;
    public final String k;
    public final Integer l;
    public final PhysicalDeckReading m;

    public dc4(String str, Instant instant, Instant instant2, Instant instant3, String str2, fb4 fb4Var, boolean z, SceneTarot sceneTarot, InterruptedDrawing interruptedDrawing, String str3, String str4, Integer num, PhysicalDeckReading physicalDeckReading) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = instant;
        this.c = instant2;
        this.d = instant3;
        this.e = str2;
        this.f = fb4Var;
        this.g = z;
        this.h = sceneTarot;
        this.i = interruptedDrawing;
        this.j = str3;
        this.k = str4;
        this.l = num;
        this.m = physicalDeckReading;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc4)) {
            return false;
        }
        dc4 dc4Var = (dc4) obj;
        return pa7.t(this.a, dc4Var.a) && this.b.equals(dc4Var.b) && this.c.equals(dc4Var.c) && pa7.t(this.d, dc4Var.d) && pa7.t(this.e, dc4Var.e) && this.f.equals(dc4Var.f) && this.g == dc4Var.g && pa7.t(this.h, dc4Var.h) && pa7.t(this.i, dc4Var.i) && pa7.t(this.j, dc4Var.j) && pa7.t(this.k, dc4Var.k) && pa7.t(this.l, dc4Var.l) && pa7.t(this.m, dc4Var.m);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Instant instant = this.d;
        int iD = ub3.d((this.f.hashCode() + ub3.c((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.e)) * 31, 31, this.g);
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
        return iHashCode6 + (physicalDeckReading != null ? physicalDeckReading.hashCode() : 0);
    }

    public final String toString() {
        return "DivinationHistoryQuery(id=" + this.a + ", createAt=" + this.b + ", updateAt=" + this.c + ", drawnAt=" + this.d + ", title=" + this.e + ", content=" + this.f + ", hasFeedback=" + this.g + ", sceneTarot=" + this.h + ", interruptedDrawing=" + this.i + ", divinationType=" + this.j + ", usedSkinType=" + this.k + ", aiRecommendedSpreads=null, selectedAiSpreadIndex=" + this.l + ", physicalDeckReading=" + this.m + ")";
    }
}
