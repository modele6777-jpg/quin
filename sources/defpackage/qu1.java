package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.Util;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import io.sentry.android.core.b1;
import io.sentry.android.core.h2;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qu1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public qu1(c8h c8hVar, AtomicReference atomicReference, String str, String str2) {
        this.a = 6;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        Objects.requireNonNull(c8hVar);
        this.e = c8hVar;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0439  */
    /* JADX WARN: Code duplicated, block: B:127:0x044e A[LOOP:1: B:125:0x0448->B:127:0x044e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x049e A[Catch: bng -> 0x0507, LOOP:2: B:130:0x0494->B:132:0x049e, LOOP_END, TryCatch #0 {bng -> 0x0507, blocks: (B:129:0x0487, B:130:0x0494, B:132:0x049e, B:133:0x04d4, B:135:0x04ef), top: B:163:0x0487 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x04ef A[Catch: bng -> 0x0507, TRY_LEAVE, TryCatch #0 {bng -> 0x0507, blocks: (B:129:0x0487, B:130:0x0494, B:132:0x049e, B:133:0x04d4, B:135:0x04ef), top: B:163:0x0487 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        qbh qbhVar;
        n3h n3hVar;
        int i;
        long jElapsedRealtime;
        byte[] bArrR = null;
        switch (this.a) {
            case 0:
                su1 su1Var = (su1) ((kb6) this.e).b;
                vr8 vr8Var = (vr8) this.c;
                ru1 ru1Var = (ru1) this.b;
                if (ru1Var != null) {
                    su1Var.O0 = true;
                    ru1Var.b.c(false);
                    su1Var.O0 = false;
                }
                if (vr8Var.isEnabled() && vr8Var.hasSubMenu()) {
                    ((qr8) this.d).q(vr8Var, null, 4);
                    return;
                }
                return;
            case 1:
                InstallReferrer installReferrer = (InstallReferrer) this.e;
                try {
                    installReferrer.invokeI(this.b, (Method) this.c, (Object[]) this.d);
                    return;
                } catch (Throwable th) {
                    installReferrer.referrerCallback.onFail(Util.formatString("invoke error (%s) thrown by (%s)", th.getMessage(), th.getClass().getCanonicalName()));
                    return;
                }
            case 2:
                j7g.i((View) this.b, (n7g) this.c, (lqb) this.d);
                ((ValueAnimator) this.e).start();
                return;
            case 3:
                e5h e5hVar = (e5h) this.b;
                String str = (String) this.c;
                sbh sbhVar = (sbh) this.d;
                vzg vzgVar = (vzg) this.e;
                ich ichVar = e5hVar.d;
                ichVar.U();
                ichVar.Z().A0();
                ichVar.m0();
                krg krgVar = ichVar.c;
                ich.S(krgVar);
                List<kch> listF0 = krgVar.F0(str, sbhVar, ((Integer) bzg.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (kch kchVar : listF0) {
                    String str2 = kchVar.c;
                    long j = kchVar.h;
                    long j2 = kchVar.a;
                    if (ichVar.n(str, str2)) {
                        int i2 = kchVar.i;
                        if (i2 > 0) {
                            if (i2 <= ((Integer) bzg.z.a(bArrR)).intValue()) {
                                long jMin = Math.min(((Long) bzg.x.a(bArrR)).longValue() * (1 << (i2 - 1)), ((Long) bzg.y.a(bArrR)).longValue());
                                ichVar.E().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : kchVar.d.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    qbhVar = new qbh(kchVar.a, kchVar.b.a(), kchVar.c, bundle, kchVar.e.a(), kchVar.g, "");
                                    try {
                                        n3hVar = (n3h) lch.l1(t3h.y(), qbhVar.b);
                                        for (i = 0; i < ((t3h) n3hVar.b).s(); i++) {
                                            u3h u3hVar = (u3h) ((t3h) n3hVar.b).t(i).i();
                                            ichVar.E().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            u3hVar.c();
                                            ((z3h) u3hVar.b).h0(jCurrentTimeMillis);
                                            n3hVar.c();
                                            ((t3h) n3hVar.b).A(i, (z3h) u3hVar.e());
                                        }
                                        qbhVar.b = ((t3h) n3hVar.e()).a();
                                        if (Log.isLoggable(ichVar.v().G0(), 2)) {
                                            lch lchVar = ichVar.g;
                                            ich.S(lchVar);
                                            qbhVar.g = lchVar.b1((t3h) n3hVar.e());
                                        }
                                        arrayList.add(qbhVar);
                                    } catch (bng unused) {
                                        ichVar.v().x.b(str, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            ichVar.v().Z.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r6.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            qbhVar = new qbh(kchVar.a, kchVar.b.a(), kchVar.c, bundle, kchVar.e.a(), kchVar.g, "");
                            n3hVar = (n3h) lch.l1(t3h.y(), qbhVar.b);
                            while (i < ((t3h) n3hVar.b).s()) {
                                u3h u3hVar2 = (u3h) ((t3h) n3hVar.b).t(i).i();
                                ichVar.E().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                u3hVar2.c();
                                ((z3h) u3hVar2.b).h0(jCurrentTimeMillis2);
                                n3hVar.c();
                                ((t3h) n3hVar.b).A(i, (z3h) u3hVar2.e());
                            }
                            qbhVar.b = ((t3h) n3hVar.e()).a();
                            if (Log.isLoggable(ichVar.v().G0(), 2)) {
                                lch lchVar2 = ichVar.g;
                                ich.S(lchVar2);
                                qbhVar.g = lchVar2.b1((t3h) n3hVar.e());
                            }
                            arrayList.add(qbhVar);
                        }
                        bArrR = null;
                    } else {
                        ichVar.v().Z.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), kchVar.c);
                    }
                }
                try {
                    vzgVar.s(new vbh(arrayList));
                    ichVar.v().Z.c(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e) {
                    ichVar.v().g.c(str, e, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 4:
                lah lahVarJ = ((AppMeasurementDynamiteService) this.e).d.j();
                tug tugVar = (tug) this.b;
                hsg hsgVar = (hsg) this.c;
                String str3 = (String) this.d;
                lahVarJ.A0();
                lahVarJ.B0();
                w3h w3hVar = (w3h) lahVarJ.b;
                qch qchVar = w3hVar.w;
                w3h.f(qchVar);
                if (bc6.b.b(((w3h) qchVar.b).a, 12451000) == 0) {
                    lahVarJ.O0(new qu1(lahVarJ, hsgVar, str3, tugVar, 10));
                    return;
                }
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.x.a("Not bundling data. Service unavailable or out of date");
                qch qchVar2 = w3hVar.w;
                w3h.f(qchVar2);
                qchVar2.r1(tugVar, new byte[0]);
                return;
            case 5:
                e5h e5hVar2 = (e5h) this.b;
                Bundle bundle2 = (Bundle) this.c;
                String str4 = (String) this.d;
                ndh ndhVar = (ndh) this.e;
                boolean zIsEmpty = bundle2.isEmpty();
                ich ichVar2 = e5hVar2.d;
                if (zIsEmpty) {
                    krg krgVar2 = ichVar2.c;
                    ich.S(krgVar2);
                    krgVar2.A0();
                    krgVar2.B0();
                    try {
                        krgVar2.r1().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e2) {
                        w0h w0hVar2 = ((w3h) krgVar2.b).f;
                        w3h.h(w0hVar2);
                        w0hVar2.g.b(e2, "Error clearing default event params");
                        return;
                    }
                }
                krg krgVar3 = ichVar2.c;
                ich.S(krgVar3);
                w3h w3hVar2 = (w3h) krgVar3.b;
                krgVar3.A0();
                krgVar3.B0();
                yl ylVar = new yl((w3h) krgVar3.b, "", str4, "dep", 0L, 0L, 0L, bundle2);
                lch lchVar3 = krgVar3.c.g;
                ich.S(lchVar3);
                byte[] bArrA = lchVar3.a1(ylVar).a();
                w0h w0hVar3 = w3hVar2.f;
                w3h.h(w0hVar3);
                w0hVar3.Z.c(str4, Integer.valueOf(bArrA.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", bArrA);
                try {
                    if (krgVar3.r1().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        w3h.h(w0hVar3);
                        w0hVar3.g.b(w0h.E0(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    w3h.h(w0hVar3);
                    w0hVar3.g.c(w0h.E0(str4), e3, "Error storing default event parameters. appId");
                }
                krg krgVar4 = ichVar2.c;
                ich.S(krgVar4);
                long j3 = ndhVar.S0;
                try {
                    if (krgVar4.X0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j3)}, 0L) <= 0 && krgVar4.X0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j3)}, 0L) > 0) {
                        krg krgVar5 = ichVar2.c;
                        ich.S(krgVar5);
                        krgVar5.T0(str4, Long.valueOf(j3), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    w0h w0hVar4 = ((w3h) krgVar4.b).f;
                    w3h.h(w0hVar4);
                    w0hVar4.g.b(e4, "Error checking backfill conditions");
                    return;
                }
            case 6:
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                lah lahVarJ2 = ((w3h) ((c8h) this.e).b).j();
                AtomicReference atomicReference = (AtomicReference) this.b;
                lahVarJ2.A0();
                lahVarJ2.B0();
                lahVarJ2.O0(new t4h(lahVarJ2, atomicReference, str5, str6, lahVarJ2.Q0(false)));
                return;
            case 7:
                o3d o3dVar = (o3d) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                Context context = (Context) this.d;
                h2 h2Var = (h2) this.e;
                if ((o3dVar.a instanceof t1) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(h2Var);
                        return;
                    } catch (IllegalArgumentException e5) {
                        b1.n("DirectBootUtils", "Failed to unregister receiver", e5);
                        return;
                    }
                }
                return;
            case 8:
                kb6 kb6Var = x8h.a;
                Level level = (Level) this.b;
                m4 m4Var = (m4) kb6Var.b;
                boolean zX0 = m4Var.x0(level);
                String str7 = (String) m4Var.b;
                ((ikg) dkg.a).getClass();
                nkg.b.a(str7, level, zX0);
                ((xfh) ((xfh) (!zX0 ? kb6.e : new yfh(kb6Var, level)).c((Throwable) this.c)).a()).b((String) this.d, (Object[]) this.e);
                return;
            case 9:
                lah lahVarJ3 = ((AppMeasurementDynamiteService) this.e).d.j();
                tug tugVar2 = (tug) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                lahVarJ3.A0();
                lahVarJ3.B0();
                lahVarJ3.O0(new t4h(lahVarJ3, str8, str9, lahVarJ3.Q0(false), tugVar2));
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                tug tugVar3 = (tug) this.d;
                lah lahVar = (lah) this.e;
                w3h w3hVar3 = (w3h) lahVar.b;
                try {
                    try {
                        hzg hzgVar = lahVar.e;
                        if (hzgVar != null) {
                            bArrR = hzgVar.r((String) this.c, (hsg) this.b);
                            lahVar.N0();
                            return;
                        } else {
                            w0h w0hVar5 = w3hVar3.f;
                            w3h.h(w0hVar5);
                            w0hVar5.g.a("Discarding data. Failed to send event to service to bundle");
                            return;
                        }
                    } catch (RemoteException e6) {
                        w0h w0hVar6 = w3hVar3.f;
                        w3h.h(w0hVar6);
                        w0hVar6.g.b(e6, "Failed to send event to the service to bundle");
                    }
                } finally {
                    qch qchVar3 = w3hVar3.w;
                    w3h.f(qchVar3);
                    qchVar3.r1(tugVar3, null);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                lah lahVar2 = (lah) this.b;
                AtomicReference atomicReference2 = (AtomicReference) this.c;
                ndh ndhVar2 = (ndh) this.d;
                Bundle bundle3 = (Bundle) this.e;
                synchronized (atomicReference2) {
                    try {
                        hzg hzgVar2 = lahVar2.e;
                        if (hzgVar2 != null) {
                            hzgVar2.w(ndhVar2, bundle3, new g9h(lahVar2, atomicReference2));
                            lahVar2.N0();
                            return;
                        } else {
                            w0h w0hVar7 = ((w3h) lahVar2.b).f;
                            w3h.h(w0hVar7);
                            w0hVar7.g.a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e7) {
                        w0h w0hVar8 = ((w3h) lahVar2.b).f;
                        w3h.h(w0hVar8);
                        w0hVar8.g.b(e7, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                lah lahVar3 = (lah) this.b;
                AtomicReference atomicReference3 = (AtomicReference) this.c;
                ndh ndhVar3 = (ndh) this.d;
                sbh sbhVar2 = (sbh) this.e;
                synchronized (atomicReference3) {
                    try {
                        hzg hzgVar3 = lahVar3.e;
                        if (hzgVar3 != null) {
                            hzgVar3.i(ndhVar3, sbhVar2, new i9h(lahVar3, atomicReference3));
                            lahVar3.N0();
                            return;
                        } else {
                            w0h w0hVar9 = ((w3h) lahVar3.b).f;
                            w3h.h(w0hVar9);
                            w0hVar9.g.a("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e8) {
                        w0h w0hVar10 = ((w3h) lahVar3.b).f;
                        w3h.h(w0hVar10);
                        w0hVar10.g.b(e8, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            default:
                ich ichVar3 = (ich) ((yea) this.e).a;
                qch qchVarL0 = ichVar3.l0();
                ichVar3.E().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (ichVar3.f0().L0(null, bzg.e1)) {
                    ichVar3.E().getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                Bundle bundle4 = (Bundle) this.d;
                String str10 = (String) this.c;
                String str11 = (String) this.b;
                hsg hsgVarI1 = qchVarL0.i1(str10, bundle4, "auto", jCurrentTimeMillis3, jElapsedRealtime, false);
                oa7.A(hsgVarI1);
                ichVar3.c(str11, hsgVarI1);
                return;
        }
    }

    public /* synthetic */ qu1(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ qu1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
