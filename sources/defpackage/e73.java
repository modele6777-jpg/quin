package defpackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e73 {
    public static final LocalTime a;

    static {
        LocalTime localTimeOf = LocalTime.of(18, 0);
        localTimeOf.getClass();
        a = localTimeOf;
    }

    public static h73 a(LocalDateTime localDateTime) {
        return localDateTime.toLocalTime().compareTo(a) < 0 ? h73.a : h73.b;
    }

    public static b93 b(LocalDateTime localDateTime) {
        LocalDate localDate = localDateTime.toLocalDate();
        localDate.getClass();
        return new b93(localDate, localDate.plusDays(1L));
    }
}
