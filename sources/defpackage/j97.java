package defpackage;

import tech.chatmind.api.TarotReadingHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j97 {
    public final String a;
    public final TarotReadingHistory b;

    static {
        hje hjeVar = TarotReadingHistory.Companion;
    }

    public j97(String str, TarotReadingHistory tarotReadingHistory) {
        this.a = str;
        this.b = tarotReadingHistory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j97)) {
            return false;
        }
        j97 j97Var = (j97) obj;
        return this.a.equals(j97Var.a) && pa7.t(this.b, j97Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        TarotReadingHistory tarotReadingHistory = this.b;
        return iHashCode + (tarotReadingHistory == null ? 0 : tarotReadingHistory.hashCode());
    }

    public final String toString() {
        return "InterpretResult(text=" + this.a + ", history=" + this.b + ")";
    }
}
