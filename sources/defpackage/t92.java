package defpackage;

import io.sentry.android.replay.b0;
import io.sentry.android.replay.capture.i;
import io.sentry.android.replay.capture.s;
import io.sentry.android.replay.capture.u;
import io.sentry.android.replay.capture.z;
import io.sentry.android.replay.k;
import io.sentry.android.replay.q;
import io.sentry.q5;
import io.sentry.q6;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t92 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t92(Object obj, Object obj2, long j, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = j;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        long j = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((atb) obj3).g0((qtb) obj2, j, (ptb) obj);
                break;
            case 1:
                ((atb) obj3).W((qtb) obj2, j, (es) obj);
                break;
            default:
                z zVar = (z) obj3;
                q qVar = (q) obj2;
                b0 b0Var = (b0) obj;
                k kVar = zVar.h;
                q6 q6Var = zVar.v;
                if (kVar != null) {
                    qVar.z(kVar, Long.valueOf(j));
                }
                Date date = (Date) zVar.j.a(i.u[1], zVar);
                if (date == null) {
                    q6Var.getLogger().i(q5.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                } else if (zVar.g.get()) {
                    q6Var.getLogger().i(q5.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                } else if (b0Var != null) {
                    long currentTimeMillis = zVar.x.getCurrentTimeMillis();
                    if (currentTimeMillis - date.getTime() >= q6Var.getSessionReplay().i) {
                        u uVarC = i.c(zVar, q6Var.getSessionReplay().i, date, zVar.d(), zVar.e(), b0Var.b, b0Var.a, b0Var.e, b0Var.f);
                        if (uVarC instanceof s) {
                            s sVar = (s) uVarC;
                            s.a(sVar, zVar.w);
                            zVar.k(zVar.e() + 1);
                            zVar.m(sVar.a.J0);
                        }
                    }
                    if (currentTimeMillis - zVar.k.get() >= q6Var.getSessionReplay().j) {
                        q6Var.getReplayController().stop();
                        q6Var.getLogger().i(q5.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                    }
                } else {
                    q6Var.getLogger().i(q5.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                }
                break;
        }
    }
}
