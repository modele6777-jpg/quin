package defpackage;

import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x12 {
    public final String a;
    public final int b;
    public final Integer c;
    public final TarotCardChoice d;

    public x12(String str, int i, Integer num, TarotCardChoice tarotCardChoice) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = tarotCardChoice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x12)) {
            return false;
        }
        x12 x12Var = (x12) obj;
        return pa7.t(this.a, x12Var.a) && this.b == x12Var.b && pa7.t(this.c, x12Var.c) && pa7.t(this.d, x12Var.d);
    }

    public final int hashCode() {
        int iB = ub3.b(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        TarotCardChoice tarotCardChoice = this.d;
        return iHashCode + (tarotCardChoice != null ? tarotCardChoice.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = ks0.p("ClarifyingTrackingMetadata(cardLabel=", this.a, ", completedBeforeRequest=", this.b, ", completedAfterDraw=");
        sbP.append(this.c);
        sbP.append(", card=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
