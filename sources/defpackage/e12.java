package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e12 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ e12(float f, float f2, float f3, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        float f = this.d;
        float f2 = this.c;
        float f3 = this.b;
        g0c g0cVar = (g0c) obj;
        g0cVar.getClass();
        switch (i) {
            case 0:
                g0cVar.q(f3);
                g0cVar.r(f3);
                g0cVar.n(f2);
                g0cVar.b(f);
                break;
            case 1:
                g0cVar.b(1.0f - f3);
                g0cVar.E(f2 * f * f3);
                break;
            case 2:
                g0cVar.b(f3);
                g0cVar.E((1.0f - f3) * f2 * f);
                break;
            default:
                g0cVar.b(1.0f - f3);
                g0cVar.E(f2 * f * f3);
                break;
        }
        return wefVar;
    }
}
