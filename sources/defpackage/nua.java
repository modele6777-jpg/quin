package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nua implements yua {
    public final DailyFortuneGuideTrigger a;

    public nua(DailyFortuneGuideTrigger dailyFortuneGuideTrigger) {
        dailyFortuneGuideTrigger.getClass();
        this.a = dailyFortuneGuideTrigger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nua) && this.a == ((nua) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DailyFortuneGuide(trigger=" + this.a + ")";
    }
}
