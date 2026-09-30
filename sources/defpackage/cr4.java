package defpackage;

import java.util.Objects;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cr4 implements zq4 {
    public long a;
    public long b;
    public aye c;

    public final long a(int i) {
        long jAbs = Math.abs(this.a);
        long j = this.b;
        return (j == 0 || Math.abs((((double) j) / ((double) ((ResourcesTimeUnit) this.c).c)) * 100.0d) <= ((double) i)) ? jAbs : jAbs + 1;
    }

    public final boolean b() {
        return !c();
    }

    public final boolean c() {
        return this.a < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cr4.class != obj.getClass()) {
            return false;
        }
        cr4 cr4Var = (cr4) obj;
        if (this.b == cr4Var.b && this.a == cr4Var.a) {
            return Objects.equals(this.c, cr4Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c) + ib8.b(ib8.b(31, 31, this.b), 31, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DurationImpl [");
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.c);
        sb.append(", delta=");
        return tec.h(this.b, "]", sb);
    }
}
