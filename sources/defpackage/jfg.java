package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.play.core.assetpacks.b;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import io.sentry.android.core.v;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jfg implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public jfg(nhg nhgVar, sug sugVar) {
        this.a = 5;
        Objects.requireNonNull(nhgVar);
        this.b = sugVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x023b  */
    @Override // java.lang.Runnable
    public final void run() {
        nfg nfgVar;
        int i = 4;
        int i2 = 3;
        int i3 = 0;
        int i4 = 1;
        switch (this.a) {
            case 0:
                kfg kfgVar = (kfg) this.b;
                synchronized (kfgVar) {
                    try {
                        Iterator it = new HashSet(kfgVar.a).iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                dhg dhgVar = (dhg) this.b;
                bfg bfgVar = dhgVar.c;
                bfg bfgVar2 = dhgVar.d;
                lhg lhgVar = (lhg) bfgVar.a();
                b bVar = dhgVar.a;
                bVar.getClass();
                HashMap map = new HashMap();
                rch rchVar = b.c;
                HashMap map2 = new HashMap();
                try {
                    for (File file : bVar.e()) {
                        String strK = bVar.k(file.getName());
                        if (strK == null) {
                            nfgVar = null;
                        } else {
                            File file2 = new File(strK, "assets");
                            if (file2.isDirectory()) {
                                nfgVar = new nfg(strK, file2.getCanonicalPath());
                            } else {
                                rchVar.b("Failed to find assets directory: %s", file2);
                                nfgVar = null;
                            }
                        }
                        if (nfgVar != null) {
                            map2.put(file.getName(), nfgVar);
                        }
                        break;
                    }
                } catch (IOException e) {
                    rchVar.b("Could not process directory while scanning installed packs: %s", e);
                }
                for (String str : map2.keySet()) {
                    map.put(str, Long.valueOf(b.b(new File(new File(bVar.d(), str), String.valueOf((int) b.b(new File(bVar.d(), str)))))));
                }
                gfh gfhVarF = lhgVar.f(map);
                gfhVarF.e((Executor) bfgVar2.a(), new ysd(i, bVar));
                gfhVarF.d((Executor) bfgVar2.a(), new uzd(14));
                return;
            case 2:
                ((rhg) this.b).a();
                return;
            case 3:
                xb6 xb6Var = ((rhg) ((g5b) this.b).b).e;
                xb6Var.d(xb6Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 4:
                ((aig) this.b).k.f(new ConnectionResult(4, null, null));
                return;
            case 5:
                throw null;
            case 6:
                jzf jzfVar = (jzf) this.b;
                synchronized (jzfVar.a) {
                    try {
                        if (jzfVar.b()) {
                            b1.d("WakeLock", String.valueOf(jzfVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            jzfVar.d();
                            if (jzfVar.b()) {
                                jzfVar.c = 1;
                                jzfVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 7:
                if (((gle) this.b).b(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 8:
                krg krgVar = (krg) this.b;
                try {
                    SQLiteDatabase sQLiteDatabaseR1 = krgVar.r1();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseR1.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e2) {
                    w0h w0hVar = ((w3h) krgVar.b).f;
                    w3h.h(w0hVar);
                    w0hVar.g.b(e2, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case 9:
                ysg ysgVar = (ysg) this.b;
                ox0 ox0Var = ysgVar.d;
                ox0Var.x(0);
                z5h z5hVar = z5h.EXECUTE_ASYNC_TIMEOUT;
                tx0 tx0Var = swg.i;
                ox0Var.w(tx0Var, z5hVar);
                ysgVar.d(tx0Var);
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l1h l1hVar = (l1h) this.b;
                synchronized (l1hVar.c) {
                    ((wm9) l1hVar.d).c();
                    break;
                }
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((ich) ((q1h) this.b).d).L();
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                lah lahVar = ((gah) this.b).c;
                lahVar.L0(new ComponentName(((w3h) lahVar.b).a, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                lah lahVar2 = ((gah) ((fah) this.b).c).c;
                m3h m3hVar = ((w3h) lahVar2.b).g;
                w3h.h(m3hVar);
                m3hVar.J0(new dah(lahVar2, i3));
                return;
            case 14:
                vah vahVar = (vah) this.b;
                ebh ebhVar = (ebh) vahVar.c.b;
                ebhVar.A0();
                w3h w3hVar = (w3h) ebhVar.b;
                w0h w0hVar2 = w3hVar.f;
                Context context = w3hVar.a;
                w3h.h(w0hVar2);
                w0hVar2.Y.a("Application going to the background");
                c2h c2hVar = w3hVar.e;
                w3h.f(c2hVar);
                c2hVar.I0.b(true);
                ebhVar.A0();
                ebhVar.e = true;
                qqg qqgVar = w3hVar.d;
                if (!qqgVar.P0()) {
                    long j = vahVar.b;
                    y21 y21Var = ebhVar.g;
                    y21Var.n(j, false, false);
                    ((xah) y21Var.c).c();
                }
                long j2 = vahVar.a;
                w3h.h(w0hVar2);
                w0hVar2.X.b(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                c8h c8hVar = w3hVar.X;
                w3h.g(c8hVar);
                c8hVar.A0();
                w3h w3hVar2 = (w3h) c8hVar.b;
                c8hVar.B0();
                lah lahVarJ = w3hVar2.j();
                lahVarJ.A0();
                lahVarJ.B0();
                if (lahVarJ.H0()) {
                    qch qchVar = ((w3h) lahVarJ.b).w;
                    w3h.f(qchVar);
                    if (qchVar.m1() >= 242600) {
                        lah lahVarJ2 = w3hVar2.j();
                        lahVarJ2.A0();
                        lahVarJ2.B0();
                        lahVarJ2.O0(new p9h(lahVarJ2, lahVarJ2.Q0(true), 0));
                    }
                } else {
                    lah lahVarJ3 = w3hVar2.j();
                    lahVarJ3.A0();
                    lahVarJ3.B0();
                    lahVarJ3.O0(new p9h(lahVarJ3, lahVarJ3.Q0(true), 0));
                }
                if (qqgVar.L0(null, bzg.N0)) {
                    qch qchVar2 = w3hVar.w;
                    w3h.f(qchVar2);
                    long jI0 = qchVar2.g1(context.getPackageName(), qqgVar.d) ? 1000L : qqgVar.I0(context.getPackageName(), bzg.E);
                    w3h.h(w0hVar2);
                    w0hVar2.Z.b(Long.valueOf(jI0), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    w3h.e(w3hVar.J0);
                    w3hVar.J0.E0(jI0);
                    return;
                }
                return;
            case 15:
                ich ichVar = (ich) this.b;
                ichVar.Z().A0();
                ichVar.y = new ysd(ichVar);
                krg krgVar2 = new krg(ichVar);
                krgVar2.C0();
                ichVar.c = krgVar2;
                y2h y2hVar = ichVar.a;
                qqg qqgVarF0 = ichVar.f0();
                oa7.A(y2hVar);
                qqgVarF0.e = y2hVar;
                oah oahVar = new oah(ichVar);
                oahVar.C0();
                ichVar.w = oahVar;
                fmg fmgVar = new fmg(ichVar);
                fmgVar.C0();
                ichVar.f = fmgVar;
                g1h g1hVar = new g1h(ichVar, i4);
                g1hVar.C0();
                ichVar.v = g1hVar;
                mbh mbhVar = new mbh(ichVar);
                mbhVar.C0();
                ichVar.e = mbhVar;
                ichVar.d = new q1h(ichVar);
                if (ichVar.G0 != ichVar.H0) {
                    ichVar.v().g.c(Integer.valueOf(ichVar.G0), Integer.valueOf(ichVar.H0), "Not all upload components initialized");
                }
                ichVar.X.set(true);
                ichVar.v().Z.a("UploadController is now fully initialized");
                ichVar.Z().A0();
                krg krgVar3 = ichVar.c;
                ich.S(krgVar3);
                krgVar3.K0();
                krg krgVar4 = ichVar.c;
                ich.S(krgVar4);
                krgVar4.A0();
                krgVar4.B0();
                if (krgVar4.l1()) {
                    azg azgVar = bzg.u0;
                    if (((Long) azgVar.a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseR2 = krgVar4.r1();
                        w3h w3hVar3 = (w3h) krgVar4.b;
                        w3hVar3.y.getClass();
                        int iDelete = sQLiteDatabaseR2.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(azgVar.a(null))});
                        if (iDelete > 0) {
                            w0h w0hVar3 = w3hVar3.f;
                            w3h.h(w0hVar3);
                            w0hVar3.Z.b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (ichVar.w.w.a() == 0) {
                    v vVar = ichVar.w.w;
                    ichVar.E().getClass();
                    vVar.b(System.currentTimeMillis());
                }
                ichVar.L();
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                throw new RuntimeException(((ExecutionException) this.b).getCause());
            case 17:
                try {
                    pa7.T((hn5) this.b);
                    return;
                } catch (Exception e3) {
                    b1.n("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e3);
                    return;
                }
            case 18:
                try {
                    pa7.T((in5) this.b);
                    return;
                } catch (Exception e4) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e4);
                        return;
                    }
                    return;
                }
            case 19:
                w3h w3hVar4 = (w3h) ((n80) this.b).b;
                w3h.e(w3hVar4.J0);
                w3hVar4.J0.E0(((Long) bzg.D.a(null)).longValue());
                return;
            default:
                w3h w3hVar5 = (w3h) this.b;
                qch qchVar3 = w3hVar5.w;
                c8h c8hVar2 = w3hVar5.X;
                w3h.f(qchVar3);
                qchVar3.A0();
                if (qchVar3.Y0() != 1) {
                    w0h w0hVar4 = w3hVar5.f;
                    w3h.h(w0hVar4);
                    w0hVar4.x.a("registerTrigger called but app not eligible");
                    return;
                }
                w3h.g(c8hVar2);
                c8hVar2.A0();
                e6h e6hVar = c8hVar2.X;
                if (e6hVar != null) {
                    e6hVar.c();
                }
                w3h.g(c8hVar2);
                new Thread(new c6h(c8hVar2, i2)).start();
                return;
        }
    }

    public /* synthetic */ jfg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ jfg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public jfg(aig aigVar) {
        this.a = 4;
        Objects.requireNonNull(aigVar);
        this.b = aigVar;
    }

    public jfg(q1h q1hVar, boolean z) {
        this.a = 11;
        this.b = q1hVar;
    }
}
