package defpackage;

import java.time.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cr0 {
    public static final LocalDateTime a = LocalDateTime.of(2026, 9, 9, 0, 0);
    public static final LocalDateTime b;
    public static final LocalDateTime c;
    public static final LocalDateTime d;

    static {
        LocalDateTime localDateTimeOf = LocalDateTime.of(2026, 9, 23, 0, 0);
        localDateTimeOf.getClass();
        b = localDateTimeOf;
        c = LocalDateTime.of(2026, 9, 24, 0, 0);
        LocalDateTime localDateTimeOf2 = LocalDateTime.of(2026, 9, 23, 10, 0);
        localDateTimeOf2.getClass();
        d = localDateTimeOf2;
    }

    public static boolean a(ax5 ax5Var, boolean z) {
        ax5Var.getClass();
        int iOrdinal = ax5Var.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return z;
        }
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return true;
        }
        ap.c();
        return false;
    }

    public static boolean b(LocalDateTime localDateTime) {
        int iOrdinal = c(localDateTime).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                ap.c();
                return false;
            }
        }
        return false;
    }

    public static nic c(LocalDateTime localDateTime) {
        if (localDateTime.isBefore(a)) {
            return nic.a;
        }
        if (localDateTime.isBefore(b)) {
            return nic.b;
        }
        return localDateTime.isBefore(c) ? nic.c : nic.d;
    }
}
