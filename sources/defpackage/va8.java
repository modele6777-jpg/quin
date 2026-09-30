package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = ab8.class)
public final class va8 implements Comparable<va8>, Serializable {
    public static final ta8 Companion = new ta8();
    private static final long serialVersionUID = 0;
    private final LocalDateTime value;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        localDateTime.getClass();
        new va8(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        localDateTime2.getClass();
        new va8(localDateTime2);
    }

    public va8(ma8 ma8Var, kd8 kd8Var) {
        LocalDateTime localDateTimeOf = LocalDateTime.of(ma8Var.i(), kd8Var.a());
        localDateTimeOf.getClass();
        this.value = localDateTimeOf;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalDateTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new myc(4, this);
    }

    public final ma8 a() {
        LocalDate localDate = this.value.toLocalDate();
        localDate.getClass();
        return new ma8(localDate);
    }

    public final kd8 b() {
        LocalTime localTime = this.value.toLocalTime();
        localTime.getClass();
        return new kd8(localTime);
    }

    public final LocalDateTime c() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(va8 va8Var) {
        va8 va8Var2 = va8Var;
        va8Var2.getClass();
        return this.value.compareTo((ChronoLocalDateTime<?>) va8Var2.value);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof va8) && pa7.t(this.value, ((va8) obj).value);
        }
        return true;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        String string = this.value.toString();
        string.getClass();
        return string;
    }

    public va8(LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.value = localDateTime;
    }
}
