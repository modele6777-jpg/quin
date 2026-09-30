package defpackage;

import tech.chatmind.api.TarotReadingHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lp5 implements op5 {
    public final String a;
    public final TarotReadingHistory b;

    static {
        hje hjeVar = TarotReadingHistory.Companion;
    }

    public lp5(String str, TarotReadingHistory tarotReadingHistory) {
        this.a = str;
        this.b = tarotReadingHistory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp5)) {
            return false;
        }
        lp5 lp5Var = (lp5) obj;
        return this.a.equals(lp5Var.a) && pa7.t(this.b, lp5Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        TarotReadingHistory tarotReadingHistory = this.b;
        return iHashCode + (tarotReadingHistory == null ? 0 : tarotReadingHistory.hashCode());
    }

    public final String toString() {
        return "Completed(accumulatedText=" + this.a + ", history=" + this.b + ")";
    }
}
