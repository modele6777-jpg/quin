package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pf2 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ qf2 a;

    public pf2(qf2 qf2Var) {
        this.a = qf2Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        qf2 qf2Var = this.a;
        qf2Var.g.a.clear();
        ayb aybVar = qf2Var.h;
        synchronized (aybVar) {
            aybVar.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        qf2 qf2Var = this.a;
        qf2Var.g.a.clear();
        ayb aybVar = qf2Var.h;
        synchronized (aybVar) {
            aybVar.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.a.t.a.setValue(Boolean.valueOf(z));
    }
}
