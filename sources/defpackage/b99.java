package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b99 {
    public final AtomicReference a = new AtomicReference(null);
    public final f99 b = new f99();

    public static Object a(b99 b99Var, a26 a26Var, zn2 zn2Var) {
        b99Var.getClass();
        return jgb.O(new y89(s89.a, b99Var, a26Var, null), zn2Var);
    }

    public final void b(w89 w89Var) {
        while (true) {
            AtomicReference atomicReference = this.a;
            w89 w89Var2 = (w89) atomicReference.get();
            if (w89Var2 != null && w89Var.a.compareTo(w89Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(w89Var2, w89Var)) {
                    if (w89Var2 != null) {
                        w89Var2.b.h(new u89("Mutation interrupted"));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == w89Var2);
        }
    }
}
