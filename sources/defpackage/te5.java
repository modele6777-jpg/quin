package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class te5 implements h10 {
    public final h10 a;
    public final qqf b;

    public te5(h10 h10Var, qqf qqfVar) {
        this.a = h10Var;
        this.b = qqfVar;
    }

    @Override // defpackage.h10
    public final boolean E(dx5 dx5Var) {
        dx5Var.getClass();
        if (((Boolean) this.b.d(dx5Var)).booleanValue()) {
            return this.a.E(dx5Var);
        }
        return false;
    }

    @Override // defpackage.h10
    public final u00 R(dx5 dx5Var) {
        dx5Var.getClass();
        if (((Boolean) this.b.d(dx5Var)).booleanValue()) {
            return this.a.R(dx5Var);
        }
        return null;
    }

    @Override // defpackage.h10
    public final boolean isEmpty() {
        h10 h10Var = this.a;
        if ((h10Var instanceof Collection) && ((Collection) h10Var).isEmpty()) {
            return false;
        }
        Iterator it = h10Var.iterator();
        while (it.hasNext()) {
            dx5 dx5VarF = ((u00) it.next()).f();
            if (dx5VarF != null && ((Boolean) this.b.d(dx5VarF)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            dx5 dx5VarF = ((u00) obj).f();
            if (dx5VarF != null && ((Boolean) this.b.d(dx5VarF)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
