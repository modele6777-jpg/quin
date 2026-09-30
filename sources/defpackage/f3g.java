package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f3g implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f3g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.G(g0cVar.I0.getDensity() * (((d3g) obj2).b - 20.0f));
                break;
            case 1:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                g0cVar2.p(((v3b) obj2).c);
                break;
            case 2:
                ((l1f) obj).a(((r4g) obj2).a(), "widget");
                break;
            default:
                gcg gcgVar = (gcg) obj2;
                int i2 = gcg.c;
                ynb.V(hwf.a(gcgVar), null, null, new fcg(gcgVar, null), 3);
                break;
        }
        return wefVar;
    }
}
