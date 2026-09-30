package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a22 {
    public final u99 a;
    public final nya b;
    public final ay0 c;
    public final ntd d;

    public a22(u99 u99Var, nya nyaVar, ay0 ay0Var, ntd ntdVar) {
        u99Var.getClass();
        nyaVar.getClass();
        ntdVar.getClass();
        this.a = u99Var;
        this.b = nyaVar;
        this.c = ay0Var;
        this.d = ntdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a22)) {
            return false;
        }
        a22 a22Var = (a22) obj;
        return pa7.t(this.a, a22Var.a) && pa7.t(this.b, a22Var.b) && this.c.equals(a22Var.c) && pa7.t(this.d, a22Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
