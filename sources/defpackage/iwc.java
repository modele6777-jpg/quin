package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Liwc;", "Ls09;", "Lkwc;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class iwc extends s09 {
    public final owc a;
    public final long b;
    public final gvc c;

    public iwc(owc owcVar, long j, gvc gvcVar) {
        this.a = owcVar;
        this.b = j;
        this.c = gvcVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        kwc kwcVar = new kwc();
        kwcVar.F0 = this.a;
        kwcVar.G0 = this.b;
        kwcVar.H0 = this.c;
        sr srVar = new sr(5, kwcVar);
        hia hiaVar = ibe.a;
        obe obeVar = new obe(null, null, null, srVar);
        kwcVar.l1(obeVar);
        kwcVar.I0 = obeVar;
        owc owcVar = kwcVar.F0;
        kwcVar.J0 = new lwc(new jwc(kwcVar, 2), new jwc(kwcVar, 3), owcVar);
        kwcVar.K0 = new mwc(new jwc(kwcVar, 0), owcVar, new jwc(kwcVar, 1));
        return kwcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iwc) {
            iwc iwcVar = (iwc) obj;
            if (this.a == iwcVar.a && this.b == iwcVar.b && this.c == iwcVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.a.hashCode() + (Long.hashCode(this.b) * 31)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        kwc kwcVar = (kwc) i09Var;
        owc owcVar = kwcVar.F0;
        owc owcVar2 = this.a;
        boolean z = owcVar2 == owcVar;
        kwcVar.F0 = owcVar2;
        kwcVar.G0 = this.b;
        kwcVar.H0 = this.c;
        if (!z) {
            kwcVar.J0 = new lwc(new jwc(kwcVar, 2), new jwc(kwcVar, 3), owcVar2);
            kwcVar.K0 = new mwc(new jwc(kwcVar, 0), owcVar2, new jwc(kwcVar, 1));
        }
        kwcVar.I0.n1();
    }
}
