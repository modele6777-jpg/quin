package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Task;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n6h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public n6h(lah lahVar, t8h t8hVar) {
        this.a = 5;
        this.b = t8hVar;
        Objects.requireNonNull(lahVar);
        this.c = lahVar;
    }

    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[Catch: CancellationException -> 0x002e, ExecutionException -> 0x0031, TryCatch #9 {CancellationException -> 0x002e, ExecutionException -> 0x0031, blocks: (B:5:0x0011, B:7:0x0029, B:20:0x003c, B:22:0x004a, B:24:0x0056, B:30:0x0066, B:32:0x006a, B:14:0x0033, B:35:0x00a1, B:16:0x0036, B:19:0x003b, B:28:0x005c, B:29:0x0065), top: B:137:0x0011, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[Catch: CancellationException -> 0x002e, ExecutionException -> 0x0031, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x002e, ExecutionException -> 0x0031, blocks: (B:5:0x0011, B:7:0x0029, B:20:0x003c, B:22:0x004a, B:24:0x0056, B:30:0x0066, B:32:0x006a, B:14:0x0033, B:35:0x00a1, B:16:0x0036, B:19:0x003b, B:28:0x005c, B:29:0x0065), top: B:137:0x0011, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    @Override // java.lang.Runnable
    public final void run() {
        kv kvVar;
        edh edhVar;
        int i = 0;
        switch (this.a) {
            case 0:
                l1h l1hVar = (l1h) this.c;
                synchronized (l1hVar.c) {
                    an9 an9Var = (an9) l1hVar.d;
                    Exception excH = ((Task) this.b).h();
                    oa7.A(excH);
                    an9Var.r(excH);
                    break;
                }
                return;
            case 1:
                c8h c8hVar = (c8h) this.c;
                c8hVar.A0();
                c8hVar.B0();
                Bundle bundle = (Bundle) this.b;
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                oa7.x(string);
                oa7.x(string2);
                oa7.A(bundle.get("value"));
                w3h w3hVar = (w3h) c8hVar.b;
                if (!w3hVar.a()) {
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.Z.a("Conditional property not set since app measurement is disabled");
                    return;
                }
                mch mchVar = new mch(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    qch qchVar = w3hVar.w;
                    w3h.f(qchVar);
                    bundle.getString("app_id");
                    hsg hsgVarI1 = qchVar.i1(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                    w3h.f(qchVar);
                    bundle.getString("app_id");
                    hsg hsgVarI2 = qchVar.i1(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                    bundle.getString("app_id");
                    w3hVar.j().T0(new wog(bundle.getString("app_id"), string2, mchVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), hsgVarI2, bundle.getLong("trigger_timeout"), hsgVarI1, bundle.getLong("time_to_live"), qchVar.i1(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 2:
                c8h c8hVar2 = ((AppMeasurementDynamiteService) this.c).d.X;
                w3h.g(c8hVar2);
                gsg gsgVar = (gsg) this.b;
                c8hVar2.A0();
                c8hVar2.B0();
                gsg gsgVar2 = c8hVar2.e;
                if (gsgVar != gsgVar2) {
                    oa7.C("EventInterceptor already set.", gsgVar2 == null);
                }
                c8hVar2.e = gsgVar;
                return;
            case 3:
                w3h w3hVar2 = (w3h) ((c8h) this.b).b;
                xzg xzgVarL = w3hVar2.l();
                String str = (String) this.c;
                String str2 = xzgVarL.H0;
                boolean z = (str2 == null || str2.equals(str)) ? false : true;
                xzgVarL.H0 = str;
                if (z) {
                    w3hVar2.l().F0();
                    return;
                }
                return;
            case 4:
                lah lahVar = (lah) this.c;
                w3h w3hVar3 = (w3h) lahVar.b;
                hzg hzgVar = lahVar.e;
                if (hzgVar == null) {
                    w0h w0hVar2 = w3hVar3.f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    hzgVar.E((ndh) this.b);
                    break;
                } catch (RemoteException e) {
                    w0h w0hVar3 = w3hVar3.f;
                    w3h.h(w0hVar3);
                    w0hVar3.g.b(e, "Failed to reset data on the service: remote exception");
                }
                lahVar.N0();
                return;
            case 5:
                lah lahVar2 = (lah) this.c;
                hzg hzgVar2 = lahVar2.e;
                w3h w3hVar4 = (w3h) lahVar2.b;
                if (hzgVar2 == null) {
                    w0h w0hVar4 = w3hVar4.f;
                    w3h.h(w0hVar4);
                    w0hVar4.g.a("Failed to send current screen to service");
                    return;
                }
                try {
                    t8h t8hVar = (t8h) this.b;
                    if (t8hVar == null) {
                        hzgVar2.o(0L, null, null, w3hVar4.a.getPackageName());
                    } else {
                        hzgVar2.o(t8hVar.c, t8hVar.a, t8hVar.b, w3hVar4.a.getPackageName());
                    }
                    lahVar2.N0();
                    return;
                } catch (RemoteException e2) {
                    w0h w0hVar5 = ((w3h) lahVar2.b).f;
                    w3h.h(w0hVar5);
                    w0hVar5.g.b(e2, "Failed to send current screen to the service");
                    return;
                }
            case 6:
                gah gahVar = (gah) this.c;
                synchronized (gahVar) {
                    try {
                        gahVar.a = false;
                        lah lahVar3 = gahVar.c;
                        if (!lahVar3.R0()) {
                            w0h w0hVar6 = ((w3h) lahVar3.b).f;
                            w3h.h(w0hVar6);
                            w0hVar6.Z.a("Connected to service");
                            hzg hzgVar3 = (hzg) this.b;
                            lahVar3.A0();
                            lahVar3.e = hzgVar3;
                            lahVar3.N0();
                            lahVar3.P0();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 7:
                odh odhVar = (odh) this.c;
                ech echVar = (ech) this.b;
                int i2 = odhVar.a;
                synchronized (echVar) {
                    SparseArray sparseArray = echVar.e;
                    odh odhVar2 = (odh) sparseArray.get(i2);
                    if (odhVar2 != null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                        sb.append("Timing out request: ");
                        sb.append(i2);
                        b1.l("MessengerIpcClient", sb.toString());
                        sparseArray.remove(i2);
                        odhVar2.c(new seh("Timed out waiting for response", null));
                        echVar.d();
                    }
                    break;
                }
                return;
            case 8:
                ich ichVar = (ich) this.b;
                ichVar.U();
                Runnable runnable = (Runnable) this.c;
                ichVar.Z().A0();
                ArrayList arrayList = ichVar.E0;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    ichVar.E0 = arrayList;
                }
                arrayList.add(runnable);
                ichVar.l();
                return;
            default:
                jch jchVar = (jch) this.b;
                try {
                    idh idhVar = (idh) pa7.T((h5) this.c);
                    kv kvVar2 = new kv(idhVar, new h71(6, 2, 10));
                    boolean z2 = jchVar.d;
                    if (z2 || (kvVar = jchVar.a) == null) {
                        synchronized (jchVar) {
                            if (!z2) {
                                kvVar = jchVar.a;
                                if (kvVar != null) {
                                    if (!if9.t((dpb) kvVar.d, (dpb) kvVar2.d)) {
                                        edhVar = (edh) jchVar.b.e.get();
                                        if (edhVar != null) {
                                            edhVar.b();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            jchVar.a = kvVar2;
                            jchVar.f.a.incrementAndGet();
                        }
                    } else if (!if9.t((dpb) kvVar.d, (dpb) kvVar2.d)) {
                        edhVar = (edh) jchVar.b.e.get();
                        if (edhVar != null) {
                            edhVar.b();
                            return;
                        }
                        return;
                    }
                    if (jchVar.d) {
                        f8h f8hVar = jchVar.b;
                        s9h s9hVar = (s9h) f8hVar.d.get();
                        String strR = idhVar.r();
                        s9hVar.getClass();
                        strR.getClass();
                        e0 e0VarB = s9h.b(s9hVar.a.c(strR));
                        bch bchVar = new bch(i, jchVar);
                        i39 i39VarA = f8hVar.a();
                        f0 f0Var = new f0(e0VarB, Throwable.class, bchVar);
                        e0VarB.b(f0Var, bzd.G(i39VarA, f0Var));
                        return;
                    }
                    return;
                } catch (CancellationException e3) {
                    e = e3;
                    if (e.getCause() instanceof SecurityException) {
                        return;
                    }
                    String str3 = jchVar.c;
                    b1.n("FlagStore", ib8.m(new StringBuilder(String.valueOf(str3).length() + 64), "Unable to update local snapshot for ", str3, ", may result in stale flags."), e);
                    return;
                } catch (ExecutionException e4) {
                    e = e4;
                    if (e.getCause() instanceof SecurityException) {
                        String str4 = jchVar.c;
                        b1.n("FlagStore", ib8.m(new StringBuilder(String.valueOf(str4).length() + 64), "Unable to update local snapshot for ", str4, ", may result in stale flags."), e);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ n6h(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public n6h(g5b g5bVar, ich ichVar, Runnable runnable) {
        this.a = 8;
        this.b = ichVar;
        this.c = runnable;
    }

    public /* synthetic */ n6h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }
}
