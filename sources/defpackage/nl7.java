package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nl7 extends l56 implements wt8 {
    public int b;
    public int c;
    public int d;
    public Object e;
    public ol7 f;
    public List g;
    public List v;

    public static nl7 k() {
        nl7 nl7Var = new nl7();
        nl7Var.c = 1;
        nl7Var.e = "";
        nl7Var.f = ol7.NONE;
        List list = Collections.EMPTY_LIST;
        nl7Var.g = list;
        nl7Var.v = list;
        return nl7Var;
    }

    public final Object clone() {
        nl7 nl7VarK = k();
        nl7VarK.l(j());
        return nl7VarK;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        pl7 pl7VarJ = j();
        if (pl7VarJ.b()) {
            return pl7VarJ;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        pl7 pl7Var = null;
        try {
            try {
                pl7.b.getClass();
                l(new pl7(g72Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (pl7Var != null) {
                    l(pl7Var);
                }
                throw th;
            }
        } catch (ab7 e) {
            pl7 pl7Var2 = (pl7) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                pl7Var = pl7Var2;
                if (pl7Var != null) {
                    l(pl7Var);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        l((pl7) u56Var);
        return this;
    }

    public final pl7 j() {
        pl7 pl7Var = new pl7(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        pl7Var.range_ = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        pl7Var.predefinedIndex_ = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        pl7Var.string_ = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        pl7Var.operation_ = this.f;
        if ((this.b & 16) == 16) {
            this.g = Collections.unmodifiableList(this.g);
            this.b &= -17;
        }
        pl7Var.substringIndex_ = this.g;
        if ((this.b & 32) == 32) {
            this.v = Collections.unmodifiableList(this.v);
            this.b &= -33;
        }
        pl7Var.replaceChar_ = this.v;
        pl7Var.bitField0_ = i2;
        return pl7Var;
    }

    public final void l(pl7 pl7Var) {
        if (pl7Var == pl7.a) {
            return;
        }
        if (pl7Var.F()) {
            int iW = pl7Var.w();
            this.b |= 1;
            this.c = iW;
        }
        if (pl7Var.E()) {
            int iV = pl7Var.v();
            this.b |= 2;
            this.d = iV;
        }
        if (pl7Var.G()) {
            this.b |= 4;
            this.e = pl7Var.string_;
        }
        if (pl7Var.D()) {
            ol7 ol7VarU = pl7Var.u();
            ol7VarU.getClass();
            this.b |= 8;
            this.f = ol7VarU;
        }
        if (!pl7Var.substringIndex_.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = pl7Var.substringIndex_;
                this.b &= -17;
            } else {
                if ((this.b & 16) != 16) {
                    this.g = new ArrayList(this.g);
                    this.b |= 16;
                }
                this.g.addAll(pl7Var.substringIndex_);
            }
        }
        if (!pl7Var.replaceChar_.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = pl7Var.replaceChar_;
                this.b &= -33;
            } else {
                if ((this.b & 32) != 32) {
                    this.v = new ArrayList(this.v);
                    this.b |= 32;
                }
                this.v.addAll(pl7Var.replaceChar_);
            }
        }
        this.a = this.a.c(pl7Var.unknownFields);
    }
}
