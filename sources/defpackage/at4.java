package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;
    public final /* synthetic */ float c;
    public final /* synthetic */ double d;
    public final /* synthetic */ float e;

    public /* synthetic */ at4(double d, float f, double d2, float f2, int i) {
        this.a = i;
        this.b = d;
        this.c = f;
        this.d = d2;
        this.e = f2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        float f = this.e;
        double d = this.d;
        float f2 = this.c;
        double d2 = this.b;
        switch (i) {
            case 0:
                ((sw3) obj).getClass();
                return new w67((((long) ((int) (d - ((double) (f / 2.0f))))) & 4294967295L) | (((long) ((int) (d2 - ((double) (f2 / 2.0f))))) << 32));
            default:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.E((float) (d2 * ((double) f2)));
                g0cVar.G((float) (d * ((double) f)));
                g0cVar.q(f2);
                g0cVar.r(f);
                g0cVar.D(sfc.d(0.0f, 0.0f));
                return wef.a;
        }
    }
}
