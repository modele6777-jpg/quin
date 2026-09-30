package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionSession;
import android.media.AudioDescriptor;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qc0 implements vc0, c98, vta, rl1 {
    public final /* synthetic */ int a;

    public /* synthetic */ qc0(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor c(Object obj) {
        return (AudioDescriptor) obj;
    }

    public static /* synthetic */ void e() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void f(int i, int i2) {
        throw new IllegalArgumentException("Callable expects " + i + ((Object) " arguments, but ") + i2 + ((Object) " were provided."));
    }

    public static /* synthetic */ void g(int i, Object obj, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void h(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void i(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return CameraExtensionSession.class;
    }

    public static /* synthetic */ void o(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void p(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.vta
    public void a(wae waeVar) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(waeVar.b.getWidth(), waeVar.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        waeVar.a(surface, g94.a(), new ek1(0, surface, surfaceTexture));
    }

    @Override // defpackage.vc0
    public int b(int i, cv7 cv7Var) {
        return Math.round((1.0f + (cv7Var == cv7.a ? -1.0f : 1.0f)) * (i / 2.0f));
    }

    @Override // defpackage.c98
    public void d(Object obj) {
        long jL;
        m6c m6cVar;
        b55 b55Var;
        au3 au3Var;
        switch (this.a) {
            case 3:
                ep3 ep3Var = (ep3) obj;
                jp3 jp3Var = ep3Var.a;
                if (ep3Var == jp3Var.j && jp3Var.n != null) {
                    gp3 gp3Var = jp3Var.p;
                    int i = gp3Var.b;
                    if (i != -1) {
                        long j = ((tj0) gp3Var.e).f / i;
                        al0 al0Var = jp3Var.t;
                        al0Var.getClass();
                        jL = pqf.L(al0Var.a.getSampleRate(), j);
                    } else {
                        jL = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - jp3Var.X;
                    m6c m6cVar2 = jp3Var.n;
                    int i2 = ((tj0) jp3Var.p.e).f;
                    long jR = pqf.R(jL);
                    k47 k47Var = ((qo8) m6cVar2.b).V1;
                    Handler handler = (Handler) k47Var.b;
                    if (handler != null) {
                        handler.post(new hk0(k47Var, i2, jR, jElapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ep3 ep3Var2 = (ep3) obj;
                ep3Var2.getClass();
                jp3.d0.getAndDecrement();
                m6c m6cVar3 = ep3Var2.a.n;
                if (m6cVar3 != null) {
                    qfc qfcVar = new qfc();
                    k47 k47Var2 = ((qo8) m6cVar3.b).V1;
                    Handler handler2 = (Handler) k47Var2.b;
                    if (handler2 != null) {
                        handler2.post(new hk0(k47Var2, qfcVar, 3));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ep3 ep3Var3 = (ep3) obj;
                jp3 jp3Var2 = ep3Var3.a;
                if (ep3Var3 == jp3Var2.j && (m6cVar = jp3Var2.n) != null && jp3Var2.P && (b55Var = ((qo8) m6cVar.b).W0) != null) {
                    b55Var.a();
                    return;
                }
                return;
            case 6:
                ep3 ep3Var4 = (ep3) obj;
                jp3 jp3Var3 = ep3Var4.a;
                if (ep3Var4 == jp3Var3.j && jp3Var3.N) {
                    jp3Var3.O = true;
                    return;
                }
                return;
            default:
                m6c m6cVar4 = ((cp3) obj).a.n;
                if (m6cVar4 != null) {
                    qo8 qo8Var = (qo8) m6cVar4.b;
                    synchronized (qo8Var.a) {
                        au3Var = qo8Var.H0;
                        break;
                    }
                    if (au3Var != null) {
                        au3Var.f.getClass();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.rl1
    public void cancel() {
    }
}
