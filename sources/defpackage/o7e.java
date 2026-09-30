package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o7e {
    public static final o7e a;
    public static final o7e b;
    public static final o7e c;
    public static final o7e d;
    public static final /* synthetic */ o7e[] e;

    static {
        o7e o7eVar = new o7e("Basic", 0);
        a = o7eVar;
        o7e o7eVar2 = new o7e("Pro", 1);
        b = o7eVar2;
        o7e o7eVar3 = new o7e("Max", 2);
        c = o7eVar3;
        o7e o7eVar4 = new o7e("V4", 3);
        d = o7eVar4;
        e = new o7e[]{o7eVar, o7eVar2, o7eVar3, o7eVar4};
    }

    public static o7e valueOf(String str) {
        return (o7e) Enum.valueOf(o7e.class, str);
    }

    public static o7e[] values() {
        return (o7e[]) e.clone();
    }
}
