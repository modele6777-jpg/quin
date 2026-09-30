package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import io.sentry.a7;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.b;
import io.sentry.android.core.b1;
import io.sentry.android.core.c;
import io.sentry.android.core.d;
import io.sentry.android.core.e;
import io.sentry.android.core.internal.gestures.g;
import io.sentry.b7;
import io.sentry.c4;
import io.sentry.c7;
import io.sentry.d4;
import io.sentry.d7;
import io.sentry.e1;
import io.sentry.f7;
import io.sentry.hints.a;
import io.sentry.i5;
import io.sentry.l0;
import io.sentry.o;
import io.sentry.protocol.n;
import io.sentry.protocol.r;
import io.sentry.protocol.w;
import io.sentry.q1;
import io.sentry.q5;
import io.sentry.x4;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gi2 implements yn2, zbe, xt3, na1, kn9, u8c, c4, f7, d4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gi2(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.kn9
    public void a(Object obj) {
        kxa kxaVar = (kxa) this.b;
        Task task = (Task) this.c;
        CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = (CrashlyticsRemoteConfigListener) this.d;
        try {
            yh2 yh2Var = (yh2) task.i();
            if (yh2Var != null) {
                ((Executor) kxaVar.c).execute(new l5c(crashlyticsRemoteConfigListener, ((lqb) kxaVar.b).i(yh2Var), 0));
            }
        } catch (jg5 e) {
            b1.n("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048 A[PHI: r14
  0x0048: PHI (r14v13 ve8) = (r14v6 ve8), (r14v8 ve8), (r14v9 ve8), (r14v10 ve8), (r14v11 ve8) binds: [B:11:0x0046, B:17:0x0058, B:20:0x0061, B:23:0x006a, B:26:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.u8c
    public Object apply(Object obj) {
        w8c w8cVar;
        String str;
        int i;
        long jInsert;
        int i2 = this.a;
        String str2 = "bytes";
        int i3 = 2;
        ve8 ve8Var = ve8.CACHE_FULL;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i4 = 0;
        w8c w8cVar2 = (w8c) this.b;
        switch (i2) {
            case 9:
                ArrayList arrayList = (ArrayList) obj3;
                qq0 qq0Var = (qq0) obj2;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(i4);
                    int i5 = cursor.getInt(7) != 0 ? 1 : i4;
                    wo0 wo0Var = new wo0();
                    wo0Var.w = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        r82.g("Null transportName");
                        return null;
                    }
                    wo0Var.b = string;
                    wo0Var.g = Long.valueOf(cursor.getLong(i3));
                    wo0Var.v = Long.valueOf(cursor.getLong(3));
                    if (i5 != 0) {
                        String string2 = cursor.getString(4);
                        wo0Var.f = new cv4(string2 == null ? w8c.f : new jv4(string2), cursor.getBlob(5));
                        w8cVar = w8cVar2;
                        str = str2;
                        i = i4;
                    } else {
                        String string3 = cursor.getString(4);
                        jv4 jv4Var = string3 == null ? w8c.f : new jv4(string3);
                        Cursor cursorQuery = w8cVar2.b().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = i4;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(i4);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int i6 = i4;
                            int length2 = i6;
                            while (i6 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i6);
                                w8c w8cVar3 = w8cVar2;
                                String str3 = str2;
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                                i6++;
                                w8cVar2 = w8cVar3;
                                str2 = str3;
                            }
                            w8cVar = w8cVar2;
                            str = str2;
                            i = 0;
                            cursorQuery.close();
                            wo0Var.f = new cv4(jv4Var, bArr);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        wo0Var.d = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        wo0Var.e = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        wo0Var.c = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        wo0Var.x = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        wo0Var.y = cursor.getBlob(11);
                    }
                    arrayList.add(new tp0(j, qq0Var, wo0Var.c()));
                    i4 = i;
                    w8cVar2 = w8cVar;
                    str2 = str;
                    i3 = 2;
                }
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                xo0 xo0Var = (xo0) obj3;
                cv4 cv4Var = xo0Var.c;
                String str4 = xo0Var.a;
                qq0 qq0Var2 = (qq0) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = w8cVar2.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * w8cVar2.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                yo0 yo0Var = w8cVar2.d;
                if (jSimpleQueryForLong >= yo0Var.a) {
                    w8cVar2.x(1L, ve8Var, str4);
                    return -1L;
                }
                Long lH = w8c.h(sQLiteDatabase, qq0Var2);
                if (lH != null) {
                    jInsert = lH.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", qq0Var2.a);
                    contentValues.put("priority", Integer.valueOf(mua.a(qq0Var2.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = qq0Var2.b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i7 = yo0Var.e;
                byte[] bArr4 = cv4Var.b;
                boolean z = bArr4.length <= i7;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(xo0Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(xo0Var.e));
                contentValues2.put("payload_encoding", cv4Var.a.a);
                contentValues2.put("code", xo0Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr4 : new byte[0]);
                contentValues2.put("product_id", xo0Var.g);
                contentValues2.put("pseudonymous_id", xo0Var.h);
                contentValues2.put("experiment_ids_clear_blob", xo0Var.i);
                contentValues2.put("experiment_ids_encrypted_blob", xo0Var.j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr4.length) / ((double) i7));
                    for (int i8 = 1; i8 <= iCeil; i8++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i8 - 1) * i7, Math.min(i8 * i7, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i8));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(xo0Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                HashMap map = (HashMap) obj3;
                szc szcVar = (szc) obj2;
                ArrayList arrayList3 = (ArrayList) szcVar.d;
                Cursor cursor2 = (Cursor) obj;
                w8cVar2.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i9 = cursor2.getInt(1);
                    ve8 ve8Var2 = ve8.REASON_UNKNOWN;
                    if (i9 != ve8Var2.a()) {
                        ve8 ve8Var3 = ve8.MESSAGE_TOO_OLD;
                        if (i9 == ve8Var3.a()) {
                            ve8Var2 = ve8Var3;
                        } else if (i9 == ve8Var.a()) {
                            ve8Var2 = ve8Var;
                        } else {
                            ve8Var3 = ve8.PAYLOAD_TOO_BIG;
                            if (i9 == ve8Var3.a()) {
                                ve8Var2 = ve8Var3;
                            } else {
                                ve8Var3 = ve8.MAX_RETRIES_REACHED;
                                if (i9 == ve8Var3.a()) {
                                    ve8Var2 = ve8Var3;
                                } else {
                                    ve8Var3 = ve8.INVALID_PAYLOD;
                                    if (i9 == ve8Var3.a()) {
                                        ve8Var2 = ve8Var3;
                                    } else {
                                        ve8Var3 = ve8.SERVER_ERROR;
                                        if (i9 == ve8Var3.a()) {
                                            ve8Var2 = ve8Var3;
                                        } else {
                                            g21.I("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i9));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    long j2 = cursor2.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new we8(j2, ve8Var2));
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i10 = ze8.c;
                    new ArrayList();
                    arrayList3.add(new ze8((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jE = w8cVar2.b.e();
                SQLiteDatabase sQLiteDatabaseB = w8cVar2.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        bye byeVar = new bye(cursorRawQuery.getLong(0), jE);
                        cursorRawQuery.close();
                        sQLiteDatabaseB.setTransactionSuccessful();
                        sQLiteDatabaseB.endTransaction();
                        szcVar.c = byeVar;
                        szcVar.e = new lb6(new o2e(w8cVar2.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * w8cVar2.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), yo0.f.a));
                        szcVar.b = (String) w8cVar2.e.get();
                        return new z42((bye) szcVar.c, Collections.unmodifiableList(arrayList3), (lb6) szcVar.e, (String) szcVar.b);
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    sQLiteDatabaseB.endTransaction();
                    throw th3;
                }
        }
    }

    @Override // io.sentry.c4
    public void b(c7 c7Var) {
        ConcurrentHashMap concurrentHashMap;
        x4 x4Var = (x4) this.b;
        i5 i5Var = (i5) this.c;
        l0 l0Var = (l0) this.d;
        if (c7Var == null) {
            x4Var.b.getLogger().i(q5.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strE = null;
        b7 b7Var = i5Var.f() != null ? b7.Crashed : null;
        boolean z = b7.Crashed == b7Var || i5Var.g();
        r rVar = i5Var.d;
        String str = (rVar == null || (concurrentHashMap = rVar.f) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) i5Var.d.f.get("user-agent");
        Object objB = l0Var.b("sentry:typeCheckHint");
        if (objB instanceof a) {
            strE = ((a) objB).e();
            b7Var = b7.Abnormal;
        }
        if (!c7Var.c(b7Var, str, z, strE) || c7Var.g == b7.Ok) {
            return;
        }
        c7Var.b(new Date());
    }

    @Override // io.sentry.d4
    public void c(q1 q1Var) {
        g gVar = (g) this.b;
        e1 e1Var = (e1) this.c;
        q1 q1Var2 = (q1) this.d;
        if (q1Var == null) {
            e1Var.K(q1Var2);
        } else {
            gVar.c.getLogger().i(q5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", q1Var2.getName());
        }
    }

    @Override // io.sentry.f7
    public void d(d7 d7Var) {
        c cVarB;
        a7 a7Var = (a7) this.b;
        f7 f7Var = (f7) this.c;
        AtomicReference atomicReference = (AtomicReference) this.d;
        if (f7Var != null) {
            f7Var.d(d7Var);
        }
        e eVar = a7Var.r.w;
        if (eVar != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) eVar.a;
            WeakReference weakReference = (WeakReference) eVar.b;
            String str = (String) eVar.c;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                d dVar = activityLifecycleIntegration.G0;
                w wVarQ = a7Var.q();
                io.sentry.util.a aVar = dVar.f;
                aVar.b();
                try {
                    if (dVar.c()) {
                        c cVar = null;
                        dVar.d(new b(dVar, activity, 1), null);
                        c cVar2 = (c) dVar.d.remove(activity);
                        if (cVar2 != null && (cVarB = dVar.b()) != null) {
                            cVar = new c(cVarB.a - cVar2.a, cVarB.b - cVar2.b, cVarB.c - cVar2.c);
                        }
                        if (cVar != null) {
                            int i = cVar.c;
                            int i2 = cVar.b;
                            int i3 = cVar.a;
                            if (i3 != 0 || i2 != 0 || i != 0) {
                                n nVar = new n("none", Integer.valueOf(i3));
                                n nVar2 = new n("none", Integer.valueOf(i2));
                                n nVar3 = new n("none", Integer.valueOf(i));
                                HashMap map = new HashMap();
                                map.put("frames_total", nVar);
                                map.put("frames_slow", nVar2);
                                map.put("frames_frozen", nVar3);
                                dVar.c.put(wVarQ, map);
                            }
                        }
                    }
                    aVar.close();
                } catch (Throwable th) {
                    try {
                        aVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.d;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().i(q5.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        o oVar = a7Var.q;
        if (oVar != null) {
            atomicReference.set(oVar.f(a7Var));
        }
    }

    @Override // defpackage.yn2
    public Object h(Task task) {
        URL url;
        yh2 yh2Var;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ii2 ii2Var = (ii2) obj3;
                Task task2 = (Task) obj2;
                Task task3 = (Task) obj;
                if (!task2.m()) {
                    return Tasks.c(new hg5(task2.h(), "Firebase Installations failed to get installation auth token for config update listener connection."));
                }
                if (!task3.m()) {
                    return Tasks.c(new hg5(task3.h(), "Firebase Installations failed to get installation ID for config update listener connection."));
                }
                try {
                    try {
                        url = new URL(ii2Var.c(ii2Var.n));
                        break;
                    } catch (MalformedURLException unused) {
                        b1.d("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    ii2Var.i(httpURLConnection, (String) task3.i(), ((ip0) task2.i()).a);
                    return Tasks.d(httpURLConnection);
                } catch (IOException e) {
                    return Tasks.c(new hg5(e, "Failed to open HTTP stream connection"));
                }
            case 1:
                return CrashlyticsTasks.lambda$race$0((gle) obj3, (AtomicBoolean) obj2, (sl1) obj, task);
            default:
                gg5 gg5Var = (gg5) obj3;
                Task task4 = (Task) obj2;
                Task task5 = (Task) obj;
                if (!task4.m() || task4.i() == null) {
                    return Tasks.d(Boolean.FALSE);
                }
                yh2 yh2Var2 = (yh2) task4.i();
                if (task5.m() && (yh2Var = (yh2) task5.i()) != null && yh2Var2.c.equals(yh2Var.c)) {
                    return Tasks.d(Boolean.FALSE);
                }
                wh2 wh2Var = gg5Var.d;
                Executor executor = wh2Var.a;
                return Tasks.b(executor, new vh2(0, wh2Var, yh2Var2)).o(executor, new bo1(2, wh2Var, yh2Var2)).f(gg5Var.b, new fg5(gg5Var));
        }
    }

    @Override // defpackage.xt3
    public yob k(int i, h1f h1fVar, int[] iArr) {
        vt3 vt3Var = (vt3) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        dy6 dy6VarM = jy6.m();
        for (int i2 = 0; i2 < h1fVar.a; i2++) {
            dy6VarM.b(new wt3(i, h1fVar, i2, vt3Var, iArr[i2], str, str2));
        }
        return dy6VarM.g();
    }

    @Override // defpackage.zbe
    public Object p() {
        ks3 ks3Var = (ks3) this.b;
        qq0 qq0Var = (qq0) this.c;
        xo0 xo0Var = (xo0) this.d;
        w8c w8cVar = ks3Var.d;
        w8cVar.getClass();
        lua luaVar = qq0Var.c;
        String str = xo0Var.a;
        String str2 = qq0Var.a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + luaVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) w8cVar.l(new gi2(w8cVar, xo0Var, qq0Var, 10))).getClass();
        ks3Var.a.w(qq0Var, 1, false);
        return null;
    }

    @Override // defpackage.na1
    public Object x(la1 la1Var) {
        int i = this.a;
        e94 e94Var = e94.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 6:
                pv2 pv2Var = (pv2) obj3;
                la1Var.a(new m45(7, (dg7) pv2Var.F0(ndb.Y0)), e94Var);
                return ynb.V(jgb.k(pv2Var), null, (dw2) obj2, new q88((l26) obj, la1Var, null), 1);
            default:
                String str = (String) obj2;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                la1Var.a(new n88(atomicBoolean, 0), e94Var);
                ((Executor) obj3).execute(new o88(atomicBoolean, la1Var, (x16) obj, 0));
                return str;
        }
    }
}
