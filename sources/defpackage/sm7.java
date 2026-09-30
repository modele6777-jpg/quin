package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sm7 extends aya {
    public static final sm7 a = new sm7(tm7.class, "superclasses", "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;", 1);

    @Override // defpackage.aya, defpackage.un7
    public final Object get(Object obj) {
        em7 em7Var = (em7) obj;
        em7Var.getClass();
        List listE = em7Var.e();
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            um7 um7VarB = ((yn7) it.next()).B();
            em7 em7Var2 = um7VarB instanceof em7 ? (em7) um7VarB : null;
            if (em7Var2 != null) {
                arrayList.add(em7Var2);
            }
        }
        return arrayList;
    }
}
