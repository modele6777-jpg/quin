package defpackage;

import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j6a {
    public final TarotCardChoice a;
    public final int b;

    public j6a(TarotCardChoice tarotCardChoice, int i) {
        tarotCardChoice.getClass();
        this.a = tarotCardChoice;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6a)) {
            return false;
        }
        j6a j6aVar = (j6a) obj;
        return pa7.t(this.a, j6aVar.a) && this.b == j6aVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingClarifyingCardSelection(card=" + this.a + ", wheelIndex=" + this.b + ")";
    }
}
