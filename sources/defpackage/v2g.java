package defpackage;

import java.io.Serializable;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v2g implements Serializable {
    private final LocalDate date;
    private final w2g position;

    public v2g(LocalDate localDate, w2g w2gVar) {
        this.date = localDate;
        this.position = w2gVar;
    }

    public final LocalDate a() {
        return this.date;
    }

    public final w2g b() {
        return this.position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2g)) {
            return false;
        }
        v2g v2gVar = (v2g) obj;
        return pa7.t(this.date, v2gVar.date) && this.position == v2gVar.position;
    }

    public final int hashCode() {
        return this.position.hashCode() + (this.date.hashCode() * 31);
    }

    public final String toString() {
        return "WeekDay(date=" + this.date + ", position=" + this.position + ")";
    }
}
