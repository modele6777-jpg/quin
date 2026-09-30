package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ou2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r38 b;

    public /* synthetic */ ou2(r38 r38Var, int i) {
        this.a = i;
        this.b = r38Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        r38 r38Var = this.b;
        switch (i) {
            case 0:
                bv7 bv7Var = (bv7) obj;
                tte tteVarD = r38Var.d();
                if (tteVarD != null) {
                    tteVarD.c = bv7Var;
                }
                return wefVar;
            case 1:
                vz9 vz9Var = r38Var.t;
                zse zseVar = (zse) obj;
                String str = zseVar.a.b;
                k00 k00Var = r38Var.j;
                if (!pa7.t(str, k00Var != null ? k00Var.b : null)) {
                    r38Var.k.setValue(ug6.a);
                    if (((Boolean) vz9Var.getValue()).booleanValue()) {
                        vz9Var.setValue(Boolean.FALSE);
                    } else {
                        r38Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = eue.b;
                r38Var.f(j);
                r38Var.e(j);
                r38Var.u.d(zseVar);
                ojb ojbVar = r38Var.b;
                pjb pjbVar = ojbVar.a;
                if (pjbVar != null) {
                    pjbVar.o(ojbVar, null);
                }
                return wefVar;
            case 2:
                r38Var.r.u(((lx6) obj).a);
                return wefVar;
            case 3:
                return Boolean.valueOf(r38Var.r.u(((lx6) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                r38Var.q.setValue(bool);
                return wefVar;
        }
    }
}
