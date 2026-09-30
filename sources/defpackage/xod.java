package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xod implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gpd b;

    public /* synthetic */ xod(gpd gpdVar, int i) {
        this.a = i;
        this.b = gpdVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Throwable {
        int i;
        int i2 = this.a;
        wef wefVar = wef.a;
        gpd gpdVar = this.b;
        switch (i2) {
            case 0:
                e77 e77Var = (e77) obj;
                gpdVar.j.k((int) (e77Var.a >> 32));
                gpdVar.k.k((int) (e77Var.a & 4294967295L));
                return wefVar;
            case 1:
                qz9 qz9Var = gpdVar.c;
                float fFloatValue = ((Float) obj).floatValue();
                b62 b62Var = gpdVar.b;
                float f = b62Var.a;
                float f2 = b62Var.b;
                float fN = mh3.n(fFloatValue, f, f2);
                int i3 = gpdVar.a;
                boolean z = false;
                if (i3 > 0 && (i = i3 + 1) >= 0) {
                    float fAbs = fN;
                    float f3 = fAbs;
                    int i4 = 0;
                    while (true) {
                        float fP = abg.P(b62Var.a, f2, i4 / i);
                        float f4 = fP - fN;
                        if (Math.abs(f4) <= fAbs) {
                            fAbs = Math.abs(f4);
                            f3 = fP;
                        }
                        if (i4 != i) {
                            i4++;
                        } else {
                            fN = f3;
                        }
                    }
                }
                if (fN != qz9Var.j()) {
                    if (fN != qz9Var.j()) {
                        a26 a26Var = gpdVar.d;
                        if (a26Var != null) {
                            a26Var.d(Float.valueOf(fN));
                        } else {
                            gpdVar.d(fN);
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                gpdVar.b(0.0f);
                gpdVar.n.invoke();
                return wefVar;
        }
    }
}
