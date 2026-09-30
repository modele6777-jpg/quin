package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface pg1 extends ud1, nif {
    m88 a();

    @Override // defpackage.ud1
    default kg1 b() {
        return q();
    }

    default boolean d() {
        return b().m() == 0;
    }

    ef1 f();

    default te1 g() {
        return xe1.a;
    }

    default boolean k() {
        return false;
    }

    void l(ArrayList arrayList);

    void m(ArrayList arrayList);

    default boolean o() {
        return true;
    }

    ng1 q();

    default void n() {
    }

    default void i(te1 te1Var) {
    }

    default void j(boolean z) {
    }

    default void p(boolean z) {
    }
}
