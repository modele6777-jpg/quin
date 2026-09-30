package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class urf extends br8 {
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public urf(int i) {
        StringBuilder sbN = ub3.n(i, "must have at least ", " value parameter");
        sbN.append(i > 1 ? "s" : "");
        super(sbN.toString(), 1);
        this.c = i;
    }

    @Override // defpackage.ly1
    public final boolean a(if7 if7Var) {
        return if7Var.G().size() >= this.c;
    }
}
