package defpackage;

import tech.chatmind.api.events.model.EventType;
import tech.chatmind.api.events.model.Popup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uma {
    public static final int d = Popup.$stable;
    public final String a;
    public final EventType b;
    public final Popup c;

    public uma(String str, EventType eventType, Popup popup) {
        str.getClass();
        popup.getClass();
        this.a = str;
        this.b = eventType;
        this.c = popup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uma)) {
            return false;
        }
        uma umaVar = (uma) obj;
        return pa7.t(this.a, umaVar.a) && this.b == umaVar.b && pa7.t(this.c, umaVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        EventType eventType = this.b;
        return this.c.hashCode() + ((iHashCode + (eventType == null ? 0 : eventType.hashCode())) * 31);
    }

    public final String toString() {
        return "PopupUiState(id=" + this.a + ", type=" + this.b + ", popup=" + this.c + ")";
    }
}
