package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i03 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3f b;

    public /* synthetic */ i03(n3f n3fVar, int i) {
        this.a = i;
        this.b = n3fVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.d.getValue();
            default:
                return this.b.f();
        }
    }
}
