package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wh6 implements v26 {
    public final /* synthetic */ xh6 a;

    public wh6(xh6 xh6Var) {
        this.a = xh6Var;
    }

    @Override // defpackage.v26
    public final m26 b() {
        return new h36(0, 1, qn4.class, this.a, "invalidateDraw", "invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wh6) && (obj instanceof v26)) {
            return b().equals(((v26) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
