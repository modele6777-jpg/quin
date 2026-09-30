package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tdb {
    public static final tdb a;
    public static final tdb b;
    public static final tdb c;
    public static final /* synthetic */ tdb[] d;

    static {
        tdb tdbVar = new tdb("READ", 0);
        a = tdbVar;
        tdb tdbVar2 = new tdb("UNREAD", 1);
        b = tdbVar2;
        tdb tdbVar3 = new tdb("UNASKED", 2);
        c = tdbVar3;
        d = new tdb[]{tdbVar, tdbVar2, tdbVar3};
    }

    public static tdb valueOf(String str) {
        return (tdb) Enum.valueOf(tdb.class, str);
    }

    public static tdb[] values() {
        return (tdb[]) d.clone();
    }
}
