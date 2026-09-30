package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dm7 {
    public static final dm7 j = new dm7(null, null, null, null, pu4.a, false, false, false, false);
    public final fo7 a;
    public final d09 b;
    public final Boolean c;
    public final xm7 d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public dm7(fo7 fo7Var, d09 d09Var, Boolean bool, xm7 xm7Var, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = fo7Var;
        this.b = d09Var;
        this.c = bool;
        this.d = xm7Var;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public static dm7 a(dm7 dm7Var, fo7 fo7Var, d09 d09Var, Boolean bool, xm7 xm7Var, List list, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            fo7Var = dm7Var.a;
        }
        fo7 fo7Var2 = fo7Var;
        if ((i & 2) != 0) {
            d09Var = dm7Var.b;
        }
        d09 d09Var2 = d09Var;
        if ((i & 4) != 0) {
            bool = dm7Var.c;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            xm7Var = dm7Var.d;
        }
        xm7 xm7Var2 = xm7Var;
        if ((i & 16) != 0) {
            list = dm7Var.e;
        }
        List list2 = list;
        boolean z5 = (i & 32) != 0 ? dm7Var.f : z;
        boolean z6 = (i & 64) != 0 ? dm7Var.g : z2;
        boolean z7 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? dm7Var.h : z3;
        boolean z8 = (i & 256) != 0 ? dm7Var.i : z4;
        dm7Var.getClass();
        list2.getClass();
        return new dm7(fo7Var2, d09Var2, bool2, xm7Var2, list2, z5, z6, z7, z8);
    }

    public final fo7 b(String str, List list) {
        fo7 fo7Var;
        str.getClass();
        fo7 fo7VarG = ia5.g(this.e, list);
        fo7 fo7Var2 = this.a;
        if (fo7VarG != null) {
            fo7 fo7Var3 = fo7Var2 == null ? fo7.c : fo7Var2;
            Map map = fo7VarG.a;
            fo7Var3.getClass();
            Map map2 = fo7Var3.a;
            boolean z = fo7VarG.b || fo7Var3.b;
            if (map.isEmpty()) {
                fo7Var = fo7Var3.a(z);
            } else if (map2.isEmpty()) {
                fo7Var = fo7VarG.a(z);
            } else {
                LinkedHashSet linkedHashSetA0 = s72.A0(map.keySet(), map2.keySet());
                if (!linkedHashSetA0.isEmpty()) {
                    ho7.j(ib8.m(new StringBuilder("Substitutors must not have intersecting keys: "), s72.D0(linkedHashSetA0, null, null, null, null, 63), ". Member: ", str));
                    return null;
                }
                fo7Var = new fo7(bm8.L(map, map2), z);
            }
            if (fo7Var != null) {
                return fo7Var;
            }
        }
        return fo7Var2 == null ? fo7.c : fo7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm7)) {
            return false;
        }
        dm7 dm7Var = (dm7) obj;
        return pa7.t(this.a, dm7Var.a) && this.b == dm7Var.b && pa7.t(this.c, dm7Var.c) && pa7.t(this.d, dm7Var.d) && this.e.equals(dm7Var.e) && this.f == dm7Var.f && this.g == dm7Var.g && this.h == dm7Var.h && this.i == dm7Var.i;
    }

    public final int hashCode() {
        fo7 fo7Var = this.a;
        int iHashCode = (fo7Var == null ? 0 : fo7Var.hashCode()) * 31;
        d09 d09Var = this.b;
        int iHashCode2 = (iHashCode + (d09Var == null ? 0 : d09Var.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        xm7 xm7Var = this.d;
        return Boolean.hashCode(this.i) + ub3.d(ub3.d(ub3.d(tec.a((iHashCode3 + (xm7Var != null ? xm7Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        return "KCallableOverriddenStorage(classTypeParametersSubstitutor=" + this.a + ", modality=" + this.b + ", isStatic=" + this.c + ", originalContainerIfFakeOverride=" + this.d + ", originalCallableTypeParameters=" + this.e + ", forceIsExternal=" + this.f + ", forceIsOperator=" + this.g + ", forceIsInfix=" + this.h + ", forceIsInline=" + this.i + ')';
    }
}
