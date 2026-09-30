package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sed extends gbe implements o26 {
    final /* synthetic */ ze5 $animationSpec;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ ted this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sed(ted tedVar, float f, ze5 ze5Var, xn2 xn2Var) {
        super(4, xn2Var);
        this.this$0 = tedVar;
        this.$velocity = f;
        this.$animationSpec = ze5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            jzb.q(obj);
            go goVar = (go) this.L$0;
            float fD = ((jl8) this.L$1).d((ued) this.L$2);
            if (!Float.isNaN(fD)) {
                jmb jmbVar = new jmb();
                float fJ = Float.isNaN(this.this$0.d.i.j()) ? 0.0f : this.this$0.d.i.j();
                jmbVar.element = fJ;
                float f = this.$velocity;
                ze5 ze5Var = this.$animationSpec;
                vm vmVar = new vm(goVar, jmbVar, i2);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objQ = hkg.Q(fJ, fD, f, ze5Var, vmVar, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
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

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        sed sedVar = new sed(this.this$0, this.$velocity, this.$animationSpec, (xn2) obj4);
        sedVar.L$0 = (go) obj;
        sedVar.L$1 = (jl8) obj2;
        sedVar.L$2 = (ued) obj3;
        return sedVar.r(wef.a);
    }
}
