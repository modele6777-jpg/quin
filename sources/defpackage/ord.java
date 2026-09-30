package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ord implements Iterable, zm7 {
    public static final ord e = new ord(0, 0, 0, null);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    public ord(long j, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final ord c(ord ordVar) {
        long[] jArr;
        ord ordVarD = this;
        ord ordVar2 = e;
        if (ordVar == ordVar2) {
            return ordVarD;
        }
        if (ordVarD == ordVar2) {
            return ordVar2;
        }
        long j = ordVar.c;
        long j2 = ordVar.c;
        long[] jArr2 = ordVar.d;
        long j3 = ordVar.b;
        long j4 = ordVar.a;
        long j5 = ordVarD.c;
        if (j == j5 && jArr2 == (jArr = ordVarD.d)) {
            return new ord(ordVarD.a & (~j4), ordVarD.b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                ordVarD = ordVarD.d(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    ordVarD = ordVarD.d(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    ordVarD = ordVarD.d(((long) i2) + j2 + 64);
                }
            }
        }
        return ordVarD;
    }

    public final ord d(long j) {
        long[] jArr;
        int iM;
        long[] jArr2;
        long j2 = j - this.c;
        if (pa7.M(j2, 0L) >= 0 && pa7.M(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new ord(this.a, j4 & (~j3), this.c, this.d);
            }
        } else if (pa7.M(j2, 64L) >= 0 && pa7.M(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.a;
            if ((j6 & j5) != 0) {
                return new ord(j6 & (~j5), this.b, this.c, this.d);
            }
        } else if (pa7.M(j2, 0L) < 0 && (jArr = this.d) != null && (iM = xxb.m(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM > 0) {
                    qd0.b0(jArr, jArr3, 0, 0, iM);
                }
                if (iM < i) {
                    qd0.b0(jArr, jArr3, iM, iM + 1, length);
                }
                jArr2 = jArr3;
            }
            return new ord(this.a, this.b, this.c, jArr2);
        }
        return this;
    }

    public final boolean e(long j) {
        long[] jArr;
        long j2 = j - this.c;
        if (pa7.M(j2, 0L) >= 0 && pa7.M(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.b) != 0;
        }
        if (pa7.M(j2, 64L) < 0 || pa7.M(j2, 128L) >= 0) {
            return pa7.M(j2, 0L) <= 0 && (jArr = this.d) != null && xxb.m(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.a) != 0;
    }

    public final ord f(ord ordVar) {
        ord ordVarG;
        long[] jArr;
        ord ordVarG2 = this;
        ord ordVar2 = e;
        if (ordVar == ordVar2) {
            return ordVarG2;
        }
        if (ordVarG2 == ordVar2) {
            return ordVar;
        }
        long j = ordVar.c;
        long j2 = ordVar.c;
        long[] jArr2 = ordVar.d;
        long j3 = ordVar.b;
        long j4 = ordVar.a;
        long j5 = ordVarG2.c;
        long j6 = ordVarG2.b;
        long j7 = ordVarG2.a;
        if (j == j5 && jArr2 == (jArr = ordVarG2.d)) {
            return new ord(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = ordVarG2.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    ordVarG2 = ordVarG2.g(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        ordVarG2 = ordVarG2.g(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        ordVarG2 = ordVarG2.g(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return ordVarG2;
        }
        if (jArr3 != null) {
            ordVarG = ordVar;
            for (long j9 : jArr3) {
                ordVarG = ordVarG.g(j9);
            }
        } else {
            ordVarG = ordVar;
        }
        long j10 = ordVarG2.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    ordVarG = ordVarG.g(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    ordVarG = ordVarG.g(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return ordVarG;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    public final ord g(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4 = this.c;
        long j5 = j - j4;
        long j6 = 0;
        int iM = pa7.M(j5, 0L);
        long j7 = this.b;
        if (iM < 0 || pa7.M(j5, 64L) >= 0) {
            int iM2 = pa7.M(j5, 64L);
            long j8 = this.a;
            int i2 = 64;
            if (iM2 < 0 || pa7.M(j5, 128L) >= 0) {
                int iM3 = pa7.M(j5, 128L);
                long[] jArr3 = this.d;
                if (iM3 < 0) {
                    if (jArr3 == null) {
                        return new ord(this.a, this.b, this.c, new long[]{j});
                    }
                    int iM4 = xxb.m(jArr3, j);
                    if (iM4 < 0) {
                        int i3 = -(iM4 + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        qd0.b0(jArr3, jArr4, 0, 0, i3);
                        qd0.b0(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new ord(this.a, this.b, this.c, jArr4);
                    }
                } else if (!e(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (pa7.M(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    g5b g5bVar = null;
                    while (true) {
                        if (pa7.M(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (g5bVar == null) {
                                g5bVar = new g5b(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j7 & (1 << i4)) != j6) {
                                    ((x69) g5bVar.b).a(((long) i4) + j4);
                                }
                                i4++;
                                j6 = j6;
                            }
                        } else {
                            i = i2;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i2 = i;
                        j10 = j6;
                    }
                    if (g5bVar == null) {
                        jArr = jArr3;
                    } else {
                        x69 x69Var = (x69) g5bVar.b;
                        int i5 = x69Var.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = x69Var.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new ord(j10, j3, j2, jArr).g(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new ord(j8 | j12, this.b, this.c, this.d);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new ord(this.a, j7 | j13, this.c, this.d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return dec.i(new nrd(this, null));
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(t72.u(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }
}
