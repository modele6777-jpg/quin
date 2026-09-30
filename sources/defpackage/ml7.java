package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ml7 extends l56 implements wt8 {
    public int b;
    public List c;
    public List d;

    public final Object clone() {
        ml7 ml7Var = new ml7();
        List list = Collections.EMPTY_LIST;
        ml7Var.c = list;
        ml7Var.d = list;
        ml7Var.k(j());
        return ml7Var;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        ql7 ql7VarJ = j();
        if (ql7VarJ.b()) {
            return ql7VarJ;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        ql7 ql7Var = null;
        try {
            try {
                ql7.b.getClass();
                k(new ql7(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (ql7Var != null) {
                    k(ql7Var);
                }
                throw th;
            }
        } catch (ab7 e) {
            ql7 ql7Var2 = (ql7) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                ql7Var = ql7Var2;
                if (ql7Var != null) {
                    k(ql7Var);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        k((ql7) u56Var);
        return this;
    }

    public final ql7 j() {
        ql7 ql7Var = new ql7(this);
        if ((this.b & 1) == 1) {
            this.c = Collections.unmodifiableList(this.c);
            this.b &= -2;
        }
        ql7Var.record_ = this.c;
        if ((this.b & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
            this.b &= -3;
        }
        ql7Var.localName_ = this.d;
        return ql7Var;
    }

    public final void k(ql7 ql7Var) {
        if (ql7Var == ql7.a) {
            return;
        }
        if (!ql7Var.record_.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c = ql7Var.record_;
                this.b &= -2;
            } else {
                if ((this.b & 1) != 1) {
                    this.c = new ArrayList(this.c);
                    this.b |= 1;
                }
                this.c.addAll(ql7Var.record_);
            }
        }
        if (!ql7Var.localName_.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = ql7Var.localName_;
                this.b &= -3;
            } else {
                if ((this.b & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.b |= 2;
                }
                this.d.addAll(ql7Var.localName_);
            }
        }
        this.a = this.a.c(ql7Var.unknownFields);
    }
}
