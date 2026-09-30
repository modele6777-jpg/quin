package defpackage;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.share.ShareActivity;
import ai.askquin.ui.share.SharePayload$DrawnCards;
import ai.askquin.ui.share.SharedDivination;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.perf.config.RemoteConfigManager;
import io.sentry.android.core.b1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class jy4 implements ky4, g1b, u26, k52, m23, jh6, xf9, ov2, m87, qfa, fy2, fx9 {
    public final /* synthetic */ int a;

    public jy4(szc szcVar) {
        this.a = 2;
    }

    public static i8f m(c8f c8fVar, tf7 tf7Var, vea veaVar, tt7 tt7Var) {
        tf7Var.getClass();
        if (!tf7Var.c) {
            tf7Var = tf7.a(tf7Var, uf7.a, false, null, null, 61);
        }
        int iOrdinal = tf7Var.b.ordinal();
        dsf dsfVar = dsf.INVARIANT;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new dzd(tt7Var, dsfVar);
            }
            ap.c();
            return null;
        }
        if (!c8fVar.x().a()) {
            return new dzd(qz3.e(c8fVar).o(), dsfVar);
        }
        List parameters = tt7Var.c0().getParameters();
        parameters.getClass();
        return !parameters.isEmpty() ? new dzd(tt7Var, dsf.OUT_VARIANCE) : w8f.l(c8fVar, tf7Var);
    }

    public static mic o(int i, SolarTerm solarTerm) {
        Object next;
        solarTerm.getClass();
        mx4 mx4Var = mic.f;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            next = l2Var.next();
            mic micVar = (mic) next;
            if (micVar.b() == i && micVar.c() == solarTerm) {
                return (mic) next;
            }
        }
        next = null;
        return (mic) next;
    }

    public static void s(Activity activity, iad iadVar, oed oedVar, xad xadVar, String str, String str2) {
        Intent intent = new Intent(activity, (Class<?>) ShareActivity.class);
        intent.putExtra("default_share_type", oedVar);
        if (iadVar instanceof had) {
            intent.putExtra("divination", fzc.a.d(SharedDivination.Companion.serializer(), ((had) iadVar).a));
        } else {
            if (!(iadVar instanceof SharePayload$DrawnCards)) {
                ap.c();
                return;
            }
            intent.putExtra("drawn_cards", fzc.a.d(SharePayload$DrawnCards.Companion.serializer(), iadVar));
        }
        intent.putExtra("share_source", xadVar.name());
        intent.putExtra("share_scene", str);
        if (str2 != null) {
            intent.putExtra("screenshot_path", str2);
        }
        activity.startActivity(intent);
    }

    public static mud t(String str, String str2, String str3, String str4) {
        return new mud(str, t99.e(str2), str3, str4);
    }

    public static qs5 u(btd btdVar, ax5 ax5Var) {
        ax5Var.getClass();
        int iOrdinal = btdVar.ordinal();
        if (iOrdinal == 0) {
            return ax5Var == ax5.a ? qs5.c : qs5.d;
        }
        qs5 qs5Var = qs5.f;
        if (iOrdinal == 1) {
            int iOrdinal2 = ax5Var.ordinal();
            if (iOrdinal2 == 0) {
                return qs5.e;
            }
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    return qs5.g;
                }
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 4) {
                        return qs5.v;
                    }
                    ap.c();
                    return null;
                }
            }
            return qs5Var;
        }
        if (iOrdinal != 2) {
            ap.c();
            return null;
        }
        int iOrdinal3 = ax5Var.ordinal();
        if (iOrdinal3 == 0) {
            return qs5.y;
        }
        if (iOrdinal3 == 1 || iOrdinal3 == 2) {
            return qs5.x;
        }
        if (iOrdinal3 == 3) {
            return qs5Var;
        }
        if (iOrdinal3 == 4) {
            return qs5.w;
        }
        ap.c();
        return null;
    }

    public static boolean v(int i, boolean z) {
        int i2;
        if (!z || 29 > (i2 = Build.VERSION.SDK_INT) || i2 >= 33) {
            return false;
        }
        return i == 1 || i == 2 || i == 6;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[PHI: r10
  0x0021: PHI (r10v5 long) = (r10v2 long), (r10v6 long) binds: [B:18:0x0031, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x007a A[RETURN] */
    public static boolean w(int i, int i2, long j, boolean z, boolean z2, er4 er4Var) {
        long j2;
        long j3;
        boolean zV = v(i, z2);
        if (zV) {
            Log.d("CXCP", "shouldRetry: Active resume mode is activated");
        }
        if (zV) {
            j2 = 1800000000000L;
            if (er4Var != null) {
                j3 = er4Var.a;
                if (er4.a(1800000000000L, j3) != -1) {
                    j2 = j3;
                }
            }
        } else {
            j2 = 10000000000L;
            if (er4Var != null) {
                j3 = er4Var.a;
                if (er4.a(10000000000L, j3) != -1) {
                    j2 = j3;
                }
            }
        }
        if (er4.a(j, j2) <= 0) {
            if (i == 0) {
                if (i2 <= 1) {
                    return true;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (!z || i2 <= 1) {
                            }
                        } else if (i != 4 && i != 5 && i != 6 && i != 7) {
                            if (i == 8) {
                                if (i2 <= 1) {
                                }
                            } else if (i != 10) {
                                if (i != 11) {
                                    b1.d("CXCP", "Unexpected CameraError: " + xzb.i);
                                    return false;
                                }
                                if (i2 <= 1) {
                                }
                            }
                        }
                    }
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 || i2 <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void x(Context context, iad iadVar, oed oedVar, xad xadVar, String str, Bitmap bitmap) {
        vb2 vb2VarH = kn2.H(context);
        if (vb2VarH == null) {
            if (bitmap != null) {
                jzb.m(bitmap);
                return;
            }
            return;
        }
        a58 a58Var = vb2VarH.a;
        if (iadVar instanceof SharePayload$DrawnCards) {
            SharePayload$DrawnCards sharePayload$DrawnCards = (SharePayload$DrawnCards) iadVar;
            if (v4e.Q(sharePayload$DrawnCards.getDivinationId()) || sharePayload$DrawnCards.getCards().isEmpty() || vb2VarH.isFinishing() || a58Var.i.compareTo(g48.e) < 0) {
                return;
            }
        }
        if (bitmap == null) {
            s(vb2VarH, iadVar, oedVar, xadVar, str, null);
        } else if (vb2VarH.isFinishing() || a58Var.i == g48.a) {
            jzb.m(bitmap);
        } else {
            ynb.V(vpf.H(vb2VarH), null, null, new y5d(vb2VarH, bitmap, iadVar, oedVar, xadVar, str, null), 3);
        }
    }

    public static void y(Context context, SharedDivination sharedDivination, xad xadVar, String str, Bitmap bitmap, int i) {
        int i2 = ShareActivity.T0;
        if ((i & 32) != 0) {
            bitmap = null;
        }
        context.getClass();
        sharedDivination.getClass();
        str.getClass();
        x(context, new had(sharedDivination), oed.Long, xadVar, str, bitmap);
    }

    public static void z(Context context, String str, List list, List list2, String str2, String str3, MixedDeckSnapshot mixedDeckSnapshot) {
        context.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        x(context, new SharePayload$DrawnCards(str, list, list2, str2, mixedDeckSnapshot), oed.Short, xad.Screenshot, str3, null);
    }

    @Override // defpackage.k52
    public w57 a() {
        Instant instantNow = Instant.now();
        instantNow.getClass();
        w57 w57Var = w57.a;
        return mh3.y(instantNow.getNano(), instantNow.getEpochSecond());
    }

    @Override // defpackage.u26
    public Object apply(Object obj) throws jv6 {
        e35 e35Var;
        switch (this.a) {
            case 5:
                return obj;
            default:
                xp0 xp0Var = (xp0) obj;
                iw6 iw6Var = xp0Var.b;
                uva uvaVar = xp0Var.a;
                if (i7h.z(iw6Var.getFormat())) {
                    try {
                        kw kwVar = e35.b;
                        ByteBuffer byteBufferV = iw6Var.v()[0].v();
                        byteBufferV.rewind();
                        byte[] bArr = new byte[byteBufferV.capacity()];
                        byteBufferV.get(bArr);
                        e35Var = new e35(new r35(new ByteArrayInputStream(bArr)));
                        iw6Var.v()[0].v().rewind();
                    } catch (IOException e) {
                        throw new jv6(1, "Failed to extract EXIF data.", e);
                    }
                    break;
                } else {
                    e35Var = null;
                }
                int i = 16;
                if (((ImageCaptureRotationOptionQuirk) q74.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                    no0 no0Var = im1.f;
                } else if (i7h.z(iw6Var.getFormat())) {
                    ok8.n(e35Var, "JPEG image must have exif.");
                    Size size = new Size(iw6Var.d(), iw6Var.c());
                    int iA = uvaVar.d - e35Var.a();
                    Size size2 = s2f.c(s2f.i(iA)) ? new Size(size.getHeight(), size.getWidth()) : size;
                    Matrix matrixA = s2f.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iA, false);
                    RectF rectF = new RectF(uvaVar.c);
                    matrixA.mapRect(rectF);
                    rectF.sort();
                    Size size3 = size2;
                    Rect rect = new Rect();
                    rectF.round(rect);
                    int iA2 = e35Var.a();
                    Matrix matrix = new Matrix(uvaVar.f);
                    matrix.postConcat(matrixA);
                    oe1 gecVar = iw6Var.u0() instanceof pe1 ? ((pe1) iw6Var.u0()).a : new gec(i);
                    iw6Var.getFormat();
                    return new sp0(iw6Var, e35Var, iw6Var.getFormat(), size3, rect, iA2, matrix, gecVar);
                }
                Rect rect2 = uvaVar.c;
                int i2 = uvaVar.d;
                Matrix matrix2 = uvaVar.f;
                oe1 gecVar2 = iw6Var.u0() instanceof pe1 ? ((pe1) iw6Var.u0()).a : new gec(i);
                Size size4 = new Size(iw6Var.d(), iw6Var.c());
                if (i7h.z(iw6Var.getFormat())) {
                    ok8.n(e35Var, "JPEG image must have Exif.");
                }
                return new sp0(iw6Var, e35Var, iw6Var.getFormat(), size4, rect2, i2, matrix2, gecVar2);
        }
    }

    @Override // defpackage.jh6
    public boolean b(ykd ykdVar) {
        b94 b94Var = ykdVar.a;
        if ((b94Var instanceof z84 ? ((z84) b94Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        b94 b94Var2 = ykdVar.b;
        return (b94Var2 instanceof z84 ? ((z84) b94Var2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.xf9
    public boolean c(i09 i09Var) {
        return false;
    }

    @Override // defpackage.xf9
    public int d() {
        return 8;
    }

    @Override // defpackage.xf9
    public boolean e(i09 i09Var) {
        return x57.Y(fdc.a(vd0.s0(i09Var), false));
    }

    @Override // defpackage.xf9
    public void f(LayoutNode layoutNode, long j, sl6 sl6Var, int i, boolean z) {
        yf9 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        d59 d59Var = yf9.m1;
        layoutNode.getOuterCoordinator$ui().n1(yf9.s1, outerCoordinator$ui.e1(j, true), sl6Var, 1, z);
    }

    @Override // defpackage.h1b
    public Object get() {
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        nk8.o(remoteConfigManager);
        return remoteConfigManager;
    }

    @Override // defpackage.jh6
    public boolean h() {
        boolean z;
        synchronized (hd5.a) {
            try {
                int i = hd5.c;
                hd5.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > hd5.d + 30000) {
                    hd5.c = 0;
                    hd5.d = SystemClock.uptimeMillis();
                    String[] list = hd5.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    hd5.e = list.length < 800;
                }
                z = hd5.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.xf9
    public boolean j(sl6 sl6Var, LayoutNode layoutNode) {
        return false;
    }

    @Override // defpackage.xf9
    public boolean k(LayoutNode layoutNode) {
        twc twcVarH = layoutNode.H();
        boolean z = false;
        if (twcVarH != null && twcVarH.d) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.fx9
    public int l(sw3 sw3Var, int i) {
        return i - sw3Var.D0(32.0f);
    }

    public String n(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public Object p(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    @Override // defpackage.m23
    public Iterable q(Object obj) {
        return (Iterable) sm7.a.get((em7) obj);
    }

    public boolean r(Method method) {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 25:
                int iHashCode = hashCode();
                tq.o(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return tec.m("CreationExtras.Key@", string, "<", job.a.b(Bundle.class).r(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jy4(int i) {
        this.a = i;
    }

    @Override // defpackage.ky4
    public void g(u09 u09Var, ArrayList arrayList) {
    }

    @Override // defpackage.ky4
    public void i(ea1 ea1Var) {
    }
}
