package defpackage;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g3b {
    public static volatile Long a = b();

    public static LocalDateTime a(ZoneId zoneId) {
        Long l = a;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(l != null ? l.longValue() : System.currentTimeMillis()), zoneId);
        localDateTimeOfInstant.getClass();
        return localDateTimeOfInstant;
    }

    public static Long b() throws Throwable {
        hs3 hs3Var = xqa.V;
        Object objI = z5c.I(nu4.a, new f3b(hs3Var.a, hs3Var.b, null));
        return (Long) (((Number) objI).longValue() != Long.MIN_VALUE ? objI : null);
    }
}
