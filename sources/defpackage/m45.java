package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.ui.PlayerView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m45 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m45(g55 g55Var, int i) {
        this.a = 1;
        this.b = g55Var;
    }

    private final void a() {
        kq5 kq5Var = (kq5) this.b;
        synchronized (kq5Var.c) {
            try {
                if (kq5Var.g == null) {
                    return;
                }
                try {
                    er5 er5VarC = kq5Var.c();
                    int i = er5VarC.f;
                    if (i == 2) {
                        synchronized (kq5Var.c) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i2 = x0f.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Context context = kq5Var.a;
                        er5[] er5VarArr = {er5VarC};
                        d8c d8cVar = a9f.a;
                        Trace.beginSection(xdc.v("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface typefaceN = a9f.a.n(context, er5VarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferP = o8c.p(er5VarC.a, kq5Var.a);
                            if (mappedByteBufferP == null || typefaceN == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                szc szcVar = new szc(typefaceN, an1.K(mappedByteBufferP));
                                Trace.endSection();
                                Trace.endSection();
                                synchronized (kq5Var.c) {
                                    try {
                                        mh3 mh3Var = kq5Var.g;
                                        if (mh3Var != null) {
                                            mh3Var.P(szcVar);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                kq5Var.b();
                            } catch (Throwable th2) {
                                int i3 = x0f.a;
                                Trace.endSection();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        int i4 = x0f.a;
                        Trace.endSection();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    synchronized (kq5Var.c) {
                        try {
                            mh3 mh3Var2 = kq5Var.g;
                            if (mh3Var2 != null) {
                                mh3Var2.O(th5);
                            }
                            kq5Var.b();
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x032a A[Catch: all -> 0x02ef, TryCatch #7 {, blocks: (B:152:0x02e4, B:154:0x02e8, B:161:0x02f5, B:165:0x02fc, B:171:0x0307, B:173:0x030b, B:175:0x0311, B:177:0x031b, B:179:0x0325, B:181:0x0336, B:180:0x032a, B:182:0x0338, B:184:0x034b, B:186:0x0353), top: B:313:0x02e4 }] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        String strC0;
        TelephonyManager telephonyManager;
        View viewFindFocus;
        Boolean bool = null;
        boolean z = true;
        int i = 0;
        switch (this.a) {
            case 0:
                y45 y45Var = (y45) this.b;
                a80 a80Var = y45Var.C;
                Context context = y45Var.e;
                String str = pqf.a;
                int iGenerateAudioSessionId = kj0.d0(context).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                a80Var.getClass();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == ((jce) a80Var.d).a.getLooper()) {
                    obj = a80Var.f;
                } else {
                    pa7.J(looperMyLooper == ((jce) a80Var.c).a.getLooper());
                    obj = a80Var.g;
                }
                if (((Integer) obj).intValue() != iGenerateAudioSessionId) {
                    Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                    a80Var.g = numValueOf;
                    ts0 ts0Var = new ts0(a80Var, numValueOf, i);
                    jce jceVar = (jce) a80Var.d;
                    if (jceVar.a.getLooper().getThread().isAlive()) {
                        jceVar.e(ts0Var);
                    }
                    jce jceVar2 = y45Var.l.g;
                    ice iceVarB = jceVar2.b(40, iGenerateAudioSessionId, 0);
                    Handler handler = jceVar2.a;
                    Message message = iceVarB.a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    iceVarB.a();
                    return;
                }
                return;
            case 1:
                ro3 ro3Var = ((g55) this.b).I0;
                ro3Var.M(ro3Var.H(), 1034, new qd3(11));
                return;
            case 2:
                wha whaVar = (wha) this.b;
                try {
                    synchronized (whaVar) {
                    }
                    try {
                        whaVar.a.d(whaVar.c, whaVar.d);
                        return;
                    } finally {
                        whaVar.a(true);
                    }
                } catch (g45 e) {
                    xo1.y("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    yg5.p(e);
                    return;
                }
            case 3:
                a();
                return;
            case 4:
                Iterator it = ((zx5) this.b).n.iterator();
                if (it.hasNext()) {
                    throw kv2.g(it);
                }
                return;
            case 5:
                gk2 gk2Var = (gk2) this.b;
                String str2 = (String) gk2Var.d;
                String str3 = (String) gk2Var.c;
                try {
                    System.nanoTime();
                    InetAddress byName = InetAddress.getByName(str2);
                    if (!(byName.isLoopbackAddress() || byName.isAnyLocalAddress())) {
                        gk2Var.b = false;
                        return;
                    }
                    String str4 = str2 + " is blocked";
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            InetAddress byName2 = InetAddress.getByName(str3);
                            if (!byName2.isLoopbackAddress() && !byName2.isAnyLocalAddress()) {
                                z = false;
                            }
                            if (z) {
                                str4 = str2 + " and " + str3 + " are blocked";
                            }
                        } catch (Exception unused) {
                            str4 = str2 + " is blocked, backup check failed";
                        }
                        break;
                    }
                    gk2Var.b = z;
                    if (!z) {
                        db6.f1("MixpanelAPI.Message", "Primary host blocked, but backup host is available.");
                        return;
                    }
                    db6.f1("MixpanelAPI.Message", "AdBlocker is enabled. ".concat(str4));
                    byName.getHostAddress();
                    new IOException(str4);
                    return;
                } catch (Exception e2) {
                    if (db6.L0(2)) {
                        Log.v("MixpanelAPI.Message", "Primary server blocked-check failed, not assuming blocked", e2);
                        return;
                    }
                    return;
                }
            case 6:
                di2 di2Var = (di2) this.b;
                if (((rk1) di2Var.d) != null) {
                    di2Var.l();
                    m48 m48Var = (m48) di2Var.e;
                    m48Var.getClass();
                    HashSet<kp0> hashSet = (HashSet) di2Var.v;
                    synchronized (m48Var.a) {
                        try {
                            for (kp0 kp0Var : hashSet) {
                                if (m48Var.b.containsKey(kp0Var)) {
                                    m48Var.k((i48) m48Var.b.get(kp0Var));
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                }
                return;
            case 7:
                dg7 dg7Var = (dg7) this.b;
                if (dg7Var != null) {
                    dg7Var.h(null);
                    return;
                }
                return;
            case 8:
                oi8 oi8Var = (oi8) this.b;
                Semaphore semaphore = oi8Var.X0;
                sg2 sg2Var = oi8Var.z;
                if (sg2Var == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    sg2Var.n(oi8Var.b.a());
                    break;
                } catch (InterruptedException unused2) {
                } finally {
                    semaphore.release();
                }
                return;
            case 9:
                ((vi8) this.b).c();
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                tx8 tx8Var = (tx8) this.b;
                a58 a58Var = ProcessLifecycleOwner.w.f;
                if (a58Var.i.compareTo(g48.d) < 0) {
                    a58Var.a(new sx8(tx8Var, a58Var));
                    return;
                } else {
                    tx8Var.o.set(true);
                    tx8Var.k.getClass();
                    return;
                }
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                se9 se9Var = (se9) this.b;
                kp3 kp3Var = (kp3) se9Var.a.get();
                if (kp3Var != null) {
                    int iB = se9Var.c.b();
                    lp3 lp3Var = kp3Var.a;
                    synchronized (lp3Var) {
                        int i2 = lp3Var.n;
                        if (i2 == 0 || lp3Var.e) {
                            if (i2 != iB || lp3Var.o == null) {
                                lp3Var.n = iB;
                                if (iB != 1 && iB != 0 && iB != 8) {
                                    if (lp3Var.o == null) {
                                        Context context2 = lp3Var.a;
                                        String str5 = pqf.a;
                                        if (context2 == null || (telephonyManager = (TelephonyManager) context2.getSystemService("phone")) == null) {
                                            strC0 = bm8.c0(Locale.getDefault().getCountry());
                                        } else {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (TextUtils.isEmpty(networkCountryIso)) {
                                                strC0 = bm8.c0(Locale.getDefault().getCountry());
                                            } else {
                                                strC0 = bm8.c0(networkCountryIso);
                                            }
                                        }
                                        lp3Var.o = strC0;
                                    }
                                    lp3Var.l = lp3Var.b(iB);
                                    lp3Var.d.getClass();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    lp3Var.c(lp3Var.i, lp3Var.g > 0 ? (int) (jElapsedRealtime - lp3Var.h) : 0, lp3Var.l);
                                    lp3Var.h = jElapsedRealtime;
                                    lp3Var.i = 0L;
                                    lp3Var.k = 0L;
                                    lp3Var.j = 0L;
                                    ipd ipdVar = lp3Var.f;
                                    ipdVar.a.clear();
                                    ipdVar.b = -1;
                                    ipdVar.c = 0;
                                    ipdVar.d = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((p9a) this.b).c();
                return;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((tga) this.b).m--;
                return;
            case 14:
                ((oha) this.b).s();
                return;
            case 15:
                ((PlayerView) this.b).invalidate();
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((l26) this.b).z("tomorrow-fortune-reminder-guide-preview", null);
                return;
            case 17:
                ((wta) this.b).q();
                return;
            case 18:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.b;
                a58 a58Var2 = processLifecycleOwner.f;
                if (processLifecycleOwner.b == 0) {
                    processLifecycleOwner.c = true;
                    a58Var2.e(f48.ON_PAUSE);
                }
                if (processLifecycleOwner.a == 0 && processLifecycleOwner.c) {
                    a58Var2.e(f48.ON_STOP);
                    processLifecycleOwner.d = true;
                    return;
                }
                return;
            case 19:
                c5c.setRippleState$lambda$1((c5c) this.b);
                return;
            case 20:
                i6c i6cVar = (i6c) this.b;
                boolean z2 = i6cVar.c > 0;
                if (i6cVar.p.compareAndSet(false, true) && z2) {
                    qn2 qn2Var = i6cVar.l.a;
                    if (qn2Var != null) {
                        ynb.V(qn2Var, i6cVar.s, null, new e6c(i6cVar, null), 2);
                        return;
                    } else {
                        pa7.g0("coroutineScope");
                        throw null;
                    }
                }
                return;
            case 21:
                gg7 gg7Var = (gg7) this.b;
                synchronized (((ArrayDeque) gg7Var.c)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) gg7Var.b).edit();
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = ((ArrayDeque) gg7Var.c).iterator();
                    while (it2.hasNext()) {
                        sb.append((String) it2.next());
                        sb.append(",");
                    }
                    editorEdit.putString("topic_operation_queue", sb.toString()).apply();
                    break;
                }
                return;
            case 22:
                View view = (View) this.b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 23:
                uud uudVar = (uud) this.b;
                int i3 = uud.z;
                Surface surface = uudVar.v;
                if (surface != null) {
                    Iterator it3 = uudVar.a.iterator();
                    while (it3.hasNext()) {
                        ((t45) it3.next()).a.S(null);
                    }
                }
                SurfaceTexture surfaceTexture = uudVar.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                uudVar.g = null;
                uudVar.v = null;
                return;
            case 24:
                xi2 xi2Var = (xi2) ((psd) this.b).d;
                if (xi2Var != null) {
                    Iterator it4 = xi2Var.values().iterator();
                    while (it4.hasNext()) {
                        ((iae) it4.next()).b();
                    }
                    return;
                }
                return;
            case 25:
                lge lgeVar = (lge) this.b;
                lgeVar.y = false;
                lgeVar.g();
                return;
            case 26:
                bhe bheVar = (bhe) this.b;
                bheVar.k = false;
                if (bheVar.l) {
                    return;
                }
                Map map = bheVar.h;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!bheVar.d.containsKey((TarotSkinIdentify) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    bheVar.j = 1000L;
                    return;
                }
                if (!((Boolean) bheVar.b.invoke()).booleanValue()) {
                    bheVar.e();
                    return;
                }
                bheVar.j = 1000L;
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    bheVar.d((TarotSkinIdentify) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
                }
                return;
            case 27:
                ite iteVar = (ite) this.b;
                ta0 ta0Var = iteVar.b;
                iteVar.n = null;
                p89 p89Var = iteVar.m;
                View view2 = iteVar.a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    p89Var.g();
                    return;
                }
                Object[] objArr = p89Var.a;
                int i4 = p89Var.c;
                Boolean boolValueOf = null;
                for (int i5 = 0; i5 < i4; i5++) {
                    hte hteVar = (hte) objArr[i5];
                    int iOrdinal = hteVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            boolValueOf = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            ap.c();
                            return;
                        } else if (!pa7.t(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(hteVar == hte.c);
                        }
                    } else {
                        boolValueOf = Boolean.TRUE;
                    }
                    bool = boolValueOf;
                }
                p89Var.g();
                if (pa7.t(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((lw7) ta0Var.d).getValue()).restartInput((View) ta0Var.c);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((vrb) ((ysd) ta0Var.b).b).h();
                    } else {
                        ((vrb) ((ysd) ta0Var.b).b).f();
                    }
                }
                if (pa7.t(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((lw7) ta0Var.d).getValue()).restartInput((View) ta0Var.c);
                    return;
                }
                return;
            case 28:
                ArrayList arrayList = (ArrayList) this.b;
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((ExecutorService) it5.next()).shutdownNow();
                }
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    ((ExecutorService) it6.next()).awaitTermination(1L, TimeUnit.SECONDS);
                }
                return;
            default:
                HandlerThread handlerThread = (HandlerThread) this.b;
                handlerThread.quit();
                handlerThread.join(1000L);
                return;
        }
    }

    public /* synthetic */ m45(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ m45(g55 g55Var, wha whaVar) {
        this.a = 2;
        this.b = whaVar;
    }
}
