package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a9h {
    public static final kd0 a = new kd0(0);

    public static synchronized void a() {
        kd0 kd0Var = a;
        Iterator it = ((id0) kd0Var.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        kd0Var.clear();
    }
}
