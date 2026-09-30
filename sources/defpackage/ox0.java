package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.adjust.sdk.sig.r3;
import io.sentry.q6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.GooglePay;
import net.xmind.donut.gp.GooglePay$start$1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ox0 {
    public ExecutorService A;
    public final Long B;
    public final t4c C;
    public final String c;
    public final String d;
    public volatile fp3 f;
    public final Context g;
    public final lqb h;
    public volatile crg i;
    public volatile ysg j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final yx4 y;
    public utg z;
    public final Object a = new Object();
    public volatile int b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public ox0(yx4 yx4Var, Context context, bo1 bo1Var, nx0 nx0Var) {
        int i = utg.c;
        this.z = nug.x;
        long jNextLong = new Random().nextLong();
        this.B = Long.valueOf(jNextLong);
        this.C = dsg.a;
        this.c = "9.1.0";
        String strL = l();
        this.d = strL;
        this.g = context.getApplicationContext();
        s6h s6hVarZ = u6h.z();
        s6hVarZ.h();
        if (strL != null) {
            s6hVarZ.b();
            u6h.y((u6h) s6hVarZ.b, strL);
        }
        s6hVarZ.g(this.g.getPackageName());
        s6hVarZ.b();
        u6h.D((u6h) s6hVarZ.b, jNextLong);
        s6hVarZ.b();
        u6h.w((u6h) s6hVarZ.b);
        s6hVarZ.c(Build.VERSION.SDK_INT);
        s6hVarZ.f();
        o(s6hVarZ, context);
        try {
            s6hVarZ.d(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zsg.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new lqb(this.g, (u6h) s6hVarZ.a());
        if (bo1Var == null) {
            zsg.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new fp3(this.g, bo1Var, this.h);
        this.y = yx4Var;
        this.g.getPackageName();
    }

    public static Future g(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new lwg(22, futureSubmit, runnable), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            zsg.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static String l() {
        try {
            return (String) y41.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void m(ox0 ox0Var, int i) {
        ox0Var.l = i;
        ox0Var.x = i >= 28;
        ox0Var.w = i >= 26;
        ox0Var.v = i >= 24;
        ox0Var.u = i >= 21;
        ox0Var.t = i >= 20;
        ox0Var.s = i >= 19;
        ox0Var.r = i >= 17;
        ox0Var.q = i >= 16;
        ox0Var.p = i >= 15;
        ox0Var.o = i >= 14;
        ox0Var.n = i >= 9;
        ox0Var.m = i >= 6;
    }

    public static void n(ox0 ox0Var, int i) {
        if (i != 0) {
            ox0Var.x(0);
            return;
        }
        synchronized (ox0Var.a) {
            try {
                if (ox0Var.b == 3) {
                    return;
                }
                ox0Var.x(2);
                fp3 fp3Var = ox0Var.f != null ? ox0Var.f : null;
                if (fp3Var != null) {
                    boolean z = ox0Var.u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    fp3Var.b = z;
                    q1h q1hVar = (q1h) fp3Var.f;
                    Context context = fp3Var.a;
                    q1hVar.a(context, intentFilter2);
                    boolean z2 = fp3Var.b;
                    q1h q1hVar2 = (q1h) fp3Var.e;
                    if (!z2) {
                        q1hVar2.a(context, intentFilter);
                        return;
                    }
                    synchronized (q1hVar2) {
                        try {
                            if (q1hVar2.b) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(q1hVar2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != q1hVar2.c ? 4 : 2);
                            } else {
                                context.registerReceiver(q1hVar2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            q1hVar2.b = true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void o(s6h s6hVar, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / q6.MAX_EVENT_SIZE_BYTES);
                s6hVar.b();
                u6h.v((u6h) s6hVar.b, i);
                String str = Build.BRAND;
                s6hVar.b();
                u6h.r((u6h) s6hVar.b);
                String str2 = Build.MODEL;
                s6hVar.b();
                u6h.u((u6h) s6hVar.b);
                String str3 = Build.MANUFACTURER;
                s6hVar.b();
                u6h.t((u6h) s6hVar.b);
                String str4 = Build.FINGERPRINT;
                s6hVar.b();
                u6h.s((u6h) s6hVar.b);
            }
        } catch (RuntimeException e) {
            zsg.i("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    public final boolean A(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        t4c t4cVar = this.C;
        if (t4cVar == null) {
            r82.g("ticker");
            return false;
        }
        long jW = t4cVar.w();
        int i = p8c.b;
        long jW2 = j;
        for (int i2 = 1; i2 <= i; i2++) {
            try {
                if (Math.max(0L, jW2) <= 0) {
                    zsg.h("BillingClient", "No time remaining for reconnection attempt.");
                    return B();
                }
                zsg.g("BillingClient", "Already connected or not opted into auto reconnection.");
                tx0 tx0Var = swg.g;
                timeUnit.getClass();
                int i3 = tx0Var.a;
                if (i3 == 0) {
                    zsg.g("BillingClient", "Reconnection succeeded with result: " + i3);
                    return B();
                }
                zsg.h("BillingClient", "Reconnection failed with result: " + i3);
                jW2 = j - (((t4cVar.w() - jW) + 0) / 1000000);
                long jPow = ((long) Math.pow(2.0d, i2 - 1)) * 1000;
                if (jW2 < jPow) {
                    zsg.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return B();
                }
                if (i2 < i && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jW2 = j - (((t4cVar.w() - jW) + 0) / 1000000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        zsg.i("BillingClient", "Error sleeping during reconnection attempt: ", e);
                    }
                }
            } catch (Exception e2) {
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zsg.i("BillingClient", "Error during reconnection attempt: ", e2);
            }
        }
        zsg.h("BillingClient", "Max retries reached.");
        return B();
    }

    public final boolean B() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.b == 2 && this.i != null && this.j != null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void C(tx0 tx0Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new v36(24, this, tx0Var));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #3 {, blocks: (B:20:0x004d, B:22:0x0051), top: B:48:0x004d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void a() {
        ExecutorService executorService;
        try {
            int i = hwg.a;
            v(hwg.c(12, j6h.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            zsg.i("BillingClient", "Unable to log.", th);
        }
        synchronized (this.a) {
            try {
                if (this.f != null) {
                    fp3 fp3Var = this.f;
                    q1h q1hVar = (q1h) fp3Var.e;
                    Context context = fp3Var.a;
                    q1hVar.c(context);
                    ((q1h) fp3Var.f).c(context);
                    try {
                        zsg.g("BillingClient", "Unbinding from service.");
                        z();
                    } catch (Throwable th2) {
                        zsg.i("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    try {
                        synchronized (this) {
                            executorService = this.A;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                this.A = null;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            zsg.i("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (Throwable th4) {
                            x(3);
                            throw th4;
                        }
                    }
                    x(3);
                } else {
                    zsg.g("BillingClient", "Unbinding from service.");
                    z();
                    synchronized (this) {
                        executorService = this.A;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.A = null;
                        }
                        x(3);
                    }
                }
            } catch (Throwable th5) {
                zsg.i("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0315 A[EDGE_INSN: B:140:0x0315->B:106:0x0256 BREAK  A[LOOP:6: B:100:0x0220->B:119:0x02a0]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0118  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Object, ox0] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r5v10, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    public tx0 b(Activity activity, final sx0 sx0Var) {
        String str;
        String str2;
        tx0 tx0VarA;
        dwa dwaVar;
        tx0 tx0VarA2;
        long j;
        long j2;
        boolean z;
        Future futureG;
        String str3;
        ?? r6;
        ?? r4;
        ?? r7;
        ?? r5;
        z5h z5hVarB;
        String string;
        Object obj;
        String str4;
        boolean z2;
        String str5;
        ArrayList arrayList;
        boolean z3;
        int i;
        long jNextLong = new Random().nextLong();
        if (this.f == null || ((bo1) this.f.c) == null) {
            z5h z5hVar = z5h.MISSING_LISTENER;
            tx0 tx0Var = swg.p;
            r(z5hVar, tx0Var, jNextLong);
            return tx0Var;
        }
        sx0Var.getClass();
        try {
            zsg.g("BillingClient", "Already connected or not opted into auto reconnection.");
            tx0 tx0Var2 = swg.g;
            TimeUnit.MILLISECONDS.getClass();
            int i2 = tx0Var2.a;
            if (i2 == 0) {
                zsg.g("BillingClient", "Reconnection succeeded with result: " + i2);
            } else {
                zsg.h("BillingClient", "Reconnection failed with result: " + i2);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zsg.i("BillingClient", "Error during reconnection attempt: ", e);
        }
        if (!B()) {
            z5h z5hVar2 = z5h.SERVICE_CONNECTION_NOT_READY;
            tx0 tx0Var3 = swg.h;
            r(z5hVar2, tx0Var3, jNextLong);
            C(tx0Var3);
            return tx0Var3;
        }
        synchronized (this.a) {
            try {
                if (this.j != null) {
                    this.j.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(sx0Var.f);
        mtg mtgVar = sx0Var.e;
        Iterator it = arrayList2.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            r3.f();
            return null;
        }
        vsg vsgVar = (vsg) mtgVar.iterator();
        qx0 qx0Var = (qx0) (vsgVar.hasNext() ? vsgVar.next() : null);
        gwa gwaVar = qx0Var.a;
        String str6 = gwaVar.c;
        String str7 = gwaVar.d;
        if (str7.equals("subs") && !this.k) {
            zsg.h("BillingClient", "Current client doesn't support subscriptions.");
            z5h z5hVar3 = z5h.SUBSCRIPTIONS_NOT_SUPPORTED;
            tx0 tx0Var4 = swg.j;
            s(z5hVar3, tx0Var4, jNextLong, false);
            C(tx0Var4);
            return tx0Var4;
        }
        if (sx0Var.b == null && sx0Var.c == null) {
            rx0 rx0Var = sx0Var.d;
            rx0Var.getClass();
            if (rx0Var.b == 0 && !sx0Var.a) {
                mtg mtgVar2 = sx0Var.e;
                if (mtgVar2 != null) {
                    int size = mtgVar2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((qx0) mtgVar2.get(i3)).getClass();
                    }
                }
            } else if (!this.m) {
                zsg.h("BillingClient", "Current client doesn't support extra params for buy intent.");
                z5h z5hVar4 = z5h.EXTRA_PARAMS_NOT_SUPPORTED;
                tx0 tx0Var5 = swg.e;
                s(z5hVar4, tx0Var5, jNextLong, false);
                C(tx0Var5);
                return tx0Var5;
            }
        } else if (!this.m) {
            zsg.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            z5h z5hVar5 = z5h.EXTRA_PARAMS_NOT_SUPPORTED;
            tx0 tx0Var6 = swg.e;
            s(z5hVar5, tx0Var6, jNextLong, false);
            C(tx0Var6);
            return tx0Var6;
        }
        if (arrayList2.size() > 1 && !this.q) {
            zsg.h("BillingClient", "Current client doesn't support multi-item purchases.");
            z5h z5hVar6 = z5h.MULTI_ITEM_NOT_SUPPORTED;
            tx0 tx0Var7 = swg.k;
            s(z5hVar6, tx0Var7, jNextLong, false);
            C(tx0Var7);
            return tx0Var7;
        }
        if (!mtgVar.isEmpty() && !this.r) {
            zsg.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            z5h z5hVar7 = z5h.PRODUCT_DETAILS_NOT_SUPPORTED;
            tx0 tx0Var8 = swg.n;
            s(z5hVar7, tx0Var8, jNextLong, false);
            C(tx0Var8);
            return tx0Var8;
        }
        vsg vsgVarListIterator = mtgVar.listIterator(0);
        while (vsgVarListIterator.hasNext()) {
            String str8 = ((qx0) vsgVarListIterator.next()).b;
            if (str8 != null) {
                if (str8.contains(":") && !this.x) {
                    zsg.h("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                    z5h z5hVar8 = z5h.GIFT_CODE_PURCHASE_NOT_SUPPORTED;
                    tx0 tx0Var9 = swg.m;
                    s(z5hVar8, tx0Var9, jNextLong, false);
                    C(tx0Var9);
                    return tx0Var9;
                }
            }
        }
        if (!sx0Var.e.isEmpty()) {
            qx0 qx0Var2 = (qx0) sx0Var.e.get(0);
            int i4 = 1;
            str = null;
            while (true) {
                if (i4 >= sx0Var.e.size()) {
                    str2 = str6;
                    gwa gwaVar2 = qx0Var2.a;
                    String strOptString = gwaVar2.b.optString("packageName");
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    mtg mtgVar3 = sx0Var.e;
                    int size2 = mtgVar3.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size2) {
                            mtg mtgVar4 = mtgVar3;
                            qx0 qx0Var3 = (qx0) mtgVar3.get(i5);
                            qx0Var3.getClass();
                            int i6 = size2;
                            gwa gwaVar3 = qx0Var3.a;
                            int i7 = i5;
                            ArrayList arrayList3 = gwaVar3.j;
                            String str9 = gwaVar3.c;
                            if (arrayList3 != null && qx0Var3.b == null) {
                                tx0VarA = swg.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str9);
                                break;
                            }
                            if (map.containsKey(str9)) {
                                tx0VarA = swg.a(5, "ProductId can not be duplicated. Invalid product id: " + str9 + ".");
                                break;
                            }
                            map.put(str9, qx0Var3);
                            if (!gwaVar2.d.equals("play_pass_subs") && !gwaVar3.d.equals("play_pass_subs") && !strOptString.equals(gwaVar3.b.optString("packageName"))) {
                                tx0VarA = swg.a(5, "All products must have the same package name.");
                                break;
                            }
                            i5 = i7 + 1;
                            size2 = i6;
                            mtgVar3 = mtgVar4;
                            hashSet = hashSet;
                        } else {
                            Iterator it2 = hashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    ArrayList arrayList4 = gwaVar2.k;
                                    String str10 = qx0Var2.b;
                                    if (str10 != null && arrayList4 != null) {
                                        Iterator it3 = arrayList4.iterator();
                                        do {
                                            if (!it3.hasNext()) {
                                                dwaVar = null;
                                                break;
                                            }
                                            dwaVar = (dwa) it3.next();
                                        } while (!str10.equals(dwaVar.d));
                                        if (dwaVar != null && dwaVar.g != null) {
                                            tx0VarA = swg.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                            break;
                                        }
                                        tx0VarA = swg.g;
                                        break;
                                    }
                                    tx0VarA = swg.g;
                                    break;
                                }
                                String str11 = (String) it2.next();
                                if (map.containsKey(str11)) {
                                    ((qx0) map.get(str11)).getClass();
                                    tx0VarA = swg.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str11 + ".");
                                    break;
                                }
                            }
                        }
                    }
                    tx0VarA2 = tx0VarA;
                    break;
                }
                qx0 qx0Var4 = (qx0) sx0Var.e.get(i4);
                str2 = str6;
                if (!qx0Var4.a.d.equals(qx0Var2.a.d) && !qx0Var4.a.d.equals("play_pass_subs")) {
                    tx0VarA2 = swg.a(5, "All products should have same ProductType.");
                    break;
                }
                i4++;
                str6 = str2;
            }
        } else {
            str2 = str6;
            tx0VarA2 = swg.g;
            str = null;
        }
        if (tx0VarA2 != swg.g) {
            s(z5h.INVALID_BILLING_FLOW_PARAMS, tx0VarA2, jNextLong, false);
            C(tx0VarA2);
            return tx0VarA2;
        }
        Bundle bundle = null;
        if (this.m) {
            boolean z4 = this.n;
            boolean z5 = this.s;
            this.y.getClass();
            this.y.getClass();
            String str12 = this.d;
            long jLongValue = this.B.longValue();
            this.g.getPackageName();
            z = false;
            final Bundle bundle2 = new Bundle();
            zsg.b(bundle2, str12, jLongValue);
            bundle2.putLong("billingClientTransactionId", j);
            int i8 = sx0Var.d.b;
            if (i8 != 0) {
                j = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x032e: MOVE (r4v25 'j' long) = (r4v4 long) (LINE:815) in method: ox0.b(android.app.Activity, sx0):tx0, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v4 long
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1996
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ox0.b(android.app.Activity, sx0):tx0");
            }

            public void c(kd9 kd9Var, gi2 gi2Var) {
                if (g(new vcd(this, gi2Var, kd9Var, 2), 30000L, new v36(25, this, gi2Var), Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper()), f()) == null) {
                    tx0 tx0VarJ = j();
                    q(z5h.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, tx0VarJ);
                    vsg vsgVar = mtg.b;
                    aug augVar = aug.e;
                    GooglePay googlePay = (GooglePay) gi2Var.b;
                    BillingSession billingSession = (BillingSession) gi2Var.c;
                    l26 l26Var = (l26) gi2Var.d;
                    int i = GooglePay.g;
                    tx0VarJ.getClass();
                    if (googlePay.e.b(billingSession)) {
                        augVar.getClass();
                        l26Var.z(tx0VarJ, augVar);
                    }
                }
            }

            public final void d(ue1 ue1Var, q2b q2bVar) {
                if (g(new vcd(this, q2bVar, ue1Var.a), 30000L, new lwg(21, this, q2bVar), Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper()), f()) == null) {
                    tx0 tx0VarJ = j();
                    q(z5h.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, tx0VarJ);
                    vsg vsgVar = mtg.b;
                    q2bVar.a(tx0VarJ, aug.e);
                }
            }

            public void e(GooglePay$start$1 googlePay$start$1) {
                y(googlePay$start$1);
            }

            public final synchronized ExecutorService f() {
                ExecutorService executorServiceNewFixedThreadPool;
                executorServiceNewFixedThreadPool = this.A;
                if (executorServiceNewFixedThreadPool == null) {
                    executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(zsg.a, new z99(this));
                    this.A = executorServiceNewFixedThreadPool;
                }
                return executorServiceNewFixedThreadPool;
            }

            public final os h(tx0 tx0Var, z5h z5hVar, String str, Exception exc) {
                zsg.i("BillingClient", str, exc);
                try {
                    u(hwg.b(z5hVar, 7, tx0Var, hwg.a(exc), j6h.BROADCAST_ACTION_UNSPECIFIED));
                } catch (Throwable th) {
                    zsg.i("BillingClient", "Unable to log.", th);
                }
                return new os(tx0Var.a, tx0Var.c, new ArrayList(), new ArrayList());
            }

            public final tx0 i() {
                zsg.g("BillingClient", "Service connection is valid. No need to re-initialize.");
                t5h t5hVarQ = v5h.q();
                t5hVarQ.b();
                v5h.p((v5h) t5hVarQ.b, 6);
                g8h g8hVarP = l8h.p();
                g8hVarP.b();
                l8h.u((l8h) g8hVarP.b);
                g8hVarP.c(false);
                g8hVarP.d();
                t5hVarQ.b();
                v5h.u((v5h) t5hVarQ.b, (l8h) g8hVarP.a());
                v((v5h) t5hVarQ.a());
                return swg.g;
            }

            public final tx0 j() {
                int[] iArr = {0, 3};
                synchronized (this.a) {
                    for (int i = 0; i < 2; i++) {
                        if (this.b == iArr[i]) {
                            return swg.h;
                        }
                    }
                    return swg.f;
                }
            }

            public final void k() {
                if (TextUtils.isEmpty(null)) {
                    this.g.getPackageName();
                }
            }

            public final lqb p(tx0 tx0Var, z5h z5hVar, String str, Exception exc) {
                try {
                    u(hwg.b(z5hVar, 9, tx0Var, hwg.a(exc), j6h.BROADCAST_ACTION_UNSPECIFIED));
                } catch (Throwable th) {
                    zsg.i("BillingClient", "Unable to log.", th);
                }
                zsg.i("BillingClient", str, exc);
                return new lqb(tx0Var, null, false, 27);
            }

            public final void q(z5h z5hVar, int i, tx0 tx0Var) {
                try {
                    int i2 = hwg.a;
                    u(hwg.b(z5hVar, i, tx0Var, null, j6h.BROADCAST_ACTION_UNSPECIFIED));
                } catch (Throwable th) {
                    zsg.i("BillingClient", "Unable to log.", th);
                }
            }

            public final void r(z5h z5hVar, tx0 tx0Var, long j) {
                try {
                    int i = hwg.a;
                    try {
                        this.h.B(hwg.b(z5hVar, 2, tx0Var, null, j6h.BROADCAST_ACTION_UNSPECIFIED), this.l, j);
                    } catch (Throwable th) {
                        zsg.i("BillingClient", "Unable to log.", th);
                    }
                } catch (Throwable th2) {
                    zsg.i("BillingClient", "Unable to log.", th2);
                }
            }

            public final void s(z5h z5hVar, tx0 tx0Var, long j, boolean z) {
                try {
                    int i = hwg.a;
                    try {
                        this.h.D(hwg.b(z5hVar, 2, tx0Var, null, j6h.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
                    } catch (Throwable th) {
                        zsg.i("BillingClient", "Unable to log.", th);
                    }
                } catch (Throwable th2) {
                    zsg.i("BillingClient", "Unable to log.", th2);
                }
            }

            public final void t(z5h z5hVar, tx0 tx0Var, String str, long j, boolean z) {
                try {
                    int i = hwg.a;
                    try {
                        this.h.D(hwg.b(z5hVar, 2, tx0Var, str, j6h.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
                    } catch (Throwable th) {
                        zsg.i("BillingClient", "Unable to log.", th);
                    }
                } catch (Throwable th2) {
                    zsg.i("BillingClient", "Unable to log.", th2);
                }
            }

            public final void u(p5h p5hVar) {
                try {
                    lqb lqbVar = this.h;
                    int i = this.l;
                    lqbVar.getClass();
                    try {
                        s6h s6hVar = (s6h) ((u6h) lqbVar.b).l();
                        s6hVar.b();
                        u6h.C((u6h) s6hVar.b, i);
                        lqbVar.b = (u6h) s6hVar.a();
                        lqbVar.A(p5hVar);
                    } catch (Throwable th) {
                        zsg.i("BillingLogger", "Unable to log.", th);
                    }
                } catch (Throwable th2) {
                    zsg.i("BillingClient", "Unable to log.", th2);
                }
            }

            public final void v(v5h v5hVar) {
                try {
                    lqb lqbVar = this.h;
                    int i = this.l;
                    lqbVar.getClass();
                    try {
                        s6h s6hVar = (s6h) ((u6h) lqbVar.b).l();
                        s6hVar.b();
                        u6h.C((u6h) s6hVar.b, i);
                        u6h u6hVar = (u6h) s6hVar.a();
                        lqbVar.b = u6hVar;
                        try {
                            lqbVar.K(v5hVar, u6hVar);
                        } catch (Throwable th) {
                            zsg.i("BillingLogger", "Unable to log.", th);
                        }
                    } catch (Throwable th2) {
                        zsg.i("BillingLogger", "Unable to log.", th2);
                    }
                } catch (Throwable th3) {
                    zsg.i("BillingClient", "Unable to log.", th3);
                }
            }

            public final void w(tx0 tx0Var, z5h z5hVar) {
                try {
                    int i = hwg.a;
                    l5h l5hVar = (l5h) hwg.b(z5hVar, 6, tx0Var, null, j6h.BROADCAST_ACTION_UNSPECIFIED).l();
                    g8h g8hVarP = l8h.p();
                    g8hVarP.c(false);
                    g8hVarP.d();
                    l5hVar.d(g8hVarP);
                    u((p5h) l5hVar.a());
                } catch (Throwable th) {
                    zsg.i("BillingClient", "Unable to log.", th);
                }
            }

            public final void x(int i) {
                String str;
                String str2;
                synchronized (this.a) {
                    try {
                        if (this.b == 3) {
                            return;
                        }
                        int i2 = this.b;
                        if (i2 == 0) {
                            str = "DISCONNECTED";
                        } else if (i2 != 1) {
                            str = i2 != 2 ? "CLOSED" : "CONNECTED";
                        } else {
                            str = "CONNECTING";
                        }
                        if (i == 0) {
                            str2 = "DISCONNECTED";
                        } else if (i != 1) {
                            str2 = i != 2 ? "CLOSED" : "CONNECTED";
                        } else {
                            str2 = "CONNECTING";
                        }
                        zsg.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                        this.b = i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            public final void y(px0 px0Var) {
                z5h z5hVar;
                tx0 tx0VarI;
                tx0 tx0Var;
                synchronized (this.a) {
                    try {
                        if (B()) {
                            tx0VarI = i();
                        } else {
                            if (this.b == 1) {
                                zsg.h("BillingClient", "Client is already in the process of connecting to billing service.");
                                z5h z5hVar2 = z5h.BILLING_CLIENT_CONNECTING;
                                tx0Var = swg.c;
                                w(tx0Var, z5hVar2);
                            } else if (this.b == 3) {
                                zsg.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                                z5h z5hVar3 = z5h.BILLING_CLIENT_CLOSED;
                                tx0Var = swg.h;
                                w(tx0Var, z5hVar3);
                            } else {
                                x(1);
                                z();
                                zsg.g("BillingClient", "Starting in-app billing setup.");
                                this.j = new ysg(this, px0Var);
                                ysg ysgVar = this.j;
                                synchronized (ysgVar.d.a) {
                                    nyd nydVar = ysgVar.b;
                                    nydVar.c = 0L;
                                    nydVar.b = false;
                                    nydVar.g();
                                }
                                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                                intent.setPackage("com.android.vending");
                                List<ResolveInfo> listQueryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                    z5hVar = z5h.INTENT_SERVICE_NOT_FOUND;
                                } else {
                                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                    if (serviceInfo != null) {
                                        String str = serviceInfo.packageName;
                                        String str2 = serviceInfo.name;
                                        if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                            z5hVar = z5h.INVALID_PHONESKY_PACKAGE;
                                            zsg.h("BillingClient", "The device doesn't have valid Play Store.");
                                        } else {
                                            ComponentName componentName = new ComponentName(str, str2);
                                            Intent intent2 = new Intent(intent);
                                            intent2.setComponent(componentName);
                                            intent2.putExtra("playBillingLibraryVersion", this.c);
                                            synchronized (this.a) {
                                                try {
                                                    if (this.b == 2) {
                                                        tx0VarI = i();
                                                    } else if (this.b != 1) {
                                                        zsg.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                        z5h z5hVar4 = z5h.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                        tx0Var = swg.h;
                                                        w(tx0Var, z5hVar4);
                                                    } else {
                                                        ysg ysgVar2 = this.j;
                                                        if (this.g.bindService(intent2, ysgVar2, 1)) {
                                                            zsg.g("BillingClient", "Service was bonded successfully.");
                                                            tx0VarI = null;
                                                        } else {
                                                            z5hVar = z5h.BILLING_SERVICE_BLOCKED;
                                                            zsg.h("BillingClient", "Connection to Billing service is blocked.");
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                        }
                                    } else {
                                        z5hVar = z5h.INVALID_PHONESKY_PACKAGE;
                                        zsg.h("BillingClient", "The device doesn't have valid Play Store.");
                                    }
                                }
                                x(0);
                                zsg.g("BillingClient", "Billing service unavailable on device.");
                                tx0 tx0Var2 = swg.a;
                                w(tx0Var2, z5hVar);
                                tx0VarI = tx0Var2;
                            }
                            tx0VarI = tx0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (tx0VarI != null) {
                    px0Var.a(tx0VarI);
                }
            }

            public final void z() {
                synchronized (this.a) {
                    if (this.j != null) {
                        try {
                            this.g.unbindService(this.j);
                            this.i = null;
                            this.j = null;
                        } catch (Throwable th) {
                            try {
                                zsg.i("BillingClient", "There was an exception while unbinding service!", th);
                                this.i = null;
                                this.j = null;
                            } catch (Throwable th2) {
                                this.i = null;
                                this.j = null;
                                throw th2;
                            }
                        }
                    }
                }
            }

            public ox0(yx4 yx4Var, Context context, nx0 nx0Var) {
                int i = utg.c;
                this.z = nug.x;
                long jNextLong = new Random().nextLong();
                this.B = Long.valueOf(jNextLong);
                this.C = dsg.a;
                this.c = "9.1.0";
                String strL = l();
                this.d = strL;
                this.g = context.getApplicationContext();
                s6h s6hVarZ = u6h.z();
                s6hVarZ.h();
                if (strL != null) {
                    s6hVarZ.b();
                    u6h.y((u6h) s6hVarZ.b, strL);
                }
                s6hVarZ.g(this.g.getPackageName());
                s6hVarZ.b();
                u6h.D((u6h) s6hVarZ.b, jNextLong);
                s6hVarZ.b();
                u6h.w((u6h) s6hVarZ.b);
                s6hVarZ.c(Build.VERSION.SDK_INT);
                s6hVarZ.f();
                o(s6hVarZ, context);
                try {
                    s6hVarZ.d(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
                } catch (Throwable th) {
                    zsg.i("BillingClient", "Error getting app version code.", th);
                }
                this.h = new lqb(this.g, (u6h) s6hVarZ.a());
                zsg.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
                this.f = new fp3(this.g, null, this.h);
                this.y = yx4Var;
                this.g.getPackageName();
            }
        }
