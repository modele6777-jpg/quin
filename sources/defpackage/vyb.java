package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vyb implements Closeable {
    public static final tyb b;
    public syb a;

    static {
        a71 a71Var = a71.c;
        a71Var.getClass();
        f41 f41Var = new f41();
        f41Var.f1(a71Var);
        b = new tyb(null, a71Var.e(), f41Var);
    }

    public abstract v41 P0();

    public final InputStream b() {
        return P0().Y0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ieg.b(P0());
    }

    public abstract long h();

    public abstract oq8 l();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final String u() {
        Charset charsetA;
        v41 v41VarP0 = P0();
        String th = null;
        try {
            oq8 oq8VarL = l();
            if (oq8VarL == null || (charsetA = oq8.a(oq8VarL)) == null) {
                charsetA = ox1.a;
            }
            String strN0 = v41VarP0.n0(keg.f(v41VarP0, charsetA));
            try {
                v41VarP0.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strN0;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (v41VarP0 != null) {
                try {
                    v41VarP0.close();
                } catch (Throwable th4) {
                    bzd.m(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
