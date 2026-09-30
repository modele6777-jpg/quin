package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class me8 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ x16 $goToReport;
    final /* synthetic */ String $testId;
    final /* synthetic */ se8 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me8(Context context, se8 se8Var, String str, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$vm = se8Var;
        this.$testId = str;
        this.$goToReport = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new me8(this.$context, this.$vm, this.$testId, this.$goToReport, xn2Var);
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
            se8 se8Var = this.$vm;
            String str = this.$testId;
            x16 x16Var = this.$goToReport;
            se8Var.getClass();
            str.getClass();
            x16Var.getClass();
            ynb.V(hwf.a(se8Var), null, null, new oe8(se8Var, vb2VarH, null), 3);
            ok8.C(new al5(new kl5(oa7.b0(se8Var.S0.a(str), 3L, new pe8(2, null)), new qe8(x16Var, se8Var, null), 1), new re8(se8Var, str, null)), hwf.a(se8Var));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        me8 me8Var = (me8) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        me8Var.r(wefVar);
        return wefVar;
    }
}
