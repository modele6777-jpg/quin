package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rv1 {
    public static final rv1 c = new rv1(s72.o1(new ArrayList()), null);
    public final Set a;
    public final hkg b;

    public rv1(Set set, hkg hkgVar) {
        this.a = set;
        this.b = hkgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rv1)) {
            return false;
        }
        rv1 rv1Var = (rv1) obj;
        return rv1Var.a.equals(this.a) && pa7.t(rv1Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        hkg hkgVar = this.b;
        return iHashCode + (hkgVar != null ? hkgVar.hashCode() : 0);
    }
}
