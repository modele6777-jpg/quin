package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum sqg {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    /* JADX INFO: Fake field, exist only in values array */
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    sqg(char c) {
        this.zzk = c;
    }

    public static sqg a(char c) {
        for (sqg sqgVar : values()) {
            if (sqgVar.zzk == c) {
                return sqgVar;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char b() {
        return this.zzk;
    }
}
