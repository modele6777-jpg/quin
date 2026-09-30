package defpackage;

import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.personality.ShortCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dsb {
    public static final int i = ShortCard.$stable;
    public final TarotCardChoice a;
    public final ShortCard b;
    public final String c;
    public final qsc d;
    public final qsc e;
    public final zw2 f;
    public final qsc g;
    public final x92 h;

    public dsb(TarotCardChoice tarotCardChoice, ShortCard shortCard, String str, qsc qscVar, qsc qscVar2, zw2 zw2Var, qsc qscVar3, x92 x92Var) {
        str.getClass();
        this.a = tarotCardChoice;
        this.b = shortCard;
        this.c = str;
        this.d = qscVar;
        this.e = qscVar2;
        this.f = zw2Var;
        this.g = qscVar3;
        this.h = x92Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsb)) {
            return false;
        }
        dsb dsbVar = (dsb) obj;
        return this.a.equals(dsbVar.a) && this.b.equals(dsbVar.b) && pa7.t(this.c, dsbVar.c) && this.d.equals(dsbVar.d) && this.e.equals(dsbVar.e) && this.f.equals(dsbVar.f) && this.g.equals(dsbVar.g) && this.h.equals(dsbVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ub3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ReportModel(tarotCard=" + this.a + ", shortCard=" + this.b + ", tarotCardDesc=" + this.c + ", personality=" + this.d + ", romance=" + this.e + ", cp=" + this.f + ", profession=" + this.g + ", cosmic=" + this.h + ")";
    }
}
