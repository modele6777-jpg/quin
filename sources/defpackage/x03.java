package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x03 implements x7e {
    public static final e61 c = new e61(new t51(4), ba9.a);
    public final jy6 a;
    public final long[] b;

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public x03(yob yobVar) {
        int i = yobVar.d;
        long j = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            ey6 ey6VarListIterator = yobVar.listIterator(0);
            Object next = ey6VarListIterator.next();
            if (ey6VarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && ey6VarListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(ey6VarListIterator.next());
                    i2++;
                }
                if (ey6VarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            w03 w03Var = (w03) next;
            long j2 = w03Var.b;
            long j3 = w03Var.c;
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            jy6 jy6Var = w03Var.a;
            if (j3 == -9223372036854775807L) {
                this.a = jy6.s(jy6Var);
                this.b = new long[]{j4};
                return;
            } else {
                ey6 ey6Var = jy6.b;
                this.a = jy6.t(jy6Var, yob.e);
                this.b = new long[]{j4, j3 + j4};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        yob yobVarX = jy6.x(c, yobVar);
        int i3 = 0;
        while (i2 < yobVarX.d) {
            w03 w03Var2 = (w03) yobVarX.get(i2);
            long j5 = w03Var2.b;
            long j6 = w03Var2.c;
            jy6 jy6Var2 = w03Var2.a;
            j5 = j5 == j ? 0L : j5;
            long j7 = j5 + j6;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j8 = this.b[i4];
                if (j8 < j5) {
                    this.b[i3] = j5;
                    arrayList.add(jy6Var2);
                    i3++;
                } else if (j8 == j5 && ((jy6) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, jy6Var2);
                } else {
                    xo1.V("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.b[i4] = j5;
                    arrayList.set(i4, jy6Var2);
                }
            } else {
                this.b[i3] = j5;
                arrayList.add(jy6Var2);
                i3++;
            }
            if (j6 != j) {
                this.b[i3] = j7;
                arrayList.add(yob.e);
                i3++;
            }
            i2++;
            j = j;
        }
        this.a = jy6.o(arrayList);
    }

    @Override // defpackage.x7e
    public final int c(long j) {
        int iA = pqf.a(this.b, j, false);
        if (iA < this.a.size()) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.x7e
    public final long f(int i) {
        pa7.A(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.x7e
    public final List j(long j) {
        int iD = pqf.d(this.b, j, false);
        if (iD != -1) {
            return (jy6) this.a.get(iD);
        }
        ey6 ey6Var = jy6.b;
        return yob.e;
    }

    @Override // defpackage.x7e
    public final int l() {
        return this.a.size();
    }
}
