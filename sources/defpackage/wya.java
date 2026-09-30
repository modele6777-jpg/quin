package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wya extends u56 implements wt8 {
    public static final wya a;
    public static final gl7 b = new gl7(12);
    private int bitField0_;
    private bza conclusionOfConditionalEffect_;
    private tya conditionKind_;
    private List<bza> effectConstructorArgument_;
    private uya effectType_;
    private vya kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final z61 unknownFields;

    static {
        wya wyaVar = new wya();
        a = wyaVar;
        wyaVar.effectType_ = uya.RETURNS_CONSTANT;
        wyaVar.effectConstructorArgument_ = Collections.EMPTY_LIST;
        wyaVar.conclusionOfConditionalEffect_ = bza.a;
        wyaVar.kind_ = vya.AT_MOST_ONCE;
        wyaVar.conditionKind_ = tya.CONCLUSION_CONDITION;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public wya(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        uya uyaVar = uya.RETURNS_CONSTANT;
        this.effectType_ = uyaVar;
        this.effectConstructorArgument_ = Collections.EMPTY_LIST;
        this.conclusionOfConditionalEffect_ = bza.a;
        vya vyaVar = vya.AT_MOST_ONCE;
        this.kind_ = vyaVar;
        tya tyaVar = tya.CONCLUSION_CONDITION;
        this.conditionKind_ = tyaVar;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        tya tyaVar2 = null;
                        uya uyaVar2 = null;
                        zya zyaVarK = null;
                        vya vyaVar2 = null;
                        if (iN == 8) {
                            int iK = g72Var.k();
                            if (iK == 0) {
                                uyaVar2 = uyaVar;
                            } else if (iK == 1) {
                                uyaVar2 = uya.CALLS;
                            } else if (iK == 2) {
                                uyaVar2 = uya.RETURNS_NOT_NULL;
                            } else if (iK == 3) {
                                uyaVar2 = uya.RETURNS_RESULT_OF;
                            }
                            if (uyaVar2 == null) {
                                p90VarK.q0(iN);
                                p90VarK.q0(iK);
                            } else {
                                this.bitField0_ |= 1;
                                this.effectType_ = uyaVar2;
                            }
                        } else if (iN == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.effectConstructorArgument_ = new ArrayList();
                                c = 2;
                            }
                            this.effectConstructorArgument_.add((bza) g72Var.g(bza.b, o85Var));
                        } else if (iN == 26) {
                            if ((this.bitField0_ & 2) == 2) {
                                bza bzaVar = this.conclusionOfConditionalEffect_;
                                bzaVar.getClass();
                                zyaVarK = zya.k();
                                zyaVarK.l(bzaVar);
                            }
                            bza bzaVar2 = (bza) g72Var.g(bza.b, o85Var);
                            this.conclusionOfConditionalEffect_ = bzaVar2;
                            if (zyaVarK != null) {
                                zyaVarK.l(bzaVar2);
                                this.conclusionOfConditionalEffect_ = zyaVarK.j();
                            }
                            this.bitField0_ |= 2;
                        } else if (iN == 32) {
                            int iK2 = g72Var.k();
                            if (iK2 == 0) {
                                vyaVar2 = vyaVar;
                            } else if (iK2 == 1) {
                                vyaVar2 = vya.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                vyaVar2 = vya.AT_LEAST_ONCE;
                            }
                            if (vyaVar2 == null) {
                                p90VarK.q0(iN);
                                p90VarK.q0(iK2);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = vyaVar2;
                            }
                        } else if (iN == 40) {
                            int iK3 = g72Var.k();
                            if (iK3 == 0) {
                                tyaVar2 = tyaVar;
                            } else if (iK3 == 1) {
                                tyaVar2 = tya.RETURNS_CONDITION;
                            } else if (iK3 == 2) {
                                tyaVar2 = tya.HOLDSIN_CONDITION;
                            }
                            if (tyaVar2 == null) {
                                p90VarK.q0(iN);
                                p90VarK.q0(iK3);
                            } else {
                                this.bitField0_ |= 8;
                                this.conditionKind_ = tyaVar2;
                            }
                        } else if (!g72Var.q(iN, p90VarK)) {
                        }
                    }
                    z = true;
                } catch (ab7 e) {
                    e.b(this);
                    throw e;
                } catch (IOException e2) {
                    ab7 ab7Var = new ab7(e2.getMessage());
                    ab7Var.b(this);
                    throw ab7Var;
                }
            } catch (Throwable th) {
                if (((c == true ? 1 : 0) & 2) == 2) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                }
                try {
                    p90VarK.b0();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = x61Var.l();
                }
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
    }

    public final boolean A() {
        return (this.bitField0_ & 4) == 4;
    }

    @Override // defpackage.wt8
    public final boolean b() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            if (!this.effectConstructorArgument_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (!w() || this.conclusionOfConditionalEffect_.b()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        kl7 kl7VarM = kl7.m();
        kl7VarM.o(this);
        return kl7VarM;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.g0(1, this.effectType_.a());
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            p90Var.j0(2, this.effectConstructorArgument_.get(i));
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.j0(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.g0(4, this.kind_.a());
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.g0(5, this.conditionKind_.a());
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iN = (this.bitField0_ & 1) == 1 ? p90.n(1, this.effectType_.a()) : 0;
        for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
            iN += p90.q(2, this.effectConstructorArgument_.get(i2));
        }
        if ((this.bitField0_ & 2) == 2) {
            iN += p90.q(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iN += p90.n(4, this.kind_.a());
        }
        if ((this.bitField0_ & 8) == 8) {
            iN += p90.n(5, this.conditionKind_.a());
        }
        int size = this.unknownFields.size() + iN;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return kl7.m();
    }

    public final bza r() {
        return this.conclusionOfConditionalEffect_;
    }

    public final tya s() {
        return this.conditionKind_;
    }

    public final List t() {
        return this.effectConstructorArgument_;
    }

    public final uya u() {
        return this.effectType_;
    }

    public final vya v() {
        return this.kind_;
    }

    public final boolean w() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean x() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean z() {
        return (this.bitField0_ & 1) == 1;
    }

    public wya() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public wya(kl7 kl7Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = kl7Var.a;
    }
}
