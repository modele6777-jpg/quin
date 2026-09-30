package defpackage;

import android.hardware.display.DisplayManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ia4 implements DisplayManager.DisplayListener {
    public final /* synthetic */ ja4 a;

    public ia4(ja4 ja4Var) {
        this.a = ja4Var;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        ja4 ja4Var = this.a;
        synchronized (ja4Var.c) {
            ja4Var.d = null;
            ja4Var.f = null;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        ja4 ja4Var = this.a;
        synchronized (ja4Var.c) {
            ja4Var.d = null;
            ja4Var.f = null;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        ja4 ja4Var = this.a;
        synchronized (ja4Var.c) {
            ja4Var.d = null;
            ja4Var.f = null;
        }
    }
}
