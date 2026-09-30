package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sh8 {
    public static final sh8 a;
    public static final /* synthetic */ sh8[] b;

    static {
        sh8 sh8Var = new sh8("Immediately", 0);
        a = sh8Var;
        b = new sh8[]{sh8Var, new sh8("OnIterationFinish", 1)};
    }

    public static sh8 valueOf(String str) {
        return (sh8) Enum.valueOf(sh8.class, str);
    }

    public static sh8[] values() {
        return (sh8[]) b.clone();
    }
}
