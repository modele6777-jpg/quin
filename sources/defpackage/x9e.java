package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x9e {
    public static final x9e a;
    public static final x9e b;
    public static final /* synthetic */ x9e[] c;

    static {
        x9e x9eVar = new x9e("FEATURE_COMBINATION_TABLE", 0);
        a = x9eVar;
        x9e x9eVar2 = new x9e("CAPTURE_SESSION_TABLES", 1);
        b = x9eVar2;
        c = new x9e[]{x9eVar, x9eVar2};
    }

    public static x9e valueOf(String str) {
        return (x9e) Enum.valueOf(x9e.class, str);
    }

    public static x9e[] values() {
        return (x9e[]) c.clone();
    }
}
