package defpackage;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface e3b {
    static LocalDateTime a(e3b e3bVar) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        e3bVar.getClass();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(((u79) e3bVar).b());
        instantOfEpochMilli.getClass();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, zoneIdSystemDefault);
        localDateTimeOfInstant.getClass();
        return localDateTimeOfInstant;
    }
}
