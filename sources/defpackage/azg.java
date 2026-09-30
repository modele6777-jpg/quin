package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class azg {
    public static final Object f = new Object();
    public final String a;
    public final msg b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ azg(String str, Object obj, msg msgVar) {
        this.a = str;
        this.c = obj;
        this.b = msgVar;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (y8c.b == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (w1e.m()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (azg azgVar : bzg.a) {
                        if (w1e.m()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objB = null;
                        try {
                            msg msgVar = azgVar.b;
                            if (msgVar != null) {
                                objB = msgVar.b();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            azgVar.e = objB;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                msg msgVar2 = this.b;
                if (msgVar2 != null) {
                    try {
                        return msgVar2.b();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
