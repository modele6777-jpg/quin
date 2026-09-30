package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ddd extends gbe implements n26 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ldd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddd(ldd lddVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = lddVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        ddd dddVar = new ddd(this.this$0, (xn2) obj3);
        dddVar.L$0 = (xj5) obj;
        dddVar.L$1 = (Throwable) obj2;
        return dddVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            xj5 xj5Var = (xj5) this.L$0;
            Throwable th = (Throwable) this.L$1;
            n0d n0dVarA = this.this$0.b.a(null);
            j0d j0dVar = new j0d(n0dVarA, null, null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + n0dVarA.a);
            this.L$0 = null;
            this.label = 1;
            Object objA = xj5Var.a(j0dVar, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
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
}
