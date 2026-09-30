package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zj implements gg9 {
    public final fh2 a;
    public final ArrayList b;

    public zj(fh2 fh2Var, ArrayList arrayList) {
        this.a = fh2Var;
        this.b = arrayList;
    }

    @Override // defpackage.sr5
    public final as5 a() {
        return this.a.a();
    }

    @Override // defpackage.sr5
    public final n0a b() {
        c78 c78VarW = t72.w();
        c78VarW.add(this.a.b());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            c78VarW.add(((sr5) it.next()).b());
        }
        return new n0a(pu4.a, c78VarW.n());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zj)) {
            return false;
        }
        zj zjVar = (zj) obj;
        return this.a.equals(zjVar.a) && this.b.equals(zjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.b + ')';
    }
}
