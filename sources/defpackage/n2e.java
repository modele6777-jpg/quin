package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n2e {
    public static final n2e a;
    public static final n2e b;
    public static final n2e c;
    public static final n2e d;
    public static final /* synthetic */ n2e[] e;

    static {
        n2e n2eVar = new n2e("INTERNAL", 0);
        a = n2eVar;
        n2e n2eVar2 = new n2e("EXTERNAL_PICTURES", 1);
        b = n2eVar2;
        n2e n2eVar3 = new n2e("EXTERNAL_DOWNLOAD", 2);
        c = n2eVar3;
        n2e n2eVar4 = new n2e("EXTERNAL_MOVIES", 3);
        d = n2eVar4;
        e = new n2e[]{n2eVar, n2eVar2, n2eVar3, n2eVar4};
    }

    public static n2e valueOf(String str) {
        return (n2e) Enum.valueOf(n2e.class, str);
    }

    public static n2e[] values() {
        return (n2e[]) e.clone();
    }
}
