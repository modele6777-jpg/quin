package defpackage;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e19 {
    public final YearMonth a;
    public final int b;
    public final int c;
    public final LocalDate d;
    public final YearMonth e;
    public final YearMonth f;
    public final m91 g;

    public e19(YearMonth yearMonth, int i, int i2) {
        hh3 hh3Var;
        this.a = yearMonth;
        this.b = i;
        this.c = i2;
        int iLengthOfMonth = yearMonth.lengthOfMonth() + i + i2;
        LocalDate localDateAtDay = yearMonth.atDay(1);
        localDateAtDay.getClass();
        this.d = localDateAtDay.minusDays(i);
        ArrayList<List> arrayListN0 = s72.n0(mh3.c0(0, iLengthOfMonth), 7);
        YearMonth yearMonthMinusMonths = yearMonth.minusMonths(1L);
        yearMonthMinusMonths.getClass();
        this.e = yearMonthMinusMonths;
        YearMonth yearMonthPlusMonths = yearMonth.plusMonths(1L);
        yearMonthPlusMonths.getClass();
        this.f = yearMonthPlusMonths;
        ArrayList arrayList = new ArrayList(t72.u(arrayListN0, 10));
        for (List list : arrayListN0) {
            ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LocalDate localDatePlusDays = this.d.plusDays(((Number) it.next()).intValue());
                localDatePlusDays.getClass();
                YearMonth yearMonthB = tq.B(localDatePlusDays);
                YearMonth yearMonth2 = this.a;
                if (yearMonthB.equals(yearMonth2)) {
                    hh3Var = hh3.b;
                } else if (yearMonthB.equals(this.e)) {
                    hh3Var = hh3.a;
                } else {
                    if (!yearMonthB.equals(this.f)) {
                        s8f.k("Invalid date: ", localDatePlusDays, " in month: ", yearMonth2);
                        throw null;
                    }
                    hh3Var = hh3.c;
                }
                arrayList2.add(new d91(localDatePlusDays, hh3Var));
            }
            arrayList.add(arrayList2);
        }
        this.g = new m91(yearMonth, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e19)) {
            return false;
        }
        e19 e19Var = (e19) obj;
        return this.a.equals(e19Var.a) && this.b == e19Var.b && this.c == e19Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MonthData(month=");
        sb.append(this.a);
        sb.append(", inDays=");
        sb.append(this.b);
        sb.append(", outDays=");
        return tec.g(this.c, ")", sb);
    }
}
