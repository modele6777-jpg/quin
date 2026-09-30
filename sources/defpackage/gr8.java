package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gr8 {
    public final String a;
    public final Map b;

    public gr8(String str, Map map) {
        this.a = str;
        this.b = vpf.U(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr8)) {
            return false;
        }
        gr8 gr8Var = (gr8) obj;
        return pa7.t(this.a, gr8Var.a) && pa7.t(this.b, gr8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }
}
