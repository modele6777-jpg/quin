package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class me9 {
    public final int a;
    public final long b;
    public final long c;
    public final xd9 d;
    public final utd e;
    public final Object f;

    public me9(int i, long j, long j2, xd9 xd9Var, utd utdVar, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = xd9Var;
        this.e = utdVar;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me9)) {
            return false;
        }
        me9 me9Var = (me9) obj;
        return this.a == me9Var.a && this.b == me9Var.b && this.c == me9Var.c && pa7.t(this.d, me9Var.d) && pa7.t(this.e, me9Var.e) && pa7.t(this.f, me9Var.f);
    }

    public final int hashCode() {
        int iC = ib8.c(this.d.a, ib8.b(ib8.b(this.a * 31, 31, this.b), 31, this.c), 31);
        utd utdVar = this.e;
        int iHashCode = (iC + (utdVar == null ? 0 : utdVar.a.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.a + ", requestMillis=" + this.b + ", responseMillis=" + this.c + ", headers=" + this.d + ", body=" + this.e + ", delegate=" + this.f + ")";
    }
}
