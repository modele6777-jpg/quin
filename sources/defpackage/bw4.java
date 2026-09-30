package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bw4 extends gu7 implements a26 {
    final /* synthetic */ bx4 $enter;
    final /* synthetic */ e45 $exit;
    final /* synthetic */ scd $mutableTransformState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw4(bx4 bx4Var, e45 e45Var, scd scdVar) {
        super(1);
        this.$enter = bx4Var;
        this.$exit = e45Var;
        this.$mutableTransformState = scdVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int iOrdinal = ((wv4) obj).ordinal();
        float f = 1.0f;
        if (iOrdinal == 0) {
            x95 x95Var = ((cx4) this.$enter).b.a;
            if (x95Var != null) {
                f = x95Var.a;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                ap.c();
                return null;
            }
            x95 x95Var2 = ((f45) this.$exit).c.a;
            f = x95Var2 != null ? x95Var2.a : this.$mutableTransformState.g;
        }
        return Float.valueOf(f);
    }
}
