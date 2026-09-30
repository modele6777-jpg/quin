package io.sentry.android.core;

import io.sentry.e7;
import io.sentry.g7;
import io.sentry.h7;
import io.sentry.i5;
import io.sentry.n2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements io.sentry.f0 {
    public final d a;
    public final SentryAndroidOptions b;
    public final io.sentry.util.a c = new io.sentry.util.a();

    public p1(SentryAndroidOptions sentryAndroidOptions, d dVar) {
        this.b = sentryAndroidOptions;
        this.a = dVar;
    }

    public static void a(io.sentry.android.core.performance.g gVar, io.sentry.protocol.f0 f0Var) {
        g7 g7Var;
        if (gVar.a != io.sentry.android.core.performance.f.COLD) {
            return;
        }
        io.sentry.protocol.e eVar = f0Var.b;
        ArrayList arrayList = f0Var.H0;
        e7 e7VarJ = eVar.j();
        if (e7VarJ == null) {
            return;
        }
        io.sentry.protocol.w wVar = e7VarJ.a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                g7Var = null;
                break;
            }
            io.sentry.protocol.z zVar = (io.sentry.protocol.z) it.next();
            if (zVar.f.contentEquals("app.start.cold")) {
                g7Var = zVar.d;
                break;
            }
        }
        if (g7Var == null && "app.start".equals(e7VarJ.e)) {
            g7Var = e7VarJ.b;
        }
        boolean zEquals = "app.start".equals(e7VarJ.e);
        io.sentry.android.core.performance.h hVar = new io.sentry.android.core.performance.h();
        io.sentry.android.core.performance.h hVar2 = gVar.d;
        long j = hVar2.b;
        long j2 = hVar2.c;
        long j3 = io.sentry.android.core.performance.g.N0;
        hVar.a = "Process Initialization";
        hVar.b = j;
        hVar.c = j2;
        hVar.d = j3;
        if (hVar.d() && Math.abs(hVar.a()) <= 10000) {
            arrayList.add(e(hVar, g7Var, wVar, "process.load", zEquals));
        }
        ArrayList arrayList2 = new ArrayList(gVar.g.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(e((io.sentry.android.core.performance.h) it2.next(), g7Var, wVar, "contentprovider.load", zEquals));
            }
        }
        io.sentry.android.core.performance.h hVar3 = gVar.f;
        if (hVar3.e()) {
            arrayList.add(e(hVar3, g7Var, wVar, "application.load", zEquals));
        }
    }

    public static boolean c(io.sentry.protocol.f0 f0Var) {
        for (io.sentry.protocol.z zVar : f0Var.H0) {
            if (zVar.f.contentEquals("app.start.cold") || zVar.f.contentEquals("app.start.warm")) {
                return true;
            }
        }
        e7 e7VarJ = f0Var.b.j();
        return e7VarJ != null && e7VarJ.e.equals("app.start");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    public static void d(io.sentry.protocol.f0 f0Var) {
        boolean z;
        Double d;
        Double d2;
        Object obj;
        ArrayList<io.sentry.protocol.z> arrayList = f0Var.H0;
        io.sentry.protocol.z zVar = null;
        io.sentry.protocol.z zVar2 = null;
        for (io.sentry.protocol.z zVar3 : arrayList) {
            if ("ui.load.initial_display".equals(zVar3.f)) {
                zVar = zVar3;
            } else if ("ui.load.full_display".equals(zVar3.f)) {
                zVar2 = zVar3;
            }
            if (zVar != null && zVar2 != null) {
                break;
            }
        }
        if (zVar == null && zVar2 == null) {
            return;
        }
        for (io.sentry.protocol.z zVar4 : arrayList) {
            if (zVar4 != zVar && zVar4 != zVar2) {
                Map map = zVar4.y;
                Double d3 = zVar4.a;
                boolean z2 = false;
                boolean z3 = map == null || (obj = map.get("thread.name")) == null || "main".equals(obj);
                if (zVar != null) {
                    double dDoubleValue = d3.doubleValue();
                    if (dDoubleValue < zVar.a.doubleValue() || (((d2 = zVar.b) != null && dDoubleValue > d2.doubleValue()) || !z3)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (zVar2 != null) {
                    double dDoubleValue2 = d3.doubleValue();
                    if (dDoubleValue2 >= zVar2.a.doubleValue() && ((d = zVar2.b) == null || dDoubleValue2 <= d.doubleValue())) {
                        z2 = true;
                    }
                }
                if (z || z2) {
                    Map concurrentHashMap = zVar4.y;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                        zVar4.y = concurrentHashMap;
                    }
                    if (z) {
                        concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z2) {
                        concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    public static io.sentry.protocol.z e(io.sentry.android.core.performance.h hVar, g7 g7Var, io.sentry.protocol.w wVar, String str, boolean z) {
        long jA;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.e.b));
        map.put("thread.name", "main");
        if (!z) {
            Boolean bool = Boolean.TRUE;
            map.put("ui.contributes_to_ttid", bool);
            map.put("ui.contributes_to_ttfd", bool);
        }
        Double dValueOf = Double.valueOf(hVar.b / 1000.0d);
        if (hVar.d()) {
            jA = hVar.a() + hVar.b;
        } else {
            jA = 0;
        }
        return new io.sentry.protocol.z(dValueOf, Double.valueOf(jA / 1000.0d), wVar, new g7(), g7Var, str, hVar.a, h7.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.f0
    public final io.sentry.protocol.f0 l(io.sentry.protocol.f0 f0Var, io.sentry.l0 l0Var) {
        Map map;
        io.sentry.android.core.performance.h hVarB;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        io.sentry.util.a aVar = this.c;
        aVar.b();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                aVar.close();
                return f0Var;
            }
            io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
            boolean zC = c(f0Var);
            HashMap map2 = f0Var.I0;
            io.sentry.protocol.e eVar = f0Var.b;
            if (zC) {
                e7 e7VarJ = eVar.j();
                boolean z = true;
                boolean z2 = (e7VarJ == null || !(e7VarJ != null && "app.start".equals(e7VarJ.e)) || e7VarJ.x.containsKey("app.vitals.start.screen")) ? false : true;
                if (gVarC.X && (z2 || Boolean.TRUE.equals(gVarC.b))) {
                    if (z2) {
                        hVarB = gVarC.d;
                        if (!hVarB.d() || !hVarB.e()) {
                            hVarB = gVarC.e;
                        }
                    } else {
                        hVarB = gVarC.b(sentryAndroidOptions);
                    }
                    long jA = hVarB.a();
                    io.sentry.util.a aVar2 = (io.sentry.util.a) gVarC.M0.a;
                    aVar2.b();
                    aVar2.close();
                    if (jA == 0) {
                        z = false;
                    }
                    if (z) {
                        if (z) {
                            map2.put(gVarC.a == io.sentry.android.core.performance.f.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.n(n2.MILLISECOND.apiName(), Float.valueOf(jA)));
                        }
                        a(gVarC, f0Var);
                        gVarC.X = false;
                        gVarC.g.clear();
                        gVarC.v.clear();
                        io.sentry.util.a aVar3 = (io.sentry.util.a) gVarC.M0.a;
                        aVar3.b();
                        aVar3.close();
                    }
                }
                io.sentry.protocol.a aVarE = eVar.e();
                if (aVarE == null) {
                    aVarE = new io.sentry.protocol.a();
                    eVar.n(aVarE);
                }
                aVarE.x = gVarC.a == io.sentry.android.core.performance.f.COLD ? "cold" : "warm";
            }
            d(f0Var);
            io.sentry.protocol.w wVar = f0Var.a;
            e7 e7VarJ2 = eVar.j();
            if (wVar != null && e7VarJ2 != null && e7VarJ2.e.contentEquals("ui.load")) {
                d dVar = this.a;
                ConcurrentHashMap concurrentHashMap = dVar.c;
                io.sentry.util.a aVar4 = dVar.f;
                aVar4.b();
                try {
                    if (dVar.c()) {
                        map = (Map) concurrentHashMap.get(wVar);
                        concurrentHashMap.remove(wVar);
                        aVar4.close();
                    } else {
                        aVar4.close();
                        map = null;
                    }
                    if (map != null) {
                        map2.putAll(map);
                    }
                } catch (Throwable th) {
                    try {
                        aVar4.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            aVar.close();
            return f0Var;
        } catch (Throwable th3) {
            try {
                aVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.f0
    public final i5 h(i5 i5Var, io.sentry.l0 l0Var) {
        return i5Var;
    }
}
