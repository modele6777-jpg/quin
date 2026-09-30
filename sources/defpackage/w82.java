package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w82 extends gu7 implements a26 {
    final /* synthetic */ p82 $colorSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w82(p82 p82Var) {
        super(1);
        this.$colorSpace = p82Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        a00 a00Var = (a00) obj;
        float f = a00Var.b;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        float f2 = a00Var.c;
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        float f3 = a00Var.d;
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float f6 = a00Var.a;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        return new y72(y72.a(abg.b(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, s82.x), this.$colorSpace));
    }
}
