package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class isf implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jsf b;

    public /* synthetic */ isf(jsf jsfVar, int i) {
        this.a = i;
        this.b = jsfVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        jsf jsfVar = this.b;
        switch (i) {
            case 0:
                jsfVar.d = true;
                jsfVar.f.invoke();
                return wefVar;
            default:
                sn4 sn4Var = (sn4) obj;
                df6 df6Var = jsfVar.b;
                float f = jsfVar.k;
                float f2 = jsfVar.l;
                ta0 ta0VarV0 = sn4Var.v0();
                long jZ = ta0VarV0.z();
                ta0VarV0.p().g();
                try {
                    ((vd9) ta0VarV0.c).G(f, f2, 0L);
                    df6Var.a(sn4Var);
                    return wefVar;
                } finally {
                    ks0.t(ta0VarV0, jZ);
                }
        }
    }
}
