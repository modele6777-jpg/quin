package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q5h {
    public static final q5h c = new q5h(100);
    public final EnumMap a;
    public final int b;

    public q5h(int i) {
        EnumMap enumMap = new EnumMap(o5h.class);
        this.a = enumMap;
        o5h o5hVar = o5h.AD_STORAGE;
        k5h k5hVar = k5h.UNINITIALIZED;
        enumMap.put(o5hVar, k5hVar);
        enumMap.put(o5h.ANALYTICS_STORAGE, k5hVar);
        this.b = i;
    }

    public static String a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static q5h b(int i, Bundle bundle) {
        if (bundle == null) {
            return new q5h(i);
        }
        EnumMap enumMap = new EnumMap(o5h.class);
        for (o5h o5hVar : m5h.STORAGE.b()) {
            enumMap.put(o5hVar, d(bundle.getString(o5hVar.zze)));
        }
        return new q5h(enumMap, i);
    }

    public static q5h c(int i, String str) {
        EnumMap enumMap = new EnumMap(o5h.class);
        o5h[] o5hVarArrA = m5h.STORAGE.a();
        for (int i2 = 0; i2 < o5hVarArrA.length; i2++) {
            String str2 = str == null ? "" : str;
            o5h o5hVar = o5hVarArrA[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(o5hVar, e(str2.charAt(i3)));
            } else {
                enumMap.put(o5hVar, k5h.UNINITIALIZED);
            }
        }
        return new q5h(enumMap, i);
    }

    public static k5h d(String str) {
        k5h k5hVar = k5h.UNINITIALIZED;
        if (str == null) {
            return k5hVar;
        }
        if (str.equals("granted")) {
            return k5h.GRANTED;
        }
        return str.equals("denied") ? k5h.DENIED : k5hVar;
    }

    public static k5h e(char c2) {
        if (c2 == '+') {
            return k5h.POLICY;
        }
        if (c2 != '0') {
            return c2 != '1' ? k5h.UNINITIALIZED : k5h.GRANTED;
        }
        return k5h.DENIED;
    }

    public static char h(k5h k5hVar) {
        if (k5hVar == null) {
            return '-';
        }
        int iOrdinal = k5hVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q5h) {
            q5h q5hVar = (q5h) obj;
            for (o5h o5hVar : m5h.STORAGE.b()) {
                if (this.a.get(o5hVar) == q5hVar.a.get(o5hVar)) {
                }
            }
            if (this.b == q5hVar.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (o5h o5hVar : m5h.STORAGE.a()) {
            k5h k5hVar = (k5h) this.a.get(o5hVar);
            char c2 = '-';
            if (k5hVar != null && (iOrdinal = k5hVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal == 3) {
                    c2 = '1';
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (o5h o5hVar : m5h.STORAGE.a()) {
            sb.append(h((k5h) this.a.get(o5hVar)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int iHashCode = this.b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((k5h) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(o5h o5hVar) {
        return ((k5h) this.a.get(o5hVar)) != k5h.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public final q5h j(q5h q5hVar) {
        EnumMap enumMap = new EnumMap(o5h.class);
        for (o5h o5hVar : m5h.STORAGE.b()) {
            k5h k5hVar = (k5h) this.a.get(o5hVar);
            k5h k5hVar2 = (k5h) q5hVar.a.get(o5hVar);
            if (k5hVar == null) {
                k5hVar = k5hVar2;
            } else if (k5hVar2 != null) {
                k5h k5hVar3 = k5h.UNINITIALIZED;
                if (k5hVar == k5hVar3) {
                    k5hVar = k5hVar2;
                } else if (k5hVar2 != k5hVar3) {
                    k5h k5hVar4 = k5h.POLICY;
                    if (k5hVar == k5hVar4) {
                        k5hVar = k5hVar2;
                    } else if (k5hVar2 != k5hVar4) {
                        k5h k5hVar5 = k5h.DENIED;
                        k5hVar = (k5hVar == k5hVar5 || k5hVar2 == k5hVar5) ? k5hVar5 : k5h.GRANTED;
                    }
                }
            }
            if (k5hVar != null) {
                enumMap.put(o5hVar, k5hVar);
            }
        }
        return new q5h(enumMap, 100);
    }

    public final q5h k(q5h q5hVar) {
        EnumMap enumMap = new EnumMap(o5h.class);
        for (o5h o5hVar : m5h.STORAGE.b()) {
            k5h k5hVar = (k5h) this.a.get(o5hVar);
            if (k5hVar == k5h.UNINITIALIZED) {
                k5hVar = (k5h) q5hVar.a.get(o5hVar);
            }
            if (k5hVar != null) {
                enumMap.put(o5hVar, k5hVar);
            }
        }
        return new q5h(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (o5h o5hVar : m5h.STORAGE.b()) {
            sb.append(",");
            sb.append(o5hVar.zze);
            sb.append("=");
            k5h k5hVar = (k5h) this.a.get(o5hVar);
            if (k5hVar == null) {
                k5hVar = k5h.UNINITIALIZED;
            }
            sb.append(k5hVar);
        }
        return sb.toString();
    }

    public q5h(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(o5h.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
