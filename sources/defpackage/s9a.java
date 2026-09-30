package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s9a extends o3 {
    public r9a a;
    public Object b;
    public Object c;
    public final y8a d;

    public s9a(r9a r9aVar) {
        this.a = r9aVar;
        this.b = r9aVar.a;
        this.c = r9aVar.b;
        this.d = new y8a(r9aVar.c);
    }

    @Override // defpackage.o3
    public final Set b() {
        return new c9a(this, 1);
    }

    @Override // defpackage.o3
    public final Set c() {
        return new f9a(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        y8a y8aVar = this.d;
        if (!y8aVar.isEmpty()) {
            this.a = null;
        }
        y8aVar.clear();
        qk6 qk6Var = qk6.X;
        this.b = qk6Var;
        this.c = qk6Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.o3
    public final int d() {
        return this.d.d();
    }

    @Override // defpackage.o3
    public final Collection e() {
        return new i9a(this, 2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            y8a y8aVar = this.d;
            Map map = (Map) obj;
            if (y8aVar.d() == map.size()) {
                if (map instanceof r9a) {
                    return y8aVar.c.g(((r9a) obj).c.a, new db9(24));
                }
                if (map instanceof s9a) {
                    return y8aVar.c.g(((s9a) obj).d.c, new db9(25));
                }
                if (map instanceof v8a) {
                    return y8aVar.c.g(((v8a) obj).a, new db9(26));
                }
                if (map instanceof y8a) {
                    return y8aVar.c.g(((y8a) obj).c, new db9(27));
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

    public final q9a f() {
        r9a r9aVar = this.a;
        if (r9aVar != null) {
            return r9aVar;
        }
        r9a r9aVar2 = new r9a(this.b, this.c, this.d.f());
        this.a = r9aVar2;
        return r9aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        v68 v68Var = (v68) this.d.get(obj);
        if (v68Var != null) {
            return v68Var.a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        qk6 qk6Var = qk6.X;
        y8a y8aVar = this.d;
        v68 v68Var = (v68) y8aVar.get(obj);
        if (v68Var != null) {
            Object obj3 = v68Var.a;
            if (obj3 == obj2) {
                return obj2;
            }
            this.a = null;
            y8aVar.put(obj, new v68(obj2, v68Var.b, v68Var.c));
            return obj3;
        }
        this.a = null;
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            y8aVar.put(obj, new v68(obj2, qk6Var, qk6Var));
            return null;
        }
        Object obj4 = this.c;
        Object obj5 = y8aVar.get(obj4);
        obj5.getClass();
        v68 v68Var2 = (v68) obj5;
        y8aVar.put(obj4, new v68(v68Var2.a, v68Var2.b, obj));
        y8aVar.put(obj, new v68(obj2, obj4, qk6Var));
        this.c = obj;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        y8a y8aVar = this.d;
        v68 v68Var = (v68) y8aVar.remove(obj);
        if (v68Var == null) {
            return null;
        }
        Object obj2 = v68Var.c;
        Object obj3 = v68Var.b;
        this.a = null;
        qk6 qk6Var = qk6.X;
        if (obj3 != qk6Var) {
            Object obj4 = y8aVar.get(obj3);
            obj4.getClass();
            v68 v68Var2 = (v68) obj4;
            y8aVar.put(obj3, new v68(v68Var2.a, v68Var2.b, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 != qk6Var) {
            Object obj5 = y8aVar.get(obj2);
            obj5.getClass();
            v68 v68Var3 = (v68) obj5;
            y8aVar.put(obj2, new v68(v68Var3.a, obj3, v68Var3.c));
        } else {
            this.c = obj3;
        }
        return v68Var.a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        v68 v68Var = (v68) this.d.get(obj);
        if (v68Var == null || !pa7.t(v68Var.a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
