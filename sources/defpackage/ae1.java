package defpackage;

import android.content.res.Configuration;
import android.hardware.camera2.CameraCaptureSession;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.android.replay.capture.b;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.capture.i;
import io.sentry.android.replay.capture.n;
import io.sentry.android.replay.capture.o;
import io.sentry.android.replay.capture.s;
import io.sentry.android.replay.k;
import io.sentry.android.replay.q;
import io.sentry.l0;
import io.sentry.o2;
import io.sentry.protocol.g;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.rrweb.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ae1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ae1(Object obj, long j, Comparable comparable, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = comparable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        g gVar = null;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((gk1) obj2).a.onCaptureSequenceCompleted((CameraCaptureSession) obj, -1, j);
                return;
            case 1:
                ((atb) obj2).x((qtb) obj, j);
                return;
            case 2:
                ((CrashlyticsCore) obj2).lambda$log$2(j, (String) obj);
                return;
            case 3:
                t45 t45Var = (t45) ((lqb) obj2).c;
                String str = pqf.a;
                y45 y45Var = t45Var.a;
                ro3 ro3Var = y45Var.s;
                pl plVarL = ro3Var.L();
                ro3Var.M(plVarL, 26, new jb2(plVarL, obj, j));
                if (y45Var.S == obj) {
                    y45Var.m.e(26, new pd4(14));
                    return;
                }
                return;
            case 4:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                Configuration configuration = (Configuration) obj;
                l0 l0Var = AppComponentsBreadcrumbsIntegration.e;
                if (appComponentsBreadcrumbsIntegration.b != null) {
                    int i2 = appComponentsBreadcrumbsIntegration.a.getResources().getConfiguration().orientation;
                    if (i2 == 1) {
                        gVar = g.PORTRAIT;
                    } else if (i2 == 2) {
                        gVar = g.LANDSCAPE;
                    }
                    String lowerCase = gVar != null ? gVar.name().toLowerCase(Locale.ROOT) : "undefined";
                    io.sentry.g gVar2 = new io.sentry.g(j);
                    gVar2.e = "navigation";
                    gVar2.g = "device.orientation";
                    gVar2.d(lowerCase, "position");
                    gVar2.w = q5.INFO;
                    l0 l0Var2 = new l0();
                    l0Var2.d(configuration, "android:configuration");
                    appComponentsBreadcrumbsIntegration.b.i(gVar2, l0Var2);
                    return;
                }
                return;
            default:
                o oVar = (o) obj2;
                q qVar = (q) obj;
                k kVar = oVar.h;
                if (kVar != null) {
                    qVar.z(kVar, Long.valueOf(j));
                }
                long currentTimeMillis = oVar.x.getCurrentTimeMillis() - oVar.v.getSessionReplay().h;
                k kVar2 = oVar.h;
                String strX = kVar2 != null ? kVar2.x(currentTimeMillis) : null;
                b bVar = oVar.l;
                wn7 wn7Var = i.u[2];
                bVar.getClass();
                wn7Var.getClass();
                Object andSet = bVar.b.getAndSet(strX);
                if (!pa7.t(andSet, strX)) {
                    h hVar = new h(andSet, strX, bVar.d);
                    i iVar = bVar.c;
                    q6 q6Var = iVar.a;
                    if (q6Var.getThreadChecker().c()) {
                        iVar.e.submit(new io.sentry.android.replay.util.h(new o2(8, hVar), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            hVar.invoke();
                        } catch (Throwable th) {
                            q6Var.getLogger().d(q5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                    break;
                }
                ArrayList arrayList = oVar.z;
                imb imbVar = new imb();
                x72.i0(new n(currentTimeMillis, oVar, imbVar), arrayList);
                if (imbVar.element) {
                    int i3 = 0;
                    for (Object obj3 : arrayList) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            t72.Z();
                            throw null;
                        }
                        s sVar = (s) obj3;
                        sVar.a.I0 = i3;
                        List<io.sentry.rrweb.b> list = sVar.b.b;
                        if (list != null) {
                            for (io.sentry.rrweb.b bVar2 : list) {
                                if (bVar2 instanceof m) {
                                    ((m) bVar2).d = i3;
                                }
                            }
                        }
                        i3 = i4;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ae1(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
