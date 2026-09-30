package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class flc extends gbe implements l26 {
    final /* synthetic */ e89 $animatingQuestion$delegate;
    final /* synthetic */ erc $followUpState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flc(erc ercVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$followUpState = ercVar;
        this.$animatingQuestion$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new flc(this.$followUpState, this.$animatingQuestion$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        erc ercVar = this.$followUpState;
        if (ercVar instanceof drc) {
            e89 e89Var = this.$animatingQuestion$delegate;
            String str = ((drc) ercVar).a;
            List list = jlc.a;
            e89Var.setValue(str);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        flc flcVar = (flc) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        flcVar.r(wefVar);
        return wefVar;
    }
}
