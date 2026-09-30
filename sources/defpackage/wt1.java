package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jx b;

    public /* synthetic */ wt1(jx jxVar, int i) {
        this.a = i;
        this.b = jxVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        jx jxVar = this.b;
        g0c g0cVar = (g0c) obj;
        switch (i) {
            case 0:
                g0cVar.getClass();
                g0cVar.b(((Number) jxVar.e()).floatValue());
                break;
            case 1:
                g0cVar.getClass();
                g0cVar.b(((Number) jxVar.e()).floatValue());
                break;
            case 2:
                g0cVar.getClass();
                g0cVar.b(((Number) jxVar.e()).floatValue());
                break;
            case 3:
                g0cVar.getClass();
                g0cVar.b(((Number) jxVar.e()).floatValue());
                break;
            case 4:
                g0cVar.getClass();
                g0cVar.b(((Number) jxVar.e()).floatValue());
                break;
            case 5:
                g0cVar.getClass();
                g0cVar.b(((Number) jxVar.e()).floatValue());
                break;
            case 6:
                float fFloatValue = ((Number) jxVar.e()).floatValue();
                float fD = zz8.d(g0cVar, fFloatValue);
                float fE = zz8.e(g0cVar, fFloatValue);
                g0cVar.r(fE != 0.0f ? fD / fE : 1.0f);
                g0cVar.D(zz8.a);
                break;
            default:
                g0cVar.getClass();
                g0cVar.b(((Number) jxVar.e()).floatValue());
                g0cVar.G(g0cVar.I0.getDensity() * 8.0f * (1.0f - ((Number) jxVar.e()).floatValue()));
                break;
        }
        return wefVar;
    }
}
