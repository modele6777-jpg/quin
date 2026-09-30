package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rid implements gg9 {
    public final ru0 a;
    public final Set b;

    public rid(ru0 ru0Var) {
        this.a = ru0Var;
        c78 c78VarW = t72.w();
        tq.m(c78VarW, ru0Var);
        c78 c78VarN = c78VarW.n();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c78VarN.listIterator(0);
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                break;
            }
            ol9 ol9VarD = ((tc5) ql6Var.next()).c().d();
            if (ol9VarD != null) {
                arrayList.add(ol9VarD);
            }
        }
        Set setO1 = s72.o1(arrayList);
        this.b = setO1;
        if (setO1.isEmpty()) {
            qc0.j("Signed format must contain at least one field with a sign");
            throw null;
        }
    }

    @Override // defpackage.sr5
    public final as5 a() {
        return new sh3(this.a.a.a(), new qid(this));
    }

    @Override // defpackage.sr5
    public final n0a b() {
        return x57.E(t72.I(new n0a(t72.H(new ngd(new z8d(2, this), "sign for " + this.b)), pu4.a), this.a.a.b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rid) {
            return this.a.equals(((rid) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.a + ')';
    }
}
