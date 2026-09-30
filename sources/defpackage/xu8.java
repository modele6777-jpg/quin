package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.Surface;
import androidx.media3.ui.PlayerView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xu8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xu8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0436  */
    /* JADX WARN: Code duplicated, block: B:135:0x045a  */
    /* JADX WARN: Code duplicated, block: B:136:0x045c  */
    /* JADX WARN: Code duplicated, block: B:137:0x045f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0466  */
    /* JADX WARN: Code duplicated, block: B:140:0x0468  */
    /* JADX WARN: Code duplicated, block: B:143:0x046f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0471  */
    /* JADX WARN: Code duplicated, block: B:55:0x0242  */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        Bitmap bitmapU;
        Object value;
        Float[] fArr;
        int i = 5;
        int i2 = 9;
        int i3 = 8;
        int i4 = 0;
        switch (this.a) {
            case 0:
                ((kw6) this.c).l((yu8) this.b);
                return;
            case 1:
                Surface surface = (Surface) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                surface.release();
                surfaceTexture.release();
                return;
            case 2:
                te9 te9Var = (te9) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new n80(i, te9Var), intentFilter);
                return;
            case 3:
                n80 n80Var = (n80) this.b;
                Context context2 = (Context) this.c;
                te9 te9Var2 = (te9) n80Var.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i2 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i2 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i2 = 4;
                                        break;
                                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                        i2 = 5;
                                        break;
                                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                    case 19:
                                    default:
                                        i2 = 6;
                                        break;
                                    case 18:
                                        i2 = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT < 29) {
                                            i2 = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i2 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i2 = 4;
                                        break;
                                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                        i2 = 5;
                                        break;
                                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                    case 19:
                                    default:
                                        i2 = 6;
                                        break;
                                    case 18:
                                        i2 = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT < 29) {
                                            i2 = 0;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i2 = type != 9 ? 8 : 7;
                            } else {
                                i2 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i2 != 5) {
                    te9Var2.c(i2);
                    return;
                } else {
                    xq.d(context2, te9Var2);
                    return;
                }
            case 4:
                ((ytc) this.b).i((mn9) this.c, wef.a);
                return;
            case 5:
                PlayerView playerView = (PlayerView) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                int i5 = PlayerView.Y0;
                playerView.d(bitmap);
                return;
            case 6:
                ((vta) this.b).a((wae) this.c);
                return;
            case 7:
                uva uvaVar = (uva) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                b21.C("ProcessingRequest", "onPostviewBitmapAvailable: request ID = " + uvaVar.a);
                utb utbVar = uvaVar.g;
                p8c.m();
                if (utbVar.g) {
                    return;
                }
                oq0 oq0Var = utbVar.a;
                oq0Var.c.execute(new ni(i2, oq0Var, bitmap2));
                return;
            case 8:
                uva uvaVar2 = (uva) this.b;
                iw6 iw6Var = (iw6) this.c;
                b21.C("ProcessingRequest", "onFinalResult(ImageProxy): request ID = " + uvaVar2.a);
                utb utbVar2 = uvaVar2.g;
                p8c.m();
                if (utbVar2.g) {
                    iw6Var.close();
                    return;
                }
                ok8.o("onImageCaptured() must be called before onFinalResult()", utbVar2.c.b.isDone());
                utbVar2.a();
                oq0 oq0Var2 = utbVar2.a;
                oq0Var2.c.execute(new xu8(18, oq0Var2, iw6Var));
                return;
            case 9:
                uva uvaVar3 = (uva) this.b;
                jv6 jv6Var = (jv6) this.c;
                b21.X("ProcessingRequest", "onProcessFailure: request ID = " + uvaVar3.a, jv6Var);
                utb utbVar3 = uvaVar3.g;
                p8c.m();
                if (utbVar3.g) {
                    return;
                }
                ok8.o("onImageCaptured() must be called before onFinalResult()", utbVar3.c.b.isDone());
                utbVar3.a();
                p8c.m();
                oq0 oq0Var3 = utbVar3.a;
                oq0Var3.c.execute(new ni(i3, oq0Var3, jv6Var));
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                vva vvaVar = (vva) this.b;
                tag tagVar = (tag) this.c;
                synchronized (vvaVar.k) {
                    try {
                        Iterator it = vvaVar.j.iterator();
                        while (it.hasNext()) {
                            ((a35) it.next()).b(tagVar, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((lxa) this.b).B((xsc) this.c);
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((p90) this.b).U((Typeface) this.c);
                return;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((hy2) ((iy2) this.b)).b((f76) this.c);
                return;
            case 14:
                ((l26) this.b).z(((n73) this.c).a(), null);
                return;
            case 15:
                uud uudVar = (uud) this.b;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.c;
                int i6 = uud.z;
                SurfaceTexture surfaceTexture3 = uudVar.g;
                Surface surface2 = uudVar.v;
                Surface surface3 = new Surface(surfaceTexture2);
                uudVar.g = surfaceTexture2;
                uudVar.v = surface3;
                Iterator it2 = uudVar.a.iterator();
                while (it2.hasNext()) {
                    ((t45) it2.next()).a.S(surface3);
                }
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                }
                if (surface2 != null) {
                    surface2.release();
                    return;
                }
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((yl2) ((AtomicReference) this.c).get()).accept(new jq0((oae) this.b));
                return;
            case 17:
                ((cee) this.b).e.remove((utb) this.c);
                return;
            case 18:
                oq0 oq0Var4 = (oq0) this.b;
                iw6 iw6Var2 = (iw6) this.c;
                bu0 bu0Var = oq0Var4.d;
                Objects.requireNonNull(iw6Var2);
                pi1 pi1Var = (pi1) bu0Var.c;
                Bitmap bitmapJ = xo1.J(i7h.p(iw6Var2), iw6Var2.u0().a());
                hkb hkbVar = (hkb) bu0Var.b;
                float f = hkbVar.c;
                float f2 = hkbVar.b;
                float f3 = hkbVar.d;
                float f4 = hkbVar.a;
                if (f - f4 > 0.0f) {
                    float f5 = f3 - f2;
                    if (f5 > 0.0f) {
                        hkb hkbVar2 = (hkb) bu0Var.d;
                        float f6 = hkbVar2.a;
                        float f7 = f - f4;
                        Float fValueOf = Float.valueOf(0.0f);
                        Float fValueOf2 = Float.valueOf(1.0f);
                        float fN = mh3.n((f6 - f4) / f7, 0.0f, 1.0f);
                        float f8 = hkbVar2.b;
                        float fN2 = mh3.n((f8 - f2) / f5, 0.0f, 1.0f);
                        float fN3 = mh3.n((hkbVar2.c - f6) / f7, 0.0f, 1.0f - fN);
                        float fN4 = mh3.n((hkbVar2.d - f8) / f5, 0.0f, 1.0f - fN2);
                        float width = bitmapJ.getWidth() / bitmapJ.getHeight();
                        float f9 = f7 / f5;
                        if (width > f9) {
                            float f10 = f9 / width;
                            fArr = new Float[]{Float.valueOf(f10), fValueOf2, Float.valueOf((1.0f - f10) / 2.0f), fValueOf};
                        } else {
                            float f11 = width / f9;
                            fArr = new Float[]{fValueOf2, Float.valueOf(f11), fValueOf, Float.valueOf((1.0f - f11) / 2.0f)};
                        }
                        float fFloatValue = fArr[0].floatValue();
                        float fFloatValue2 = fArr[1].floatValue();
                        float fFloatValue3 = fArr[2].floatValue();
                        float fFloatValue4 = fArr[3].floatValue();
                        int iO = mh3.o(ym8.L(((fN * fFloatValue) + fFloatValue3) * bitmapJ.getWidth()), 0, bitmapJ.getWidth() - 1);
                        int iO2 = mh3.o(ym8.L(((fN2 * fFloatValue2) + fFloatValue4) * bitmapJ.getHeight()), 0, bitmapJ.getHeight() - 1);
                        bitmapU = Bitmap.createBitmap(bitmapJ, iO, iO2, mh3.o(ym8.L(fN3 * fFloatValue * bitmapJ.getWidth()), 1, bitmapJ.getWidth() - iO), mh3.o(ym8.L(fN4 * fFloatValue2 * bitmapJ.getHeight()), 1, bitmapJ.getHeight() - iO2));
                        bitmapU.getClass();
                    } else {
                        bitmapU = xo1.u(bitmapJ, 0.66071427f);
                    }
                } else {
                    bitmapU = xo1.u(bitmapJ, 0.66071427f);
                }
                float f12 = bu0Var.a;
                if (f12 != 0.0f) {
                    bitmapU = xo1.J(bitmapU, -f12);
                }
                iw6Var2.close();
                Bitmap bitmapG = ndb.g(bitmapU);
                s0e s0eVar = pi1Var.f;
                do {
                    value = s0eVar.getValue();
                    ((aee) value).getClass();
                } while (!s0eVar.l(value, new aee(bitmapG)));
                return;
            case 19:
                mmb mmbVar = (mmb) this.b;
                mmb mmbVar2 = (mmb) this.c;
                jgb.I((aw2) mmbVar.element, null);
                jgb.I((aw2) mmbVar2.element, null);
                return;
            case 20:
                m45 m45Var = (m45) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    m45Var.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 21:
                ((lqb) ((kxa) this.b).b).x((nzd) this.c, 3);
                return;
            case 22:
                Runnable runnable = (Runnable) this.b;
                h80 h80Var = (h80) this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                    h80Var.a();
                }
            case 23:
                e4f e4fVar = (e4f) this.b;
                s6a s6aVar = (s6a) this.c;
                e4fVar.d(s6aVar.a, s6aVar.b);
                return;
            case 24:
                lkf lkfVar = (lkf) this.b;
                Runnable runnable2 = (Runnable) this.c;
                ThreadLocal threadLocal = lkfVar.d;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable2.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 25:
                ((UserMetadata) this.b).lambda$updateRolloutsState$1((List) this.c);
                return;
            case 26:
                lqb lqbVar = (lqb) this.b;
                uuf uufVar = (uuf) this.c;
                t45 t45Var = (t45) lqbVar.c;
                String str = pqf.a;
                y45 y45Var = t45Var.a;
                y45Var.i0 = uufVar;
                y45Var.m.e(25, new qo3(uufVar));
                return;
            case 27:
                lqb lqbVar2 = (lqb) this.b;
                qm3 qm3Var = (qm3) this.c;
                synchronized (qm3Var) {
                }
                t45 t45Var2 = (t45) lqbVar2.c;
                String str2 = pqf.a;
                ro3 ro3Var = t45Var2.a.s;
                pl plVarI = ro3Var.I((zp8) ro3Var.d.e);
                ro3Var.M(plVarI, 1020, new jv2(plVarI, qm3Var, 23));
                return;
            case 28:
                lqb lqbVar3 = (lqb) this.b;
                b72 b72Var = (b72) this.c;
                t45 t45Var3 = (t45) lqbVar3.c;
                String str3 = pqf.a;
                t45Var3.a.G.w(b72Var);
                return;
            default:
                xs6 xs6Var = (xs6) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                vea veaVar = (vea) xs6Var.c;
                if (atomicBoolean.get()) {
                    new Thread(new nzf(i4, veaVar, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
        }
    }
}
