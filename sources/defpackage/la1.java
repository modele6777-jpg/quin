package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class la1 {
    public Object a;
    public pa1 b;
    public qxb c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        qxb qxbVar = this.c;
        if (qxbVar != null) {
            qxbVar.b(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        pa1 pa1Var = this.b;
        boolean z = pa1Var != null && pa1Var.b.k(obj);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        pa1 pa1Var = this.b;
        if (pa1Var == null || !pa1Var.b.cancel(true)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean d(Throwable th) {
        this.d = true;
        pa1 pa1Var = this.b;
        boolean z = pa1Var != null && pa1Var.b.l(th);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        qxb qxbVar;
        pa1 pa1Var = this.b;
        if (pa1Var != null && !pa1Var.b.isDone()) {
            pa1Var.a(new ma1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
        }
        if (this.d || (qxbVar = this.c) == null) {
            return;
        }
        qxbVar.k(null);
    }
}
