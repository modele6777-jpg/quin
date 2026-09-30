package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import net.xmind.donut.gp.GooglePay$start$1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fwg extends ox0 {
    public final Context D;
    public volatile int E;
    public volatile wrg F;
    public volatile jhg G;
    public volatile ScheduledExecutorService H;

    public fwg(yx4 yx4Var, Context context, nx0 nx0Var) {
        super(yx4Var, context, nx0Var);
        this.E = 0;
        this.D = context;
    }

    public final synchronized boolean E() {
        return (this.E != 2 || this.F == null || this.G == null) ? false : true;
    }

    public final vwg F(int i) {
        int i2 = 0;
        if (!E()) {
            zsg.h("BillingClientTesting", "Billing Override Service is not ready.");
            G(z5h.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, swg.a(-1, "Billing Override Service connection is disconnected."));
            return new twg(0);
        }
        sug sugVar = new sug(this, i, i2);
        dch dchVar = new dch();
        dchVar.c = new ueh();
        qeh qehVar = new qeh(dchVar);
        dchVar.b = qehVar;
        dchVar.a = sug.class;
        try {
            sugVar.z(dchVar);
            dchVar.a = "billingOverrideService.getBillingOverride";
            return qehVar;
        } catch (Exception e) {
            ezg ezgVar = new ezg(e);
            d8c d8cVar = bbh.f;
            beh behVar = qehVar.b;
            if (d8cVar.x(behVar, null, ezgVar)) {
                bbh.d(behVar);
            }
            return qehVar;
        }
    }

    public final void G(z5h z5hVar, int i, tx0 tx0Var) {
        int i2 = hwg.a;
        p5h p5hVarB = hwg.b(z5hVar, i, tx0Var, null, j6h.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(p5hVarB, "ApiFailure should not be null");
        this.h.A(p5hVarB);
    }

    public final void H(int i) {
        int i2 = hwg.a;
        v5h v5hVarC = hwg.c(i, j6h.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(v5hVarC, "ApiSuccess should not be null");
        lqb lqbVar = this.h;
        lqbVar.getClass();
        try {
            lqbVar.K(v5hVarC, (u6h) lqbVar.b);
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.ox0
    public final void a() {
        synchronized (this) {
            H(27);
            try {
                try {
                    if (this.G != null && this.F != null) {
                        zsg.g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.D.unbindService(this.G);
                        this.G = new jhg(1, this);
                    }
                    this.F = null;
                    if (this.H != null) {
                        this.H.shutdownNow();
                        this.H = null;
                    }
                } catch (RuntimeException e) {
                    zsg.i("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
                this.E = 3;
            } catch (Throwable th) {
                this.E = 3;
                throw th;
            }
        }
        super.a();
    }

    @Override // defpackage.ox0
    public final tx0 b(Activity activity, sx0 sx0Var) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) F(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            G(z5h.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, swg.q);
            zsg.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            G(z5h.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, swg.q);
            zsg.i("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (iIntValue > 0) {
            tx0 tx0VarA = swg.a(iIntValue, "Billing override value was set by a license tester.");
            G(z5h.LICENSE_TESTER_BILLING_OVERRIDE, 2, tx0VarA);
            C(tx0VarA);
            return tx0VarA;
        }
        try {
            return super.b(activity, sx0Var);
        } catch (Exception e3) {
            tx0 tx0Var = swg.f;
            G(z5h.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR, 2, tx0Var);
            zsg.i("BillingClientTesting", "An internal error occurred.", e3);
            return tx0Var;
        }
    }

    @Override // defpackage.ox0
    public final void c(kd9 kd9Var, gi2 gi2Var) {
        ScheduledExecutorService scheduledExecutorService;
        is4 is4Var = new is4(4, gi2Var);
        qe qeVar = new qe(this, kd9Var, gi2Var, false, 7);
        vwg vwgVarF = F(7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.H == null) {
                    this.H = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.H;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!vwgVarF.isDone()) {
            zwg zwgVar = new zwg();
            zwgVar.v = vwgVarF;
            wwg wwgVar = new wwg();
            wwgVar.b = zwgVar;
            zwgVar.w = scheduledExecutorService.schedule(wwgVar, 28500L, timeUnit);
            vwgVarF.c(wwgVar, ewg.a);
            vwgVarF = zwgVar;
        }
        psd psdVar = new psd(this, is4Var, qeVar);
        vwgVarF.c(new lwg(0, vwgVarF, psdVar), f());
    }

    @Override // defpackage.ox0
    public final void e(GooglePay$start$1 googlePay$start$1) {
        synchronized (this) {
            if (E()) {
                zsg.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                H(26);
            } else {
                int i = 1;
                if (this.E == 1) {
                    zsg.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.E == 3) {
                    zsg.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    G(z5h.BILLING_CLIENT_CLOSED, 26, swg.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.E = 1;
                    zsg.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.G = new jhg(i, this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.D;
                    List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    z5h z5hVar = z5h.REASON_UNSPECIFIED;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        z5hVar = z5h.INTENT_SERVICE_NOT_FOUND;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                z5hVar = z5h.BILLING_SERVICE_BLOCKED;
                                zsg.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.G, 1)) {
                                    zsg.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    z5hVar = z5h.BILLING_SERVICE_BLOCKED;
                                    zsg.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                        }
                    }
                    this.E = 0;
                    zsg.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    G(z5hVar, 26, swg.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        y(googlePay$start$1);
    }

    public fwg(yx4 yx4Var, Context context, bo1 bo1Var, nx0 nx0Var) {
        super(yx4Var, context, bo1Var, nx0Var);
        this.E = 0;
        this.D = context;
    }
}
