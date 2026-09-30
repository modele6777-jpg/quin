package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j69 implements em7, bo7, k7f {
    public final em7 a;
    public final String b;
    public final List c;
    public final List d;

    public j69(em7 em7Var, String str, a26 a26Var, a26 a26Var2) {
        em7Var.getClass();
        str.getClass();
        this.a = em7Var;
        this.b = str;
        this.c = (List) a26Var.d(this);
        this.d = (List) a26Var2.d(this);
    }

    @Override // defpackage.em7
    public final boolean D(Object obj) {
        return this.a.D(obj);
    }

    @Override // defpackage.em7
    public final List e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j69) {
            return pa7.t(this.a, ((j69) obj).a);
        }
        return false;
    }

    @Override // defpackage.em7
    public final String g() {
        return this.b;
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.em7, defpackage.bo7
    public final List getTypeParameters() {
        return this.c;
    }

    @Override // defpackage.em7
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.em7
    public final boolean j() {
        return this.a.j();
    }

    @Override // defpackage.em7
    public final Collection k() {
        return this.a.k();
    }

    @Override // defpackage.em7
    public final boolean q() {
        return this.a.q();
    }

    @Override // defpackage.em7
    public final String r() {
        return v4e.h0(this.b);
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.a + ')';
    }
}
