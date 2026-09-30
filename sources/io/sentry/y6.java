package io.sentry;

import android.app.Activity;
import defpackage.gi2;
import defpackage.nzf;
import defpackage.pa7;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.navigation.SentryNavigationListener;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y6 implements d4, g4, io.sentry.android.core.w1, io.sentry.instrumentation.file.a, b4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y6(e1 e1Var, q6 q6Var) {
        this.a = 10;
        this.c = e1Var;
        this.b = q6Var;
    }

    @Override // io.sentry.b4
    public void a(w3 w3Var) {
        e1 e1Var = (e1) this.c;
        q6 q6Var = (q6) this.b;
        c cVar = (c) w3Var.e;
        if (cVar.f) {
            w3 w3VarX = e1Var.x();
            io.sentry.protocol.w wVarL = e1Var.l();
            cVar.d("sentry-trace_id", ((io.sentry.protocol.w) w3VarX.b).a());
            cVar.d("sentry-public_key", q6Var.retrieveParsedDsn().b);
            cVar.d("sentry-release", q6Var.getRelease());
            cVar.d("sentry-environment", q6Var.getEnvironment());
            if (!io.sentry.protocol.w.b.equals(wVarL)) {
                cVar.d("sentry-replay_id", wVarL.a());
            }
            cVar.d("sentry-org_id", q6Var.getEffectiveOrgId());
            cVar.d("sentry-transaction", null);
            if (cVar.f) {
                cVar.c = null;
            }
            cVar.d("sentry-sampled", null);
            cVar.f = false;
        }
    }

    @Override // io.sentry.android.core.w1
    public void b() {
        io.sentry.android.core.c2 c2Var = (io.sentry.android.core.c2) this.b;
        Activity activity = (Activity) ((WeakReference) this.c).get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.runOnUiThread(new nzf(10, c2Var, activity));
    }

    @Override // io.sentry.d4
    public void c(q1 q1Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                e1 e1Var = (e1) obj;
                if (q1Var == ((a7) obj2)) {
                    e1Var.s();
                }
                break;
            case 5:
                e1 e1Var2 = (e1) obj;
                if (q1Var == ((io.sentry.android.core.internal.gestures.g) obj2).e) {
                    e1Var2.s();
                }
                break;
            default:
                e1 e1Var3 = (e1) obj;
                if (pa7.t(q1Var, ((SentryNavigationListener) obj2).f)) {
                    e1Var3.s();
                }
                break;
        }
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() throws IOException {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 7:
                return Integer.valueOf(((io.sentry.instrumentation.file.d) obj2).a.read((byte[]) obj));
            case 8:
                int i2 = ((io.sentry.instrumentation.file.d) obj2).a.read();
                ((AtomicInteger) obj).set(i2);
                return Integer.valueOf(i2 != -1 ? 1 : 0);
            default:
                byte[] bArr = (byte[]) obj;
                ((io.sentry.instrumentation.file.e) obj2).a.write(bArr);
                return Integer.valueOf(bArr.length);
        }
    }

    @Override // io.sentry.g4
    public void g(e1 e1Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                e1Var.I(new io.sentry.android.core.e((ActivityLifecycleIntegration) obj2, e1Var, (q1) obj));
                break;
            default:
                e1Var.I(new gi2((io.sentry.android.core.internal.gestures.g) obj2, e1Var, (q1) obj, 15));
                break;
        }
    }

    public /* synthetic */ y6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
