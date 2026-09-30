package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class na5 extends ele {
    public final /* synthetic */ j7c e;
    public final /* synthetic */ oa5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na5(String str, j7c j7cVar, oa5 oa5Var) {
        super(str);
        this.e = j7cVar;
        this.f = oa5Var;
    }

    @Override // defpackage.ele
    public final long a() throws InterruptedException {
        i7c i7cVar;
        j7c j7cVar = this.e;
        try {
            i7cVar = j7cVar.d();
        } catch (Throwable th) {
            i7cVar = new i7c(j7cVar, th, 2);
        }
        oa5 oa5Var = this.f;
        if (!((CopyOnWriteArrayList) oa5Var.d).contains(j7cVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) oa5Var.e).put(i7cVar);
        return -1L;
    }
}
