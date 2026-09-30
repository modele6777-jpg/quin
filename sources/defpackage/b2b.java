package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b2b extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f2b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2b(f2b f2bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = f2bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        b2b b2bVar = new b2b(this.this$0, xn2Var);
        b2bVar.L$0 = obj;
        return b2bVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.this$0.f.addLast(this.L$0);
        Object objK = this.this$0.e.k();
        while (true) {
            boolean z = objK instanceof qw1;
            f2b f2bVar = this.this$0;
            if (z) {
                Log.d("CXCP", "PruningProcessingQueue: Pruning " + f2bVar.f);
                f2b f2bVar2 = this.this$0;
                f2bVar2.a.d(f2bVar2.f);
                return wef.a;
            }
            ad0 ad0Var = f2bVar.f;
            rw1.c(objK);
            ad0Var.addLast(objK);
            objK = this.this$0.e.k();
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws Throwable {
        b2b b2bVar = (b2b) k((xn2) obj2, obj);
        wef wefVar = wef.a;
        b2bVar.r(wefVar);
        return wefVar;
    }
}
