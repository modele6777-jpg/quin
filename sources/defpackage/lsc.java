package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lsc {
    public final a56 a;
    public final pu1 b;
    public final kpb c;
    public final use d;
    public final mic e;
    public final boolean f;

    public /* synthetic */ lsc(a56 a56Var, pu1 pu1Var, kpb kpbVar, use useVar, mic micVar, int i) {
        this((i & 1) != 0 ? null : a56Var, (i & 2) != 0 ? null : pu1Var, (i & 4) != 0 ? null : kpbVar, (i & 8) != 0 ? new use("", 2) : useVar, micVar, true);
    }

    public static lsc a(lsc lscVar, a56 a56Var, pu1 pu1Var, kpb kpbVar, int i) {
        if ((i & 1) != 0) {
            a56Var = lscVar.a;
        }
        a56 a56Var2 = a56Var;
        if ((i & 2) != 0) {
            pu1Var = lscVar.b;
        }
        pu1 pu1Var2 = pu1Var;
        if ((i & 4) != 0) {
            kpbVar = lscVar.c;
        }
        use useVar = lscVar.d;
        mic micVar = lscVar.e;
        boolean z = lscVar.f;
        useVar.getClass();
        micVar.getClass();
        return new lsc(a56Var2, pu1Var2, kpbVar, useVar, micVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsc)) {
            return false;
        }
        lsc lscVar = (lsc) obj;
        return this.a == lscVar.a && this.b == lscVar.b && this.c == lscVar.c && pa7.t(this.d, lscVar.d) && this.e == lscVar.e && this.f == lscVar.f;
    }

    public final int hashCode() {
        a56 a56Var = this.a;
        int iHashCode = (a56Var == null ? 0 : a56Var.hashCode()) * 31;
        pu1 pu1Var = this.b;
        int iHashCode2 = (iHashCode + (pu1Var == null ? 0 : pu1Var.hashCode())) * 31;
        kpb kpbVar = this.c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (kpbVar != null ? kpbVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SeasonalUiState(gender=" + this.a + ", career=" + this.b + ", relationshipStatus=" + this.c + ", question=" + this.d + ", season=" + this.e + ", unlocked=" + this.f + ")";
    }

    public lsc(a56 a56Var, pu1 pu1Var, kpb kpbVar, use useVar, mic micVar, boolean z) {
        useVar.getClass();
        this.a = a56Var;
        this.b = pu1Var;
        this.c = kpbVar;
        this.d = useVar;
        this.e = micVar;
        this.f = z;
    }
}
