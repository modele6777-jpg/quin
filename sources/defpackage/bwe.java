package defpackage;

import android.app.Activity;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.a4;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.core.a;
import io.sentry.android.core.a1;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.core.b1;
import io.sentry.android.core.d;
import io.sentry.android.core.h0;
import io.sentry.android.core.j;
import io.sentry.android.core.l1;
import io.sentry.android.core.o1;
import io.sentry.android.core.q0;
import io.sentry.android.core.w;
import io.sentry.android.core.x1;
import io.sentry.android.core.y1;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.b0;
import io.sentry.android.replay.capture.r;
import io.sentry.android.replay.capture.s;
import io.sentry.android.replay.capture.u;
import io.sentry.android.replay.e;
import io.sentry.android.replay.e0;
import io.sentry.android.replay.k;
import io.sentry.android.replay.l;
import io.sentry.android.replay.m;
import io.sentry.android.replay.x;
import io.sentry.cache.g;
import io.sentry.e7;
import io.sentry.g1;
import io.sentry.internal.modules.f;
import io.sentry.l0;
import io.sentry.metrics.c;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.i0;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.r6;
import io.sentry.s6;
import io.sentry.transport.o;
import io.sentry.util.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bwe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bwe(a aVar, r3 r3Var) {
        this.a = 6;
        this.b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0317  */
    /* JADX WARN: Code duplicated, block: B:99:0x0215  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v9 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        File file;
        Throwable th;
        Date dateL;
        r6 r6VarValueOf;
        e eVar;
        boolean zT;
        Iterable linkedList;
        String str;
        ?? r19;
        Field field;
        int i = 0;
        switch (this.a) {
            case 0:
                ExecutorService executorService = (ExecutorService) this.b;
                executorService.shutdownNow();
                executorService.awaitTermination(1L, TimeUnit.SECONDS);
                return;
            case 1:
                ((UserMetadata) this.b).serializeUserDataIfNeeded();
                return;
            case 2:
                ((muf) this.b).c();
                return;
            case 3:
                fag fagVar = (fag) this.b;
                b1.l("FirebaseMessaging", "Service took too long to process intent: " + fagVar.a.getAction() + " finishing.");
                fagVar.b.c(null);
                return;
            case 4:
                kxa kxaVar = (kxa) this.b;
                ((w8c) kxaVar.d).E(new xag(0, kxaVar));
                return;
            case 5:
                File[] fileArrListFiles = ((File) this.b).listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.lastModified() < q4.f - 300000) {
                        b.g(file2);
                    }
                }
                return;
            case 6:
                a aVar = (a) this.b;
                aVar.v = SystemClock.uptimeMillis();
                aVar.w.set(false);
                return;
            case 7:
                veh vehVar = ((FrameMetricsAggregator) ((d) this.b).a.a()).a;
                ArrayList arrayList = (ArrayList) vehVar.d;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) arrayList.get(size);
                    Activity activity = (Activity) weakReference.get();
                    if (weakReference.get() != null) {
                        activity.getWindow().removeOnFrameMetricsAvailableListener((vy5) vehVar.e);
                        arrayList.remove(size);
                    }
                }
                return;
            case 8:
                ((j) this.b).h(true);
                return;
            case 9:
                ((w) this.b).a(null, true);
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                h0 h0Var = (h0) this.b;
                if (h0Var != null) {
                    ProcessLifecycleOwner.w.f.b(h0Var);
                    return;
                }
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (((a1) this.b).e) {
                    q4.b().q();
                }
                q4.b().o().getReplayController().stop();
                q4.b().o().getContinuousProfiler().a(false);
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l1 l1Var = (l1) this.b;
                io.sentry.util.a aVar2 = l1Var.G0;
                aVar2.b();
                try {
                    l1Var.i(true);
                    aVar2.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        aVar2.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                final o1 o1Var = (o1) this.b;
                synchronized (o1Var.e) {
                    try {
                        if (o1Var.g != null) {
                            o1Var.a.i(q5.WARNING, "Timed out waiting for Perfetto profiling result.", new Object[0]);
                            o1Var.g.accept(null);
                            o1Var.g = new Consumer() { // from class: io.sentry.android.core.n1
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    File file3 = (File) obj;
                                    o1 o1Var2 = o1Var;
                                    o1Var2.getClass();
                                    if (file3 == null || file3.delete()) {
                                        return;
                                    }
                                    o1Var2.a.i(q5.WARNING, "Failed to delete late Perfetto trace file %s", file3.getPath());
                                }
                            };
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            case 14:
                rw rwVar = ((y1) this.b).h;
                while (true) {
                    x1 x1Var = (x1) rwVar.d;
                    if (x1Var == null) {
                        rwVar.e = null;
                        rwVar.a = 0;
                        rwVar.b = 0;
                        return;
                    } else {
                        rwVar.d = x1Var.c;
                        q0 q0Var = (q0) rwVar.c;
                        x1Var.c = (x1) q0Var.a;
                        q0Var.a = x1Var;
                    }
                }
                break;
            case 15:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.b;
                systemEventsBreadcrumbsIntegration.u(systemEventsBreadcrumbsIntegration.c);
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((AnrProfilingIntegration) this.b).e = SystemClock.uptimeMillis();
                return;
            case 17:
                ((f) this.b).a();
                return;
            case 18:
                e7 e7Var = (e7) this.b;
                NativeScope.nativeSetTrace(e7Var.a.a(), e7Var.b.a());
                return;
            case 19:
                i0 i0Var = (i0) this.b;
                NativeScope.nativeSetUser(i0Var.b, i0Var.a, i0Var.d, i0Var.c);
                return;
            case 20:
                NativeScope.nativeRemoveExtra((String) this.b);
                return;
            case 21:
                ReplayIntegration replayIntegration = (ReplayIntegration) this.b;
                pu4 pu4Var = pu4.a;
                String str2 = "options";
                SentryAndroidOptions sentryAndroidOptions = replayIntegration.d;
                if (sentryAndroidOptions == null) {
                    pa7.g0("options");
                    throw null;
                }
                g gVarFindPersistingScopeObserver = sentryAndroidOptions.findPersistingScopeObserver();
                if (gVarFindPersistingScopeObserver != null) {
                    SentryAndroidOptions sentryAndroidOptions2 = replayIntegration.d;
                    if (sentryAndroidOptions2 == null) {
                        pa7.g0("options");
                        throw null;
                    }
                    String str3 = (String) gVarFindPersistingScopeObserver.d(sentryAndroidOptions2, "replay.json", String.class);
                    if (str3 != null) {
                        io.sentry.protocol.w wVar = new io.sentry.protocol.w(str3);
                        if (wVar.equals(io.sentry.protocol.w.b)) {
                            replayIntegration.k0("");
                            return;
                        }
                        SentryAndroidOptions sentryAndroidOptions3 = replayIntegration.d;
                        if (sentryAndroidOptions3 == null) {
                            pa7.g0("options");
                            throw null;
                        }
                        String cacheDirPath = sentryAndroidOptions3.getCacheDirPath();
                        if (cacheDirPath == null || cacheDirPath.length() == 0) {
                            sentryAndroidOptions3.getLogger().i(q5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                            file = null;
                        } else {
                            String cacheDirPath2 = sentryAndroidOptions3.getCacheDirPath();
                            cacheDirPath2.getClass();
                            file = new File(cacheDirPath2, "replay_" + wVar);
                            file.mkdirs();
                        }
                        File file3 = new File(file, ".ongoing_segment");
                        if (file3.exists()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file3), ox1.a), UserMetadata.MAX_INTERNAL_KEY_SIZE);
                            try {
                                Iterator it = new el2(new td0(2, bufferedReader)).iterator();
                                while (it.hasNext()) {
                                    List listC0 = v4e.c0((String) it.next(), new String[]{"="}, 2);
                                    iy9 iy9Var = new iy9((String) listC0.get(i), (String) listC0.get(1));
                                    linkedHashMap.put(iy9Var.d(), iy9Var.e());
                                    i = 0;
                                }
                                th = null;
                                bufferedReader.close();
                                String str4 = (String) linkedHashMap.get("config.height");
                                Integer numD = str4 != null ? c5e.D(str4) : null;
                                String str5 = (String) linkedHashMap.get("config.width");
                                Integer numD2 = str5 != null ? c5e.D(str5) : null;
                                String str6 = (String) linkedHashMap.get("config.frame-rate");
                                Integer numD3 = str6 != null ? c5e.D(str6) : null;
                                String str7 = (String) linkedHashMap.get("config.bit-rate");
                                Integer numD4 = str7 != null ? c5e.D(str7) : null;
                                String str8 = (String) linkedHashMap.get("segment.id");
                                Integer numD5 = str8 != null ? c5e.D(str8) : null;
                                try {
                                    String str9 = (String) linkedHashMap.get("segment.timestamp");
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    dateL = io.sentry.config.a.l(str9);
                                } catch (Throwable unused) {
                                    dateL = null;
                                }
                                try {
                                    String str10 = (String) linkedHashMap.get("replay.type");
                                    if (str10 == null) {
                                        str10 = "";
                                    }
                                    r6VarValueOf = r6.valueOf(str10);
                                } catch (Throwable unused2) {
                                    r6VarValueOf = null;
                                }
                                if (numD == null || numD2 == null || numD3 == null || numD4 == null || numD5 == null) {
                                    str2 = "options";
                                    sentryAndroidOptions3.getLogger().i(q5.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", wVar);
                                    b.g(file);
                                    eVar = null;
                                } else {
                                    Integer num = numD;
                                    Date date = dateL;
                                    if (numD5.intValue() == -1 || date == null || r6VarValueOf == null) {
                                        str2 = "options";
                                        sentryAndroidOptions3.getLogger().i(q5.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", wVar);
                                        b.g(file);
                                    } else {
                                        b0 b0Var = new b0(numD2.intValue(), num.intValue(), 1.0f, 1.0f, numD3.intValue(), numD4.intValue());
                                        k kVar = new k(sentryAndroidOptions3, wVar);
                                        ArrayList arrayList2 = kVar.w;
                                        File fileL = kVar.l();
                                        if (fileL != null) {
                                            fileL.listFiles(new yd5(2, kVar));
                                        }
                                        if (arrayList2.isEmpty()) {
                                            sentryAndroidOptions3.getLogger().i(q5.DEBUG, "No frames found for replay: %s, deleting the replay", wVar);
                                            b.g(file);
                                        } else {
                                            if (arrayList2.size() > 1) {
                                                w72.f0(arrayList2, new io.sentry.android.replay.g(0));
                                            }
                                            String str11 = (String) linkedHashMap.get("replay.flushed");
                                            if (str11 != null) {
                                                zT = pa7.t(str11.equals("true") ? Boolean.TRUE : str11.equals("false") ? Boolean.FALSE : null, Boolean.TRUE);
                                            } else {
                                                zT = false;
                                            }
                                            r6 r6Var = r6.SESSION;
                                            int iIntValue = (r6VarValueOf == r6Var || zT) ? numD5.intValue() : 0;
                                            Date date2 = r6VarValueOf == r6Var ? date : new Date(((l) s72.v0(arrayList2)).b);
                                            long time = (((l) s72.F0(arrayList2)).b - date2.getTime()) + ((long) (1000 / numD3.intValue()));
                                            String str12 = (String) linkedHashMap.get("replay.recording");
                                            if (str12 != null) {
                                                a4 a4Var = (a4) sentryAndroidOptions3.getSerializer().b(new StringReader(str12), a4.class);
                                                if ((a4Var != null ? a4Var.b : null) != null) {
                                                    List list = a4Var.b;
                                                    list.getClass();
                                                    linkedList = new LinkedList(list);
                                                } else {
                                                    linkedList = null;
                                                }
                                                if (linkedList == null) {
                                                    linkedList = pu4Var;
                                                }
                                            } else {
                                                linkedList = pu4Var;
                                            }
                                            eVar = new e(b0Var, kVar, date2, iIntValue, time, r6VarValueOf, (String) linkedHashMap.get("replay.screen-at-start"), s72.b1(linkedList, new io.sentry.android.replay.g(1)));
                                        }
                                    }
                                    eVar = null;
                                }
                                break;
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    ym8.t(bufferedReader, th5);
                                    throw th6;
                                }
                            }
                        } else {
                            sentryAndroidOptions3.getLogger().i(q5.DEBUG, "No ongoing segment found for replay: %s", wVar);
                            b.g(file);
                            str2 = "options";
                            eVar = null;
                            th = null;
                        }
                        if (eVar == null) {
                            replayIntegration.k0("");
                            return;
                        }
                        SentryAndroidOptions sentryAndroidOptions4 = replayIntegration.d;
                        if (sentryAndroidOptions4 == null) {
                            pa7.g0(str2);
                            throw th;
                        }
                        Object objD = gVarFindPersistingScopeObserver.d(sentryAndroidOptions4, "breadcrumbs.json", List.class);
                        if (objD instanceof List) {
                            String str13 = str2;
                            r19 = (List) objD;
                            str = str13;
                        } else {
                            str = str2;
                            r19 = th;
                        }
                        g1 g1Var = replayIntegration.e;
                        SentryAndroidOptions sentryAndroidOptions5 = replayIntegration.d;
                        if (sentryAndroidOptions5 == null) {
                            pa7.g0(str);
                            throw th;
                        }
                        long j = eVar.e;
                        Date date3 = eVar.c;
                        int i2 = eVar.d;
                        b0 b0Var2 = eVar.a;
                        u uVarA = r.a(g1Var, sentryAndroidOptions5, j, date3, wVar, i2, b0Var2.b, b0Var2.a, eVar.f, eVar.b, b0Var2.e, b0Var2.f, eVar.g, r19, new LinkedList(eVar.h), pu4Var, pu4Var);
                        if (uVarA instanceof s) {
                            l0 l0VarF = b.f(new m());
                            s sVar = (s) uVarA;
                            g1 g1Var2 = replayIntegration.e;
                            if (g1Var2 != null) {
                                s6 s6Var = sVar.a;
                                l0VarF.h = sVar.b;
                                g1Var2.u(s6Var, l0VarF);
                            }
                        }
                        replayIntegration.k0(str3);
                        return;
                    }
                }
                replayIntegration.k0("");
                return;
            case 22:
                x xVar = (x) this.b;
                if (xVar.a.get()) {
                    return;
                }
                io.sentry.android.replay.u uVar = new io.sentry.android.replay.u(xVar);
                try {
                    Object value = e0.b.getValue();
                    if (value == null || (field = (Field) e0.c.getValue()) == null) {
                        return;
                    }
                    Object obj = field.get(value);
                    obj.getClass();
                    field.set(value, uVar.d((ArrayList) obj));
                    return;
                } catch (Throwable th7) {
                    Log.w("WindowManagerSpy", th7);
                    return;
                }
            case 23:
                io.sentry.logger.d dVar = (io.sentry.logger.d) this.b;
                dVar.d.a(dVar.a.getShutdownTimeoutMillis());
                return;
            case 24:
                c cVar = (c) this.b;
                cVar.d.a(cVar.a.getShutdownTimeoutMillis());
                return;
            default:
                io.sentry.android.core.internal.tombstone.b bVar = (io.sentry.android.core.internal.tombstone.b) this.b;
                Iterator it2 = ((CopyOnWriteArrayList) bVar.d).iterator();
                while (it2.hasNext()) {
                    ((o) it2.next()).U(bVar);
                }
                return;
        }
    }

    public /* synthetic */ bwe(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ bwe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
