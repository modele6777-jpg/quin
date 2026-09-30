package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ig2 implements eyc {
    public final yob a;
    public long b;

    public ig2(List list, List list2) {
        dy6 dy6VarM = jy6.m();
        pa7.A(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            dy6VarM.b(new hg2((eyc) list.get(i), (List) list2.get(i)));
        }
        this.a = dy6VarM.g();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.eyc
    public final long d() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            yob yobVar = this.a;
            if (i >= yobVar.d) {
                break;
            }
            long jD = ((hg2) yobVar.get(i)).a.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.eyc
    public final boolean i() {
        int i = 0;
        while (true) {
            yob yobVar = this.a;
            if (i >= yobVar.d) {
                return false;
            }
            if (((hg2) yobVar.get(i)).a.i()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.eyc
    public final boolean o(da8 da8Var) {
        boolean zO;
        boolean z = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zO = false;
            while (true) {
                yob yobVar = this.a;
                if (i >= yobVar.d) {
                    break;
                }
                long jD2 = ((hg2) yobVar.get(i)).a.d();
                boolean z2 = jD2 != Long.MIN_VALUE && jD2 <= da8Var.a;
                if (jD2 == jD || z2) {
                    zO |= ((hg2) yobVar.get(i)).a.o(da8Var);
                }
                i++;
            }
            z |= zO;
        } while (zO);
        return z;
    }

    @Override // defpackage.eyc
    public final long p() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            yob yobVar = this.a;
            if (i >= yobVar.d) {
                break;
            }
            hg2 hg2Var = (hg2) yobVar.get(i);
            long jP = hg2Var.a.p();
            jy6 jy6Var = hg2Var.b;
            if ((jy6Var.contains(1) || jy6Var.contains(2) || jy6Var.contains(4)) && jP != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jP);
            }
            if (jP != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jP);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.eyc
    public final void r(long j) {
        int i = 0;
        while (true) {
            yob yobVar = this.a;
            if (i >= yobVar.d) {
                return;
            }
            ((hg2) yobVar.get(i)).r(j);
            i++;
        }
    }
}
