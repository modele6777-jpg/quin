package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tl8 {
    public static rl8 a(Object obj, Object obj2) {
        rl8 rl8VarE = (rl8) obj;
        rl8 rl8Var = (rl8) obj2;
        if (!rl8Var.isEmpty()) {
            if (!rl8VarE.c()) {
                rl8VarE = rl8VarE.e();
            }
            rl8VarE.b();
            if (!rl8Var.isEmpty()) {
                rl8VarE.putAll(rl8Var);
            }
        }
        return rl8VarE;
    }
}
