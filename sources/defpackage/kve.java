package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kve extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ mfc $schemeType;
    int label;
    final /* synthetic */ lve this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kve(lve lveVar, mfc mfcVar, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lveVar;
        this.$schemeType = mfcVar;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kve(this.this$0, this.$schemeType, this.$context, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            xve xveVar = this.this$0.b;
            mfc mfcVar = this.$schemeType;
            Context context = this.$context;
            this.label = 1;
            Object objB = xveVar.b(this, mfcVar, context);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kve) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
