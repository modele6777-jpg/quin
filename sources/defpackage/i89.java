package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i89 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;

    public i89(Object obj) {
        this.c = new Object();
        this.a = 0;
        this.b = false;
        this.e = new HashMap();
        this.f = new CopyOnWriteArraySet();
        this.d = new AtomicReference(obj);
    }

    public void a(Executor executor, uk9 uk9Var) {
        e1e e1eVar;
        synchronized (this.c) {
            e1e e1eVar2 = (e1e) ((HashMap) this.e).remove(uk9Var);
            if (e1eVar2 != null) {
                e1eVar2.c.set(false);
                ((CopyOnWriteArraySet) this.f).remove(e1eVar2);
            }
            e1eVar = new e1e((AtomicReference) this.d, executor, uk9Var);
            ((HashMap) this.e).put(uk9Var, e1eVar);
            ((CopyOnWriteArraySet) this.f).add(e1eVar);
        }
        e1eVar.a(0);
    }

    public boolean b(int i, int i2) {
        h09 h09Var = (h09) ((i79) this.d).b(this.a + i);
        h09 h09Var2 = (h09) ((i79) this.e).b(this.a + i2);
        return pa7.t(h09Var, h09Var2) || h09Var.getClass() == h09Var2.getClass();
    }

    public i89(wo0 wo0Var, i09 i09Var, int i, i79 i79Var, i79 i79Var2, boolean z) {
        this.f = wo0Var;
        this.c = i09Var;
        this.a = i;
        this.d = i79Var;
        this.e = i79Var2;
        this.b = z;
    }
}
