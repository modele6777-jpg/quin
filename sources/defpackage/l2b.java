package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l2b {
    public static final a71 b = new a71(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = t72.H("*");
    public static final l2b d = new l2b(new hbc(3));
    public final hbc a;

    public l2b(hbc hbcVar) {
        this.a = hbcVar;
    }

    public static List b(String str) {
        List listD0 = v4e.d0(str, new char[]{'.'}, 6);
        return pa7.t(s72.F0(listD0), "") ? s72.s0(1, listD0) : listD0;
    }

    public final String a(String str) {
        String strQ;
        String strQ2;
        String strQ3;
        List listD0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        hbc hbcVar = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) hbcVar.a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) hbcVar.b).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        hbcVar.y0();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        hbcVar.e = e;
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (((a71) hbcVar.c) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(hbcVar.f);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) hbcVar.e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        a71[] a71VarArr = new a71[size3];
        for (int i = 0; i < size3; i++) {
            a71 a71Var = a71.c;
            a71VarArr[i] = m8c.u((String) listB.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strQ = null;
                break;
            }
            a71 a71Var2 = (a71) hbcVar.c;
            if (a71Var2 == null) {
                pa7.g0("bytes");
                throw null;
            }
            strQ = lmg.Q(a71Var2, a71VarArr, i2);
            if (strQ != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strQ2 = null;
            break;
        }
        a71[] a71VarArr2 = (a71[]) a71VarArr.clone();
        int length = a71VarArr2.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strQ2 = null;
                break;
            }
            a71VarArr2[i3] = b;
            a71 a71Var3 = (a71) hbcVar.c;
            if (a71Var3 == null) {
                pa7.g0("bytes");
                throw null;
            }
            strQ2 = lmg.Q(a71Var3, a71VarArr2, i3);
            if (strQ2 != null) {
                break;
            }
            i3++;
        }
        if (strQ2 == null) {
            strQ3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strQ3 = null;
                break;
            }
            a71 a71Var4 = (a71) hbcVar.d;
            if (a71Var4 == null) {
                pa7.g0("exceptionBytes");
                throw null;
            }
            strQ3 = lmg.Q(a71Var4, a71VarArr, i5);
            if (strQ3 != null) {
                break;
            }
            i5++;
        }
        if (strQ3 != null) {
            listD0 = v4e.d0("!".concat(strQ3), new char[]{'.'}, 6);
        } else if (strQ == null && strQ2 == null) {
            listD0 = c;
        } else {
            List listD1 = pu4.a;
            List listD2 = strQ != null ? v4e.d0(strQ, new char[]{'.'}, 6) : listD1;
            if (strQ2 != null) {
                listD1 = v4e.d0(strQ2, new char[]{'.'}, 6);
            }
            listD0 = listD2.size() > listD1.size() ? listD2 : listD1;
        }
        if (listB.size() == listD0.size() && ((String) listD0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listD0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listD0.size();
        } else {
            size = listB.size();
            size2 = listD0.size() + 1;
        }
        return fyc.v(fyc.q(new td0(1, b(str)), size - size2), ".");
    }
}
