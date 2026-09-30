package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g23 extends gbe implements l26 {
    final /* synthetic */ a26 $block$inlined;
    final /* synthetic */ w5c $db$inlined;
    final /* synthetic */ boolean $inTransaction$inlined;
    final /* synthetic */ boolean $isReadOnly$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g23(xn2 xn2Var, a26 a26Var, w5c w5cVar, boolean z, boolean z2) {
        super(2, xn2Var);
        this.$db$inlined = w5cVar;
        this.$isReadOnly$inlined = z;
        this.$inTransaction$inlined = z2;
        this.$block$inlined = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g23(xn2Var, this.$block$inlined, this.$db$inlined, this.$isReadOnly$inlined, this.$inTransaction$inlined);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        w5c w5cVar = this.$db$inlined;
        boolean z = this.$isReadOnly$inlined;
        j23 j23Var = new j23(null, this.$block$inlined, w5cVar, this.$inTransaction$inlined, z);
        this.label = 1;
        Object objR = w5cVar.r(z, j23Var, this);
        bw2 bw2Var = bw2.a;
        return objR == bw2Var ? bw2Var : objR;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((g23) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
