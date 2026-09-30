package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r9e {
    public static final r9e a;
    public static final r9e b;
    public static final r9e c;
    public static final /* synthetic */ r9e[] d;

    static {
        r9e r9eVar = new r9e("WITHOUT_FEATURE_COMBO", 0);
        a = r9eVar;
        r9e r9eVar2 = new r9e("WITH_FEATURE_COMBO", 1);
        b = r9eVar2;
        r9e r9eVar3 = new r9e("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
        c = r9eVar3;
        d = new r9e[]{r9eVar, r9eVar2, r9eVar3};
    }

    public static r9e valueOf(String str) {
        return (r9e) Enum.valueOf(r9e.class, str);
    }

    public static r9e[] values() {
        return (r9e[]) d.clone();
    }
}
