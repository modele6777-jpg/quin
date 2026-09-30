package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y0e extends f1e {
    public i4 c;
    public int d;
    public int e;

    public y0e(long j, i4 i4Var) {
        super(j);
        this.c = i4Var;
    }

    @Override // defpackage.f1e
    public final void a(f1e f1eVar) {
        synchronized (z5c.h) {
            f1eVar.getClass();
            this.c = ((y0e) f1eVar).c;
            this.d = ((y0e) f1eVar).d;
            this.e = ((y0e) f1eVar).e;
        }
    }

    @Override // defpackage.f1e
    public final f1e b() {
        return c(qrd.h().g());
    }

    @Override // defpackage.f1e
    public final f1e c(long j) {
        return new y0e(j, this.c);
    }
}
