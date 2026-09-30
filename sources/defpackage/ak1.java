package defpackage;

import android.util.Log;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ak1 implements AutoCloseable {
    public final Surface a;
    public final int b;
    public final sh0 c;
    public final /* synthetic */ bk1 d;

    public ak1(bk1 bk1Var, Surface surface) {
        surface.getClass();
        this.d = bk1Var;
        this.a = surface;
        wh0 wh0Var = bk1.d;
        wh0Var.getClass();
        this.b = wh0.b.incrementAndGet(wh0Var);
        this.c = vpf.m(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Surface surface;
        List<kkf> listJ1;
        if (this.c.a()) {
            bk1 bk1Var = this.d;
            synchronized (bk1Var.a) {
                surface = this.a;
                Integer num = (Integer) bk1Var.b.get(surface);
                if (num == null) {
                    throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                }
                int iIntValue = num.intValue() - 1;
                bk1Var.b.put(surface, Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    listJ1 = s72.j1(bk1Var.c);
                    bk1Var.b.remove(surface);
                } else {
                    listJ1 = null;
                }
            }
            if (listJ1 != null) {
                for (kkf kkfVar : listJ1) {
                    kkfVar.getClass();
                    surface.getClass();
                    synchronized (kkfVar.e) {
                        try {
                            lu3 lu3Var = (lu3) kkfVar.g.remove(surface);
                            if (lu3Var != null) {
                                if (b21.F(3, "CXCP")) {
                                    Log.d("CXCP", "SurfaceInactive " + lu3Var + " in " + kkfVar);
                                }
                                kkfVar.c.f(lu3Var);
                                try {
                                    lu3Var.b();
                                } catch (IllegalStateException e) {
                                    if (b21.F(5, "CXCP")) {
                                        b1.n("CXCP", "Error when " + surface + " going to decrease the use count.", e);
                                    }
                                }
                                kkfVar.e();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SurfaceToken-" + this.b;
    }
}
