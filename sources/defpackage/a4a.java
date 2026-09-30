package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum a4a {
    a(R.drawable.ic_paywall_daily, R.drawable.ic_paywall_daily_neo, "MonthlyReadings"),
    b(R.drawable.ic_paywall_daily, R.drawable.ic_paywall_daily_neo, "PackReadings"),
    c(R.drawable.ic_paywall_chat, R.drawable.ic_paywall_chat_neo, "FollowUps"),
    d(R.drawable.ic_paywall_draw, R.drawable.ic_paywall_draw_neo, "ExtraCards"),
    e(R.drawable.ic_friend_coupon_benefit, R.drawable.ic_friend_coupon_benefit, "MonthlyFriendCoupons"),
    f(R.drawable.ic_friend_coupon_benefit, R.drawable.ic_friend_coupon_benefit, "YearlyFriendCoupons"),
    g(R.drawable.ic_paywall_report, R.drawable.ic_paywall_report_neo, "Reports"),
    v(R.drawable.ic_paywall_lock, R.drawable.ic_paywall_lock_neo, "Decks"),
    w(R.drawable.ic_paywall_draw, R.drawable.ic_paywall_draw_neo, "Shuffle"),
    x(R.drawable.ic_paywall_spread, R.drawable.ic_paywall_spread_neo, "Spreads"),
    y(R.drawable.ic_paywall_read, R.drawable.ic_paywall_read_neo, "Interpretations"),
    z(R.drawable.ic_paywall_daily, R.drawable.ic_paywall_daily_neo, "DailyCard"),
    X(R.drawable.ic_paywall_camera, R.drawable.ic_paywall_camera_neo, "PhysicalCards");

    private final int icon;
    private final int neoIcon;
    private final int text;

    a4a(int i, int i2, String str) {
        this.text = i;
        this.icon = i;
        this.neoIcon = i2;
    }

    public final int a() {
        return this.icon;
    }

    public final int b() {
        return this.neoIcon;
    }

    public final int c() {
        return this.text;
    }
}
