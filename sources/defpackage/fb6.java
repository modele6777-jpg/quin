package defpackage;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fb6 extends gbe implements l26 {
    final /* synthetic */ float $fallbackHue;
    final /* synthetic */ e89 $resolvedHue$delegate;
    final /* synthetic */ int $resourceId;
    final /* synthetic */ Resources $resources;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb6(float f, e89 e89Var, Resources resources, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.$fallbackHue = f;
        this.$resolvedHue$delegate = e89Var;
        this.$resources = resources;
        this.$resourceId = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fb6(this.$fallbackHue, this.$resolvedHue$delegate, this.$resources, this.$resourceId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        e89 e89Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (((Float) this.$resolvedHue$delegate.getValue()) == null) {
                e89Var = this.$resolvedHue$delegate;
                js3 js3Var = ga4.a;
                eb6 eb6Var = new eb6(this.$resources, this.$resourceId, null);
                this.L$0 = e89Var;
                this.label = 1;
                obj = ynb.p0(js3Var, eb6Var, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e89Var = (e89) this.L$0;
        jzb.q(obj);
        Float f = (Float) obj;
        if (f == null) {
            f = new Float(this.$fallbackHue);
        }
        e89Var.setValue(f);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fb6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
