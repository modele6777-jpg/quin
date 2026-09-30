package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class bs9 implements qh2 {
    public static final qu b;
    public static final bs9 c;
    public final TreeMap a;

    static {
        qu quVar = new qu(20);
        b = quVar;
        c = new bs9(new TreeMap(quVar));
    }

    public bs9(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static bs9 d(qh2 qh2Var) {
        if (bs9.class.equals(qh2Var.getClass())) {
            return (bs9) qh2Var;
        }
        TreeMap treeMap = new TreeMap(b);
        for (no0 no0Var : qh2Var.b()) {
            Set<ph2> setE = qh2Var.e(no0Var);
            ArrayMap arrayMap = new ArrayMap();
            for (ph2 ph2Var : setE) {
                arrayMap.put(ph2Var, qh2Var.f(no0Var, ph2Var));
            }
            treeMap.put(no0Var, arrayMap);
        }
        return new bs9(treeMap);
    }

    @Override // defpackage.qh2
    public final Object a(no0 no0Var, Object obj) {
        Map map = (Map) this.a.get(no0Var);
        return map == null ? obj : map.get((ph2) Collections.min(map.keySet()));
    }

    @Override // defpackage.qh2
    public final Set b() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // defpackage.qh2
    public final Object c(no0 no0Var) {
        Map map = (Map) this.a.get(no0Var);
        if (map != null) {
            return map.get((ph2) Collections.min(map.keySet()));
        }
        yg5.l(no0Var, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.qh2
    public final Set e(no0 no0Var) {
        Map map = (Map) this.a.get(no0Var);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.qh2
    public final Object f(no0 no0Var, ph2 ph2Var) {
        Map map = (Map) this.a.get(no0Var);
        if (map == null) {
            yg5.l(no0Var, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(ph2Var)) {
            return map.get(ph2Var);
        }
        s8f.k("Option does not exist: ", no0Var, " with priority=", ph2Var);
        return null;
    }

    @Override // defpackage.qh2
    public final void g(bo1 bo1Var) {
        for (Map.Entry entry : this.a.tailMap(new no0("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((no0) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            no0 no0Var = (no0) entry.getKey();
            mjg mjgVar = (mjg) bo1Var.b;
            qh2 qh2Var = (qh2) bo1Var.c;
            no0Var.getClass();
            ((k79) mjgVar.a).n(no0Var, qh2Var.i(no0Var), qh2Var.c(no0Var));
        }
    }

    @Override // defpackage.qh2
    public final boolean h(no0 no0Var) {
        return this.a.containsKey(no0Var);
    }

    @Override // defpackage.qh2
    public final ph2 i(no0 no0Var) {
        Map map = (Map) this.a.get(no0Var);
        if (map != null) {
            return (ph2) Collections.min(map.keySet());
        }
        yg5.l(no0Var, "Option does not exist: ");
        return null;
    }
}
