package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uk3 extends gbe implements l26 {
    final /* synthetic */ r0 $divinationViewModel;
    final /* synthetic */ e89 $mixedConfirming$delegate;
    final /* synthetic */ x16 $onConfirm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk3(r0 r0Var, x16 x16Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$divinationViewModel = r0Var;
        this.$onConfirm = x16Var;
        this.$mixedConfirming$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new uk3(this.$divinationViewModel, this.$onConfirm, this.$mixedConfirming$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                r0 r0Var = this.$divinationViewModel;
                if (r0Var != null) {
                    this.label = 1;
                    js3 js3Var = ga4.a;
                    obj = ynb.p0(mk8.a.f, new ae4(r0Var, null), this);
                    bw2 bw2Var = bw2.a;
                    if (obj == bw2Var) {
                        return bw2Var;
                    }
                }
                e89 e89Var = this.$mixedConfirming$delegate;
                int i2 = zk3.b;
                e89Var.setValue(Boolean.FALSE);
                return wef.a;
            }
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            if (((Boolean) obj).booleanValue()) {
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new i73(29), 2);
                zk3.j(this.$divinationViewModel);
                this.$onConfirm.invoke();
            }
            e89 e89Var2 = this.$mixedConfirming$delegate;
            int i3 = zk3.b;
            e89Var2.setValue(Boolean.FALSE);
            return wef.a;
        } catch (Throwable th) {
            e89 e89Var3 = this.$mixedConfirming$delegate;
            int i4 = zk3.b;
            e89Var3.setValue(Boolean.FALSE);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((uk3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
