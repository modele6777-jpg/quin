package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class btd {
    public static final btd a;
    public static final btd b;
    public static final btd c;
    public static final /* synthetic */ btd[] d;

    static {
        btd btdVar = new btd("BEFORE", 0);
        a = btdVar;
        btd btdVar2 = new btd("DURING", 1);
        b = btdVar2;
        btd btdVar3 = new btd("AFTER", 2);
        c = btdVar3;
        d = new btd[]{btdVar, btdVar2, btdVar3};
    }

    public static btd valueOf(String str) {
        return (btd) Enum.valueOf(btd.class, str);
    }

    public static btd[] values() {
        return (btd[]) d.clone();
    }
}
