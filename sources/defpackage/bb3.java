package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bb3 {
    public static final bb3 b;
    public final HashMap a;

    static {
        bb3 bb3Var = new bb3(new LinkedHashMap());
        bm8.S(bb3Var);
        b = bb3Var;
    }

    public bb3(bb3 bb3Var) {
        bb3Var.getClass();
        this.a = new HashMap(bb3Var.a);
    }

    public final boolean a(String str) {
        Object obj = Boolean.FALSE;
        Object obj2 = this.a.get(str);
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final int b(int i, String str) {
        Object objValueOf = Integer.valueOf(i);
        Object obj = this.a.get(str);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final int[] c() {
        Object obj = this.a.get("widget_ids");
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            if (obj2 == null) {
                r82.g("null cannot be cast to non-null type kotlin.Int");
                return null;
            }
            iArr[i] = ((Integer) obj2).intValue();
        }
        return iArr;
    }

    public final String d(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final String[] e(String str) {
        Object obj = this.a.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            if (obj2 == null) {
                r82.g("null cannot be cast to non-null type kotlin.String");
                return null;
            }
            strArr[i] = (String) obj2;
        }
        return strArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && bb3.class.equals(obj.getClass())) {
                HashMap map = ((bb3) obj).a;
                HashMap map2 = this.a;
                Set<String> setKeySet = map2.keySet();
                if (pa7.t(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = qd0.W(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return ks0.l(new StringBuilder("Data {"), s72.D0(this.a.entrySet(), null, null, null, new i73(5), 31), "}");
    }

    public bb3(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }
}
