package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.os.Handler;
import android.util.Log;
import android.util.LongSparseArray;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.perf.metrics.AppStartTrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fe(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        rk1 rk1Var = (rk1) this.b;
        la1 la1Var = (la1) this.c;
        wo0 wo0Var = rk1Var.g;
        if (!((AtomicBoolean) wo0Var.y).getAndSet(true)) {
            if1 if1Var = (if1) wo0Var.f;
            if1Var.getClass();
            if1Var.f = false;
            synchronized (if1Var.b) {
                if1Var.c = null;
                if1Var.e = 0;
                if1Var.d.clear();
            }
            zda zdaVar = (zda) wo0Var.g;
            zdaVar.getClass();
            Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
            if (zdaVar.h.compareAndSet(true, false)) {
                lyd lydVar = zdaVar.i;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                zdaVar.i = null;
            }
            if (((ace) wo0Var.b).b()) {
                hh1 hh1Var = (hh1) ((ace) wo0Var.b).getValue();
                synchronized (hh1Var.c) {
                    if (hh1Var.d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    ((nh1) ((g1b) hh1Var.a.e).get()).b();
                    hh1Var.d = true;
                }
            }
        }
        if (rk1Var.f != null) {
            Executor executor = rk1Var.d;
            if (executor instanceof qf1) {
                qf1 qf1Var = (qf1) executor;
                synchronized (qf1Var.a) {
                    try {
                        if (!qf1Var.b.isShutdown()) {
                            qf1Var.b.shutdown();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            rk1Var.f.quit();
        }
        la1Var.b(null);
    }

    private final void b() {
        mu3 mu3Var;
        yr9 yr9Var = (yr9) this.b;
        i1b i1bVar = (i1b) this.c;
        if (yr9Var.b != yr9.d) {
            qc0.p("provide() can be called only once.");
            return;
        }
        synchronized (yr9Var) {
            mu3Var = yr9Var.a;
            yr9Var.a = null;
            yr9Var.b = i1bVar;
        }
        mu3Var.i(i1bVar);
    }

    private final void c() {
        r18 r18Var = (r18) this.b;
        i1b i1bVar = (i1b) this.c;
        synchronized (r18Var) {
            try {
                if (r18Var.b == null) {
                    r18Var.a.add(i1bVar);
                } else {
                    r18Var.b.add(i1bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ej0 ej0Var;
        int i = 1;
        switch (this.a) {
            case 0:
                ((ActivityHandler) this.b).lambda$trackThirdPartySharing$37((AdjustThirdPartySharing) this.c);
                return;
            case 1:
                ((ActivityHandler) this.b).lambda$new$2((AdjustConfig) this.c);
                return;
            case 2:
                yj yjVar = (yj) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                try {
                    pj pjVar = yjVar.E0;
                    if ((pjVar != null ? (SurfaceTexture) pjVar.m : null) == surfaceTexture) {
                        yjVar.a();
                        break;
                    }
                    return;
                } finally {
                    surfaceTexture.release();
                }
            case 3:
                xq.e((zq) this.b, (LongSparseArray) this.c);
                return;
            case 4:
                ((kw6) this.c).l((egh) this.b);
                return;
            case 5:
                h80 h80Var = (h80) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } finally {
                    h80Var.a();
                }
            case 6:
                AppStartTrace appStartTrace = (AppStartTrace) this.b;
                y0f y0fVar = (y0f) this.c;
                oye oyeVar = AppStartTrace.M0;
                appStartTrace.b.c((b1f) y0fVar.h(), zb0.FOREGROUND_BACKGROUND);
                return;
            case 7:
                mh0 mh0Var = (mh0) this.b;
                ny2 ny2Var = (ny2) this.c;
                mh0Var.c.g();
                ph0 ph0Var = mh0Var.b;
                synchronized (ph0Var.a) {
                    ph0Var.b();
                    ny2Var.run();
                    break;
                }
                return;
            case 8:
                Context context = (Context) this.b;
                nh2 nh2Var = (nh2) this.c;
                kj0.a = (AudioManager) context.getSystemService("audio");
                nh2Var.c();
                return;
            case 9:
                k47 k47Var = (k47) this.b;
                synchronized (((qm3) this.c)) {
                }
                t45 t45Var = (t45) k47Var.c;
                String str = pqf.a;
                ro3 ro3Var = t45Var.a.s;
                ro3Var.M(ro3Var.I((zp8) ro3Var.d.e), 1013, new qd3(27));
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                k47 k47Var2 = (k47) this.b;
                b72 b72Var = (b72) this.c;
                t45 t45Var2 = (t45) k47Var2.c;
                String str2 = pqf.a;
                t45Var2.a.F.w(b72Var);
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                szc szcVar = (szc) this.b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) szcVar.d).post(new fe(12, szcVar, routedDevice));
                    return;
                }
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                szc szcVar2 = (szc) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (((vk0) szcVar2.e) == null || (ej0Var = ((cl0) ((ssg) szcVar2.c).b).h) == null || audioDeviceInfo.equals((AudioDeviceInfo) ej0Var.x)) {
                    return;
                }
                ej0Var.x = audioDeviceInfo;
                Context context2 = (Context) ej0Var.b;
                xi0 xi0Var = (xi0) ej0Var.y;
                List listA = ej0Var.a();
                yob yobVar = bj0.e;
                ej0Var.b(bj0.b(context2, context2.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), xi0Var, audioDeviceInfo, listA));
                return;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                a80 a80Var = (a80) this.b;
                Object objApply = ((i26) this.c).apply(a80Var.g);
                a80Var.g = objApply;
                ts0 ts0Var = new ts0(a80Var, objApply, i);
                jce jceVar = (jce) a80Var.d;
                if (jceVar.a.getLooper().getThread().isAlive()) {
                    jceVar.e(ts0Var);
                    return;
                }
                return;
            case 14:
                ((gk1) this.b).a.onCaptureSequenceAborted((CameraCaptureSession) this.c, -1);
                return;
            case 15:
                th1 th1Var = (th1) this.b;
                Set<jg1> set = (Set) this.c;
                di2 di2Var = th1Var.a;
                p8c.m();
                synchronized (di2Var.a) {
                    try {
                        for (jg1 jg1Var : set) {
                            Set setKeySet = ((HashMap) di2Var.g).keySet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : setKeySet) {
                                if (((jg1) obj).a.equals(jg1Var.a)) {
                                    arrayList.add(obj);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((HashMap) di2Var.g).remove((jg1) it.next());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((pg1) this.b).q().i().j((zk9) this.c);
                return;
            case 17:
                ((ng1) this.b).i().f((sh1) this.c);
                return;
            case 18:
                vi1 vi1Var = (vi1) this.b;
                pg1 pg1Var = (pg1) this.c;
                synchronized (vi1Var.a) {
                    try {
                        vi1Var.c.remove(pg1Var);
                        if (vi1Var.c.isEmpty()) {
                            vi1Var.e.getClass();
                            vi1Var.e.b(null);
                            vi1Var.e = null;
                            vi1Var.d = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 19:
                ((yl2) this.b).accept((ho0) this.c);
                return;
            case 20:
                a();
                return;
            case 21:
                yag yagVar = (yag) this.b;
                String string = ((UUID) this.c).toString();
                string.getClass();
                oa7.s(yagVar, string);
                return;
            case 22:
                ((atb) this.b).k0((ctb) this.c);
                return;
            case 23:
                vb2 vb2Var = (vb2) this.b;
                vb2Var.a.a(new xm0(i, (um9) this.c, vb2Var));
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                List list = (List) this.b;
                gl2 gl2Var = (gl2) this.c;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((mt0) it2.next()).a(gl2Var.e);
                }
                return;
            case 27:
                ((CrashlyticsCore) this.b).lambda$setCustomKeys$6((Map) this.c);
                return;
            case 28:
                ((CrashlyticsCore) this.b).lambda$logFatalException$8((Throwable) this.c);
                return;
            default:
                ((CrashlyticsCore) this.b).lambda$setUserId$4((String) this.c);
                return;
        }
    }
}
