package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o3f {
    public final x95 a;
    public final ood b;
    public final vv1 c;
    public final aec d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ o3f(x95 x95Var, ood oodVar, vv1 vv1Var, aec aecVar, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : x95Var, (i & 2) != 0 ? null : oodVar, (i & 4) != 0 ? null : vv1Var, (i & 8) != 0 ? null : aecVar, (i & 32) == 0, (i & 64) != 0 ? qu4.a : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3f)) {
            return false;
        }
        o3f o3fVar = (o3f) obj;
        return pa7.t(this.a, o3fVar.a) && pa7.t(this.b, o3fVar.b) && pa7.t(this.c, o3fVar.c) && pa7.t(this.d, o3fVar.d) && this.e == o3fVar.e && pa7.t(this.f, o3fVar.f);
    }

    public final int hashCode() {
        x95 x95Var = this.a;
        int iHashCode = (x95Var == null ? 0 : x95Var.hashCode()) * 31;
        ood oodVar = this.b;
        int iHashCode2 = (iHashCode + (oodVar == null ? 0 : oodVar.hashCode())) * 31;
        vv1 vv1Var = this.c;
        int iHashCode3 = (iHashCode2 + (vv1Var == null ? 0 : vv1Var.hashCode())) * 31;
        aec aecVar = this.d;
        return this.f.hashCode() + ub3.d((iHashCode3 + (aecVar != null ? aecVar.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }

    public o3f(x95 x95Var, ood oodVar, vv1 vv1Var, aec aecVar, boolean z, Map map) {
        this.a = x95Var;
        this.b = oodVar;
        this.c = vv1Var;
        this.d = aecVar;
        this.e = z;
        this.f = map;
    }
}
