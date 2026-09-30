package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ha5 {
    public final HashMap a;
    public final boolean b;
    public final boolean c;

    public ha5(HashMap map, boolean z, boolean z2) {
        this.a = map;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha5)) {
            return false;
        }
        ha5 ha5Var = (ha5) obj;
        return this.a.equals(ha5Var.a) && this.b == ha5Var.b && this.c == ha5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ub3.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "FakeOverrideMembers(members=" + this.a + ", containsInheritedStatics=" + this.b + ", containsPackagePrivate=" + this.c + ')';
    }
}
