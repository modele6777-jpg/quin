package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum x8f {
    IN("in"),
    OUT("out"),
    INV("");

    private final String presentation;

    x8f(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.presentation;
    }
}
