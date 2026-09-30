package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fw4 extends gu7 implements a26 {
    final /* synthetic */ bx4 $enter;
    final /* synthetic */ e45 $exit;
    final /* synthetic */ scd $mutableTransformState;
    final /* synthetic */ r2f $transformOriginWhenVisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw4(r2f r2fVar, bx4 bx4Var, e45 e45Var, scd scdVar) {
        super(1);
        this.$transformOriginWhenVisible = r2fVar;
        this.$enter = bx4Var;
        this.$exit = e45Var;
        this.$mutableTransformState = scdVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int iOrdinal = ((wv4) obj).ordinal();
        r2f r2fVar = null;
        if (iOrdinal == 0) {
            aec aecVar = ((cx4) this.$enter).b.d;
            if (aecVar != null) {
                r2fVar = new r2f(aecVar.b);
            } else {
                aec aecVar2 = ((f45) this.$exit).c.d;
                if (aecVar2 != null) {
                    r2fVar = new r2f(aecVar2.b);
                }
            }
        } else if (iOrdinal == 1) {
            r2fVar = this.$transformOriginWhenVisible;
        } else {
            if (iOrdinal != 2) {
                ap.c();
                return null;
            }
            aec aecVar3 = ((f45) this.$exit).c.d;
            r2fVar = new r2f(aecVar3 != null ? aecVar3.b : this.$mutableTransformState.i);
        }
        return new r2f(r2fVar != null ? r2fVar.a : r2f.b);
    }
}
