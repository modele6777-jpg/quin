package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.AttributionHandler;
import com.adjust.sdk.AttributionResponseData;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnThirdPartySharingSettingsReadListener;
import com.adjust.sdk.PackageHandler;
import com.adjust.sdk.PurchaseVerificationResponseData;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.SdkClickResponseData;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.j;
import com.google.android.play.core.assetpacks.k;
import com.google.android.play.core.assetpacks.p;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w36 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ w36(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        gah gahVar = (gah) this.c;
        synchronized (gahVar) {
            try {
                gahVar.a = false;
                lah lahVar = gahVar.c;
                if (!lahVar.R0()) {
                    w0h w0hVar = ((w3h) lahVar.b).f;
                    w3h.h(w0hVar);
                    w0hVar.Y.a("Connected to remote service");
                    hzg hzgVar = (hzg) this.b;
                    lahVar.A0();
                    lahVar.e = hzgVar;
                    lahVar.N0();
                    lahVar.P0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lah lahVar2 = ((gah) this.c).c;
        ScheduledExecutorService scheduledExecutorService = lahVar2.v;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            lahVar2.v = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        gt6 pehVar;
        int i = 1;
        int i2 = 0;
        try {
            switch (this.a) {
                case 0:
                    s36 s36Var = (s36) this.c;
                    try {
                        s36Var.a(bm8.y((Future) this.b));
                        return;
                    } catch (Error e) {
                        e = e;
                        s36Var.i(e);
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        s36Var.i(e);
                        return;
                    } catch (ExecutionException e3) {
                        Throwable cause = e3.getCause();
                        if (cause == null) {
                            s36Var.i(e3);
                            return;
                        } else {
                            s36Var.i(cause);
                            return;
                        }
                    }
                case 1:
                    ((ActivityHandler) this.c).launchSdkClickResponseTasksI((SdkClickResponseData) this.b);
                    return;
                case 2:
                    ((ActivityHandler) this.c).launchPurchaseVerificationResponseTasksI((PurchaseVerificationResponseData) this.b);
                    return;
                case 3:
                    ArrayList arrayList = (ArrayList) this.b;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        OnAdidReadListener onAdidReadListener = (OnAdidReadListener) obj;
                        if (onAdidReadListener != null) {
                            onAdidReadListener.onAdidRead((String) this.c);
                        }
                    }
                    return;
                case 4:
                    ((OnThirdPartySharingSettingsReadListener) this.b).onThirdPartySharingSettingsRead(((ActivityHandler) this.c).thirdPartySharingResult);
                    return;
                case 5:
                    ((ve) this.b).a = this.c;
                    return;
                case 6:
                    ((OnThirdPartySharingSettingsReadListener) ((lh) this.c).e).onThirdPartySharingSettingsRead((AdjustThirdPartySharingResult) this.b);
                    return;
                case 7:
                    ((AsyncTaskExecutor) ((qe) this.c).d).onPostExecute(this.b);
                    return;
                case 8:
                    AttributionHandler attributionHandler = (AttributionHandler) this.c;
                    IActivityHandler iActivityHandler = (IActivityHandler) attributionHandler.activityHandlerWeakRef.get();
                    if (iActivityHandler == null) {
                        return;
                    }
                    attributionHandler.checkAttributionResponseI(iActivityHandler, (AttributionResponseData) this.b);
                    return;
                case 9:
                    try {
                        tv1 tv1Var = (tv1) this.c;
                        Object objA = bm8.A((m88) this.b);
                        la1 la1Var = tv1Var.b;
                        if (la1Var != null) {
                            la1Var.b(objA);
                        }
                        break;
                    } catch (CancellationException unused) {
                        ((tv1) this.c).cancel(false);
                    } catch (ExecutionException e4) {
                        tv1 tv1Var2 = (tv1) this.c;
                        Throwable cause2 = e4.getCause();
                        la1 la1Var2 = tv1Var2.b;
                        if (la1Var2 != null) {
                            la1Var2.d(cause2);
                        }
                    }
                    return;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    nr3 nr3Var = (nr3) this.c;
                    ArrayList<flb> arrayList2 = (ArrayList) this.b;
                    for (flb flbVar : arrayList2) {
                        nr3Var.getClass();
                        View view = flbVar.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        nr3Var.o.add(flbVar);
                        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(nr3Var.c).setListener(new ir3(nr3Var, flbVar, view, viewPropertyAnimatorAnimate)).start();
                    }
                    arrayList2.clear();
                    nr3Var.l.remove(arrayList2);
                    return;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    while (true) {
                        try {
                            ((Runnable) this.b).run();
                        } catch (Throwable th) {
                            tq.C(nu4.a, th);
                        }
                        try {
                            Runnable runnableD1 = ((n58) this.c).d1();
                            if (runnableD1 == null) {
                                return;
                            }
                            this.b = runnableD1;
                            i2++;
                            if (i2 >= 16) {
                                n58 n58Var = (n58) this.c;
                                if (aa4.c(n58Var.d, n58Var)) {
                                    n58 n58Var2 = (n58) this.c;
                                    aa4.b(n58Var2.d, n58Var2, this);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            n58 n58Var3 = (n58) this.c;
                            synchronized (n58Var3.g) {
                                n58.v.decrementAndGet(n58Var3);
                                throw th2;
                            }
                        }
                        break;
                    }
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    ((PackageHandler) this.c).addI((ActivityPackage) this.b);
                    return;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    ((is4) this.b).accept(this.c);
                    return;
                case 14:
                    SdkClickHandler sdkClickHandler = (SdkClickHandler) this.c;
                    sdkClickHandler.sendSdkClickI((ActivityPackage) this.b);
                    sdkClickHandler.sendNextSdkClick();
                    return;
                case 15:
                    ((SingleThreadCachedScheduler) this.c).tryExecuteRunnable((Runnable) this.b);
                    while (true) {
                        synchronized (((SingleThreadCachedScheduler) this.c).queue) {
                            try {
                                SingleThreadCachedScheduler singleThreadCachedScheduler = (SingleThreadCachedScheduler) this.c;
                                if (singleThreadCachedScheduler.isTeardown) {
                                    return;
                                }
                                boolean zIsEmpty = singleThreadCachedScheduler.queue.isEmpty();
                                SingleThreadCachedScheduler singleThreadCachedScheduler2 = (SingleThreadCachedScheduler) this.c;
                                if (zIsEmpty) {
                                    singleThreadCachedScheduler2.isThreadProcessing = false;
                                    return;
                                } else {
                                    runnable = (Runnable) singleThreadCachedScheduler2.queue.get(0);
                                    ((SingleThreadCachedScheduler) this.c).queue.remove(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        ((SingleThreadCachedScheduler) this.c).tryExecuteRunnable(runnable);
                    }
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    m88 m88Var = (m88) this.b;
                    boolean zIsCancelled = m88Var.isCancelled();
                    pl1 pl1Var = (pl1) this.c;
                    if (zIsCancelled) {
                        pl1Var.p(null);
                        return;
                    }
                    try {
                        pl1Var.g(u4.h(m88Var));
                        return;
                    } catch (ExecutionException e5) {
                        Throwable cause3 = e5.getCause();
                        if (cause3 != null) {
                            pl1Var.g(new dzb(cause3));
                            return;
                        } else {
                            ot7 ot7Var = new ot7();
                            pa7.c0(ot7Var, pa7.class.getName());
                            throw ot7Var;
                        }
                    }
                case 17:
                    hfg hfgVar = (hfg) this.b;
                    Bundle bundle = (Bundle) this.c;
                    k kVar = hfgVar.g;
                    kVar.getClass();
                    if (((Boolean) kVar.b(new j(kVar, bundle, i2))).booleanValue()) {
                        hfgVar.h.a();
                        return;
                    }
                    return;
                case 18:
                    p pVar = (p) this.b;
                    zgg zggVar = (zgg) this.c;
                    pVar.a.a(zggVar.d, zggVar.e, (String) zggVar.b);
                    return;
                case 19:
                    aig aigVar = (aig) this.c;
                    rig rigVar = (rig) this.b;
                    ConnectionResult connectionResult = rigVar.b;
                    if (connectionResult.b == 0) {
                        wig wigVar = rigVar.c;
                        oa7.A(wigVar);
                        ConnectionResult connectionResult2 = wigVar.c;
                        if (connectionResult2.b != 0) {
                            b1.o("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                            aigVar.k.f(connectionResult2);
                            aigVar.j.c();
                            return;
                        }
                        hzc hzcVar = aigVar.k;
                        IBinder iBinder = wigVar.b;
                        if (iBinder == null) {
                            pehVar = null;
                        } else {
                            int i3 = k7.e;
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            pehVar = iInterfaceQueryLocalInterface instanceof gt6 ? (gt6) iInterfaceQueryLocalInterface : new peh(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                        }
                        Set set = aigVar.h;
                        hzcVar.getClass();
                        if (pehVar == null || set == null) {
                            b1.o("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            hzcVar.f(new ConnectionResult(4, null, null));
                        } else {
                            hzcVar.d = pehVar;
                            hzcVar.e = set;
                            if (hzcVar.a) {
                                ((xb6) hzcVar.b).j(pehVar, set);
                            }
                        }
                    } else {
                        aigVar.k.f(connectionResult);
                    }
                    aigVar.j.c();
                    return;
                case 20:
                    i5h i5hVar = (i5h) this.b;
                    i5hVar.p();
                    if (w1e.m()) {
                        i5hVar.Z().J0(this);
                        return;
                    }
                    nrg nrgVar = (nrg) this.c;
                    i = nrgVar.c == 0 ? 0 : 1;
                    nrgVar.c = 0L;
                    if (i != 0) {
                        nrgVar.a();
                        return;
                    }
                    return;
                case 21:
                    Task task = (Task) this.b;
                    boolean zK = task.k();
                    qvg qvgVar = (qvg) this.c;
                    gfh gfhVar = qvgVar.d;
                    if (zK) {
                        gfhVar.s();
                        return;
                    }
                    try {
                        gfhVar.p(qvgVar.c.h(task));
                        return;
                    } catch (j8c e6) {
                        if (e6.getCause() instanceof Exception) {
                            gfhVar.r((Exception) e6.getCause());
                            return;
                        } else {
                            gfhVar.r(e6);
                            return;
                        }
                    } catch (Exception e7) {
                        gfhVar.r(e7);
                        return;
                    }
                case 22:
                    lah lahVarJ = ((AppMeasurementDynamiteService) this.c).d.j();
                    tug tugVar = (tug) this.b;
                    lahVarJ.A0();
                    lahVarJ.B0();
                    lahVarJ.O0(new qe(lahVarJ, lahVarJ.Q0(false), tugVar, 15));
                    return;
                case 23:
                    IBinder iBinder2 = (IBinder) this.c;
                    ech echVar = (ech) this.b;
                    synchronized (echVar) {
                        if (iBinder2 == null) {
                            echVar.b("Null service connection");
                        } else {
                            try {
                                echVar.c = new gsg(iBinder2);
                                echVar.a = 2;
                                ((ScheduledExecutorService) echVar.f.d).execute(new a5h(echVar, i));
                            } catch (RemoteException e8) {
                                echVar.b(e8.getMessage());
                            }
                        }
                    }
                    return;
                case 24:
                    c8h c8hVar = (c8h) this.c;
                    c8hVar.A0();
                    c8hVar.B0();
                    Bundle bundle2 = (Bundle) this.b;
                    String string = bundle2.getString("name");
                    oa7.x(string);
                    w3h w3hVar = (w3h) c8hVar.b;
                    if (!w3hVar.a()) {
                        w0h w0hVar = w3hVar.f;
                        w3h.h(w0hVar);
                        w0hVar.Z.a("Conditional property not cleared since app measurement is disabled");
                        return;
                    } else {
                        mch mchVar = new mch(0L, null, string, "");
                        try {
                            qch qchVar = w3hVar.w;
                            w3h.f(qchVar);
                            bundle2.getString("app_id");
                            w3hVar.j().T0(new wog(bundle2.getString("app_id"), "", mchVar, bundle2.getLong("creation_timestamp"), bundle2.getBoolean(UsageBillingBalance.STATUS_ACTIVE), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), qchVar.i1(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), 0L, true)));
                            return;
                        } catch (IllegalArgumentException unused2) {
                            return;
                        }
                    }
                case 25:
                    ((c8h) this.c).R0((Boolean) this.b, true);
                    return;
                case 26:
                    ((gah) this.c).c.L0((ComponentName) this.b);
                    return;
                case 27:
                    a();
                    return;
                case 28:
                    g5b g5bVar = (g5b) this.b;
                    JobParameters jobParameters = (JobParameters) this.c;
                    Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                    ((rah) ((Service) g5bVar.b)).c(jobParameters);
                    return;
                default:
                    Context context = ((f8h) this.b).b;
                    dpb dpbVarE = rch.d;
                    if (dpbVarE == null) {
                        synchronized (rch.c) {
                            dpbVarE = rch.d;
                            if (dpbVarE == null) {
                                os osVarB = ny6.b();
                                try {
                                    String[] list = context.getAssets().list("phenotype");
                                    if (list != null) {
                                        int length = list.length;
                                        while (i2 < length) {
                                            String str = list[i2];
                                            if (str.endsWith("_package_metadata.binarypb")) {
                                                try {
                                                    AssetManager assets = context.getAssets();
                                                    StringBuilder sb = new StringBuilder(str.length() + 10);
                                                    sb.append("phenotype/");
                                                    sb.append(str);
                                                    InputStream inputStreamOpen = assets.open(sb.toString());
                                                    try {
                                                        hmg hmgVar = hmg.a;
                                                        int i4 = slg.a;
                                                        rch rchVar = new rch(context, sch.t(inputStreamOpen, hmg.b));
                                                        osVarB.q(rchVar.b, rchVar);
                                                        if (inputStreamOpen != null) {
                                                            inputStreamOpen.close();
                                                        }
                                                    } catch (Throwable th4) {
                                                        if (inputStreamOpen != null) {
                                                            try {
                                                                inputStreamOpen.close();
                                                            } catch (Throwable th5) {
                                                                th4.addSuppressed(th5);
                                                            }
                                                            break;
                                                        }
                                                        throw th4;
                                                    }
                                                } catch (bng e9) {
                                                    StringBuilder sb2 = new StringBuilder(str.length() + 45);
                                                    sb2.append("Unable to read Phenotype PackageMetadata for ");
                                                    sb2.append(str);
                                                    Log.e("PackageInfo", sb2.toString(), e9);
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                } catch (IOException e10) {
                                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e10);
                                }
                                dpbVarE = osVarB.e(true);
                                rch.d = dpbVarE;
                            }
                            break;
                        }
                    }
                    String str2 = (String) this.c;
                    if (dpbVarE.containsKey(str2)) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(str2.length() + 173);
                    sb3.append("Config package ");
                    sb3.append(str2);
                    sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                    b1.d("FilePhenotypeFlags", sb3.toString());
                    return;
            }
        } finally {
            ((tv1) this.c).g = null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return w36.class.getSimpleName() + "," + ((s36) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w36(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
