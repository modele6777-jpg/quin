package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fm7 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final String a(em7 em7Var) {
        em7Var.getClass();
        ConcurrentHashMap concurrentHashMap = a;
        String str = (String) concurrentHashMap.get(em7Var);
        if (str != null) {
            return str;
        }
        String name = af1.R(em7Var).getName();
        concurrentHashMap.put(em7Var, name);
        return name;
    }
}
