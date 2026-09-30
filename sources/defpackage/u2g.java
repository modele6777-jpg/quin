package defpackage;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u2g {
    public final LocalDate a;
    public final LocalDate b;
    public final LocalDate c;
    public final r2g d;

    public u2g(LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        this.a = localDate;
        this.b = localDate2;
        this.c = localDate3;
        z67 z67VarC0 = mh3.c0(0, 7);
        ArrayList arrayList = new ArrayList(t72.u(z67VarC0, 10));
        Iterator it = z67VarC0.iterator();
        while (((y67) it).c) {
            LocalDate localDatePlusDays = this.a.plusDays(((q67) it).nextInt());
            arrayList.add(new v2g(localDatePlusDays, localDatePlusDays.compareTo((ChronoLocalDate) this.b) < 0 ? w2g.a : localDatePlusDays.compareTo((ChronoLocalDate) this.c) > 0 ? w2g.c : w2g.b));
        }
        this.d = new r2g(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2g)) {
            return false;
        }
        u2g u2gVar = (u2g) obj;
        return this.a.equals(u2gVar.a) && this.b.equals(u2gVar.b) && this.c.equals(u2gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WeekData(firstDayInWeek=" + this.a + ", desiredStartDate=" + this.b + ", desiredEndDate=" + this.c + ")";
    }
}
