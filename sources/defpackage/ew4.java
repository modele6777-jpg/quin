package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ew4 extends gu7 implements a26 {
    final /* synthetic */ bx4 $enter;
    final /* synthetic */ e45 $exit;
    final /* synthetic */ scd $mutableTransformState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew4(bx4 bx4Var, e45 e45Var, scd scdVar) {
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
            aec aecVar = ((cx4) this.$enter).b.d;
            if (aecVar != null) {
                f = aecVar.a;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                ap.c();
                return null;
            }
            aec aecVar2 = ((f45) this.$exit).c.d;
            f = aecVar2 != null ? aecVar2.a : this.$mutableTransformState.h;
        }
        return Float.valueOf(f);
    }
}
