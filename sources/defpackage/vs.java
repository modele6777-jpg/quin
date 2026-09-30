package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vs extends h36 implements a26 {
    final /* synthetic */ f38 $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(f38 f38Var) {
        super(1, oa7.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.$node = f38Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        float[] fArr = ((zm8) obj).a;
        bv7 bv7Var = (bv7) ((h28) this.$node).G0.getValue();
        if (bv7Var != null) {
            if (!bv7Var.h()) {
                bv7Var = null;
            }
            if (bv7Var != null) {
                bv7Var.j(fArr);
            }
        }
        return wef.a;
    }
}
