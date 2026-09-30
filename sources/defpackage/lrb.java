package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lrb {
    public static final lrb a;
    public static final lrb b;
    public static final /* synthetic */ lrb[] c;

    static {
        lrb lrbVar = new lrb("Restart", 0);
        a = lrbVar;
        lrb lrbVar2 = new lrb("Reverse", 1);
        b = lrbVar2;
        c = new lrb[]{lrbVar, lrbVar2};
    }

    public static lrb valueOf(String str) {
        return (lrb) Enum.valueOf(lrb.class, str);
    }

    public static lrb[] values() {
        return (lrb[]) c.clone();
    }
}
