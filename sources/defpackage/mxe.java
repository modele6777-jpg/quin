package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface mxe {
    void A(Integer num);

    Integer B();

    Integer C();

    void E(Integer num);

    default void a(rh3 rh3Var) {
        f(rh3Var != null ? Integer.valueOf(rh3Var.a(9)) : null);
    }

    ak b();

    void e(Integer num);

    void f(Integer num);

    Integer h();

    void k(Integer num);

    default rh3 n() {
        Integer numO = o();
        if (numO != null) {
            return new rh3(numO.intValue(), 9);
        }
        return null;
    }

    Integer o();

    Integer q();

    void t(ak akVar);
}
