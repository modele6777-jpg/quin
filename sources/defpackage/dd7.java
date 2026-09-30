package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dd7 implements Executor {
    public static volatile dd7 c;
    public final /* synthetic */ int a;
    public final Object b;

    public dd7(int i) {
        this.a = i;
        switch (i) {
            case 5:
                sig sigVar = new sig(Looper.getMainLooper());
                Looper.getMainLooper();
                this.b = sigVar;
                break;
            default:
                this.b = Executors.newFixedThreadPool(2, new pf1(2));
                break;
        }
    }

    public static Executor a() {
        if (c != null) {
            return c;
        }
        synchronized (dd7.class) {
            try {
                if (c == null) {
                    c = new dd7(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                break;
            case 1:
                ((sig) obj).post(runnable);
                break;
            case 2:
                ((Executor) obj).execute(new ecc(0, runnable));
                break;
            case 3:
                ((bbg) obj).c.post(runnable);
                break;
            case 4:
                m3h m3hVar = ((w3h) ((c8h) obj).b).g;
                w3h.h(m3hVar);
                m3hVar.J0(runnable);
                break;
            default:
                ((sig) obj).post(runnable);
                break;
        }
    }

    public dd7(Looper looper) {
        this.a = 1;
        this.b = new sig(looper, 3);
    }

    public /* synthetic */ dd7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
