package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pr4 extends b1b {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr4(int i, x16 x16Var) {
        super(x16Var);
        this.b = i;
    }

    @Override // defpackage.b1b
    public final e1b a(Object obj) {
        switch (this.b) {
            case 0:
                return new e1b(this, obj, obj == null, i8c.f, null, true);
            default:
                return new e1b(this, obj, obj == null, null, null, false);
        }
    }
}
