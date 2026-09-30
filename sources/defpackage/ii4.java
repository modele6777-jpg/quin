package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum ii4 {
    a("activity-popup", "popup"),
    b("paywall-post-membership", "paywall"),
    c("account-topic-challenge", "account");

    private final String key;
    private final String pageName;

    ii4(String str, String str2) {
        this.key = str;
        this.pageName = str2;
    }

    public final String a() {
        return this.key;
    }

    public final String b() {
        return this.pageName;
    }
}
