package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vgc extends gbe implements l26 {
    final /* synthetic */ vz $animationSpec;
    final /* synthetic */ jmb $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgc(float f, vz vzVar, jmb jmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$value = f;
        this.$animationSpec = vzVar;
        this.$previousValue = jmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        vgc vgcVar = new vgc(this.$value, this.$animationSpec, this.$previousValue, xn2Var);
        vgcVar.L$0 = obj;
        return vgcVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            jzb.q(obj);
            fhc fhcVar = (fhc) this.L$0;
            float f = this.$value;
            vz vzVar = this.$animationSpec;
            p4c p4cVar = new p4c(i2, this.$previousValue, fhcVar);
            this.label = 1;
            Object objS = hkg.S(0.0f, f, vzVar, p4cVar, this, 4);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
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
        return ((vgc) k((xn2) obj2, (fhc) obj)).r(wef.a);
    }
}
