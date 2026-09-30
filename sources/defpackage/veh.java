package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class veh implements g1b, mx6 {
    public static veh f;
    public static HandlerThread g;
    public static Handler v;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public veh(Bundle bundle) {
        this.a = 6;
        bundle.getClass();
        this.c = fdc.n("nav-entry-state:id", bundle);
        this.b = fdc.k("nav-entry-state:destination-id", bundle);
        this.d = fdc.l("nav-entry-state:args", bundle);
        this.e = fdc.l("nav-entry-state:saved-state", bundle);
    }

    public static void d(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    public static synchronized veh i(Context context) {
        veh vehVar;
        vehVar = f;
        if (vehVar == null) {
            vehVar = new veh(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new z99("MessengerIpcClient"))));
            f = vehVar;
        }
        return vehVar;
    }

    @Override // defpackage.mx6
    public int a() {
        une uneVar = (une) this.d;
        return uneVar != null ? uneVar.c.length() : ((z2f) this.c).d().c.length();
    }

    @Override // defpackage.mx6
    public long b(long j) {
        z2f z2fVar = (z2f) this.c;
        return z2fVar.c != null ? z2fVar.e(j) : j;
    }

    @Override // defpackage.mx6
    public long c(long j) {
        z2f z2fVar = (z2f) this.c;
        return z2fVar.c != null ? z2fVar.f(j) : j;
    }

    public boolean e() {
        z2f z2fVar = (z2f) this.c;
        p89 p89Var = (p89) this.e;
        int i = this.b - 1;
        this.b = i;
        if (i == 0 && p89Var.c != 0) {
            use useVar = z2fVar.a;
            u47 u47Var = z2fVar.b;
            useVar.b.a().v();
            une uneVar = useVar.b;
            if (z2fVar.c == null) {
                this.d = uneVar;
            }
            Object[] objArr = p89Var.a;
            int i2 = p89Var.c;
            for (int i3 = 0; i3 < i2; i3++) {
                ((a26) objArr[i3]).d(uneVar);
            }
            z2fVar.l(uneVar);
            useVar.b(u47Var, false, fpe.a);
            useVar.g(true);
            useVar.f(useVar.b.e);
            p89Var.g();
        }
        return this.b > 0;
    }

    public String f() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.d)[i2];
            if (obj instanceof nyc) {
                nyc nycVar = (nyc) obj;
                boolean zT = pa7.t(nycVar.g(), g5e.d);
                int[] iArr = (int[]) this.e;
                if (!zT) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(nycVar.f(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.e)[i2]);
                    sb.append("]");
                }
            } else if (obj == hj6.M0) {
                sb.append("[<debug info disabled>]");
            } else if (obj != qk6.H0) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void g() {
        HandlerThread handlerThread;
        synchronized (this.c) {
            try {
                pa7.J(this.b > 0);
                int i = this.b - 1;
                this.b = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.e) != null) {
                    handlerThread.quit();
                    this.e = null;
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.h1b
    public Object get() {
        n23 n23Var = (n23) this.c;
        p23 p23Var = (p23) this.e;
        o23 o23Var = (o23) this.d;
        int i = this.b;
        switch (i) {
            case 0:
                ckf ckfVar = (ckf) p23Var.b.get();
                lkf lkfVar = (lkf) o23Var.k.get();
                if (p23Var.c.get() == null) {
                    return new xif(ckfVar, lkfVar, (ajf) p23Var.l.get(), p23Var.j, p23Var.i, p23Var.h);
                }
                r3.f();
                return null;
            case 1:
                rif rifVar = p23Var.a;
                aj1 aj1Var = (aj1) o23Var.y.get();
                rifVar.getClass();
                aj1Var.getClass();
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                }
                return new ckf(new qif(rifVar, 0), aj1Var, rifVar.b, new qif(rifVar, 1));
            case 2:
                p23Var.a.getClass();
                return null;
            case 3:
                return new jv3(p23Var.k, (lkf) o23Var.k.get());
            case 4:
                return new pjf(p23Var.h, p23Var.e, (ckf) p23Var.b.get(), p23Var.j, (lkf) o23Var.k.get(), (uk1) n23Var.a.f);
            case 5:
                g1b g1bVar = p23Var.f;
                g1b g1bVar2 = p23Var.g;
                g1bVar.getClass();
                g1bVar2.getClass();
                if (ao1.f) {
                    Object obj = g1bVar2.get();
                    obj.getClass();
                    return (pm1) obj;
                }
                Object obj2 = g1bVar.get();
                obj2.getClass();
                return (pm1) obj2;
            case 6:
                km1 km1Var = (km1) p23Var.d.get();
                xi5 xi5Var = (xi5) o23Var.r.get();
                s0f s0fVar = (s0f) o23Var.q.get();
                yuf yufVar = (yuf) o23Var.u.get();
                lkf lkfVar2 = (lkf) o23Var.k.get();
                w92 w92Var = (w92) o23Var.m.get();
                ui1 ui1Var = (ui1) o23Var.j.get();
                mf1 mf1VarA = o23Var.c.a();
                na7 na7Var = (na7) o23Var.E.get();
                ui1Var.getClass();
                na7Var.getClass();
                return new xn1(km1Var, xi5Var, s0fVar, yufVar, lkfVar2, w92Var, ui1Var.a().a(UseTorchAsFlashQuirk.class) ? new skf(ui1Var, mf1VarA, na7Var) : af8.L0, (gh1) o23Var.e.get(), p23Var.e, (ckf) p23Var.b.get());
            case 7:
                return new km1((gh1) o23Var.e.get(), (ckf) p23Var.b.get(), (ceg) o23Var.f.get(), (lkf) o23Var.k.get(), o23Var.a());
            case 8:
                return new ujf((ckf) p23Var.b.get(), o23Var.a());
            case 9:
                return new ao1((gh1) o23Var.e.get(), p23Var.f, (lkf) o23Var.k.get(), (s0f) o23Var.q.get());
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                lkf lkfVar3 = (lkf) o23Var.k.get();
                hh1 hh1Var = (hh1) n23Var.a.c;
                nk8.o(hh1Var);
                ui1 ui1Var2 = (ui1) o23Var.j.get();
                ui1Var2.getClass();
                k9b k9bVarA = ui1Var2.a();
                return new kkf(lkfVar3, hh1Var, (k9bVarA.a(ConfigureSurfaceToSecondarySessionFailQuirk.class) || k9bVarA.a(PreviewOrientationIncorrectQuirk.class) || k9bVarA.a(TextureViewIsClosedQuirk.class)) ? new fz3(11) : hj6.Q0, (c0d) p23Var.i.get());
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return p23Var.a.c;
            default:
                throw new AssertionError(i);
        }
    }

    public void h() {
        int i = this.b * 2;
        this.d = Arrays.copyOf((Object[]) this.d, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        qd0.c0(0, 0, 14, (int[]) this.e, iArr);
        this.e = iArr;
    }

    public synchronized gfh j(odh odhVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(odhVar.toString()));
            }
            if (!((ech) this.e).a(odhVar)) {
                ech echVar = new ech(this);
                this.e = echVar;
                echVar.a(odhVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return odhVar.b.a;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return f();
            default:
                return super.toString();
        }
    }

    public veh(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = 0;
        this.e = new ech(this);
        this.b = 1;
        this.d = scheduledExecutorService;
        this.c = context.getApplicationContext();
    }

    public veh(dh7 dh7Var) {
        this.a = 5;
        this.c = dh7Var;
        this.d = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.e = iArr;
        this.b = -1;
    }

    public veh(da9 da9Var, int i) {
        this.a = 6;
        this.c = da9Var.f;
        this.b = i;
        fa9 fa9Var = da9Var.v;
        this.d = fa9Var.a();
        Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
        this.e = bundleR;
        fa9Var.h.q(bundleR);
    }

    public /* synthetic */ veh(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public veh() {
        this.a = 7;
        this.c = new Object();
        this.d = null;
        this.e = null;
        this.b = 0;
    }

    public veh(z2f z2fVar) {
        this.a = 3;
        this.c = z2fVar;
        this.e = new p89(0, new a26[16]);
    }

    public veh(int i, i41 i41Var, pv2 pv2Var, wj5 wj5Var) {
        this.a = 8;
        this.c = wj5Var;
        this.b = i;
        this.d = i41Var;
        this.e = pv2Var;
    }

    public veh(int i) {
        this.a = 4;
        this.c = new SparseIntArray[9];
        this.d = new ArrayList();
        this.e = new vy5(this);
        this.b = i;
    }
}
