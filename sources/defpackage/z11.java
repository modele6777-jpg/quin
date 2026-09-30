package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z11 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ted b;

    public /* synthetic */ z11(ted tedVar, int i) {
        this.a = i;
        this.b = tedVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        ted tedVar = this.b;
        g0c g0cVar = (g0c) obj;
        switch (i) {
            case 0:
                lo loVar = tedVar.d;
                float fJ = loVar.i.j();
                float fC = loVar.d().c();
                float f = fJ < fC ? fC - fJ : 0.0f;
                g0cVar.r(f > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (g0cVar.G0 & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & g0cVar.G0))) : 1.0f);
                g0cVar.D(sfc.d(0.5f, 0.0f));
                break;
            default:
                lo loVar2 = tedVar.d;
                float fJ2 = loVar2.i.j();
                float fC2 = loVar2.d().c();
                float f2 = fJ2 < fC2 ? fC2 - fJ2 : 0.0f;
                g0cVar.r(f2 > 0.0f ? (Float.intBitsToFloat((int) (g0cVar.G0 & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & g0cVar.G0)) : 1.0f);
                g0cVar.D(sfc.d(0.5f, 0.0f));
                break;
        }
        return wefVar;
    }
}
