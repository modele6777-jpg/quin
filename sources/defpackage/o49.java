package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o49 implements xsc {
    public final long a;
    public final p49[] b;
    public final int c;

    public o49(long j, p49[] p49VarArr, int i) {
        this.a = j;
        this.b = p49VarArr;
        this.c = i;
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x009c A[SYNTHETIC] */
    @Override // defpackage.xsc
    public final wsc f(long j) {
        long j2;
        long j3;
        long jMin;
        long j4;
        int i;
        long jMin2;
        n1f n1fVar;
        long[] jArr;
        int iA;
        int iA2;
        int iB;
        p49[] p49VarArr = this.b;
        int length = p49VarArr.length;
        zsc zscVar = zsc.c;
        if (length == 0) {
            return new wsc(zscVar, zscVar);
        }
        int i2 = this.c;
        if (i2 != -1) {
            n1f n1fVar2 = p49VarArr[i2].b;
            int iA3 = n1fVar2.a(j);
            if (iA3 == -1) {
                iA3 = n1fVar2.b(j);
            }
            long[] jArr2 = n1fVar2.c;
            long[] jArr3 = n1fVar2.f;
            if (iA3 == -1) {
                return new wsc(zscVar, zscVar);
            }
            j3 = jArr3[iA3];
            j2 = jArr2[iA3];
            if (j3 < j && iA3 < n1fVar2.b - 1 && (iB = n1fVar2.b(j)) != -1 && iB != iA3) {
                j4 = jArr3[iB];
                jMin = jArr2[iB];
            }
            jMin2 = j2;
            for (i = 0; i < p49VarArr.length; i++) {
                if (i != i2) {
                    n1fVar = p49VarArr[i].b;
                    jArr = n1fVar.c;
                    iA = n1fVar.a(j3);
                    if (iA == -1) {
                        iA = n1fVar.b(j3);
                    }
                    if (iA != -1) {
                        jMin2 = Math.min(jArr[iA], jMin2);
                    }
                    if (j4 == -9223372036854775807L) {
                        iA2 = n1fVar.a(j4);
                        if (iA2 == -1) {
                            iA2 = n1fVar.b(j4);
                        }
                        if (iA2 == -1) {
                            jMin = Math.min(jArr[iA2], jMin);
                        }
                    }
                }
            }
            zsc zscVar2 = new zsc(j3, jMin2);
            return j4 == -9223372036854775807L ? new wsc(zscVar2, zscVar2) : new wsc(zscVar2, new zsc(j4, jMin));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        jMin = -1;
        j4 = -9223372036854775807L;
        jMin2 = j2;
        while (i < p49VarArr.length) {
            if (i != i2) {
                n1fVar = p49VarArr[i].b;
                jArr = n1fVar.c;
                iA = n1fVar.a(j3);
                if (iA == -1) {
                    iA = n1fVar.b(j3);
                }
                if (iA != -1) {
                    jMin2 = Math.min(jArr[iA], jMin2);
                }
                if (j4 == -9223372036854775807L) {
                    iA2 = n1fVar.a(j4);
                    if (iA2 == -1) {
                        iA2 = n1fVar.b(j4);
                    }
                    if (iA2 == -1) {
                        jMin = Math.min(jArr[iA2], jMin);
                    }
                }
            }
        }
        zsc zscVar3 = new zsc(j3, jMin2);
        if (j4 == -9223372036854775807L) {
        }
    }

    @Override // defpackage.xsc
    public final long h() {
        return this.a;
    }
}
