package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u16 extends ewf {
    public final p06 b;
    public final s0e c;
    public final whb d;
    public lyd e;
    public long f;
    public boolean g;

    public u16(p06 p06Var, n06 n06Var) {
        this.b = p06Var;
        s0e s0eVarA = t0e.a(r16.a);
        this.c = s0eVarA;
        this.d = if9.n(s0eVarA);
    }

    public final void f(boolean z) {
        long j = this.f + 1;
        this.f = j;
        lyd lydVar = this.e;
        if (lydVar != null) {
            lydVar.h(null);
        }
        if (z) {
            this.c.n(null, r16.a);
        }
        this.e = ynb.V(hwf.a(this), null, null, new t16(this, j, z, null), 3);
    }
}
