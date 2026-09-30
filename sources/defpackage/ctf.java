package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ctf {
    public final xj0 a = new xj0(1);

    public final long a(long j) {
        if (zsf.b(j) <= 0.0f || zsf.c(j) <= 0.0f) {
            i37.c("maximumVelocity should be a positive value. You specified=".concat(zsf.g(j)));
        }
        xj0 xj0Var = this.a;
        return q7c.j(((btf) xj0Var.b).c(zsf.b(j)), ((btf) xj0Var.c).c(zsf.c(j)));
    }
}
