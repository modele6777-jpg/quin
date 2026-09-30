package defpackage;

import com.google.firebase.datatransport.TransportRegistrar;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cva implements u26, o95, si4, xl2, g4f, bc2 {
    public final /* synthetic */ int a;

    public /* synthetic */ cva(zea zeaVar) {
        this.a = 0;
    }

    public static /* synthetic */ void f() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void h(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void i(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) {
        throw new cx3(str + obj + obj2);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void l(String str) throws ibc {
        throw new ibc(str);
    }

    public static /* synthetic */ void m(String str, int i, Object obj, Object obj2) {
        throw new IllegalStateException(str + i + obj + obj2);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void q(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void r(StringBuilder sb, Object obj) {
        sb.append(", ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void s() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void t(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void u(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void w(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    @Override // defpackage.xl2
    public void accept(Object obj) {
        ((mcc) obj).b.getClass();
    }

    @Override // defpackage.u26
    public Object apply(Object obj) {
        return dva.b;
    }

    @Override // defpackage.bc2
    public Object c(hbc hbcVar) {
        switch (this.a) {
            case 26:
                return TransportRegistrar.lambda$getComponents$0(hbcVar);
            case 27:
                return TransportRegistrar.lambda$getComponents$1(hbcVar);
            default:
                return TransportRegistrar.lambda$getComponents$2(hbcVar);
        }
    }

    @Override // defpackage.o95
    public l95[] d() {
        switch (this.a) {
            case 1:
                return new l95[]{new i2b()};
            default:
                rye ryeVar = new rye(0L);
                ey6 ey6Var = jy6.b;
                return new l95[]{new v5f(1, d8e.V, ryeVar, new bu3(yob.e))};
        }
    }

    public /* synthetic */ cva(int i) {
        this.a = i;
    }

    @Override // defpackage.g4f
    public void a(Exception exc) {
    }

    @Override // defpackage.si4
    public double b(double d) {
        return d;
    }
}
