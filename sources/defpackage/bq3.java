package defpackage;

import com.adjust.sdk.sig.r3;
import io.sentry.g;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bq3 extends LinkedHashMap {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ bq3() {
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.containsKey((String) obj);
                }
                return false;
            default:
                if (obj instanceof g) {
                    return super.containsKey((g) obj);
                }
                return false;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.containsValue((String) obj);
                }
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return (String) super.get((String) obj);
                }
                return null;
            default:
                if ((obj instanceof g) && super.get((g) obj) != null) {
                    r3.f();
                }
                return null;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return !(obj instanceof String) ? obj2 : (String) super.getOrDefault((String) obj, (String) obj2);
            default:
                if (!(obj instanceof g)) {
                    return obj2;
                }
                g gVar = (g) obj;
                if (obj2 != null || super.getOrDefault(gVar, null) != null) {
                    r3.f();
                }
                return null;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return (String) super.remove((String) obj);
                }
                return null;
            default:
                if ((obj instanceof g) && super.remove((g) obj) != null) {
                    r3.f();
                }
                return null;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                return super.size() > 64;
            default:
                return super.size() > 32;
        }
    }

    public /* synthetic */ bq3(float f, int i, boolean z) {
        super(i, f, z);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    return super.remove((String) obj, (String) obj2);
                }
                return false;
            default:
                return false;
        }
    }
}
