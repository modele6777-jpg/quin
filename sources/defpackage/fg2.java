package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fg2 implements nw9 {
    public final List a;
    public final String b;

    public fg2(List list, String str) {
        this.a = list;
        this.b = str;
        list.size();
        s72.o1(list).size();
    }

    @Override // defpackage.nw9
    public final boolean a(dx5 dx5Var) {
        dx5Var.getClass();
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!af1.Y((nw9) it.next(), dx5Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nw9
    public final void b(dx5 dx5Var, ArrayList arrayList) {
        dx5Var.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            af1.A((nw9) it.next(), dx5Var, arrayList);
        }
    }

    @Override // defpackage.nw9
    public final Collection m(dx5 dx5Var, a26 a26Var) {
        dx5Var.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((nw9) it.next()).m(dx5Var, a26Var));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
