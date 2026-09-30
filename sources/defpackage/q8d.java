package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum q8d {
    a("image/png", "png"),
    b("image/jpeg", "jpg");

    private final String extension;
    private final String mimeType;

    q8d(String str, String str2) {
        this.mimeType = str;
        this.extension = str2;
    }

    public final String a() {
        return this.extension;
    }

    public final String b() {
        return this.mimeType;
    }
}
