package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nj7 {
    public final csb a;
    public final csb b;
    public final Map c = qu4.a;
    public final boolean d;

    public nj7(csb csbVar, csb csbVar2) {
        this.a = csbVar;
        this.b = csbVar2;
        new ace(new j5(29, this));
        csb csbVar3 = csb.IGNORE;
        this.d = csbVar == csbVar3 && csbVar2 == csbVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj7)) {
            return false;
        }
        nj7 nj7Var = (nj7) obj;
        return this.a == nj7Var.a && this.b == nj7Var.b && this.c.equals(nj7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        csb csbVar = this.b;
        return this.c.hashCode() + ((iHashCode + (csbVar == null ? 0 : csbVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
