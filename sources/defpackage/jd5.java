package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jd5 implements mtd {
    public final jk7 a;
    public long b;
    public boolean c;

    public jd5(jk7 jk7Var, long j) {
        this.a = jk7Var;
        this.b = j;
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) {
        long j2;
        long j3;
        int i;
        f41Var.getClass();
        if (this.c) {
            qc0.p("closed");
            return 0L;
        }
        jk7 jk7Var = this.a;
        long j4 = this.b;
        if (j < 0) {
            qc0.o(ks0.i(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                qtc qtcVarE1 = f41Var.e1(1);
                byte[] bArr = qtcVarE1.a;
                int i2 = qtcVarE1.c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (jk7Var) {
                    bArr.getClass();
                    jk7Var.d.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = jk7Var.d.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (qtcVarE1.b == qtcVarE1.c) {
                        f41Var.a = qtcVarE1.a();
                        ttc.a(qtcVarE1);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    qtcVarE1.c += i;
                    long j7 = i;
                    j6 += j7;
                    f41Var.b += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.b += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        jk7 jk7Var = this.a;
        if (this.c) {
            return;
        }
        this.c = true;
        ReentrantLock reentrantLock = jk7Var.c;
        reentrantLock.lock();
        try {
            int i = jk7Var.b - 1;
            jk7Var.b = i;
            if (i == 0 && jk7Var.a) {
                reentrantLock.unlock();
                synchronized (jk7Var) {
                    jk7Var.d.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.mtd
    public final jye j() {
        return jye.d;
    }
}
