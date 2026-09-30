package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.Trace;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.GooglePay;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bo1 implements bc2, j8e, yn2, an9, c98, d98, vae, xm9, zo8, xl2, kw6, mu3, cfd, u8c, na1, zbe, tg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bo1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void a(tx0 tx0Var, List list) {
        AtomicReference atomicReference = (AtomicReference) this.b;
        GooglePay googlePay = (GooglePay) this.c;
        int i = GooglePay.g;
        tx0Var.getClass();
        BillingSession billingSession = (BillingSession) atomicReference.get();
        if (billingSession == null || !googlePay.e.b(billingSession)) {
            return;
        }
        if (list == null) {
            list = pu4.a;
        }
        googlePay.e(tx0Var, list);
    }

    @Override // defpackage.xl2
    public void accept(Object obj) {
        aq4 aq4Var = (aq4) this.b;
        ((fq8) obj).d(aq4Var.a, aq4Var.b, (qp8) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091 A[Catch: all -> 0x0117, TryCatch #1 {all -> 0x0117, blocks: (B:22:0x008b, B:24:0x0091, B:26:0x00a1, B:27:0x00ad), top: B:56:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1 A[Catch: all -> 0x0117, TryCatch #1 {all -> 0x0117, blocks: (B:22:0x008b, B:24:0x0091, B:26:0x00a1, B:27:0x00ad), top: B:56:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9 A[LOOP:4: B:36:0x00f3->B:38:0x00f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // defpackage.u8c
    public Object apply(Object obj) {
        HashMap map;
        StringBuilder sb;
        int i;
        Cursor cursorQuery;
        ListIterator listIterator;
        tp0 tp0Var;
        long j;
        wo0 wo0VarC;
        long j2;
        Set hashSet;
        int i2 = this.a;
        Object obj2 = this.c;
        w8c w8cVar = (w8c) this.b;
        switch (i2) {
            case 21:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                w8cVar.getClass();
                sQLiteDatabase.compileStatement((String) obj2).execute();
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        w8cVar.x(cursorRawQuery.getInt(0), ve8.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            default:
                qq0 qq0Var = (qq0) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                yo0 yo0Var = w8cVar.d;
                ArrayList arrayListU = w8cVar.u(sQLiteDatabase2, qq0Var, yo0Var.b);
                for (lua luaVar : lua.values()) {
                    if (luaVar != qq0Var.c) {
                        int size = yo0Var.b - arrayListU.size();
                        if (size <= 0) {
                            map = new HashMap();
                            sb = new StringBuilder("event_id IN (");
                            for (i = 0; i < arrayListU.size(); i++) {
                                sb.append(((tp0) arrayListU.get(i)).a);
                                if (i < arrayListU.size() - 1) {
                                    sb.append(',');
                                }
                            }
                            sb.append(')');
                            cursorQuery = sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                            while (cursorQuery.moveToNext()) {
                                try {
                                    j2 = cursorQuery.getLong(0);
                                    hashSet = (Set) map.get(Long.valueOf(j2));
                                    if (hashSet == null) {
                                        hashSet = new HashSet();
                                        map.put(Long.valueOf(j2), hashSet);
                                    }
                                    hashSet.add(new v8c(cursorQuery.getString(1), cursorQuery.getString(2)));
                                } catch (Throwable th2) {
                                    cursorQuery.close();
                                    throw th2;
                                }
                            }
                            cursorQuery.close();
                            listIterator = arrayListU.listIterator();
                            while (listIterator.hasNext()) {
                                tp0Var = (tp0) listIterator.next();
                                j = tp0Var.a;
                                if (!map.containsKey(Long.valueOf(j))) {
                                    wo0VarC = tp0Var.c.c();
                                    for (v8c v8cVar : (Set) map.get(Long.valueOf(j))) {
                                        wo0VarC.b(v8cVar.a, v8cVar.b);
                                    }
                                    listIterator.set(new tp0(j, tp0Var.b, wo0VarC.c()));
                                }
                            }
                            return arrayListU;
                        }
                        arrayListU.addAll(w8cVar.u(sQLiteDatabase2, qq0Var.b(luaVar), size));
                    }
                }
                map = new HashMap();
                sb = new StringBuilder("event_id IN (");
                while (i < arrayListU.size()) {
                    sb.append(((tp0) arrayListU.get(i)).a);
                    if (i < arrayListU.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                cursorQuery = sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    j2 = cursorQuery.getLong(0);
                    hashSet = (Set) map.get(Long.valueOf(j2));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j2), hashSet);
                    }
                    hashSet.add(new v8c(cursorQuery.getString(1), cursorQuery.getString(2)));
                }
                cursorQuery.close();
                listIterator = arrayListU.listIterator();
                while (listIterator.hasNext()) {
                    tp0Var = (tp0) listIterator.next();
                    j = tp0Var.a;
                    if (!map.containsKey(Long.valueOf(j))) {
                        wo0VarC = tp0Var.c.c();
                        while (r5.hasNext()) {
                            wo0VarC.b(v8cVar.a, v8cVar.b);
                        }
                        listIterator.set(new tp0(j, tp0Var.b, wo0VarC.c()));
                    }
                }
                return arrayListU;
        }
    }

    @Override // defpackage.cfd
    public boolean b() {
        vsa vsaVar = (vsa) this.b;
        gr0 gr0Var = (gr0) this.c;
        boolean z = vsaVar.q;
        if (z) {
            return z;
        }
        vsaVar.h();
        long jA = gr0.a(vsaVar.o, gr0Var.a);
        gr0Var.a = jA;
        boolean z2 = !vsaVar.g(vsaVar.n, jA + gr0Var.b);
        vsaVar.q = z2;
        return z2;
    }

    @Override // defpackage.bc2
    public Object c(hbc hbcVar) {
        String strLambda$getComponents$0;
        int i = this.a;
        Object obj = this.c;
        String str = (String) this.b;
        switch (i) {
            case 1:
                lb2 lb2Var = (lb2) obj;
                try {
                    Trace.beginSection(str);
                    return lb2Var.f.c(hbcVar);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) hbcVar.a(Context.class);
                switch (((pd4) obj).a) {
                    case 19:
                        strLambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$0(context);
                        break;
                    case 20:
                        strLambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$1(context);
                        break;
                    case 21:
                        strLambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$2(context);
                        break;
                    default:
                        strLambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$3(context);
                        break;
                }
                return new jp0(str, strLambda$getComponents$0);
        }
    }

    @Override // defpackage.c98
    public void d(Object obj) {
        pl plVar = (pl) this.b;
        qp8 qp8Var = (qp8) this.c;
        sp8 sp8Var = (sp8) ((ql) obj);
        sp8Var.getClass();
        zp8 zp8Var = plVar.d;
        if (zp8Var == null) {
            return;
        }
        rr5 rr5Var = (rr5) qp8Var.d;
        rr5Var.getClass();
        gs3 gs3Var = sp8Var.c;
        gye gyeVar = plVar.b;
        zp8Var.getClass();
        w84 w84Var = new w84(19, rr5Var, gs3Var.c(gyeVar, zp8Var));
        int i = qp8Var.c;
        if (i != 0) {
            if (i == 1) {
                sp8Var.q = w84Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                sp8Var.r = w84Var;
                return;
            }
        }
        sp8Var.p = w84Var;
    }

    @Override // defpackage.vae
    public void e(lq0 lq0Var) {
        ft3 ft3Var = (ft3) this.b;
        b46 b46Var = (((wae) this.c).c.a() && lq0Var.d) ? b46.c : b46.b;
        gq9 gq9Var = ft3Var.a;
        e46.d((AtomicBoolean) gq9Var.c, true);
        e46.c((Thread) gq9Var.e);
        if (((b46) gq9Var.X) != b46Var) {
            gq9Var.X = b46Var;
            gq9Var.r(gq9Var.a);
        }
    }

    @Override // defpackage.zo8
    public int f(Object obj) {
        Context context = (Context) this.b;
        rr5 rr5Var = (rr5) this.c;
        to8 to8Var = (to8) obj;
        String str = to8Var.b;
        return ((str.equals(rr5Var.p) || str.equals(ap8.c(rr5Var))) && to8Var.c(context, rr5Var, false) && to8Var.d(rr5Var)) ? 1 : 0;
    }

    @Override // defpackage.d98
    public void g(Object obj, ki5 ki5Var) {
        sp8 sp8Var = (sp8) ((ql) obj);
        sp8Var.k((zga) this.c, new a90(ki5Var, ((ro3) this.b).e));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:137:0x023d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0240  */
    /* JADX WARN: Code duplicated, block: B:147:0x0279  */
    /* JADX WARN: Code duplicated, block: B:189:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0229 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0188  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b6 A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #9 {all -> 0x013a, blocks: (B:38:0x0123, B:40:0x0126, B:41:0x0127, B:49:0x0143, B:90:0x01b2, B:92:0x01b6, B:94:0x01b9, B:98:0x01bd, B:99:0x01be, B:93:0x01b7), top: B:197:0x00ff, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01be A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #9 {all -> 0x013a, blocks: (B:38:0x0123, B:40:0x0126, B:41:0x0127, B:49:0x0143, B:90:0x01b2, B:92:0x01b6, B:94:0x01b9, B:98:0x01bd, B:99:0x01be, B:93:0x01b7), top: B:197:0x00ff, inners: #11 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v53, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r3v3, types: [ii2] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Integer, java.lang.Object] */
    @Override // defpackage.yn2
    public Object h(Task task) throws Throwable {
        InputStream errorStream;
        ?? r9;
        ?? ValueOf;
        boolean z = true;
        switch (this.a) {
            case 3:
                di2 di2Var = (di2) this.b;
                Date date = (Date) this.c;
                if (task.m()) {
                    li2 li2Var = (li2) di2Var.g;
                    synchronized (li2Var.b) {
                        li2Var.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                        break;
                    }
                } else {
                    Exception excH = task.h();
                    if (excH != null) {
                        boolean z2 = excH instanceof kg5;
                        li2 li2Var2 = (li2) di2Var.g;
                        Object obj = li2Var2.b;
                        if (!z2) {
                            synchronized (obj) {
                                li2Var2.a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        } else {
                            synchronized (obj) {
                                li2Var2.a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        }
                    }
                    break;
                }
                return task;
            case 4:
                return ((di2) this.b).e(task, 0L, (HashMap) this.c);
            case 5:
                ?? r3 = (ii2) this.b;
                ?? inputStream = (Task) this.c;
                ?? r7 = 0;
                try {
                    try {
                        if (!inputStream.m()) {
                            throw new IOException(inputStream.h());
                        }
                        HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream.i();
                        r3.f = httpURLConnection;
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            errorStream = r3.f.getErrorStream();
                            try {
                                int responseCode = r3.f.getResponseCode();
                                ValueOf = Integer.valueOf(responseCode);
                                if (responseCode == 200) {
                                    try {
                                        synchronized (r3) {
                                            r3.c = 8;
                                        }
                                        r3.p.e(0, li2.f);
                                        th2 th2VarJ = r3.j(r3.f);
                                        r3.g = th2VarJ;
                                        th2VarJ.c();
                                    } catch (IOException e) {
                                        e = e;
                                        if (r3.e) {
                                            synchronized (r3) {
                                                r3.c = 8;
                                            }
                                        } else {
                                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                        }
                                        r3.b(inputStream, errorStream);
                                        synchronized (r3) {
                                            r3.b = false;
                                        }
                                        if (r3.e || (ValueOf != 0 && !ii2.d(ValueOf.intValue()))) {
                                            z = false;
                                        }
                                        if (z) {
                                            r3.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (!z || ValueOf.intValue() == 200) {
                                            r3.h();
                                        } else {
                                            String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                            if (ValueOf.intValue() == 403) {
                                                strF = ii2.f(r3.f.getErrorStream());
                                            }
                                            new mg5(ValueOf.intValue(), 0, strF);
                                        }
                                        r3.f = null;
                                        r3.g = null;
                                        return Tasks.d(null);
                                    }
                                }
                                r3.b(inputStream, errorStream);
                                synchronized (r3) {
                                    r3.b = false;
                                }
                                z = !r3.e && ii2.d(responseCode);
                                if (z) {
                                    r3.k(new Date(System.currentTimeMillis()));
                                }
                                if (z || responseCode == 200) {
                                    r3.h();
                                } else {
                                    String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                    if (responseCode == 403) {
                                        strF2 = ii2.f(r3.f.getErrorStream());
                                    }
                                    new mg5(responseCode, 0, strF2);
                                    r3.g();
                                }
                            } catch (IOException e2) {
                                e = e2;
                                ValueOf = 0;
                            } catch (Throwable th) {
                                th = th;
                                ValueOf = 0;
                                r7 = inputStream;
                                r9 = ValueOf;
                                r3.b(r7, errorStream);
                                synchronized (r3) {
                                    r3.b = false;
                                    if (r3.e || (r9 != 0 && !ii2.d(r9.intValue()))) {
                                        z = false;
                                    }
                                    if (z) {
                                        r3.k(new Date(System.currentTimeMillis()));
                                    }
                                    if (!z || r9.intValue() == 200) {
                                        r3.h();
                                    } else {
                                        String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r9);
                                        if (r9.intValue() == 403) {
                                            strF3 = ii2.f(r3.f.getErrorStream());
                                        }
                                        new mg5(r9.intValue(), 0, strF3);
                                        r3.g();
                                    }
                                    throw th;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            errorStream = null;
                            inputStream = inputStream;
                            ValueOf = errorStream;
                            if (r3.e) {
                                synchronized (r3) {
                                    r3.c = 8;
                                }
                            } else {
                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                            }
                            r3.b(inputStream, errorStream);
                            synchronized (r3) {
                                r3.b = false;
                                if (r3.e) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    r3.k(new Date(System.currentTimeMillis()));
                                }
                                if (z) {
                                }
                                r3.h();
                                r3.f = null;
                                r3.g = null;
                                return Tasks.d(null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            errorStream = null;
                            ValueOf = 0;
                        }
                        r3.f = null;
                        r3.g = null;
                        return Tasks.d(null);
                    } catch (IOException e4) {
                        e = e4;
                        inputStream = 0;
                        errorStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        errorStream = null;
                        r9 = 0;
                        r3.b(r7, errorStream);
                        synchronized (r3) {
                            r3.b = false;
                            if (r3.e) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                r3.k(new Date(System.currentTimeMillis()));
                            }
                            if (z) {
                                r3.h();
                            } else {
                                r3.h();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                a82 a82Var = (a82) this.b;
                ExecutorService executorService = (ExecutorService) this.c;
                a82Var.getClass();
                if (!task.m()) {
                    return Tasks.c(task.h() != null ? task.h() : new ExecutionException(new RuntimeException("Unexpected Error")));
                }
                String str = (String) task.i();
                return ((nf5) ((of5) a82Var.b)).d().g(Executors.newSingleThreadExecutor(new z99("Firebase-Messaging-Network-Io")), new bo1(12, a82Var, str)).f(executorService, new rl2(str, 6));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                a82 a82Var2 = (a82) this.b;
                String str2 = (String) this.c;
                ff5 ff5Var = (ff5) a82Var2.d;
                if (!task.m()) {
                    return Tasks.c(task.h() != null ? task.h() : new ExecutionException(new RuntimeException("Unexpected Error")));
                }
                String str3 = ((ip0) task.i()).a;
                ff5Var.a();
                wf5 wf5Var = ff5Var.c;
                String str4 = wf5Var.a;
                ff5Var.a();
                wob wobVar = new wob(rw.c(ff5Var), wf5Var.b, str4, str2, str3);
                a97 a97Var = (a97) a82Var2.c;
                j27 j27VarB = j27.b();
                j27VarB.d = new za5[]{tm7.E};
                j27VarB.c = new m7h(a97Var, wobVar);
                j27VarB.b = 39001;
                return a97Var.b(0, j27VarB.a());
            default:
                lqb lqbVar = (lqb) this.b;
                String str5 = (String) this.c;
                synchronized (lqbVar) {
                    ((kd0) lqbVar.c).remove(str5);
                    break;
                }
                return task;
        }
    }

    @Override // defpackage.mu3
    public void i(i1b i1bVar) {
        mu3 mu3Var = (mu3) this.b;
        mu3 mu3Var2 = (mu3) this.c;
        mu3Var.i(i1bVar);
        mu3Var2.i(i1bVar);
    }

    @Override // defpackage.xm9
    public void k(Task task) {
        ((FirebaseMessagingService) this.b).a((Intent) this.c);
    }

    @Override // defpackage.kw6
    public void l(lw6 lw6Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 17:
                ((kw6) obj).l((w84) obj2);
                break;
            default:
                ((kw6) obj).l((sbc) obj2);
                break;
        }
    }

    @Override // defpackage.zbe
    public Object p() {
        int i = this.a;
        Object obj = this.c;
        lp0 lp0Var = (lp0) this.b;
        switch (i) {
            case 26:
                Iterable iterable = (Iterable) obj;
                w8c w8cVar = (w8c) lp0Var.d;
                w8cVar.getClass();
                if (iterable.iterator().hasNext()) {
                    w8cVar.b().compileStatement("DELETE FROM events WHERE _id in ".concat(w8c.G(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((w8c) lp0Var.x).x(((Integer) entry.getValue()).intValue(), ve8.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    @Override // defpackage.an9
    public void r(Exception exc) {
        b76 y66Var;
        qy2 qy2Var = (qy2) this.b;
        CancellationSignal cancellationSignal = (CancellationSignal) this.c;
        String str = ((exc instanceof x60) && ry2.b.contains(Integer.valueOf(((x60) exc).a()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        String str2 = "During begin sign in, failure response from one tap: " + exc.getMessage();
        int iHashCode = str.hashCode();
        if (iHashCode != -1567968963) {
            if (iHashCode != -154594663) {
                if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                    y66Var = new jf9(str2);
                } else {
                    y66Var = new g76(str2);
                }
            } else if (str.equals("GET_INTERRUPTED")) {
                y66Var = new c76(str2);
            } else {
                y66Var = new g76(str2);
            }
        } else if (str.equals("GET_CANCELED_TAG")) {
            y66Var = new y66(str2);
        } else {
            y66Var = new g76(str2);
        }
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (yy2.a(cancellationSignal)) {
            return;
        }
        qy2Var.e().execute(new oy2(qy2Var, y66Var, 2));
    }

    @Override // defpackage.j8e
    public Task then(Object obj) {
        wh2 wh2Var = (wh2) this.b;
        yh2 yh2Var = (yh2) this.c;
        synchronized (wh2Var) {
            wh2Var.c = Tasks.d(yh2Var);
        }
        return Tasks.d(yh2Var);
    }

    @Override // defpackage.na1
    public Object x(la1 la1Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 24:
                ((AtomicReference) obj).set(la1Var);
                return "SurfaceRequest-surface-recreation(" + ((wae) obj2).hashCode() + ")";
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                la1Var.a(new n88(atomicBoolean, 1), e94.a);
                ((Executor) obj2).execute(new o88(atomicBoolean, la1Var, (x16) obj, 1));
                return wef.a;
        }
    }

    @Override // defpackage.u8c
    public m88 apply(Object obj) {
        uf ufVar = (uf) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        r45 r45Var = (r45) ufVar.d;
        Integer num = (Integer) ((im1) arrayList.get(0)).b.a(im1.g, 100);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        Integer num2 = (Integer) ((im1) arrayList.get(0)).b.a(im1.f, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        psd psdVar = ((k3e) r45Var.b).v;
        if (psdVar != null) {
            ft3 ft3Var = (ft3) psdVar.b;
            la1 la1Var = new la1();
            la1Var.c = new qxb();
            pa1 pa1Var = new pa1(la1Var);
            la1Var.b = pa1Var;
            la1Var.a = kv2.class;
            try {
                ft3Var.e(new ny2(9, ft3Var, new po0(iIntValue, iIntValue2, la1Var)), new j1(22, la1Var));
                la1Var.a = "DefaultSurfaceProcessor#snapshot";
            } catch (Exception e) {
                pa1Var.a(e);
            }
            return bm8.J(pa1Var);
        }
        return new tx6(1, new Exception("Failed to take picture: pipeline is not ready."));
    }
}
