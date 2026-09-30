package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wuc {
    public final /* synthetic */ int a;

    public /* synthetic */ wuc(int i) {
        this.a = i;
    }

    public final vuc a(tvc tvcVar) {
        uuc uucVarM;
        uuc uucVarM2;
        int i = this.a;
        boolean z = true;
        c03 c03Var = c03.a;
        switch (i) {
            case 0:
                return new vuc(tvcVar.k().a(tvcVar.k().c), tvcVar.h().a(tvcVar.h().d), tvcVar.i() == c03Var);
            case 1:
                return z8c.h(new vuc(tvcVar.k().a(tvcVar.k().c), tvcVar.h().a(tvcVar.h().d), tvcVar.i() == c03Var), tvcVar);
            case 2:
                return z8c.c(tvcVar, m8c.b);
            case 3:
                return z8c.c(tvcVar, i8c.c);
            default:
                vuc vucVarE = tvcVar.e();
                if (vucVarE == null) {
                    return z8c.c(tvcVar, m8c.b);
                }
                uuc uucVar = vucVarE.b;
                uuc uucVar2 = vucVarE.a;
                if (tvcVar.b()) {
                    uucVarM2 = z8c.m(tvcVar, tvcVar.k(), uucVar2);
                    uucVarM = uucVar;
                    uucVar = uucVar2;
                    uucVar2 = uucVarM2;
                } else {
                    uucVarM = z8c.m(tvcVar, tvcVar.h(), uucVar);
                    uucVarM2 = uucVarM;
                }
                if (pa7.t(uucVarM2, uucVar)) {
                    return vucVarE;
                }
                if (tvcVar.i() != c03Var && (tvcVar.i() != c03.c || uucVar2.b <= uucVarM.b)) {
                    z = false;
                }
                return z8c.h(new vuc(uucVar2, uucVarM, z), tvcVar);
        }
    }
}
