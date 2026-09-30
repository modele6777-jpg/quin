package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zk8 implements ozb {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;

    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[LOOP:0: B:5:0x000f->B:19:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[EDGE_INSN: B:23:0x0056->B:20:0x0056 BREAK  A[LOOP:0: B:5:0x000f->B:19:0x0053], SYNTHETIC] */
    public void a() {
        w79 w79Var = (w79) this.d;
        Object[] objArr = w79Var.c;
        long[] jArr = w79Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof i79) {
                                i79 i79Var = (i79) obj;
                                Object[] objArr2 = i79Var.a;
                                int i4 = i79Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        w79Var.a();
    }
}
