package io.sentry;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j7 extends i7 implements Queue {
    private static final long serialVersionUID = 1;

    @Override // io.sentry.i7
    public final Collection a() {
        return (Queue) super.a();
    }

    @Override // java.util.Queue
    public final Object element() {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            Object objElement = ((Queue) super.a()).element();
            aVar.close();
            return objElement;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            boolean zEquals = ((Queue) super.a()).equals(obj);
            aVar.close();
            return zEquals;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            int iHashCode = ((Queue) super.a()).hashCode();
            aVar.close();
            return iHashCode;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            boolean zOffer = ((Queue) super.a()).offer(obj);
            aVar.close();
            return zOffer;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            Object objPeek = ((Queue) super.a()).peek();
            aVar.close();
            return objPeek;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            Object objPoll = ((Queue) super.a()).poll();
            aVar.close();
            return objPoll;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object remove() {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            Object objRemove = ((Queue) super.a()).remove();
            aVar.close();
            return objRemove;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            Object[] array = ((Queue) super.a()).toArray();
            aVar.close();
            return array;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            Object[] array = ((Queue) super.a()).toArray(objArr);
            aVar.close();
            return array;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
