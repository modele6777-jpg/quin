package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mfc {
    public static final mfc a;
    public static final mfc b;
    public static final /* synthetic */ mfc[] c;
    public static final /* synthetic */ mx4 d;

    static {
        mfc mfcVar = new mfc("Colorful", 0);
        a = mfcVar;
        mfc mfcVar2 = new mfc("Greyscale", 1);
        b = mfcVar2;
        mfc[] mfcVarArr = {mfcVar, mfcVar2};
        c = mfcVarArr;
        d = new mx4(mfcVarArr);
    }

    public static mfc valueOf(String str) {
        return (mfc) Enum.valueOf(mfc.class, str);
    }

    public static mfc[] values() {
        return (mfc[]) c.clone();
    }
}
