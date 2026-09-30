package defpackage;

import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u12 {
    public final TarotCardChoice a;
    public final int b;

    public u12(TarotCardChoice tarotCardChoice, int i) {
        this.a = tarotCardChoice;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u12)) {
            return false;
        }
        u12 u12Var = (u12) obj;
        return this.a.equals(u12Var.a) && this.b == u12Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClarifyingCardSelection(card=" + this.a + ", wheelIndex=" + this.b + ")";
    }
}
