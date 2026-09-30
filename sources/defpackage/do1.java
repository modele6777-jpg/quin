package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class do1 implements eo1 {
    public final Map a;
    public final Map b;

    public do1(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do1)) {
            return false;
        }
        do1 do1Var = (do1) obj;
        return this.a.equals(do1Var.a) && this.b.equals(do1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(deferred=" + this.a + ", outputSurfaceMap=" + this.b + ')';
    }
}
