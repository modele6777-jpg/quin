package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r9a extends r2 implements q9a {
    public static final r9a d;
    public final Object a;
    public final Object b;
    public final v8a c;

    static {
        qk6 qk6Var = qk6.X;
        v8a v8aVar = v8a.c;
        v8aVar.getClass();
        d = new r9a(qk6Var, qk6Var, v8aVar);
    }

    public r9a(Object obj, Object obj2, v8a v8aVar) {
        this.a = obj;
        this.b = obj2;
        this.c = v8aVar;
    }

    @Override // defpackage.r2
    public final Set b() {
        return new v9a(this, 0);
    }

    @Override // defpackage.r2
    public final Set c() {
        return new v9a(this, 1);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // defpackage.r2
    public final int d() {
        return this.c.d();
    }

    @Override // defpackage.r2
    public final Collection e() {
        return new n9a(this, 1);
    }

    @Override // defpackage.r2, java.util.Map
    public final boolean equals(Object obj) {
        v8a v8aVar = this.c;
        o4f o4fVar = v8aVar.a;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (v8aVar.d() != map.size()) {
            return false;
        }
        if (map instanceof r9a) {
            return o4fVar.g(((r9a) obj).c.a, new db9(20));
        }
        if (map instanceof s9a) {
            return o4fVar.g(((s9a) obj).d.c, new db9(21));
        }
        if (map instanceof v8a) {
            return o4fVar.g(((v8a) obj).a, new db9(22));
        }
        return map instanceof y8a ? o4fVar.g(((y8a) obj).c, new db9(23)) : super.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        v68 v68Var = (v68) this.c.get(obj);
        if (v68Var != null) {
            return v68Var.a;
        }
        return null;
    }
}
