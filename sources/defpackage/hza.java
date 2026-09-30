package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hza extends q56 {
    public static final hza a;
    public static final gl7 b = new gl7(16);
    private int bitField0_;
    private List<dza> function_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<kza> property_;
    private List<xza> typeAlias_;
    private b0b typeTable_;
    private final z61 unknownFields;
    private i0b versionRequirementTable_;

    static {
        hza hzaVar = new hza();
        a = hzaVar;
        List list = Collections.EMPTY_LIST;
        hzaVar.function_ = list;
        hzaVar.property_ = list;
        hzaVar.typeAlias_ = list;
        hzaVar.typeTable_ = b0b.a;
        hzaVar.versionRequirementTable_ = i0b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public hza(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        List list = Collections.EMPTY_LIST;
        this.function_ = list;
        this.property_ = list;
        this.typeAlias_ = list;
        this.typeTable_ = b0b.a;
        this.versionRequirementTable_ = i0b.a;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = 2;
            if (z) {
                break;
            }
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i3 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i3 != 1) {
                                this.function_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.function_.add((dza) g72Var.g(dza.b, o85Var));
                        } else if (iN == 34) {
                            int i4 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i4 != 2) {
                                this.property_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.property_.add((kza) g72Var.g(kza.b, o85Var));
                        } else if (iN != 42) {
                            rya ryaVar = null;
                            jya jyaVarR = null;
                            if (iN == 242) {
                                if ((this.bitField0_ & 1) == 1) {
                                    b0b b0bVar = this.typeTable_;
                                    b0bVar.getClass();
                                    jyaVarR = b0b.r(b0bVar);
                                }
                                b0b b0bVar2 = (b0b) g72Var.g(b0b.b, o85Var);
                                this.typeTable_ = b0bVar2;
                                if (jyaVarR != null) {
                                    jyaVarR.m(b0bVar2);
                                    this.typeTable_ = jyaVarR.k();
                                }
                                this.bitField0_ |= 1;
                            } else if (iN == 258) {
                                if ((this.bitField0_ & 2) == 2) {
                                    i0b i0bVar = this.versionRequirementTable_;
                                    i0bVar.getClass();
                                    ryaVar = new rya(i2);
                                    ryaVar.d = Collections.EMPTY_LIST;
                                    ryaVar.q(i0bVar);
                                }
                                i0b i0bVar2 = (i0b) g72Var.g(i0b.b, o85Var);
                                this.versionRequirementTable_ = i0bVar2;
                                if (ryaVar != null) {
                                    ryaVar.q(i0bVar2);
                                    this.versionRequirementTable_ = ryaVar.m();
                                }
                                this.bitField0_ |= 2;
                            } else if (!r(g72Var, p90VarK, o85Var, iN)) {
                            }
                        } else {
                            int i5 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i5 != 4) {
                                this.typeAlias_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.typeAlias_.add((xza) g72Var.g(xza.b, o85Var));
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
                if (((i == true ? 1 : 0) & 1) == 1) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                }
                if (((i == true ? 1 : 0) & 2) == 2) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                }
                if (((i == true ? 1 : 0) & 4) == 4) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
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
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.function_ = Collections.unmodifiableList(this.function_);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.property_ = Collections.unmodifiableList(this.property_);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
        q();
    }

    public final List E() {
        return this.function_;
    }

    public final List F() {
        return this.property_;
    }

    public final List G() {
        return this.typeAlias_;
    }

    public final b0b H() {
        return this.typeTable_;
    }

    public final i0b I() {
        return this.versionRequirementTable_;
    }

    public final boolean J() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean K() {
        return (this.bitField0_ & 2) == 2;
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
        for (int i = 0; i < this.function_.size(); i++) {
            if (!this.function_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            if (!this.property_.get(i2).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            if (!this.typeAlias_.get(i3).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (J() && !this.typeTable_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
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
        gza gzaVarM = gza.m();
        gzaVarM.o(this);
        return gzaVarM;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        fz3 fz3Var = new fz3(this);
        for (int i = 0; i < this.function_.size(); i++) {
            p90Var.j0(3, this.function_.get(i));
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            p90Var.j0(4, this.property_.get(i2));
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            p90Var.j0(5, this.typeAlias_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            p90Var.j0(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.j0(32, this.versionRequirementTable_);
        }
        fz3Var.y(200, p90Var);
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iQ = 0;
        for (int i2 = 0; i2 < this.function_.size(); i2++) {
            iQ += p90.q(3, this.function_.get(i2));
        }
        for (int i3 = 0; i3 < this.property_.size(); i3++) {
            iQ += p90.q(4, this.property_.get(i3));
        }
        for (int i4 = 0; i4 < this.typeAlias_.size(); i4++) {
            iQ += p90.q(5, this.typeAlias_.get(i4));
        }
        if ((this.bitField0_ & 1) == 1) {
            iQ += p90.q(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            iQ += p90.q(32, this.versionRequirementTable_);
        }
        int size = this.unknownFields.size() + l() + iQ;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return gza.m();
    }

    public hza() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public hza(gza gzaVar) {
        super(gzaVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = gzaVar.a;
    }
}
