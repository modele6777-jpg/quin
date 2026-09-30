package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum cfb {
    MAIN("main"),
    SCENARIO("scenario"),
    CAMERA("camera");

    private final String value;

    cfb(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
