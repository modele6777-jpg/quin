package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yy3 implements a26 {
    public final /* synthetic */ int a;
    public final u09 b;

    public yy3(u09 u09Var, ldb ldbVar, tjd tjdVar, tf7 tf7Var) {
        this.a = 2;
        this.b = u09Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        u09 u09Var = this.b;
        switch (i) {
            case 0:
                j69 j69Var = (j69) obj;
                j69Var.getClass();
                List<c8f> listH0 = u09Var.h0();
                listH0.getClass();
                ArrayList arrayList = new ArrayList(t72.u(listH0, 10));
                for (c8f c8fVar : listH0) {
                    c8fVar.getClass();
                    arrayList.add(new ao7(j69Var, c8fVar));
                }
                return arrayList;
            case 1:
                ((j69) obj).getClass();
                Collection collectionE = u09Var.h().e();
                collectionE.getClass();
                Collection collection = collectionE;
                ArrayList arrayList2 = new ArrayList(t72.u(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new zy3((tt7) it.next(), 0));
                }
                return arrayList2;
            default:
                ((zt7) obj).getClass();
                qz3.f(u09Var);
                return null;
        }
    }

    public /* synthetic */ yy3(u09 u09Var, int i) {
        this.a = i;
        this.b = u09Var;
    }
}
