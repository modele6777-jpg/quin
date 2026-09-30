package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@ec9("composable")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lse2;", "Lfc9;", "Lre2;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final class se2 extends fc9 {
    public final vz9 c = q1c.f(Boolean.FALSE);

    @Override // defpackage.fc9
    public final ua9 a() {
        return new re2(this, jd2.a);
    }

    @Override // defpackage.fc9
    public final void d(List list, pb9 pb9Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            da9 da9Var = (da9) it.next();
            ia9 ia9VarB = b();
            q0e q0eVar = ia9VarB.e.a;
            da9Var.getClass();
            s0e s0eVar = ia9VarB.c;
            Iterable iterable = (Iterable) s0eVar.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((da9) it2.next()) == da9Var) {
                            Iterable iterable2 = (Iterable) q0eVar.getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((da9) it3.next()) == da9Var) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            da9 da9Var2 = (da9) s72.H0((List) q0eVar.getValue());
            if (da9Var2 != null) {
                s0eVar.n(null, n3d.n((Set) s0eVar.getValue(), da9Var2));
            }
            s0eVar.n(null, n3d.n((Set) s0eVar.getValue(), da9Var));
            ia9VarB.f(da9Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.fc9
    public final void e(da9 da9Var, boolean z) {
        b().e(da9Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(da9 da9Var) {
        ia9 ia9VarB = b();
        da9Var.getClass();
        s0e s0eVar = ia9VarB.c;
        s0eVar.n(null, n3d.n((Set) s0eVar.getValue(), da9Var));
        ma9 ma9Var = ia9VarB.h.b;
        ma9Var.getClass();
        if (ma9Var.f.contains(da9Var)) {
            da9Var.d(g48.d);
        } else {
            qc0.p("Cannot transition entry that is not in the back stack");
        }
    }
}
