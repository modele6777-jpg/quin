package defpackage;

import io.sentry.android.core.b1;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ui8 extends FutureTask {
    public final /* synthetic */ int a = 1;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui8(eh0 eh0Var, yg6 yg6Var) {
        super(yg6Var);
        this.b = eh0Var;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.a) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((vi8) this.b).d((ti8) get());
                        } catch (InterruptedException | ExecutionException e) {
                            ((vi8) this.b).d(new ti8(e));
                        }
                        break;
                    }
                    return;
                } finally {
                    this.b = null;
                }
            default:
                eh0 eh0Var = (eh0) this.b;
                AtomicBoolean atomicBoolean = eh0Var.d;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    eh0Var.a(obj);
                    return;
                } catch (InterruptedException e2) {
                    b1.m(e2, "AsyncTask");
                    return;
                } catch (CancellationException unused) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    eh0Var.a(null);
                    return;
                } catch (ExecutionException e3) {
                    cva.q("An error occurred while executing doInBackground()", e3.getCause());
                    return;
                } catch (Throwable th) {
                    cva.q("An error occurred while executing doInBackground()", th);
                    return;
                }
        }
    }

    public /* synthetic */ ui8(Callable callable) {
        super(callable);
    }
}
