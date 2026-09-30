package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yw0 {
    public final z3b a;
    public final em7 b;
    public final z3b c;
    public final l26 d;
    public final lp7 e;
    public final ArrayList f;

    public yw0(z3b z3bVar, em7 em7Var, z3b z3bVar2, l26 l26Var, lp7 lp7Var) {
        z3bVar.getClass();
        em7Var.getClass();
        this.a = z3bVar;
        this.b = em7Var;
        this.c = z3bVar2;
        this.d = l26Var;
        this.e = lp7Var;
        this.f = new ArrayList(pu4.a);
    }

    public final void a(em7 em7Var) {
        em7Var.getClass();
        this.f.add(em7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        yw0 yw0Var = (yw0) obj;
        return pa7.t(this.b, yw0Var.b) && pa7.t(this.c, yw0Var.c) && pa7.t(this.a, yw0Var.a);
    }

    public final int hashCode() {
        z3b z3bVar = this.c;
        int iHashCode = z3bVar != null ? z3bVar.hashCode() : 0;
        return this.a.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.e);
        sb.append(": '");
        sb.append(fm7.a(this.b));
        sb.append('\'');
        z3b z3bVar = this.c;
        if (z3bVar != null) {
            sb.append(",qualifier:");
            sb.append(z3bVar);
        }
        o4e o4eVar = szc.v;
        z3b z3bVar2 = this.a;
        if (!pa7.t(z3bVar2, o4eVar)) {
            sb.append(",scope:");
            sb.append(z3bVar2);
        }
        ArrayList arrayList = this.f;
        if (!arrayList.isEmpty()) {
            sb.append(",binds:");
            s72.C0(arrayList, sb, ",", null, null, new wu0(4), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
