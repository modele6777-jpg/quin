package defpackage;

import com.adjust.sdk.Constants;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class keg {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = v4e.Z(v4e.Y("okhttp3.", hm9.class.getName()), "Client");
    }

    public static final boolean a(ct6 ct6Var, ct6 ct6Var2) {
        ct6Var.getClass();
        return pa7.t(ct6Var.d, ct6Var2.d) && ct6Var.e == ct6Var2.e && pa7.t(ct6Var.a, ct6Var2.a);
    }

    public static final int b(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        if (j < 0) {
            ho7.j("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            qc0.o("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        qc0.o("timeout".concat(" too small"));
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!pa7.t(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(ryb rybVar) {
        String strC = rybVar.f.c("Content-Length");
        if (strC == null) {
            return -1L;
        }
        byte[] bArr = ieg.a;
        try {
            return Long.parseLong(strC);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(v41 v41Var, Charset charset) {
        v41Var.getClass();
        charset.getClass();
        int iL = v41Var.L(ieg.b);
        if (iL == -1) {
            return charset;
        }
        if (iL == 0) {
            return ox1.a;
        }
        if (iL == 1) {
            return ox1.b;
        }
        if (iL == 2) {
            Charset charset2 = ox1.a;
            Charset charset3 = ox1.e;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            ox1.e = charsetForName;
            return charsetForName;
        }
        if (iL == 3) {
            return ox1.c;
        }
        if (iL != 4) {
            throw new AssertionError();
        }
        Charset charset4 = ox1.a;
        Charset charset5 = ox1.f;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        ox1.f = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(mtd mtdVar, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = mtdVar.j().e() ? mtdVar.j().c() - jNanoTime : Long.MAX_VALUE;
        mtdVar.j().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            f41 f41Var = new f41();
            while (mtdVar.c0(f41Var, 8192L) != -1) {
                f41Var.b();
            }
            if (jC == Long.MAX_VALUE) {
                mtdVar.j().a();
                return true;
            }
            mtdVar.j().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                mtdVar.j().a();
                return false;
            }
            mtdVar.j().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                mtdVar.j().a();
            } else {
                mtdVar.j().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final si6 h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi6 oi6Var = (oi6) it.next();
            a71 a71Var = oi6Var.a;
            a71 a71Var2 = oi6Var.b;
            String strT = a71Var.t();
            String strT2 = a71Var2.t();
            arrayList.add(strT);
            arrayList.add(v4e.o0(strT2).toString());
        }
        return new si6((String[]) arrayList.toArray(new String[0]));
    }

    public static final String i(ct6 ct6Var, boolean z) {
        int i;
        ct6Var.getClass();
        int i2 = ct6Var.e;
        String strG = ct6Var.d;
        if (v4e.F(strG, ":", false)) {
            strG = ks0.g(']', "[", strG);
        }
        if (!z) {
            String str = ct6Var.a;
            str.getClass();
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals(Constants.SCHEME) ? 443 : -1;
            }
            if (i2 == i) {
                return strG;
            }
        }
        return strG + ':' + i2;
    }

    public static final List j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return pu4.a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return pu4.a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(qd0.R((Object[]) objArr.clone()));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
