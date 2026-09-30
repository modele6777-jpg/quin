package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r3c implements si4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3c b;

    public /* synthetic */ r3c(x3c x3cVar, int i) {
        this.a = i;
        this.b = x3cVar;
    }

    @Override // defpackage.si4
    public final double b(double d) {
        int i = this.a;
        x3c x3cVar = this.b;
        switch (i) {
            case 0:
                return mh3.m(x3cVar.k.b(d), x3cVar.e, x3cVar.f);
            default:
                return x3cVar.n.b(mh3.m(d, x3cVar.e, x3cVar.f));
        }
    }
}
