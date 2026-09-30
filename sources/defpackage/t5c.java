package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t5c {
    public static final t5c a;
    public static final t5c b;
    public static final /* synthetic */ t5c[] c;

    /* JADX INFO: Fake field, exist only in values array */
    t5c EF0;

    static {
        t5c t5cVar = new t5c("AUTOMATIC", 0);
        t5c t5cVar2 = new t5c("TRUNCATE", 1);
        a = t5cVar2;
        t5c t5cVar3 = new t5c("WRITE_AHEAD_LOGGING", 2);
        b = t5cVar3;
        c = new t5c[]{t5cVar, t5cVar2, t5cVar3};
    }

    public static t5c valueOf(String str) {
        return (t5c) Enum.valueOf(t5c.class, str);
    }

    public static t5c[] values() {
        return (t5c[]) c.clone();
    }
}
