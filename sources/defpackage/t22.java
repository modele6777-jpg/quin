package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t22 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public t22(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            f48 f48Var = (f48) entry.getValue();
            List arrayList = (List) this.a.get(f48Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(f48Var, arrayList);
            }
            arrayList.add((u22) entry.getKey());
        }
    }

    public static void a(List list, x48 x48Var, f48 f48Var, w48 w48Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                u22 u22Var = (u22) list.get(size);
                Method method = u22Var.b;
                try {
                    int i = u22Var.a;
                    if (i == 0) {
                        method.invoke(w48Var, null);
                    } else if (i == 1) {
                        method.invoke(w48Var, x48Var);
                    } else if (i == 2) {
                        method.invoke(w48Var, x48Var, f48Var);
                    }
                } catch (IllegalAccessException e) {
                    yg5.p(e);
                    return;
                } catch (InvocationTargetException e2) {
                    cva.q("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
