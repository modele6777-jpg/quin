package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xrd extends f1e {
    public Object c;

    public xrd(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.f1e
    public final void a(f1e f1eVar) {
        f1eVar.getClass();
        this.c = ((xrd) f1eVar).c;
    }

    @Override // defpackage.f1e
    public final f1e b() {
        return new xrd(qrd.h().g(), this.c);
    }

    @Override // defpackage.f1e
    public final f1e c(long j) {
        return new xrd(j, this.c);
    }
}
