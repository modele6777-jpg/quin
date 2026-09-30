package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pa4 implements vpb {
    public final a26 a;
    public qa4 b;

    public pa4(a26 a26Var) {
        this.a = a26Var;
    }

    @Override // defpackage.vpb
    public final void c() {
        qa4 qa4Var = this.b;
        if (qa4Var != null) {
            qa4Var.a();
        }
        this.b = null;
    }

    @Override // defpackage.vpb
    public final void d() {
        this.b = (qa4) this.a.d(af1.x);
    }

    @Override // defpackage.vpb
    public final void a() {
    }
}
