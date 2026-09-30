package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lubd;", "Ls09;", "Ltbd;", "animation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class ubd extends s09 {
    public final icd a;

    public ubd(icd icdVar) {
        this.a = icdVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new tbd(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ubd) && this.a == ((ubd) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.a + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        tbd tbdVar = (tbd) i09Var;
        icd icdVar = tbdVar.H0;
        icd icdVar2 = this.a;
        if (icdVar2 != icdVar) {
            icdVar.a.setValue(Boolean.FALSE);
            tbdVar.H0 = icdVar2;
            icdVar2.a.setValue(Boolean.valueOf(tbdVar.Y));
            if (tbdVar.Y) {
                tbdVar.p1();
            }
        }
    }
}
