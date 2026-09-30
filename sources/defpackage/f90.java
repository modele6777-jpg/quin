package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f90 extends is5 {
    public final /* synthetic */ l90 x;
    public final /* synthetic */ o90 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f90(o90 o90Var, o90 o90Var2, l90 l90Var) {
        super(o90Var2);
        this.y = o90Var;
        this.x = l90Var;
    }

    @Override // defpackage.is5
    public final efd b() {
        return this.x;
    }

    @Override // defpackage.is5
    public final boolean c() {
        o90 o90Var = this.y;
        if (o90Var.getInternalPopup().a()) {
            return true;
        }
        o90Var.f.n(o90Var.getTextDirection(), o90Var.getTextAlignment());
        return true;
    }
}
