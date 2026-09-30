package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xya extends p56 {
    public int d;
    public int e;
    public List f;

    public final Object clone() {
        xya xyaVar = new xya();
        xyaVar.f = Collections.EMPTY_LIST;
        xyaVar.l(k());
        return xyaVar;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        yya yyaVarK = k();
        if (yyaVarK.b()) {
            return yyaVarK;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        yya yyaVar = null;
        try {
            try {
                yya.b.getClass();
                l(new yya(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (yyaVar != null) {
                    l(yyaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            yya yyaVar2 = (yya) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                yyaVar = yyaVar2;
                if (yyaVar != null) {
                    l(yyaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        l((yya) u56Var);
        return this;
    }

    public final yya k() {
        yya yyaVar = new yya(this);
        int i = (this.d & 1) != 1 ? 0 : 1;
        yyaVar.name_ = this.e;
        if ((this.d & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
            this.d &= -3;
        }
        yyaVar.annotation_ = this.f;
        yyaVar.bitField0_ = i;
        return yyaVar;
    }

    public final void l(yya yyaVar) {
        if (yyaVar == yya.a) {
            return;
        }
        if (yyaVar.B()) {
            int iA = yyaVar.A();
            this.d |= 1;
            this.e = iA;
        }
        if (!yyaVar.annotation_.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = yyaVar.annotation_;
                this.d &= -3;
            } else {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
                this.f.addAll(yyaVar.annotation_);
            }
        }
        j(yyaVar);
        this.a = this.a.c(yyaVar.unknownFields);
    }
}
