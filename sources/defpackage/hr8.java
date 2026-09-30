package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hr8 {
    public final bv6 a;
    public final Map b;

    public hr8(bv6 bv6Var, Map map) {
        this.a = bv6Var;
        this.b = vpf.U(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr8)) {
            return false;
        }
        hr8 hr8Var = (hr8) obj;
        return pa7.t(this.a, hr8Var.a) && pa7.t(this.b, hr8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }
}
