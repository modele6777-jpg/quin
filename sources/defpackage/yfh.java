package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yfh implements xfh, mgh {
    public static final String i = new String();
    public final Level a;
    public final long b;
    public cgh c;
    public jgh d;
    public rgh e;
    public gkg f;
    public Object[] g;
    public final /* synthetic */ kb6 h;

    public yfh(kb6 kb6Var, Level level) {
        this.h = kb6Var;
        dkg.a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        drb.n(level, "level");
        this.a = level;
        this.b = nanos;
    }

    @Override // defpackage.mgh
    public final mgh a() {
        igh ighVar = new igh();
        ighVar.b = 0;
        if (this.d == null) {
            this.d = ighVar;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [rgh] */
    /* JADX WARN: Type inference failed for: r10v22, types: [sgh] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r18v0, types: [yfh] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [rgh] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [rgh] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // defpackage.mgh
    public final void b(String str, Object[] objArr) {
        boolean z;
        cgh cghVar;
        StackTraceElement[] stackTraceElementArr;
        int iT;
        int i2;
        ufh ufhVar;
        ?? pghVar;
        ?? r10;
        ogh oghVar;
        int i3;
        kgh tghVar = this.d;
        hgh hghVar = jgh.a;
        if (tghVar == null) {
            ((ikg) dkg.a).getClass();
            ikg.b.getClass();
            this.d = hghVar;
            tghVar = hghVar;
        }
        if (tghVar != hghVar) {
            cgh cghVar2 = this.c;
            if (cghVar2 != null && (i3 = cghVar2.b) > 0) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bgh.f.equals(cghVar2.o(i4))) {
                        tghVar = new tgh(tghVar, cghVar2.q(i4));
                    }
                }
            }
        } else {
            tghVar = null;
        }
        mxb mxbVarD = d();
        int iM = mxbVarD.m();
        for (int i5 = 0; i5 < iM; i5++) {
            if (mxbVarD.o(i5).a == "eye3tag") {
                if (mxbVarD.r(bgh.a) != null) {
                    break;
                }
                ngh nghVar = bgh.i;
                if (mxbVarD.r(nghVar) != null) {
                    break;
                }
                e(nghVar, ugh.SMALL);
                break;
            }
        }
        cgh cghVar3 = this.c;
        int i6 = -1;
        ogh oghVar2 = rgh.a;
        if (cghVar3 != null) {
            if (tghVar != null) {
                int i7 = wfh.d;
                if (cghVar3.r(bgh.d) != null) {
                    r3.f();
                    return;
                }
                cgh cghVar4 = this.c;
                tfh tfhVar = ufh.d;
                Integer num = (Integer) cghVar4.r(bgh.b);
                if (num == null) {
                    pghVar = 0;
                } else {
                    ufhVar = (ufh) ufh.d.w0(tghVar, cghVar4);
                    if (ufhVar.c.incrementAndGet() < num.intValue()) {
                        pghVar = ufhVar;
                        pghVar = oghVar2;
                    }
                }
                pghVar = ufhVar;
                cgh cghVar5 = this.c;
                tfh tfhVar2 = sgh.d;
                Integer num2 = (Integer) cghVar5.r(bgh.c);
                if (num2 == null || num2.intValue() <= 0) {
                    r10 = 0;
                } else {
                    r10 = (sgh) sgh.d.w0(tghVar, cghVar5);
                    int iNextInt = ((Random) sgh.e.get()).nextInt(num2.intValue());
                    AtomicInteger atomicInteger = r10.c;
                    if ((iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r10 = oghVar2;
                    }
                }
                if (pghVar == 0) {
                    pghVar = r10;
                } else if (r10 != 0 && pghVar != oghVar2 && r10 != (oghVar = rgh.b)) {
                    if (r10 == oghVar2 || pghVar == oghVar) {
                        pghVar = r10;
                    } else {
                        pghVar = new pgh(pghVar, r10);
                    }
                }
                this.e = pghVar;
                z = pghVar != oghVar2;
            }
            cgh cghVar6 = this.c;
            ngh nghVar2 = bgh.i;
            ugh ughVar = (ugh) cghVar6.r(nghVar2);
            if (ughVar != null) {
                cgh cghVar7 = this.c;
                if (cghVar7 != null && (iT = cghVar7.t(nghVar2)) >= 0) {
                    int i8 = iT + iT;
                    int i9 = i8 + 2;
                    while (true) {
                        i2 = cghVar7.b;
                        if (i9 >= i2 + i2) {
                            break;
                        }
                        Object obj = cghVar7.a[i9];
                        if (!obj.equals(nghVar2)) {
                            Object[] objArr2 = cghVar7.a;
                            objArr2[i8] = obj;
                            objArr2[i8 + 1] = objArr2[i9 + 1];
                            i8 += 2;
                        }
                        i9 += 2;
                    }
                    cghVar7.b = i2 - ((i9 - i8) >> 1);
                    while (i8 < i9) {
                        cghVar7.a[i8] = null;
                        i8++;
                    }
                }
                mxb mxbVarD2 = d();
                ngh nghVar3 = bgh.a;
                Throwable th = (Throwable) mxbVarD2.r(nghVar3);
                int iA = ughVar.a();
                String[] strArr = glg.a;
                if (iA <= 0 && iA != -1) {
                    qc0.j("invalid maximum depth: 0");
                    return;
                }
                glg.b.getClass();
                if (!(iA == -1 || iA > 0)) {
                    qc0.j("maxDepth must be > 0 or -1");
                    return;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = yfh.class.getName();
                int i10 = 3;
                boolean z2 = false;
                while (true) {
                    if (i10 >= stackTrace.length) {
                        i10 = -1;
                        break;
                    }
                    if (!stackTrace[i10].getClassName().equals(name)) {
                        if (z2) {
                            break;
                        }
                    } else {
                        z2 = true;
                    }
                    i10++;
                }
                if (i10 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i10;
                    if (iA <= 0 || iA >= length) {
                        iA = length;
                    }
                    stackTraceElementArr = new StackTraceElement[iA];
                    System.arraycopy(stackTrace, i10, stackTraceElementArr, 0, iA);
                }
                lgh lghVar = new lgh(ughVar.toString(), th);
                lghVar.setStackTrace(stackTraceElementArr);
                e(nghVar3, lghVar);
            }
        }
        rgh rghVar = this.e;
        if (rghVar != null) {
            qgh qghVar = (qgh) qgh.c.w0(tghVar, this.c);
            AtomicInteger atomicInteger2 = qghVar.b;
            AtomicBoolean atomicBoolean = qghVar.a;
            int iIncrementAndGet = atomicInteger2.incrementAndGet();
            if (rghVar != oghVar2 && atomicBoolean.compareAndSet(false, true)) {
                try {
                    rghVar.a();
                    atomicBoolean.set(false);
                    atomicInteger2.addAndGet(-iIncrementAndGet);
                    i6 = (-1) + iIncrementAndGet;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    throw th2;
                }
            }
            if (z && i6 > 0 && (cghVar = this.c) != null) {
                cghVar.s(bgh.e, Integer.valueOf(i6));
            }
            z &= i6 >= 0;
        }
        if (z) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.g = objArrCopyOf;
            for (Object obj2 : objArrCopyOf) {
            }
            if (str != i) {
                dlg dlgVar = dlg.b;
                this.f = new gkg(str);
            }
            ((ikg) dkg.a).getClass();
            ykg ykgVarB = nkg.b.b();
            if (!ykgVarB.a.isEmpty()) {
                mxb mxbVarD3 = d();
                agh aghVar = bgh.h;
                ykg ykgVar = (ykg) mxbVarD3.r(aghVar);
                if (ykgVar != null) {
                    wkg wkgVar = ykgVar.a;
                    if (!wkgVar.isEmpty()) {
                        wkg wkgVar2 = ykgVarB.a;
                        if (!wkgVar2.isEmpty()) {
                            ykgVar = new ykg(new wkg(wkgVar2, wkgVar));
                        }
                        ykgVarB = ykgVar;
                    }
                }
                e(aghVar, ykgVarB);
            }
            m4 m4Var = (m4) this.h.b;
            try {
                hlg hlgVar = (hlg) hlg.b.get();
                int i11 = hlgVar.a + 1;
                hlgVar.a = i11;
                if (i11 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i11 <= 100) {
                        m4Var.y0(this);
                    } else {
                        kb6.v("unbounded recursion in log statement", this);
                    }
                    hlgVar.close();
                } catch (Throwable th3) {
                    try {
                        hlgVar.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (RuntimeException e) {
                try {
                    m4Var.z0(e, this);
                } catch (RuntimeException e2) {
                    String name2 = e2.getClass().getName();
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(name2.length() + 2 + String.valueOf(message).length());
                    sb.append(name2);
                    sb.append(": ");
                    sb.append(message);
                    kb6.v(sb.toString(), this);
                    try {
                        e2.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    @Override // defpackage.mgh
    public final mgh c(Throwable th) {
        ngh nghVar = bgh.a;
        drb.n(nghVar, "metadata key");
        if (th != null) {
            e(nghVar, th);
        }
        return this;
    }

    public final mxb d() {
        cgh cghVar = this.c;
        return cghVar != null ? cghVar : chh.a;
    }

    public final void e(ngh nghVar, Object obj) {
        cgh cghVar = this.c;
        if (cghVar == null) {
            cghVar = new cgh();
            cghVar.a = new Object[8];
            cghVar.b = 0;
            this.c = cghVar;
        }
        cghVar.s(nghVar, obj);
    }
}
