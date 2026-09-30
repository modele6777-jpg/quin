package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xr9 implements gg9 {
    public final String a;
    public final fh2 b;
    public final ArrayList c;

    public xr9(String str, fh2 fh2Var) {
        this.a = str;
        this.b = fh2Var;
        c78 c78VarW = t72.w();
        tq.m(c78VarW, fh2Var);
        c78 c78VarN = c78VarW.n();
        ArrayList arrayList = new ArrayList(t72.u(c78VarN, 10));
        ListIterator listIterator = c78VarN.listIterator(0);
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                break;
            } else {
                arrayList.add(((tc5) ql6Var.next()).c());
            }
        }
        List<q1> listJ1 = s72.j1(s72.n1(arrayList));
        ArrayList arrayList2 = new ArrayList(t72.u(listJ1, 10));
        for (q1 q1Var : listJ1) {
            q1Var.getClass();
            Object objB = q1Var.b();
            if (objB == null) {
                cva.u(q1Var.c(), "' does not define a default value", "The field '");
                throw null;
            }
            arrayList2.add(new wr9(q1Var.a(), objB));
        }
        this.c = arrayList2;
    }

    @Override // defpackage.sr5
    public final as5 a() {
        as5 as5VarA = this.b.a();
        ArrayList<wr9> arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        for (wr9 wr9Var : arrayList) {
            arrayList2.add(new ua2(wr9Var.b, new vx7(1, wr9Var.a, txa.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, 9)));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        t5f t5fVar = t5f.a;
        mpa uj2Var = zIsEmpty ? t5fVar : arrayList2.size() == 1 ? (mpa) s72.X0(arrayList2) : new uj2(arrayList2);
        boolean z = uj2Var instanceof t5f;
        String str = this.a;
        return z ? new gh2(str) : new gh2(1, t72.I(new iy9(new vx7(1, uj2Var, mpa.class, "test", "test(Ljava/lang/Object;)Z", 0, 10), new gh2(str)), new iy9(new vx7(1, t5fVar, t5f.class, "test", "test(Ljava/lang/Object;)Z", 0, 11), as5VarA)));
    }

    @Override // defpackage.sr5
    public final n0a b() {
        n0a n0aVarB = this.b.b();
        n0a n0aVarB2 = new zk2(this.a).b();
        boolean zIsEmpty = this.c.isEmpty();
        pu4 pu4Var = pu4.a;
        return new n0a(pu4Var, t72.I(n0aVarB, x57.E(t72.I(n0aVarB2, new n0a(zIsEmpty ? pu4Var : t72.H(new bbf(new p59(9, this))), pu4Var)))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xr9)) {
            return false;
        }
        xr9 xr9Var = (xr9) obj;
        return this.a.equals(xr9Var.a) && this.b.equals(xr9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.a + ", " + this.b + ')';
    }
}
