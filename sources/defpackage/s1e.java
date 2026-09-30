package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s1e {
    public static final s1e a;
    public static final s1e b;
    public static final s1e c;
    public static final /* synthetic */ s1e[] d;

    /* JADX INFO: Fake field, exist only in values array */
    s1e EF0;

    static {
        s1e s1eVar = new s1e("Unknown", 0);
        s1e s1eVar2 = new s1e("Fixed", 1);
        a = s1eVar2;
        s1e s1eVar3 = new s1e("NotApplicable", 2);
        b = s1eVar3;
        s1e s1eVar4 = new s1e("NotFixed", 3);
        c = s1eVar4;
        d = new s1e[]{s1eVar, s1eVar2, s1eVar3, s1eVar4};
    }

    public static s1e valueOf(String str) {
        return (s1e) Enum.valueOf(s1e.class, str);
    }

    public static s1e[] values() {
        return (s1e[]) d.clone();
    }
}
