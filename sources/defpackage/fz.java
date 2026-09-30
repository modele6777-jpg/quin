package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fz extends gu7 implements x16 {
    final /* synthetic */ n3f $childTransition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(n3f n3fVar) {
        super(0);
        this.$childTransition = n3fVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        n3f n3fVar = this.$childTransition;
        Object objA = n3fVar.a.a();
        wv4 wv4Var = wv4.c;
        return Boolean.valueOf(objA == wv4Var && n3fVar.d.getValue() == wv4Var);
    }
}
