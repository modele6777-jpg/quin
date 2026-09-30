package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eh2 implements yoa {
    public static final eh2 b = new eh2(0);
    public static final eh2 c = new eh2(1);
    public static final eh2 d = new eh2(2);
    public static final eh2 e = new eh2(3);
    public static final eh2 f = new eh2(4);
    public static final eh2 g = new eh2(5);
    public final /* synthetic */ int a;

    public /* synthetic */ eh2(int i) {
        this.a = i;
    }

    public static boolean d(Number number, Boolean bool) {
        if (bool.booleanValue()) {
            return number.doubleValue() == 1.0d;
        }
        return number.doubleValue() == 0.0d;
    }

    public static boolean e(String str, Number number) {
        try {
            if (str.trim().isEmpty()) {
                str = "0";
            }
            return Double.parseDouble(str) == number.doubleValue();
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r4 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:?, code lost:
    
        return r3.substring(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r5 <= r3.length()) goto L30;
     */
    @Override // defpackage.yoa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4, java.lang.String r5, java.util.List r6) throws defpackage.ci7 {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh2.b(java.lang.Object, java.lang.String, java.util.List):java.lang.Object");
    }

    @Override // defpackage.ei7
    public final String c() {
        switch (this.a) {
            case 0:
                return "cat";
            case 1:
                return "==";
            case 2:
                return "in";
            case 3:
                return "merge";
            case 4:
                return "===";
            default:
                return "substr";
        }
    }
}
