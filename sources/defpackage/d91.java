package defpackage;

import java.io.Serializable;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d91 implements Serializable {
    private final LocalDate date;
    private final hh3 position;

    public d91(LocalDate localDate, hh3 hh3Var) {
        this.date = localDate;
        this.position = hh3Var;
    }

    public final LocalDate a() {
        return this.date;
    }

    public final hh3 b() {
        return this.position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d91)) {
            return false;
        }
        d91 d91Var = (d91) obj;
        return pa7.t(this.date, d91Var.date) && this.position == d91Var.position;
    }

    public final int hashCode() {
        return this.position.hashCode() + (this.date.hashCode() * 31);
    }

    public final String toString() {
        return "CalendarDay(date=" + this.date + ", position=" + this.position + ")";
    }
}
