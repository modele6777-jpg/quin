package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ww1 implements uw1 {
    public final long a;
    public final long b;
    public final boolean c;
    public final fu7 d;

    public ww1(long j, long j2, boolean z, fu7 fu7Var) {
        pa7.A(j == -9223372036854775807L || j2 == -9223372036854775807L || j <= j2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = fu7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ww1.class == obj.getClass()) {
            ww1 ww1Var = (ww1) obj;
            if (this.a == ww1Var.a && this.b == ww1Var.b && this.c == ww1Var.c && Objects.equals(this.d, ww1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iO = (((kn2.O(this.b) + ((kn2.O(this.a) + 527) * 31)) * 31) + (this.c ? 1 : 0)) * 31;
        fu7 fu7Var = this.d;
        return iO + (fu7Var != null ? fu7Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Chapter: startTimeMs=");
        long j = this.a;
        sb.append(j == -9223372036854775807L ? "UNSET" : Long.valueOf(j));
        long j2 = this.b;
        String str2 = "";
        if (j2 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", endTimeMs=" + j2;
        }
        sb.append(str);
        sb.append(this.c ? ", hidden" : "");
        fu7 fu7Var = this.d;
        if (fu7Var != null) {
            str2 = ", title=" + fu7Var;
        }
        sb.append(str2);
        return sb.toString();
    }
}
