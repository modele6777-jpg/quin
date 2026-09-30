package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lre implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lmb b;
    public final /* synthetic */ lmb c;
    public final /* synthetic */ jse d;

    public /* synthetic */ lre(lmb lmbVar, lmb lmbVar2, jse jseVar, int i) {
        this.a = i;
        this.b = lmbVar;
        this.c = lmbVar2;
        this.d = jseVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        lmb lmbVar = this.c;
        jse jseVar = this.d;
        lmb lmbVar2 = this.b;
        switch (i) {
            case 0:
                jse.h(lmbVar2, lmbVar, jseVar);
                break;
            case 1:
                jse.f(lmbVar2, lmbVar, jseVar);
                break;
            case 2:
                jse.f(lmbVar2, lmbVar, jseVar);
                break;
            default:
                jse.h(lmbVar2, lmbVar, jseVar);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ lre(lmb lmbVar, jse jseVar, lmb lmbVar2, int i) {
        this.a = i;
        this.b = lmbVar;
        this.d = jseVar;
        this.c = lmbVar2;
    }
}
