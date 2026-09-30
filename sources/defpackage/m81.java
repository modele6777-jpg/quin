package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum m81 {
    a(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(false, true),
    b(false, false);

    private final boolean readEnabled;
    private final boolean writeEnabled;

    m81(boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    public final boolean a() {
        return this.readEnabled;
    }

    public final boolean b() {
        return this.writeEnabled;
    }
}
