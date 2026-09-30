package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tg8 implements sg8 {
    @Override // defpackage.sg8
    public final bv7 a(bv7 bv7Var) {
        og8 og8Var;
        og8 og8Var2 = bv7Var instanceof og8 ? (og8) bv7Var : null;
        if (og8Var2 != null) {
            return og8Var2;
        }
        yf9 yf9Var = (yf9) bv7Var;
        ng8 ng8VarF1 = yf9Var.f1();
        return (ng8VarF1 == null || (og8Var = ng8VarF1.M0) == null) ? yf9Var : og8Var;
    }
}
