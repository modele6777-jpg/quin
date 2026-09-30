package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbjb;", "Ls09;", "Ldjb;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class bjb extends s09 {
    public final cjb a;

    public bjb(cjb cjbVar) {
        this.a = cjbVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new djb(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjb) && this.a.equals(((bjb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReceiveContentElement(receiveContentListener=" + this.a + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((djb) i09Var).F0 = this.a;
    }
}
