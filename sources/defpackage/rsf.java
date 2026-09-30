package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface rsf extends ssf {
    @Override // defpackage.psf
    default long c(b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return ((long) (s() + p())) * 1000000;
    }

    int p();

    int s();
}
