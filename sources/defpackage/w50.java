package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w50 {
    public final a56 a;
    public final use b;
    public final kpb c;
    public final pu1 d;

    public /* synthetic */ w50() {
        this(null, new use("", 2), null, null);
    }

    public static w50 a(w50 w50Var, a56 a56Var, kpb kpbVar, pu1 pu1Var, int i) {
        if ((i & 1) != 0) {
            a56Var = w50Var.a;
        }
        use useVar = w50Var.b;
        if ((i & 4) != 0) {
            kpbVar = w50Var.c;
        }
        if ((i & 8) != 0) {
            pu1Var = w50Var.d;
        }
        w50Var.getClass();
        useVar.getClass();
        return new w50(a56Var, useVar, kpbVar, pu1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w50)) {
            return false;
        }
        w50 w50Var = (w50) obj;
        return this.a == w50Var.a && pa7.t(this.b, w50Var.b) && this.c == w50Var.c && this.d == w50Var.d;
    }

    public final int hashCode() {
        a56 a56Var = this.a;
        int iHashCode = (this.b.hashCode() + ((a56Var == null ? 0 : a56Var.hashCode()) * 31)) * 31;
        kpb kpbVar = this.c;
        int iHashCode2 = (iHashCode + (kpbVar == null ? 0 : kpbVar.hashCode())) * 31;
        pu1 pu1Var = this.d;
        return iHashCode2 + (pu1Var != null ? pu1Var.hashCode() : 0);
    }

    public final String toString() {
        return "AnnualUiState(gender=" + this.a + ", nickname=" + this.b + ", relationshipStatus=" + this.c + ", career=" + this.d + ")";
    }

    public w50(a56 a56Var, use useVar, kpb kpbVar, pu1 pu1Var) {
        this.a = a56Var;
        this.b = useVar;
        this.c = kpbVar;
        this.d = pu1Var;
    }
}
