package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum u06 {
    CopyLink("copy_link", null),
    WeChat("wechat", gbd.c),
    WeChatMoments("wechat_moments", gbd.d),
    System("system", gbd.e);

    private final gbd shareType;
    private final String trackingValue;

    u06(String str, gbd gbdVar) {
        this.trackingValue = str;
        this.shareType = gbdVar;
    }

    public final gbd a() {
        return this.shareType;
    }

    public final String b() {
        return this.trackingValue;
    }
}
