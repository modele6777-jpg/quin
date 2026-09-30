package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o29 extends p29 {
    public final m40 b;
    public final ArrayList c;
    public final t58 d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o29(m40 m40Var, ArrayList arrayList, t58 t58Var, String str) {
        super(m40Var);
        str.getClass();
        this.b = m40Var;
        this.c = arrayList;
        this.d = t58Var;
        this.e = str;
    }

    @Override // defpackage.p29
    public final m40 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o29)) {
            return false;
        }
        o29 o29Var = (o29) obj;
        return this.b == o29Var.b && this.c.equals(o29Var.c) && this.d.equals(o29Var.d) && pa7.t(this.e, o29Var.e);
    }

    public final int hashCode() {
        m40 m40Var = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((m40Var == null ? 0 : m40Var.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Success(completedStatus=" + this.b + ", cards=" + this.c + ", lineChars=" + this.d + ", summary=" + this.e + ")";
    }
}
