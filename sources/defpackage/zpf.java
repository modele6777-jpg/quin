package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zpf implements p1, u5 {
    public final mx a;

    public zpf(mx mxVar) {
        this.a = mxVar;
    }

    @Override // defpackage.p1
    public final mx e() {
        return this.a;
    }

    @Override // defpackage.p1
    public final p1 l() {
        return new zpf(new mx(1, false));
    }

    @Override // defpackage.u5
    public final void m(gg9 gg9Var) {
        this.a.a(gg9Var);
    }
}
