package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e37 extends gia {
    public final boolean l;

    public e37(String str, f37 f37Var) {
        super(str, f37Var, 1);
        this.l = true;
    }

    @Override // defpackage.gia
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e37) {
            nyc nycVar = (nyc) obj;
            if (this.a.equals(nycVar.a())) {
                e37 e37Var = (e37) obj;
                if (e37Var.l && Arrays.equals((nyc[]) this.j.getValue(), (nyc[]) e37Var.j.getValue())) {
                    int iE = nycVar.e();
                    int i = this.c;
                    if (i == iE) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (pa7.t(i(i2).a(), nycVar.i(i2).a()) && pa7.t(i(i2).g(), nycVar.i(i2).g())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.gia
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.nyc
    public final boolean isInline() {
        return this.l;
    }
}
