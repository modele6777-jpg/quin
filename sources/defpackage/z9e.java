package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z9e {
    public static final n3e e = n3e.DEFAULT;
    public static final w9e[] f = {w9e.S720P_16_9, w9e.S1080P_4_3, w9e.S1080P_16_9, w9e.S1440P_16_9, w9e.UHD, w9e.X_VGA};
    public static final Map g;
    public static final LinkedHashMap h;
    public final y9e a;
    public final w9e b;
    public final n3e c;
    public final int d;

    static {
        Map mapH = bm8.H(new iy9(y9e.b, 35), new iy9(y9e.c, 256), new iy9(y9e.d, 4101), new iy9(y9e.e, 32), new iy9(y9e.a, 34));
        g = mapH;
        Set<Map.Entry> setEntrySet = mapH.entrySet();
        int iF = bm8.F(t72.u(setEntrySet, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (y9e) entry.getKey());
        }
        h = linkedHashMap;
    }

    public z9e(y9e y9eVar, w9e w9eVar, n3e n3eVar) {
        w9eVar.getClass();
        n3eVar.getClass();
        this.a = y9eVar;
        this.b = w9eVar;
        this.c = n3eVar;
        Integer num = (Integer) g.get(y9eVar);
        this.d = num != null ? num.intValue() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9e)) {
            return false;
        }
        z9e z9eVar = (z9e) obj;
        return this.a == z9eVar.a && this.b == z9eVar.b && this.c == z9eVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.a + ", configSize=" + this.b + ", streamUseCase=" + this.c + ')';
    }
}
