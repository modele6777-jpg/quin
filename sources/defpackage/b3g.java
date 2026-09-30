package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b3g implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3f b;

    public /* synthetic */ b3g(p3f p3fVar, int i) {
        this.a = i;
        this.b = p3fVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        p3f p3fVar = this.b;
        switch (i) {
            case 0:
                return p3fVar.d.getValue();
            case 1:
                return p3fVar.f();
            case 2:
                return p3fVar.d.getValue();
            case 3:
                return p3fVar.f();
            case 4:
                return p3fVar.d.getValue();
            default:
                return p3fVar.f();
        }
    }
}
