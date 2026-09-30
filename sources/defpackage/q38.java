package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q38 implements xn8 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ h0e c;

    public q38(boolean z, e89 e89Var, h0e h0eVar) {
        this.a = z;
        this.b = e89Var;
        this.c = h0eVar;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        list.getClass();
        boolean z = this.a;
        long jA = z ? ll2.a(kl2.j(j), kl2.h(j), 0, Integer.MAX_VALUE) : j;
        tn8 tn8Var = (tn8) s72.x0(list);
        qu4 qu4Var = qu4.a;
        if (tn8Var == null) {
            return zn8Var.n0(0, 0, qu4Var, new tb7(19));
        }
        cea ceaVarV = tn8Var.v(jA);
        if (z) {
            this.b.setValue(Float.valueOf((ceaVarV.b <= kl2.g(j) || kl2.g(j) <= 0) ? 1.0f : kl2.g(j) / ceaVarV.b));
        }
        float f = ceaVarV.a;
        h0e h0eVar = this.c;
        return zn8Var.n0(ym8.L(((Number) h0eVar.getValue()).floatValue() * f), Math.min(ym8.L(((Number) h0eVar.getValue()).floatValue() * ceaVarV.b), kl2.g(j)), qu4Var, new so5(26, ceaVarV, h0eVar));
    }
}
