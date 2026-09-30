package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q37 implements xn8 {
    public final /* synthetic */ long a;
    public final /* synthetic */ e89 b;

    public q37(long j, e89 e89Var) {
        this.a = j;
        this.b = e89Var;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        e77 e77Var;
        list.getClass();
        tn8 tn8Var = (tn8) s72.Z0(list);
        qu4 qu4Var = qu4.a;
        if (tn8Var == null) {
            return zn8Var.n0(0, 0, qu4Var, new tk6(23));
        }
        cea ceaVarV = tn8Var.v(this.a);
        e89 e89Var = this.b;
        e77 e77Var2 = (e77) e89Var.getValue();
        if (e77Var2 == null || ceaVarV.a != ((int) (e77Var2.a >> 32)) || (e77Var = (e77) e89Var.getValue()) == null || ceaVarV.b != ((int) (e77Var.a & 4294967295L))) {
            e89Var.setValue(new e77((4294967295L & ((long) ceaVarV.b)) | (((long) ceaVarV.a) << 32)));
        }
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4Var, new l1(ceaVarV, 9));
    }
}
