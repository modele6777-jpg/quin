package defpackage;

import ai.askquin.R;
import java.time.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jpc {
    public static final LocalDateTime a = LocalDateTime.of(2026, 6, 21, 10, 0);

    public static hpc a(yic yicVar) {
        mic micVarB = yicVar.b();
        int i = micVarB == null ? -1 : ipc.a[micVarB.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return new hpc(R.string.four_seasons_notification_title, R.string.four_seasons_notification_body);
        }
        if (i == 2) {
            return new hpc(R.string.four_seasons_notification_autumn_title, R.string.four_seasons_notification_autumn_body);
        }
        ap.c();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    public static kpc b(yic yicVar, LocalDateTime localDateTime) {
        LocalDateTime localDateTime2;
        yicVar.getClass();
        mic micVarB = yicVar.b();
        int i = micVarB == null ? -1 : ipc.a[micVarB.ordinal()];
        if (i == -1) {
            localDateTime2 = null;
        } else if (i == 1) {
            localDateTime2 = a;
            if (!localDateTime.isBefore(localDateTime2)) {
                localDateTime2 = null;
            }
        } else {
            if (i != 2) {
                ap.c();
                return null;
            }
            localDateTime2 = cr0.d;
            if (!localDateTime.isBefore(localDateTime2)) {
                localDateTime2 = null;
            }
        }
        if (localDateTime2 == null) {
            return null;
        }
        return new kpc(yicVar, localDateTime2);
    }
}
