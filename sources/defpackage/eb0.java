package defpackage;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eb0 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ AppStartTrace a;

    public eb0(AppStartTrace appStartTrace) {
        this.a = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.a.I0++;
    }
}
