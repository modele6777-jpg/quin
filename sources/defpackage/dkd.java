package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dkd extends x57 {
    public final c1b s;
    public final vz9 t = q1c.f(null);

    public dkd(c1b c1bVar) {
        this.s = c1bVar;
    }

    @Override // defpackage.x57
    public final boolean J(c1b c1bVar) {
        return c1bVar == this.s;
    }

    @Override // defpackage.x57
    public final Object O(c1b c1bVar) {
        if (c1bVar != this.s) {
            i37.c("Check failed.");
        }
        Object value = this.t.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    public final void i0(c1b c1bVar, Object obj) {
        if (c1bVar != this.s) {
            i37.c("Check failed.");
        }
        this.t.setValue(obj);
    }
}
