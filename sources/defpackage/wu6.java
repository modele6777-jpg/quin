package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wu6 {
    public static final isa c = new isa("|S||P|");
    public static final isa d = new isa("|S|id");
    public static final String[] e = {"*", "FCM", "GCM", ""};
    public final fe7 a;
    public final String b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public wu6(ff5 ff5Var) {
        ff5Var.a();
        this.a = new fe7(ff5Var.a, "com.google.android.gms.appid");
        ff5Var.a();
        wf5 wf5Var = ff5Var.c;
        String str = wf5Var.e;
        if (str == null) {
            ff5Var.a();
            str = wf5Var.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.b = str;
    }
}
