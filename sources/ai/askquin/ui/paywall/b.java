package ai.askquin.ui.paywall;

import defpackage.aw2;
import defpackage.bw2;
import defpackage.ca2;
import defpackage.cb9;
import defpackage.dc9;
import defpackage.g0e;
import defpackage.gbe;
import defpackage.jzb;
import defpackage.l26;
import defpackage.q4a;
import defpackage.qc0;
import defpackage.wef;
import defpackage.xn2;
import defpackage.y3a;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends gbe implements l26 {
    final /* synthetic */ boolean $isOnboarding;
    final /* synthetic */ cb9 $navController;
    final /* synthetic */ dc9 $navigationViewModel;
    final /* synthetic */ y3a $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y3a y3aVar, boolean z, dc9 dc9Var, cb9 cb9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$vm = y3aVar;
        this.$isOnboarding = z;
        this.$navigationViewModel = dc9Var;
        this.$navController = cb9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b(this.$vm, this.$isOnboarding, this.$navigationViewModel, this.$navController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        boolean z = false;
        if (i == 0) {
            jzb.q(obj);
            if (this.$vm.o() instanceof g0e) {
                if (this.$isOnboarding) {
                    this.$navigationViewModel.i(false);
                    dc9 dc9Var = this.$navigationViewModel;
                    boolean zBooleanValue = ((Boolean) this.$vm.Y0.getValue()).booleanValue();
                    this.label = 1;
                    Object objA = d.a(dc9Var, zBooleanValue, this);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        cb9 cb9Var = this.$navController;
        boolean z2 = this.$vm.z;
        ca2.a.getClass();
        if (!ca2.c && z2) {
            z = true;
        }
        cb9Var.d(new q4a(2), new PaywallRoute.Congratulation(z, this.$vm.z));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
