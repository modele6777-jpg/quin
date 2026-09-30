package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface kv7 extends rv3 {
    default int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        return d(new ua7(lg8Var, lg8Var.getLayoutDirection()), new gr3(tn8Var, bg9.a, cg9.a, 2), ll2.b(0, 0, 0, i, 7)).d();
    }

    yn8 d(zn8 zn8Var, tn8 tn8Var, long j);

    default int h(lg8 lg8Var, tn8 tn8Var, int i) {
        return d(new ua7(lg8Var, lg8Var.getLayoutDirection()), new gr3(tn8Var, bg9.b, cg9.a, 2), ll2.b(0, 0, 0, i, 7)).d();
    }

    default int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        return d(new ua7(lg8Var, lg8Var.getLayoutDirection()), new gr3(tn8Var, bg9.b, cg9.b, 2), ll2.b(0, i, 0, 0, 13)).c();
    }

    default int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        return d(new ua7(lg8Var, lg8Var.getLayoutDirection()), new gr3(tn8Var, bg9.a, cg9.b, 2), ll2.b(0, i, 0, 0, 13)).c();
    }
}
