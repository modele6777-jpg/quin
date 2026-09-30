package defpackage;

import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xm8 implements yoa {
    public static final xm8 d;
    public static final xm8 e;
    public static final xm8 f;
    public static final xm8 g;
    public static final xm8 h;
    public static final xm8 i;
    public static final xm8 j;
    public final String a;
    public final BiFunction b;
    public final int c;

    static {
        final int i2 = 0;
        d = new xm8("+", new BiFunction() { // from class: wm8
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double d2 = (Double) obj;
                switch (i2) {
                    case 0:
                        return Double.valueOf(Double.sum(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    case 1:
                        return Double.valueOf(d2.doubleValue() - ((Double) obj2).doubleValue());
                    case 2:
                        return Double.valueOf(((Double) obj2).doubleValue() * d2.doubleValue());
                    case 3:
                        return Double.valueOf(d2.doubleValue() / ((Double) obj2).doubleValue());
                    case 4:
                        return Double.valueOf(d2.doubleValue() % ((Double) obj2).doubleValue());
                    case 5:
                        return Double.valueOf(Math.min(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    default:
                        return Double.valueOf(Math.max(d2.doubleValue(), ((Double) obj2).doubleValue()));
                }
            }
        }, 0);
        final int i3 = 1;
        e = new xm8("-", new BiFunction() { // from class: wm8
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double d2 = (Double) obj;
                switch (i3) {
                    case 0:
                        return Double.valueOf(Double.sum(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    case 1:
                        return Double.valueOf(d2.doubleValue() - ((Double) obj2).doubleValue());
                    case 2:
                        return Double.valueOf(((Double) obj2).doubleValue() * d2.doubleValue());
                    case 3:
                        return Double.valueOf(d2.doubleValue() / ((Double) obj2).doubleValue());
                    case 4:
                        return Double.valueOf(d2.doubleValue() % ((Double) obj2).doubleValue());
                    case 5:
                        return Double.valueOf(Math.min(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    default:
                        return Double.valueOf(Math.max(d2.doubleValue(), ((Double) obj2).doubleValue()));
                }
            }
        }, 2);
        final int i4 = 2;
        f = new xm8("*", new BiFunction() { // from class: wm8
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double d2 = (Double) obj;
                switch (i4) {
                    case 0:
                        return Double.valueOf(Double.sum(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    case 1:
                        return Double.valueOf(d2.doubleValue() - ((Double) obj2).doubleValue());
                    case 2:
                        return Double.valueOf(((Double) obj2).doubleValue() * d2.doubleValue());
                    case 3:
                        return Double.valueOf(d2.doubleValue() / ((Double) obj2).doubleValue());
                    case 4:
                        return Double.valueOf(d2.doubleValue() % ((Double) obj2).doubleValue());
                    case 5:
                        return Double.valueOf(Math.min(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    default:
                        return Double.valueOf(Math.max(d2.doubleValue(), ((Double) obj2).doubleValue()));
                }
            }
        }, 0);
        final int i5 = 3;
        g = new xm8("/", new BiFunction() { // from class: wm8
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double d2 = (Double) obj;
                switch (i5) {
                    case 0:
                        return Double.valueOf(Double.sum(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    case 1:
                        return Double.valueOf(d2.doubleValue() - ((Double) obj2).doubleValue());
                    case 2:
                        return Double.valueOf(((Double) obj2).doubleValue() * d2.doubleValue());
                    case 3:
                        return Double.valueOf(d2.doubleValue() / ((Double) obj2).doubleValue());
                    case 4:
                        return Double.valueOf(d2.doubleValue() % ((Double) obj2).doubleValue());
                    case 5:
                        return Double.valueOf(Math.min(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    default:
                        return Double.valueOf(Math.max(d2.doubleValue(), ((Double) obj2).doubleValue()));
                }
            }
        }, 2);
        final int i6 = 4;
        h = new xm8("%", new BiFunction() { // from class: wm8
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double d2 = (Double) obj;
                switch (i6) {
                    case 0:
                        return Double.valueOf(Double.sum(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    case 1:
                        return Double.valueOf(d2.doubleValue() - ((Double) obj2).doubleValue());
                    case 2:
                        return Double.valueOf(((Double) obj2).doubleValue() * d2.doubleValue());
                    case 3:
                        return Double.valueOf(d2.doubleValue() / ((Double) obj2).doubleValue());
                    case 4:
                        return Double.valueOf(d2.doubleValue() % ((Double) obj2).doubleValue());
                    case 5:
                        return Double.valueOf(Math.min(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    default:
                        return Double.valueOf(Math.max(d2.doubleValue(), ((Double) obj2).doubleValue()));
                }
            }
        }, 2);
        final int i7 = 5;
        i = new xm8("min", new BiFunction() { // from class: wm8
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double d2 = (Double) obj;
                switch (i7) {
                    case 0:
                        return Double.valueOf(Double.sum(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    case 1:
                        return Double.valueOf(d2.doubleValue() - ((Double) obj2).doubleValue());
                    case 2:
                        return Double.valueOf(((Double) obj2).doubleValue() * d2.doubleValue());
                    case 3:
                        return Double.valueOf(d2.doubleValue() / ((Double) obj2).doubleValue());
                    case 4:
                        return Double.valueOf(d2.doubleValue() % ((Double) obj2).doubleValue());
                    case 5:
                        return Double.valueOf(Math.min(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    default:
                        return Double.valueOf(Math.max(d2.doubleValue(), ((Double) obj2).doubleValue()));
                }
            }
        }, 0);
        final int i8 = 6;
        j = new xm8("max", new BiFunction() { // from class: wm8
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double d2 = (Double) obj;
                switch (i8) {
                    case 0:
                        return Double.valueOf(Double.sum(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    case 1:
                        return Double.valueOf(d2.doubleValue() - ((Double) obj2).doubleValue());
                    case 2:
                        return Double.valueOf(((Double) obj2).doubleValue() * d2.doubleValue());
                    case 3:
                        return Double.valueOf(d2.doubleValue() / ((Double) obj2).doubleValue());
                    case 4:
                        return Double.valueOf(d2.doubleValue() % ((Double) obj2).doubleValue());
                    case 5:
                        return Double.valueOf(Math.min(d2.doubleValue(), ((Double) obj2).doubleValue()));
                    default:
                        return Double.valueOf(Math.max(d2.doubleValue(), ((Double) obj2).doubleValue()));
                }
            }
        }, 0);
    }

    public xm8(String str, BiFunction biFunction, int i2) {
        this.a = str;
        this.b = biFunction;
        this.c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        if (r4.equals("/") != false) goto L54;
     */
    @Override // defpackage.yoa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8, java.lang.String r9, java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm8.b(java.lang.Object, java.lang.String, java.util.List):java.lang.Object");
    }

    @Override // defpackage.ei7
    public final String c() {
        return this.a;
    }
}
