package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ewf {
    public final fwf a = new fwf();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        fwf fwfVar = this.a;
        if (fwfVar.d) {
            fwf.a(autoCloseable);
            return;
        }
        synchronized (fwfVar.a) {
            autoCloseable2 = (AutoCloseable) fwfVar.b.put(str, autoCloseable);
        }
        fwf.a(autoCloseable2);
    }

    public final void b() {
        fwf fwfVar = this.a;
        if (!fwfVar.d) {
            fwfVar.d = true;
            synchronized (fwfVar.a) {
                try {
                    Iterator it = fwfVar.b.values().iterator();
                    while (it.hasNext()) {
                        fwf.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = fwfVar.c.iterator();
                    while (it2.hasNext()) {
                        fwf.a((AutoCloseable) it2.next());
                    }
                    fwfVar.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        fwf fwfVar = this.a;
        synchronized (fwfVar.a) {
            autoCloseable = (AutoCloseable) fwfVar.b.get(str);
        }
        return autoCloseable;
    }

    public void e() {
    }
}
