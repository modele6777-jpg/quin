package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w7e implements dr8 {
    public final dr8 b;
    public final q8f c;
    public HashMap d;
    public final ace e;

    public w7e(dr8 dr8Var, q8f q8fVar) {
        dr8Var.getClass();
        q8fVar.getClass();
        this.b = dr8Var;
        new ace(new wj7(19, q8fVar));
        this.c = new q8f(bm8.e0(q8fVar.a));
        this.e = new ace(new wj7(20, this));
    }

    @Override // defpackage.dr8
    public final Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        return (Collection) this.e.getValue();
    }

    @Override // defpackage.dr8
    public final Collection b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        return i(this.b.b(t99Var, lf9Var));
    }

    @Override // defpackage.dr8
    public final Set c() {
        return this.b.c();
    }

    @Override // defpackage.dr8
    public final Set d() {
        return this.b.d();
    }

    @Override // defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        y22 y22VarE = this.b.e(t99Var, lf9Var);
        if (y22VarE != null) {
            return (y22) h(y22VarE);
        }
        return null;
    }

    @Override // defpackage.dr8
    public final Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        return i(this.b.f(t99Var, lf9Var));
    }

    @Override // defpackage.dr8
    public final Set g() {
        return this.b.g();
    }

    public final bm3 h(bm3 bm3Var) {
        q8f q8fVar = this.c;
        if (q8fVar.a.e()) {
            return bm3Var;
        }
        HashMap map = this.d;
        if (map == null) {
            map = new HashMap();
            this.d = map;
        }
        Object objD = map.get(bm3Var);
        if (objD == null) {
            if (!(bm3Var instanceof v7e)) {
                pd4.i(bm3Var, "Unknown descriptor in scope: ");
                return null;
            }
            objD = ((v7e) bm3Var).d(q8fVar);
            if (objD == null) {
                ho7.l(bm3Var, " substitution fails", "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ");
                return null;
            }
            map.put(bm3Var, objD);
        }
        return (bm3) objD;
    }

    public final Collection i(Collection collection) {
        if (this.c.a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((bm3) it.next()));
        }
        return linkedHashSet;
    }
}
