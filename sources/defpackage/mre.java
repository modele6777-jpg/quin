package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mre {
    public static final mre a;
    public static final mre b;
    public static final mre c;
    public static final /* synthetic */ mre[] d;

    static {
        mre mreVar = new mre("None", 0);
        a = mreVar;
        mre mreVar2 = new mre("Touch", 1);
        b = mreVar2;
        mre mreVar3 = new mre("Mouse", 2);
        c = mreVar3;
        d = new mre[]{mreVar, mreVar2, mreVar3};
    }

    public static mre valueOf(String str) {
        return (mre) Enum.valueOf(mre.class, str);
    }

    public static mre[] values() {
        return (mre[]) d.clone();
    }
}
