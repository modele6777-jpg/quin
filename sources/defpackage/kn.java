package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kn implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ ho c;

    public /* synthetic */ kn(rn rnVar, ho hoVar, int i) {
        this.a = i;
        this.b = rnVar;
        this.c = hoVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        ks9 ks9Var = ks9.a;
        ho hoVar = this.c;
        rn rnVar = this.b;
        switch (i) {
            case 0:
                long jH = hl9.h(((uj4) obj).a, rnVar.H1() ? -1.0f : 1.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (rnVar.F0 == ks9Var ? jH & 4294967295L : jH >> 32));
                lu9 lu9Var = rnVar.Z0;
                if (lu9Var == null) {
                    hoVar.a(rnVar.Y0.d(fIntBitsToFloat), 0.0f);
                } else {
                    lu9Var.b(rnVar.I1(fIntBitsToFloat), 1, new kn(rnVar, hoVar, 1));
                }
                return wef.a;
            default:
                mo moVar = rnVar.Y0;
                long j = ((hl9) obj).a;
                float fD = moVar.d(Float.intBitsToFloat((int) (rnVar.F0 == ks9Var ? j & 4294967295L : j >> 32)));
                long jI1 = rnVar.I1(fD - rnVar.Y0.e());
                hoVar.a(fD, 0.0f);
                return new hl9(jI1);
        }
    }
}
