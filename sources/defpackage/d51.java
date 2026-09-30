package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d51 implements e22 {
    public final ge8 a;
    public final w09 b;

    public d51(ge8 ge8Var, x09 x09Var) {
        x09Var.getClass();
        this.a = ge8Var;
        this.b = x09Var;
    }

    @Override // defpackage.e22
    public final u09 a(j22 j22Var) {
        dx5 dx5Var;
        n36 n36VarA;
        j22Var.getClass();
        if (!j22Var.c && !j22Var.g()) {
            String str = j22Var.b.a.a;
            if (v4e.F(str, "Function", false) && (n36VarA = o36.b.a((dx5Var = j22Var.a), str)) != null) {
                m36 m36Var = n36VarA.a;
                int i = n36VarA.b;
                List list = (List) gdc.f(this.b.W(dx5Var).f, n18.w[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof k51) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (s72.x0(arrayList2) == null) {
                    return new y26(this.a, (k51) s72.v0(arrayList), m36Var, i);
                }
                r3.f();
            }
        }
        return null;
    }

    @Override // defpackage.e22
    public final Collection b(dx5 dx5Var) {
        dx5Var.getClass();
        return xu4.a;
    }

    @Override // defpackage.e22
    public final boolean c(dx5 dx5Var, t99 t99Var) {
        dx5Var.getClass();
        t99Var.getClass();
        String strB = t99Var.b();
        strB.getClass();
        return (c5e.C(strB, "Function", false) || c5e.C(strB, "KFunction", false) || c5e.C(strB, "SuspendFunction", false) || c5e.C(strB, "KSuspendFunction", false)) && o36.b.a(dx5Var, strB) != null;
    }
}
