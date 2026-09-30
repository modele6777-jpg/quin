package defpackage;

import ai.askquin.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tdf extends gbe implements l26 {
    final /* synthetic */ o6a $action;
    final /* synthetic */ pad $carouselRegistry;
    final /* synthetic */ x6d $configuration;
    final /* synthetic */ pad $exportRegistry;
    final /* synthetic */ bad $operationController;
    final /* synthetic */ e89 $pendingGeneratedAction$delegate;
    final /* synthetic */ l26 $publishReading;
    final /* synthetic */ e89 $publishingReading$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdf(l26 l26Var, x6d x6dVar, o6a o6aVar, pad padVar, pad padVar2, bad badVar, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$publishReading = l26Var;
        this.$configuration = x6dVar;
        this.$action = o6aVar;
        this.$exportRegistry = padVar;
        this.$carouselRegistry = padVar2;
        this.$operationController = badVar;
        this.$pendingGeneratedAction$delegate = e89Var;
        this.$publishingReading$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tdf(this.$publishReading, this.$configuration, this.$action, this.$exportRegistry, this.$carouselRegistry, this.$operationController, this.$pendingGeneratedAction$delegate, this.$publishingReading$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    jzb.q(obj);
                    l26 l26Var = this.$publishReading;
                    if (l26Var != null) {
                        Object obj2 = this.$configuration.c.get(this.$action.a());
                        this.label = 1;
                        Object objZ = l26Var.z(obj2, this);
                        bw2 bw2Var = bw2.a;
                        if (objZ == bw2Var) {
                            return bw2Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jzb.q(obj);
                }
                this.$exportRegistry.b(this.$action.a(), this.$carouselRegistry);
                if (this.$exportRegistry.f(this.$action.a())) {
                    scc.e(this.$configuration, this.$operationController, this.$action);
                } else {
                    this.$pendingGeneratedAction$delegate.setValue(this.$action);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                jcc.k(0, new Integer(R.string.share_failed));
            }
            this.$publishingReading$delegate.setValue(Boolean.FALSE);
            return wef.a;
        } catch (Throwable th) {
            this.$publishingReading$delegate.setValue(Boolean.FALSE);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tdf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
