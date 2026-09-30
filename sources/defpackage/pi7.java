package defpackage;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pi7 {
    public static final gec a = new gec(26);

    public static final int a(nyc nycVar, wg7 wg7Var, String str) {
        nycVar.getClass();
        str.getClass();
        d(wg7Var, nycVar);
        int iD = nycVar.d(str);
        if (iD != -3 || !wg7Var.a.h) {
            return iD;
        }
        kb6 kb6Var = wg7Var.c;
        jf6 jf6Var = new jf6(12, nycVar, wg7Var);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) kb6Var.b;
        Map map = (Map) concurrentHashMap.get(nycVar);
        gec gecVar = a;
        Object obj = map != null ? map.get(gecVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = jf6Var.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(nycVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(nycVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(gecVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(nyc nycVar, wg7 wg7Var, String str, String str2) {
        nycVar.getClass();
        str.getClass();
        int iA = a(nycVar, wg7Var, str);
        if (iA != -3) {
            return iA;
        }
        throw new yyc(nycVar.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(wg7 wg7Var, nyc nycVar) {
        nycVar.getClass();
        if (wg7Var.a.b) {
            return true;
        }
        List annotations = nycVar.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof wh7) {
                return true;
            }
        }
        return false;
    }

    public static final void d(wg7 wg7Var, nyc nycVar) {
        nycVar.getClass();
        wg7Var.getClass();
        pa7.t(nycVar.g(), g5e.c);
    }
}
