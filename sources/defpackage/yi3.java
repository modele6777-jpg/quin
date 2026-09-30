package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yi3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ h0e c;
    public final /* synthetic */ h0e d;

    public /* synthetic */ yi3(float f, h0e h0eVar, h0e h0eVar2, int i) {
        this.a = i;
        this.b = f;
        this.c = h0eVar;
        this.d = h0eVar2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        h0e h0eVar = this.d;
        h0e h0eVar2 = this.c;
        float f = this.b;
        g0c g0cVar = (g0c) obj;
        g0cVar.getClass();
        switch (i) {
            case 0:
                g0cVar.b(((Number) h0eVar.getValue()).floatValue() * xj3.g(h0eVar2));
                g0cVar.G(f);
                break;
            case 1:
                g0cVar.E(((Number) h0eVar2.getValue()).floatValue());
                g0cVar.G(((Number) h0eVar.getValue()).floatValue());
                g0cVar.q(f);
                g0cVar.r(f);
                break;
            default:
                g0cVar.E(((Number) h0eVar2.getValue()).floatValue());
                g0cVar.G(((Number) h0eVar.getValue()).floatValue());
                g0cVar.q(f);
                g0cVar.r(f);
                break;
        }
        return wefVar;
    }
}
