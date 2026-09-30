package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface jwf {
    default ewf a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default ewf b(Class cls, m69 m69Var) {
        return a(cls);
    }

    default ewf c(em7 em7Var, m69 m69Var) {
        em7Var.getClass();
        return b(af1.R(em7Var), m69Var);
    }
}
