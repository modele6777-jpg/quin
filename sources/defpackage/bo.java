package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bo extends gbe implements l26 {
    final /* synthetic */ o26 $block;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(o26 o26Var, lo loVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$block = o26Var;
        this.this$0 = loVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        bo boVar = new bo(this.$block, this.this$0, xn2Var);
        boVar.L$0 = obj;
        return boVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            iy9 iy9Var = (iy9) this.L$0;
            jl8 jl8Var = (jl8) iy9Var.a();
            Object objB = iy9Var.b();
            o26 o26Var = this.$block;
            go goVar = this.this$0.m;
            this.label = 1;
            Object objT = o26Var.t(goVar, jl8Var, objB, this);
            bw2 bw2Var = bw2.a;
            if (objT == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bo) k((xn2) obj2, (iy9) obj)).r(wef.a);
    }
}
