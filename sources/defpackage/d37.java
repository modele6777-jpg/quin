package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d37 implements jwf {
    public final gwf[] a;

    public d37(gwf... gwfVarArr) {
        this.a = gwfVarArr;
    }

    @Override // defpackage.jwf
    public final ewf b(Class cls, m69 m69Var) {
        gwf gwfVar;
        a26 a26Var;
        em7 em7VarB = job.a.b(cls);
        gwf[] gwfVarArr = this.a;
        gwf[] gwfVarArr2 = (gwf[]) Arrays.copyOf(gwfVarArr, gwfVarArr.length);
        int length = gwfVarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                gwfVar = null;
                break;
            }
            gwfVar = gwfVarArr2[i];
            if (pa7.t(gwfVar.a, em7VarB)) {
                break;
            }
            i++;
        }
        ewf ewfVar = (gwfVar == null || (a26Var = gwfVar.b) == null) ? null : (ewf) a26Var.d(m69Var);
        if (ewfVar != null) {
            return ewfVar;
        }
        qc0.o(ub3.i("No initializer set for given class ", em7VarB.g()));
        return null;
    }
}
