package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rv0 implements ul9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jse b;

    public /* synthetic */ rv0(jse jseVar, int i) {
        this.a = i;
        this.b = jseVar;
    }

    @Override // defpackage.ul9
    public final long a() {
        int i = this.a;
        jse jseVar = this.b;
        switch (i) {
            case 0:
                return jseVar.j(true).b;
            case 1:
                return jseVar.p(true, true).b;
            default:
                return jseVar.p(false, true).b;
        }
    }
}
