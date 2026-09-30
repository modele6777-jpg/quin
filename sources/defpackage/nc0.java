package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nc0 extends fbc {
    public static volatile nc0 b;
    public static final mc0 c = new mc0(0);
    public final gt3 a = new gt3();

    public static nc0 o() {
        if (b != null) {
            return b;
        }
        synchronized (nc0.class) {
            try {
                if (b == null) {
                    b = new nc0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final void p(Runnable runnable) {
        gt3 gt3Var = this.a;
        if (gt3Var.c == null) {
            synchronized (gt3Var.a) {
                try {
                    if (gt3Var.c == null) {
                        gt3Var.c = gt3.o(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        gt3Var.c.post(runnable);
    }
}
