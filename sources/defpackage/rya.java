package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rya extends l56 implements wt8 {
    public final /* synthetic */ int b;
    public int c;
    public List d;

    public /* synthetic */ rya(int i) {
        this.b = i;
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                rya ryaVar = new rya(0);
                ryaVar.d = Collections.EMPTY_LIST;
                ryaVar.n(j());
                return ryaVar;
            case 1:
                rya ryaVar2 = new rya(1);
                ryaVar2.d = Collections.EMPTY_LIST;
                ryaVar2.o(k());
                return ryaVar2;
            case 2:
                rya ryaVar3 = new rya(2);
                ryaVar3.d = Collections.EMPTY_LIST;
                ryaVar3.q(m());
                return ryaVar3;
            default:
                rya ryaVar4 = new rya(3);
                ryaVar4.d = t18.b;
                ryaVar4.p(l());
                return ryaVar4;
        }
    }

    @Override // defpackage.l56
    public final ut8 f() {
        switch (this.b) {
            case 0:
                sya syaVarJ = j();
                if (syaVarJ.b()) {
                    return syaVarJ;
                }
                throw new qef();
            case 1:
                oza ozaVarK = k();
                if (ozaVarK.b()) {
                    return ozaVarK;
                }
                throw new qef();
            case 2:
                i0b i0bVarM = m();
                if (i0bVarM.b()) {
                    return i0bVarM;
                }
                throw new qef();
            default:
                qza qzaVarL = l();
                if (qzaVarL.b()) {
                    return qzaVarL;
                }
                throw new qef();
        }
    }

    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        qza qzaVar = null;
        sya syaVar = null;
        oza ozaVar = null;
        i0b i0bVar = null;
        try {
            try {
                try {
                    try {
                        switch (this.b) {
                            case 0:
                                try {
                                    sya.b.getClass();
                                    n(new sya(g72Var, o85Var));
                                    return this;
                                } catch (ab7 e) {
                                    sya syaVar2 = (sya) e.a();
                                    try {
                                        throw e;
                                    } catch (Throwable th) {
                                        th = th;
                                        syaVar = syaVar2;
                                        if (syaVar != null) {
                                            n(syaVar);
                                        }
                                        throw th;
                                    }
                                }
                            case 1:
                                try {
                                    oza.b.getClass();
                                    o(new oza(g72Var, o85Var));
                                    return this;
                                } catch (ab7 e2) {
                                    oza ozaVar2 = (oza) e2.a();
                                    try {
                                        throw e2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        ozaVar = ozaVar2;
                                        if (ozaVar != null) {
                                            o(ozaVar);
                                        }
                                        throw th;
                                    }
                                }
                            case 2:
                                try {
                                    i0b.b.getClass();
                                    q(new i0b(g72Var, o85Var));
                                    return this;
                                } catch (ab7 e3) {
                                    i0b i0bVar2 = (i0b) e3.a();
                                    try {
                                        throw e3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i0bVar = i0bVar2;
                                        if (i0bVar != null) {
                                            q(i0bVar);
                                        }
                                        throw th;
                                    }
                                }
                            default:
                                try {
                                    qza.b.getClass();
                                    p(new qza(g72Var));
                                    return this;
                                } catch (ab7 e4) {
                                    qza qzaVar2 = (qza) e4.a();
                                    try {
                                        throw e4;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        qzaVar = qzaVar2;
                                        if (qzaVar != null) {
                                            p(qzaVar);
                                        }
                                        throw th;
                                    }
                                }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        switch (this.b) {
            case 0:
                n((sya) u56Var);
                break;
            case 1:
                o((oza) u56Var);
                break;
            case 2:
                q((i0b) u56Var);
                break;
            default:
                p((qza) u56Var);
                break;
        }
        return this;
    }

    public sya j() {
        sya syaVar = new sya(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        syaVar.effect_ = this.d;
        return syaVar;
    }

    public oza k() {
        oza ozaVar = new oza(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        ozaVar.qualifiedName_ = this.d;
        return ozaVar;
    }

    public qza l() {
        qza qzaVar = new qza(this);
        if ((this.c & 1) == 1) {
            this.d = ((w18) this.d).l();
            this.c &= -2;
        }
        qzaVar.string_ = (w18) this.d;
        return qzaVar;
    }

    public i0b m() {
        i0b i0bVar = new i0b(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        i0bVar.requirement_ = this.d;
        return i0bVar;
    }

    public void n(sya syaVar) {
        if (syaVar == sya.a) {
            return;
        }
        if (!syaVar.effect_.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = syaVar.effect_;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(syaVar.effect_);
            }
        }
        this.a = this.a.c(syaVar.unknownFields);
    }

    public void o(oza ozaVar) {
        if (ozaVar == oza.a) {
            return;
        }
        if (!ozaVar.qualifiedName_.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = ozaVar.qualifiedName_;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(ozaVar.qualifiedName_);
            }
        }
        this.a = this.a.c(ozaVar.unknownFields);
    }

    public void p(qza qzaVar) {
        if (qzaVar == qza.a) {
            return;
        }
        if (!qzaVar.string_.isEmpty()) {
            if (((w18) this.d).isEmpty()) {
                this.d = qzaVar.string_;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new t18((w18) this.d);
                    this.c |= 1;
                }
                ((w18) this.d).addAll(qzaVar.string_);
            }
        }
        this.a = this.a.c(qzaVar.unknownFields);
    }

    public void q(i0b i0bVar) {
        if (i0bVar == i0b.a) {
            return;
        }
        if (!i0bVar.requirement_.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = i0bVar.requirement_;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(i0bVar.requirement_);
            }
        }
        this.a = this.a.c(i0bVar.unknownFields);
    }
}
