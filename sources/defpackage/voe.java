package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class voe extends gbe implements l26 {
    final /* synthetic */ x16 $requestFocus;
    final /* synthetic */ tia $this_SuspendingPointerInputModifierNode;
    final /* synthetic */ jse $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voe(jse jseVar, tia tiaVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_with = jseVar;
        this.$this_SuspendingPointerInputModifierNode = tiaVar;
        this.$requestFocus = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new voe(this.$this_with, this.$this_SuspendingPointerInputModifierNode, this.$requestFocus, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        jse jseVar = this.$this_with;
        tia tiaVar = this.$this_SuspendingPointerInputModifierNode;
        x16 x16Var = this.$requestFocus;
        this.label = 1;
        jseVar.getClass();
        Object objV = db6.v(tiaVar, new nre(jseVar, x16Var), new ore(jseVar, x16Var), this);
        bw2 bw2Var = bw2.a;
        if (objV != bw2Var) {
            objV = wefVar;
        }
        if (objV != bw2Var) {
            objV = wefVar;
        }
        if (objV != bw2Var) {
            objV = wefVar;
        }
        return objV == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((voe) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
