package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface ag2 {
    void A(nyc nycVar, int i, xn7 xn7Var, Object obj);

    ev4 C(dua duaVar, int i);

    void E(nyc nycVar, int i, float f);

    void b(nyc nycVar);

    void e(dua duaVar, int i, double d);

    default boolean g(nyc nycVar) {
        nycVar.getClass();
        return true;
    }

    void k(nyc nycVar, int i, long j);

    void o(nyc nycVar, int i, boolean z);

    void p(nyc nycVar, int i, xn7 xn7Var, Object obj);

    void r(dua duaVar, int i, byte b);

    void u(dua duaVar, int i, short s);

    void v(int i, int i2, nyc nycVar);

    void w(nyc nycVar, int i, String str);

    void x(dua duaVar, int i, char c);
}
