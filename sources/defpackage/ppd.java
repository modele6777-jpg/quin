package defpackage;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ppd {
    public final long a;
    public final long b;
    public final int c;

    public ppd(long j, int i, long j2) {
        pa7.A(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ppd.class == obj.getClass()) {
            ppd ppdVar = (ppd) obj;
            if (this.a == ppdVar.a && this.b == ppdVar.b && this.c == ppdVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = pqf.a;
        Locale locale = Locale.US;
        StringBuilder sbP = ub3.p("Segment: startTimeMs=", ", endTimeMs=", this.a);
        sbP.append(this.b);
        sbP.append(", speedDivisor=");
        sbP.append(this.c);
        return sbP.toString();
    }
}
