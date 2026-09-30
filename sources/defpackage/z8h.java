package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z8h extends w4h {
    public final /* synthetic */ gle b;
    public final /* synthetic */ wxg c;
    public final /* synthetic */ reh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8h(reh rehVar, gle gleVar, gle gleVar2, wxg wxgVar) {
        super(gleVar);
        this.b = gleVar2;
        this.c = wxgVar;
        this.d = rehVar;
    }

    @Override // defpackage.w4h
    public final void a() {
        synchronized (this.d.f) {
            try {
                reh rehVar = this.d;
                gle gleVar = this.b;
                rehVar.e.add(gleVar);
                gleVar.a.b(new gsg(rehVar, gleVar));
                if (this.d.k.getAndIncrement() > 0) {
                    this.d.b.d("Already connected to the service.", new Object[0]);
                }
                reh.b(this.d, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
