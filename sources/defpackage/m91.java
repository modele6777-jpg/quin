package defpackage;

import java.io.Serializable;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m91 implements Serializable {
    private final List<List<d91>> weekDays;
    private final YearMonth yearMonth;

    public m91(YearMonth yearMonth, ArrayList arrayList) {
        this.yearMonth = yearMonth;
        this.weekDays = arrayList;
    }

    public final List a() {
        return this.weekDays;
    }

    public final YearMonth b() {
        return this.yearMonth;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m91.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        m91 m91Var = (m91) obj;
        return pa7.t(this.yearMonth, m91Var.yearMonth) && pa7.t(s72.v0((List) s72.v0(this.weekDays)), s72.v0((List) s72.v0(m91Var.weekDays))) && pa7.t(s72.F0((List) s72.F0(this.weekDays)), s72.F0((List) s72.F0(m91Var.weekDays)));
    }

    public final int hashCode() {
        return ((d91) s72.F0((List) s72.F0(this.weekDays))).hashCode() + ((((d91) s72.v0((List) s72.v0(this.weekDays))).hashCode() + (this.yearMonth.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CalendarMonth { yearMonth = " + this.yearMonth + ", firstDay = " + s72.v0((List) s72.v0(this.weekDays)) + ", lastDay = " + s72.F0((List) s72.F0(this.weekDays)) + " } ";
    }
}
