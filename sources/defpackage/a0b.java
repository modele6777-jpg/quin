package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0b extends q56 {
    public static final a0b a;
    public static final gl7 b = new gl7(25);
    private List<kya> annotation_;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private boolean reified_;
    private final z61 unknownFields;
    private int upperBoundIdMemoizedSerializedSize;
    private List<Integer> upperBoundId_;
    private List<vza> upperBound_;
    private zza variance_;

    static {
        a0b a0bVar = new a0b();
        a = a0bVar;
        a0bVar.id_ = 0;
        a0bVar.name_ = 0;
        a0bVar.reified_ = false;
        a0bVar.variance_ = zza.INV;
        List list = Collections.EMPTY_LIST;
        a0bVar.upperBound_ = list;
        a0bVar.upperBoundId_ = list;
        a0bVar.annotation_ = list;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public a0b(g72 g72Var, o85 o85Var) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.id_ = 0;
        this.name_ = 0;
        this.reified_ = false;
        zza zzaVar = zza.INV;
        this.variance_ = zzaVar;
        List list = Collections.EMPTY_LIST;
        this.upperBound_ = list;
        this.upperBoundId_ = list;
        this.annotation_ = list;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = g72Var.n();
                        if (iN == 0) {
                            z = true;
                        } else if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.id_ = g72Var.k();
                        } else if (iN == 16) {
                            this.bitField0_ |= 2;
                            this.name_ = g72Var.k();
                        } else if (iN == 24) {
                            this.bitField0_ |= 4;
                            this.reified_ = g72Var.l() != 0;
                        } else if (iN == 32) {
                            int iK = g72Var.k();
                            zza zzaVar2 = iK != 0 ? iK != 1 ? iK != 2 ? null : zzaVar : zza.OUT : zza.IN;
                            if (zzaVar2 == null) {
                                p90VarK.q0(iN);
                                p90VarK.q0(iK);
                            } else {
                                this.bitField0_ |= 8;
                                this.variance_ = zzaVar2;
                            }
                        } else if (iN == 42) {
                            if ((i & 16) != 16) {
                                this.upperBound_ = new ArrayList();
                                i |= 16;
                            }
                            this.upperBound_.add((vza) g72Var.g(vza.b, o85Var));
                        } else if (iN == 48) {
                            if ((i & 32) != 32) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            this.upperBoundId_.add(Integer.valueOf(g72Var.k()));
                        } else if (iN == 50) {
                            int iE = g72Var.e(g72Var.k());
                            if ((i & 32) != 32 && g72Var.c() > 0) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            while (g72Var.c() > 0) {
                                this.upperBoundId_.add(Integer.valueOf(g72Var.k()));
                            }
                            g72Var.d(iE);
                        } else if (iN == 802) {
                            if ((i & 64) != 64) {
                                this.annotation_ = new ArrayList();
                                i |= 64;
                            }
                            this.annotation_.add((kya) g72Var.g(kya.b, o85Var));
                        } else if (!r(g72Var, p90VarK, o85Var, iN)) {
                            z = true;
                        }
                    } catch (ab7 e) {
                        e.b(this);
                        throw e;
                    }
                } catch (IOException e2) {
                    ab7 ab7Var = new ab7(e2.getMessage());
                    ab7Var.b(this);
                    throw ab7Var;
                }
            } catch (Throwable th) {
                if ((i & 16) == 16) {
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                }
                if ((i & 32) == 32) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                }
                if ((i & 64) == 64) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                try {
                    p90VarK.b0();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = x61Var.l();
                }
                q();
                throw th;
            }
        }
        if ((i & 16) == 16) {
            this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
        }
        if ((i & 32) == 32) {
            this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
        }
        if ((i & 64) == 64) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
        q();
    }

    public final List G() {
        return this.annotation_;
    }

    public final int H() {
        return this.id_;
    }

    public final int I() {
        return this.name_;
    }

    public final boolean J() {
        return this.reified_;
    }

    public final List K() {
        return this.upperBoundId_;
    }

    public final List L() {
        return this.upperBound_;
    }

    public final zza M() {
        return this.variance_;
    }

    public final boolean N() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean O() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean P() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean Q() {
        return (this.bitField0_ & 8) == 8;
    }

    @Override // defpackage.wt8
    public final ut8 a() {
        return a;
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
        if (!N()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (!O()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            if (!this.upperBound_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            if (!this.annotation_.get(i2).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (k()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        yza yzaVarL = yza.l();
        yzaVarL.m(this);
        return yzaVarL;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        fz3 fz3Var = new fz3(this);
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.id_);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.h0(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            boolean z = this.reified_;
            p90Var.s0(3, 0);
            p90Var.l0(z ? 1 : 0);
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.g0(4, this.variance_.a());
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            p90Var.j0(5, this.upperBound_.get(i));
        }
        if (this.upperBoundId_.size() > 0) {
            p90Var.q0(50);
            p90Var.q0(this.upperBoundIdMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
            p90Var.i0(this.upperBoundId_.get(i2).intValue());
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            p90Var.j0(100, this.annotation_.get(i3));
        }
        fz3Var.y(1000, p90Var);
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        List<Integer> list;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.id_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iO += p90.o(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iO += p90.u(3) + 1;
        }
        if ((this.bitField0_ & 8) == 8) {
            iO += p90.n(4, this.variance_.a());
        }
        for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
            iO += p90.q(5, this.upperBound_.get(i2));
        }
        int i3 = 0;
        int iP = 0;
        while (true) {
            int size = this.upperBoundId_.size();
            list = this.upperBoundId_;
            if (i3 >= size) {
                break;
            }
            iP += p90.p(list.get(i3).intValue());
            i3++;
        }
        int iQ = iO + iP;
        if (!list.isEmpty()) {
            iQ = iQ + 1 + p90.p(iP);
        }
        this.upperBoundIdMemoizedSerializedSize = iP;
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            iQ += p90.q(100, this.annotation_.get(i4));
        }
        int size2 = this.unknownFields.size() + l() + iQ;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return yza.l();
    }

    public a0b() {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public a0b(yza yzaVar) {
        super(yzaVar);
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = yzaVar.a;
    }
}
