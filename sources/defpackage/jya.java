package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jya extends l56 implements wt8 {
    public final /* synthetic */ int b;
    public int c;
    public List d;
    public int e;

    public /* synthetic */ jya(int i) {
        this.b = i;
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                jya jyaVar = new jya(0);
                jyaVar.d = Collections.EMPTY_LIST;
                jyaVar.l(j());
                return jyaVar;
            default:
                jya jyaVar2 = new jya(1);
                jyaVar2.d = Collections.EMPTY_LIST;
                jyaVar2.e = -1;
                jyaVar2.m(k());
                return jyaVar2;
        }
    }

    @Override // defpackage.l56
    public final ut8 f() {
        switch (this.b) {
            case 0:
                kya kyaVarJ = j();
                if (kyaVarJ.b()) {
                    return kyaVarJ;
                }
                throw new qef();
            default:
                b0b b0bVarK = k();
                if (b0bVarK.b()) {
                    return b0bVarK;
                }
                throw new qef();
        }
    }

    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        b0b b0bVar = null;
        kya kyaVar = null;
        try {
            try {
                switch (this.b) {
                    case 0:
                        try {
                            kya.b.getClass();
                            l(new kya(g72Var, o85Var));
                            return this;
                        } catch (ab7 e) {
                            kya kyaVar2 = (kya) e.a();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                kyaVar = kyaVar2;
                                if (kyaVar != null) {
                                    l(kyaVar);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            b0b.b.getClass();
                            m(new b0b(g72Var, o85Var));
                            return this;
                        } catch (ab7 e2) {
                            b0b b0bVar2 = (b0b) e2.a();
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                b0bVar = b0bVar2;
                                if (b0bVar != null) {
                                    m(b0bVar);
                                }
                                throw th;
                            }
                        }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        switch (this.b) {
            case 0:
                l((kya) u56Var);
                break;
            default:
                m((b0b) u56Var);
                break;
        }
        return this;
    }

    public kya j() {
        kya kyaVar = new kya(this);
        int i = (this.c & 1) != 1 ? 0 : 1;
        kyaVar.id_ = this.e;
        if ((this.c & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -3;
        }
        kyaVar.argument_ = this.d;
        kyaVar.bitField0_ = i;
        return kyaVar;
    }

    public b0b k() {
        b0b b0bVar = new b0b(this);
        int i = this.c;
        if ((i & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        b0bVar.type_ = this.d;
        int i2 = (i & 2) != 2 ? 0 : 1;
        b0bVar.firstNullable_ = this.e;
        b0bVar.bitField0_ = i2;
        return b0bVar;
    }

    public void l(kya kyaVar) {
        if (kyaVar == kya.a) {
            return;
        }
        if (kyaVar.r()) {
            int iQ = kyaVar.q();
            this.c |= 1;
            this.e = iQ;
        }
        if (!kyaVar.argument_.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = kyaVar.argument_;
                this.c &= -3;
            } else {
                if ((this.c & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.c |= 2;
                }
                this.d.addAll(kyaVar.argument_);
            }
        }
        this.a = this.a.c(kyaVar.unknownFields);
    }

    public void m(b0b b0bVar) {
        if (b0bVar == b0b.a) {
            return;
        }
        if (!b0bVar.type_.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = b0bVar.type_;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(b0bVar.type_);
            }
        }
        if (b0bVar.q()) {
            int iO = b0bVar.o();
            this.c |= 2;
            this.e = iO;
        }
        this.a = this.a.c(b0bVar.unknownFields);
    }
}
