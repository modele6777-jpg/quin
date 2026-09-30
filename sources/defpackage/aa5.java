package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class aa5 implements j7c {
    public final i7c a;

    public aa5(Throwable th) {
        this.a = new i7c(this, th, 2);
    }

    @Override // defpackage.j7c
    public final boolean a() {
        return false;
    }

    @Override // defpackage.j7c
    public final j7c b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.j7c
    public final dib c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.j7c
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.j7c
    public final i7c d() {
        return this.a;
    }

    @Override // defpackage.j7c
    public final i7c g() {
        return this.a;
    }
}
