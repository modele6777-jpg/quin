package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w57 implements Comparable, Serializable {
    public static final w57 a = new w57(-31557014167219200L, 0);
    public static final w57 b = new w57(31556889864403199L, 999999999);
    private final long epochSeconds;
    private final int nanosecondsOfSecond;

    public w57(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            qc0.j("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        k52 k52Var = z57.a;
        return new c67(this.epochSeconds, this.nanosecondsOfSecond);
    }

    public final long a() {
        return this.epochSeconds;
    }

    public final int b() {
        return this.nanosecondsOfSecond;
    }

    public final long c(w57 w57Var) {
        qfc qfcVar = ar4.b;
        return ar4.g(y41.U(this.epochSeconds - w57Var.epochSeconds, gr4.SECONDS), y41.T(this.nanosecondsOfSecond - w57Var.nanosecondsOfSecond, gr4.NANOSECONDS));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w57 w57Var = (w57) obj;
        w57Var.getClass();
        int iM = pa7.M(this.epochSeconds, w57Var.epochSeconds);
        return iM != 0 ? iM : pa7.L(this.nanosecondsOfSecond, w57Var.nanosecondsOfSecond);
    }

    public final w57 d(long j) {
        qfc qfcVar = ar4.b;
        long jH = ar4.h(j, gr4.SECONDS);
        int iE = ar4.e(j);
        if (jH == 0 && iE == 0) {
            return this;
        }
        long j2 = this.epochSeconds;
        long j3 = j2 + jH;
        if ((j2 ^ j3) >= 0 || (jH ^ j2) < 0) {
            return mh3.y(this.nanosecondsOfSecond + iE, j3);
        }
        return j > 0 ? b : a;
    }

    public final long e() {
        long j = this.epochSeconds;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = this.nanosecondsOfSecond / 1000000;
            long j5 = j2 + j4;
            if ((j2 ^ j5) >= 0 || (j4 ^ j2) < 0) {
                return j5;
            }
            return Long.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (this.nanosecondsOfSecond / 1000000) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j8 ^ j2) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w57)) {
            return false;
        }
        w57 w57Var = (w57) obj;
        return this.epochSeconds == w57Var.epochSeconds && this.nanosecondsOfSecond == w57Var.nanosecondsOfSecond;
    }

    public final int hashCode() {
        return (this.nanosecondsOfSecond * 51) + Long.hashCode(this.epochSeconds);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.epochSeconds;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = this.nanosecondsOfSecond;
        int i12 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        hkg.t0(sb, sb, i4);
        sb.append('-');
        hkg.t0(sb, sb, i5);
        sb.append('T');
        hkg.t0(sb, sb, i7);
        sb.append(':');
        hkg.t0(sb, sb, i9);
        sb.append(':');
        hkg.t0(sb, sb, i10);
        if (i11 != 0) {
            sb.append('.');
            while (true) {
                iArr = hkg.f;
                int i13 = i12 + 1;
                if (i11 % iArr[i13] != 0) {
                    break;
                }
                i12 = i13;
            }
            int i14 = i12 - (i12 % 3);
            String strValueOf = String.valueOf((i11 / iArr[i14]) + iArr[9 - i14]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
