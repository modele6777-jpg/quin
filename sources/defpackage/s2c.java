package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s2c {
    public static final s2c a;
    public static final s2c b;
    public static final s2c c;
    public static final s2c d;
    public static final s2c e;
    public static final s2c f;
    public static final /* synthetic */ s2c[] g;

    static {
        s2c s2cVar = new s2c("FEATURE_DISABLED", 0);
        a = s2cVar;
        s2c s2cVar2 = new s2c("REWARD_ALREADY_CLAIMED", 1);
        b = s2cVar2;
        s2c s2cVar3 = new s2c("REWARD_STATE_UNAVAILABLE", 2);
        c = s2cVar3;
        s2c s2cVar4 = new s2c("RATING_ALREADY_REQUESTED", 3);
        d = s2cVar4;
        s2c s2cVar5 = new s2c("IMPRESSION_LIMIT_REACHED", 4);
        e = s2cVar5;
        s2c s2cVar6 = new s2c("DISMISSAL_COOLDOWN", 5);
        f = s2cVar6;
        g = new s2c[]{s2cVar, s2cVar2, s2cVar3, s2cVar4, s2cVar5, s2cVar6};
    }

    public static s2c valueOf(String str) {
        return (s2c) Enum.valueOf(s2c.class, str);
    }

    public static s2c[] values() {
        return (s2c[]) g.clone();
    }
}
