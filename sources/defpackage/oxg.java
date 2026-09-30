package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class oxg implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ vxg d;

    public oxg(vxg vxgVar, boolean z) {
        Objects.requireNonNull(vxgVar);
        this.d = vxgVar;
        this.a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        vxg vxgVar = this.d;
        if (vxgVar.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            vxgVar.d(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
