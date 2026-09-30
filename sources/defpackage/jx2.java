package defpackage;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jx2 implements mu3, zv3, zbe {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jx2(lp0 lp0Var, Iterable iterable, qq0 qq0Var, long j) {
        this.a = 3;
        this.c = lp0Var;
        this.d = iterable;
        this.e = qq0Var;
        this.b = j;
    }

    @Override // defpackage.zv3
    public ScheduledFuture a(mjg mjgVar) {
        int i = this.a;
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        yv3 yv3Var = (yv3) this.c;
        switch (i) {
            case 1:
                return yv3Var.b.schedule(new wv3(yv3Var, (Runnable) obj2, mjgVar, 1), j, (TimeUnit) obj);
            default:
                return yv3Var.b.schedule(new xv3(yv3Var, (Callable) obj2, mjgVar, 0), j, (TimeUnit) obj);
        }
    }

    @Override // defpackage.mu3
    public void i(i1b i1bVar) {
        CrashlyticsNativeComponentDeferredProxy.lambda$prepareNativeSession$1((String) this.c, (String) this.d, this.b, (StaticSessionData) this.e, i1bVar);
    }

    @Override // defpackage.zbe
    public Object p() {
        lp0 lp0Var = (lp0) this.c;
        Iterable iterable = (Iterable) this.d;
        qq0 qq0Var = (qq0) this.e;
        w8c w8cVar = (w8c) lp0Var.d;
        w8cVar.getClass();
        if (iterable.iterator().hasNext()) {
            w8cVar.l(new bo1(21, w8cVar, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(w8c.G(iterable))));
        }
        w8cVar.l(new t8c(((j52) lp0Var.v).e() + this.b, qq0Var));
        return null;
    }

    public /* synthetic */ jx2(Object obj, Object obj2, long j, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }
}
