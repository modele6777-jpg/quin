package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hbg {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = ud0.a;
        f = unsafe.objectFieldOffset(hbg.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(hbg.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(hbg.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(hbg.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(hbg.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(hbg.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final fle a(fle fleVar) {
        if (b() == 127) {
            return fleVar;
        }
        if (fleVar.b) {
            c.incrementAndGet(this);
        }
        int intVolatile = ud0.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, fleVar);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return ud0.a.getIntVolatile(this, g) - ud0.a.getIntVolatile(this, e);
    }

    public final fle c() {
        fle fleVar;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            hbg hbgVar = this;
            if (unsafe.compareAndSwapInt(hbgVar, j, intVolatile, intVolatile + 1) && (fleVar = (fle) hbgVar.a.getAndSet(i, null)) != null) {
                if (fleVar.b) {
                    c.decrementAndGet(hbgVar);
                }
                return fleVar;
            }
            this = hbgVar;
        }
    }

    public final fle d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        fle fleVar = (fle) atomicReferenceArray.get(i2);
        if (fleVar != null && fleVar.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, fleVar, null)) {
                if (atomicReferenceArray.get(i2) != fleVar) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return fleVar;
        }
        return null;
    }
}
