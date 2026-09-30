package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wk1 extends gbe implements l26 {
    final /* synthetic */ rxf $$this$onSurfaceSession;
    final /* synthetic */ dg7 $cancellationWatcherJob;
    final /* synthetic */ wae $surfaceRequest;
    final /* synthetic */ xae $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk1(xae xaeVar, wae waeVar, rxf rxfVar, dg7 dg7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_with = xaeVar;
        this.$surfaceRequest = waeVar;
        this.$$this$onSurfaceSession = rxfVar;
        this.$cancellationWatcherJob = dg7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wk1(this.$this_with, this.$surfaceRequest, this.$$this$onSurfaceSession, this.$cancellationWatcherJob, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            xae xaeVar = this.$this_with;
            wae waeVar = this.$surfaceRequest;
            Surface surface = ((hxf) this.$$this$onSurfaceSession).b;
            this.label = 1;
            xaeVar.getClass();
            pl1 pl1Var = new pl1(1, k99.D(this));
            pl1Var.v();
            waeVar.a(surface, new mc0(1), new is4(3, pl1Var));
            pl1Var.x(vic.J0);
            obj = pl1Var.t();
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        this.$cancellationWatcherJob.h(null);
        if (((kq0) obj).a != 3) {
            return wef.a;
        }
        wae waeVar2 = this.$surfaceRequest;
        waeVar2.c();
        return Boolean.valueOf(waeVar2.i.b(null));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wk1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
