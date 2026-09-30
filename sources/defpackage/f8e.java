package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface f8e {
    default x7e g(byte[] bArr, int i, int i2) {
        dy6 dy6VarM = jy6.m();
        s(bArr, 0, i2, e8e.c, new r45(23, dy6VarM));
        return new x03(dy6VarM.g());
    }

    void s(byte[] bArr, int i, int i2, e8e e8eVar, xl2 xl2Var);

    default void reset() {
    }
}
