package defpackage;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kq8 implements fq8, bq4 {
    public final mq8 a;
    public final /* synthetic */ nq8 b;

    public kq8(nq8 nq8Var, mq8 mq8Var) {
        this.b = nq8Var;
        this.a = mq8Var;
    }

    @Override // defpackage.fq8
    public final void F(int i, zp8 zp8Var, final v98 v98Var, final qp8 qp8Var, final int i2) {
        final Pair pairA = a(i, zp8Var);
        if (pairA != null) {
            this.b.j.e(new Runnable() { // from class: jq8
                @Override // java.lang.Runnable
                public final void run() {
                    ro3 ro3Var = this.a.b.i;
                    Pair pair = pairA;
                    ro3Var.F(((Integer) pair.first).intValue(), (zp8) pair.second, v98Var, qp8Var, i2);
                }
            });
        }
    }

    public final Pair a(int i, zp8 zp8Var) {
        zp8 zp8VarA;
        mq8 mq8Var = this.a;
        zp8 zp8Var2 = null;
        if (zp8Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= mq8Var.c.size()) {
                    zp8VarA = null;
                    break;
                }
                if (((zp8) mq8Var.c.get(i2)).d == zp8Var.d) {
                    Object obj = zp8Var.a;
                    Object obj2 = mq8Var.b;
                    int i3 = eia.k;
                    zp8VarA = zp8Var.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (zp8VarA == null) {
                return null;
            }
            zp8Var2 = zp8VarA;
        }
        return Pair.create(Integer.valueOf(i + mq8Var.d), zp8Var2);
    }

    @Override // defpackage.fq8
    public final void d(int i, zp8 zp8Var, qp8 qp8Var) {
        Pair pairA = a(i, zp8Var);
        if (pairA != null) {
            this.b.j.e(new c0(this, pairA, qp8Var, 22));
        }
    }

    @Override // defpackage.fq8
    public final void j(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var) {
        Pair pairA = a(i, zp8Var);
        if (pairA != null) {
            this.b.j.e(new iq8(this, pairA, v98Var, qp8Var, 0));
        }
    }

    @Override // defpackage.fq8
    public final void m(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var) {
        Pair pairA = a(i, zp8Var);
        if (pairA != null) {
            this.b.j.e(new iq8(this, pairA, v98Var, qp8Var, 1));
        }
    }

    @Override // defpackage.fq8
    public final void o(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var, IOException iOException, boolean z) {
        Pair pairA = a(i, zp8Var);
        if (pairA != null) {
            this.b.j.e(new bw0(this, pairA, v98Var, qp8Var, iOException, z, 1));
        }
    }
}
