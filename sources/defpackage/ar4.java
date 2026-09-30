package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ar4 implements Comparable {
    public static final qfc b = new qfc();
    public static final long c = y41.k(4611686018427387903L);
    public static final long d = y41.k(-4611686018427387903L);
    public static final long e = 9223372036854759646L;
    public final long a;

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jD = y41.d(j, j3);
        if (-4611686018426L > jD || jD >= 4611686018427L) {
            return y41.k(jD);
        }
        long j4 = ((jD * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = dr4.a;
        return j4;
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strW = v4e.W(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strW.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strW.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strW, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strW, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return pa7.M(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final long d(long j) {
        return ((((int) j) & 1) != 1 || f(j)) ? h(j, gr4.MILLISECONDS) : j >> 1;
    }

    public static final int e(long j) {
        if (f(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean f(long j) {
        return j == c || j == d;
    }

    public static final long g(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return y41.k(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = dr4.a;
            return j4;
        }
        long jD = y41.d(j >> 1, j2 >> 1);
        if (jD == 9223372036854759646L) {
            qc0.j("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jD == 4611686018427387903L || jD == -4611686018427387903L) {
            return y41.k(jD);
        }
        if (-4611686018426L > jD || jD >= 4611686018427L) {
            return y41.k(mh3.q(jD, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (jD * 1000000) << 1;
        int i3 = dr4.a;
        return j5;
    }

    public static final long h(long j, gr4 gr4Var) {
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return gr4Var.a().convert(j >> 1, ((((int) j) & 1) == 0 ? gr4.NANOSECONDS : gr4.MILLISECONDS).a());
    }

    public static String i(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = j(j);
        }
        long jH = h(j, gr4.DAYS);
        int iH = f(j) ? 0 : (int) (h(j, gr4.HOURS) % 24);
        int iH2 = f(j) ? 0 : (int) (h(j, gr4.MINUTES) % 60);
        int iH3 = f(j) ? 0 : (int) (h(j, gr4.SECONDS) % 60);
        int iE = e(j);
        boolean z2 = jH != 0;
        boolean z3 = iH != 0;
        boolean z4 = iH2 != 0;
        boolean z5 = (iH3 == 0 && iE == 0) ? false : true;
        if (z2) {
            sb.append(jH);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iH);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iH2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iH3 != 0 || z2 || z3 || z4) {
                b(sb, iH3, iE, 9, "s", false);
            } else if (iE >= 1000000) {
                b(sb, iE / 1000000, iE % 1000000, 6, "ms", false);
            } else if (iE >= 1000) {
                b(sb, iE / 1000, iE % 1000, 3, "us", false);
            } else {
                sb.append(iE);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long j(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = dr4.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.a, ((ar4) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ar4) {
            return this.a == ((ar4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
