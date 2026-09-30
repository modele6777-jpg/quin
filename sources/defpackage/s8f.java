package defpackage;

import java.io.IOException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s8f implements syf, o95 {
    public final /* synthetic */ int a;

    public static /* synthetic */ void c() {
        throw new NoSuchElementException();
    }

    public static void f(int i) {
        throw new yef(tec.e(i, "An unknown field for index "));
    }

    public static /* synthetic */ void g(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, int i, Object obj2, int i2) {
        throw new IllegalArgumentException(str + obj + i + obj2 + i2);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m() throws ang {
        throw new ang();
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void o(String str) throws p1h {
        throw new p1h(str);
    }

    public static /* synthetic */ void p(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void q(String str) throws bng {
        throw new bng(str);
    }

    @Override // defpackage.syf
    public w2f a(k00 k00Var) {
        return new w2f(k00Var, rl9.a);
    }

    @Override // defpackage.o95
    public l95[] d() {
        return new l95[]{new b0g()};
    }

    public /* synthetic */ s8f(int i) {
        this.a = i;
    }
}
