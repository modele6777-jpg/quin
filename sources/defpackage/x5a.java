package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x5a implements y5a {
    public final r3a a;
    public final boolean b;
    public final List c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final ArrayList g;

    public x5a(r3a r3aVar, boolean z, List list, List list2, boolean z2, boolean z3) {
        list.getClass();
        list2.getClass();
        this.a = r3aVar;
        this.b = z;
        this.c = list;
        this.d = list2;
        this.e = z2;
        this.f = z3;
        List list3 = r3aVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (s72.o0(this.d, ((n07) obj).g())) {
                arrayList.add(obj);
            }
        }
        Collection collectionValues = this.a.b.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues) {
            z6e z6eVar = (z6e) obj2;
            if (s72.o0(this.c, z6eVar != null ? z6eVar.h() : null)) {
                arrayList2.add(obj2);
            }
        }
        this.g = s72.Q0(arrayList, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5a)) {
            return false;
        }
        x5a x5aVar = (x5a) obj;
        return this.a.equals(x5aVar.a) && this.b == x5aVar.b && pa7.t(this.c, x5aVar.c) && pa7.t(this.d, x5aVar.d) && this.e == x5aVar.e && this.f == x5aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ub3.d(tec.a(tec.a(ub3.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "Success(displayProducts=" + this.a + ", isPaymentTypeMatchedLocalPackage=" + this.b + ", upgradableSubsType=" + this.c + ", upgradableFlexType=" + this.d + ", hasSubscription=" + this.e + ", neverPurchased=" + this.f + ")";
    }
}
