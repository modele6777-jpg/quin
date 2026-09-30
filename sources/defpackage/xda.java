package defpackage;

import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xda extends gbe implements l26 {
    final /* synthetic */ imb $isFirstEmission;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zda this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xda(zda zdaVar, imb imbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = zdaVar;
        this.$isFirstEmission = imbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        xda xdaVar = new xda(this.this$0, this.$isFirstEmission, xn2Var);
        xdaVar.L$0 = obj;
        return xdaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            List list = (List) this.L$0;
            Log.d("PipePresenceSrc", "Flow emitted new camera set: ".concat(s72.D0(list, null, null, null, null, 63)));
            if (!this.this$0.h.get()) {
                ok8.j(Log.d("PipePresenceSrc", "Ignoring camera update because monitoring is stopped."));
            } else if (this.$isFirstEmission.element) {
                Log.i("PipePresenceSrc", "Handling first camera set, triggering fresh query.");
                m88 m88VarA = this.this$0.a();
                this.label = 1;
                Object objN = vfh.n(m88VarA, this);
                bw2 bw2Var = bw2.a;
                if (objN == bw2Var) {
                    return bw2Var;
                }
            } else {
                this.this$0.c(list, null);
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$isFirstEmission.element = false;
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xda) k((xn2) obj2, (List) obj)).r(wef.a);
    }
}
