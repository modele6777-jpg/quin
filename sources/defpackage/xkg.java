package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class xkg {
    public static /* synthetic */ int a(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        qc0.i("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static int b(int i, int i2, int i3) {
        return gmg.a(i) + i2 + i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return gmg.a(i) + i2 + i3 + i4;
    }

    public static int d(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static zmg e(zmg zmgVar) {
        int size = zmgVar.size();
        return zmgVar.k0(size + size);
    }

    public static int f(int i, int i2, int i3) {
        return p90.G0(i) + i2 + i3;
    }

    public static int g(int i, int i2, int i3, int i4) {
        return p90.G0(i) + i2 + i3 + i4;
    }
}
