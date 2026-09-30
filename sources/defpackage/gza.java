package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gza extends p56 {
    public final /* synthetic */ int d;
    public int e;
    public List f;
    public List g;
    public Object v;
    public u56 w;
    public u56 x;

    public /* synthetic */ gza(int i) {
        this.d = i;
    }

    public static gza m() {
        gza gzaVar = new gza(0);
        List list = Collections.EMPTY_LIST;
        gzaVar.f = list;
        gzaVar.g = list;
        gzaVar.v = list;
        gzaVar.w = b0b.a;
        gzaVar.x = i0b.a;
        return gzaVar;
    }

    public static gza n() {
        gza gzaVar = new gza(1);
        gzaVar.v = qza.a;
        gzaVar.w = oza.a;
        gzaVar.x = hza.a;
        List list = Collections.EMPTY_LIST;
        gzaVar.f = list;
        gzaVar.g = list;
        return gzaVar;
    }

    public final Object clone() {
        switch (this.d) {
            case 0:
                gza gzaVarM = m();
                gzaVarM.o(k());
                return gzaVarM;
            default:
                gza gzaVarN = n();
                gzaVarN.p(l());
                return gzaVarN;
        }
    }

    @Override // defpackage.l56
    public final ut8 f() {
        switch (this.d) {
            case 0:
                hza hzaVarK = k();
                if (hzaVarK.b()) {
                    return hzaVarK;
                }
                throw new qef();
            default:
                iza izaVarL = l();
                if (izaVarL.b()) {
                    return izaVarL;
                }
                throw new qef();
        }
    }

    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        iza izaVar = null;
        hza hzaVar = null;
        try {
            try {
                switch (this.d) {
                    case 0:
                        try {
                            hza.b.getClass();
                            o(new hza(g72Var, o85Var));
                            return this;
                        } catch (ab7 e) {
                            hza hzaVar2 = (hza) e.a();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                hzaVar = hzaVar2;
                                if (hzaVar != null) {
                                    o(hzaVar);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            iza.b.getClass();
                            p(new iza(g72Var, o85Var));
                            return this;
                        } catch (ab7 e2) {
                            iza izaVar2 = (iza) e2.a();
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                izaVar = izaVar2;
                                if (izaVar != null) {
                                    p(izaVar);
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
        switch (this.d) {
            case 0:
                o((hza) u56Var);
                break;
            default:
                p((iza) u56Var);
                break;
        }
        return this;
    }

    public hza k() {
        hza hzaVar = new hza(this);
        int i = this.e;
        if ((i & 1) == 1) {
            this.f = Collections.unmodifiableList(this.f);
            this.e &= -2;
        }
        hzaVar.function_ = this.f;
        if ((this.e & 2) == 2) {
            this.g = Collections.unmodifiableList(this.g);
            this.e &= -3;
        }
        hzaVar.property_ = this.g;
        if ((this.e & 4) == 4) {
            this.v = Collections.unmodifiableList((List) this.v);
            this.e &= -5;
        }
        hzaVar.typeAlias_ = (List) this.v;
        int i2 = (i & 8) != 8 ? 0 : 1;
        hzaVar.typeTable_ = (b0b) this.w;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        hzaVar.versionRequirementTable_ = (i0b) this.x;
        hzaVar.bitField0_ = i2;
        return hzaVar;
    }

    public iza l() {
        iza izaVar = new iza(this);
        int i = this.e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        izaVar.strings_ = (qza) this.v;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        izaVar.qualifiedNames_ = (oza) this.w;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        izaVar.package_ = (hza) this.x;
        if ((this.e & 8) == 8) {
            this.f = Collections.unmodifiableList(this.f);
            this.e &= -9;
        }
        izaVar.class__ = this.f;
        if ((this.e & 16) == 16) {
            this.g = Collections.unmodifiableList(this.g);
            this.e &= -17;
        }
        izaVar.fileAnnotation_ = this.g;
        izaVar.bitField0_ = i2;
        return izaVar;
    }

    public void o(hza hzaVar) {
        i0b i0bVar;
        b0b b0bVar;
        if (hzaVar == hza.a) {
            return;
        }
        if (!hzaVar.function_.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = hzaVar.function_;
                this.e &= -2;
            } else {
                if ((this.e & 1) != 1) {
                    this.f = new ArrayList(this.f);
                    this.e |= 1;
                }
                this.f.addAll(hzaVar.function_);
            }
        }
        if (!hzaVar.property_.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = hzaVar.property_;
                this.e &= -3;
            } else {
                if ((this.e & 2) != 2) {
                    this.g = new ArrayList(this.g);
                    this.e |= 2;
                }
                this.g.addAll(hzaVar.property_);
            }
        }
        if (!hzaVar.typeAlias_.isEmpty()) {
            if (((List) this.v).isEmpty()) {
                this.v = hzaVar.typeAlias_;
                this.e &= -5;
            } else {
                if ((this.e & 4) != 4) {
                    this.v = new ArrayList((List) this.v);
                    this.e |= 4;
                }
                ((List) this.v).addAll(hzaVar.typeAlias_);
            }
        }
        if (hzaVar.J()) {
            b0b b0bVarH = hzaVar.H();
            if ((this.e & 8) != 8 || (b0bVar = (b0b) this.w) == b0b.a) {
                this.w = b0bVarH;
            } else {
                jya jyaVarR = b0b.r(b0bVar);
                jyaVarR.m(b0bVarH);
                this.w = jyaVarR.k();
            }
            this.e |= 8;
        }
        if (hzaVar.K()) {
            i0b i0bVarI = hzaVar.I();
            if ((this.e & 16) != 16 || (i0bVar = (i0b) this.x) == i0b.a) {
                this.x = i0bVarI;
            } else {
                rya ryaVar = new rya(2);
                ryaVar.d = Collections.EMPTY_LIST;
                ryaVar.q(i0bVar);
                ryaVar.q(i0bVarI);
                this.x = ryaVar.m();
            }
            this.e |= 16;
        }
        j(hzaVar);
        this.a = this.a.c(hzaVar.unknownFields);
    }

    public void p(iza izaVar) {
        hza hzaVar;
        oza ozaVar;
        qza qzaVar;
        if (izaVar == iza.a) {
            return;
        }
        if (izaVar.J()) {
            qza qzaVarG = izaVar.G();
            if ((this.e & 1) != 1 || (qzaVar = (qza) this.v) == qza.a) {
                this.v = qzaVarG;
            } else {
                rya ryaVar = new rya(3);
                ryaVar.d = t18.b;
                ryaVar.p(qzaVar);
                ryaVar.p(qzaVarG);
                this.v = ryaVar.l();
            }
            this.e |= 1;
        }
        if (izaVar.I()) {
            oza ozaVarF = izaVar.F();
            if ((this.e & 2) != 2 || (ozaVar = (oza) this.w) == oza.a) {
                this.w = ozaVarF;
            } else {
                rya ryaVar2 = new rya(1);
                ryaVar2.d = Collections.EMPTY_LIST;
                ryaVar2.o(ozaVar);
                ryaVar2.o(ozaVarF);
                this.w = ryaVar2.k();
            }
            this.e |= 2;
        }
        if (izaVar.H()) {
            hza hzaVarE = izaVar.E();
            if ((this.e & 4) != 4 || (hzaVar = (hza) this.x) == hza.a) {
                this.x = hzaVarE;
            } else {
                gza gzaVarM = m();
                gzaVarM.o(hzaVar);
                gzaVarM.o(hzaVarE);
                this.x = gzaVarM.k();
            }
            this.e |= 4;
        }
        if (!izaVar.class__.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = izaVar.class__;
                this.e &= -9;
            } else {
                if ((this.e & 8) != 8) {
                    this.f = new ArrayList(this.f);
                    this.e |= 8;
                }
                this.f.addAll(izaVar.class__);
            }
        }
        if (!izaVar.fileAnnotation_.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = izaVar.fileAnnotation_;
                this.e &= -17;
            } else {
                if ((this.e & 16) != 16) {
                    this.g = new ArrayList(this.g);
                    this.e |= 16;
                }
                this.g.addAll(izaVar.fileAnnotation_);
            }
        }
        j(izaVar);
        this.a = this.a.c(izaVar.unknownFields);
    }
}
