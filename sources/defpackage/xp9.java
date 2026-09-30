package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum xp9 {
    HearFrom(new wp9(1, 6, true), new wp9(1, 5, true)),
    WannaKnow(new wp9(2, 6, true), new wp9(2, 5, true)),
    Birthday(new wp9(3, 6, true), new wp9(3, 5, true)),
    /* JADX INFO: Fake field, exist only in values array */
    Notification(new wp9(4, 6, true), new wp9(4, 6, true)),
    Overview(new wp9(5, 6, true), new wp9(4, 5, true)),
    ThemeSelection(new wp9(6, 6, true), new wp9(5, 5, true));

    private final wp9 cn;
    private final wp9 oversea;

    xp9(wp9 wp9Var, wp9 wp9Var2) {
        this.cn = wp9Var;
        this.oversea = wp9Var2;
    }

    public final wp9 a() {
        return this.cn;
    }

    public final wp9 b() {
        return this.oversea;
    }
}
