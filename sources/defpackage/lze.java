package defpackage;

import java.time.LocalTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lze {
    public static final LocalTime a = LocalTime.of(18, 0);
    public static final LocalTime b = LocalTime.of(23, 59);

    public static LocalTime a(int i, int i2) {
        LocalTime localTimeOf = (i < 0 || i >= 24 || i2 < 0 || i2 >= 60) ? null : LocalTime.of(i, i2);
        if (localTimeOf != null && localTimeOf.compareTo(a) >= 0 && localTimeOf.compareTo(b) <= 0) {
            return localTimeOf;
        }
        return null;
    }
}
