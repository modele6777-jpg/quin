package defpackage;

import android.media.MediaCodecInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ho7 implements cfd, xl2, zo8, a3f, pu6, o95, mu3, u37 {
    public final /* synthetic */ int a;

    public /* synthetic */ ho7(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void j(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void k(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void l(Object obj, Object obj2, String str) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new pt7(str + obj);
    }

    public static /* synthetic */ void n(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void r(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void s(StringBuilder sb, Object obj, Object obj2) {
        sb.append('/');
        sb.append(obj);
        sb.append(' ');
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void v(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void x(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    @Override // defpackage.u37
    public t37 a(a80 a80Var) {
        return new x37(a80Var);
    }

    @Override // defpackage.xl2
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // defpackage.a3f
    public Object apply(Object obj) {
        pu8 pu8Var = (pu8) obj;
        pu8Var.getClass();
        w84 w84Var = n0b.a;
        w84Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            w84Var.V0(pu8Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.cfd
    public boolean b() {
        return false;
    }

    @Override // defpackage.o95
    public l95[] d() {
        switch (this.a) {
            case 15:
                return new l95[]{new q49(d8e.V, 16)};
            default:
                return new l95[]{new xl9()};
        }
    }

    @Override // defpackage.zo8
    public int f(Object obj) {
        String str = ((to8) obj).a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    @Override // defpackage.pu6
    public boolean g(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // defpackage.mu3
    public void i(i1b i1bVar) {
    }
}
