package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gxe {
    public final ThreadLocal a = new ThreadLocal();

    public void a(String str, Object... objArr) {
        h(3, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void b(Throwable th, String str, Object... objArr) {
        h(3, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void c(String str, Object... objArr) {
        h(6, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void d(Throwable th, String str, Object... objArr) {
        h(6, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void e(String str, Object... objArr) {
        h(4, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void f(Throwable th, String str, Object... objArr) {
        h(4, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public abstract void g(int i, String str, String str2, Throwable th);

    public final void h(int i, Throwable th, String str, Object... objArr) {
        ThreadLocal threadLocal = this.a;
        String str2 = (String) threadLocal.get();
        if (str2 != null) {
            threadLocal.remove();
        }
        if (str != null && str.length() != 0) {
            if (objArr.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) str);
                sb.append('\n');
                StringWriter stringWriter = new StringWriter(256);
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                string.getClass();
                sb.append(string);
                str = sb.toString();
            }
        } else {
            if (th == null) {
                return;
            }
            StringWriter stringWriter2 = new StringWriter(256);
            PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
            th.printStackTrace(printWriter2);
            printWriter2.flush();
            str = stringWriter2.toString();
            str.getClass();
        }
        g(i, str2, str, th);
    }

    public void i(String str, Object... objArr) {
        h(5, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    public void j(Throwable th, String str, Object... objArr) {
        h(5, th, str, Arrays.copyOf(objArr, objArr.length));
    }
}
