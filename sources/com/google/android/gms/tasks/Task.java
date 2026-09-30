package com.google.android.gms.tasks;

import defpackage.an9;
import defpackage.gfh;
import defpackage.j8e;
import defpackage.kn9;
import defpackage.wm9;
import defpackage.xm9;
import defpackage.yn2;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Task<TResult> {
    public void a(Executor executor, wm9 wm9Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public void b(xm9 xm9Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void c(Executor executor, xm9 xm9Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract gfh d(Executor executor, an9 an9Var);

    public abstract gfh e(Executor executor, kn9 kn9Var);

    public Task f(Executor executor, yn2 yn2Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task g(Executor executor, yn2 yn2Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception h();

    public abstract Object i();

    public abstract Object j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public Task n(j8e j8eVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task o(Executor executor, j8e j8eVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
