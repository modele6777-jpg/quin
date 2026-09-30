package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vv3 implements zv3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv3 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ vv3(yv3 yv3Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = yv3Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.zv3
    public final ScheduledFuture a(mjg mjgVar) {
        int i = this.a;
        Runnable runnable = this.c;
        yv3 yv3Var = this.b;
        switch (i) {
            case 0:
                return yv3Var.b.scheduleAtFixedRate(new wv3(yv3Var, runnable, mjgVar, 0), this.d, this.e, this.f);
            default:
                return yv3Var.b.scheduleWithFixedDelay(new wv3(yv3Var, runnable, mjgVar, 2), this.d, this.e, this.f);
        }
    }
}
