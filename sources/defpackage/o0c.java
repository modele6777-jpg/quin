package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o0c {
    public static final o0c a;
    public static final o0c b;
    public static final o0c c;
    public static final /* synthetic */ o0c[] d;

    static {
        o0c o0cVar = new o0c("GoogleReview", 0);
        a = o0cVar;
        o0c o0cVar2 = new o0c("MarketReview", 1);
        b = o0cVar2;
        o0c o0cVar3 = new o0c("None", 2);
        c = o0cVar3;
        d = new o0c[]{o0cVar, o0cVar2, o0cVar3};
    }

    public static o0c valueOf(String str) {
        return (o0c) Enum.valueOf(o0c.class, str);
    }

    public static o0c[] values() {
        return (o0c[]) d.clone();
    }
}
