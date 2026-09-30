package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v8e implements u8e, Serializable {
    private static final long serialVersionUID = 0;
    public transient Object a = new Object();
    public volatile transient boolean b;
    public transient Object c;
    final u8e delegate;

    public v8e(u8e u8eVar) {
        u8eVar.getClass();
        this.delegate = u8eVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a = new Object();
    }

    @Override // defpackage.u8e
    public final Object get() {
        if (!this.b) {
            synchronized (this.a) {
                try {
                    if (!this.b) {
                        Object obj = this.delegate.get();
                        this.c = obj;
                        this.b = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.b) {
            obj = "<supplier that returned " + this.c + ">";
        } else {
            obj = this.delegate;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
