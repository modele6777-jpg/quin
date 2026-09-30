package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zv5 extends gbe implements l26 {
    final /* synthetic */ String $period;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv5(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$period = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        zv5 zv5Var = new zv5(this.$period, xn2Var);
        zv5Var.L$0 = obj;
        return zv5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        isa isaVar = xqa.Z0.a;
        Set set = (Set) p79Var.c(isaVar);
        if (set == null) {
            set = xu4.a;
        }
        p79Var.f(isaVar, n3d.n(set, this.$period));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        zv5 zv5Var = (zv5) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        zv5Var.r(wefVar);
        return wefVar;
    }
}
