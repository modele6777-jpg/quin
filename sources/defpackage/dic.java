package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dic {
    public final /* synthetic */ gic a;

    public dic(gic gicVar) {
        this.a = gicVar;
    }

    public final long a(int i, long j) {
        gic gicVar = this.a;
        gicVar.j = i;
        lu9 lu9Var = gicVar.b;
        return (lu9Var == null || !gicVar.b()) ? gicVar.d(gicVar.k, j, i) : lu9Var.b(j, gicVar.j, gicVar.m);
    }
}
