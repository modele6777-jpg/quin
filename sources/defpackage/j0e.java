package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0e {
    public static final j0e a;
    public static final j0e b;
    public static final j0e c;
    public static final /* synthetic */ j0e[] d;

    static {
        j0e j0eVar = new j0e("BEGINNING", 0);
        a = j0eVar;
        j0e j0eVar2 = new j0e("MIDDLE", 1);
        b = j0eVar2;
        j0e j0eVar3 = new j0e("AFTER_DOT", 2);
        c = j0eVar3;
        d = new j0e[]{j0eVar, j0eVar2, j0eVar3};
    }

    public static j0e valueOf(String str) {
        return (j0e) Enum.valueOf(j0e.class, str);
    }

    public static j0e[] values() {
        return (j0e[]) d.clone();
    }
}
