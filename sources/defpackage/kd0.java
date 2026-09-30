package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kd0 extends wid implements Map {
    public ed0 d;
    public gd0 e;
    public id0 f;

    @Override // java.util.Map
    public final Set entrySet() {
        ed0 ed0Var = this.d;
        if (ed0Var != null) {
            return ed0Var;
        }
        ed0 ed0Var2 = new ed0(0, this);
        this.d = ed0Var2;
        return ed0Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        gd0 gd0Var = this.e;
        if (gd0Var != null) {
            return gd0Var;
        }
        gd0 gd0Var2 = new gd0(this);
        this.e = gd0Var2;
        return gd0Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.c;
        int i = this.c;
        int[] iArr = this.a;
        if (iArr.length < size) {
            this.a = Arrays.copyOf(iArr, size);
            this.b = Arrays.copyOf(this.b, size * 2);
        }
        if (this.c != i) {
            qc0.e();
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        id0 id0Var = this.f;
        if (id0Var != null) {
            return id0Var;
        }
        id0 id0Var2 = new id0(this);
        this.f = id0Var2;
        return id0Var2;
    }
}
