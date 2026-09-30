package io.sentry.android.core;

import android.app.Activity;
import io.sentry.q3;
import io.sentry.q6;
import io.sentry.r3;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                io.sentry.g1 g1Var = (io.sentry.g1) obj3;
                q3 q3Var = (q3) obj2;
                q6 q6Var = (q6) obj;
                if (((l1) obj4).z.get()) {
                    return;
                }
                r3 r3Var = new r3(q3Var.a, q3Var.b, q3Var.d, q3Var.c, Double.valueOf(q3Var.e), q6Var);
                r3Var.y = q3Var.f;
                g1Var.k(r3Var);
                return;
            default:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    ((AtomicReference) obj3).set(((ScreenshotEventProcessor) obj4).a((Activity) obj2));
                    return;
                } finally {
                    countDownLatch.countDown();
                }
        }
    }
}
