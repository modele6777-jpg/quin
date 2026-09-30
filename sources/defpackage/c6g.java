package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c6g {
    public static final c6g a;
    public static final c6g b;
    public static final /* synthetic */ c6g[] c;

    static {
        c6g c6gVar = new c6g("Intro", 0);
        a = c6gVar;
        c6g c6gVar2 = new c6g("Guide", 1);
        b = c6gVar2;
        c = new c6g[]{c6gVar, c6gVar2};
    }

    public static c6g valueOf(String str) {
        return (c6g) Enum.valueOf(c6g.class, str);
    }

    public static c6g[] values() {
        return (c6g[]) c.clone();
    }
}
