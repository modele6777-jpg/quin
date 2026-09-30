package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nn implements fhc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.fhc
    public final float a(float f) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                rn rnVar = (rn) obj2;
                float fD = rnVar.Y0.d(f);
                float fJ = fD - rnVar.Y0.j.j();
                ((ho) obj).a(fD, 0.0f);
                return fJ;
            default:
                gic gicVar = (gic) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) gicVar.h.invoke()).booleanValue()) {
                    return gicVar.e(gicVar.h(((dic) obj).a(2, gicVar.f(gicVar.i(f)))));
                }
                throw new kj5("The fling animation was cancelled");
        }
    }
}
