package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k0e {
    public final th a;
    public final uh b;
    public final vr0 c;
    public final yi5 d;
    public final List e;
    public final List f;
    public final List g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;

    public k0e(th thVar, uh uhVar, vr0 vr0Var, yi5 yi5Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = thVar;
        this.b = uhVar;
        this.c = vr0Var;
        this.d = yi5Var;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = bool;
        this.i = bool2;
        this.j = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0e)) {
            return false;
        }
        k0e k0eVar = (k0e) obj;
        return pa7.t(this.a, k0eVar.a) && pa7.t(this.b, k0eVar.b) && pa7.t(this.c, k0eVar.c) && pa7.t(this.d, k0eVar.d) && pa7.t(this.e, k0eVar.e) && pa7.t(this.f, k0eVar.f) && pa7.t(this.g, k0eVar.g) && pa7.t(this.h, k0eVar.h) && pa7.t(this.i, k0eVar.i) && pa7.t(this.j, k0eVar.j);
    }

    public final int hashCode() {
        th thVar = this.a;
        int iHashCode = (thVar == null ? 0 : Integer.hashCode(thVar.a)) * 31;
        uh uhVar = this.b;
        int iHashCode2 = (iHashCode + (uhVar == null ? 0 : Integer.hashCode(uhVar.a))) * 31;
        vr0 vr0Var = this.c;
        int iHashCode3 = (iHashCode2 + (vr0Var == null ? 0 : Integer.hashCode(vr0Var.a))) * 31;
        yi5 yi5Var = this.d;
        int iHashCode4 = (iHashCode3 + (yi5Var == null ? 0 : Integer.hashCode(yi5Var.a))) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.g;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "State3A(aeMode=" + this.a + ", afMode=" + this.b + ", awbMode=" + this.c + ", flashMode=" + this.d + ", aeRegions=" + this.e + ", afRegions=" + this.f + ", awbRegions=" + this.g + ", aeLock=" + this.h + ", afLock=" + this.i + ", awbLock=" + this.j + ')';
    }
}
