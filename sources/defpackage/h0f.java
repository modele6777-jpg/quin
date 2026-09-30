package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h0f implements d0f {
    public final b99 a;
    public final o89 b = new o89(Boolean.FALSE);
    public pl1 c;

    public h0f(b99 b99Var) {
        this.a = b99Var;
    }

    public final void a() {
        this.b.f(Boolean.FALSE);
    }

    public final boolean b() {
        o89 o89Var = this.b;
        return ((Boolean) o89Var.b.getValue()).booleanValue() || ((Boolean) o89Var.c.getValue()).booleanValue();
    }

    public final Object c(s89 s89Var, gbe gbeVar) {
        f0f f0fVar = new f0f(this, new g0f(this, null), s89Var, null);
        b99 b99Var = this.a;
        b99Var.getClass();
        Object objO = jgb.O(new y89(s89Var, b99Var, f0fVar, null), gbeVar);
        return objO == bw2.a ? objO : wef.a;
    }
}
