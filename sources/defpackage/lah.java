package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lah extends fzg {
    public final gah d;
    public hzg e;
    public volatile Boolean f;
    public final r9h g;
    public ScheduledExecutorService v;
    public final d82 w;
    public final ArrayList x;
    public final r9h y;

    public lah(w3h w3hVar) {
        super(w3hVar);
        this.x = new ArrayList();
        this.w = new d82(w3hVar.y);
        this.d = new gah(this);
        this.g = new r9h(this, w3hVar, 0);
        this.y = new r9h(this, w3hVar, 1);
    }

    @Override // defpackage.fzg
    public final boolean D0() {
        return false;
    }

    public final void E0(AtomicReference atomicReference) {
        A0();
        B0();
        O0(new qe(this, atomicReference, Q0(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    public final void F0(Bundle bundle) {
        boolean z;
        boolean zH0;
        A0();
        B0();
        esg esgVar = new esg(bundle);
        M0();
        w3h w3hVar = (w3h) this.b;
        if (w3hVar.d.L0(null, bzg.W0)) {
            f0h f0hVarI = w3hVar.i();
            w3h w3hVar2 = (w3h) f0hVarI.b;
            qch qchVar = w3hVar2.w;
            w0h w0hVar = w3hVar2.f;
            w3h.f(qchVar);
            byte[] bArrK1 = qch.k1(esgVar);
            if (bArrK1 == null) {
                w3h.h(w0hVar);
                w0hVar.v.a("Null default event parameters; not writing to database");
            } else {
                if (bArrK1.length > 131072) {
                    w3h.h(w0hVar);
                    w0hVar.v.a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zH0 = f0hVarI.H0(bArrK1, 4);
                }
                if (zH0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zH0 = false;
            if (zH0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        O0(new m6h(this, Q0(false), z, esgVar, bundle));
    }

    public final void G0() {
        A0();
        B0();
        if (R0()) {
            return;
        }
        if (H0()) {
            gah gahVar = this.d;
            lah lahVar = gahVar.c;
            lahVar.A0();
            Context context = ((w3h) lahVar.b).a;
            synchronized (gahVar) {
                try {
                    if (gahVar.a) {
                        w0h w0hVar = ((w3h) gahVar.c.b).f;
                        w3h.h(w0hVar);
                        w0hVar.Z.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (gahVar.b != null && (gahVar.b.q() || gahVar.b.p())) {
                            w0h w0hVar2 = ((w3h) gahVar.c.b).f;
                            w3h.h(w0hVar2);
                            w0hVar2.Z.a("Already awaiting connection attempt");
                            return;
                        }
                        gahVar.b = new k0h(context, Looper.getMainLooper(), tch.a(context), bc6.b, 93, gahVar, gahVar, null);
                        w0h w0hVar3 = ((w3h) gahVar.c.b).f;
                        w3h.h(w0hVar3);
                        w0hVar3.Z.a("Connecting to remote service");
                        gahVar.a = true;
                        oa7.A(gahVar.b);
                        gahVar.b.a();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        w3h w3hVar = (w3h) this.b;
        if (w3hVar.d.D0()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = w3hVar.a.getPackageManager().queryIntentServices(new Intent().setClassName(w3hVar.a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            w0h w0hVar4 = w3hVar.f;
            w3h.h(w0hVar4);
            w0hVar4.g.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(w3hVar.a, "com.google.android.gms.measurement.AppMeasurementService"));
        gah gahVar2 = this.d;
        lah lahVar2 = gahVar2.c;
        lahVar2.A0();
        Context context2 = ((w3h) lahVar2.b).a;
        jk2 jk2VarB = jk2.b();
        synchronized (gahVar2) {
            try {
                boolean z = gahVar2.a;
                lah lahVar3 = gahVar2.c;
                w3h w3hVar2 = (w3h) lahVar3.b;
                if (z) {
                    w0h w0hVar5 = w3hVar2.f;
                    w3h.h(w0hVar5);
                    w0hVar5.Z.a("Connection attempt already in progress");
                } else {
                    w0h w0hVar6 = w3hVar2.f;
                    w3h.h(w0hVar6);
                    w0hVar6.Z.a("Using local app measurement service");
                    gahVar2.a = true;
                    jk2VarB.a(context2, intent, lahVar3.d, 129);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean H0() {
        A0();
        B0();
        if (this.f == null) {
            A0();
            B0();
            w3h w3hVar = (w3h) this.b;
            c2h c2hVar = w3hVar.e;
            w3h.f(c2hVar);
            c2hVar.A0();
            boolean z = false;
            Boolean boolValueOf = !c2hVar.E0().contains("use_service") ? null : Boolean.valueOf(c2hVar.E0().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                xzg xzgVarL = ((w3h) this.b).l();
                xzgVarL.B0();
                if (xzgVarL.Z == 1) {
                    z = true;
                } else {
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.Z.a("Checking service availability");
                    qch qchVar = w3hVar.w;
                    w3h.f(qchVar);
                    int iB = bc6.b.b(((w3h) qchVar.b).a, 12451000);
                    if (iB == 0) {
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.Z.a("Service available");
                    } else if (iB == 1) {
                        w0h w0hVar3 = w3hVar.f;
                        w3h.h(w0hVar3);
                        w0hVar3.Z.a("Service missing");
                    } else if (iB != 2) {
                        if (iB != 3) {
                            w0h w0hVar4 = w3hVar.f;
                            if (iB == 9) {
                                w3h.h(w0hVar4);
                                w0hVar4.x.a("Service invalid");
                            } else if (iB != 18) {
                                w3h.h(w0hVar4);
                                w0hVar4.x.b(Integer.valueOf(iB), "Unexpected service status");
                            } else {
                                w3h.h(w0hVar4);
                                w0hVar4.x.a("Service updating");
                            }
                        } else {
                            w0h w0hVar5 = w3hVar.f;
                            w3h.h(w0hVar5);
                            w0hVar5.x.a("Service disabled");
                        }
                        z2 = false;
                    } else {
                        w0h w0hVar6 = w3hVar.f;
                        w3h.h(w0hVar6);
                        w0hVar6.Y.a("Service container out of date");
                        qch qchVar2 = w3hVar.w;
                        w3h.f(qchVar2);
                        if (qchVar2.m1() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && w3hVar.d.D0()) {
                    w0h w0hVar7 = w3hVar.f;
                    w3h.h(w0hVar7);
                    w0hVar7.g.a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    c2h c2hVar2 = w3hVar.e;
                    w3h.f(c2hVar2);
                    c2hVar2.A0();
                    SharedPreferences.Editor editorEdit = c2hVar2.E0().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.f = Boolean.valueOf(z2);
        }
        return this.f.booleanValue();
    }

    public final void I0() {
        A0();
        B0();
        gah gahVar = this.d;
        if (gahVar.b != null && (gahVar.b.p() || gahVar.b.q())) {
            gahVar.b.c();
        }
        gahVar.b = null;
        try {
            jk2.b().c(((w3h) this.b).a, gahVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.e = null;
    }

    public final boolean J0() {
        A0();
        B0();
        if (!H0()) {
            return true;
        }
        qch qchVar = ((w3h) this.b).w;
        w3h.f(qchVar);
        return qchVar.m1() >= ((Integer) bzg.J0.a(null)).intValue();
    }

    public final boolean K0() {
        A0();
        B0();
        if (!H0()) {
            return true;
        }
        qch qchVar = ((w3h) this.b).w;
        w3h.f(qchVar);
        return qchVar.m1() >= 241200;
    }

    public final void L0(ComponentName componentName) {
        A0();
        if (this.e != null) {
            this.e = null;
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.Z.b(componentName, "Disconnected from device MeasurementService");
            A0();
            G0();
        }
    }

    public final void M0() {
        ((w3h) this.b).getClass();
    }

    public final void N0() {
        A0();
        d82 d82Var = this.w;
        d82Var.getClass();
        d82Var.b = SystemClock.elapsedRealtime();
        qqg qqgVar = ((w3h) this.b).d;
        this.g.b(((Long) bzg.Y.a(null)).longValue());
    }

    public final void O0(Runnable runnable) {
        A0();
        if (R0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.x;
        long size = arrayList.size();
        w3h w3hVar = (w3h) this.b;
        qqg qqgVar = w3hVar.d;
        if (size >= 1000) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.y.b(60000L);
            G0();
        }
    }

    public final void P0() {
        A0();
        w3h w3hVar = (w3h) this.b;
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        tz0 tz0Var = w0hVar.Z;
        ArrayList arrayList = this.x;
        tz0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.g.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.y.c();
    }

    public final ndh Q0(boolean z) {
        long jAbs;
        Pair pair;
        w3h w3hVar = (w3h) this.b;
        w3hVar.getClass();
        xzg xzgVarL = w3hVar.l();
        String strM = null;
        if (z) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w3h w3hVar2 = (w3h) w0hVar.b;
            c2h c2hVar = w3hVar2.e;
            w3h.f(c2hVar);
            if (c2hVar.f != null) {
                c2h c2hVar2 = w3hVar2.e;
                w3h.f(c2hVar2);
                zy1 zy1Var = c2hVar2.f;
                c2h c2hVar3 = (c2h) zy1Var.c;
                c2hVar3.A0();
                c2hVar3.A0();
                long j = ((c2h) zy1Var.c).E0().getLong("health_monitor:start", 0L);
                if (j == 0) {
                    zy1Var.z();
                    jAbs = 0;
                } else {
                    ((w3h) c2hVar3.b).y.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = zy1Var.b;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    zy1Var.z();
                    pair = null;
                } else {
                    String string = c2hVar3.E0().getString("health_monitor:value", null);
                    long j3 = c2hVar3.E0().getLong("health_monitor:count", 0L);
                    zy1Var.z();
                    pair = (string == null || j3 <= 0) ? c2h.P0 : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != c2h.P0) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strM = ib8.m(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return xzgVarL.E0(strM);
    }

    public final boolean R0() {
        A0();
        B0();
        return this.e != null;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x0439 A[Catch: all -> 0x0475, TRY_ENTER, TryCatch #51 {all -> 0x0475, blocks: (B:268:0x0465, B:258:0x0439, B:260:0x043f, B:261:0x0442, B:278:0x0486, B:207:0x0370, B:209:0x037a, B:214:0x038b), top: B:396:0x0465 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0451  */
    /* JADX WARN: Code duplicated, block: B:271:0x046c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0471 A[PHI: r4 r6 r23 r24 r26 r36 r37
  0x0471: PHI (r4v15 android.database.sqlite.SQLiteDatabase) = 
  (r4v12 android.database.sqlite.SQLiteDatabase)
  (r4v13 android.database.sqlite.SQLiteDatabase)
  (r4v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x0495  */
    /* JADX WARN: Code duplicated, block: B:285:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:287:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:300:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:302:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:304:0x0504  */
    /* JADX WARN: Code duplicated, block: B:305:0x058e  */
    /* JADX WARN: Code duplicated, block: B:316:0x05bb A[Catch: RemoteException -> 0x05ea, TRY_LEAVE, TryCatch #45 {RemoteException -> 0x05ea, blocks: (B:314:0x05b0, B:316:0x05bb), top: B:392:0x05b0 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:338:0x0626  */
    /* JADX WARN: Code duplicated, block: B:340:0x062a  */
    /* JADX WARN: Code duplicated, block: B:342:0x064b  */
    /* JADX WARN: Code duplicated, block: B:348:0x066a  */
    /* JADX WARN: Code duplicated, block: B:354:0x0682  */
    /* JADX WARN: Code duplicated, block: B:362:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:384:0x0657 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x066e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0596 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x049b A[SYNTHETIC] */
    public final void S0(hzg hzgVar, v4 v4Var, ndh ndhVar) throws Throwable {
        ArrayList arrayList;
        w3h w3hVar;
        Context context;
        w0h w0hVar;
        int i;
        SQLiteDatabase sQLiteDatabaseG0;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        esg esgVarCreateFromParcel;
        int i5;
        wog wogVarCreateFromParcel;
        mch mchVarCreateFromParcel;
        int size;
        int size2;
        int i6;
        b0h b0hVar;
        v4 v4Var2;
        azg azgVar;
        w3h w3hVar2;
        Context context2;
        w0h w0hVar2;
        long jElapsedRealtime;
        long j3;
        psd psdVar;
        long jCurrentTimeMillis;
        psd psdVar2;
        String str2;
        A0();
        B0();
        M0();
        w3h w3hVar3 = (w3h) this.b;
        qqg qqgVar = w3hVar3.d;
        Context context3 = w3hVar3.a;
        qqg qqgVar2 = w3hVar3.d;
        w0h w0hVar3 = w3hVar3.f;
        hj6 hj6Var = w3hVar3.y;
        int i7 = 100;
        ndh ndhVar2 = ndhVar;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i9 == i7; i9 = size) {
            ArrayList arrayList2 = new ArrayList();
            f0h f0hVarI = w3hVar3.i();
            String str3 = "entry";
            int i10 = i7;
            String str4 = "type";
            String str5 = "rowid";
            hj6 hj6Var2 = hj6Var;
            w3h w3hVar4 = (w3h) f0hVarI.b;
            f0hVarI.A0();
            int i11 = i8;
            if (f0hVarI.e) {
                w3hVar = w3hVar3;
                context = context3;
                w0hVar = w0hVar3;
            } else {
                arrayList = new ArrayList();
                w3hVar = w3hVar3;
                if (((w3h) f0hVarI.b).a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i12 = 5;
                    context = context3;
                    w0hVar = w0hVar3;
                    int i13 = 0;
                    int i14 = 5;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                sQLiteDatabaseG0 = f0hVarI.G0();
                                if (sQLiteDatabaseG0 == null) {
                                    try {
                                        try {
                                            f0hVarI.e = true;
                                        } catch (SQLiteDatabaseLockedException unused) {
                                            i2 = i13;
                                            str5 = str5;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            try {
                                                SystemClock.sleep(i14);
                                                i14 += 20;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabaseG0 != null) {
                                                    sQLiteDatabaseG0.close();
                                                }
                                                i13 = i2 + 1;
                                                i12 = i3;
                                                str4 = str4;
                                                str3 = str3;
                                                str5 = str5;
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabaseG0 != null) {
                                                    sQLiteDatabaseG0.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            i2 = i13;
                                            str5 = str5;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            w0h w0hVar4 = w3hVar4.f;
                                            w3h.h(w0hVar4);
                                            w0hVar4.g.b(e, "Error reading entries from local database");
                                            f0hVarI.e = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseG0 != null) {
                                                sQLiteDatabaseG0.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            i2 = i13;
                                            str5 = str5;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            if (sQLiteDatabaseG0 != null) {
                                                sQLiteDatabaseG0.endTransaction();
                                            }
                                            w0h w0hVar5 = w3hVar4.f;
                                            w3h.h(w0hVar5);
                                            w0hVar5.g.b(e, "Error reading entries from local database");
                                            f0hVarI.e = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseG0 != null) {
                                                sQLiteDatabaseG0.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseG0 != null) {
                                            sQLiteDatabaseG0.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    sQLiteDatabaseG0.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseG0.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j4 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i13;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseG0 != null) {
                                                            sQLiteDatabaseG0.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        w0h w0hVar6 = w3hVar4.f;
                                                        w3h.h(w0hVar6);
                                                        w0hVar6.g.b(e, "Error reading entries from local database");
                                                        f0hVarI.e = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseG0 != null) {
                                                            sQLiteDatabaseG0.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseG0 != null && sQLiteDatabaseG0.inTransaction()) {
                                                            sQLiteDatabaseG0.endTransaction();
                                                        }
                                                        w0h w0hVar7 = w3hVar4.f;
                                                        w3h.h(w0hVar7);
                                                        w0hVar7.g.b(e, "Error reading entries from local database");
                                                        f0hVarI.e = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseG0 != null) {
                                                            sQLiteDatabaseG0.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseG0 != null) {
                                                                sQLiteDatabaseG0.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            w0h w0hVar8 = w3hVar4.f;
                                                            w3h.h(w0hVar8);
                                                            w0hVar8.g.b(e, "Error reading entries from local database");
                                                            f0hVarI.e = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseG0 != null) {
                                                                sQLiteDatabaseG0.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseG0 != null) {
                                                                sQLiteDatabaseG0.endTransaction();
                                                            }
                                                            w0h w0hVar9 = w3hVar4.f;
                                                            w3h.h(w0hVar9);
                                                            w0hVar9.g.b(e, "Error reading entries from local database");
                                                            f0hVarI.e = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseG0 != null) {
                                                                sQLiteDatabaseG0.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseG0 != null) {
                                                                sQLiteDatabaseG0.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i13;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                qqg qqgVar3 = w3hVar4.d;
                                                azg azgVar2 = bzg.W0;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i15 = 4;
                                                        int i16 = 3;
                                                        if (qqgVar3.L0(null, azgVar2)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseG0 != null) {
                                                                    sQLiteDatabaseG0.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                w0h w0hVar10 = w3hVar4.f;
                                                                w3h.h(w0hVar10);
                                                                w0hVar10.g.b(e, "Error reading entries from local database");
                                                                f0hVarI.e = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseG0 != null) {
                                                                    sQLiteDatabaseG0.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseG0 != null) {
                                                                    sQLiteDatabaseG0.endTransaction();
                                                                }
                                                                w0h w0hVar11 = w3hVar4.f;
                                                                w3h.h(w0hVar11);
                                                                w0hVar11.g.b(e, "Error reading entries from local database");
                                                                f0hVarI.e = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseG0 != null) {
                                                                    sQLiteDatabaseG0.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseG0.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j4 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i17 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (w3hVar4.d.L0(null, azgVar2)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i16);
                                                                                                j2 = cursorQuery.getLong(i15);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseG0 != null) {
                                                                                                    sQLiteDatabaseG0.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                i3 = 5;
                                                                                                w0h w0hVar12 = w3hVar4.f;
                                                                                                w3h.h(w0hVar12);
                                                                                                w0hVar12.g.b(e, "Error reading entries from local database");
                                                                                                f0hVarI.e = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseG0 != null) {
                                                                                                    sQLiteDatabaseG0.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseG0 != null) {
                                                                                                    sQLiteDatabaseG0.endTransaction();
                                                                                                }
                                                                                                w0h w0hVar13 = w3hVar4.f;
                                                                                                w3h.h(w0hVar13);
                                                                                                w0hVar13.g.b(e, "Error reading entries from local database");
                                                                                                f0hVarI.e = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseG0 != null) {
                                                                                                    sQLiteDatabaseG0.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i17 == 0) {
                                                                                            cursorQuery = cursorQuery;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            hsg hsgVarCreateFromParcel = hsg.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (hsgVarCreateFromParcel != null) {
                                                                                                                arrayList.add(new b0h(hsgVarCreateFromParcel, string, j2));
                                                                                                            }
                                                                                                        } catch (Throwable th5) {
                                                                                                            parcelObtain.recycle();
                                                                                                            throw th5;
                                                                                                        }
                                                                                                    } catch (fcc unused6) {
                                                                                                        w0h w0hVar14 = w3hVar4.f;
                                                                                                        w3h.h(w0hVar14);
                                                                                                        w0hVar14.g.a("Failed to load event from local database");
                                                                                                        parcelObtain.recycle();
                                                                                                    }
                                                                                                } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                    sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                    i3 = 5;
                                                                                                    SystemClock.sleep(i14);
                                                                                                    i14 += 20;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseG0 != null) {
                                                                                                        sQLiteDatabaseG0.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteFullException e11) {
                                                                                                    e = e11;
                                                                                                    sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                    i3 = 5;
                                                                                                    w0h w0hVar15 = w3hVar4.f;
                                                                                                    w3h.h(w0hVar15);
                                                                                                    w0hVar15.g.b(e, "Error reading entries from local database");
                                                                                                    f0hVarI.e = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseG0 != null) {
                                                                                                        sQLiteDatabaseG0.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteException e12) {
                                                                                                    e = e12;
                                                                                                    sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                    i3 = 5;
                                                                                                    if (sQLiteDatabaseG0 != null) {
                                                                                                        sQLiteDatabaseG0.endTransaction();
                                                                                                    }
                                                                                                    w0h w0hVar16 = w3hVar4.f;
                                                                                                    w3h.h(w0hVar16);
                                                                                                    w0hVar16.g.b(e, "Error reading entries from local database");
                                                                                                    f0hVarI.e = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseG0 != null) {
                                                                                                        sQLiteDatabaseG0.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                }
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                                sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                cursor = cursorQuery;
                                                                                                if (cursor != null) {
                                                                                                    cursor.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseG0 != null) {
                                                                                                    sQLiteDatabaseG0.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } else {
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i17 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        mchVarCreateFromParcel = mch.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (fcc unused8) {
                                                                                                        w0h w0hVar17 = w3hVar4.f;
                                                                                                        w3h.h(w0hVar17);
                                                                                                        w0hVar17.g.a("Failed to load user property from local database");
                                                                                                        parcelObtain2.recycle();
                                                                                                        mchVarCreateFromParcel = null;
                                                                                                    }
                                                                                                    if (mchVarCreateFromParcel != null) {
                                                                                                        arrayList.add(new b0h(mchVarCreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } catch (Throwable th7) {
                                                                                                    parcelObtain2.recycle();
                                                                                                    throw th7;
                                                                                                }
                                                                                            } else {
                                                                                                if (i17 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            wogVarCreateFromParcel = wog.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (Throwable th8) {
                                                                                                            parcelObtain3.recycle();
                                                                                                            throw th8;
                                                                                                        }
                                                                                                    } catch (fcc unused9) {
                                                                                                        w0h w0hVar18 = w3hVar4.f;
                                                                                                        w3h.h(w0hVar18);
                                                                                                        w0hVar18.g.a("Failed to load conditional user property from local database");
                                                                                                        parcelObtain3.recycle();
                                                                                                        wogVarCreateFromParcel = null;
                                                                                                    }
                                                                                                    if (wogVarCreateFromParcel != null) {
                                                                                                        arrayList.add(new b0h(wogVarCreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } else if (i17 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    esgVarCreateFromParcel = esg.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i14);
                                                                                                                        i14 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseG0 != null) {
                                                                                                                            sQLiteDatabaseG0.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e13) {
                                                                                                                        e = e13;
                                                                                                                        sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                                        i3 = 5;
                                                                                                                        w0h w0hVar19 = w3hVar4.f;
                                                                                                                        w3h.h(w0hVar19);
                                                                                                                        w0hVar19.g.b(e, "Error reading entries from local database");
                                                                                                                        f0hVarI.e = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseG0 != null) {
                                                                                                                            sQLiteDatabaseG0.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseG0 != null) {
                                                                                                                            sQLiteDatabaseG0.endTransaction();
                                                                                                                        }
                                                                                                                        w0h w0hVar110 = w3hVar4.f;
                                                                                                                        w3h.h(w0hVar110);
                                                                                                                        w0hVar110.g.b(e, "Error reading entries from local database");
                                                                                                                        f0hVarI.e = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseG0 != null) {
                                                                                                                            sQLiteDatabaseG0.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (Throwable th9) {
                                                                                                                    th = th9;
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (fcc unused11) {
                                                                                                                w0h w0hVar20 = w3hVar4.f;
                                                                                                                w3h.h(w0hVar20);
                                                                                                                w0hVar20.g.a("Failed to load default event parameters from local database");
                                                                                                                parcelObtain4.recycle();
                                                                                                                esgVarCreateFromParcel = null;
                                                                                                            }
                                                                                                        } catch (fcc unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                        if (esgVarCreateFromParcel != null) {
                                                                                                            arrayList.add(new b0h(esgVarCreateFromParcel, string, j2));
                                                                                                        }
                                                                                                        i5 = 3;
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i14);
                                                                                                        i14 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseG0 != null) {
                                                                                                            sQLiteDatabaseG0.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                        e = e15;
                                                                                                        sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                        i3 = 5;
                                                                                                        w0h w0hVar111 = w3hVar4.f;
                                                                                                        w3h.h(w0hVar111);
                                                                                                        w0hVar111.g.b(e, "Error reading entries from local database");
                                                                                                        f0hVarI.e = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseG0 != null) {
                                                                                                            sQLiteDatabaseG0.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e16) {
                                                                                                        e = e16;
                                                                                                        sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseG0 != null) {
                                                                                                            sQLiteDatabaseG0.endTransaction();
                                                                                                        }
                                                                                                        w0h w0hVar112 = w3hVar4.f;
                                                                                                        w3h.h(w0hVar112);
                                                                                                        w0hVar112.g.b(e, "Error reading entries from local database");
                                                                                                        f0hVarI.e = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseG0 != null) {
                                                                                                            sQLiteDatabaseG0.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    w0h w0hVar21 = w3hVar4.f;
                                                                                                    i5 = 3;
                                                                                                    if (i17 == 3) {
                                                                                                        w3h.h(w0hVar21);
                                                                                                        w0hVar21.Z.a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        w3h.h(w0hVar21);
                                                                                                        w0hVar21.g.a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i16 = i5;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                azgVar2 = azgVar2;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i15 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i16 = i5;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        azgVar2 = azgVar2;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i15 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i14);
                                                                                    i14 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseG0 != null) {
                                                                                        sQLiteDatabaseG0.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e19) {
                                                                                    e = e19;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                    i3 = 5;
                                                                                    w0h w0hVar113 = w3hVar4.f;
                                                                                    w3h.h(w0hVar113);
                                                                                    w0hVar113.g.b(e, "Error reading entries from local database");
                                                                                    f0hVarI.e = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseG0 != null) {
                                                                                        sQLiteDatabaseG0.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e20) {
                                                                                    e = e20;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseG0 != null) {
                                                                                        sQLiteDatabaseG0.endTransaction();
                                                                                    }
                                                                                    w0h w0hVar114 = w3hVar4.f;
                                                                                    w3h.h(w0hVar114);
                                                                                    w0hVar114.g.b(e, "Error reading entries from local database");
                                                                                    f0hVarI.e = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseG0 != null) {
                                                                                        sQLiteDatabaseG0.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e21) {
                                                                                e = e21;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e22) {
                                                                                e = e22;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e23) {
                                                                            e = e23;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused18) {
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteFullException e25) {
                                                                        e = e25;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteException e26) {
                                                                        e = e26;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    cursorQuery = cursorQuery;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i = 0;
                                                            sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                            try {
                                                                if (sQLiteDatabaseG0.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                    w0h w0hVar22 = w3hVar4.f;
                                                                    w3h.h(w0hVar22);
                                                                    w0hVar22.g.a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseG0.setTransactionSuccessful();
                                                                sQLiteDatabaseG0.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseG0.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseG0 != null) {
                                                                    sQLiteDatabaseG0.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e27) {
                                                                e = e27;
                                                                i3 = 5;
                                                                w0h w0hVar115 = w3hVar4.f;
                                                                w3h.h(w0hVar115);
                                                                w0hVar115.g.b(e, "Error reading entries from local database");
                                                                f0hVarI.e = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseG0 != null) {
                                                                    sQLiteDatabaseG0.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e28) {
                                                                e = e28;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseG0 != null) {
                                                                    sQLiteDatabaseG0.endTransaction();
                                                                }
                                                                w0h w0hVar116 = w3hVar4.f;
                                                                w3h.h(w0hVar116);
                                                                w0hVar116.g.b(e, "Error reading entries from local database");
                                                                f0hVarI.e = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseG0 != null) {
                                                                    sQLiteDatabaseG0.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                            str4 = str4;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseG0 != null) {
                                                                sQLiteDatabaseG0.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteFullException e29) {
                                                        e = e29;
                                                        str3 = str3;
                                                        sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        w0h w0hVar117 = w3hVar4.f;
                                                        w3h.h(w0hVar117);
                                                        w0hVar117.g.b(e, "Error reading entries from local database");
                                                        f0hVarI.e = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseG0 != null) {
                                                            sQLiteDatabaseG0.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e30) {
                                                        e = e30;
                                                        str3 = str3;
                                                        sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseG0 != null) {
                                                            sQLiteDatabaseG0.endTransaction();
                                                        }
                                                        w0h w0hVar118 = w3hVar4.f;
                                                        w3h.h(w0hVar118);
                                                        w0hVar118.g.b(e, "Error reading entries from local database");
                                                        f0hVarI.e = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseG0 != null) {
                                                            sQLiteDatabaseG0.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    str3 = str3;
                                                    sQLiteDatabaseG0 = sQLiteDatabaseG0;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    SystemClock.sleep(i14);
                                                    i14 += 20;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseG0 != null) {
                                                        sQLiteDatabaseG0.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e31) {
                                                e = e31;
                                                str5 = str5;
                                            } catch (SQLiteException e32) {
                                                e = e32;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i2 = i13;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i2 = i13;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseG0 = null;
                            } catch (SQLiteFullException e33) {
                                e = e33;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseG0 = null;
                            } catch (SQLiteException e34) {
                                e = e34;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseG0 = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseG0 = null;
                            }
                        } else {
                            i = 0;
                            w0h w0hVar23 = w3hVar4.f;
                            w3h.h(w0hVar23);
                            w0hVar23.x.a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i13 = i2 + 1;
                        i12 = i3;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    w0hVar = w0hVar3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (v4Var != null && size < i10) {
                    arrayList2.add(new b0h(v4Var, ndhVar2.c, ndhVar2.x));
                }
                size2 = arrayList2.size();
                i6 = i;
                while (i6 < size2) {
                    b0hVar = (b0h) arrayList2.get(i6);
                    v4Var2 = b0hVar.a;
                    azgVar = bzg.W0;
                    if (qqgVar2.L0(null, azgVar)) {
                        str2 = b0hVar.b;
                        if (!TextUtils.isEmpty(str2)) {
                            ndhVar2 = new ndh(ndhVar2.a, ndhVar2.b, str2, b0hVar.c, ndhVar2.d, ndhVar2.e, ndhVar2.f, ndhVar2.g, ndhVar2.v, ndhVar2.w, ndhVar2.y, ndhVar2.z, ndhVar2.X, ndhVar2.Y, ndhVar2.Z, ndhVar2.E0, ndhVar2.F0, ndhVar2.G0, ndhVar2.H0, ndhVar2.I0, ndhVar2.J0, ndhVar2.K0, ndhVar2.L0, ndhVar2.M0, ndhVar2.N0, ndhVar2.O0, ndhVar2.P0, ndhVar2.Q0, ndhVar2.R0, ndhVar2.S0, ndhVar2.T0, ndhVar2.U0);
                        }
                    }
                    if (v4Var2 instanceof hsg) {
                        try {
                            hj6Var2.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                hj6Var2.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        hzgVar.D((hsg) v4Var2, ndhVar2);
                                        w3h.h(w0hVar);
                                        w0hVar2 = w0hVar;
                                        try {
                                            w0hVar2.Z.a("Logging telemetry for logEvent from database");
                                            psdVar2 = psd.f;
                                            if (psdVar2 == null) {
                                                w3hVar2 = w3hVar;
                                                context2 = context;
                                                try {
                                                    psdVar2 = new psd(context2, w3hVar2);
                                                    psd.f = psdVar2;
                                                } catch (RemoteException e35) {
                                                    e = e35;
                                                    j3 = jCurrentTimeMillis;
                                                    w3h.h(w0hVar2);
                                                    w0hVar2.g.b(e, "Failed to send event to the service");
                                                    if (j3 != 0) {
                                                        psdVar = psd.f;
                                                        if (psdVar == null) {
                                                            psdVar = new psd(context2, w3hVar2);
                                                            psd.f = psdVar;
                                                        }
                                                        hj6Var2.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        hj6Var2.getClass();
                                                        psdVar.F(j3, 13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                w3hVar2 = w3hVar;
                                                context2 = context;
                                            }
                                            psd psdVar3 = psdVar2;
                                            hj6Var2.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            hj6Var2.getClass();
                                            psdVar3.F(jCurrentTimeMillis, 0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis3);
                                        } catch (RemoteException e36) {
                                            e = e36;
                                            w3hVar2 = w3hVar;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e37) {
                                        e = e37;
                                        w3hVar2 = w3hVar;
                                        context2 = context;
                                        w0hVar2 = w0hVar;
                                        j3 = jCurrentTimeMillis;
                                        w3h.h(w0hVar2);
                                        w0hVar2.g.b(e, "Failed to send event to the service");
                                        if (j3 != 0) {
                                            psdVar = psd.f;
                                            if (psdVar == null) {
                                                psdVar = new psd(context2, w3hVar2);
                                                psd.f = psdVar;
                                            }
                                            hj6Var2.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            hj6Var2.getClass();
                                            psdVar.F(j3, 13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis4);
                                        }
                                        i6++;
                                        w0hVar = w0hVar2;
                                        w3hVar = w3hVar2;
                                        context = context2;
                                        size = size;
                                    }
                                } catch (RemoteException e38) {
                                    e = e38;
                                }
                            } catch (RemoteException e39) {
                                e = e39;
                                w3hVar2 = w3hVar;
                                context2 = context;
                                w0hVar2 = w0hVar;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e40) {
                            e = e40;
                            w3hVar2 = w3hVar;
                            context2 = context;
                            w0hVar2 = w0hVar;
                            jElapsedRealtime = 0;
                            j3 = 0;
                        }
                    } else {
                        w3hVar2 = w3hVar;
                        context2 = context;
                        w0hVar2 = w0hVar;
                        if (v4Var2 instanceof mch) {
                            try {
                                hzgVar.n((mch) v4Var2, ndhVar2);
                            } catch (RemoteException e41) {
                                w3h.h(w0hVar2);
                                w0hVar2.g.b(e41, "Failed to send user property to the service");
                            }
                        } else {
                            if (v4Var2 instanceof wog) {
                                try {
                                    hzgVar.z((wog) v4Var2, ndhVar2);
                                } catch (RemoteException e42) {
                                    w3h.h(w0hVar2);
                                    w0hVar2.g.b(e42, "Failed to send conditional user property to the service");
                                }
                            } else if (qqgVar2.L0(null, azgVar) || !(v4Var2 instanceof esg)) {
                                w3h.h(w0hVar2);
                                w0hVar2.g.a("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    hzgVar.B(((esg) v4Var2).f(), ndhVar2);
                                } catch (RemoteException e43) {
                                    w3h.h(w0hVar2);
                                    w0hVar2.g.b(e43, "Failed to send default event parameters to the service");
                                }
                            }
                            i6++;
                            w0hVar = w0hVar2;
                            w3hVar = w3hVar2;
                            context = context2;
                            size = size;
                        }
                    }
                    i6++;
                    w0hVar = w0hVar2;
                    w3hVar = w3hVar2;
                    context = context2;
                    size = size;
                }
                w0hVar3 = w0hVar;
                w3hVar3 = w3hVar;
                context3 = context;
                hj6Var = hj6Var2;
                i7 = 100;
                i8 = i11 + 1;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (v4Var != null) {
                arrayList2.add(new b0h(v4Var, ndhVar2.c, ndhVar2.x));
            }
            size2 = arrayList2.size();
            i6 = i;
            while (i6 < size2) {
                b0hVar = (b0h) arrayList2.get(i6);
                v4Var2 = b0hVar.a;
                azgVar = bzg.W0;
                if (qqgVar2.L0(null, azgVar)) {
                    str2 = b0hVar.b;
                    if (!TextUtils.isEmpty(str2)) {
                        ndhVar2 = new ndh(ndhVar2.a, ndhVar2.b, str2, b0hVar.c, ndhVar2.d, ndhVar2.e, ndhVar2.f, ndhVar2.g, ndhVar2.v, ndhVar2.w, ndhVar2.y, ndhVar2.z, ndhVar2.X, ndhVar2.Y, ndhVar2.Z, ndhVar2.E0, ndhVar2.F0, ndhVar2.G0, ndhVar2.H0, ndhVar2.I0, ndhVar2.J0, ndhVar2.K0, ndhVar2.L0, ndhVar2.M0, ndhVar2.N0, ndhVar2.O0, ndhVar2.P0, ndhVar2.Q0, ndhVar2.R0, ndhVar2.S0, ndhVar2.T0, ndhVar2.U0);
                    }
                }
                if (v4Var2 instanceof hsg) {
                    hj6Var2.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    hj6Var2.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    hzgVar.D((hsg) v4Var2, ndhVar2);
                    w3h.h(w0hVar);
                    w0hVar2 = w0hVar;
                    w0hVar2.Z.a("Logging telemetry for logEvent from database");
                    psdVar2 = psd.f;
                    if (psdVar2 == null) {
                        w3hVar2 = w3hVar;
                        context2 = context;
                        psdVar2 = new psd(context2, w3hVar2);
                        psd.f = psdVar2;
                    } else {
                        w3hVar2 = w3hVar;
                        context2 = context;
                    }
                    psd psdVar4 = psdVar2;
                    hj6Var2.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    hj6Var2.getClass();
                    psdVar4.F(jCurrentTimeMillis, 0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis5);
                } else {
                    w3hVar2 = w3hVar;
                    context2 = context;
                    w0hVar2 = w0hVar;
                    if (v4Var2 instanceof mch) {
                        hzgVar.n((mch) v4Var2, ndhVar2);
                    } else {
                        if (v4Var2 instanceof wog) {
                            hzgVar.z((wog) v4Var2, ndhVar2);
                        } else if (qqgVar2.L0(null, azgVar)) {
                            w3h.h(w0hVar2);
                            w0hVar2.g.a("Discarding data. Unrecognized parcel type.");
                        } else {
                            w3h.h(w0hVar2);
                            w0hVar2.g.a("Discarding data. Unrecognized parcel type.");
                        }
                        i6++;
                        w0hVar = w0hVar2;
                        w3hVar = w3hVar2;
                        context = context2;
                        size = size;
                    }
                }
                i6++;
                w0hVar = w0hVar2;
                w3hVar = w3hVar2;
                context = context2;
                size = size;
            }
            w0hVar3 = w0hVar;
            w3hVar3 = w3hVar;
            context3 = context;
            hj6Var = hj6Var2;
            i7 = 100;
            i8 = i11 + 1;
        }
    }

    public final void T0(wog wogVar) {
        boolean zH0;
        A0();
        B0();
        w3h w3hVar = (w3h) this.b;
        w3hVar.getClass();
        f0h f0hVarI = w3hVar.i();
        w3h w3hVar2 = (w3h) f0hVarI.b;
        w3h.f(w3hVar2.w);
        byte[] bArrK1 = qch.k1(wogVar);
        if (bArrK1.length > 131072) {
            w0h w0hVar = w3hVar2.f;
            w3h.h(w0hVar);
            w0hVar.v.a("Conditional user property too long for local database. Sending directly to service");
            zH0 = false;
        } else {
            zH0 = f0hVarI.H0(bArrK1, 2);
        }
        O0(new gzg(this, Q0(true), zH0, new wog(wogVar)));
    }
}
