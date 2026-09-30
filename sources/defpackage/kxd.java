package defpackage;

import tech.chatmind.api.TarotReadingHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kxd implements oxd {
    public final TarotReadingHistory a;

    static {
        hje hjeVar = TarotReadingHistory.Companion;
    }

    public kxd(TarotReadingHistory tarotReadingHistory) {
        this.a = tarotReadingHistory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxd) && pa7.t(this.a, ((kxd) obj).a);
    }

    public final int hashCode() {
        TarotReadingHistory tarotReadingHistory = this.a;
        if (tarotReadingHistory == null) {
            return 0;
        }
        return tarotReadingHistory.hashCode();
    }

    public final String toString() {
        return "End(history=" + this.a + ")";
    }
}
