package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m3b {
    public static final AtomicReference a = new AtomicReference();
    public static final Handler b = new Handler(Looper.getMainLooper());

    public static boolean a(q3b q3bVar) throws InterruptedException {
        Object dzbVar;
        AtomicReference atomicReference = a;
        l3b l3bVar = (l3b) atomicReference.get();
        if (l3bVar != null) {
            if (!pa7.t(Looper.myLooper(), Looper.getMainLooper())) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                imb imbVar = new imb();
                ns4 ns4Var = new ns4(atomicBoolean, l3bVar, imbVar, countDownLatch, q3bVar, 1);
                Handler handler = b;
                handler.post(ns4Var);
                boolean zAwait = countDownLatch.await(2L, TimeUnit.SECONDS);
                if (!zAwait) {
                    atomicBoolean.set(false);
                    handler.removeCallbacks(ns4Var);
                }
                if (zAwait && imbVar.element) {
                    return true;
                }
            } else if (atomicReference.get() == l3bVar) {
                try {
                    l3bVar.b.d(q3bVar);
                    dzbVar = wef.a;
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                return !(dzbVar instanceof dzb);
            }
        }
        return false;
    }
}
