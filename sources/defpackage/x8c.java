package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface x8c extends AutoCloseable {
    void Q(int i, String str);

    boolean R0();

    default boolean T() {
        return getLong(0) != 0;
    }

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void m(int i, long j);

    void n(byte[] bArr, int i);

    void o(int i);

    void reset();

    void s();

    String t0(int i);
}
