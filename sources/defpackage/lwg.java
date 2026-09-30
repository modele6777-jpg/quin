package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustPurchaseVerificationResult;
import com.adjust.sdk.AttributionHandler;
import com.adjust.sdk.AttributionResponseData;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.LicenseData;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.PackageHandler;
import com.adjust.sdk.PurchaseVerificationResponseData;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SessionResponseData;
import com.adjust.sdk.ThirdPartySharingResponseData;
import com.adjust.sdk.TrackingState;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lwg implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public lwg(c8h c8hVar, tug tugVar) {
        this.a = 25;
        this.b = tugVar;
        Objects.requireNonNull(c8hVar);
        this.c = c8hVar;
    }

    private final void a() {
        l1h l1hVar = (l1h) this.c;
        synchronized (l1hVar.c) {
            ((xm9) l1hVar.d).k((Task) this.b);
        }
    }

    private final void b() {
        l1h l1hVar = (l1h) this.c;
        synchronized (l1hVar.c) {
            ((kn9) l1hVar.d).a(((Task) this.b).i());
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        defpackage.kyc.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L58
            kyc r2 = (defpackage.kyc) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            kyc r0 = (defpackage.kyc) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L7d
        L22:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L20
            r0.c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L20
            kyc r4 = (defpackage.kyc) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.c     // Catch: java.lang.Throwable -> L20
            kyc r10 = (defpackage.kyc) r10     // Catch: java.lang.Throwable -> L20
            r10.c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.kyc.f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L88:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwg.c():void");
    }

    /* JADX WARN: Code duplicated, block: B:280:0x024f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x023e  */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thD;
        gt6 gt6Var;
        Long lValueOf;
        Object obj;
        lbg lbgVar = null;
        int i = 1;
        switch (this.a) {
            case 0:
                boolean z = false;
                psd psdVar = (psd) this.c;
                vwg vwgVar = (vwg) this.b;
                if ((vwgVar instanceof ivg) && (thD = ((ivg) vwgVar).d()) != null) {
                    psdVar.E(thD);
                    return;
                }
                try {
                    if (!vwgVar.isDone()) {
                        throw new IllegalStateException(u3c.k("Future was expected to be done: %s", vwgVar));
                    }
                    while (true) {
                        try {
                            Object obj2 = vwgVar.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj2;
                            int iIntValue = num.intValue();
                            fwg fwgVar = (fwg) psdVar.d;
                            if (iIntValue <= 0) {
                                ((qe) psdVar.c).run();
                                return;
                            }
                            tx0 tx0VarA = swg.a(num.intValue(), "Billing override value was set by a license tester.");
                            fwgVar.G(z5h.LICENSE_TESTER_BILLING_OVERRIDE, 7, tx0VarA);
                            ((is4) psdVar.b).accept(tx0VarA);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    psdVar.E(e.getCause());
                    return;
                } catch (Throwable th2) {
                    psdVar.E(th2);
                    return;
                }
                break;
            case 1:
                ((ActivityHandler) this.c).launchSessionResponseTasksI((SessionResponseData) this.b);
                return;
            case 2:
                ((ActivityHandler) this.c).launchThirdPartySharingResponseTasksI((ThirdPartySharingResponseData) this.b);
                return;
            case 3:
                ((OnAttributionReadListener) this.b).onAttributionRead(((ActivityHandler) this.c).attribution);
                return;
            case 4:
                int i2 = 0;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    OnAttributionReadListener onAttributionReadListener = (OnAttributionReadListener) obj3;
                    if (onAttributionReadListener != null) {
                        onAttributionReadListener.onAttributionRead((AdjustAttribution) this.c);
                    }
                }
                return;
            case 5:
                ((PurchaseVerificationResponseData) this.b).activityPackage.getPurchaseVerificationCallback().onVerificationFinished((AdjustPurchaseVerificationResult) this.c);
                return;
            case 6:
                ((ActivityHandler) this.c).sendLicenseVerificationDataI((LicenseData) this.b);
                return;
            case 7:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((ve) this.c);
                return;
            case 8:
                ((OnAdidReadListener) ((lh) this.c).e).onAdidRead((String) this.b);
                return;
            case 9:
                AttributionHandler attributionHandler = (AttributionHandler) this.c;
                IActivityHandler iActivityHandler = (IActivityHandler) attributionHandler.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                attributionHandler.checkSessionResponseI(iActivityHandler, (SessionResponseData) this.b);
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                AttributionHandler attributionHandler2 = (AttributionHandler) this.c;
                IActivityHandler iActivityHandler2 = (IActivityHandler) attributionHandler2.activityHandlerWeakRef.get();
                if (iActivityHandler2 == null) {
                    return;
                }
                ResponseData responseData = (ResponseData) this.b;
                if (responseData.trackingState == TrackingState.OPTED_OUT) {
                    iActivityHandler2.gotOptOutResponse();
                    return;
                } else {
                    if (responseData instanceof AttributionResponseData) {
                        attributionHandler2.checkAttributionResponseI(iActivityHandler2, (AttributionResponseData) responseData);
                        return;
                    }
                    return;
                }
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                nr3 nr3Var = (nr3) this.c;
                ArrayList<mr3> arrayList2 = (ArrayList) this.b;
                for (mr3 mr3Var : arrayList2) {
                    flb flbVar = mr3Var.a;
                    int i3 = mr3Var.b;
                    int i4 = mr3Var.c;
                    int i5 = mr3Var.d;
                    int i6 = mr3Var.e;
                    nr3Var.getClass();
                    View view = flbVar.a;
                    int i7 = i5 - i3;
                    int i8 = i6 - i4;
                    if (i7 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i8 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    nr3Var.p.add(flbVar);
                    viewPropertyAnimatorAnimate.setDuration(nr3Var.e).setListener(new jr3(nr3Var, flbVar, i7, view, i8, viewPropertyAnimatorAnimate)).start();
                }
                arrayList2.clear();
                nr3Var.m.remove(arrayList2);
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ff8 ff8VarH = ff8.h();
                String str = qv3.d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                lbg lbgVar2 = (lbg) this.b;
                sb.append(lbgVar2.a);
                ff8VarH.e(str, sb.toString());
                ((qv3) this.c).a.e(lbgVar2);
                return;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                synchronized (((r98) this.c).c) {
                    try {
                        Object objApply = ((r98) this.c).d.apply(this.b);
                        r98 r98Var = (r98) this.c;
                        Object obj4 = r98Var.a;
                        if (obj4 == null && objApply != null) {
                            r98Var.a = objApply;
                            r98Var.e.i(objApply);
                        } else if (obj4 != null && !obj4.equals(objApply)) {
                            r98 r98Var2 = (r98) this.c;
                            r98Var2.a = objApply;
                            r98Var2.e.i(objApply);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case 14:
                ((PackageHandler) this.c).sendNextI(((ResponseData) this.b).continueIn);
                return;
            case 15:
                ((pl1) this.c).F((d35) this.b);
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                try {
                    c();
                    return;
                } catch (Error e2) {
                    synchronized (((kyc) this.c).b) {
                        ((kyc) this.c).c = 1;
                        throw e2;
                    }
                }
            case 17:
                vva vvaVar = ((hce) this.c).a.f;
                String str2 = (String) this.b;
                synchronized (vvaVar.k) {
                    try {
                        ccg ccgVarC = vvaVar.c(str2);
                        if (ccgVarC != null) {
                            lbgVar = ccgVarC.a;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (lbgVar == null || pa7.t(jl2.j, lbgVar.j)) {
                    return;
                }
                synchronized (((hce) this.c).c) {
                    ((hce) this.c).f.put(fbc.h(lbgVar), lbgVar);
                    hce hceVar = (hce) this.c;
                    ((hce) this.c).g.put(fbc.h(lbgVar), kag.a(hceVar.v, lbgVar, hceVar.b.b, hceVar));
                    break;
                }
                return;
            case 18:
                ((h48) this.b).a((cag) this.c);
                return;
            case 19:
                ((ogg) this.b).b.b((Intent) this.c);
                return;
            case 20:
                ConnectionResult connectionResult = (ConnectionResult) this.b;
                hzc hzcVar = (hzc) this.c;
                ec6 ec6Var = (ec6) hzcVar.f;
                xb6 xb6Var = (xb6) hzcVar.b;
                rhg rhgVar = (rhg) ec6Var.x.get((b70) hzcVar.c);
                if (rhgVar == null) {
                    return;
                }
                if (connectionResult.b != 0) {
                    rhgVar.o(connectionResult, null);
                    return;
                }
                hzcVar.a = true;
                if (xb6Var.r()) {
                    if (!hzcVar.a || (gt6Var = (gt6) hzcVar.d) == null) {
                        return;
                    }
                    xb6Var.j(gt6Var, (Set) hzcVar.e);
                    return;
                }
                try {
                    xb6Var.j(null, xb6Var.r() ? xb6Var.z : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e3) {
                    b1.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    xb6Var.d("Failed to get service from broker.");
                    rhgVar.o(new ConnectionResult(10, null, null), null);
                    return;
                }
            case 21:
                ox0 ox0Var = (ox0) this.b;
                q2b q2bVar = (q2b) this.c;
                z5h z5hVar = z5h.EXECUTE_ASYNC_TIMEOUT;
                tx0 tx0Var = swg.i;
                ox0Var.q(z5hVar, 9, tx0Var);
                vsg vsgVar = mtg.b;
                q2bVar.a(tx0Var, aug.e);
                return;
            case 22:
                Future future = (Future) this.b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.c;
                future.cancel(true);
                zsg.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 23:
                qvg qvgVar = (qvg) this.c;
                gfh gfhVar = qvgVar.d;
                try {
                    Task task = (Task) qvgVar.c.h((Task) this.b);
                    if (task == null) {
                        qvgVar.r(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    g94 g94Var = hle.b;
                    task.e(g94Var, qvgVar);
                    task.d(g94Var, qvgVar);
                    task.a(g94Var, qvgVar);
                    return;
                } catch (j8c e4) {
                    if (e4.getCause() instanceof Exception) {
                        gfhVar.r((Exception) e4.getCause());
                        return;
                    } else {
                        gfhVar.r(e4);
                        return;
                    }
                } catch (Exception e5) {
                    gfhVar.r(e5);
                    return;
                }
            case 24:
                a();
                return;
            case 25:
                tug tugVar = (tug) this.b;
                c8h c8hVar = (c8h) this.c;
                ebh ebhVar = ((w3h) c8hVar.b).v;
                w3h.g(ebhVar);
                w3h w3hVar = (w3h) ebhVar.b;
                c2h c2hVar = w3hVar.e;
                c2h c2hVar2 = w3hVar.e;
                w3h.f(c2hVar);
                if (c2hVar.H0().i(o5h.ANALYTICS_STORAGE)) {
                    w3h.f(c2hVar2);
                    w3hVar.y.getClass();
                    if (!c2hVar2.J0(System.currentTimeMillis())) {
                        w3h.f(c2hVar2);
                        if (c2hVar2.G0.a() != 0) {
                            w3h.f(c2hVar2);
                            lValueOf = Long.valueOf(c2hVar2.G0.a());
                        }
                    }
                    if (lValueOf == null) {
                        qch qchVar = ((w3h) c8hVar.b).w;
                        w3h.f(qchVar);
                        qchVar.p1(tugVar, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            tugVar.x(null);
                            return;
                        } catch (RemoteException e6) {
                            w0h w0hVar = ((w3h) c8hVar.b).f;
                            w3h.h(w0hVar);
                            w0hVar.g.b(e6, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.z.a("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    tugVar.x(null);
                    return;
                }
                qch qchVar2 = ((w3h) c8hVar.b).w;
                w3h.f(qchVar2);
                qchVar2.p1(tugVar, lValueOf.longValue());
                return;
            case 26:
                w3h w3hVar2 = (w3h) ((c8h) this.c).b;
                c2h c2hVar3 = w3hVar2.e;
                w0h w0hVar3 = w3hVar2.f;
                w3h.f(c2hVar3);
                c2hVar3.A0();
                c2hVar3.A0();
                xrg xrgVarB = xrg.b(c2hVar3.E0().getString("dma_consent_settings", null));
                xrg xrgVar = (xrg) this.b;
                int i9 = xrgVar.a;
                if (!q5h.l(i9, xrgVarB.a)) {
                    w3h.h(w0hVar3);
                    w0hVar3.X.b(Integer.valueOf(i9), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = c2hVar3.E0().edit();
                editorEdit.putString("dma_consent_settings", xrgVar.b);
                editorEdit.apply();
                w3h.h(w0hVar3);
                w0hVar3.Z.b(xrgVar, "Setting DMA consent(FE)");
                if (w3hVar2.j().K0()) {
                    lah lahVarJ = w3hVar2.j();
                    lahVarJ.A0();
                    lahVarJ.B0();
                    lahVarJ.O0(new dah(lahVarJ, i));
                    return;
                }
                lah lahVarJ2 = w3hVar2.j();
                lahVarJ2.A0();
                lahVarJ2.B0();
                if (lahVarJ2.J0()) {
                    lahVarJ2.O0(new p9h(lahVarJ2, lahVarJ2.Q0(false), 1));
                    return;
                }
                return;
            case 27:
                c8h c8hVar2 = (c8h) this.b;
                Bundle bundle = (Bundle) this.c;
                oid oidVar = c8hVar2.L0;
                w3h w3hVar3 = (w3h) c8hVar2.b;
                if (!bundle.isEmpty()) {
                    c2h c2hVar4 = w3hVar3.e;
                    qch qchVar3 = w3hVar3.w;
                    qqg qqgVar = w3hVar3.d;
                    w0h w0hVar4 = w3hVar3.f;
                    w3h.f(c2hVar4);
                    Bundle bundle2 = new Bundle(c2hVar4.O0.l());
                    for (String str3 : bundle.keySet()) {
                        Object obj5 = bundle.get(str3);
                        if (obj5 != null && !(obj5 instanceof String) && !(obj5 instanceof Long) && !(obj5 instanceof Double)) {
                            w3h.f(qchVar3);
                            if (qch.N1(obj5)) {
                                obj = obj5;
                                qch.S0(oidVar, null, 27, null, null, 0);
                            } else {
                                obj = obj5;
                            }
                            w3h.h(w0hVar4);
                            w0hVar4.z.c(str3, obj, "Invalid default event parameter type. Name, value");
                        } else if (qch.f1(str3)) {
                            w3h.h(w0hVar4);
                            w0hVar4.z.b(str3, "Invalid default event parameter name. Name");
                        } else if (obj5 == null) {
                            bundle2.remove(str3);
                        } else {
                            w3h.f(qchVar3);
                            qqgVar.getClass();
                            if (qchVar3.E0("param", str3, 500, obj5)) {
                                qchVar3.R0(bundle2, str3, obj5);
                            }
                        }
                    }
                    w3h.f(qchVar3);
                    qch qchVar4 = ((w3h) qqgVar.b).w;
                    w3h.f(qchVar4);
                    int i10 = qchVar4.l1(201500000) ? 100 : 25;
                    if (bundle2.size() > i10) {
                        int i11 = 0;
                        for (String str4 : new TreeSet(bundle2.keySet())) {
                            int i12 = i11 + 1;
                            if (i12 > i10) {
                                bundle2.remove(str4);
                            }
                            i11 = i12;
                        }
                        w3h.f(qchVar3);
                        qch.S0(oidVar, null, 26, null, null, 0);
                        w3h.h(w0hVar4);
                        w0hVar4.z.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                c2h c2hVar5 = w3hVar3.e;
                w3h.f(c2hVar5);
                c2hVar5.O0.q(bundle);
                w3hVar3.j().F0(bundle);
                return;
            case 28:
                b();
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.c;
                qch qchVar5 = appMeasurementDynamiteService.d.w;
                w3h.f(qchVar5);
                w3h w3hVar4 = appMeasurementDynamiteService.d;
                qchVar5.s1((tug) this.b, w3hVar4.N0 != null && w3hVar4.N0.booleanValue());
                return;
        }
    }

    public String toString() {
        String str;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                psd psdVar = new psd(lwg.class.getSimpleName(), 23);
                gsg gsgVar = new gsg();
                ((gsg) psdVar.d).b = gsgVar;
                psdVar.d = gsgVar;
                gsgVar.a = (psd) obj;
                return psdVar.toString();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((kyc) obj).c;
                if (i2 == 1) {
                    str = "IDLE";
                } else if (i2 == 2) {
                    str = "QUEUING";
                } else if (i2 != 3) {
                    str = i2 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lwg(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ lwg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public lwg(kyc kycVar) {
        this.a = 16;
        this.c = kycVar;
    }
}
