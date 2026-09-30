package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qy5 implements AutoCloseable {
    public final Object a = new Object();
    public final ad0 b = new ad0();
    public boolean c;

    public final void b(ctb ctbVar) {
        ctbVar.getClass();
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                Iterator it = this.b.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            Iterator<E> it = this.b.iterator();
            if (it.hasNext()) {
                throw kv2.g(it);
            }
            this.b.clear();
        }
    }
}
