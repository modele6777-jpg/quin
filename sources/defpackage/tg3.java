package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = lxe.class)
public final class tg3 extends ug3 {
    public static final sg3 Companion = new sg3();
    public final long b;
    public final String c;
    public final long d;

    public tg3(long j) {
        this.b = j;
        if (j <= 0) {
            qc0.o(kv2.m("Unit duration must be positive, but was ", " ns.", j));
            throw null;
        }
        if (j % 3600000000000L == 0) {
            this.c = "HOUR";
            this.d = j / 3600000000000L;
            return;
        }
        if (j % 60000000000L == 0) {
            this.c = "MINUTE";
            this.d = j / 60000000000L;
            return;
        }
        if (j % 1000000000 == 0) {
            this.c = "SECOND";
            this.d = j / 1000000000;
        } else if (j % 1000000 == 0) {
            this.c = "MILLISECOND";
            this.d = j / 1000000;
        } else if (j % 1000 == 0) {
            this.c = "MICROSECOND";
            this.d = j / 1000;
        } else {
            this.c = "NANOSECOND";
            this.d = j;
        }
    }

    public final tg3 b(int i) {
        return new tg3(Math.multiplyExact(this.b, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tg3) {
            return this.b == ((tg3) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final String toString() {
        String str = this.c;
        str.getClass();
        long j = this.d;
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }
}
