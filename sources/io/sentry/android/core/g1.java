package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.a5;
import io.sentry.q4;
import io.sentry.q5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends ConnectivityManager.NetworkCallback {
    public final o0 a;
    public NetworkCapabilities b = null;
    public long c = 0;
    public final a5 d;

    public g1(o0 o0Var, a5 a5Var) {
        this.a = o0Var;
        io.sentry.util.b.r(a5Var, "SentryDateProvider is required");
        this.d = a5Var;
    }

    public static io.sentry.g a(String str) {
        io.sentry.g gVar = new io.sentry.g();
        gVar.e = "system";
        gVar.g = "network.event";
        gVar.d(str, "action");
        gVar.w = q5.INFO;
        return gVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        q4.b().i(a("NETWORK_AVAILABLE"), new io.sentry.l0());
        this.b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        f1 f1Var;
        long jD = this.d.a().d();
        NetworkCapabilities networkCapabilities2 = this.b;
        long j = this.c;
        o0 o0Var = this.a;
        if (networkCapabilities2 == null) {
            f1Var = new f1(networkCapabilities, o0Var, jD);
        } else {
            f1 f1Var2 = new f1(networkCapabilities2, o0Var, j);
            f1Var = new f1(networkCapabilities, o0Var, jD);
            int iAbs = Math.abs(f1Var2.c - f1Var.c);
            int i = f1Var.a;
            int i2 = f1Var2.a;
            int iAbs2 = Math.abs(i2 - i);
            int i3 = f1Var.b;
            int i4 = f1Var2.b;
            int iAbs3 = Math.abs(i4 - i3);
            boolean z = ((double) Math.abs(f1Var2.d - f1Var.d)) / 1000000.0d < 5000.0d;
            boolean z2 = z || iAbs <= 5;
            boolean z3 = z || ((double) iAbs2) <= Math.max(1000.0d, ((double) Math.abs(i2)) * 0.1d);
            boolean z4 = z || ((double) iAbs3) <= Math.max(1000.0d, ((double) Math.abs(i4)) * 0.1d);
            if (f1Var2.e == f1Var.e && f1Var2.f.equals(f1Var.f) && z2 && z3 && z4) {
                f1Var = null;
            }
        }
        if (f1Var == null) {
            return;
        }
        this.b = networkCapabilities;
        this.c = jD;
        io.sentry.g gVarA = a("NETWORK_CAPABILITIES_CHANGED");
        gVarA.d(Integer.valueOf(f1Var.a), "download_bandwidth");
        gVarA.d(Integer.valueOf(f1Var.b), "upload_bandwidth");
        gVarA.d(Boolean.valueOf(f1Var.e), "vpn_active");
        gVarA.d(f1Var.f, "network_type");
        int i5 = f1Var.c;
        if (i5 != 0) {
            gVarA.d(Integer.valueOf(i5), "signal_strength");
        }
        io.sentry.l0 l0Var = new io.sentry.l0();
        l0Var.d(f1Var, "android:networkCapabilities");
        q4.b().i(gVarA, l0Var);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        q4.b().i(a("NETWORK_LOST"), new io.sentry.l0());
        this.b = null;
    }
}
