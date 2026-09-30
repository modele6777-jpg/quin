package defpackage;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qag extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ lr5 $foregroundUpdater;
    final /* synthetic */ lbg $spec;
    final /* synthetic */ v88 $worker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qag(v88 v88Var, lbg lbgVar, lr5 lr5Var, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$worker = v88Var;
        this.$spec = lbgVar;
        this.$foregroundUpdater = lr5Var;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qag(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            pa1 pa1VarA = this.$worker.a();
            v88 v88Var = this.$worker;
            this.label = 1;
            obj = dcg.a(pa1VarA, v88Var, this);
            if (obj != bw2Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        kr5 kr5Var = (kr5) obj;
        if (kr5Var == null) {
            qc0.p(ks0.l(new StringBuilder("Worker was marked important ("), this.$spec.c, ") but did not provide ForegroundInfo"));
            return null;
        }
        String str = rag.a;
        lbg lbgVar = this.$spec;
        ff8.h().e(str, "Updating notification for " + lbgVar.c);
        lr5 lr5Var = this.$foregroundUpdater;
        Context context = this.$context;
        UUID uuid = this.$worker.b.a;
        sag sagVar = (sag) lr5Var;
        h80 h80Var = sagVar.a.a;
        zlb zlbVar = new zlb(sagVar, uuid, kr5Var, context, 6);
        h80Var.getClass();
        pa1 pa1VarT = y41.t(new gi2(h80Var, "setForegroundAsync", zlbVar, 7));
        this.label = 2;
        Object objN = vfh.n(pa1VarT, this);
        return objN == bw2Var ? bw2Var : objN;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qag) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
