package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jwc implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kwc b;

    public /* synthetic */ jwc(kwc kwcVar, int i) {
        this.a = i;
        this.b = kwcVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        kwc kwcVar = this.b;
        switch (i) {
            case 0:
                return Long.valueOf(kwcVar.G0);
            case 1:
                return (bv7) kwcVar.H0.invoke();
            case 2:
                return Long.valueOf(kwcVar.G0);
            default:
                return (bv7) kwcVar.H0.invoke();
        }
    }
}
