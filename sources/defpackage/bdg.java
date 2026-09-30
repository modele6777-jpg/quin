package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = kdg.class)
public final class bdg implements Comparable<bdg>, Serializable {
    public static final adg Companion = new adg();
    private static final long serialVersionUID = 0;
    private final YearMonth value;

    public bdg(int i, int i2) {
        try {
            YearMonth yearMonthOf = YearMonth.of(i, i2);
            yearMonthOf.getClass();
            this.value = yearMonthOf;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new myc(11, this);
    }

    public final int a() {
        return this.value.getMonthValue();
    }

    public final int b() {
        return this.value.getYear();
    }

    @Override // java.lang.Comparable
    public final int compareTo(bdg bdgVar) {
        bdg bdgVar2 = bdgVar;
        bdgVar2.getClass();
        return this.value.compareTo(bdgVar2.value);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bdg) && pa7.t(this.value, ((bdg) obj).value);
        }
        return true;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        String str = ((DateTimeFormatter) jdg.a.getValue()).format(this.value);
        str.getClass();
        return str;
    }

    public bdg(YearMonth yearMonth) {
        yearMonth.getClass();
        this.value = yearMonth;
    }
}
