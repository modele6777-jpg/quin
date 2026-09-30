package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum u6d {
    TapScrim("tap_scrim"),
    SwipeDown("swipe_down"),
    BackPress("back_press");

    private final String analyticsValue;

    u6d(String str) {
        this.analyticsValue = str;
    }

    public final String a() {
        return this.analyticsValue;
    }
}
