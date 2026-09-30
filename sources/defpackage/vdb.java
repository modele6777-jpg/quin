package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface vdb extends qh2 {
    @Override // defpackage.qh2
    default Object a(no0 no0Var, Object obj) {
        return k().a(no0Var, obj);
    }

    @Override // defpackage.qh2
    default Set b() {
        return k().b();
    }

    @Override // defpackage.qh2
    default Object c(no0 no0Var) {
        return k().c(no0Var);
    }

    @Override // defpackage.qh2
    default Set e(no0 no0Var) {
        return k().e(no0Var);
    }

    @Override // defpackage.qh2
    default Object f(no0 no0Var, ph2 ph2Var) {
        return k().f(no0Var, ph2Var);
    }

    @Override // defpackage.qh2
    default void g(bo1 bo1Var) {
        k().g(bo1Var);
    }

    @Override // defpackage.qh2
    default boolean h(no0 no0Var) {
        return k().h(no0Var);
    }

    @Override // defpackage.qh2
    default ph2 i(no0 no0Var) {
        return k().i(no0Var);
    }

    qh2 k();
}
