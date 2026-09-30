package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mjf extends gbe implements a26 {
    final /* synthetic */ qh2 $config;
    final /* synthetic */ Map<String, Object> $tags;
    int label;
    final /* synthetic */ pjf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjf(pjf pjfVar, qh2 qh2Var, Map map, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = pjfVar;
        this.$config = qh2Var;
        this.$tags = map;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new mjf(this.this$0, this.$config, this.$tags, (xn2) obj).r(wef.a);
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
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#updateCamera2ConfigAsync");
        }
        LinkedHashMap linkedHashMap = this.this$0.k;
        za2 za2Var = pjf.l;
        qh2 qh2Var = this.$config;
        vd9 vd9Var = new vd9(8);
        vd9Var.y(qh2Var);
        linkedHashMap.put(zif.c, new cjf(vd9Var, bm8.Y(this.$tags), (ttb) null, 12));
        pjf pjfVar = this.this$0;
        cjf cjfVarM = pjf.m(pjfVar.k);
        this.label = 1;
        Object objP = pjfVar.p(cjfVarM, null, this);
        bw2 bw2Var = bw2.a;
        return objP == bw2Var ? bw2Var : objP;
    }
}
