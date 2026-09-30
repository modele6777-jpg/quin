package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xy6 implements ejb {
    public final u09 a;

    public xy6(u09 u09Var) {
        this.a = u09Var;
    }

    public final boolean equals(Object obj) {
        xy6 xy6Var = obj instanceof xy6 ? (xy6) obj : null;
        return this.a.equals(xy6Var != null ? xy6Var.a : null);
    }

    @Override // defpackage.ejb, defpackage.prf
    public final tt7 getType() {
        tjd tjdVarS = this.a.S();
        tjdVarS.getClass();
        return tjdVarS;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        tjd tjdVarS = this.a.S();
        tjdVarS.getClass();
        sb.append(tjdVarS);
        sb.append('}');
        return sb.toString();
    }
}
