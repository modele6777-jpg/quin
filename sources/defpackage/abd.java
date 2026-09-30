package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class abd {
    public static final abd a;
    public static final abd b;
    public static final abd c;
    public static final abd d;
    public static final /* synthetic */ abd[] e;

    static {
        abd abdVar = new abd("Idle", 0);
        a = abdVar;
        abd abdVar2 = new abd("Loading", 1);
        b = abdVar2;
        abd abdVar3 = new abd("Ready", 2);
        c = abdVar3;
        abd abdVar4 = new abd("Failed", 3);
        d = abdVar4;
        e = new abd[]{abdVar, abdVar2, abdVar3, abdVar4};
    }

    public static abd valueOf(String str) {
        return (abd) Enum.valueOf(abd.class, str);
    }

    public static abd[] values() {
        return (abd[]) e.clone();
    }
}
