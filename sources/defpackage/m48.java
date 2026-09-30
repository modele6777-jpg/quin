package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m48 {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public if1 e;

    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x001f, B:10:0x0024, B:12:0x0030, B:13:0x0032, B:15:0x0035, B:38:0x0078, B:39:0x007b, B:44:0x008f, B:45:0x0092, B:48:0x0095, B:49:0x009a, B:20:0x003b, B:21:0x003c, B:22:0x003d, B:23:0x0041, B:25:0x0047, B:27:0x005e, B:30:0x0069, B:31:0x006b, B:33:0x006d, B:34:0x0074, B:37:0x0077, B:32:0x006c, B:14:0x0033), top: B:52:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a(i48 i48Var, hc2 hc2Var, if1 if1Var) {
        Iterator it;
        i48 i48Var2;
        int i;
        synchronized (this.a) {
            try {
                boolean z = true;
                ok8.l(!((List) hc2Var.f).isEmpty());
                this.e = if1Var;
                x48 x48VarE = i48Var.e();
                e(x48VarE);
                l48 l48VarC = c(x48VarE);
                if (l48VarC == null) {
                    return;
                }
                Set set = (Set) this.c.get(l48VarC);
                if1 if1Var2 = this.e;
                if (if1Var2 != null) {
                    synchronized (if1Var2.b) {
                        i = if1Var2.e;
                    }
                    if (i != 2) {
                        it = set.iterator();
                        while (it.hasNext()) {
                            i48Var2 = (i48) this.b.get((kp0) it.next());
                            i48Var2.getClass();
                            if (!i48Var2.equals(i48Var) && !i48Var2.r().isEmpty()) {
                                synchronized (i48Var2.a) {
                                }
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                        }
                    }
                    throw th;
                }
                it = set.iterator();
                while (it.hasNext()) {
                    i48Var2 = (i48) this.b.get((kp0) it.next());
                    i48Var2.getClass();
                    if (!i48Var2.equals(i48Var)) {
                        synchronized (i48Var2.a) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                        }
                    }
                }
                try {
                    i48Var.c(hc2Var);
                    if (((a58) x48VarE.k()).i.compareTo(g48.d) < 0) {
                        z = false;
                    }
                    if (z) {
                        g(x48VarE);
                    }
                } catch (fk1 e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i48 b(x48 x48Var, lk1 lk1Var, u6c u6cVar) {
        synchronized (this.a) {
            try {
                ok8.k("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.b.get(new kp0(System.identityHashCode(x48Var), lk1Var.d)) == null);
                i48 i48Var = new i48(x48Var, lk1Var, u6cVar);
                if (((ArrayList) lk1Var.y()).isEmpty()) {
                    i48Var.s();
                }
                if (((a58) x48Var.k()).i == g48.a) {
                    return i48Var;
                }
                f(i48Var);
                return i48Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final l48 c(x48 x48Var) {
        synchronized (this.a) {
            try {
                for (l48 l48Var : this.c.keySet()) {
                    if (x48Var.equals(l48Var.b)) {
                        return l48Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(x48 x48Var) {
        synchronized (this.a) {
            try {
                l48 l48VarC = c(x48Var);
                if (l48VarC == null) {
                    return false;
                }
                Iterator it = ((Set) this.c.get(l48VarC)).iterator();
                while (it.hasNext()) {
                    i48 i48Var = (i48) this.b.get((kp0) it.next());
                    i48Var.getClass();
                    if (!i48Var.r().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(x48 x48Var) {
        HashMap map;
        wf wfVar;
        l48 l48VarC = c(x48Var);
        if (l48VarC == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Set set = (Set) this.c.get(l48VarC);
        Objects.requireNonNull(set);
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.b;
            if (!zHasNext) {
                break;
            }
            kp0 kp0Var = (kp0) it.next();
            i48 i48Var = (i48) map.get(kp0Var);
            if (i48Var != null) {
                lk1 lk1Var = i48Var.c;
                if (lk1Var.a.a.k() || ((wfVar = lk1Var.b) != null && wfVar.a.k())) {
                    hashSet.add(kp0Var);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        b21.W("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            i48 i48Var2 = (i48) map.get((kp0) it2.next());
            Objects.requireNonNull(i48Var2);
            k(i48Var2);
        }
    }

    public final void f(i48 i48Var) {
        synchronized (this.a) {
            try {
                x48 x48VarE = i48Var.e();
                kp0 kp0Var = new kp0(System.identityHashCode(x48VarE), i48Var.c.d);
                l48 l48VarC = c(x48VarE);
                Set hashSet = l48VarC != null ? (Set) this.c.get(l48VarC) : new HashSet();
                hashSet.add(kp0Var);
                this.b.put(kp0Var, i48Var);
                if (l48VarC == null) {
                    l48 l48Var = new l48(x48VarE, this);
                    this.c.put(l48Var, hashSet);
                    x48VarE.k().a(l48Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003a A[Catch: all -> 0x000b, TryCatch #1 {all -> 0x000b, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000d, B:12:0x0015, B:28:0x0047, B:29:0x004a, B:13:0x001b, B:15:0x001f, B:16:0x0021, B:18:0x0024, B:23:0x002a, B:24:0x002b, B:25:0x002c, B:27:0x003a, B:17:0x0022), top: B:35:0x0003, inners: #0 }] */
    public final void g(x48 x48Var) {
        x48 x48Var2;
        int i;
        synchronized (this.a) {
            try {
                if (d(x48Var)) {
                    if (this.d.isEmpty()) {
                        this.d.push(x48Var);
                    } else {
                        if1 if1Var = this.e;
                        if (if1Var != null) {
                            synchronized (if1Var.b) {
                                i = if1Var.e;
                            }
                            if (i != 2) {
                                x48Var2 = (x48) this.d.peek();
                                if (!x48Var.equals(x48Var2)) {
                                    i(x48Var2);
                                    this.d.remove(x48Var);
                                    this.d.push(x48Var);
                                }
                            }
                        } else {
                            x48Var2 = (x48) this.d.peek();
                            if (!x48Var.equals(x48Var2)) {
                                i(x48Var2);
                                this.d.remove(x48Var);
                                this.d.push(x48Var);
                            }
                        }
                    }
                    m(x48Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(x48 x48Var) {
        synchronized (this.a) {
            try {
                this.d.remove(x48Var);
                i(x48Var);
                if (!this.d.isEmpty()) {
                    m((x48) this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(x48 x48Var) {
        synchronized (this.a) {
            try {
                l48 l48VarC = c(x48Var);
                if (l48VarC == null) {
                    return;
                }
                Iterator it = ((Set) this.c.get(l48VarC)).iterator();
                while (it.hasNext()) {
                    i48 i48Var = (i48) this.b.get((kp0) it.next());
                    i48Var.getClass();
                    i48Var.s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(HashSet hashSet) {
        synchronized (this.a) {
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    i48 i48Var = (i48) this.b.get((kp0) it.next());
                    if (i48Var != null) {
                        i48Var.t();
                        h(i48Var.e());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(i48 i48Var) {
        synchronized (this.a) {
            try {
                x48 x48VarE = i48Var.e();
                kp0 kp0Var = new kp0(System.identityHashCode(x48VarE), i48Var.c.d);
                this.b.remove(kp0Var);
                HashSet hashSet = new HashSet();
                for (l48 l48Var : this.c.keySet()) {
                    if (x48VarE.equals(l48Var.b)) {
                        Set set = (Set) this.c.get(l48Var);
                        set.remove(kp0Var);
                        if (set.isEmpty()) {
                            hashSet.add(l48Var.b);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l((x48) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(x48 x48Var) {
        synchronized (this.a) {
            try {
                l48 l48VarC = c(x48Var);
                if (l48VarC == null) {
                    return;
                }
                h(x48Var);
                Iterator it = ((Set) this.c.get(l48VarC)).iterator();
                while (it.hasNext()) {
                    this.b.remove((kp0) it.next());
                }
                this.c.remove(l48VarC);
                l48VarC.b.k().b(l48VarC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(x48 x48Var) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) this.c.get(c(x48Var))).iterator();
                while (it.hasNext()) {
                    i48 i48Var = (i48) this.b.get((kp0) it.next());
                    i48Var.getClass();
                    if (!i48Var.r().isEmpty()) {
                        i48Var.u();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
