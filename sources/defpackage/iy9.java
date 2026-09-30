package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iy9 implements Serializable {
    private final Object first;
    private final Object second;

    public iy9(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public static iy9 c(iy9 iy9Var, eue eueVar) {
        return new iy9(iy9Var.first, eueVar);
    }

    public final Object a() {
        return this.first;
    }

    public final Object b() {
        return this.second;
    }

    public final Object d() {
        return this.first;
    }

    public final Object e() {
        return this.second;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy9)) {
            return false;
        }
        iy9 iy9Var = (iy9) obj;
        return pa7.t(this.first, iy9Var.first) && pa7.t(this.second, iy9Var.second);
    }

    public final int hashCode() {
        Object obj = this.first;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.second;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.first + ", " + this.second + ')';
    }
}
