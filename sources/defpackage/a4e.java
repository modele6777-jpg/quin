package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a4e extends gbe implements l26 {
    final /* synthetic */ mmb $progress;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4e(mmb mmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$progress = mmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        a4e a4eVar = new a4e(this.$progress, xn2Var);
        a4eVar.L$0 = obj;
        return a4eVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        oyb oybVar = (oyb) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$progress.element = oybVar instanceof myb ? ((myb) oybVar).a : null;
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        a4e a4eVar = (a4e) k((xn2) obj2, (oyb) obj);
        wef wefVar = wef.a;
        a4eVar.r(wefVar);
        return wefVar;
    }
}
