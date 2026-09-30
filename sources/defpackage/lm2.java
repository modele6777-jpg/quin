package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lm2 {
    public static final lm2 a;
    public static final /* synthetic */ lm2[] b;

    static {
        lm2 lm2Var = new lm2("Wrap", 0);
        a = lm2Var;
        b = new lm2[]{lm2Var, new lm2("Fill", 1)};
    }

    public static lm2 valueOf(String str) {
        return (lm2) Enum.valueOf(lm2.class, str);
    }

    public static lm2[] values() {
        return (lm2[]) b.clone();
    }
}
