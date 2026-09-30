package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class w8a extends r2 implements Map, zm7 {
    public static final w8a c = new w8a(p4f.e, 0);
    public final p4f a;
    public final int b;

    public w8a(p4f p4fVar, int i) {
        this.a = p4fVar;
        this.b = i;
    }

    @Override // defpackage.r2
    public final Set b() {
        return new k9a(this, 0);
    }

    @Override // defpackage.r2
    public final Set c() {
        return new k9a(this, 1);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.r2
    public final int d() {
        return this.b;
    }

    @Override // defpackage.r2
    public final Collection e() {
        return new tm8(1, this);
    }

    public z8a f() {
        return new z8a(this);
    }

    public /* bridge */ z8a g() {
        return f();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.a.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final w8a h(Object obj, w68 w68Var) {
        sug sugVarU = this.a.u(obj, obj != null ? obj.hashCode() : 0, w68Var, 0);
        return sugVarU == null ? this : new w8a((p4f) sugVarU.c, this.b + sugVarU.b);
    }
}
