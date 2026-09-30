package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hy7 {
    public final tt7 a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public hy7(tt7 tt7Var, List list, ArrayList arrayList, List list2) {
        this.a = tt7Var;
        this.b = list;
        this.c = arrayList;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy7)) {
            return false;
        }
        hy7 hy7Var = (hy7) obj;
        return this.a.equals(hy7Var.a) && this.b.equals(hy7Var.b) && this.c.equals(hy7Var.c) && this.d.equals(hy7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.d((this.c.hashCode() + tec.a(this.a.hashCode() * 961, 31, this.b)) * 31, 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
    }
}
