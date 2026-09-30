package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.Trace;
import android.view.ActionMode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0227 A[Catch: all -> 0x0257, LOOP:1: B:118:0x01d1->B:130:0x0227, LOOP_END, TryCatch #1 {all -> 0x0257, blocks: (B:115:0x01c2, B:118:0x01d1, B:120:0x01e0, B:122:0x01ec, B:124:0x01f5, B:126:0x0204, B:127:0x021d, B:130:0x0227, B:131:0x022c, B:133:0x023e, B:137:0x0253, B:138:0x0256, B:132:0x0231), top: B:207:0x01c2, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x022c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r4;
        ?? r3;
        iud iudVar;
        g55 g55Var;
        int i = this.a;
        char c = 7;
        int i2 = 0;
        boolean z = true;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((k1) obj2).b();
                return;
            case 1:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = we.g;
                Method method = we.f;
                Application application = Build.VERSION.SDK_INT;
                if (application >= 28) {
                    activity.recreate();
                    return;
                }
                ve veVar = 27;
                if (((application != 26 && application != 27) || method != null) && (we.e != null || we.d != null)) {
                    try {
                        Object obj3 = we.c.get(activity);
                        if (obj3 != null && (obj = we.b.get(activity)) != null) {
                            application = activity.getApplication();
                            veVar = new ve(activity);
                            application.registerActivityLifecycleCallbacks(veVar);
                            handler.post(new w36(5, veVar, obj3));
                            if (application != 26 && application != 27) {
                                z = false;
                            }
                            try {
                                if (z) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r3 = application;
                                        r4 = veVar;
                                        handler.post(new lwg(7, r3, r4));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new lwg(7, application, veVar));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = application;
                                r4 = veVar;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 2:
                yj yjVar = (yj) obj2;
                HandlerThread handlerThread = yjVar.e;
                try {
                    yjVar.a();
                    return;
                } finally {
                    handlerThread.quitSafely();
                }
            case 3:
                lq lqVar = (lq) obj2;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    lqVar.d.r(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        lqVar.n();
                        Trace.endSection();
                        lqVar.X0 = false;
                        return;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            case 4:
                zq zqVar = (zq) obj2;
                boolean zD = zqVar.d();
                AndroidComposeView androidComposeView = zqVar.a;
                if (zD) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        androidComposeView.r(true);
                        q69 q69Var = zqVar.x;
                        int[] iArr = q69Var.b;
                        long[] jArr = q69Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = i2; i5 < i4; i5++) {
                                        if ((255 & j) < 128) {
                                            int i6 = iArr[(i3 << 3) + i5];
                                            if (!zqVar.c().a(i6)) {
                                                zqVar.d.add(new am2(i6, zqVar.w, bm2.b, null));
                                                zqVar.g.d(wef.a);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i4 == 8) {
                                        if (i3 != length) {
                                            i3++;
                                            c = 7;
                                            i2 = 0;
                                        }
                                    }
                                } else if (i3 != length) {
                                    i3++;
                                    c = 7;
                                    i2 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            zqVar.f(androidComposeView.getSemanticsOwner().a(), zqVar.y);
                            Trace.endSection();
                            zqVar.b(zqVar.c());
                            zqVar.k();
                            zqVar.z = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
                return;
            case 5:
                ActionMode actionMode = ((rv) obj2).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 6:
                ph0 ph0Var = (ph0) obj2;
                synchronized (ph0Var.a) {
                    try {
                        if (ph0Var.m) {
                            return;
                        }
                        long j2 = ph0Var.l - 1;
                        ph0Var.l = j2;
                        if (j2 > 0) {
                            return;
                        }
                        if (j2 >= 0) {
                            ph0Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (ph0Var.a) {
                            ph0Var.n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 7:
                zi0 zi0Var = (zi0) obj2;
                ((Context) zi0Var.b).unregisterReceiver((yi0) zi0Var.c);
                return;
            case 8:
                yi0 yi0Var = (yi0) obj2;
                if (yi0Var.c.a) {
                    yi0Var.a.a.W(3, false);
                    return;
                }
                return;
            case 9:
                ((ej0) obj2).d();
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                jgb.I(((lk0) obj2).a, null);
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                f98 f98Var = (f98) obj2;
                f98Var.getClass();
                if (Thread.currentThread() == f98Var.a) {
                    f98Var.e(-1, new qc0(4));
                    return;
                }
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                jgb.I(((gd1) obj2).e, null);
                return;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                bm8.P(new xd1((yd1) obj2, null));
                return;
            case 14:
                Process.setThreadPriority(-3);
                ((Runnable) obj2).run();
                return;
            case 15:
                jgb.I((xva) obj2, null);
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                uva uvaVar = (uva) ((hbc) ((ie1) obj2).b).a;
                if (uvaVar != null) {
                    b21.q("ProcessingRequest", "onCaptureStarted: request ID = " + uvaVar.a);
                    utb utbVar = uvaVar.g;
                    p8c.m();
                    if (utbVar.g || utbVar.h) {
                        return;
                    }
                    utbVar.h = true;
                    return;
                }
                return;
            case 17:
                sb2 sb2Var = (sb2) obj2;
                Runnable runnable = sb2Var.b;
                if (runnable != null) {
                    runnable.run();
                    sb2Var.b = null;
                    return;
                }
                return;
            case 18:
                zb2.e((zb2) obj2);
                return;
            case 19:
                ((hy2) ((qy2) obj2).d()).a(new g76("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 20:
                ro3 ro3Var = (ro3) obj2;
                ro3Var.M(ro3Var.H(), 1028, new qd3(19));
                ro3Var.f.d();
                return;
            case 21:
                jp3 jp3Var = (jp3) obj2;
                if (jp3Var.b0 >= 300000) {
                    ((qo8) jp3Var.n.b).f2 = true;
                    jp3Var.b0 = 0L;
                    return;
                }
                return;
            case 22:
                ((la1) obj2).d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                return;
            case 23:
                ((oae) obj2).close();
                return;
            case 24:
                ft3 ft3Var = (ft3) obj2;
                ft3Var.x = true;
                ft3Var.d();
                return;
            case 25:
                ((ot3) obj2).d(false);
                return;
            case 26:
                au3 au3Var = (au3) obj2;
                if (!au3Var.f.B || Build.VERSION.SDK_INT < 32 || (iudVar = au3Var.h) == null || !iudVar.b || (g55Var = au3Var.a) == null) {
                    return;
                }
                g55Var.g.c(10, null).b();
                return;
            case 27:
                ((gu3) obj2).i.d();
                return;
            case 28:
                vq4 vq4Var = (vq4) obj2;
                vq4Var.f = true;
                vq4Var.d();
                return;
            default:
                xi2 xi2Var = (xi2) ((a82) obj2).e;
                if (xi2Var != null) {
                    Iterator it = xi2Var.values().iterator();
                    while (it.hasNext()) {
                        ((iae) it.next()).b();
                    }
                    return;
                }
                return;
        }
    }
}
