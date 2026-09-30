package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ts8 implements v03 {
    public static final bh2 b = new bh2(new e61(new t51(8), ba9.a), new e61(new t51(9), k0c.a));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.v03
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((w03) arrayList.get(i)).b;
            long j3 = ((w03) arrayList.get(i)).d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.v03
    public final boolean b(w03 w03Var, long j) {
        long j2 = w03Var.b;
        pa7.A(j2 != -9223372036854775807L);
        pa7.A(w03Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < w03Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((w03) arrayList.get(size)).b) {
                arrayList.add(size + 1, w03Var);
                return z;
            }
        }
        arrayList.add(0, w03Var);
        return z;
    }

    @Override // defpackage.v03
    public final jy6 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((w03) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    w03 w03Var = (w03) arrayList.get(i);
                    if (j >= w03Var.b && j < w03Var.d) {
                        arrayList2.add(w03Var);
                    }
                    if (j < w03Var.b) {
                        break;
                    }
                }
                yob yobVarX = jy6.x(b, arrayList2);
                dy6 dy6VarM = jy6.m();
                for (int i2 = 0; i2 < yobVarX.d; i2++) {
                    dy6VarM.d(((w03) yobVarX.get(i2)).a);
                }
                return dy6VarM.g();
            }
        }
        ey6 ey6Var = jy6.b;
        return yob.e;
    }

    @Override // defpackage.v03
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.v03
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((w03) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((w03) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((w03) arrayList.get(i)).b;
            long j3 = ((w03) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.v03
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((w03) arrayList.get(i)).b;
            if (j > j2 && j > ((w03) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
