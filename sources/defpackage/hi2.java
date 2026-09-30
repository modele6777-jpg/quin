package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hi2 {
    public final /* synthetic */ ii2 a;

    public hi2(ii2 ii2Var) {
        this.a = ii2Var;
    }

    public final void a() {
        ii2 ii2Var = this.a;
        synchronized (ii2Var) {
            ii2Var.d = true;
        }
        this.a.g();
    }
}
