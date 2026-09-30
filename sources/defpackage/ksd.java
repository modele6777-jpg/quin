package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ksd extends f1e {
    public w8a c;
    public int d;

    public ksd(long j, w8a w8aVar) {
        super(j);
        this.c = w8aVar;
    }

    @Override // defpackage.f1e
    public final void a(f1e f1eVar) {
        f1eVar.getClass();
        ksd ksdVar = (ksd) f1eVar;
        synchronized (bzd.l) {
            this.c = ksdVar.c;
            this.d = ksdVar.d;
        }
    }

    @Override // defpackage.f1e
    public final f1e b() {
        return new ksd(qrd.h().g(), this.c);
    }

    @Override // defpackage.f1e
    public final f1e c(long j) {
        return new ksd(j, this.c);
    }
}
