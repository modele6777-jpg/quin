package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc(with = sa8.class)
public final class ma8 implements Comparable<ma8>, Serializable {
    public static final ka8 Companion = new ka8();
    private static final long serialVersionUID = 0;
    private final LocalDate value;

    static {
        LocalDate localDate = LocalDate.MIN;
        localDate.getClass();
        new ma8(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        localDate2.getClass();
        new ma8(localDate2);
    }

    public ma8(int i, int i2, int i3) {
        try {
            LocalDate localDateOf = LocalDate.of(i, i2, i3);
            localDateOf.getClass();
            this.value = localDateOf;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new myc(2, this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ma8 ma8Var) {
        ma8Var.getClass();
        return this.value.compareTo((ChronoLocalDate) ma8Var.value);
    }

    public final int b() {
        return this.value.getDayOfMonth();
    }

    public final int c() {
        return this.value.getDayOfMonth();
    }

    public final gh3 d() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        dayOfWeek.getClass();
        return (gh3) gh3.b.get(dayOfWeek.getValue() - 1);
    }

    public final int e() {
        return this.value.getDayOfYear();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ma8) && pa7.t(this.value, ((ma8) obj).value);
        }
        return true;
    }

    public final b19 g() {
        Month month = this.value.getMonth();
        month.getClass();
        return (b19) b19.b.get(month.getValue() - 1);
    }

    public final int h() {
        return this.value.getMonthValue();
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final LocalDate i() {
        return this.value;
    }

    public final int j() {
        return this.value.getYear();
    }

    public final String toString() {
        String string = this.value.toString();
        string.getClass();
        return string;
    }

    public ma8(LocalDate localDate) {
        localDate.getClass();
        this.value = localDate;
    }
}
