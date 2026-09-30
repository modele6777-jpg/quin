package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qif implements h1b {
    public final /* synthetic */ int a;
    public final /* synthetic */ rif b;

    public /* synthetic */ qif(rif rifVar, int i) {
        this.a = i;
        this.b = rifVar;
    }

    @Override // defpackage.h1b
    public final Object get() {
        int i = this.a;
        rif rifVar = this.b;
        switch (i) {
            case 0:
                return (yf1) rifVar.a.d(((zf1) rifVar.d.getValue()).a);
            default:
                return ((zf1) rifVar.d.getValue()).b;
        }
    }
}
