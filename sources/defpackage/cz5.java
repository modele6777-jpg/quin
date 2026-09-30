package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cz5 {
    public static final yh0 i;
    public final long a;
    public final long b;
    public final long c;
    public final zy5 d;
    public final c78 e;
    public final zh0 f;
    public final wh0 g;
    public final CopyOnWriteArrayList h;

    static {
        yh0 yh0Var = new yh0();
        yh0Var.a = 0L;
        i = yh0Var;
    }

    public cz5(qtb qtbVar, long j, long j2, Set set) {
        Object next;
        qtbVar.getClass();
        this.a = j;
        this.b = j2;
        yh0 yh0Var = i;
        yh0Var.getClass();
        this.c = yh0.b.incrementAndGet(yh0Var);
        this.d = new zy5(this);
        c78 c78VarW = t72.w();
        Iterator it = qtbVar.W().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i2 = ((e3e) it.next()).a;
            Iterator it2 = set.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((xj1) next).a != i2);
            xj1 xj1Var = (xj1) next;
            if (xj1Var != null) {
                ArrayList arrayList = xj1Var.b;
                wh0 wh0VarN = vpf.n(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    c78VarW.add(new az5(this, i2, ((c3e) arrayList.get(i3)).a, wh0VarN));
                }
            }
        }
        c78 c78VarN = c78VarW.n();
        this.e = c78VarN;
        this.f = vpf.o(bz5.a);
        ArrayList arrayList2 = new ArrayList(t72.u(c78VarN, 10));
        ListIterator listIterator = c78VarN.listIterator(0);
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                this.g = vpf.n(s72.j1(s72.n1(arrayList2)).size());
                this.h = new CopyOnWriteArrayList();
                return;
            }
            arrayList2.add(new e3e(((az5) ql6Var.next()).c));
        }
    }

    public final String toString() {
        return "Frame-" + ((Object) ("FrameId(value=" + this.c + ')')) + '(' + this.a + '@' + this.b + ')';
    }
}
