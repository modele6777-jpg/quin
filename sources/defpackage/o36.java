package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o36 {
    public static final o36 b = new o36(t72.I(i36.d, l36.d, j36.d, k36.d));
    public final LinkedHashMap a;

    public o36(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            dx5 dx5Var = ((m36) obj).a;
            Object arrayList = linkedHashMap.get(dx5Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(dx5Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = linkedHashMap;
    }

    public final n36 a(dx5 dx5Var, String str) {
        Integer numValueOf;
        dx5Var.getClass();
        str.getClass();
        List<m36> list = (List) this.a.get(dx5Var);
        if (list == null) {
            return null;
        }
        for (m36 m36Var : list) {
            int i = 0;
            if (c5e.C(str, m36Var.b, false)) {
                String strSubstring = str.substring(m36Var.b.length());
                if (strSubstring.length() == 0) {
                    numValueOf = null;
                    break;
                }
                int length = strSubstring.length();
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        numValueOf = Integer.valueOf(i2);
                        break;
                    }
                    int iCharAt = strSubstring.charAt(i) - '0';
                    if (iCharAt < 0 || iCharAt >= 10) {
                        numValueOf = null;
                        break;
                    }
                    i2 = (i2 * 10) + iCharAt;
                    i++;
                }
                if (numValueOf != null) {
                    return new n36(m36Var, numValueOf.intValue());
                }
            }
        }
        return null;
    }
}
