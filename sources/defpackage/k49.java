package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k49 implements qu8 {
    public final float a;
    public final j49 b;
    public final j49 c;

    public k49(float f, j49 j49Var, j49 j49Var2) {
        this.a = f;
        this.b = j49Var;
        this.c = j49Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k49)) {
            return false;
        }
        k49 k49Var = (k49) obj;
        return Float.compare(this.a, k49Var.a) == 0 && Objects.equals(this.b, k49Var.b) && Objects.equals(this.c, k49Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        j49 j49Var = this.b;
        int iHashCode2 = (iHashCode + (j49Var != null ? j49Var.hashCode() : 0)) * 31;
        j49 j49Var2 = this.c;
        return iHashCode2 + (j49Var2 != null ? j49Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
