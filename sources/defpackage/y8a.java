package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y8a extends o3 {
    public v8a a;
    public yx4 b = new yx4(14);
    public o4f c;
    public Object d;
    public int e;
    public int f;

    public y8a(v8a v8aVar) {
        this.a = v8aVar;
        this.c = v8aVar.a;
        this.f = v8aVar.b;
    }

    @Override // defpackage.o3
    public final Set b() {
        return new c9a(this, 0);
    }

    @Override // defpackage.o3
    public final Set c() {
        return new f9a(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o4f o4fVar = o4f.e;
        o4fVar.getClass();
        g(o4fVar);
        h(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.o3
    public final int d() {
        return this.f;
    }

    @Override // defpackage.o3
    public final Collection e() {
        return new i9a(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f == map.size()) {
                if (map instanceof v8a) {
                    return this.c.g(((v8a) obj).a, new db9(16));
                }
                if (map instanceof y8a) {
                    return this.c.g(((y8a) obj).c, new db9(17));
                }
                if (map instanceof r9a) {
                    return this.c.g(((r9a) obj).c.a, new db9(18));
                }
                if (map instanceof s9a) {
                    return this.c.g(((s9a) obj).d.c, new db9(19));
                }
                if (d() != map.size()) {
                    qc0.j("Failed requirement.");
                    return false;
                }
                if (map.isEmpty()) {
                    return true;
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (!ym8.u(this, (Map.Entry) it.next())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final v8a f() {
        v8a v8aVar = this.a;
        if (v8aVar != null) {
            return v8aVar;
        }
        v8a v8aVar2 = new v8a(this.c, d());
        this.a = v8aVar2;
        this.b = new yx4(14);
        return v8aVar2;
    }

    public final void g(o4f o4fVar) {
        if (o4fVar != this.c) {
            this.c = o4fVar;
            this.a = null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.c.h(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final void h(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        g(this.c.m(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this));
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        v8a v8aVarF = null;
        v8a v8aVar = map instanceof v8a ? (v8a) map : null;
        if (v8aVar == null) {
            y8a y8aVar = map instanceof y8a ? (y8a) map : null;
            if (y8aVar != null) {
                v8aVarF = y8aVar.f();
            }
        } else {
            v8aVarF = v8aVar;
        }
        if (v8aVarF == null) {
            super.putAll(map);
            return;
        }
        qw3 qw3Var = new qw3();
        qw3Var.a = 0;
        int iD = d();
        o4f o4fVar = this.c;
        o4f o4fVar2 = v8aVarF.a;
        o4fVar2.getClass();
        g(o4fVar.n(o4fVar2, 0, qw3Var, this));
        int iD2 = (v8aVarF.d() + iD) - qw3Var.a;
        if (iD != iD2) {
            h(iD2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iD = d();
        o4f o4fVarP = this.c.p(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o4fVarP == null) {
            o4fVarP = o4f.e;
            o4fVarP.getClass();
        }
        g(o4fVarP);
        return iD != d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.d = null;
        o4f o4fVarO = this.c.o(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (o4fVarO == null) {
            o4fVarO = o4f.e;
            o4fVarO.getClass();
        }
        g(o4fVarO);
        return this.d;
    }
}
