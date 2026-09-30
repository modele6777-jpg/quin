package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ar8 extends br8 {
    public static final ar8 d = new ar8("must be a member function", 0);
    public static final ar8 e = new ar8("must be a member or an extension function", 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar8(String str, int i) {
        super(str, 0);
        this.c = i;
    }

    @Override // defpackage.ly1
    public final boolean a(if7 if7Var) {
        switch (this.c) {
            case 0:
                return if7Var.y != null;
            default:
                return (if7Var.y == null && if7Var.x == null) ? false : true;
        }
    }
}
