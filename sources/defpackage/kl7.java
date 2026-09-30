package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kl7 extends l56 implements wt8 {
    public final /* synthetic */ int b;
    public int c;
    public Serializable d;
    public Object e;
    public u56 f;
    public Serializable g;
    public Serializable v;

    public /* synthetic */ kl7(int i) {
        this.b = i;
    }

    public static kl7 l() {
        kl7 kl7Var = new kl7(0);
        kl7Var.d = il7.a;
        jl7 jl7Var = jl7.a;
        kl7Var.e = jl7Var;
        kl7Var.f = jl7Var;
        kl7Var.g = jl7Var;
        kl7Var.v = jl7Var;
        return kl7Var;
    }

    public static kl7 m() {
        kl7 kl7Var = new kl7(1);
        kl7Var.d = uya.RETURNS_CONSTANT;
        kl7Var.e = Collections.EMPTY_LIST;
        kl7Var.f = bza.a;
        kl7Var.g = vya.AT_MOST_ONCE;
        kl7Var.v = tya.CONCLUSION_CONDITION;
        return kl7Var;
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                kl7 kl7VarL = l();
                kl7VarL.n(j());
                return kl7VarL;
            default:
                kl7 kl7VarM = m();
                kl7VarM.o(k());
                return kl7VarM;
        }
    }

    @Override // defpackage.l56
    public final ut8 f() {
        switch (this.b) {
            case 0:
                ll7 ll7VarJ = j();
                if (ll7VarJ.b()) {
                    return ll7VarJ;
                }
                throw new qef();
            default:
                wya wyaVarK = k();
                if (wyaVarK.b()) {
                    return wyaVarK;
                }
                throw new qef();
        }
    }

    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        wya wyaVar = null;
        ll7 ll7Var = null;
        try {
            try {
                switch (this.b) {
                    case 0:
                        try {
                            ll7.b.getClass();
                            n(new ll7(g72Var, o85Var));
                            return this;
                        } catch (ab7 e) {
                            ll7 ll7Var2 = (ll7) e.a();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                ll7Var = ll7Var2;
                                if (ll7Var != null) {
                                    n(ll7Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            wya.b.getClass();
                            o(new wya(g72Var, o85Var));
                            return this;
                        } catch (ab7 e2) {
                            wya wyaVar2 = (wya) e2.a();
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                wyaVar = wyaVar2;
                                if (wyaVar != null) {
                                    o(wyaVar);
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
                n((ll7) u56Var);
                break;
            default:
                o((wya) u56Var);
                break;
        }
        return this;
    }

    public ll7 j() {
        ll7 ll7Var = new ll7(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ll7Var.field_ = (il7) this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ll7Var.syntheticMethod_ = (jl7) this.e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ll7Var.getter_ = (jl7) this.f;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ll7Var.setter_ = (jl7) this.g;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ll7Var.delegateMethod_ = (jl7) this.v;
        ll7Var.bitField0_ = i2;
        return ll7Var;
    }

    public wya k() {
        wya wyaVar = new wya(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        wyaVar.effectType_ = (uya) this.d;
        if ((this.c & 2) == 2) {
            this.e = Collections.unmodifiableList((List) this.e);
            this.c &= -3;
        }
        wyaVar.effectConstructorArgument_ = (List) this.e;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        wyaVar.conclusionOfConditionalEffect_ = (bza) this.f;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        wyaVar.kind_ = (vya) this.g;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        wyaVar.conditionKind_ = (tya) this.v;
        wyaVar.bitField0_ = i2;
        return wyaVar;
    }

    public void n(ll7 ll7Var) {
        jl7 jl7Var;
        jl7 jl7Var2;
        jl7 jl7Var3;
        jl7 jl7Var4;
        il7 il7Var;
        if (ll7Var == ll7.a) {
            return;
        }
        if (ll7Var.w()) {
            il7 il7VarR = ll7Var.r();
            if ((this.c & 1) != 1 || (il7Var = (il7) this.d) == il7.a) {
                this.d = il7VarR;
            } else {
                hl7 hl7Var = new hl7(0);
                hl7Var.l(il7Var);
                hl7Var.l(il7VarR);
                this.d = hl7Var.j();
            }
            this.c |= 1;
        }
        if (ll7Var.A()) {
            jl7 jl7VarU = ll7Var.u();
            if ((this.c & 2) != 2 || (jl7Var4 = (jl7) this.e) == jl7.a) {
                this.e = jl7VarU;
            } else {
                hl7 hl7VarR = jl7.r(jl7Var4);
                hl7VarR.m(jl7VarU);
                this.e = hl7VarR.k();
            }
            this.c |= 2;
        }
        if (ll7Var.x()) {
            jl7 jl7VarS = ll7Var.s();
            if ((this.c & 4) != 4 || (jl7Var3 = (jl7) this.f) == jl7.a) {
                this.f = jl7VarS;
            } else {
                hl7 hl7VarR2 = jl7.r(jl7Var3);
                hl7VarR2.m(jl7VarS);
                this.f = hl7VarR2.k();
            }
            this.c |= 4;
        }
        if (ll7Var.z()) {
            jl7 jl7VarT = ll7Var.t();
            if ((this.c & 8) != 8 || (jl7Var2 = (jl7) this.g) == jl7.a) {
                this.g = jl7VarT;
            } else {
                hl7 hl7VarR3 = jl7.r(jl7Var2);
                hl7VarR3.m(jl7VarT);
                this.g = hl7VarR3.k();
            }
            this.c |= 8;
        }
        if (ll7Var.v()) {
            jl7 jl7VarQ = ll7Var.q();
            if ((this.c & 16) != 16 || (jl7Var = (jl7) this.v) == jl7.a) {
                this.v = jl7VarQ;
            } else {
                hl7 hl7VarR4 = jl7.r(jl7Var);
                hl7VarR4.m(jl7VarQ);
                this.v = hl7VarR4.k();
            }
            this.c |= 16;
        }
        this.a = this.a.c(ll7Var.unknownFields);
    }

    public void o(wya wyaVar) {
        bza bzaVar;
        if (wyaVar == wya.a) {
            return;
        }
        if (wyaVar.z()) {
            uya uyaVarU = wyaVar.u();
            uyaVarU.getClass();
            this.c |= 1;
            this.d = uyaVarU;
        }
        if (!wyaVar.effectConstructorArgument_.isEmpty()) {
            if (((List) this.e).isEmpty()) {
                this.e = wyaVar.effectConstructorArgument_;
                this.c &= -3;
            } else {
                if ((this.c & 2) != 2) {
                    this.e = new ArrayList((List) this.e);
                    this.c |= 2;
                }
                ((List) this.e).addAll(wyaVar.effectConstructorArgument_);
            }
        }
        if (wyaVar.w()) {
            bza bzaVarR = wyaVar.r();
            if ((this.c & 4) != 4 || (bzaVar = (bza) this.f) == bza.a) {
                this.f = bzaVarR;
            } else {
                zya zyaVarK = zya.k();
                zyaVarK.l(bzaVar);
                zyaVarK.l(bzaVarR);
                this.f = zyaVarK.j();
            }
            this.c |= 4;
        }
        if (wyaVar.A()) {
            vya vyaVarV = wyaVar.v();
            vyaVarV.getClass();
            this.c |= 8;
            this.g = vyaVarV;
        }
        if (wyaVar.x()) {
            tya tyaVarS = wyaVar.s();
            tyaVarS.getClass();
            this.c |= 16;
            this.v = tyaVarS;
        }
        this.a = this.a.c(wyaVar.unknownFields);
    }
}
