package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sz1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ sz1(float f, float f2, float f3, float f4, float f5, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        float f5 = this.b;
        g0c g0cVar = (g0c) obj;
        g0cVar.getClass();
        switch (i) {
            case 0:
                g0cVar.p(f5);
                g0cVar.b(f4);
                g0cVar.q(f3);
                g0cVar.r(f3);
                g0cVar.E(f2);
                g0cVar.G(f);
                break;
            case 1:
                float f6 = (-f5) * f4;
                double d = f3;
                g0cVar.E(((float) Math.cos(d)) * f6);
                g0cVar.G(f6 * ((float) Math.sin(d)));
                g0cVar.p(f2);
                g0cVar.b(1.0f - f);
                break;
            default:
                float f7 = (-f5) * f4;
                double d2 = f3;
                g0cVar.E(((float) Math.cos(d2)) * f7);
                g0cVar.G(f7 * ((float) Math.sin(d2)));
                g0cVar.p(f2);
                g0cVar.b(1.0f - f);
                break;
        }
        return wefVar;
    }
}
