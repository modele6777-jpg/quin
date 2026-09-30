package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mbb {
    public static final lbb a = new lbb();
    public static final j4 b;

    static {
        Integer num = nd7.a;
        b = (num == null || num.intValue() >= 34) ? new jga() : new ma5();
    }

    public abstract int a(int i);

    public float b() {
        return a(24) / 1.6777216E7f;
    }

    public abstract int c();

    public int d(int i, int i2) {
        int iC;
        int i3;
        int iA;
        if (i2 <= i) {
            qc0.o(eb3.y(Integer.valueOf(i), Integer.valueOf(i2)));
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iC = c() >>> 1;
                    i3 = iC % i4;
                } while ((i4 - 1) + (iC - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iC2 = c();
            if (i <= iC2 && iC2 < i2) {
                return iC2;
            }
        }
    }

    public long e() {
        return (((long) c()) << 32) + ((long) c());
    }

    public long g() {
        long jE;
        long j;
        do {
            jE = e() >>> 1;
            j = jE % 1000;
        } while ((jE - j) + 999 < 0);
        return 500 + j;
    }
}
