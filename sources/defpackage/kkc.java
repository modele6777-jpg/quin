package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kkc {
    public static final kkc a;
    public static final kkc b;
    public static final kkc c;
    public static final kkc d;
    public static final kkc e;
    public static final /* synthetic */ kkc[] f;

    static {
        kkc kkcVar = new kkc("MajorArcana", 0);
        a = kkcVar;
        kkc kkcVar2 = new kkc("Wands", 1);
        b = kkcVar2;
        kkc kkcVar3 = new kkc("Cups", 2);
        c = kkcVar3;
        kkc kkcVar4 = new kkc("Swords", 3);
        d = kkcVar4;
        kkc kkcVar5 = new kkc("Pentacles", 4);
        e = kkcVar5;
        f = new kkc[]{kkcVar, kkcVar2, kkcVar3, kkcVar4, kkcVar5};
    }

    public static kkc valueOf(String str) {
        return (kkc) Enum.valueOf(kkc.class, str);
    }

    public static kkc[] values() {
        return (kkc[]) f.clone();
    }
}
