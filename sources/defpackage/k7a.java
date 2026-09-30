package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k7a {
    public static final dd0 a = new dd0(p4e.a, 0);

    public static void a() {
        isa isaVar = xqa.f.a;
        qn2 qn2Var = lw2.a;
        ynb.V(qn2Var, null, null, new z6a(isaVar, "", null), 3);
        ynb.V(qn2Var, null, null, new c7a(xqa.g.a, 0, null), 3);
    }

    public static void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        List listJ1 = s72.j1(s72.n1(s72.Q0(c(), list)));
        hs3 hs3Var = xqa.f;
        String strD = fzc.a.d(a, listJ1);
        ynb.V(lw2.a, null, null, new i7a(hs3Var.a, strD, null), 3);
    }

    public static List c() throws Throwable {
        Object dzbVar;
        hs3 hs3Var = xqa.f;
        Object objI = z5c.I(nu4.a, new j7a(hs3Var.a, hs3Var.b, null));
        String str = (String) (v4e.Q((String) objI) ? null : objI);
        pu4 pu4Var = pu4.a;
        if (str == null) {
            return pu4Var;
        }
        try {
            dzbVar = (List) fzc.a.b(a, str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Object obj = pu4Var;
        if (!(dzbVar instanceof dzb)) {
            obj = dzbVar;
        }
        return (List) obj;
    }
}
