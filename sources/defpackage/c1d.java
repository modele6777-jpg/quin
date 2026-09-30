package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c1d {
    public static final c1d a;
    public static final c1d b;
    public static final c1d c;
    public static final /* synthetic */ c1d[] d;

    static {
        c1d c1dVar = new c1d("PENDING", 0);
        a = c1dVar;
        c1d c1dVar2 = new c1d("CREATING", 1);
        b = c1dVar2;
        c1d c1dVar3 = new c1d("CREATED", 2);
        c = c1dVar3;
        d = new c1d[]{c1dVar, c1dVar2, c1dVar3};
    }

    public static c1d valueOf(String str) {
        return (c1d) Enum.valueOf(c1d.class, str);
    }

    public static c1d[] values() {
        return (c1d[]) d.clone();
    }
}
