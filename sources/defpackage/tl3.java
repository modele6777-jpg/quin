package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tl3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public /* synthetic */ tl3(float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        float f = this.e;
        float f2 = this.d;
        float f3 = this.c;
        float f4 = this.b;
        g0c g0cVar = (g0c) obj;
        g0cVar.getClass();
        switch (i) {
            case 0:
                g0cVar.n(f4);
                g0cVar.e(g0cVar.I0.getDensity() * 12.0f);
                g0cVar.q(f3);
                g0cVar.r(f3);
                g0cVar.E(f2);
                g0cVar.b(f);
                break;
            default:
                g0cVar.q(f4);
                g0cVar.r(f4);
                g0cVar.n(f3);
                g0cVar.e(f2);
                g0cVar.b(f);
                break;
        }
        return wefVar;
    }
}
