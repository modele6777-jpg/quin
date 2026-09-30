package defpackage;

import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pl7 extends u56 implements wt8 {
    public static final pl7 a;
    public static final gl7 b = new gl7(4);
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ol7 operation_;
    private int predefinedIndex_;
    private int range_;
    private int replaceCharMemoizedSerializedSize;
    private List<Integer> replaceChar_;
    private Object string_;
    private int substringIndexMemoizedSerializedSize;
    private List<Integer> substringIndex_;
    private final z61 unknownFields;

    static {
        pl7 pl7Var = new pl7();
        a = pl7Var;
        pl7Var.range_ = 1;
        pl7Var.predefinedIndex_ = 0;
        pl7Var.string_ = "";
        pl7Var.operation_ = ol7.NONE;
        List<Integer> list = Collections.EMPTY_LIST;
        pl7Var.substringIndex_ = list;
        pl7Var.replaceChar_ = list;
    }

    public pl7(g72 g72Var) {
        this.substringIndexMemoizedSerializedSize = -1;
        this.replaceCharMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.range_ = 1;
        boolean z = false;
        this.predefinedIndex_ = 0;
        this.string_ = "";
        ol7 ol7Var = ol7.NONE;
        this.operation_ = ol7Var;
        List<Integer> list = Collections.EMPTY_LIST;
        this.substringIndex_ = list;
        this.replaceChar_ = list;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.range_ = g72Var.k();
                        } else if (iN == 16) {
                            this.bitField0_ |= 2;
                            this.predefinedIndex_ = g72Var.k();
                        } else if (iN == 24) {
                            int iK = g72Var.k();
                            ol7 ol7Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : ol7.DESC_TO_CLASS_ID : ol7.INTERNAL_TO_CLASS_ID : ol7Var;
                            if (ol7Var2 == null) {
                                p90VarK.q0(iN);
                                p90VarK.q0(iK);
                            } else {
                                this.bitField0_ |= 8;
                                this.operation_ = ol7Var2;
                            }
                        } else if (iN == 32) {
                            if ((i & 16) != 16) {
                                this.substringIndex_ = new ArrayList();
                                i |= 16;
                            }
                            this.substringIndex_.add(Integer.valueOf(g72Var.k()));
                        } else if (iN == 34) {
                            int iE = g72Var.e(g72Var.k());
                            if ((i & 16) != 16 && g72Var.c() > 0) {
                                this.substringIndex_ = new ArrayList();
                                i |= 16;
                            }
                            while (g72Var.c() > 0) {
                                this.substringIndex_.add(Integer.valueOf(g72Var.k()));
                            }
                            g72Var.d(iE);
                        } else if (iN == 40) {
                            if ((i & 32) != 32) {
                                this.replaceChar_ = new ArrayList();
                                i |= 32;
                            }
                            this.replaceChar_.add(Integer.valueOf(g72Var.k()));
                        } else if (iN == 42) {
                            int iE2 = g72Var.e(g72Var.k());
                            if ((i & 32) != 32 && g72Var.c() > 0) {
                                this.replaceChar_ = new ArrayList();
                                i |= 32;
                            }
                            while (g72Var.c() > 0) {
                                this.replaceChar_.add(Integer.valueOf(g72Var.k()));
                            }
                            g72Var.d(iE2);
                        } else if (iN == 50) {
                            m98 m98VarF = g72Var.f();
                            this.bitField0_ |= 4;
                            this.string_ = m98VarF;
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
                if ((i & 16) == 16) {
                    this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                }
                if ((i & 32) == 32) {
                    this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
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
        if ((i & 16) == 16) {
            this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
        }
        if ((i & 32) == 32) {
            this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
    }

    public final String A() {
        Object obj = this.string_;
        if (obj instanceof String) {
            return (String) obj;
        }
        z61 z61Var = (z61) obj;
        String strQ = z61Var.q();
        if (z61Var.i()) {
            this.string_ = strQ;
        }
        return strQ;
    }

    public final int B() {
        return this.substringIndex_.size();
    }

    public final List C() {
        return this.substringIndex_;
    }

    public final boolean D() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean E() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean F() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean G() {
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        nl7 nl7VarK = nl7.k();
        nl7VarK.l(this);
        return nl7VarK;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        z61 m98Var;
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.range_);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.h0(2, this.predefinedIndex_);
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.g0(3, this.operation_.a());
        }
        if (this.substringIndex_.size() > 0) {
            p90Var.q0(34);
            p90Var.q0(this.substringIndexMemoizedSerializedSize);
        }
        for (int i = 0; i < this.substringIndex_.size(); i++) {
            p90Var.i0(this.substringIndex_.get(i).intValue());
        }
        if (this.replaceChar_.size() > 0) {
            p90Var.q0(42);
            p90Var.q0(this.replaceCharMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
            p90Var.i0(this.replaceChar_.get(i2).intValue());
        }
        if ((this.bitField0_ & 4) == 4) {
            Object obj = this.string_;
            if (obj instanceof String) {
                try {
                    m98Var = new m98(((String) obj).getBytes(Constants.ENCODING));
                    this.string_ = m98Var;
                } catch (UnsupportedEncodingException e) {
                    cva.q("UTF-8 not supported?", e);
                    return;
                }
            } else {
                m98Var = (z61) obj;
            }
            p90Var.s0(6, 2);
            p90Var.q0(m98Var.size());
            p90Var.m0(m98Var);
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        List<Integer> list;
        List<Integer> list2;
        z61 m98Var;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.range_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iO += p90.o(2, this.predefinedIndex_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iO += p90.n(3, this.operation_.a());
        }
        int i2 = 0;
        int iP = 0;
        while (true) {
            int size = this.substringIndex_.size();
            list = this.substringIndex_;
            if (i2 >= size) {
                break;
            }
            iP += p90.p(list.get(i2).intValue());
            i2++;
        }
        int iP2 = iO + iP;
        if (!list.isEmpty()) {
            iP2 = iP2 + 1 + p90.p(iP);
        }
        this.substringIndexMemoizedSerializedSize = iP;
        int i3 = 0;
        int iP3 = 0;
        while (true) {
            int size2 = this.replaceChar_.size();
            list2 = this.replaceChar_;
            if (i3 >= size2) {
                break;
            }
            iP3 += p90.p(list2.get(i3).intValue());
            i3++;
        }
        int size3 = iP2 + iP3;
        if (!list2.isEmpty()) {
            size3 = size3 + 1 + p90.p(iP3);
        }
        this.replaceCharMemoizedSerializedSize = iP3;
        if ((this.bitField0_ & 4) == 4) {
            Object obj = this.string_;
            if (obj instanceof String) {
                try {
                    m98Var = new m98(((String) obj).getBytes(Constants.ENCODING));
                    this.string_ = m98Var;
                } catch (UnsupportedEncodingException e) {
                    cva.q("UTF-8 not supported?", e);
                    return 0;
                }
            } else {
                m98Var = (z61) obj;
            }
            size3 += m98Var.size() + p90.s(m98Var.size()) + p90.u(6);
        }
        int size4 = this.unknownFields.size() + size3;
        this.memoizedSerializedSize = size4;
        return size4;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return nl7.k();
    }

    public final ol7 u() {
        return this.operation_;
    }

    public final int v() {
        return this.predefinedIndex_;
    }

    public final int w() {
        return this.range_;
    }

    public final int x() {
        return this.replaceChar_.size();
    }

    public final List z() {
        return this.replaceChar_;
    }

    public pl7() {
        this.substringIndexMemoizedSerializedSize = -1;
        this.replaceCharMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public pl7(nl7 nl7Var) {
        this.substringIndexMemoizedSerializedSize = -1;
        this.replaceCharMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = nl7Var.a;
    }
}
