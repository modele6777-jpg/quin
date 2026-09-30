package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ja5 {
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(pyd.x, a("java.util.ArrayList", "java.util.LinkedList"));
        b(pyd.y, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(pyd.z, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        dx5 dx5Var = new dx5("java.util.function.Function");
        b(new j22(dx5Var.b(), dx5Var.a.g()), a("java.util.function.UnaryOperator"));
        dx5 dx5Var2 = new dx5("java.util.function.BiFunction");
        b(new j22(dx5Var2.b(), dx5Var2.a.g()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new iy9(((j22) entry.getKey()).a(), ((j22) entry.getValue()).a()));
        }
        b = bm8.W(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            dx5 dx5Var = new dx5(str);
            arrayList.add(new j22(dx5Var.b(), dx5Var.a.g()));
        }
        return arrayList;
    }

    public static void b(j22 j22Var, ArrayList arrayList) {
        for (Object obj : arrayList) {
            a.put(obj, j22Var);
        }
    }
}
