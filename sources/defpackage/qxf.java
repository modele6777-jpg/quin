package defpackage;

import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qxf implements AutoCloseable {
    public final Surface a;
    public final h2e b;
    public final sh0 c = vpf.m(false);
    public final ssg d;

    public qxf(Surface surface, pxf pxfVar, h2e h2eVar) {
        this.a = surface;
        this.b = h2eVar;
        int i = 8;
        ssg ssgVar = Build.VERSION.SDK_INT >= 30 ? new ssg(i, new t52()) : new ssg(i, new m8c(18));
        ((u52) ssgVar.b).b();
        this.d = ssgVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Throwable {
        ((u52) this.d.b).close();
        sh0 sh0Var = this.c;
        sh0Var.getClass();
        if (sh0.b.getAndSet(sh0Var, 1) == 1) {
            return;
        }
        this.b.invoke();
    }

    public final void finalize() throws Throwable {
        ((u52) this.d.b).a();
        close();
    }
}
