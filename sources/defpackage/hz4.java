package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hz4 implements y6e, m2b {
    public final HashMap a;
    public ArrayDeque b;

    public hz4() {
        uaf uafVar = uaf.a;
        this.a = new HashMap();
        this.b = new ArrayDeque();
    }

    public final synchronized void a(Executor executor, jz4 jz4Var) {
        try {
            if (!this.a.containsKey(eb3.class)) {
                this.a.put(eb3.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(eb3.class)).put(jz4Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
