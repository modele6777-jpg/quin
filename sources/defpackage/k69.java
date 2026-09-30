package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k69 implements a26 {
    public final /* synthetic */ int a = 1;
    public final dx5 b;
    public final em7 c;

    public k69(dx5 dx5Var, em7 em7Var) {
        this.b = dx5Var;
        this.c = em7Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        em7 em7VarF;
        switch (this.a) {
            case 0:
                em7 em7Var = this.c;
                dx5 dx5Var = this.b;
                j69 j69Var = (j69) obj;
                j69Var.getClass();
                List typeParameters = em7Var.getTypeParameters();
                ArrayList arrayList = new ArrayList(t72.u(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    String str = ((ao7) it.next()).c;
                    io7 io7Var = (pa7.t(dx5Var, syd.J) || pa7.t(dx5Var, syd.I)) ? io7.c : io7.a;
                    str.getClass();
                    ao7 ao7Var = new ao7(null, j69Var, str, io7Var);
                    ao7Var.f = t72.H(qyd.b);
                    arrayList.add(ao7Var);
                }
                return arrayList;
            default:
                dx5 dx5Var2 = this.b;
                em7 em7Var2 = this.c;
                j69 j69Var2 = (j69) obj;
                j69Var2.getClass();
                if (pa7.t(dx5Var2, syd.K)) {
                    yn7 yn7VarD = job.d(Iterable.class, do7.c);
                    kob kobVar = job.a;
                    em7VarF = ((j2) kobVar.d(yn7VarD)).f();
                    if (em7VarF == null) {
                        throw new pt7(tec.j(kobVar, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (pa7.t(dx5Var2, syd.L)) {
                    yn7 yn7VarD2 = job.d(Collection.class, do7.c);
                    kob kobVar2 = job.a;
                    em7VarF = ((j2) kobVar2.d(yn7VarD2)).f();
                    if (em7VarF == null) {
                        throw new pt7(tec.j(kobVar2, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (pa7.t(dx5Var2, syd.N)) {
                    yn7 yn7VarD3 = job.d(Collection.class, do7.c);
                    kob kobVar3 = job.a;
                    em7VarF = ((j2) kobVar3.d(yn7VarD3)).f();
                    if (em7VarF == null) {
                        throw new pt7(tec.j(kobVar3, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (pa7.t(dx5Var2, syd.M)) {
                    yn7 yn7VarD4 = job.d(Iterator.class, do7.c);
                    kob kobVar4 = job.a;
                    em7VarF = ((j2) kobVar4.d(yn7VarD4)).f();
                    if (em7VarF == null) {
                        throw new pt7(tec.j(kobVar4, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    em7VarF = null;
                }
                List<ao7> list = j69Var2.c;
                ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                for (ao7 ao7Var2 : list) {
                    do7 do7Var = do7.c;
                    arrayList2.add(db6.b0(qn4.x(ao7Var2, null, false, 7)));
                }
                List listK0 = qd0.k0(new em7[]{em7Var2, em7VarF});
                ArrayList arrayList3 = new ArrayList(t72.u(listK0, 10));
                Iterator it2 = ((ArrayList) listK0).iterator();
                while (it2.hasNext()) {
                    arrayList3.add(qn4.x((em7) it2.next(), arrayList2, false, 6));
                }
                return arrayList3;
        }
    }

    public k69(em7 em7Var, dx5 dx5Var) {
        this.c = em7Var;
        this.b = dx5Var;
    }
}
