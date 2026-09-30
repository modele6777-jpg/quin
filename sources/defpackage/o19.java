package defpackage;

import tech.chatmind.api.events.model.EventInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o19 {
    public final String a;
    public final EventInfo b;
    public final q19 c;

    public o19(String str, EventInfo eventInfo, q19 q19Var) {
        str.getClass();
        this.a = str;
        this.b = eventInfo;
        this.c = q19Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o19)) {
            return false;
        }
        o19 o19Var = (o19) obj;
        return pa7.t(this.a, o19Var.a) && this.b.equals(o19Var.b) && this.c.equals(o19Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MonthlyEventUiState(id=" + this.a + ", event=" + this.b + ", popupInfo=" + this.c + ")";
    }
}
