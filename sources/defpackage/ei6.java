package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lei6;", "Ls09;", "Lgi6;", "haze_release"}, k = 1, mv = {2, 2, 0}, xi = z7c.f)
public final /* data */ class ei6 extends s09 {
    public final ii6 a;

    public ei6(ii6 ii6Var) {
        this.a = ii6Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new gi6(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei6) && this.a == ((ei6) obj).a && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return ub3.a(0.0f, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HazeSourceElement(state=" + this.a + ", zIndex=0.0, key=null)";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        gi6 gi6Var = (gi6) i09Var;
        gi6Var.getClass();
        jsd jsdVar = gi6Var.E0.a;
        sh6 sh6Var = gi6Var.Z;
        boolean zContains = jsdVar.contains(sh6Var);
        if (zContains) {
            ii6 ii6Var = gi6Var.E0;
            ii6Var.getClass();
            sh6Var.getClass();
            ii6Var.a.remove(sh6Var);
        }
        ii6 ii6Var2 = this.a;
        gi6Var.E0 = ii6Var2;
        if (zContains) {
            sh6Var.getClass();
            ii6Var2.a.add(sh6Var);
        }
        sh6Var.c.k(0.0f);
    }
}
