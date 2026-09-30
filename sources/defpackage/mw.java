package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mw extends sv2 {
    public static final ace X = new ace(new q(22));
    public static final kw Y = new kw(0);
    public final Choreographer c;
    public final Handler d;
    public boolean w;
    public boolean x;
    public final ow z;
    public final Object e = new Object();
    public final ad0 f = new ad0();
    public ArrayList g = new ArrayList();
    public ArrayList v = new ArrayList();
    public final lw y = new lw(this);

    public mw(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.z = new ow(choreographer, this);
    }

    @Override // defpackage.sv2
    public final void Z0(pv2 pv2Var, Runnable runnable) {
        synchronized (this.e) {
            this.f.addLast(runnable);
            if (!this.w) {
                this.w = true;
                this.d.post(this.y);
                if (!this.x) {
                    this.x = true;
                    this.c.postFrameCallback(this.y);
                }
            }
        }
    }

    public final void d1() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.e) {
                ad0 ad0Var = this.f;
                runnable = (Runnable) (ad0Var.isEmpty() ? null : ad0Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.e) {
                    ad0 ad0Var2 = this.f;
                    runnable = (Runnable) (ad0Var2.isEmpty() ? null : ad0Var2.removeFirst());
                }
            }
            synchronized (this.e) {
                if (this.f.isEmpty()) {
                    z = false;
                    this.w = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
