package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum w4g {
    WidgetOnboarding("widget_onboarding"),
    Account("account"),
    LegacyPopup("legacy_popup"),
    /* JADX INFO: Fake field, exist only in values array */
    Organic("organic");

    private final String analyticsValue;

    w4g(String str) {
        this.analyticsValue = str;
    }

    public final String a() {
        return this.analyticsValue;
    }
}
