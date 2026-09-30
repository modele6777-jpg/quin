package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h19 implements tc5 {
    public final agf a;
    public final List b;
    public final j19 c;

    public h19(j19 j19Var) {
        agf agfVar = fdg.b;
        List list = j19Var.a;
        agfVar.getClass();
        this.a = agfVar;
        this.b = list;
        int size = list.size();
        int i = (agfVar.c - agfVar.b) + 1;
        if (size == i) {
            this.c = j19Var;
            return;
        }
        StringBuilder sb = new StringBuilder("The number of values (");
        sb.append(list.size());
        sb.append(") in ");
        sb.append(list);
        sb.append(" does not match the range of the field (");
        qc0.o(tec.n(sb, i, ')'));
        throw null;
    }

    @Override // defpackage.tc5
    public final as5 a() {
        return new gh2(3, new vx7(1, this, h19.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0, 5));
    }

    @Override // defpackage.tc5
    public final n0a b() {
        vd9 vd9Var = new vd9(27, this);
        List list = this.b;
        return new n0a(t72.H(new r4e(list, vd9Var, ib8.k("one of ", " for monthName", list))), pu4.a);
    }

    @Override // defpackage.tc5
    public final /* bridge */ /* synthetic */ q1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h19) && this.c.a.equals(((h19) obj).c.a);
    }

    public final int hashCode() {
        return this.c.a.hashCode();
    }
}
