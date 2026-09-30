package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rr4 {
    public static final LinkedHashMap a;
    public static final LinkedHashMap b;

    static {
        qr4 qr4Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b = linkedHashMap2;
        qr4 qr4Var2 = qr4.d;
        linkedHashMap.put(1L, qr4Var2);
        linkedHashMap2.put(qr4Var2, t72.H(1L));
        linkedHashMap.put(2L, qr4.e);
        linkedHashMap2.put(linkedHashMap.get(2L), t72.H(2L));
        qr4 qr4Var3 = qr4.f;
        linkedHashMap.put(4L, qr4Var3);
        linkedHashMap2.put(qr4Var3, t72.H(4L));
        qr4 qr4Var4 = qr4.g;
        linkedHashMap.put(8L, qr4Var4);
        linkedHashMap2.put(qr4Var4, t72.H(8L));
        List listI = t72.I(64L, 128L, 16L, 32L);
        Iterator it = listI.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            qr4Var = qr4.h;
            if (!zHasNext) {
                break;
            }
            a.put(Long.valueOf(((Number) it.next()).longValue()), qr4Var);
        }
        b.put(qr4Var, listI);
        List listI2 = t72.I(1024L, 2048L, 256L, 512L);
        Iterator it2 = listI2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            qr4 qr4Var5 = qr4.i;
            if (!zHasNext2) {
                b.put(qr4Var5, listI2);
                return;
            } else {
                a.put(Long.valueOf(((Number) it2.next()).longValue()), qr4Var5);
            }
        }
    }

    public static Long a(qr4 qr4Var, DynamicRangeProfiles dynamicRangeProfiles) {
        qr4Var.getClass();
        dynamicRangeProfiles.getClass();
        List list = (List) b.get(qr4Var);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        supportedProfiles.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (supportedProfiles.contains(Long.valueOf(jLongValue))) {
                return Long.valueOf(jLongValue);
            }
        }
        return null;
    }
}
