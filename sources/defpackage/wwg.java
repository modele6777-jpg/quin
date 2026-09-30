package defpackage;

import ai.askquin.services.InAppMessagePollingService;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnThirdPartySharingSettingsReadListener;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.bs;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.perf.metrics.AppStartTrace;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wwg implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ wwg(hfg hfgVar, bs bsVar) {
        this.a = 29;
        this.b = hfgVar;
    }

    private final void a() {
        ele eleVarB;
        long jNanoTime;
        ele eleVarB2;
        kle kleVar = (kle) this.b;
        synchronized (kleVar) {
            kleVar.g++;
            eleVarB = kleVar.b();
        }
        if (eleVarB == null) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        while (true) {
            try {
                threadCurrentThread.setName(eleVarB.a);
                Logger logger = ((kle) this.b).b;
                jle jleVar = eleVarB.c;
                jleVar.getClass();
                boolean zIsLoggable = logger.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = System.nanoTime();
                    gcc.v(logger, eleVarB, jleVar, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    long jA = eleVarB.a();
                    if (zIsLoggable) {
                        gcc.v(logger, eleVarB, jleVar, "finished run in " + gcc.p(System.nanoTime() - jNanoTime));
                    }
                    kle kleVar2 = (kle) this.b;
                    synchronized (kleVar2) {
                        kleVar2.a(eleVarB, jA, true);
                        eleVarB2 = kleVar2.b();
                    }
                    if (eleVarB2 == null) {
                        threadCurrentThread.setName(name);
                        return;
                    }
                    eleVarB = eleVarB2;
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        gcc.v(logger, eleVarB, jleVar, "failed a run in " + gcc.p(System.nanoTime() - jNanoTime));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    kle kleVar3 = (kle) this.b;
                    synchronized (kleVar3) {
                        kleVar3.a(eleVarB, -1L, false);
                        if (!(th2 instanceof InterruptedException)) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        threadCurrentThread.setName(name);
                        return;
                    }
                } catch (Throwable th3) {
                    threadCurrentThread.setName(name);
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        defpackage.b21.w("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.b     // Catch: java.lang.Throwable -> L4f
            lyc r2 = (defpackage.lyc) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r2 = r2.a     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.b     // Catch: java.lang.Throwable -> L20
            lyc r0 = (defpackage.lyc) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.d     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L44
        L20:
            r10 = move-exception
            goto L69
        L22:
            long r6 = r0.e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.e = r6     // Catch: java.lang.Throwable -> L20
            r0.d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.b     // Catch: java.lang.Throwable -> L20
            lyc r4 = (defpackage.lyc) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L45
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> L20
            lyc r10 = (defpackage.lyc) r10     // Catch: java.lang.Throwable -> L20
            r10.d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
            goto L18
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            goto L2
        L4f:
            r10 = move-exception
            goto L6b
        L51:
            r2 = move-exception
            java.lang.String r3 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            defpackage.b21.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L4f
            goto L2
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L4f
        L6b:
            if (r1 == 0) goto L74
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L74:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwg.b():void");
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01e1  */
    @Override // java.lang.Runnable
    public final void run() {
        vwg vwgVar;
        avg avgVar;
        int actionMasked;
        boolean zA;
        Object obj;
        boolean z;
        yc ycVar;
        float f = 0.0f;
        switch (this.a) {
            case 0:
                zwg zwgVar = (zwg) this.b;
                if (zwgVar == null || (vwgVar = zwgVar.v) == null) {
                    return;
                }
                this.b = null;
                if (vwgVar.isDone()) {
                    Object obj2 = zwgVar.a;
                    if (obj2 == null) {
                        if (vwgVar.isDone()) {
                            if (ivg.g.B(zwgVar, null, zwg.h(vwgVar))) {
                                zwg.j(zwgVar);
                                return;
                            }
                            return;
                        }
                        yug yugVar = new yug(zwgVar, vwgVar);
                        if (ivg.g.B(zwgVar, null, yugVar)) {
                            try {
                                vwgVar.c(yugVar, ewg.a);
                                return;
                            } catch (Throwable th) {
                                try {
                                    avgVar = new avg(th);
                                    break;
                                } catch (Error | Exception unused) {
                                    avgVar = avg.b;
                                }
                                ivg.g.B(zwgVar, yugVar, avgVar);
                                return;
                            }
                        }
                        obj2 = zwgVar.a;
                    }
                    if (obj2 instanceof xug) {
                        vwgVar.cancel(((xug) obj2).a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = zwgVar.w;
                    zwgVar.w = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (Throwable th2) {
                            if (ivg.g.B(zwgVar, null, new avg(new xwg(str)))) {
                                zwg.j(zwgVar);
                            }
                            throw th2;
                        }
                    }
                    if (ivg.g.B(zwgVar, null, new avg(new xwg(str + ": " + vwgVar.toString())))) {
                        zwg.j(zwgVar);
                    }
                    vwgVar.cancel(true);
                    return;
                } catch (Throwable th3) {
                    vwgVar.cancel(true);
                    throw th3;
                }
            case 1:
                AdjustTimeoutCallback adjustTimeoutCallback = ((le) this.b).b;
                OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(null);
                }
                adjustTimeoutCallback.setOnAdidReadListener(null);
                return;
            case 2:
                AdjustTimeoutCallback adjustTimeoutCallback2 = ((le) this.b).b;
                OnAttributionReadListener onAttributionReadListener = adjustTimeoutCallback2.getOnAttributionReadListener();
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(null);
                }
                adjustTimeoutCallback2.setOnAttributionReadListener(null);
                return;
            case 3:
                AdjustTimeoutCallback adjustTimeoutCallback3 = ((le) this.b).b;
                OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener = adjustTimeoutCallback3.getOnThirdPartySharingSettingsReadListener();
                if (onThirdPartySharingSettingsReadListener != null) {
                    onThirdPartySharingSettingsReadListener.onThirdPartySharingSettingsRead(null);
                }
                adjustTimeoutCallback3.setOnThirdPartySharingSettingsReadListener(null);
                return;
            case 4:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.b;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.C1;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7) {
                    if (actionMasked == 8) {
                        i = 9;
                    } else if (actionMasked != 9) {
                        i = 2;
                    }
                }
                androidComposeView.I(motionEvent, i, androidComposeView.D1, false);
                return;
            case 5:
                AppStartTrace appStartTrace = (AppStartTrace) this.b;
                if (appStartTrace.w == null) {
                    appStartTrace.x = new oye();
                    return;
                }
                return;
            case 6:
                l88 l88Var = (l88) this.b;
                hq4 hq4Var = l88Var.c;
                vn0 vn0Var = l88Var.a;
                if (l88Var.Y) {
                    if (l88Var.z) {
                        l88Var.z = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        vn0Var.e = jCurrentAnimationTimeMillis;
                        vn0Var.g = -1L;
                        vn0Var.f = jCurrentAnimationTimeMillis;
                        vn0Var.h = 0.5f;
                    }
                    if ((vn0Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > vn0Var.g + ((long) vn0Var.i)) || !l88Var.e()) {
                        l88Var.Y = false;
                        return;
                    }
                    if (l88Var.X) {
                        l88Var.X = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        hq4Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (vn0Var.f == 0) {
                        ho7.n("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = vn0Var.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - vn0Var.f;
                    vn0Var.f = jCurrentAnimationTimeMillis2;
                    l88Var.E0.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * vn0Var.d));
                    WeakHashMap weakHashMap = nvf.a;
                    hq4Var.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                ii2 ii2Var = (ii2) this.b;
                synchronized (ii2Var) {
                    zA = ii2Var.a();
                    if (zA) {
                        synchronized (ii2Var) {
                            ii2Var.b = true;
                        }
                    }
                }
                if (zA) {
                    if (new Date(System.currentTimeMillis()).before(ii2Var.p.c().b)) {
                        ii2Var.h();
                        return;
                    }
                    nf5 nf5Var = (nf5) ii2Var.k;
                    gfh gfhVarD = nf5Var.d();
                    gfh gfhVarC = nf5Var.c();
                    Task taskG = Tasks.f(gfhVarD, gfhVarC).g(ii2Var.h, new gi2(ii2Var, gfhVarD, gfhVarC, 0));
                    Tasks.f(taskG).f(ii2Var.h, new bo1(5, ii2Var, taskG));
                    return;
                }
                return;
            case 8:
                l84 l84Var = (l84) this.b;
                l84Var.k1.onDismiss(l84Var.s1);
                return;
            case 9:
                hq4 hq4Var2 = (hq4) this.b;
                hq4Var2.z = null;
                hq4Var2.drawableStateChanged();
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ua5 ua5Var = (ua5) this.b;
                ValueAnimator valueAnimator = ua5Var.z;
                int i2 = ua5Var.A;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                ua5Var.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                kx5 kx5Var = (kx5) this.b;
                if (kx5Var.X0 != null) {
                    kx5Var.d();
                    return;
                }
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((zx5) this.b).z(true);
                return;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ta0 ta0Var = (ta0) this.b;
                zg6 zg6Var = (zg6) ta0Var.b;
                if (zg6Var.a.getAndSet(null) != null) {
                    ((Handler) ta0Var.c).removeCallbacks(zg6Var);
                    return;
                }
                return;
            case 14:
                js3 js3Var = ga4.a;
                qn2 qn2VarK = jgb.k(hr3.c);
                InAppMessagePollingService inAppMessagePollingService = (InAppMessagePollingService) this.b;
                ynb.V(qn2VarK, null, null, new kz6(inAppMessagePollingService, null), 3);
                inAppMessagePollingService.b.postDelayed(this, inAppMessagePollingService.c);
                return;
            case 15:
                ((InstallReferrer) this.b).startConnection();
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                o78 o78Var = (o78) this.b;
                o78Var.b = null;
                o78Var.a = null;
                return;
            case 17:
                synchronized (((q98) this.b).a) {
                    obj = ((q98) this.b).f;
                    ((q98) this.b).f = q98.k;
                    break;
                }
                ((q98) this.b).k(obj);
                return;
            case 18:
                lxa lxaVar = (lxa) this.b;
                for (ncc nccVar : lxaVar.J0) {
                    nccVar.p(true);
                    ssg ssgVar = nccVar.h;
                    if (ssgVar != null) {
                        ssgVar.M(nccVar.e);
                        nccVar.h = null;
                        nccVar.g = null;
                    }
                }
                ta0 ta0Var2 = lxaVar.X;
                l95 l95Var = (l95) ta0Var2.d;
                if (l95Var != null) {
                    l95Var.a();
                    ta0Var2.d = null;
                }
                ta0Var2.b = null;
                return;
            case 19:
                ux8 ux8Var = (ux8) this.b;
                tx8 tx8Var = ux8Var.e;
                if (ux8Var.c && ux8Var.d) {
                    ux8Var.c = false;
                    try {
                        double dCurrentTimeMillis = System.currentTimeMillis() - ux8.g.doubleValue();
                        gj8 gj8Var = ux8Var.f;
                        if (dCurrentTimeMillis >= gj8Var.p && dCurrentTimeMillis < gj8Var.q && tx8Var.d.booleanValue()) {
                            double dRound = Math.round((dCurrentTimeMillis / 1000.0d) * 10.0d) / 10.0d;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("$ae_session_length", dRound);
                            tx8Var.f.K("$ae_total_app_sessions", 1.0d);
                            tx8Var.f.K("$ae_total_app_session_length", dRound);
                            tx8Var.l("$ae_session", jSONObject, true);
                        }
                        break;
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    if (tx8Var.c.c) {
                        tx8Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                RecyclerView recyclerView = (RecyclerView) this.b;
                rkb rkbVar = recyclerView.b1;
                if (rkbVar != null) {
                    nr3 nr3Var = (nr3) rkbVar;
                    long j2 = nr3Var.d;
                    ArrayList<flb> arrayList = nr3Var.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = nr3Var.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = nr3Var.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = nr3Var.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        for (flb flbVar : arrayList) {
                            View view = flbVar.a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            nr3Var.q.add(flbVar);
                            viewPropertyAnimatorAnimate.setDuration(j2).alpha(f).setListener(new ir3(nr3Var, flbVar, viewPropertyAnimatorAnimate, view)).start();
                            f = f;
                        }
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            nr3Var.m.add(arrayList5);
                            arrayList2.clear();
                            lwg lwgVar = new lwg(nr3Var, arrayList5, false, 11);
                            if (zIsEmpty) {
                                lwgVar.run();
                            } else {
                                View view2 = ((mr3) arrayList5.get(0)).a.a;
                                WeakHashMap weakHashMap2 = nvf.a;
                                view2.postOnAnimationDelayed(lwgVar, j2);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            nr3Var.n.add(arrayList6);
                            arrayList3.clear();
                            v36 v36Var = new v36(nr3Var, arrayList6, false, 14);
                            if (zIsEmpty) {
                                v36Var.run();
                            } else {
                                View view3 = ((lr3) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap3 = nvf.a;
                                view3.postOnAnimationDelayed(v36Var, j2);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            nr3Var.l.add(arrayList7);
                            arrayList4.clear();
                            w36 w36Var = new w36(nr3Var, arrayList7, false, 10);
                            if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                w36Var.run();
                                z = false;
                            } else {
                                if (zIsEmpty) {
                                    j2 = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? nr3Var.e : 0L, !zIsEmpty3 ? nr3Var.f : 0L) + j2;
                                z = false;
                                View view4 = ((flb) arrayList7.get(0)).a;
                                WeakHashMap weakHashMap4 = nvf.a;
                                view4.postOnAnimationDelayed(w36Var, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.y1 = z;
                return;
            case 21:
                ((SdkClickHandler) this.b).sendNextSdkClickI();
                return;
            case 22:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.b;
                if (searchView$SearchAutoComplete.f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f = false;
                    return;
                }
                return;
            case 23:
                try {
                    b();
                    return;
                } catch (Error e2) {
                    synchronized (((lyc) this.b).a) {
                        ((lyc) this.b).d = 1;
                        throw e2;
                    }
                }
            case 24:
                ((StaggeredGridLayoutManager) this.b).s0();
                return;
            case 25:
                a();
                return;
            case 26:
                TimerCycle timerCycle = (TimerCycle) this.b;
                timerCycle.logger.verbose("%s fired", timerCycle.name);
                timerCycle.command.run();
                return;
            case 27:
                TimerOnce timerOnce = (TimerOnce) this.b;
                timerOnce.logger.verbose("%s fired", timerOnce.name);
                timerOnce.command.run();
                timerOnce.waitingTask = null;
                return;
            case 28:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (ycVar = actionMenuView.L0) == null) {
                    return;
                }
                ycVar.l();
                return;
            default:
                hfg hfgVar = (hfg) this.b;
                synchronized (hfgVar) {
                    try {
                        Iterator it = new HashSet(hfgVar.d).iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }

    public /* synthetic */ wwg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ wwg() {
        this.a = 0;
    }
}
