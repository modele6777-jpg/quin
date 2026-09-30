package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface qh2 {
    static void o(k79 k79Var, qh2 qh2Var, qh2 qh2Var2, no0 no0Var) {
        if (!Objects.equals(no0Var, ew6.N)) {
            k79Var.n(no0Var, qh2Var2.i(no0Var), qh2Var2.c(no0Var));
            return;
        }
        nxb nxbVar = (nxb) qh2Var2.a(no0Var, null);
        nxb nxbVar2 = (nxb) qh2Var.a(no0Var, null);
        ph2 ph2VarI = qh2Var2.i(no0Var);
        if (nxbVar == null) {
            nxbVar = nxbVar2;
        } else if (nxbVar2 != null) {
            af8 af8Var = nxbVar2.a;
            ndb ndbVar = nxbVar2.b;
            int i = nxbVar2.c;
            af8 af8Var2 = nxbVar.a;
            if (af8Var2 != null) {
                af8Var = af8Var2;
            }
            ndb ndbVar2 = nxbVar.b;
            if (ndbVar2 != null) {
                ndbVar = ndbVar2;
            }
            int i2 = nxbVar.c;
            if (i2 != 0) {
                i = i2;
            }
            nxbVar = new nxb(af8Var, ndbVar, i);
        }
        k79Var.n(no0Var, ph2VarI, nxbVar);
    }

    static bs9 q(qh2 qh2Var, qh2 qh2Var2) {
        if (qh2Var == null && qh2Var2 == null) {
            return bs9.c;
        }
        k79 k79VarM = qh2Var2 != null ? k79.m(qh2Var2) : k79.j();
        if (qh2Var != null) {
            Iterator it = qh2Var.b().iterator();
            while (it.hasNext()) {
                o(k79VarM, qh2Var2, qh2Var, (no0) it.next());
            }
        }
        return bs9.d(k79VarM);
    }

    Object a(no0 no0Var, Object obj);

    Set b();

    Object c(no0 no0Var);

    Set e(no0 no0Var);

    Object f(no0 no0Var, ph2 ph2Var);

    void g(bo1 bo1Var);

    boolean h(no0 no0Var);

    ph2 i(no0 no0Var);
}
