package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0c implements j7c {
    public final dib a;

    public h0c(dib dibVar) {
        dibVar.getClass();
        this.a = dibVar;
    }

    @Override // defpackage.j7c
    public final boolean a() {
        return true;
    }

    @Override // defpackage.j7c
    public final j7c b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.j7c
    public final dib c() {
        return this.a;
    }

    @Override // defpackage.j7c
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.j7c
    public final i7c d() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.j7c
    public final i7c g() {
        throw new IllegalStateException("already connected");
    }
}
