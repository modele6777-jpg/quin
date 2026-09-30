package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class z8a extends o3 implements Map, cn7 {
    public w8a a;
    public jy4 b = new jy4(14);
    public p4f c;
    public Object d;
    public int e;
    public int f;

    public z8a(w8a w8aVar) {
        this.a = w8aVar;
        this.c = w8aVar.a;
        this.f = w8aVar.b;
    }

    @Override // defpackage.o3
    public final Set b() {
        return new d9a(0, this);
    }

    @Override // defpackage.o3
    public final Set c() {
        return new d9a(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = p4f.e;
        h(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.o3
    public final int d() {
        return this.f;
    }

    @Override // defpackage.o3
    public final Collection e() {
        return new i9a(this, 1);
    }

    /* JADX INFO: renamed from: f */
    public w8a g() {
        p4f p4fVar = this.c;
        w8a w8aVar = this.a;
        if (p4fVar != w8aVar.a) {
            this.b = new jy4(14);
            w8aVar = new w8a(this.c, this.f);
        }
        this.a = w8aVar;
        return w8aVar;
    }

    public /* bridge */ w8a g() {
        return g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.c.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final void h(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        w8a w8aVarG = null;
        w8a w8aVar = map instanceof w8a ? (w8a) map : null;
        if (w8aVar == null) {
            z8a z8aVar = map instanceof z8a ? (z8a) map : null;
            if (z8aVar != null) {
                w8aVarG = z8aVar.g();
            }
        } else {
            w8aVarG = w8aVar;
        }
        if (w8aVarG == null) {
            super.putAll(map);
            return;
        }
        rw3 rw3Var = new rw3();
        rw3Var.a = 0;
        int i = this.f;
        this.c = this.c.m(w8aVarG.a, 0, rw3Var, this);
        int i2 = (w8aVarG.b + i) - rw3Var.a;
        if (i != i2) {
            h(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f;
        p4f p4fVarO = this.c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (p4fVarO == null) {
            p4fVarO = p4f.e;
        }
        this.c = p4fVarO;
        return i != this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.d = null;
        p4f p4fVarN = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (p4fVarN == null) {
            p4fVarN = p4f.e;
        }
        this.c = p4fVarN;
        return this.d;
    }
}
