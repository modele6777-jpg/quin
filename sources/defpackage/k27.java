package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import io.sentry.android.core.internal.util.b;
import io.sentry.q5;
import io.sentry.r0;
import io.sentry.s0;
import io.sentry.util.a;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k27 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public k27(kz8 kz8Var) {
        this.a = 0;
        this.b = kz8Var;
    }

    public void a() {
        ((b) this.b).y.set(false);
        a aVar = ((b) this.b).f;
        aVar.b();
        try {
            ((b) this.b).v = null;
            ((b) this.b).w = null;
            b bVar = (b) this.b;
            bVar.d.getClass();
            bVar.x = SystemClock.uptimeMillis();
            ((b) this.b).b.getLogger().i(q5.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
            Iterator it = ((b) this.b).e.iterator();
            while (it.hasNext()) {
                ((s0) it.next()).u(r0.DISCONNECTED);
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
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 1:
                network.getClass();
                c38.a.e("Network available → trigger legacy import");
                m8b m8bVar = w28.a;
                w28.a((Context) this.b);
                return;
            case 2:
            default:
                super.onAvailable(network);
                return;
            case 3:
                ((b) this.b).w = network;
                if (((b) this.b).y.getAndSet(true)) {
                    return;
                }
                a aVar = b.Y;
                aVar.b();
                try {
                    Iterator it = b.Z.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
                    }
                    aVar.close();
                    return;
                } catch (Throwable th) {
                    try {
                        aVar.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 2:
                network.getClass();
                if (network.equals(((pe9) this.b).f.getActiveNetwork())) {
                    ff8.h().e(oe9.a, "Network blocked status changed: " + z);
                    pe9 pe9Var = (pe9) this.b;
                    Object objA = pe9Var.e;
                    if (objA == null) {
                        objA = pe9Var.a();
                    }
                    ne9 ne9Var = (ne9) objA;
                    pe9 pe9Var2 = (pe9) this.b;
                    synchronized (pe9Var2.g) {
                        if (pe9Var2.h == z) {
                            return;
                        }
                        pe9Var2.h = z;
                        ((pe9) this.b).b(new ne9(ne9Var.a, ne9Var.b, ne9Var.c, ne9Var.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0082 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #3 {all -> 0x008c, blocks: (B:34:0x0072, B:35:0x007c, B:37:0x0082), top: B:73:0x0072 }] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) throws Exception {
        r0 r0VarU;
        a aVar;
        Iterator it;
        switch (this.a) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                ff8.h().e(kag.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((kz8) this.b).d(ol2.a);
                return;
            case 1:
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
            case 2:
                network.getClass();
                networkCapabilities.getClass();
                ff8.h().e(oe9.a, "Network capabilities changed: " + networkCapabilities);
                pe9 pe9Var = (pe9) this.b;
                pe9Var.b(oe9.a(pe9Var.f, pe9Var.h));
                return;
            case 3:
                if (network.equals(((b) this.b).w)) {
                    NetworkCapabilities networkCapabilities2 = ((b) this.b).v;
                    int i = 0;
                    if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                        ((b) this.b).U(networkCapabilities);
                        r0VarU = ((b) this.b).u();
                        aVar = ((b) this.b).f;
                        aVar.b();
                        it = ((b) this.b).e.iterator();
                        while (it.hasNext()) {
                            ((s0) it.next()).u(r0VarU);
                        }
                        aVar.close();
                    } else if (networkCapabilities2 != null || networkCapabilities != null) {
                        int[] iArr = b.F0;
                        int length = iArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                int[] iArr2 = b.E0;
                                int length2 = iArr2.length;
                                while (true) {
                                    if (i < length2) {
                                        int i3 = iArr2[i];
                                        if (networkCapabilities2.hasTransport(i3) == networkCapabilities.hasTransport(i3)) {
                                            i++;
                                        }
                                    }
                                }
                            } else {
                                int i4 = iArr[i2];
                                if (i4 == 0 || networkCapabilities2.hasCapability(i4) == networkCapabilities.hasCapability(i4)) {
                                    i2++;
                                }
                            }
                            ((b) this.b).U(networkCapabilities);
                            r0VarU = ((b) this.b).u();
                            aVar = ((b) this.b).f;
                            aVar.b();
                            try {
                                it = ((b) this.b).e.iterator();
                                while (it.hasNext()) {
                                    ((s0) it.next()).u(r0VarU);
                                }
                                aVar.close();
                            } catch (Throwable th) {
                                try {
                                    aVar.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }
                    a aVar2 = b.Y;
                    aVar2.b();
                    try {
                        Iterator it2 = b.Z.iterator();
                        while (it2.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it2.next()).onCapabilitiesChanged(network, networkCapabilities);
                        }
                        aVar2.close();
                        return;
                    } catch (Throwable th3) {
                        try {
                            aVar2.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) throws Exception {
        switch (this.a) {
            case 0:
                network.getClass();
                ff8.h().e(kag.a, "NetworkRequestConstraintController onLost callback");
                ((kz8) this.b).d(new pl2(7));
                return;
            case 1:
            default:
                super.onLost(network);
                return;
            case 2:
                network.getClass();
                ff8.h().e(oe9.a, "Network connection lost");
                ((pe9) this.b).b(new ne9(false, false, false, false, false));
                return;
            case 3:
                if (network.equals(((b) this.b).w)) {
                    a();
                    a aVar = b.Y;
                    aVar.b();
                    try {
                        Iterator it = b.Z.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                        }
                        aVar.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            aVar.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 3:
                a();
                a aVar = b.Y;
                aVar.b();
                try {
                    Iterator it = b.Z.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
                    }
                    aVar.close();
                    return;
                } catch (Throwable th) {
                    try {
                        aVar.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                super.onUnavailable();
                return;
        }
    }

    public /* synthetic */ k27(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
