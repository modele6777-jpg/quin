package defpackage;

import tech.chatmind.api.events.model.EventInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fr2 implements ir2 {
    public final EventInfo a;

    static {
        oz4 oz4Var = EventInfo.Companion;
    }

    public fr2(EventInfo eventInfo) {
        this.a = eventInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr2) && this.a.equals(((fr2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MonthEvent(eventInfo=" + this.a + ")";
    }
}
