package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hnd extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ and $shareViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnd(xn2 xn2Var, and andVar, Context context) {
        super(2, xn2Var);
        this.$context = context;
        this.$shareViewModel = andVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hnd(xn2Var, this.$shareViewModel, this.$context);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        vb2 vb2VarH = kn2.H(this.$context);
        if (vb2VarH != null) {
            this.$shareViewModel.M(vb2VarH);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        hnd hndVar = (hnd) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        hndVar.r(wefVar);
        return wefVar;
    }
}
