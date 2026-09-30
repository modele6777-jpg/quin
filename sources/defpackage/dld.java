package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dld extends gbe implements l26 {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ cld $this_apply;
    int label;
    final /* synthetic */ fld this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dld(cld cldVar, long j, fld fldVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_apply = cldVar;
        this.$targetSize = j;
        this.this$0 = fldVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dld(this.$this_apply, this.$targetSize, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        dld dldVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jx jxVar = this.$this_apply.a;
            e77 e77Var = new e77(this.$targetSize);
            vz vzVar = this.this$0.E0;
            this.label = 1;
            dldVar = this;
            obj = jx.b(jxVar, e77Var, vzVar, null, null, dldVar, 12);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            dldVar = this;
        }
        if (((tz) obj).b == rz.b) {
            dldVar.this$0.getClass();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dld) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
