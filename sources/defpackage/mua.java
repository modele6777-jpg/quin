package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mua {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(lua.a, 0);
        map.put(lua.b, 1);
        map.put(lua.c, 2);
        for (lua luaVar : map.keySet()) {
            a.append(((Integer) b.get(luaVar)).intValue(), luaVar);
        }
    }

    public static int a(lua luaVar) {
        Integer num = (Integer) b.get(luaVar);
        if (num != null) {
            return num.intValue();
        }
        yg5.r(luaVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static lua b(int i) {
        lua luaVar = (lua) a.get(i);
        if (luaVar != null) {
            return luaVar;
        }
        qc0.j(tec.e(i, "Unknown Priority for value "));
        return null;
    }
}
