package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f7c {
    public static final f7c a;
    public static final f7c b;
    public static final /* synthetic */ f7c[] c;

    static {
        f7c f7cVar = new f7c("PATH", 0);
        a = f7cVar;
        f7c f7cVar2 = new f7c("QUERY", 1);
        b = f7cVar2;
        c = new f7c[]{f7cVar, f7cVar2};
    }

    public static f7c valueOf(String str) {
        return (f7c) Enum.valueOf(f7c.class, str);
    }

    public static f7c[] values() {
        return (f7c[]) c.clone();
    }
}
