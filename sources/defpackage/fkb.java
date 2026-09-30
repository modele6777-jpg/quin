package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fkb extends gbe implements l26 {
    final /* synthetic */ tr2 $this_RecoverInterruptedDrawingEffect;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkb(tr2 tr2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_RecoverInterruptedDrawingEffect = tr2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fkb(this.$this_RecoverInterruptedDrawingEffect, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        tr2 tr2Var = this.$this_RecoverInterruptedDrawingEffect;
        tr2Var.a(tr2Var.c.S0());
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        fkb fkbVar = (fkb) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        fkbVar.r(wefVar);
        return wefVar;
    }
}
