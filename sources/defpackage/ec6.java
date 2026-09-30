package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ec6 implements Handler.Callback {
    public static ec6 G0;
    public final sig X;
    public volatile boolean Y;
    public long a;
    public boolean b;
    public ole c;
    public a97 d;
    public final Context e;
    public final ac6 f;
    public final yea g;
    public final AtomicInteger v;
    public final AtomicInteger w;
    public final ConcurrentHashMap x;
    public final od0 y;
    public final od0 z;
    public static final Status Z = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status E0 = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object F0 = new Object();

    public ec6(Context context, Looper looper) {
        ac6 ac6Var = ac6.e;
        this.a = 10000L;
        this.b = false;
        this.v = new AtomicInteger(1);
        this.w = new AtomicInteger(0);
        this.x = new ConcurrentHashMap(5, 0.75f, 1);
        this.y = new od0(0);
        this.z = new od0(0);
        this.Y = true;
        this.e = context;
        sig sigVar = new sig(looper, this);
        Looper.getMainLooper();
        this.X = sigVar;
        this.f = ac6Var;
        this.g = new yea(11);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = m93.q;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            m93.q = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            this.Y = false;
        }
        sigVar.sendMessage(sigVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (F0) {
            try {
                ec6 ec6Var = G0;
                if (ec6Var != null) {
                    ec6Var.w.incrementAndGet();
                    sig sigVar = ec6Var.X;
                    sigVar.sendMessageAtFrontOfQueue(sigVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status d(b70 b70Var, ConnectionResult connectionResult) {
        String str = (String) b70Var.b.c;
        String strValueOf = String.valueOf(connectionResult);
        return new Status(17, ks0.m(new StringBuilder(str.length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), connectionResult.c, connectionResult);
    }

    public static ec6 e(Context context) {
        ec6 ec6Var;
        HandlerThread handlerThread;
        synchronized (F0) {
            ec6Var = G0;
            if (ec6Var == null) {
                synchronized (tch.g) {
                    try {
                        handlerThread = tch.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            tch.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = tch.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = ac6.d;
                ec6 ec6Var2 = new ec6(applicationContext, looper);
                G0 = ec6Var2;
                ec6Var = ec6Var2;
            }
        }
        return ec6Var;
    }

    public final rhg b(zb6 zb6Var) {
        b70 b70Var = zb6Var.f;
        ConcurrentHashMap concurrentHashMap = this.x;
        rhg rhgVar = (rhg) concurrentHashMap.get(b70Var);
        if (rhgVar == null) {
            rhgVar = new rhg(this, zb6Var);
            concurrentHashMap.put(b70Var, rhgVar);
        }
        if (rhgVar.e.r()) {
            this.z.add(b70Var);
        }
        rhgVar.r();
        return rhgVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    public final void c(gle gleVar, int i, zb6 zb6Var) {
        uhg uhgVar;
        ec6 ec6Var;
        if (i != 0) {
            b70 b70Var = zb6Var.f;
            if (f()) {
                n6c n6cVar = (n6c) m6c.A().b;
                boolean z = true;
                if (n6cVar != null) {
                    if (n6cVar.b) {
                        boolean z2 = n6cVar.c;
                        rhg rhgVar = (rhg) this.x.get(b70Var);
                        if (rhgVar != null) {
                            xb6 xb6Var = rhgVar.e;
                            if (xb6Var instanceof yt0) {
                                xb6 xb6Var2 = xb6Var;
                                if (xb6Var2.w == null || xb6Var2.q()) {
                                    z = z2;
                                } else {
                                    ik2 ik2VarA = uhg.a(rhgVar, xb6Var2, i);
                                    if (ik2VarA != null) {
                                        rhgVar.o++;
                                        z = ik2VarA.c;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    uhgVar = null;
                    ec6Var = this;
                }
                ec6Var = this;
                uhgVar = new uhg(ec6Var, i, b70Var, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                uhgVar = null;
                ec6Var = this;
            }
            if (uhgVar != null) {
                gfh gfhVar = gleVar.a;
                sig sigVar = ec6Var.X;
                Objects.requireNonNull(sigVar);
                gfhVar.c(new ft(sigVar, 4), uhgVar);
            }
        }
    }

    public final boolean f() {
        int i;
        if (this.b) {
            return false;
        }
        n6c n6cVar = (n6c) m6c.A().b;
        if (n6cVar != null && !n6cVar.b) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.g.a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final boolean g(ConnectionResult connectionResult, int i) {
        ac6 ac6Var = this.f;
        ac6Var.getClass();
        Context context = this.e;
        if (!x57.Z(context)) {
            int i2 = connectionResult.b;
            PendingIntent activity = connectionResult.c;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = ac6Var.a(i2, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                ac6Var.f(context, i2, PendingIntent.getActivity(context, 0, intent, qig.a | 134217728));
                Integer num = connectionResult.e;
                int iIntValue = num == null ? -1 : num.intValue();
                ohg ohgVar = new ohg(iIntValue, connectionResult.b, System.currentTimeMillis(), context.getPackageName(), false);
                a97 a97Var = ac6Var.c;
                if (a97Var == null) {
                    a97Var = new a97(context, a97.m, k60.h, yb6.c);
                    ac6Var.c = a97Var;
                }
                j27 j27VarB = j27.b();
                j27VarB.d = new za5[]{db6.i};
                j27VarB.a = false;
                j27VarB.c = new fnb(ohgVar);
                a97Var.b(2, j27VarB.a());
                return true;
            }
        }
        return false;
    }

    public final void h(ConnectionResult connectionResult, int i) {
        if (g(connectionResult, i)) {
            return;
        }
        sig sigVar = this.X;
        sigVar.sendMessage(sigVar.obtainMessage(5, i, 0, connectionResult));
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0317  */
    /* JADX WARN: Code duplicated, block: B:159:0x031d  */
    /* JADX WARN: Code duplicated, block: B:161:0x034f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0359  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 rhg, still in use, count: 2, list:
          (r2v11 rhg) from 0x030f: IGET (r2v11 rhg) A[WRAPPED] (LINE:784) rhg.j int
          (r2v11 rhg) from 0x0315: PHI (r2 I:??) = (r2v8 rhg), (r2v11 rhg) binds: [B:155:0x0314, B:209:0x0315] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec6.handleMessage(android.os.Message):boolean");
    }
}
