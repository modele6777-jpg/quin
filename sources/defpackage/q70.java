package defpackage;

import ai.askquin.App;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q70 extends gbe implements l26 {
    int label;
    final /* synthetic */ App this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(App app, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = app;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new q70(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        xa0.a();
        lgc lgcVar = lgc.a;
        App app = this.this$0;
        app.getClass();
        lgc.b = true;
        if (!lgc.c) {
            lgc.c = true;
            app.registerActivityLifecycleCallbacks(lgcVar);
        }
        h5g.a.b(this.this$0);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        q70 q70Var = (q70) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        q70Var.r(wefVar);
        return wefVar;
    }
}
