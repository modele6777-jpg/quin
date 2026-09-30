package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d0e {
    public static final d0e a;
    public static final d0e b;
    public static final /* synthetic */ d0e[] c;

    static {
        d0e d0eVar = new d0e("Soft", 0);
        a = d0eVar;
        d0e d0eVar2 = new d0e("Force", 1);
        b = d0eVar2;
        c = new d0e[]{d0eVar, d0eVar2};
    }

    public static d0e valueOf(String str) {
        return (d0e) Enum.valueOf(d0e.class, str);
    }

    public static d0e[] values() {
        return (d0e[]) c.clone();
    }
}
