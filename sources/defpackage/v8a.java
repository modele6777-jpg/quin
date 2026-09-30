package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v8a extends r2 implements q9a {
    public static final v8a c = new v8a(o4f.e, 0);
    public final o4f a;
    public final int b;

    public v8a(o4f o4fVar, int i) {
        o4fVar.getClass();
        this.a = o4fVar;
        this.b = i;
    }

    @Override // defpackage.r2
    public final Set b() {
        return new j9a(this, 0);
    }

    @Override // defpackage.r2
    public final Set c() {
        return new j9a(this, 1);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.r2
    public final int d() {
        return this.b;
    }

    @Override // defpackage.r2
    public final Collection e() {
        return new n9a(this, 0);
    }

    @Override // defpackage.r2, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.b != map.size()) {
            return false;
        }
        boolean z = map instanceof r9a;
        o4f o4fVar = this.a;
        if (z) {
            return o4fVar.g(((r9a) obj).c.a, new db9(12));
        }
        if (map instanceof s9a) {
            return o4fVar.g(((s9a) obj).d.c, new db9(13));
        }
        if (map instanceof v8a) {
            return o4fVar.g(((v8a) obj).a, new db9(14));
        }
        return map instanceof y8a ? o4fVar.g(((y8a) obj).c, new db9(15)) : super.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.h(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
