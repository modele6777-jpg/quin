package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.ActionMode;
import android.view.SurfaceView;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.perf.session.SessionManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c0(ft3 ft3Var, qr4 qr4Var, la1 la1Var) {
        this.a = 12;
        Map map = Collections.EMPTY_MAP;
        this.b = ft3Var;
        this.c = qr4Var;
        this.d = la1Var;
    }

    private final void a() {
        Context context = (Context) this.b;
        y45 y45Var = (y45) this.c;
        uha uhaVar = (uha) this.d;
        sp8 sp8VarB = sp8.b(context);
        if (sp8VarB == null) {
            xo1.V("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return;
        }
        ro3 ro3Var = y45Var.s;
        ro3Var.getClass();
        ro3Var.f.a(sp8VarB);
        LogSessionId logSessionIdD = sp8VarB.d();
        synchronized (uhaVar) {
            qm2 qm2Var = uhaVar.b;
            qm2Var.getClass();
            qm2Var.h(logSessionIdD);
        }
    }

    private final void b() {
        fb5 fb5Var = (fb5) this.b;
        String str = (String) this.c;
        JSONObject jSONObject = (JSONObject) this.d;
        if (fb5Var.l.isEmpty()) {
            return;
        }
        Iterator it = fb5Var.l.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            ch5 ch5Var = (ch5) entry.getValue();
            if (!fb5Var.m.contains(str2) && str.equals(ch5Var.e)) {
                JSONObject jSONObject2 = ch5Var.f;
                if (jSONObject2 != null && jSONObject2.length() > 0) {
                    JSONObject jSONObject3 = ch5Var.f;
                    boolean zEquals = true;
                    if (jSONObject3 != null && jSONObject3.length() != 0) {
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (!next.equals("time") && !next.equals("distinct_id") && !next.startsWith("$")) {
                                    jSONObject4.put(next, jSONObject.get(next));
                                }
                            }
                            zEquals = Boolean.TRUE.equals(new gg7(1).e(jSONObject3.toString(), qn4.I(jSONObject4)));
                        } catch (Exception e) {
                            db6.G("MixpanelAPI.FirstTimeEventChecker", "Property filter evaluation failed: " + e.getMessage(), e);
                            zEquals = false;
                        }
                    }
                    if (!zEquals) {
                        continue;
                    }
                }
                fb5Var.m.add(str2);
                it.remove();
                synchronized (fb5Var.g) {
                    try {
                        if (fb5Var.i == null) {
                            fb5Var.i = new HashMap();
                        }
                        HashMap map = new HashMap(fb5Var.i);
                        String str3 = ch5Var.a;
                        iy8 iy8Var = ch5Var.g;
                        map.put(str3, new iy8(iy8Var.a, iy8Var.b, iy8Var.c, iy8Var.d, iy8Var.e, 0));
                        fb5Var.i = Collections.unmodifiableMap(map);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                fb5Var.f.execute(new ny2(18, fb5Var, ch5Var));
            }
        }
    }

    private final void c() {
        boolean zBooleanValue;
        vva vvaVar = (vva) this.b;
        pa1 pa1Var = (pa1) this.c;
        ccg ccgVar = (ccg) this.d;
        vvaVar.getClass();
        try {
            zBooleanValue = ((Boolean) pa1Var.b.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        synchronized (vvaVar.k) {
            try {
                tag tagVarH = fbc.h(ccgVar.a);
                String str = tagVarH.a;
                if (vvaVar.c(str) == ccgVar) {
                    vvaVar.b(str);
                }
                ff8.h().e(vva.l, vva.class.getSimpleName() + " " + str + " executed; reschedule = " + zBooleanValue);
                Iterator it = vvaVar.j.iterator();
                while (it.hasNext()) {
                    ((a35) it.next()).b(tagVarH, zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ng1 ng1Var;
        q98 q98VarI;
        JSONObject jSONObjectOptJSONObject;
        Object dzbVar;
        Object dzbVar2;
        Object obj = null;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) this.b;
                d0 d0Var = (d0) this.c;
                List list = (List) this.d;
                if (th != null) {
                    d0Var.b.onError(th);
                    return;
                } else {
                    d0Var.b.b(list);
                    return;
                }
            case 1:
                rv rvVar = (rv) this.b;
                ov ovVar = (ov) this.c;
                pv pvVar = (pv) this.d;
                ActionMode actionModeStartActionMode = rvVar.a.startActionMode(new vj5(ovVar), 1);
                rvVar.h = actionModeStartActionMode;
                if (actionModeStartActionMode == null) {
                    pvVar.close();
                    return;
                }
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                f98 f98Var = (f98) this.d;
                int i = 11;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new j1(i, f98Var));
                    }
                    synchronized (al0.p) {
                        try {
                            int i2 = al0.r - 1;
                            al0.r = i2;
                            if (i2 == 0) {
                                ScheduledExecutorService scheduledExecutorService = al0.q;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                al0.q = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new j1(i, f98Var));
                    }
                    synchronized (al0.p) {
                        try {
                            int i3 = al0.r - 1;
                            al0.r = i3;
                            if (i3 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = al0.q;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                al0.q = null;
                            }
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            case 3:
                ((he1) this.b).b(ge1.c((qtb) this.c), (co1) this.d);
                return;
            case 4:
                ((he1) this.b).c(ge1.c((qtb) this.c), (m8c) this.d);
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.b;
                zk9 zk9Var = (zk9) this.c;
                String str = (String) this.d;
                try {
                    for (Object obj2 : arrayList) {
                        if (pa7.t(((ng1) obj2).d(), str)) {
                            obj = obj2;
                            ng1Var = (ng1) obj;
                            if (ng1Var != null || (q98VarI = ng1Var.i()) == null) {
                                return;
                            }
                            q98VarI.j(zk9Var);
                            return;
                        }
                    }
                    ng1Var = (ng1) obj;
                    if (ng1Var != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 6:
                WorkDatabase workDatabase = (WorkDatabase) this.b;
                String str2 = (String) this.c;
                yag yagVar = (yag) this.d;
                nbg nbgVarX = workDatabase.x();
                nbgVarX.getClass();
                str2.getClass();
                Iterator it = ((List) urg.I(nbgVarX.a, true, false, new alc(str2, 21))).iterator();
                while (it.hasNext()) {
                    oa7.s(yagVar, (String) it.next());
                }
                return;
            case 7:
                zpb zpbVar = (zpb) this.b;
                String str3 = (String) this.c;
                yh2 yh2Var = (yh2) this.d;
                fz3 fz3Var = zpbVar.a;
                ml mlVar = (ml) ((i1b) fz3Var.b).get();
                if (mlVar == null) {
                    return;
                }
                JSONObject jSONObject = yh2Var.e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = yh2Var.b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str3)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) fz3Var.c)) {
                        try {
                            if (!strOptString.equals(((Map) fz3Var.c).get(str3))) {
                                ((Map) fz3Var.c).put(str3, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str3);
                                bundle.putString("arm_value", jSONObject2.optString(str3));
                                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                nl nlVar = (nl) mlVar;
                                nlVar.a("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", strOptString);
                                nlVar.a("fp", "_fpc", bundle2);
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((CrashlyticsCore) this.c).lambda$logException$1((Throwable) this.b, (Map) this.d);
                return;
            case 9:
                k47 k47Var = (k47) this.b;
                ha1 ha1Var = (ha1) this.c;
                qyb qybVar = (qyb) this.d;
                pp3 pp3Var = (pp3) k47Var.c;
                if (pp3Var.b.U()) {
                    ha1Var.w(pp3Var, new IOException("Canceled"));
                    return;
                } else {
                    ha1Var.p(pp3Var, qybVar);
                    return;
                }
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((ha1) this.d).w((pp3) ((k47) this.c).c, (Throwable) this.b);
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ft3 ft3Var = (ft3) this.b;
                Runnable runnable = (Runnable) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (ft3Var.x) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ft3 ft3Var2 = (ft3) this.b;
                qr4 qr4Var = (qr4) this.c;
                Map map = Collections.EMPTY_MAP;
                la1 la1Var = (la1) this.d;
                try {
                    ft3Var2.a.j(qr4Var);
                    la1Var.b(null);
                    return;
                } catch (RuntimeException e) {
                    la1Var.d(e);
                    return;
                }
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                try {
                    ((Boolean) ((l26) this.b).z((String) this.c, (String) this.d)).getClass();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 14:
                vq4 vq4Var = (vq4) this.b;
                qr4 qr4Var2 = (qr4) this.c;
                Map map2 = Collections.EMPTY_MAP;
                la1 la1Var2 = (la1) this.d;
                try {
                    vq4Var.a.j(qr4Var2);
                    la1Var2.b(null);
                    return;
                } catch (RuntimeException e2) {
                    la1Var2.d(e2);
                    return;
                }
            case 15:
                vq4 vq4Var2 = (vq4) this.b;
                Runnable runnable3 = (Runnable) this.c;
                Runnable runnable4 = (Runnable) this.d;
                if (vq4Var2.f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                bs bsVar = (bs) this.b;
                mh3 mh3Var = (mh3) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    lq5 lq5VarP = vfh.p(bsVar.a);
                    if (lq5VarP == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    kq5 kq5Var = (kq5) ((it4) lq5VarP.b);
                    synchronized (kq5Var.c) {
                        kq5Var.e = threadPoolExecutor;
                        break;
                    }
                    ((it4) lq5VarP.b).a(new lt4(mh3Var, threadPoolExecutor));
                    return;
                } catch (Throwable th6) {
                    mh3Var.O(th6);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 17:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.b;
                Intent intent = (Intent) this.c;
                gle gleVar = (gle) this.d;
                try {
                    firebaseMessagingService.b(intent);
                    return;
                } finally {
                    gleVar.a(null);
                }
            case 18:
                a();
                return;
            case 19:
                b();
                return;
            case 20:
                ((hv6) this.b).I((Executor) this.c, (bu0) this.d);
                return;
            case 21:
                xp8 xp8Var = (xp8) this.b;
                dy6 dy6Var = (dy6) this.c;
                zp8 zp8Var = (zp8) this.d;
                ro3 ro3Var = xp8Var.c;
                yob yobVarG = dy6Var.g();
                hbc hbcVar = ro3Var.d;
                zga zgaVar = ro3Var.g;
                zgaVar.getClass();
                hbcVar.b = jy6.o(yobVarG);
                if (!yobVarG.isEmpty()) {
                    hbcVar.e = (zp8) yobVarG.get(0);
                    zp8Var.getClass();
                    hbcVar.f = zp8Var;
                }
                if (((zp8) hbcVar.d) == null) {
                    hbcVar.d = hbc.S(zgaVar, (jy6) hbcVar.b, (zp8) hbcVar.e, (eye) hbcVar.a);
                }
                hbcVar.O0(((y45) zgaVar).m());
                return;
            case 22:
                kq8 kq8Var = (kq8) this.b;
                Pair pair = (Pair) this.c;
                kq8Var.b.i.d(((Integer) pair.first).intValue(), (zp8) pair.second, (qp8) this.d);
                return;
            case 23:
                ((cia) this.b).a((SurfaceView) this.c, (m45) this.d);
                return;
            case 24:
                c();
                return;
            case 25:
                mmb mmbVar = (mmb) this.b;
                yv9 yv9Var = (yv9) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                try {
                    dzbVar = yv9Var.invoke();
                    break;
                } catch (Throwable th7) {
                    dzbVar = new dzb(th7);
                }
                AtomicReference atomicReference = i3b.a;
                Throwable thA = ezb.a(dzbVar);
                if (thA != null) {
                    String message = thA.getMessage();
                    if (message == null) {
                        message = thA.getClass().getSimpleName();
                    }
                    dzbVar = new ct0(message, "invoke_failed");
                }
                mmbVar.element = dzbVar;
                countDownLatch.countDown();
                return;
            case 26:
                Activity activity = (Activity) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                Toast.makeText(activity, ub3.k("QA · ", str4, " ", str5), 0).show();
                return;
            case 27:
                imb imbVar = (imb) this.b;
                hl hlVar = (hl) this.c;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.d;
                try {
                    hlVar.invoke();
                    dzbVar2 = wef.a;
                    break;
                } catch (Throwable th8) {
                    dzbVar2 = new dzb(th8);
                }
                imbVar.element = !(dzbVar2 instanceof dzb);
                countDownLatch2.countDown();
                return;
            case 28:
                ((SessionManager) this.b).lambda$setApplicationContext$0((Context) this.c, (n8a) this.d);
                return;
            default:
                final azd azdVar = (azd) this.b;
                String str6 = (String) this.c;
                final String str7 = (String) this.d;
                WebView webView = azdVar.w;
                if (webView != null) {
                    webView.evaluateJavascript(str6, new ValueCallback() { // from class: vyd
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj3) {
                            azdVar.d().a("Response sent to H5 - method: {}, result: {}", str7, (String) obj3);
                        }
                    });
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c0(he1 he1Var, ge1 ge1Var, qtb qtbVar, Object obj, int i) {
        this.a = i;
        this.b = he1Var;
        this.c = qtbVar;
        this.d = obj;
    }

    public /* synthetic */ c0(vq4 vq4Var, qr4 qr4Var, la1 la1Var) {
        this.a = 14;
        Map map = Collections.EMPTY_MAP;
        this.b = vq4Var;
        this.c = qr4Var;
        this.d = la1Var;
    }

    public /* synthetic */ c0(k47 k47Var, ha1 ha1Var, Throwable th) {
        this.a = 10;
        this.c = k47Var;
        this.d = ha1Var;
        this.b = th;
    }

    public /* synthetic */ c0(CrashlyticsCore crashlyticsCore, Throwable th, Map map) {
        this.a = 8;
        this.c = crashlyticsCore;
        this.b = th;
        this.d = map;
    }

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
