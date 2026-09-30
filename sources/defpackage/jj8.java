package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum jj8 {
    EVENTS("events"),
    PEOPLE("people"),
    ANONYMOUS_PEOPLE("anonymous_people"),
    GROUPS("groups");

    private final String mTableName;

    jj8(String str) {
        this.mTableName = str;
    }

    public final String a() {
        return this.mTableName;
    }
}
