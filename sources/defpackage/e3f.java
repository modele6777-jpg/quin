package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e3f implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3f b;

    public /* synthetic */ e3f(n3f n3fVar, int i) {
        this.a = i;
        this.b = n3fVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        n3f n3fVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(!pa7.t(n3fVar.d.getValue(), n3fVar.a.a()) || n3fVar.g() || ((Boolean) n3fVar.i.getValue()).booleanValue());
            default:
                return Long.valueOf(n3fVar.b());
        }
    }
}
