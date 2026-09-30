package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hdd extends gbe implements l26 {
    int label;
    final /* synthetic */ ldd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdd(ldd lddVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lddVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hdd(this.this$0, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                ldd lddVar = this.this$0;
                fc3 fc3Var = lddVar.e;
                gdd gddVar = new gdd(lddVar, null);
                this.label = 1;
                Object objA = fc3Var.a(gddVar, this);
                bw2 bw2Var = bw2.a;
                this = objA;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                this = this;
            }
        } catch (Exception e) {
            Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
            ldd lddVar2 = this.this$0;
            j0d j0dVar = lddVar2.h;
            if (j0dVar == null) {
                pa7.g0("localSessionData");
                throw null;
            }
            lddVar2.d.getClass();
            lddVar2.h = j0d.a(j0dVar, null, yxe.a(), null, 5);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hdd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
