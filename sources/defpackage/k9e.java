package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k9e {
    public static final k9e a;
    public static final k9e b;
    public static final k9e c;
    public static final k9e d;
    public static final k9e e;
    public static final /* synthetic */ k9e[] f;

    static {
        k9e k9eVar = new k9e("END", 0);
        a = k9eVar;
        k9e k9eVar2 = new k9e("ROLLBACK", 1);
        b = k9eVar2;
        k9e k9eVar3 = new k9e("BEGIN_EXCLUSIVE", 2);
        c = k9eVar3;
        k9e k9eVar4 = new k9e("BEGIN_IMMEDIATE", 3);
        d = k9eVar4;
        k9e k9eVar5 = new k9e("BEGIN_DEFERRED", 4);
        e = k9eVar5;
        f = new k9e[]{k9eVar, k9eVar2, k9eVar3, k9eVar4, k9eVar5};
    }

    public static k9e valueOf(String str) {
        return (k9e) Enum.valueOf(k9e.class, str);
    }

    public static k9e[] values() {
        return (k9e[]) f.clone();
    }
}
