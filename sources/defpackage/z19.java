package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z19 extends a29 {
    public final m40 b;
    public final String c;
    public final ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z19(m40 m40Var, String str, ArrayList arrayList) {
        super(m40Var);
        str.getClass();
        this.b = m40Var;
        this.c = str;
        this.d = arrayList;
    }

    @Override // defpackage.a29
    public final m40 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z19)) {
            return false;
        }
        z19 z19Var = (z19) obj;
        return this.b == z19Var.b && pa7.t(this.c, z19Var.c) && this.d.equals(z19Var.d);
    }

    public final int hashCode() {
        m40 m40Var = this.b;
        return this.d.hashCode() + ub3.c((m40Var == null ? 0 : m40Var.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        return "Success(completedStatus=" + this.b + ", totalSummary=" + this.c + ", summaries=" + this.d + ")";
    }
}
