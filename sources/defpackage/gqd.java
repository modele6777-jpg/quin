package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gqd {
    public static final gqd a;
    public static final /* synthetic */ gqd[] b;

    static {
        gqd gqdVar = new gqd("Short", 0);
        a = gqdVar;
        b = new gqd[]{gqdVar, new gqd("Long", 1), new gqd("Indefinite", 2)};
    }

    public static gqd valueOf(String str) {
        return (gqd) Enum.valueOf(gqd.class, str);
    }

    public static gqd[] values() {
        return (gqd[]) b.clone();
    }
}
