package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i7 implements Collection, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;
    private final Collection<Object> collection;
    final io.sentry.util.a lock = new io.sentry.util.a();

    public i7(j jVar) {
        this.collection = jVar;
    }

    public Collection a() {
        return this.collection;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            boolean zAdd = a().add(obj);
            aVar.close();
            return zAdd;
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
    public final boolean addAll(Collection collection) {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            boolean zAddAll = a().addAll(collection);
            aVar.close();
            return zAddAll;
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
    public final void clear() {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            a().clear();
            aVar.close();
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
    public final boolean contains(Object obj) {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            boolean zContains = a().contains(obj);
            aVar.close();
            return zContains;
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
    public final boolean containsAll(Collection collection) {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            boolean zContainsAll = a().containsAll(collection);
            aVar.close();
            return zContainsAll;
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
    public final boolean isEmpty() {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            boolean zIsEmpty = a().isEmpty();
            aVar.close();
            return zIsEmpty;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            boolean zRemove = a().remove(obj);
            aVar.close();
            return zRemove;
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
    public final boolean removeAll(Collection collection) {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            boolean zRemoveAll = a().removeAll(collection);
            aVar.close();
            return zRemoveAll;
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
    public final boolean retainAll(Collection collection) {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            boolean zRetainAll = a().retainAll(collection);
            aVar.close();
            return zRetainAll;
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
    public final int size() {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            int size = a().size();
            aVar.close();
            return size;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String toString() {
        io.sentry.util.a aVar = this.lock;
        aVar.b();
        try {
            String string = a().toString();
            aVar.close();
            return string;
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
