package defpackage;

import java.time.DayOfWeek;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f91 {
    public final int a;
    public final DayOfWeek b;
    public final ps9 c;

    public f91(int i, DayOfWeek dayOfWeek, ps9 ps9Var) {
        this.a = i;
        this.b = dayOfWeek;
        this.c = ps9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f91)) {
            return false;
        }
        f91 f91Var = (f91) obj;
        return this.a == f91Var.a && this.b == f91Var.b && this.c == f91Var.c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        DayOfWeek dayOfWeek = this.b;
        int iHashCode2 = (iHashCode + (dayOfWeek == null ? 0 : dayOfWeek.hashCode())) * 31;
        ps9 ps9Var = this.c;
        return iHashCode2 + (ps9Var != null ? ps9Var.hashCode() : 0);
    }

    public final String toString() {
        return "CalendarInfo(indexCount=" + this.a + ", firstDayOfWeek=" + this.b + ", outDateStyle=" + this.c + ")";
    }
}
