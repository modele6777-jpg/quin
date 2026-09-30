package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wi3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jx b;
    public final /* synthetic */ float c;

    public /* synthetic */ wi3(jx jxVar, float f, int i) {
        this.a = i;
        this.b = jxVar;
        this.c = f;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002c  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        float fN;
        int i = this.a;
        wef wefVar = wef.a;
        float f = this.c;
        jx jxVar = this.b;
        g0c g0cVar = (g0c) obj;
        g0cVar.getClass();
        switch (i) {
            case 0:
                g0cVar.b(((Number) jxVar.e()).floatValue());
                g0cVar.G(f);
                break;
            default:
                g0cVar.G(((Number) jxVar.e()).floatValue());
                float fFloatValue = ((Number) jxVar.e()).floatValue();
                if (f <= 0.0f) {
                    fN = 0.0f;
                } else {
                    float f2 = fFloatValue / f;
                    if (Math.abs(f2) <= Float.MAX_VALUE) {
                        fN = mh3.n(f2, 0.0f, 1.0f);
                    } else {
                        fN = 0.0f;
                    }
                }
                g0cVar.w(a7c.b(abg.P(0.0f, 32.0f, fN)));
                g0cVar.g(true);
                break;
        }
        return wefVar;
    }
}
