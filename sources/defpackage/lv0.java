package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lv0 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jse b;

    public /* synthetic */ lv0(jse jseVar, int i) {
        this.a = i;
        this.b = jseVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        jse jseVar = this.b;
        switch (i) {
            case 0:
                return new lf(6, jseVar);
            case 1:
                sue sueVar = (sue) jseVar.s.getValue();
                sue sueVar2 = sue.b;
                if (sueVar == sueVar2) {
                    sueVar2 = sue.a;
                }
                jseVar.x(sueVar2);
                return wefVar;
            default:
                jseVar.b();
                return wefVar;
        }
    }
}
