package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jy7 extends mh3 {
    public final /* synthetic */ u09 O;
    public final /* synthetic */ Set P;
    public final /* synthetic */ a26 Q;

    public jy7(u09 u09Var, Set set, a26 a26Var) {
        this.O = u09Var;
        this.P = set;
        this.Q = a26Var;
    }

    @Override // defpackage.mh3
    public final Object U() {
        return wef.a;
    }

    @Override // defpackage.mh3
    public final boolean i(Object obj) {
        u09 u09Var = (u09) obj;
        u09Var.getClass();
        if (u09Var == this.O) {
            return true;
        }
        dr8 dr8VarC0 = u09Var.c0();
        dr8VarC0.getClass();
        if (!(dr8VarC0 instanceof ly7)) {
            return true;
        }
        this.P.addAll((Collection) this.Q.d(dr8VarC0));
        return false;
    }
}
