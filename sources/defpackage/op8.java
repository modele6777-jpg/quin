package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class op8 {
    public static final /* synthetic */ int g = 0;
    public final String a;
    public final lp8 b;
    public final kp8 c;
    public final rp8 d;
    public final ip8 e;
    public final mp8 f;

    static {
        d82 d82Var = new d82();
        new eu4();
        List list = Collections.EMPTY_LIST;
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        jp8 jp8Var = new jp8();
        mp8 mp8Var = mp8.a;
        new ip8(d82Var);
        new kp8(jp8Var);
        rp8 rp8Var = rp8.C;
        kv2.v(0, 1, 2, 3, 4);
        pqf.D(5);
    }

    public op8(String str, ip8 ip8Var, lp8 lp8Var, kp8 kp8Var, rp8 rp8Var, mp8 mp8Var) {
        this.a = str;
        this.b = lp8Var;
        this.c = kp8Var;
        this.d = rp8Var;
        this.e = ip8Var;
        this.f = mp8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op8)) {
            return false;
        }
        op8 op8Var = (op8) obj;
        return Objects.equals(this.a, op8Var.a) && this.e.equals(op8Var.e) && Objects.equals(this.b, op8Var.b) && this.c.equals(op8Var.c) && Objects.equals(this.d, op8Var.d) && Objects.equals(this.f, op8Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lp8 lp8Var = this.b;
        int iHashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (lp8Var != null ? lp8Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return iHashCode2;
    }
}
