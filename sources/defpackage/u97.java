package defpackage;

import ai.askquin.ui.paywall.upgrade.s;
import java.time.Instant;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u97 implements hf8 {
    public static final /* synthetic */ int v = 0;
    public final yt6 a;
    public final aw2 b;
    public final v97 c;
    public final s7 d;
    public final lh5 e;
    public final Object f = new Object();
    public final LinkedHashMap g = new LinkedHashMap(16, 0.75f, true);

    public u97(yt6 yt6Var, aw2 aw2Var, v97 v97Var, s7 s7Var, lh5 lh5Var) {
        this.a = yt6Var;
        this.b = aw2Var;
        this.c = v97Var;
        this.d = s7Var;
        this.e = lh5Var;
    }

    public static boolean f(oyb oybVar) {
        return (oybVar instanceof nyb) || (oybVar instanceof kyb) || (oybVar instanceof jyb);
    }

    public final k97 a(String str) {
        m97 m97VarC;
        str.getClass();
        l97 l97Var = new l97(s7.a(), str);
        synchronized (this.f) {
            m97VarC = c(l97Var);
        }
        if (m97VarC == null) {
            return null;
        }
        Object value = m97VarC.e.getValue();
        nyb nybVar = value instanceof nyb ? (nyb) value : null;
        if (nybVar != null) {
            b(m97VarC, (j97) nybVar.a);
        }
        return k(m97VarC);
    }

    public final void b(m97 m97Var, j97 j97Var) {
        if (!m97Var.g.get() && m97Var.h.compareAndSet(false, true)) {
            ynb.V(this.b, null, null, new n97(this, m97Var, j97Var, null), 3);
        }
    }

    public final m97 c(l97 l97Var) {
        m97 m97Var;
        LinkedHashMap linkedHashMap = this.g;
        m97 m97Var2 = (m97) linkedHashMap.get(l97Var);
        if (m97Var2 != null) {
            return m97Var2;
        }
        if (v4e.Q(l97Var.a) || (m97Var = (m97) linkedHashMap.remove(new l97("", l97Var.b))) == null) {
            return null;
        }
        m97Var.a = l97Var;
        linkedHashMap.put(l97Var, m97Var);
        return m97Var;
    }

    public final boolean e(l97 l97Var) {
        Collection collectionValues = this.g.values();
        collectionValues.getClass();
        Collection<m97> collection = collectionValues;
        if (collection.isEmpty()) {
            return false;
        }
        for (m97 m97Var : collection) {
            if (pa7.t(m97Var.a.b, l97Var.b) && !pa7.t(m97Var.a.a, l97Var.a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(m97 m97Var, oyb oybVar, xn2 xn2Var) {
        q97 q97Var;
        if (xn2Var instanceof q97) {
            q97Var = (q97) xn2Var;
            int i = q97Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                q97Var.label = i - Integer.MIN_VALUE;
            } else {
                q97Var = new q97(this, xn2Var);
            }
        } else {
            q97Var = new q97(this, xn2Var);
        }
        Object obj = q97Var.result;
        Object obj2 = bw2.a;
        int i2 = q97Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            if (oybVar instanceof nyb) {
                l97 l97Var = m97Var.a;
                String str = l97Var.a;
                String str2 = l97Var.b;
                q97Var.L$0 = m97Var;
                q97Var.L$1 = oybVar;
                q97Var.label = 1;
                if (h(str, str2, q97Var) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oyb oybVar2 = (oyb) q97Var.L$1;
            m97 m97Var2 = (m97) q97Var.L$0;
            jzb.q(obj);
            oybVar = oybVar2;
            m97Var = m97Var2;
        }
        m97Var.e.m(oybVar);
        if (!m97Var.f.i(oybVar)) {
            ho7.j(ub3.i("Interpretation response buffer rejected ", m97Var.a.b));
            return null;
        }
        synchronized (this.f) {
            if (this.g.get(m97Var.a) != m97Var) {
                return wef.a;
            }
            if (f(oybVar)) {
                l();
            }
            if (oybVar instanceof nyb) {
                b(m97Var, (j97) ((nyb) oybVar).a);
            }
            return wef.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [u97] */
    /* JADX WARN: Type inference failed for: r4v1, types: [hf8] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final Object h(String str, String str2, zn2 zn2Var) {
        r97 r97Var;
        if (zn2Var instanceof r97) {
            r97Var = (r97) zn2Var;
            int i = r97Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                r97Var.label = i - Integer.MIN_VALUE;
            } else {
                r97Var = new r97(this, zn2Var);
            }
        } else {
            r97Var = new r97(this, zn2Var);
        }
        Object obj = r97Var.result;
        int i2 = r97Var.label;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                lh5 lh5Var = this.e;
                r97Var.L$0 = null;
                r97Var.L$1 = null;
                r97Var.label = 1;
                Object objO = ((s) lh5Var).o(str, str2, r97Var);
                bw2 bw2Var = bw2.a;
                this = objO;
                if (objO == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                this = this;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.d().h("Failed to record five-card reading completion", e2);
        }
        return wef.a;
    }

    public final void i(k97 k97Var) {
        synchronized (this.f) {
            m97 m97VarC = c(new l97(s7.a(), k97Var.b));
            if (m97VarC == null) {
                return;
            }
            if (m97VarC.b.equals(k97Var.a)) {
                if (m97VarC.e.getValue() instanceof kyb) {
                }
            }
        }
    }

    public final m97 j(l97 l97Var, String str) {
        String strI = ib8.i();
        Instant instantNow = Instant.now();
        instantNow.getClass();
        m97 m97Var = new m97(l97Var, strI, str, instantNow);
        this.g.put(l97Var, m97Var);
        boolean zQ = v4e.Q(l97Var.a);
        aw2 aw2Var = this.b;
        if (zQ) {
            ynb.V(aw2Var, null, null, new p97(this, m97Var, null), 3);
        }
        ynb.V(aw2Var, null, null, new s97(this, l97Var, m97Var, null), 3);
        l();
        return m97Var;
    }

    public final k97 k(m97 m97Var) {
        String str = m97Var.b;
        l97 l97Var = m97Var.a;
        return new k97(str, l97Var.a, l97Var.b, m97Var.c, m97Var.d, new ybc(new yl5(m97Var.f, new t97(this, null), null)));
    }

    public final void l() {
        Object next;
        boolean z;
        while (true) {
            LinkedHashMap linkedHashMap = this.g;
            if (linkedHashMap.size() <= 16) {
                return;
            }
            Set setEntrySet = linkedHashMap.entrySet();
            setEntrySet.getClass();
            Iterator it = setEntrySet.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Map.Entry entry = (Map.Entry) next;
                entry.getClass();
                Object value = entry.getValue();
                value.getClass();
                m97 m97Var = (m97) value;
                oyb oybVar = (oyb) m97Var.e.getValue();
                if (oybVar instanceof nyb) {
                    z = m97Var.g.get();
                } else if ((oybVar instanceof kyb) || (oybVar instanceof jyb)) {
                    z = true;
                } else {
                    if (!(oybVar instanceof lyb) && !(oybVar instanceof myb) && oybVar != null) {
                        ap.c();
                        return;
                    }
                    z = false;
                }
            } while (!z);
            Map.Entry entry2 = (Map.Entry) next;
            if (entry2 == null) {
                return;
            } else {
                linkedHashMap.remove(entry2.getKey());
            }
        }
    }
}
