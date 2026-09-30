package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pe9 extends gl2 {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final k27 i;

    public pe9(Context context, bbg bbgVar) {
        super(context, bbgVar);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new Object();
        this.i = new k27(2, this);
    }

    @Override // defpackage.gl2
    public final Object a() {
        return oe9.a(this.f, this.h);
    }

    @Override // defpackage.gl2
    public final void c() {
        try {
            ff8.h().e(oe9.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f;
            k27 k27Var = this.i;
            connectivityManager.getClass();
            k27Var.getClass();
            connectivityManager.registerDefaultNetworkCallback(k27Var);
        } catch (IllegalArgumentException e) {
            ff8.h().g(oe9.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            ff8.h().g(oe9.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.gl2
    public final void d() {
        try {
            ff8.h().e(oe9.a, "Unregistering network callback");
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException e) {
            ff8.h().g(oe9.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            ff8.h().g(oe9.a, "Received exception while unregistering network callback", e2);
        }
    }
}
