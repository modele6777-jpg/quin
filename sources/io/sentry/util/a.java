package io.sentry.util;

import defpackage.ud0;
import io.sentry.l1;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements l1 {
    public static final /* synthetic */ long b = ud0.a.objectFieldOffset(a.class.getDeclaredField("a"));
    public volatile ReentrantLock a;

    public final void b() {
        h().lock();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.a;
        b.r(reentrantLock, "close() called before acquire()");
        reentrantLock.unlock();
    }

    public final ReentrantLock h() {
        ReentrantLock reentrantLock = this.a;
        if (reentrantLock != null) {
            return reentrantLock;
        }
        ReentrantLock reentrantLock2 = new ReentrantLock();
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = b;
            a aVar = this;
            if (unsafe.compareAndSwapObject(aVar, j, (Object) null, reentrantLock2)) {
                return reentrantLock2;
            }
            if (unsafe.getObjectVolatile(aVar, j) != null) {
                ReentrantLock reentrantLock3 = aVar.a;
                b.r(reentrantLock3, "lock must have been set by the winning thread");
                return reentrantLock3;
            }
            this = aVar;
        }
    }
}
