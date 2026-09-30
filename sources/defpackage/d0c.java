package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d0c implements ly1 {
    public final a26 a;
    public final String b;

    public d0c(String str, a26 a26Var) {
        this.a = a26Var;
        this.b = "must return ".concat(str);
    }

    @Override // defpackage.ly1
    public final boolean a(if7 if7Var) {
        return pa7.t(if7Var.v, this.a.d(qz3.e(if7Var)));
    }

    @Override // defpackage.ly1
    public final /* bridge */ String b(if7 if7Var) {
        return b21.E(this, if7Var);
    }

    @Override // defpackage.ly1
    public final String getDescription() {
        return this.b;
    }
}
