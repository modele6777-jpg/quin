package defpackage;

import io.sentry.android.core.internal.util.o;
import io.sentry.q5;
import timber.log.Timber;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ex2 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ex2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
                break;
            case 1:
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = (Thread.UncaughtExceptionHandler) obj;
                try {
                    nx2 nx2Var = Timber.a;
                    nx2Var.l("Quin:Crash");
                    nx2Var.d(th, "FATAL EXCEPTION on thread \"" + thread.getName() + "\"", new Object[0]);
                    break;
                } catch (Throwable unused) {
                }
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
                break;
            default:
                ((o) obj).c.d(q5.ERROR, "Error during frames measurements.", th);
                break;
        }
    }
}
