package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a67 implements b67 {
    public int a;
    public long b;

    public /* synthetic */ a67(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static a67 b(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new a67(j, i3);
    }

    public static a67 c(m95 m95Var, d0a d0aVar) {
        m95Var.o(d0aVar.a, 0, 8);
        d0aVar.M(0);
        return new a67(d0aVar.m(), d0aVar.q());
    }

    public synchronized boolean a() {
        return this.a == 0 || System.currentTimeMillis() > this.b;
    }

    public synchronized void d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.a = 0;
            }
            return;
        } else {
            this.a++;
            synchronized (this) {
                this.b = System.currentTimeMillis() + ((i == 429 || (i >= 500 && i < 600)) ? (long) Math.min(Math.pow(2.0d, this.a) + ((long) (Math.random() * 1000.0d)), 1800000.0d) : 86400000L);
            }
            return;
        }
        throw th;
    }

    @Override // defpackage.b67
    public w57 toInstant() {
        long j = this.b;
        if (j >= w57.a.a() && j <= w57.b.a()) {
            return mh3.y(this.a, j);
        }
        throw new y57("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }

    public /* synthetic */ a67(long j, int i) {
        this.b = j;
        this.a = i;
    }
}
