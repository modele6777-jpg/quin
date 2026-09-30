package defpackage;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dw8 implements yoa {
    public static final dw8 c;
    public static final dw8 d;
    public static final dw8 e;
    public static final dw8 f;
    public final /* synthetic */ int a;
    public final boolean b;

    static {
        int i = 0;
        c = new dw8(false, i);
        d = new dw8(true, i);
        int i2 = 1;
        e = new dw8(false, i2);
        f = new dw8(true, i2);
    }

    public /* synthetic */ dw8(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public static LinkedHashSet d(wl8 wl8Var, String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : wl8Var.a.entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof Map) || (value instanceof JsonObject)) {
                linkedHashSet.addAll(d(new wl8(entry.getValue()), str + entry.getKey() + "."));
            } else {
                linkedHashSet.add(str + entry.getKey());
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.yoa
    public final Object b(Object obj, String str, List list) throws ci7 {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (z && (list.size() < 2 || !cd0.a(list.get(1)) || !(list.get(0) instanceof Double))) {
                    throw new ci7("missing_some expects first argument to be an integer and the second argument to be an array", str);
                }
                if (!(obj instanceof Map) && !(obj instanceof JsonObject)) {
                    if (z) {
                        return ((Double) list.get(0)).intValue() <= 0 ? Collections.EMPTY_LIST : list.get(1);
                    }
                    return list;
                }
                wl8 wl8Var = new wl8(obj);
                List cd0Var = z ? new cd0(list.get(1)) : list;
                LinkedHashSet linkedHashSetD = d(wl8Var, "");
                LinkedHashSet linkedHashSet = new LinkedHashSet(cd0Var);
                linkedHashSet.removeAll(linkedHashSetD);
                return (!z || cd0Var.size() - linkedHashSet.size() < ((Double) list.get(0)).intValue()) ? new ArrayList(linkedHashSet) : Collections.EMPTY_LIST;
            default:
                boolean zY = list.isEmpty() ? false : gg7.y(list.get(0));
                return z ? Boolean.valueOf(zY) : Boolean.valueOf(!zY);
        }
    }

    @Override // defpackage.ei7
    public final String c() {
        switch (this.a) {
            case 0:
                return this.b ? "missing_some" : "missing";
            default:
                return this.b ? "!!" : "!";
        }
    }
}
