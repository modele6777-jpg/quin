package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum zff {
    UBYTEARRAY(mh3.z("kotlin/UByteArray", false)),
    USHORTARRAY(mh3.z("kotlin/UShortArray", false)),
    UINTARRAY(mh3.z("kotlin/UIntArray", false)),
    ULONGARRAY(mh3.z("kotlin/ULongArray", false));

    private final j22 classId;
    private final t99 typeName;

    zff(j22 j22Var) {
        this.classId = j22Var;
        this.typeName = j22Var.f();
    }

    public final t99 a() {
        return this.typeName;
    }
}
