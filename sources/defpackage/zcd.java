package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zcd extends gbe implements l26 {
    final /* synthetic */ Set<String> $keysToMigrate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcd(Set set, xn2 xn2Var) {
        super(2, xn2Var);
        this.$keysToMigrate = set;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        zcd zcdVar = new zcd(this.$keysToMigrate, xn2Var);
        zcdVar.L$0 = obj;
        return zcdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Set setKeySet = ((p79) this.L$0).a().keySet();
        ArrayList arrayList = new ArrayList(t72.u(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((isa) it.next()).a);
        }
        Set<String> set = this.$keysToMigrate;
        boolean z = true;
        if (set != add.a) {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zcd) k((xn2) obj2, (p79) obj)).r(wef.a);
    }
}
