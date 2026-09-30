package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eh4 extends fh4 {
    public final m40 b;
    public final ArrayList c;

    public eh4(m40 m40Var, ArrayList arrayList) {
        super(m40Var);
        this.b = m40Var;
        this.c = arrayList;
    }

    @Override // defpackage.fh4
    public final m40 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh4)) {
            return false;
        }
        eh4 eh4Var = (eh4) obj;
        return this.b == eh4Var.b && this.c.equals(eh4Var.c);
    }

    public final int hashCode() {
        m40 m40Var = this.b;
        return this.c.hashCode() + ((m40Var == null ? 0 : m40Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Success(completedStatus=" + this.b + ", summaries=" + this.c + ")";
    }
}
