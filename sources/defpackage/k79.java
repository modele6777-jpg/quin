package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k79 extends bs9 {
    public static k79 j() {
        return new k79(new TreeMap(bs9.b));
    }

    public static k79 m(qh2 qh2Var) {
        TreeMap treeMap = new TreeMap(bs9.b);
        for (no0 no0Var : qh2Var.b()) {
            Set<ph2> setE = qh2Var.e(no0Var);
            ArrayMap arrayMap = new ArrayMap();
            for (ph2 ph2Var : setE) {
                arrayMap.put(ph2Var, qh2Var.f(no0Var, ph2Var));
            }
            treeMap.put(no0Var, arrayMap);
        }
        return new k79(treeMap);
    }

    public final void n(no0 no0Var, ph2 ph2Var, Object obj) {
        ph2 ph2Var2;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(no0Var);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(no0Var, arrayMap);
            arrayMap.put(ph2Var, obj);
            return;
        }
        ph2 ph2Var3 = (ph2) Collections.min(map.keySet());
        if (Objects.equals(map.get(ph2Var3), obj) || ph2Var3 != (ph2Var2 = ph2.c) || ph2Var != ph2Var2) {
            map.put(ph2Var, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(no0Var.a);
        sb.append(", existing value (");
        sb.append(ph2Var3);
        Object obj2 = map.get(ph2Var3);
        sb.append(")=");
        sb.append(obj2);
        sb.append(", conflicting (");
        sb.append(ph2Var);
        sb.append(")=");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void p(no0 no0Var, Object obj) {
        n(no0Var, ph2.d, obj);
    }

    public final void w(no0 no0Var) {
        this.a.remove(no0Var);
    }
}
