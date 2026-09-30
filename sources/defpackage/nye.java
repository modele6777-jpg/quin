package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nye implements tzb {
    public final long b;
    public final tzb c;

    public nye(long j, tzb tzbVar) {
        ok8.k("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = tzbVar;
    }

    @Override // defpackage.tzb
    public final long a() {
        return this.b;
    }

    @Override // defpackage.tzb
    public final szb b(ri1 ri1Var) {
        szb szbVarB = this.c.b(ri1Var);
        long j = this.b;
        return (j <= 0 || ri1Var.b < j - szbVarB.a) ? szbVarB : szb.d;
    }
}
