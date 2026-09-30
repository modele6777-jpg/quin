package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ehe implements vpb {
    public final vx7 a;
    public dhe b;
    public final bhe c;

    public ehe(dhe dheVar, vx7 vx7Var) {
        this.a = vx7Var;
        this.b = dheVar;
        this.c = dheVar.c;
    }

    @Override // defpackage.vpb
    public final void a() {
        dhe dheVar = this.b;
        if (dheVar != null) {
            this.a.d(dheVar);
        }
        this.b = null;
    }

    @Override // defpackage.vpb
    public final void c() {
        dhe dheVar = this.b;
        if (dheVar != null) {
            this.a.d(dheVar);
        }
        this.b = null;
    }

    @Override // defpackage.vpb
    public final void d() {
    }
}
