package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s5e {
    public static final s5e a;
    public static final s5e b;
    public static final s5e c;
    public static final s5e d;
    public static final s5e e;
    public static final s5e f;
    public static final /* synthetic */ s5e[] g;

    static {
        s5e s5eVar = new s5e("Untouched", 0);
        a = s5eVar;
        s5e s5eVar2 = new s5e("Unchanged", 1);
        b = s5eVar2;
        s5e s5eVar3 = new s5e("Changed", 2);
        c = s5eVar3;
        s5e s5eVar4 = new s5e("Inserted", 3);
        d = s5eVar4;
        s5e s5eVar5 = new s5e("Interrupted", 4);
        e = s5eVar5;
        s5e s5eVar6 = new s5e("Removing", 5);
        f = s5eVar6;
        g = new s5e[]{s5eVar, s5eVar2, s5eVar3, s5eVar4, s5eVar5, s5eVar6};
    }

    public static s5e valueOf(String str) {
        return (s5e) Enum.valueOf(s5e.class, str);
    }

    public static s5e[] values() {
        return (s5e[]) g.clone();
    }
}
