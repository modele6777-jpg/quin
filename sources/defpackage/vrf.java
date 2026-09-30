package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vrf extends br8 {
    public static final vrf d = new vrf("must have no value parameters", 0);
    public static final vrf e = new vrf("must have a single value parameter", 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vrf(String str, int i) {
        super(str, 1);
        this.c = i;
    }

    @Override // defpackage.ly1
    public final boolean a(if7 if7Var) {
        switch (this.c) {
            case 0:
                return if7Var.G().isEmpty();
            case 1:
                return if7Var.G().size() == 1;
            default:
                return if7Var.G().size() == 2;
        }
    }
}
