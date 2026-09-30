package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface n69 extends e89, h0e {
    @Override // defpackage.h0e
    default Object getValue() {
        return Float.valueOf(((qz9) this).j());
    }

    @Override // defpackage.e89
    default void setValue(Object obj) {
        ((qz9) this).k(((Number) obj).floatValue());
    }
}
